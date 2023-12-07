package challenges;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class Day2CubesCounterUnitTest {

  private Day2CubesCounter cubesCounter = new Day2CubesCounter();

  @Test
  public void shouldReturnGameId() {
    String inputLine = "Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green";

    int gameId = cubesCounter.getGameId(inputLine);

    assertThat(gameId).isEqualTo(1);
  }

  @Test
  public void shouldDivideGameIntoSets(){
    String inputLine = "Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green";

    String[] sets = cubesCounter.divideIntoSets(inputLine);

    assertThat(sets.length).isEqualTo(3);
  }

  @Test
  public void shouldCountCorrectGameId(){
    String inputLine = "Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green";

    int isCorrect = cubesCounter.getGameIdIfCorrect(inputLine);

    assertThat(isCorrect).isEqualTo(1);
  }

  @Test
  public void shouldFindMinimumRequiredCubesOfEachColour(){
    String inputLine = "Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green";

    int cubesSetPower = cubesCounter.getCubesSetPower(inputLine);

    assertThat(cubesSetPower).isEqualTo(48);
  }

  @Test
  public void shouldCountCorrectGamesIds(){
    String inputLine = "Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green\n"
        + "Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue\n"
        + "Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red\n"
        + "Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red\n"
        + "Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green";

    int isCorrect = cubesCounter.getCorrectGamesIdsSum(inputLine);

    assertThat(isCorrect).isEqualTo(8);
  }

  @Test
  public void shouldProvideResultToFirstPart(){
    String inputLine = "Game 1: 2 red, 2 green; 6 red, 3 green; 2 red, 1 green, 2 blue; 1 red\n"
        + "Game 2: 2 green; 15 red, 5 blue; 2 green, 4 blue, 5 red; 3 green, 6 blue, 6 red; 6 blue, 1 green\n"
        + "Game 3: 10 blue, 8 red, 5 green; 5 green, 3 red; 12 red, 2 green, 9 blue; 6 green, 11 red\n"
        + "Game 4: 2 green, 3 blue, 1 red; 17 green, 1 blue, 1 red; 1 green, 5 red\n"
        + "Game 5: 4 green, 13 red, 3 blue; 14 blue, 5 green, 5 red; 2 blue, 7 green, 3 red; 5 green, 11 blue, 10 red\n"
        + "Game 6: 1 green, 4 red; 1 blue, 19 red, 5 green; 15 red, 1 green, 1 blue; 8 green, 12 red; 19 green, 7 red; 2 blue, 14 red, 12 green\n"
        + "Game 7: 1 blue, 3 red, 3 green; 4 green; 1 blue, 6 red, 5 green\n"
        + "Game 8: 1 green; 1 green, 16 red, 1 blue; 3 red, 1 green, 1 blue; 1 green; 2 blue; 9 red\n"
        + "Game 9: 5 green, 1 red; 6 red, 4 blue, 1 green; 9 green, 7 red, 6 blue; 11 red, 12 green, 4 blue\n"
        + "Game 10: 12 green, 4 blue, 7 red; 6 blue, 2 red; 7 green, 6 blue, 6 red\n"
        + "Game 11: 18 green, 2 red; 19 green, 14 red, 9 blue; 8 blue, 12 red, 5 green; 4 green, 12 red; 14 red, 7 green, 10 blue\n"
        + "Game 12: 8 red, 4 blue; 4 green, 1 red, 2 blue; 1 blue, 11 green, 12 red\n"
        + "Game 13: 5 green, 4 blue, 4 red; 4 red, 5 blue, 2 green; 1 red, 5 blue, 10 green\n"
        + "Game 14: 14 red, 1 green; 2 green, 3 blue, 7 red; 2 red, 4 blue; 3 green, 8 red, 4 blue; 2 green, 14 red, 4 blue; 3 green, 9 red, 6 blue\n"
        + "Game 15: 17 blue, 5 red, 1 green; 1 green, 2 red; 3 red, 2 green; 11 blue, 4 red, 2 green\n"
        + "Game 16: 5 red, 5 green, 1 blue; 5 blue, 15 red, 13 green; 3 blue, 6 red, 12 green; 1 green, 13 red, 9 blue; 15 blue, 13 green, 6 red; 5 green, 7 red, 3 blue\n"
        + "Game 17: 17 red, 9 blue; 19 red, 9 blue, 2 green; 18 red, 1 green, 8 blue; 10 blue, 2 red, 1 green; 7 red, 5 blue, 1 green; 2 green, 2 red, 5 blue\n"
        + "Game 18: 1 blue, 9 green, 1 red; 8 green, 5 blue; 4 blue, 9 green; 1 red, 6 green; 3 green, 3 blue, 1 red; 1 red, 1 blue, 4 green\n"
        + "Game 19: 3 blue, 3 red; 1 blue, 2 red, 4 green; 4 green, 2 red; 7 blue, 1 red\n"
        + "Game 20: 1 blue, 2 red, 6 green; 4 red, 10 green, 5 blue; 7 green, 1 blue; 3 green, 10 red, 1 blue; 3 blue, 11 red, 2 green; 10 green, 1 blue, 11 red\n"
        + "Game 21: 1 green, 17 blue, 8 red; 13 green, 8 blue, 7 red; 7 blue, 10 green, 2 red\n"
        + "Game 22: 4 green, 13 blue; 13 blue, 10 green; 8 green, 12 blue, 3 red; 6 green, 3 blue, 3 red\n"
        + "Game 23: 11 green, 7 red; 11 blue, 11 red; 12 green, 3 red; 7 red, 7 green, 15 blue; 10 green, 5 blue\n"
        + "Game 24: 1 blue, 15 green, 6 red; 2 red, 1 blue, 5 green; 13 green, 1 blue, 7 red; 1 blue; 19 green, 1 blue, 12 red; 13 green, 1 blue, 2 red\n"
        + "Game 25: 15 green, 1 blue, 2 red; 9 green, 5 blue; 16 green, 4 red; 3 blue, 2 red, 7 green\n"
        + "Game 26: 5 blue, 1 red; 9 blue, 1 green, 1 red; 1 red, 1 green, 4 blue\n"
        + "Game 27: 3 red, 4 blue, 2 green; 2 red, 3 blue; 1 blue, 1 red, 5 green\n"
        + "Game 28: 1 red, 3 green, 6 blue; 5 red, 2 blue, 3 green; 6 green, 4 red\n"
        + "Game 29: 8 green, 6 red, 18 blue; 18 blue, 2 green, 8 red; 2 red, 14 blue, 2 green; 2 red, 4 green, 19 blue; 11 green, 9 red, 8 blue\n"
        + "Game 30: 9 red, 11 blue, 6 green; 4 red, 6 green, 1 blue; 13 blue, 1 red, 1 green; 7 red, 1 green, 1 blue\n"
        + "Game 31: 11 red, 3 green; 3 green, 2 red; 6 red, 4 green; 4 blue, 9 red; 4 green, 2 red, 3 blue; 2 red, 1 blue, 6 green\n"
        + "Game 32: 4 red, 16 blue, 12 green; 10 blue, 7 green, 3 red; 7 blue, 4 green; 1 green, 8 blue, 3 red\n"
        + "Game 33: 6 green, 2 blue, 2 red; 1 red, 3 green, 7 blue; 9 blue, 1 green; 10 blue, 1 green, 1 red; 8 blue, 4 red, 6 green; 1 green, 2 red, 7 blue\n"
        + "Game 34: 4 blue, 6 red; 7 red, 5 green, 3 blue; 2 blue, 1 red; 5 blue, 2 green\n"
        + "Game 35: 8 green, 1 blue; 12 blue; 6 green, 13 blue; 9 blue, 4 green; 5 green, 1 red, 7 blue; 5 blue, 1 red, 6 green\n"
        + "Game 36: 10 red, 4 blue, 6 green; 15 blue, 1 green, 2 red; 16 red, 14 blue, 2 green\n"
        + "Game 37: 3 green, 1 red, 2 blue; 5 blue, 2 green, 4 red; 2 red, 3 green; 4 blue, 4 red, 1 green; 3 red, 4 blue, 3 green\n"
        + "Game 38: 9 red, 1 green, 16 blue; 1 green, 4 blue, 1 red; 10 blue, 1 red, 1 green; 3 red, 17 blue; 7 blue, 5 red\n"
        + "Game 39: 9 red, 16 blue, 3 green; 8 green, 3 red, 3 blue; 8 blue, 13 red, 1 green; 3 red, 17 blue, 3 green; 11 blue, 9 red, 3 green\n"
        + "Game 40: 4 blue, 2 green, 8 red; 3 blue; 7 blue\n"
        + "Game 41: 3 blue, 10 green, 7 red; 1 blue; 8 green, 4 blue, 1 red; 8 green, 7 red, 4 blue\n"
        + "Game 42: 6 green, 5 blue, 1 red; 5 blue, 2 red, 6 green; 1 green, 3 red, 3 blue; 1 red, 1 blue, 8 green; 2 red, 10 green; 4 red, 6 green\n"
        + "Game 43: 12 blue, 9 green, 9 red; 8 blue, 6 red, 2 green; 1 green, 8 blue, 12 red; 15 blue, 5 green, 13 red; 15 blue, 7 green, 8 red; 16 blue, 11 red, 8 green\n"
        + "Game 44: 4 green, 16 blue, 1 red; 5 green, 1 blue; 1 blue, 1 green; 11 blue, 1 red, 3 green; 10 blue, 1 red; 15 blue, 1 red, 3 green\n"
        + "Game 45: 12 blue, 6 green, 9 red; 5 red, 6 blue, 2 green; 4 blue, 5 green, 5 red; 2 green, 6 blue, 8 red; 9 red, 7 green, 7 blue\n"
        + "Game 46: 7 blue, 1 red; 1 green, 2 blue, 2 red; 3 red\n"
        + "Game 47: 10 blue, 11 green, 1 red; 10 green; 4 red, 6 blue, 16 green; 20 green, 2 blue; 1 green, 3 red, 6 blue; 4 red, 5 blue, 13 green\n"
        + "Game 48: 1 red, 4 blue, 3 green; 20 blue, 1 red, 8 green; 1 red, 12 green, 12 blue\n"
        + "Game 49: 5 green, 8 red, 2 blue; 2 blue, 2 red, 1 green; 3 red, 3 blue; 3 blue, 12 green\n"
        + "Game 50: 7 green, 8 red; 2 blue, 6 green; 1 green, 1 blue, 7 red\n"
        + "Game 51: 19 red, 13 blue, 4 green; 9 green, 10 red, 2 blue; 2 green, 20 red; 20 red, 2 green; 6 green, 10 blue, 5 red\n"
        + "Game 52: 1 red, 13 green; 11 green; 15 green; 1 red, 9 green, 1 blue\n"
        + "Game 53: 7 blue, 3 green; 1 red, 6 blue, 6 green; 7 blue, 1 red, 6 green\n"
        + "Game 54: 12 red, 1 green; 14 red, 10 green; 1 green, 7 red, 4 blue\n"
        + "Game 55: 1 blue, 5 green, 3 red; 3 green, 4 red; 6 red, 1 blue, 4 green\n"
        + "Game 56: 5 red, 1 blue, 2 green; 6 green; 4 red, 6 green; 6 green, 2 blue, 2 red; 4 red, 2 green, 2 blue; 4 red, 2 blue\n"
        + "Game 57: 6 green, 3 blue; 8 blue, 6 green, 5 red; 5 red, 2 green, 12 blue; 5 red, 7 green, 5 blue\n"
        + "Game 58: 2 blue, 1 red, 4 green; 1 red, 14 green; 2 green, 2 blue, 1 red\n"
        + "Game 59: 10 red, 11 blue, 6 green; 2 blue, 8 green; 1 green, 5 blue, 15 red; 3 red, 7 blue, 9 green; 9 green, 9 blue, 14 red; 8 green, 13 blue, 15 red\n"
        + "Game 60: 1 blue, 11 red, 7 green; 7 red, 3 blue; 16 red, 3 blue, 2 green; 2 red, 9 green, 2 blue; 2 blue, 8 red, 9 green; 15 red, 1 blue, 9 green\n"
        + "Game 61: 8 green, 15 blue; 16 blue, 1 green; 1 green, 11 blue; 1 green, 9 blue, 1 red; 8 green, 9 blue; 8 blue, 15 green\n"
        + "Game 62: 5 green, 4 blue; 1 blue, 2 green; 1 red, 16 green, 2 blue; 1 blue, 16 green, 1 red; 13 green, 2 blue\n"
        + "Game 63: 1 red, 1 blue; 1 green, 1 red; 1 green; 1 green, 2 red; 1 blue; 2 red\n"
        + "Game 64: 5 red, 1 blue, 5 green; 10 red, 4 green, 2 blue; 8 red, 1 blue\n"
        + "Game 65: 1 red, 8 green, 10 blue; 11 blue, 5 green, 1 red; 2 red, 5 blue, 1 green; 8 green, 7 blue\n"
        + "Game 66: 5 red, 1 green; 1 blue, 7 red; 4 red, 15 green, 1 blue; 8 red, 4 green; 1 blue, 15 green, 3 red\n"
        + "Game 67: 15 green, 7 blue, 1 red; 8 green, 7 blue; 5 blue, 1 red, 4 green; 2 green, 9 blue; 1 red, 6 blue\n"
        + "Game 68: 14 green, 17 red; 1 red, 2 blue, 17 green; 10 green; 3 red, 7 green, 2 blue\n"
        + "Game 69: 8 green, 12 red, 11 blue; 8 red, 2 blue, 10 green; 2 green, 6 blue, 2 red; 10 red, 12 green, 3 blue\n"
        + "Game 70: 2 blue, 8 green; 9 green; 2 red; 2 red, 5 green; 3 green, 2 blue, 3 red; 4 red, 1 blue\n"
        + "Game 71: 3 green, 4 blue; 13 red, 13 blue; 4 green, 3 red, 1 blue; 1 green, 7 blue, 3 red; 3 green, 9 blue, 13 red; 10 red, 12 blue, 5 green\n"
        + "Game 72: 4 green, 17 red, 4 blue; 4 green, 2 blue; 1 red, 10 blue, 1 green; 3 green; 2 blue, 15 red, 3 green; 6 red, 10 blue\n"
        + "Game 73: 14 green, 9 red, 6 blue; 10 red, 4 green, 7 blue; 9 green, 5 red, 6 blue; 6 red, 2 blue; 5 blue, 7 red, 14 green; 4 green, 6 blue, 5 red\n"
        + "Game 74: 19 blue, 7 green, 1 red; 12 blue, 11 green, 1 red; 2 red, 5 blue, 14 green; 5 green, 5 blue, 7 red\n"
        + "Game 75: 12 green, 5 blue, 12 red; 17 green, 10 red, 7 blue; 1 blue, 8 red, 1 green; 11 red, 10 green, 4 blue; 1 blue, 10 green; 1 green, 5 blue, 7 red\n"
        + "Game 76: 9 green, 2 red, 3 blue; 6 red, 13 green, 5 blue; 14 green, 9 red, 2 blue; 1 blue, 6 red, 2 green; 8 red, 10 green, 1 blue; 2 red, 15 green, 7 blue\n"
        + "Game 77: 5 blue, 2 green, 1 red; 4 blue, 14 red; 3 blue, 1 green, 8 red; 13 red, 8 blue; 17 blue, 2 green, 9 red; 11 blue, 1 green\n"
        + "Game 78: 5 blue, 4 green, 4 red; 1 red, 9 green, 4 blue; 8 green\n"
        + "Game 79: 5 blue, 6 red; 2 blue, 1 green, 9 red; 3 green; 8 red, 1 green, 5 blue; 2 green, 5 red\n"
        + "Game 80: 1 green, 2 blue, 8 red; 9 green, 12 red; 17 green, 8 red, 11 blue\n"
        + "Game 81: 8 red, 11 green, 13 blue; 9 red, 14 blue, 14 green; 14 blue, 11 green, 1 red; 5 red, 13 green, 3 blue; 4 green, 9 red, 2 blue; 11 red, 5 blue, 2 green\n"
        + "Game 82: 13 green, 2 red, 1 blue; 10 green, 2 blue; 2 blue, 11 green; 4 red, 1 green, 3 blue; 14 green, 1 blue, 2 red\n"
        + "Game 83: 6 blue, 2 red; 3 blue, 11 red, 1 green; 12 red, 1 green, 1 blue; 2 red; 10 red, 6 blue\n"
        + "Game 84: 1 green, 13 blue, 2 red; 4 red, 17 blue, 18 green; 17 green, 13 blue, 4 red; 4 blue, 15 green, 3 red; 3 red; 15 blue, 1 red, 12 green\n"
        + "Game 85: 11 green, 7 red; 7 green, 4 blue, 6 red; 8 red, 7 blue, 2 green; 11 green, 10 red, 3 blue\n"
        + "Game 86: 10 green, 5 blue; 4 blue, 7 red, 16 green; 8 red, 1 blue, 12 green\n"
        + "Game 87: 7 red, 3 green; 1 blue, 5 red, 14 green; 13 red, 4 green; 19 green, 9 red; 12 green, 1 red\n"
        + "Game 88: 5 red, 16 blue; 2 green, 14 blue, 1 red; 14 blue, 1 green\n"
        + "Game 89: 1 green, 2 blue, 1 red; 10 blue; 4 blue; 2 green, 14 blue; 14 blue, 1 red, 2 green\n"
        + "Game 90: 1 blue, 13 green, 1 red; 4 blue, 1 red, 17 green; 9 green, 7 blue, 5 red; 1 blue, 3 red, 15 green; 3 red, 4 blue, 15 green\n"
        + "Game 91: 1 green; 9 green, 2 red, 2 blue; 3 blue, 12 green, 1 red; 2 red, 1 blue, 6 green\n"
        + "Game 92: 1 green, 4 blue, 10 red; 12 blue, 9 red, 3 green; 10 blue, 8 red, 2 green\n"
        + "Game 93: 7 blue, 5 red; 2 green, 1 blue, 6 red; 1 blue, 6 red\n"
        + "Game 94: 8 red, 3 green, 8 blue; 3 red, 1 green, 4 blue; 4 green, 17 blue, 2 red; 2 green, 9 red, 7 blue; 13 red, 4 green, 18 blue\n"
        + "Game 95: 9 blue, 11 green; 14 green, 10 blue, 11 red; 13 blue, 10 green, 1 red; 6 red, 4 green, 1 blue; 9 blue, 13 green\n"
        + "Game 96: 3 red, 3 green; 16 green, 2 blue; 7 blue, 3 red, 16 green; 10 green, 1 red\n"
        + "Game 97: 4 red, 6 blue; 2 red; 13 red, 6 blue, 3 green; 1 green, 12 red; 3 green, 2 blue, 16 red\n"
        + "Game 98: 1 red, 6 green, 7 blue; 14 red, 3 green, 2 blue; 16 blue, 14 red, 11 green; 5 blue; 9 red, 1 green, 15 blue\n"
        + "Game 99: 3 blue, 8 green, 1 red; 4 green, 1 blue, 2 red; 1 red, 4 green; 2 blue, 4 green\n"
        + "Game 100: 8 red, 2 blue, 1 green; 2 blue, 4 red, 2 green; 9 red, 1 green; 2 green, 2 red; 3 red, 5 blue; 5 blue, 8 red\n";

    int isCorrect = cubesCounter.getCorrectGamesIdsSum(inputLine);

    assertThat(isCorrect).isEqualTo(2169);
  }

  @Test
  public void shouldProvideResultToSecondPart(){
    String inputLine = "Game 1: 2 red, 2 green; 6 red, 3 green; 2 red, 1 green, 2 blue; 1 red\n"
        + "Game 2: 2 green; 15 red, 5 blue; 2 green, 4 blue, 5 red; 3 green, 6 blue, 6 red; 6 blue, 1 green\n"
        + "Game 3: 10 blue, 8 red, 5 green; 5 green, 3 red; 12 red, 2 green, 9 blue; 6 green, 11 red\n"
        + "Game 4: 2 green, 3 blue, 1 red; 17 green, 1 blue, 1 red; 1 green, 5 red\n"
        + "Game 5: 4 green, 13 red, 3 blue; 14 blue, 5 green, 5 red; 2 blue, 7 green, 3 red; 5 green, 11 blue, 10 red\n"
        + "Game 6: 1 green, 4 red; 1 blue, 19 red, 5 green; 15 red, 1 green, 1 blue; 8 green, 12 red; 19 green, 7 red; 2 blue, 14 red, 12 green\n"
        + "Game 7: 1 blue, 3 red, 3 green; 4 green; 1 blue, 6 red, 5 green\n"
        + "Game 8: 1 green; 1 green, 16 red, 1 blue; 3 red, 1 green, 1 blue; 1 green; 2 blue; 9 red\n"
        + "Game 9: 5 green, 1 red; 6 red, 4 blue, 1 green; 9 green, 7 red, 6 blue; 11 red, 12 green, 4 blue\n"
        + "Game 10: 12 green, 4 blue, 7 red; 6 blue, 2 red; 7 green, 6 blue, 6 red\n"
        + "Game 11: 18 green, 2 red; 19 green, 14 red, 9 blue; 8 blue, 12 red, 5 green; 4 green, 12 red; 14 red, 7 green, 10 blue\n"
        + "Game 12: 8 red, 4 blue; 4 green, 1 red, 2 blue; 1 blue, 11 green, 12 red\n"
        + "Game 13: 5 green, 4 blue, 4 red; 4 red, 5 blue, 2 green; 1 red, 5 blue, 10 green\n"
        + "Game 14: 14 red, 1 green; 2 green, 3 blue, 7 red; 2 red, 4 blue; 3 green, 8 red, 4 blue; 2 green, 14 red, 4 blue; 3 green, 9 red, 6 blue\n"
        + "Game 15: 17 blue, 5 red, 1 green; 1 green, 2 red; 3 red, 2 green; 11 blue, 4 red, 2 green\n"
        + "Game 16: 5 red, 5 green, 1 blue; 5 blue, 15 red, 13 green; 3 blue, 6 red, 12 green; 1 green, 13 red, 9 blue; 15 blue, 13 green, 6 red; 5 green, 7 red, 3 blue\n"
        + "Game 17: 17 red, 9 blue; 19 red, 9 blue, 2 green; 18 red, 1 green, 8 blue; 10 blue, 2 red, 1 green; 7 red, 5 blue, 1 green; 2 green, 2 red, 5 blue\n"
        + "Game 18: 1 blue, 9 green, 1 red; 8 green, 5 blue; 4 blue, 9 green; 1 red, 6 green; 3 green, 3 blue, 1 red; 1 red, 1 blue, 4 green\n"
        + "Game 19: 3 blue, 3 red; 1 blue, 2 red, 4 green; 4 green, 2 red; 7 blue, 1 red\n"
        + "Game 20: 1 blue, 2 red, 6 green; 4 red, 10 green, 5 blue; 7 green, 1 blue; 3 green, 10 red, 1 blue; 3 blue, 11 red, 2 green; 10 green, 1 blue, 11 red\n"
        + "Game 21: 1 green, 17 blue, 8 red; 13 green, 8 blue, 7 red; 7 blue, 10 green, 2 red\n"
        + "Game 22: 4 green, 13 blue; 13 blue, 10 green; 8 green, 12 blue, 3 red; 6 green, 3 blue, 3 red\n"
        + "Game 23: 11 green, 7 red; 11 blue, 11 red; 12 green, 3 red; 7 red, 7 green, 15 blue; 10 green, 5 blue\n"
        + "Game 24: 1 blue, 15 green, 6 red; 2 red, 1 blue, 5 green; 13 green, 1 blue, 7 red; 1 blue; 19 green, 1 blue, 12 red; 13 green, 1 blue, 2 red\n"
        + "Game 25: 15 green, 1 blue, 2 red; 9 green, 5 blue; 16 green, 4 red; 3 blue, 2 red, 7 green\n"
        + "Game 26: 5 blue, 1 red; 9 blue, 1 green, 1 red; 1 red, 1 green, 4 blue\n"
        + "Game 27: 3 red, 4 blue, 2 green; 2 red, 3 blue; 1 blue, 1 red, 5 green\n"
        + "Game 28: 1 red, 3 green, 6 blue; 5 red, 2 blue, 3 green; 6 green, 4 red\n"
        + "Game 29: 8 green, 6 red, 18 blue; 18 blue, 2 green, 8 red; 2 red, 14 blue, 2 green; 2 red, 4 green, 19 blue; 11 green, 9 red, 8 blue\n"
        + "Game 30: 9 red, 11 blue, 6 green; 4 red, 6 green, 1 blue; 13 blue, 1 red, 1 green; 7 red, 1 green, 1 blue\n"
        + "Game 31: 11 red, 3 green; 3 green, 2 red; 6 red, 4 green; 4 blue, 9 red; 4 green, 2 red, 3 blue; 2 red, 1 blue, 6 green\n"
        + "Game 32: 4 red, 16 blue, 12 green; 10 blue, 7 green, 3 red; 7 blue, 4 green; 1 green, 8 blue, 3 red\n"
        + "Game 33: 6 green, 2 blue, 2 red; 1 red, 3 green, 7 blue; 9 blue, 1 green; 10 blue, 1 green, 1 red; 8 blue, 4 red, 6 green; 1 green, 2 red, 7 blue\n"
        + "Game 34: 4 blue, 6 red; 7 red, 5 green, 3 blue; 2 blue, 1 red; 5 blue, 2 green\n"
        + "Game 35: 8 green, 1 blue; 12 blue; 6 green, 13 blue; 9 blue, 4 green; 5 green, 1 red, 7 blue; 5 blue, 1 red, 6 green\n"
        + "Game 36: 10 red, 4 blue, 6 green; 15 blue, 1 green, 2 red; 16 red, 14 blue, 2 green\n"
        + "Game 37: 3 green, 1 red, 2 blue; 5 blue, 2 green, 4 red; 2 red, 3 green; 4 blue, 4 red, 1 green; 3 red, 4 blue, 3 green\n"
        + "Game 38: 9 red, 1 green, 16 blue; 1 green, 4 blue, 1 red; 10 blue, 1 red, 1 green; 3 red, 17 blue; 7 blue, 5 red\n"
        + "Game 39: 9 red, 16 blue, 3 green; 8 green, 3 red, 3 blue; 8 blue, 13 red, 1 green; 3 red, 17 blue, 3 green; 11 blue, 9 red, 3 green\n"
        + "Game 40: 4 blue, 2 green, 8 red; 3 blue; 7 blue\n"
        + "Game 41: 3 blue, 10 green, 7 red; 1 blue; 8 green, 4 blue, 1 red; 8 green, 7 red, 4 blue\n"
        + "Game 42: 6 green, 5 blue, 1 red; 5 blue, 2 red, 6 green; 1 green, 3 red, 3 blue; 1 red, 1 blue, 8 green; 2 red, 10 green; 4 red, 6 green\n"
        + "Game 43: 12 blue, 9 green, 9 red; 8 blue, 6 red, 2 green; 1 green, 8 blue, 12 red; 15 blue, 5 green, 13 red; 15 blue, 7 green, 8 red; 16 blue, 11 red, 8 green\n"
        + "Game 44: 4 green, 16 blue, 1 red; 5 green, 1 blue; 1 blue, 1 green; 11 blue, 1 red, 3 green; 10 blue, 1 red; 15 blue, 1 red, 3 green\n"
        + "Game 45: 12 blue, 6 green, 9 red; 5 red, 6 blue, 2 green; 4 blue, 5 green, 5 red; 2 green, 6 blue, 8 red; 9 red, 7 green, 7 blue\n"
        + "Game 46: 7 blue, 1 red; 1 green, 2 blue, 2 red; 3 red\n"
        + "Game 47: 10 blue, 11 green, 1 red; 10 green; 4 red, 6 blue, 16 green; 20 green, 2 blue; 1 green, 3 red, 6 blue; 4 red, 5 blue, 13 green\n"
        + "Game 48: 1 red, 4 blue, 3 green; 20 blue, 1 red, 8 green; 1 red, 12 green, 12 blue\n"
        + "Game 49: 5 green, 8 red, 2 blue; 2 blue, 2 red, 1 green; 3 red, 3 blue; 3 blue, 12 green\n"
        + "Game 50: 7 green, 8 red; 2 blue, 6 green; 1 green, 1 blue, 7 red\n"
        + "Game 51: 19 red, 13 blue, 4 green; 9 green, 10 red, 2 blue; 2 green, 20 red; 20 red, 2 green; 6 green, 10 blue, 5 red\n"
        + "Game 52: 1 red, 13 green; 11 green; 15 green; 1 red, 9 green, 1 blue\n"
        + "Game 53: 7 blue, 3 green; 1 red, 6 blue, 6 green; 7 blue, 1 red, 6 green\n"
        + "Game 54: 12 red, 1 green; 14 red, 10 green; 1 green, 7 red, 4 blue\n"
        + "Game 55: 1 blue, 5 green, 3 red; 3 green, 4 red; 6 red, 1 blue, 4 green\n"
        + "Game 56: 5 red, 1 blue, 2 green; 6 green; 4 red, 6 green; 6 green, 2 blue, 2 red; 4 red, 2 green, 2 blue; 4 red, 2 blue\n"
        + "Game 57: 6 green, 3 blue; 8 blue, 6 green, 5 red; 5 red, 2 green, 12 blue; 5 red, 7 green, 5 blue\n"
        + "Game 58: 2 blue, 1 red, 4 green; 1 red, 14 green; 2 green, 2 blue, 1 red\n"
        + "Game 59: 10 red, 11 blue, 6 green; 2 blue, 8 green; 1 green, 5 blue, 15 red; 3 red, 7 blue, 9 green; 9 green, 9 blue, 14 red; 8 green, 13 blue, 15 red\n"
        + "Game 60: 1 blue, 11 red, 7 green; 7 red, 3 blue; 16 red, 3 blue, 2 green; 2 red, 9 green, 2 blue; 2 blue, 8 red, 9 green; 15 red, 1 blue, 9 green\n"
        + "Game 61: 8 green, 15 blue; 16 blue, 1 green; 1 green, 11 blue; 1 green, 9 blue, 1 red; 8 green, 9 blue; 8 blue, 15 green\n"
        + "Game 62: 5 green, 4 blue; 1 blue, 2 green; 1 red, 16 green, 2 blue; 1 blue, 16 green, 1 red; 13 green, 2 blue\n"
        + "Game 63: 1 red, 1 blue; 1 green, 1 red; 1 green; 1 green, 2 red; 1 blue; 2 red\n"
        + "Game 64: 5 red, 1 blue, 5 green; 10 red, 4 green, 2 blue; 8 red, 1 blue\n"
        + "Game 65: 1 red, 8 green, 10 blue; 11 blue, 5 green, 1 red; 2 red, 5 blue, 1 green; 8 green, 7 blue\n"
        + "Game 66: 5 red, 1 green; 1 blue, 7 red; 4 red, 15 green, 1 blue; 8 red, 4 green; 1 blue, 15 green, 3 red\n"
        + "Game 67: 15 green, 7 blue, 1 red; 8 green, 7 blue; 5 blue, 1 red, 4 green; 2 green, 9 blue; 1 red, 6 blue\n"
        + "Game 68: 14 green, 17 red; 1 red, 2 blue, 17 green; 10 green; 3 red, 7 green, 2 blue\n"
        + "Game 69: 8 green, 12 red, 11 blue; 8 red, 2 blue, 10 green; 2 green, 6 blue, 2 red; 10 red, 12 green, 3 blue\n"
        + "Game 70: 2 blue, 8 green; 9 green; 2 red; 2 red, 5 green; 3 green, 2 blue, 3 red; 4 red, 1 blue\n"
        + "Game 71: 3 green, 4 blue; 13 red, 13 blue; 4 green, 3 red, 1 blue; 1 green, 7 blue, 3 red; 3 green, 9 blue, 13 red; 10 red, 12 blue, 5 green\n"
        + "Game 72: 4 green, 17 red, 4 blue; 4 green, 2 blue; 1 red, 10 blue, 1 green; 3 green; 2 blue, 15 red, 3 green; 6 red, 10 blue\n"
        + "Game 73: 14 green, 9 red, 6 blue; 10 red, 4 green, 7 blue; 9 green, 5 red, 6 blue; 6 red, 2 blue; 5 blue, 7 red, 14 green; 4 green, 6 blue, 5 red\n"
        + "Game 74: 19 blue, 7 green, 1 red; 12 blue, 11 green, 1 red; 2 red, 5 blue, 14 green; 5 green, 5 blue, 7 red\n"
        + "Game 75: 12 green, 5 blue, 12 red; 17 green, 10 red, 7 blue; 1 blue, 8 red, 1 green; 11 red, 10 green, 4 blue; 1 blue, 10 green; 1 green, 5 blue, 7 red\n"
        + "Game 76: 9 green, 2 red, 3 blue; 6 red, 13 green, 5 blue; 14 green, 9 red, 2 blue; 1 blue, 6 red, 2 green; 8 red, 10 green, 1 blue; 2 red, 15 green, 7 blue\n"
        + "Game 77: 5 blue, 2 green, 1 red; 4 blue, 14 red; 3 blue, 1 green, 8 red; 13 red, 8 blue; 17 blue, 2 green, 9 red; 11 blue, 1 green\n"
        + "Game 78: 5 blue, 4 green, 4 red; 1 red, 9 green, 4 blue; 8 green\n"
        + "Game 79: 5 blue, 6 red; 2 blue, 1 green, 9 red; 3 green; 8 red, 1 green, 5 blue; 2 green, 5 red\n"
        + "Game 80: 1 green, 2 blue, 8 red; 9 green, 12 red; 17 green, 8 red, 11 blue\n"
        + "Game 81: 8 red, 11 green, 13 blue; 9 red, 14 blue, 14 green; 14 blue, 11 green, 1 red; 5 red, 13 green, 3 blue; 4 green, 9 red, 2 blue; 11 red, 5 blue, 2 green\n"
        + "Game 82: 13 green, 2 red, 1 blue; 10 green, 2 blue; 2 blue, 11 green; 4 red, 1 green, 3 blue; 14 green, 1 blue, 2 red\n"
        + "Game 83: 6 blue, 2 red; 3 blue, 11 red, 1 green; 12 red, 1 green, 1 blue; 2 red; 10 red, 6 blue\n"
        + "Game 84: 1 green, 13 blue, 2 red; 4 red, 17 blue, 18 green; 17 green, 13 blue, 4 red; 4 blue, 15 green, 3 red; 3 red; 15 blue, 1 red, 12 green\n"
        + "Game 85: 11 green, 7 red; 7 green, 4 blue, 6 red; 8 red, 7 blue, 2 green; 11 green, 10 red, 3 blue\n"
        + "Game 86: 10 green, 5 blue; 4 blue, 7 red, 16 green; 8 red, 1 blue, 12 green\n"
        + "Game 87: 7 red, 3 green; 1 blue, 5 red, 14 green; 13 red, 4 green; 19 green, 9 red; 12 green, 1 red\n"
        + "Game 88: 5 red, 16 blue; 2 green, 14 blue, 1 red; 14 blue, 1 green\n"
        + "Game 89: 1 green, 2 blue, 1 red; 10 blue; 4 blue; 2 green, 14 blue; 14 blue, 1 red, 2 green\n"
        + "Game 90: 1 blue, 13 green, 1 red; 4 blue, 1 red, 17 green; 9 green, 7 blue, 5 red; 1 blue, 3 red, 15 green; 3 red, 4 blue, 15 green\n"
        + "Game 91: 1 green; 9 green, 2 red, 2 blue; 3 blue, 12 green, 1 red; 2 red, 1 blue, 6 green\n"
        + "Game 92: 1 green, 4 blue, 10 red; 12 blue, 9 red, 3 green; 10 blue, 8 red, 2 green\n"
        + "Game 93: 7 blue, 5 red; 2 green, 1 blue, 6 red; 1 blue, 6 red\n"
        + "Game 94: 8 red, 3 green, 8 blue; 3 red, 1 green, 4 blue; 4 green, 17 blue, 2 red; 2 green, 9 red, 7 blue; 13 red, 4 green, 18 blue\n"
        + "Game 95: 9 blue, 11 green; 14 green, 10 blue, 11 red; 13 blue, 10 green, 1 red; 6 red, 4 green, 1 blue; 9 blue, 13 green\n"
        + "Game 96: 3 red, 3 green; 16 green, 2 blue; 7 blue, 3 red, 16 green; 10 green, 1 red\n"
        + "Game 97: 4 red, 6 blue; 2 red; 13 red, 6 blue, 3 green; 1 green, 12 red; 3 green, 2 blue, 16 red\n"
        + "Game 98: 1 red, 6 green, 7 blue; 14 red, 3 green, 2 blue; 16 blue, 14 red, 11 green; 5 blue; 9 red, 1 green, 15 blue\n"
        + "Game 99: 3 blue, 8 green, 1 red; 4 green, 1 blue, 2 red; 1 red, 4 green; 2 blue, 4 green\n"
        + "Game 100: 8 red, 2 blue, 1 green; 2 blue, 4 red, 2 green; 9 red, 1 green; 2 green, 2 red; 3 red, 5 blue; 5 blue, 8 red\n";

    int isCorrect = cubesCounter.getCorrectCubeSetsPower(inputLine);

    assertThat(isCorrect).isEqualTo(60948);
  }
}