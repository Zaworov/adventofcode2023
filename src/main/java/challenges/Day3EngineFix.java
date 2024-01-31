package challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Day3EngineFix {

  public List<NumberWithCoordinates> getNumbersWithCoordinates(String input) {
    if (input == null) {
      return null;
    }
    boolean isFirstDigit = true;
    List<NumberWithCoordinates> numbers = new ArrayList<>();
    int startingIndex = 0;
    int endingIndex;
    StringBuilder number = new StringBuilder();
    for (int index = 0; index < input.toCharArray().length; index++) {
      if (Character.isDigit(input.toCharArray()[index])) {
        number.append(input.toCharArray()[index]);
        if (isFirstDigit) {
          isFirstDigit = false;
          startingIndex = index;
        }
        int nextSignIndex = index + 1;
        Character followingCharacter = null;
        try {
          followingCharacter = input.toCharArray()[nextSignIndex];
        } catch (ArrayIndexOutOfBoundsException exception) {
        }
        if (followingCharacter == null || !Character.isDigit(followingCharacter)) {
          endingIndex = index;
          NumberWithCoordinates numberWithCoordinates = new NumberWithCoordinates(Integer.valueOf(number.toString()), new int[]{startingIndex, endingIndex});
          numbers.add(numberWithCoordinates);
          number = new StringBuilder();
          isFirstDigit = true;
        }
      }
    }
    return numbers;
  }

  public List<Integer> getSymbolsCoordinates(String input) {
    if (input == null) {
      return null;
    }
    List<Integer> symbolsCoordinates = new ArrayList<>();
    for (int index = 0; index < input.toCharArray().length; index++) {
      if (!Character.isDigit(input.toCharArray()[index]) && input.toCharArray()[index] != '.') {
        symbolsCoordinates.add(index);
      }
    }
    return symbolsCoordinates;
  }

  public Integer getSumOfAdjacentNumbers(String input) {
    List<Integer> adjacentNumbers = new ArrayList<>();
    BufferedReader reader;
    String previousLine = null;
    try {
      reader = new BufferedReader(new StringReader(input));
      String currentLine = reader.readLine();
      do {
        String nextLine = reader.readLine();
        adjacentNumbers.addAll(
            getNumbersAdjacentToSymbolsFromThreeLines(previousLine, currentLine, nextLine));
        previousLine = currentLine;
        currentLine = nextLine;
      } while (currentLine != null);

      reader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

    return adjacentNumbers.stream().mapToInt(Integer::intValue).sum();
  }

  public List<Integer> getNumbersAdjacentToSymbolsFromThreeLines(String previousLine, String currentLine, String nextLine) {
    if (currentLine == null) {
      return Collections.emptyList();
    }
    List<Integer> adjacentNumbers = new ArrayList<>();
    List<Integer> previousLineSymbols = getSymbolsCoordinates(previousLine);
    List<Integer> currentLineSymbols = getSymbolsCoordinates(currentLine);
    List<NumberWithCoordinates> currentlineNumbers = getNumbersWithCoordinates(currentLine);
    List<Integer> nextLineSymbols = getSymbolsCoordinates(nextLine);
    for (NumberWithCoordinates number : currentlineNumbers) {
      if (isAdjacentNumber(number.getCoordinates(), extendCoordinates(previousLineSymbols),
          extendCoordinates(nextLineSymbols), extendCoordinates(currentLineSymbols))) {
        adjacentNumbers.add(number.getNumber());
      }
    }
    return adjacentNumbers;
  }

  private boolean isAdjacentNumber(int[] numberCoordinates, List<Integer> previousLineCoordinates,
      List<Integer> nextLineCoordinates, List<Integer> currentLineCoordinates) {
    for (int coordinate : numberCoordinates) {
      if (previousLineCoordinates.contains(coordinate) || nextLineCoordinates.contains(coordinate) || currentLineCoordinates.contains(coordinate)) {
        return true;
      }
    }
    return false;
  }

  private List<Integer> extendCoordinates(List<Integer> lineCoordinates) {
    if (lineCoordinates == null) {
      return Collections.emptyList();
    }
    return lineCoordinates.stream().flatMap(x -> Stream.of(x - 1, x, x + 1)).distinct().sorted()
        .collect(Collectors.toList());
  }

  public class NumberWithCoordinates {
    Integer number;
    int[] coordinates;

    public NumberWithCoordinates(Integer number, int[] coordinates) {
      this.number = number;
      this.coordinates = coordinates;
    }

    public Integer getNumber() {
      return number;
    }

    public void setNumber(Integer number) {
      this.number = number;
    }

    public int[] getCoordinates() {
      return coordinates;
    }

    public void setCoordinates(int[] coordinates) {
      this.coordinates = coordinates;
    }
  }
}
