package edu.pdx.cs410J.whitlock;

import java.util.Stack;

/**
 * This class is represents a <code>Student</code>.                                 
 */                                                                                 
public class RPNCalculator {

  private Stack parseExpression(String expression) {
    Stack stack = new Stack();

    if (expression.equals("")) {
      return stack;
    }

    for (String token : expression.split(" ")) {
      try {
        stack.push(Integer.parseInt(token));
      } catch (NumberFormatException ex) {
        throw new InvalidRPNExpressionException("Invalid expression: " + token);
      }
    }

    return stack;
  }

  public int evaluate(String expression) {
    parseExpression(expression);
    return 0;
  }

  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
    System.exit(1);
  }
}