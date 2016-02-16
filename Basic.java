import java.util.Scanner;

class Basic{
  public static int factorial(int number){
    if(number == 0)
      return 1;
    return number*factorial(number-1);
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner( System.in );
    System.out.print("Enter number : ");
    int value = scanner.nextInt();
    System.out.println("the factoial is :"+ factorial(value));
  }
}
