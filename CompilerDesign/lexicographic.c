#include <stdio.h>
#include <ctype.h>
#include <string.h>

int isKeyword(char word[]) {
    char keywords[10][10] = {
        "int", "float", "if", "else", "while",
        "for", "do", "return", "char", "double"
    };

    for (int i = 0; i < 10; i++) {
        if (strcmp(word, keywords[i]) == 0)
            return 1;
    }
    return 0;
}

int main() {
    char ch, buffer[50];
    int i;
    printf("Enter source code (Ctrl+Z then Enter):\n");
    while ((ch = getchar()) != EOF) {

        if (ch == ' ' || ch == '\t' || ch == '\n')
            continue;

        if (isalpha(ch)) {
            i = 0;
            buffer[i++] = ch;

            while (isalnum(ch = getchar())) {
                buffer[i++] = ch;
            }
            buffer[i] = '\0';

            if (isKeyword(buffer))
                printf("%s : Keyword\n", buffer);
            else
                printf("%s : Identifier\n", buffer);

            ungetc(ch, stdin);
        }

        else if (isdigit(ch)) {
            i = 0;
            buffer[i++] = ch;

            while (isdigit(ch = getchar())) {
                buffer[i++] = ch;
            }
            buffer[i] = '\0';

            printf("%s : Number\n", buffer);
            ungetc(ch, stdin);
        }

        else if (ch == '+' || ch == '-' || ch == '*' ||
                 ch == '/' || ch == '=' || ch == '<' || ch == '>') {
            printf("%c : Operator\n", ch);
        }

        else if (ch == ';' || ch == ',' ||
                 ch == '(' || ch == ')' ||
                 ch == '{' || ch == '}') {
            printf("%c : Special Symbol\n", ch);
        }
    }

    return 0;
}

// gcc lexicographic.c -o lexicographic
// .\lexicographic.exe