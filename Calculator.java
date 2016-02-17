public class Calculator {
  private int result;

  private Calculator(){
    result = 0;
  }
  public static Calculator initialCalculator(){
    return new Calculator();
  }
  public Calculator add(int number){
    result = result + number;
    return this;
  }

  public Calculator sub(int number){
    result = result - number;
    return this;
  }

  public int calculatingResult(){
    return result;
  }
}
