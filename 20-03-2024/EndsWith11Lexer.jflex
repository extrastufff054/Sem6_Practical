import java.io.*;

%%

%class EndsWith11Lexer
%public
%unicode
%type string

%eof{ return new Symbol(Symbol.EOF); %}

StringEndsWith11 = ".*11$"

%%

{StringEndsWith11} { return new Symbol(Symbol.STRING_ENDS_WITH_11, yytext()); }
[0-9]+             { /* Ignore other tokens */ }

.|\n               { /* Ignore unrecognized characters */ }

