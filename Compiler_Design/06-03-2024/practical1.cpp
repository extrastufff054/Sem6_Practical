/* lex program to count the number of words */
%{
#include <stdio.h>
#include <string.h>
int wordCount = 0;
%}

/* Rules Section */
%%
[a-zA-Z0-9]+ { wordCount++; } /* Rule for counting words */
"\n" { printf("%d\n", wordCount); wordCount = 0; } /* Detect end of line */

%% /* End of rules section */

int yywrap(void) {
    return 1; /* Signal end of input */
}

int main() {
    yylex(); /* Invoke the lexer */
    return 0;
}
