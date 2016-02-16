class Person {
  private String name;
  private int age;

  private Person (String personName,int personAge ){
    this.name = personName;
    this.age = personAge;
  }
  public static Person personDetails(String name,int age){
    return new Person(name,age);
  }
  public void personQueryPrint(){
    System.out.println("the person name is"+" "+this.name +" "+ this.age);
  }
}
