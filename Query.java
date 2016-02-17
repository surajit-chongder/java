class Query{
  public static void main(String[] args) {
    Person brinda = Person.personDetails("brinda",30);
    brinda.personQueryPrint();
    Calculator m = Calculator.intialCalculator ();
    m.power(5,2).sub(5).add(2);
    m.printResult();
  }
}
