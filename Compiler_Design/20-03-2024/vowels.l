%{
#include<stdio.h>
int vow_count = 0;
int const_count = 0;
%}

%%
[aeiouAEIOU] {vow_count++;}
[a-zA-Z] {const_count++;}
%%

int yywrap(){return 1;}

int main()
{
    extern FILE *yyin, *yyout;
    yyin = fopen("input.txt", "r");
    yyout = fopen("output.txt", "w");
    if (!yyin) {
        printf("Cannot open input file.\n");
        return 1;
    }
    if (!yyout) {
        printf("Cannot open output file.\n");
        return 1;
    }
    yylex();
    fprintf(yyout, "\n No. of vowels = %d", vow_count);
    fprintf(yyout, "\n No. of consonants = %d\n", const_count);
    fclose(yyin);
    fclose(yyout);
    return 0;
}

