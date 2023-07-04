import java.util.Arrays;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        collectUserInput();
    }
    private static  int numberOfStudent;
    private static int  numberOfSubject;
    private static int [][] studentInfo;
   private static int [][] totals;
   private static  int [] total;
   private static double [][] average ;

    private static Scanner userInput = new Scanner(System.in);
    public static void display(String message){
        System.out.println(message);
    }
    public static String input(String messages){
        display(messages);
        return userInput.nextLine();
    }
    private static void collectUserInput(){
   String  numberOfStudents = input("How many students do you have?");
   String  noOfSubject = input("How many subject do they offer?");
   numberOfStudent = Integer.parseInt(numberOfStudents);
    numberOfSubject = Integer.parseInt(noOfSubject);
     saving();
     System.out.println("\nSaved successfully\n");
     collectInput(numberOfStudent,numberOfSubject);
    }
    private static void collectInput(int numberOfStudent,int numberOfSubject){
        studentInfo = new int [numberOfStudent][numberOfSubject];
        //total = new int[num]
        for (int count = 1; count <= numberOfStudent; count++ ){
            for (int counts = 1;counts <= numberOfSubject; counts++) {
                System.out.println("Entering score for student"+ count);
                System.out.println("Enter score for subject"+ counts);
                int score = userInput.nextInt();
                saving();
                System.out.println("\nSaved successfully\n");
//                total[numberOfStudent] += score;
//                average[numberOfStudent] = (double) total / numberOfSubject;
//                average = (double) total / numberOfSubject;
             //   for (int count)
                total[count] += score;
                average[count][counts] = (double) score / numberOfSubject;
                System.out.println(Arrays.toString(total));
                System.out.println(Arrays.toString(average));

            }
        }
        int counts;
        for (int count = 0;count < numberOfStudent;count++){
            counts = 0;
            for (int counter = 0;counter < numberOfSubject;counter++){
                counts = counts+ studentInfo[count][counter];
            }
            //total[count][counts] = counts;
            average[count][0] = ((counts +  0.0) / numberOfSubject);
//            System.out.println(Arrays.toString(total));
//            System.out.println(Arrays.toString(average));

        }
    }

    public static void decoratingPattern(){
        display("""
                --------------------------------------------------------
                --------------------------------------------------------
                STUDENT\tSUB1\tS""");
    }


    private static void saving(){
        System.out.print("Saving ");
        for (int count = 0; count <= 6;count++){
            System.out.print(">");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }



}

