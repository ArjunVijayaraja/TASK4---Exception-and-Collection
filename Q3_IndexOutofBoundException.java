package ExceptionAndCollection;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3_IndexOutofBoundException {
    Scanner scanObj = new Scanner(System.in);
    String [] weekDays = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

    public static void main(String[] args) {
        Q3_IndexOutofBoundException q3 = new Q3_IndexOutofBoundException();
        q3.getWeekDay();
    }

    public void getWeekDay(){
        try {
            System.out.println("Enter a number (Day Position) between 0 to 6 : ");
            int i = scanObj.nextInt();
            System.out.println("The Respective Day name : " + weekDays[i]);

        }catch (IndexOutOfBoundsException e){
            System.out.println("Enter a number (Day position) between 0 and 6.");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
