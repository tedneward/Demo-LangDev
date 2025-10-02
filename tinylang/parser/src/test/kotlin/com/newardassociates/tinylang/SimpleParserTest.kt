package com.newardassociates.tinylang

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.tree.ParseTree

import java.io.FileInputStream
import java.io.InputStream

class SimpleParserTest {
    fun parse(inputStream : InputStream) : TLParser.ParseContext {
        val input = CharStreams.fromStream(inputStream)
        val lexer = TLLexer(input)
        val tokens = CommonTokenStream(lexer)
        val parser = TLParser(tokens)
        return parser.parse()
    }

    @Test fun testConstructor() {
        val tree = parse(FileInputStream("./src/test/resources/simplest.tl"))
        assertNotNull(tree)
    }
    @Test fun testBaseVisitor() {
        val tree = parse(FileInputStream("./src/test/resources/simplest.tl"))

        val eval = TLBaseVisitor<Void>()
        eval.visit(tree)
        assertNotNull(eval)
    }
    @Test fun parseHello() {
        val tree = parse(FileInputStream("./src/test/resources/simplest.tl"))
        assertNotNull(tree)

        println(tree.childCount)
        println(tree.getChild(0))

        val eofNode = tree.children.get(tree.childCount - 1)
        assertEquals("<EOF>", eofNode.toString())
    }
}
