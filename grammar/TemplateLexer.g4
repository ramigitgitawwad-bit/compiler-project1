lexer grammar TemplateLexer;

channels {
	ERROR
}

/* =====================================================
 DEFAULT MODE → HTML
 =====================================================
 */

HTML_DOCTYPE: '<!DOCTYPE' .*? '>';

HTML_COMMENT: '<!--' .*? '-->' -> skip;

STYLE_OPEN: '<style>' -> pushMode(CSS);

SCRIPT_OPEN: '<script>' -> pushMode(HTML_SCRIPT);

JINJA_EXPR_START: '{{' -> pushMode(JINJA_EXPR);

JINJA_STMT_START: '{%' -> pushMode(JINJA_STMT);

JINJA_COMMENT: '{#' .*? '#}' -> skip;

HTML_TAG_OPEN: '<' '/'? TAG_NAME;

HTML_SELF_CLOSE: '/>';

HTML_TAG_CLOSE: '>';

HTML_ATTR_NAME: ATTR_NAME;

HTML_ATTR_EQUALS: '=';

HTML_ATTR_VALUE: STRING;

HTML_TEXT: ~[<{]+;

HTML_WS: [ \t\r\n]+ -> skip;

/* =====================================================
 HTML FRAGMENTS
 =====================================================
 */

fragment TAG_NAME: [a-zA-Z][a-zA-Z0-9-]*;

fragment ATTR_NAME: [a-zA-Z_:][a-zA-Z0-9_:\-]*;

fragment STRING: '"' (~["\r\n])* '"' | '\'' (~['\r\n])* '\'';

/* =====================================================
 MODE: CSS
 =====================================================
 */

mode CSS;

CSS_STYLE_CLOSE: '</style>' -> popMode;

CSS_COMMENT: '/*' .*? '*/' -> skip;

/* Selectors */
CSS_ID_SELECTOR: '#' [a-zA-Z_][a-zA-Z0-9_-]*;

CSS_CLASS_SELECTOR: '.' [a-zA-Z_][a-zA-Z0-9_-]*;

CSS_ELEMENT_SELECTOR: [a-zA-Z][a-zA-Z0-9_-]*;

/* Structure */
CSS_LBRACE: '{';
CSS_RBRACE: '}';
CSS_COLON: ':';
CSS_SEMI: ';';
CSS_COMMA: ',';

/* Values */
CSS_NUMBER: [0-9]+ ('.' [0-9]+)?;

CSS_UNIT: 'px' | 'em' | 'rem' | '%' | 'vh' | 'vw';

CSS_COLOR: '#' [0-9a-fA-F]{3,6};

CSS_URL: 'url(' .*? ')';

CSS_STRING: STRING;

CSS_IDENTIFIER: [a-zA-Z_-][a-zA-Z0-9_-]*;

CSS_WS: [ \t\r\n]+ -> skip;

/* =====================================================
 MODE: HTML SCRIPT (optional, simple)
 =====================================================
 */

mode HTML_SCRIPT;

SCRIPT_CLOSE: '</script>' -> popMode;

SCRIPT_TEXT: .+?;

/* =====================================================
 PYTHON BASE (FRAGMENTS — REUSABLE)
 =====================================================
 */

fragment PY_IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;

fragment PY_INT: [0-9]+;

fragment PY_FLOAT: [0-9]+ '.' [0-9]+;

fragment PY_STRING: STRING;

/* Operators */
fragment PY_ARITH_OP: '+' | '-' | '*' | '/' | '%';

fragment PY_COMPARE_OP: '==' | '!=' | '<' | '>' | '<=' | '>=';

fragment PY_BOOL_OP: 'and' | 'or' | 'not';

/* Keywords */
fragment PY_IF: 'if';
fragment PY_ELSE: 'else';
fragment PY_FOR: 'for';
fragment PY_IN: 'in';
fragment PY_TRUE: 'True';
fragment PY_FALSE: 'False';
fragment PY_NONE: 'None';

/* Symbols */
fragment PY_LPAREN: '(';
fragment PY_RPAREN: ')';
fragment PY_COMMA: ',';
fragment PY_DOT: '.';

fragment PY_WS: [ \t\r\n]+;

/* =====================================================
 MODE: JINJA2 EXPRESSION {{ ... }}
 =====================================================
 */

mode JINJA_EXPR;

JINJA_EXPR_END: '}}' -> popMode;

JINJA_ID: PY_IDENTIFIER;
JINJA_INT: PY_INT;
JINJA_FLOAT: PY_FLOAT;
JINJA_STRING: PY_STRING;

JINJA_ARITH_OP: PY_ARITH_OP;
JINJA_COMP_OP: PY_COMPARE_OP;
JINJA_BOOL_OP: PY_BOOL_OP;

JINJA_LPAREN: PY_LPAREN;
JINJA_RPAREN: PY_RPAREN;
JINJA_COMMA: PY_COMMA;
JINJA_DOT: PY_DOT;

JINJA_WS: PY_WS -> skip;

/* =====================================================
 MODE: JINJA2 STATEMENT {% ... %}
 =====================================================
 */

mode JINJA_STMT;

JINJA_STMT_END: '%}' -> popMode;

JINJA_IF: PY_IF;
JINJA_ELSE: PY_ELSE;
JINJA_FOR: PY_FOR;
JINJA_IN: PY_IN;

JINJA_STMT_ID: PY_IDENTIFIER;
JINJA_STMT_INT: PY_INT;
JINJA_STMT_STRING: PY_STRING;

JINJA_OP: PY_ARITH_OP | PY_COMPARE_OP;

JINJA_STMT_WS: PY_WS -> skip;