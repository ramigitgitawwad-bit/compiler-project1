parser grammar TemplateParser;

options {
	tokenVocab = TemplateLexer;
}

// القاعدة الأم: القالب يتكون من عدة عناصر
template: element* EOF;

// العناصر المكونة للقالب
element:
	htmlElement
	| jinjaStatement
	| jinjaExpression
	| htmlText
	| cssBlock;

// قواعد الـ HTML
htmlElement:
	HTML_TAG_OPEN HTML_TAG_NAME attribute* (
		HTML_TAG_END element* HTML_TAG_CLOSE_START HTML_TAG_NAME HTML_TAG_END
		| HTML_SELF_CLOSE
	);

attribute: HTML_ATTR_NAME HTML_ATTR_EQUALS HTML_ATTR_VALUE;

htmlText: HTML_TEXT;

// قواعد Jinja2 (المنطق البرمجي)
jinjaStatement: jinjaIf | jinjaFor;

jinjaIf:
	JINJA_STMT_START JINJA_IF condition JINJA_STMT_END element* (
		JINJA_STMT_START JINJA_ELSE JINJA_STMT_END element*
	)? JINJA_STMT_START JINJA_ENDIF JINJA_STMT_END;

jinjaFor:
	JINJA_STMT_START JINJA_FOR JINJA_STMT_ID JINJA_IN JINJA_STMT_ID JINJA_STMT_END element*
		JINJA_STMT_START JINJA_ENDFOR JINJA_STMT_END;

jinjaExpression: JINJA_EXPR_START expression JINJA_EXPR_END;

// تبسيط للعمليات البرمجية داخل الجينجا
condition:
	JINJA_STMT_ID (JINJA_OP (JINJA_STMT_ID | JINJA_STMT_INT))?;
expression: JINJA_ID (JINJA_DOT JINJA_ID)*;

// قواعد الـ CSS
cssBlock: STYLE_OPEN cssRule* CSS_STYLE_CLOSE;
cssRule: (
		CSS_ID_SELECTOR
		| CSS_CLASS_SELECTOR
		| CSS_ELEMENT_SELECTOR
	) CSS_LBRACE declaration* CSS_RBRACE;
declaration:
	CSS_IDENTIFIER CSS_COLON (
		CSS_NUMBER CSS_UNIT
		| CSS_COLOR
		| CSS_STRING
	) CSS_SEMI;