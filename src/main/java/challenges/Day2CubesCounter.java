package challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class Day2CubesCounter {

  public static Map<String, Integer> AVAILABLE_CUBES = new HashMap<>();

  static {
    AVAILABLE_CUBES.put("red", 12);
    AVAILABLE_CUBES.put("green", 13);
    AVAILABLE_CUBES.put("blue", 14);
  }



  public int getCorrectGamesIdsSum(String input) {
    int sum = 0;
    BufferedReader reader;
    try {
      reader = new BufferedReader(new StringReader(input));
      String line = reader.readLine();

      while (line != null) {
        sum = sum + getGameIdIfCorrect(line);
        // read next line
        line = reader.readLine();
      }
      reader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return sum;
  }

  public int getCorrectCubeSetsPower(String input) {
    int sum = 0;
    BufferedReader reader;
    try {
      reader = new BufferedReader(new StringReader(input));
      String line = reader.readLine();

      while (line != null) {
        sum = sum + getCubesSetPower(line);
        // read next line
        line = reader.readLine();
      }
      reader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return sum;
  }

  public int getGameIdIfCorrect(String inputLine) {
    boolean isGameCorrect = true;
    int gameId = getGameId(inputLine);
    String[] sets = divideIntoSets(inputLine);
    for (String set : sets) {
      String[] cubes = set.split(",");
      for (String certainColourCubes : cubes) {
        String colour = getColour(certainColourCubes);
        int numberOfCubes = getNumberOfCubes(certainColourCubes);
        if (!areEnoughCubesInGame(numberOfCubes, colour)) {
          isGameCorrect = false;
        }
      }
    }
    return isGameCorrect? gameId : 0;
  }

  private int getNumberOfCubes(String certainColourCubes) {
    return Integer.parseInt(certainColourCubes.replaceAll("[a-zA-Z]", "").trim());
  }

  private String getColour(String certainColourCubes) {
    return certainColourCubes.replaceAll("\\d", "").trim();
  }

  private boolean areEnoughCubesInGame(int numberOfCubes, String colour) {
    return AVAILABLE_CUBES.get(colour) >= numberOfCubes;
  }

  public Integer getGameId(String inputLine) {
    String[] inputs = inputLine.split(":");
    return Integer.parseInt(inputs[0].replaceAll("Game ", ""));
  }

  public String[] divideIntoSets(String inputLine) {
    String[] inputs = inputLine.split(":");
    return inputs[1].trim().split(";");
  }

  public int getCubesSetPower(String inputLine) {
    Map<String, Integer> minimumRequiredCubesOfEachColour = new HashMap<>();
    String[] sets = divideIntoSets(inputLine);
    for (String set : sets) {
      String[] cubes = set.split(",");
      for (String certainColourCubes : cubes) {
        String colour = getColour(certainColourCubes);
        int numberOfCubes = getNumberOfCubes(certainColourCubes);
        if (minimumRequiredCubesOfEachColour.get(colour) == null) {
          minimumRequiredCubesOfEachColour.put(colour, numberOfCubes);
        } else {
          int numberOfCubesInGivenColour = minimumRequiredCubesOfEachColour.get(colour);
          if (numberOfCubesInGivenColour < numberOfCubes) minimumRequiredCubesOfEachColour.put(colour, numberOfCubes);
        }
      }
    }
    return minimumRequiredCubesOfEachColour.values().stream().reduce(1, (a, b) -> a * b);
  }
}

