package edu.sjsu.fwjs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import edu.sjsu.fwjs.parser.*;

public class Interpreter {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("Usage: java -cp .:lib/* edu.sjsu.fwjs.Interpreter <input_file>");
            return;
        }

        String inputFile = args[0];
        String input = new String(Files.readAllBytes(Paths.get(inputFile)));
        
        // Set up the lexer and parser
        CharStream chars = CharStreams.fromString(input);
        FeatherweightJavaScriptLexer lexer = new FeatherweightJavaScriptLexer(chars);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FeatherweightJavaScriptParser parser = new FeatherweightJavaScriptParser(tokens);
        
        // Parse the input
        ParseTree tree = parser.prog();
        
        // Evaluate the program
        ExpressionBuilderVisitor visitor = new ExpressionBuilderVisitor();
        Expression prog = visitor.visit(tree);
        prog.evaluate(new Environment());
    }
}
