import java.util.Scanner; //Scanner code//
class Main { //beginning//
  public static void main(String[] args) {

  //First Scanner//
  Scanner scan = new Scanner(System.in);

  //Number of seats//
  int[] seatNums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
  String[] studNames = new String[15]; //Code that prints the names 15 times//
  
  //Code for student names//

  System.out.println("Enter 15 Random Students Names..");
  for(int a = 0; a < 15; a++)//Code for 15 lines of names//
  {
    String namesStud = scan.next();
    studNames[a] = namesStud;
  }






  }
}