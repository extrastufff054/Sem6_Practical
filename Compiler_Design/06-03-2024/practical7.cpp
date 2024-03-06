#include<iostream>
#include <string>
#include <regex>

using namespace std;
int main() {
    string input;
    getline(cin, input);
    regex keywordPattern("(int|float|bool|double|char)");
    regex identifierPattern("([a-zA-Z_][a-zA-Z0-9_]*)");
    regex numberPattern("([0-9]+)");
    regex punctuationPattern("([.,;:{}()])"); // Corrected line
    smatch match;

    if (regex_search(input, match, keywordPattern)) {
        cout << "Keyword: " << match.str() << '\n';
    }

    if (regex_search(input, match, identifierPattern)) {
        cout << "Identifier: " << match.str() << '\n';
    }

    if (regex_search(input, match, numberPattern)) {
        cout << "Number: " << match.str() << '\n';
    }

    if (regex_search(input, match, punctuationPattern)) {
        cout << "Punctuation: " << match.str() << '\n';
    }

    return 0;
}
