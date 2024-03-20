%{
int wordCount = 0;
%}

%%
[a-zA-Z]+   { wordCount++; }
.           { /* ignore anything else */ }
%%

int main(int argc, char* argv[]) {
    if (argc != 2) {
        printf("Usage: %s <input_file>\n", argv[0]);
        return 1;
    }
    
    FILE* file = fopen(argv[1], "r");
    if (!file) {
        perror("Error opening file");
        return 1;
    }
    
    yyin = file;
    yylex();
    
    fclose(file);
    
    printf("Word count: %d\n", wordCount);
    
    return 0;
}

