%{
#include <stdio.h>
%}

%%

[0-9]{4} {
    int isAscending = 1; // Assume digits are in ascending order
    for (int i = 0; i < 3; i++) { // Check each digit against the next
        if (yytext[i] > yytext[i + 1]) {
            isAscending = 0; // If any digit is greater than the next, not ascending
            break;
        }
    }
    if (isAscending) {
        printf("Matched: %s\n", yytext);
    }
}

%%

int main() {
    yylex();
    return 0;
}

int yywrap() {
    return 1;
}

