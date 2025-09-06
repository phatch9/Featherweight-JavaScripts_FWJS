package edu.sjsu.fwjs;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringTest {
    
    @Test
    public void testStringLiteral() {
        Environment env = new Environment();
        ValueExpr ve = new ValueExpr(new StringVal("Hello"));
        StringVal s = (StringVal) ve.evaluate(env);
        assertEquals("Hello", s.toString());
    }
    
    @Test
    public void testStringConcatenation() {
        Environment env = new Environment();
        
        // String + String
        Expression concat1 = new BinaryOpExpr(
            new ValueExpr(new StringVal("Hello")), 
            Op.ADD, 
            new ValueExpr(new StringVal(" World"))
        );
        StringVal result1 = (StringVal) concat1.evaluate(env);
        assertEquals("Hello World", result1.toString());
        
        // String + Number
        Expression concat2 = new BinaryOpExpr(
            new ValueExpr(new StringVal("Answer: ")), 
            Op.ADD, 
            new ValueExpr(new IntVal(42))
        );
        StringVal result2 = (StringVal) concat2.evaluate(env);
        assertEquals("Answer: 42", result2.toString());
    }
    
    @Test
    public void testStringComparison() {
        Environment env = new Environment();
        
        // Test equality
        Expression eq = new BinaryOpExpr(
            new ValueExpr(new StringVal("apple")), 
            Op.EQ, 
            new ValueExpr(new StringVal("apple"))
        );
        BoolVal eqResult = (BoolVal) eq.evaluate(env);
        assertTrue(eqResult.toBoolean());
        
        // Test inequality
        Expression neq = new BinaryOpExpr(
            new ValueExpr(new StringVal("apple")), 
            Op.NE, 
            new ValueExpr(new StringVal("banana"))
        );
        BoolVal neqResult = (BoolVal) neq.evaluate(env);
        assertTrue(neqResult.toBoolean());
        
        // Test less than
        Expression lt = new BinaryOpExpr(
            new ValueExpr(new StringVal("apple")), 
            Op.LT, 
            new ValueExpr(new StringVal("banana"))
        );
        BoolVal ltResult = (BoolVal) lt.evaluate(env);
        assertTrue(ltResult.toBoolean());
        
        // Test greater than
        Expression gt = new BinaryOpExpr(
            new ValueExpr(new StringVal("banana")), 
            Op.GT, 
            new ValueExpr(new StringVal("apple"))
        );
        BoolVal gtResult = (BoolVal) gt.evaluate(env);
        assertTrue(gtResult.toBoolean());
    }
    
    @Test
    public void testStringWithVariables() {
        Environment env = new Environment();
        env.updateVar("name", new StringVal("Alice"));
        
        // Variable reference
        Expression varRef = new VarExpr("name");
        StringVal name = (StringVal) varRef.evaluate(env);
        assertEquals("Alice", name.toString());
        
        // Concatenation with variable
        Expression concat = new BinaryOpExpr(
            new ValueExpr(new StringVal("Hello, ")), 
            Op.ADD, 
            new VarExpr("name")
        );
        StringVal result = (StringVal) concat.evaluate(env);
        assertEquals("Hello, Alice", result.toString());
    }
    
    @Test
    public void testEmptyString() {
        Environment env = new Environment();
        ValueExpr ve = new ValueExpr(new StringVal(""));
        StringVal s = (StringVal) ve.evaluate(env);
        assertEquals("", s.toString());
    }
}
