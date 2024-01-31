package challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Day3EngineFixPart2 {

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
          NumberWithCoordinates numberWithCoordinates = new NumberWithCoordinates(Integer.valueOf(number.toString()),
              new int[]{startingIndex, endingIndex});
          numbers.add(numberWithCoordinates);
          number = new StringBuilder();
          isFirstDigit = true;
        }
      }
    }
    return numbers;
  }

  public List<Gear> getGears(String input) {
    if (input == null) {
      return new LinkedList<>();
    }
    LinkedList<Gear> gearCoordinates = new LinkedList<>();
    for (int index = 0; index < input.toCharArray().length; index++) {
      if (input.toCharArray()[index] == '*') {
        gearCoordinates.add(new Gear(index));
      }
    }
    return gearCoordinates;
  }

  public List<Gear> getGearsWithAdjacentNumbers(String previousLine, String currentLine, String nextLine) {
    if (currentLine == null) {
      return new LinkedList<>();
    }
    List<NumberWithCoordinates> previousLineNumbers = getNumbersWithCoordinates(previousLine);
    List<NumberWithCoordinates> currentLineNumbers = getNumbersWithCoordinates(currentLine);
    List<Gear> currentLineGears = getGears(currentLine);
    List<NumberWithCoordinates> nextLineNumbers = getNumbersWithCoordinates(nextLine);
    addNumbersToGear(previousLineNumbers, currentLineGears);
    addNumbersToGear(currentLineNumbers, currentLineGears);
    addNumbersToGear(nextLineNumbers, currentLineGears);
    return currentLineGears;
  }

  private void addNumbersToGear(List<NumberWithCoordinates> previousLineNumbers, List<Gear> currentLineGears) {
    for (Gear gear : currentLineGears) {
      for (NumberWithCoordinates number : previousLineNumbers) {
        if (coordinatesMatch(gear.getGearCoordinates(), number.getCoordinates())){
          gear.assignNumber(number.getNumber());
        }
      }
    }
  }

  private boolean coordinatesMatch(int[] gearCoordinates, int[] coordinates) {
    for (int gearCoordinate : gearCoordinates) {
      for (int numberCoordinate : coordinates) {
        if (gearCoordinate == numberCoordinate) return true;
      }
    }
    return false;
  }

  public List<Gear> getGearsWithAdjacentNumbers(String input) {
    LinkedList<Gear> gears = new LinkedList<>();
    BufferedReader reader;
    String previousLine = null;
    try {
      reader = new BufferedReader(new StringReader(input));
      String currentLine = reader.readLine();
      do {
        String nextLine = reader.readLine();
        gears.addAll(getGearsWithAdjacentNumbers(previousLine, currentLine, nextLine));
        previousLine = currentLine;
        currentLine = nextLine;
      } while (currentLine != null);

      reader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

    return gears;
  }

  public int getSumOfGearsRatio(String input) {
    List<Gear> gears = getGearsWithAdjacentNumbers(input);
    return gears.stream().filter(x -> x.secondNumber != null).mapToInt(Gear::getRatio).sum();
  }


  public static class NumberWithCoordinates {
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

  public static class Gear {

    int[] gearCoordinates;
    Integer firstNumber;
    Integer secondNumber;

    public Gear(int index) {
      this.gearCoordinates = extendCoordinates(index);
    }

    public int[] getGearCoordinates() {
      return gearCoordinates;
    }

    public void setGearCoordinates(int[] gearCoordinates) {
      this.gearCoordinates = gearCoordinates;
    }

    public Integer getFirstNumber() {
      return firstNumber;
    }

    public void setFirstNumber(Integer firstNumber) {
      this.firstNumber = firstNumber;
    }

    public Integer getSecondNumber() {
      return secondNumber;
    }

    public Integer ratio;

    public void setSecondNumber(Integer secondNumber) {
      this.secondNumber = secondNumber;
    }

    private int[] extendCoordinates(int coordinate) {
      return new int[]{coordinate - 1, coordinate, coordinate + 1};
    }

    public void assignNumber(Integer number) {
      if (secondNumber != null) return;
      if(firstNumber != null) {
        secondNumber = number;
        ratio = firstNumber * secondNumber;
      } else {
        firstNumber = number;
      }
    }

    public Integer getRatio() {
      return ratio;
    }
  }
}
