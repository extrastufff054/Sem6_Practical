%{
#include <stdio.h>
int identifier_count = 0;
int keyword_count = 0;
int digit_count = 0;
%}

%%
[a-zA-Z][a-zA-Z0-9]*   { identifier_count++; }
int|float|char|double|void   { keyword_count++; }
[0-9]+    { digit_count++; }
.         { }

%%

int main(int argc, char *argv[]) {
    yyin = fopen(argv[1], "r");
    yylex();
    printf("Identifier count: %d\n", identifier_count);
    printf("Keyword count: %d\n", keyword_count);
    printf("Digit count: %d\n", digit_count);
    fclose(yyin);
    return 0;
}
