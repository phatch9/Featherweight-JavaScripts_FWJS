# Featherweight-JavaScripts_FWJS

## Featherweight JavaScript (FWJS), a minimal version of JavaScript 

### Expressions in this language include:

#### Statement Declaration 
*If statements.  Unlike in JavaScript, evaluating if statements returns a value.
*While expressions.  Unlike in JavaScript, evaluating while statements returns a value (specifically null).
*Sequence expressions.  (In other words, you may have several statements in a row.)
*Binary operation expressions, such as addition, subtraction, etc.
*Variable declarations.
*Assignment statements.
*Functions.  Evaluating a function will return a closure.
*Function application.  Unlike in JavaScript, FWJS will include implicit returns (similar to Scheme and Ruby).
*Print statements.  Similar to console.log in JavaScript, these statements evaluate an expression and print the result.

Values in this language include booleans, ints, a special null values, and closures.  A closure is a combination of a function definition and its scope environment tracking any free variables in the function body.

*** Source Code Structure
Expression.java contains the representation for all expressions in FWJS.  Each class implements the evaluate method, which takes in an Environment (i.e. the mapping of variables to values) and returns a value.  The types of Values are stored in Value.java.

The main new challenge will be handling functions, which are closures in this language.

FunctionDeclExpr takes a list of parameter names and a body.  When evaluated, it returns a closure included the environment used when it was defined.

FunctionAppExpr takes an expression (which should evaluate to a closure) and a list of arguments.  When evaluated, the environment is ignored.  Instead a new environment is created including all of the parameters with the arguments bound to the parameter names.  Note that you will need to evaluate each argument to a value before the closure.apply method can be used.

Environment.java handles the resolution of JavaScript variables.  Update the resolveVar and updateVar methods to handle variable lookup correctly.
*If a variable is undefined in the current environment, look for it in the outer scope.
  (This holds for both updateVar and resolveVar).
*When resolving a variable that is undefined in the global scope, return null.  (In JavaScript, we would
  return undefined, but we will simplify the behavior).
*When updating a variable that is undefined in the global scope, create a new variable.
  (JavaScript follows this behavior; hence, if you forget to type 'var' when creating a new local
   variable, you might create a global variable instead).

*ExpressionTest.java has some JUnit test cases that will be useful to consider.  You can get the JAR files for JUnit from http://junit.org.

### MakeFile Instruction

A Makefile (http://www.gnu.org/software/make/manual/make.html) is provided for this project.  Update the two lines at the top of the file to specify where you have your JUnit libraries.

`make` will compile all code to a build/ directory.

`make test` runs the unit tests for this assignment.  All tests should pass once you have completed the assignment.

`make solution.zip` will produce the zip file of your src/ directory 