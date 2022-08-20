import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class CalculateSetAndGet {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Input output = new Input();

        while(true){
            System.out.println("First number");
            output.firstNum = console.nextInt();
            System.out.println("Second number");
            output.secondNum = console.nextInt();
            System.out.println("Choose action");
            System.out.println("1:+, 2:-, 3:*, 4:/");
            int action = console.nextInt();
            if(action == 1){
                output.resultPlus();
            } else if(action == 2){
                output.resultMinus();
            } else if(action == 3){
                output.resultMultiplication();
            } else if(action == 4){
                output.resultDivision();
            } else {
                break;
            }

        }
    }


}
class Input{
    int firstNum, secondNum;

    public void setFirstNum(int firstNum){

        this.firstNum = firstNum;
    }

    public int getFirstNum(){

        return firstNum;
    }

    public void setSecondNum(int secondNum){

        this.secondNum = secondNum;
    }

    public int getSecondNum(){
        return secondNum;
    }

    public void resultPlus(){
        System.out.println(this.firstNum + this.secondNum);
    }

    public void resultMinus(){
        System.out.println(this.firstNum - this.secondNum);
    }

    public void resultMultiplication(){
        System.out.println(this.firstNum * this.secondNum);
    }

    public void resultDivision(){
        System.out.println(this.firstNum / this.secondNum);
    }
}
