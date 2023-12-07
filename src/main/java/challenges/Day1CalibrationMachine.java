package challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import javax.print.DocFlavor.STRING;

public class Day1CalibrationMachine {

  public static Map<String, String> STRING_DIGITS_MAP = new HashMap<>();
  static {
    STRING_DIGITS_MAP.put("one", "one1one");
    STRING_DIGITS_MAP.put("two", "two2two");
    STRING_DIGITS_MAP.put("three", "three3three");
    STRING_DIGITS_MAP.put("four", "four4four");
    STRING_DIGITS_MAP.put("five", "five5five");
    STRING_DIGITS_MAP.put("six", "six6six");
    STRING_DIGITS_MAP.put("seven", "seven7seven");
    STRING_DIGITS_MAP.put("eight", "eight8eight");
    STRING_DIGITS_MAP.put("nine", "nine9nine");
    STRING_DIGITS_MAP.put("ten", "ten10ten");
  }

  public int getNumber(String oneLineInput) {
    String validInput = mapStringDigitsIntoActualDigits(oneLineInput);
    return Integer.valueOf(getFirstAndLastDigit(validInput));
  }

  private String mapStringDigitsIntoActualDigits(String oneLineInput) {
    for (String key : STRING_DIGITS_MAP.keySet()) {
      if (oneLineInput.contains(key)){
        oneLineInput = oneLineInput.replaceAll(key, STRING_DIGITS_MAP.get(key));
      }
    }
    return oneLineInput;
  }

  private String getFirstAndLastDigit(String oneLineInput) {
    return getfirstDigit(oneLineInput).toString().concat(getLastDigit(oneLineInput).toString());
  }

  private Character getLastDigit(String oneLineInput) {
    String reversedInput = new StringBuilder(oneLineInput).reverse().toString();
    return getfirstDigit(reversedInput);
  }

  private Character getfirstDigit(String oneLineInput) {
    for(char character : oneLineInput.toCharArray()){
      if (Character.isDigit(character)) return character;
    }
    return null;
  }

  public int getSum(String input) {
    int sum = 0;
    BufferedReader reader;
    try {
      reader = new BufferedReader(new StringReader(input));
      String line = reader.readLine();

      while (line != null) {
        sum = sum + getNumber(line);
        // read next line
        line = reader.readLine();
      }
      reader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return sum;
  }
}
