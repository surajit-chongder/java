class Calculator {
  private double result;

  private Calculator(){
    result = 0;
  }
  public static Calculator intialCalculator(){
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

  public Calculator power(double number,double powerOf){
    result = Math.pow(number,powerOf);
    return this;
  }

  private void calculatingResult(){
    System.out.println("The result is :"+ result);
  }

  public void printResult(){
    calculatingResult();
  }
}
