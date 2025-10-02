package com.newardassociates.tinylang

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.ParseTreeWalker

import java.io.FileInputStream
import java.io.InputStream

class SimpleListenerTest {
    fun parse(inputStream : InputStream) : TLParser.ParseContext {
        val input = CharStreams.fromStream(inputStream)
        val lexer = TLLexer(input)
        val tokens = CommonTokenStream(lexer)
        val parser = TLParser(tokens)
        return parser.parse()
    }

    @Test fun testNOPListener() {
        val listener = TLBaseListener()
        val tree = parse(FileInputStream("./src/test/resources/simplest.tl"))
        ParseTreeWalker.DEFAULT.walk(listener, tree)
    }
    @Test fun testVerboseListener() {
        val listener = VerboseListener()
        val tree = parse(FileInputStream("./src/test/resources/simplest.tl"))
        ParseTreeWalker.DEFAULT.walk(listener, tree)
    }
}
