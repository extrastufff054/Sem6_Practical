%{
#include <stdio.h>
#include <string.h>
%}

%%
"if" {printf("%s", "IF"); }
"else" {printf("%s", "ELSE"); }
"while" {printf("%s", "WHILE"); }
"for" {printf("%s", "FOR"); }
[ \t\n]+ {printf("%s", yytext); }
. {printf("%s", yytext);}

%%

int main(){
	yylex();
	return 0;
}
