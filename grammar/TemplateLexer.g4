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

// تحسين: فصل وسم الإغلاق عن الفتح لتسهيل عمل البارسر
HTML_TAG_CLOSE_START: '</';
HTML_TAG_OPEN: '<';
HTML_SELF_CLOSE: '/>';
HTML_TAG_END: '>';

// تعريف الأسماء والقيم داخل الـ HTML
HTML_TAG_NAME: [a-zA-Z][a-zA-Z0-9-]*;
HTML_ATTR_NAME: [a-zA-Z_:][a-zA-Z0-9_:\-]*;
HTML_ATTR_EQUALS: '=';
HTML_ATTR_VALUE: STRING;

// تحسين: النص العادي يتوقف عند بداية أي وسم أو كود جينجا
HTML_TEXT: ~[<{]+;

HTML_WS: [ \t\r\n]+ -> skip;

/* =====================================================
 MODE: CSS
 =====================================================
 */
mode CSS;

CSS_STYLE_CLOSE: '</style>' -> popMode;
CSS_COMMENT: '/*' .*? '*/' -> skip;

CSS_ID_SELECTOR: '#' [a-zA-Z_][a-zA-Z0-9_-]*;
CSS_CLASS_SELECTOR: '.' [a-zA-Z_][a-zA-Z0-9_-]*;
CSS_ELEMENT_SELECTOR: [a-zA-Z][a-zA-Z0-9_-]*;

CSS_LBRACE: '{';
CSS_RBRACE: '}';
CSS_COLON: ':';
CSS_SEMI: ';';
CSS_COMMA: ',';

CSS_NUMBER: [0-9]+ ('.' [0-9]+)?;
CSS_UNIT: 'px' | 'em' | 'rem' | '%' | 'vh' | 'vw';
CSS_COLOR: '#' [0-9a-fA-F]{3,6};
CSS_URL: 'url(' .*? ')';
CSS_STRING: STRING;
CSS_IDENTIFIER: [a-zA-Z_-][a-zA-Z0-9_-]*;
CSS_WS: [ \t\r\n]+ -> skip;

/* =====================================================
 MODE: HTML_SCRIPT
 =====================================================
 */
mode HTML_SCRIPT;
SCRIPT_CLOSE: '</script>' -> popMode;
SCRIPT_TEXT: . -> channel(HIDDEN);

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

JINJA_DOT: '.'; // مهم جداً للوصول لـ product.price
JINJA_ARITH_OP: PY_ARITH_OP;
JINJA_COMP_OP: PY_COMPARE_OP;
JINJA_BOOL_OP: PY_BOOL_OP;
JINJA_LPAREN: PY_LPAREN;
JINJA_RPAREN: PY_RPAREN;
JINJA_COMMA: PY_COMMA;

JINJA_WS: PY_WS -> skip;

/* =====================================================
 MODE: JINJA2 STATEMENT {% ... %}
 =====================================================
 */
mode JINJA_STMT;

JINJA_STMT_END: '%}' -> popMode;

// إضافة الكلمات المفتاحية الناقصة لإغلاق الكتل
JINJA_IF: 'if';
JINJA_ELSE: 'else';
JINJA_ELIF: 'elif';
JINJA_ENDIF: 'endif';
JINJA_FOR: 'for';
JINJA_IN: 'in';
JINJA_ENDFOR: 'endfor';
JINJA_BLOCK: 'block';
JINJA_ENDBLOCK: 'endblock';

JINJA_STMT_ID: PY_IDENTIFIER;
JINJA_STMT_INT: PY_INT;
JINJA_STMT_STRING: PY_STRING;
JINJA_STMT_DOT: '.'; // للوصول للخصائص داخل الحلقات

JINJA_OP: PY_ARITH_OP | PY_COMPARE_OP;
JINJA_STMT_WS: PY_WS -> skip;

/* =====================================================
 FRAGMENTS (Common logic)
 =====================================================
 */
fragment PY_IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;
fragment PY_INT: [0-9]+;
fragment PY_FLOAT: [0-9]+ '.' [0-9]+;
fragment STRING: '"' (~["\r\n])* '"' | '\'' (~['\r\n])* '\'';
fragment PY_STRING: STRING;
fragment PY_ARITH_OP: '+' | '-' | '*' | '/' | '%';
fragment PY_COMPARE_OP: '==' | '!=' | '<' | '>' | '<=' | '>=';
fragment PY_BOOL_OP: 'and' | 'or' | 'not';
fragment PY_LPAREN: '(';
fragment PY_RPAREN: ')';
fragment PY_COMMA: ',';
fragment PY_WS: [ \t\r\n]+;