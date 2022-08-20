import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        while(true){
            System.out.println("Choose action:");
            System.out.println("1: do +");
            System.out.println("2: do -");
            System.out.println("3: do *");
            System.out.println("4: do /");
            System.out.println("5: Exit");
            int action = console.nextInt();

            //Check user choose. If choose 5 - programm is finished.

            if(action == 5){
                System.out.println("Programm is finished");
                break;
            }

            System.out.println("First number");
            int fNumber = console.nextInt();
            System.out.println("Second number");
            int sNumber = console.nextInt();
            if(action == 1){
                System.out.println(fNumber+sNumber);
            } else if(action == 2){
                System.out.println(fNumber-sNumber);
            } else if(action == 3){
                System.out.println(fNumber*sNumber);
            } else if(action == 4){
                System.out.println(fNumber/sNumber);
            }
        }
    }

}


