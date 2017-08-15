import java.time.LocalDateTime;

/*
  This file uses a class introduced in Java 8, but does not use any of the new language features.
  The purpose is to test that the standard library used is the one of Java 7 and not the one of
  Java 8.
 */

public class Main {
  public static void main(String[] args) {
    LocalDateTime dateTime = LocalDateTime.now();
    System.out.println(dateTime);
  }
}
