import java.util.Scanner;
class Main { //Start//
  public static void main(String[] args) {

    //Beginning scanner//
    Scanner scan = new Scanner(System.in);

    //Number of seats//
    int[] rowNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    String[] studNames = new String[15]; //Names printed 15 times//

    //Print statement for the 15 names//

    System.out.println("\nEnter 15 different student names.\n");
    for (int a = 0; a < 15; a++)
    {
      String namesStud = scan.next();
      studNames[a] =namesStud;
    }

    int s = 0;
    //Print statement for what row a student is in// 
    while (s < 15) {
      System.out.println(studNames[s] + " is on square number " + rowNumber[s]);
      s++;
    }

    System.out.println("\nThank you for your time!\n");
    System.out.println("The End");
  }
}