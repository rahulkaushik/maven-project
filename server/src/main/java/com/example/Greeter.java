package com.example;

/**
 * This is a class. This is a test
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * @param someone the name of a person
   * @return greeting string
   * This is a line addition test
   */
   public final String greet(final String someone) {
    return String.format("Hello test user, %s!", someone);
  }
}
