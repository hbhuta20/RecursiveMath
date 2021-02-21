import java.util.Scanner; //This is how we accesss the library for scanner
class Main { // This is the main class
  public static void main(String[] args) { //This is the main method 
    Scanner scan = new Scanner (System.in); // Initialize the scanner
    System.out.println("Enter your Number : ");
    int input = scan.nextInt(); // read the integer input 
    System.out.println("Order of Magnitude is : " + recursiveOrderOfMagnitude(input)); // print out the order of magnitude
    System.out.println("Have a great day :)");
}
  static int recursiveOrderOfMagnitude(int num){ // recusive method to find the order of magnitude 
    if (num <= 100) { // base case 
      return 1;
    }else{
      int divisor = 10; 
      return 1+recursiveOrderOfMagnitude(num / divisor); //recursive call
    }
  }
}