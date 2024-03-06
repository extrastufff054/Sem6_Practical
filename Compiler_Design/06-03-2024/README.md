# Practicals of compiler design

1. Write a lex program to recognize the following tokens over alphabet 0-9

```c
    %{
    %}

    %%

    [0-9]   {
        printf("Token recognized: %s\n", yytext);
    }

    .|\n    {
        // Ignore all other characters
    }

    %%

    int main(void) {
        yylex();
        return 0;
    }

    int yywrap() {
        return 1;
    }
```

2. The set of all strings ending with 11.
3. The set of all string with 3 consecutive 222's.
4. Set of all strings such that 10th symbol from right end is 1.
5. The set of all 4 digit nos. whose individual digits are in ascending order from left to right.
6. Write a lex program to recognize floating point numbers.
7. Write a C++ program to recognize any 5 keyword identifiers, numbers, punctuations.
