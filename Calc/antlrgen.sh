#!/bin/bash

# This script generates the ANTLR parser and lexer code for the Calc language.
# It assumes that ANTLR is installed and available in the system PATH.
# It also assumes that the grammar files are located in the same directory as this script.

# Generate the ANTLR parser and lexer code into the subdirectories where
# the different language examples are located.
antlr -Dlanguage=Java -visitor -listener -package com.newardassociates.javacalc.parser -o java/app/src/main/java/com/newardassociates/javacalc/parser -Xexact-output-dir LabeledExpr.g4
#antlr -Dlanguage=CSharp -o csharp LabeledExpr.g4
#antlr -Dlanguage=Python3 -o python LabeledExpr.g4
#antlr -Dlanguage=Swift -o swift LabeledExpr.g4
#antlr -Dlanguage=Cpp -o cpp LabeledExpr.g4
#antlr -Dlanguage=JavaScript -o javascript LabeledExpr.g4

