package school.mjc.stage0.conditions.task1;

import java.util.Scanner;

public class PositiveNumberDeterminer {
    public void isPositive(int numberToBeDetermined) {
        if(numberToBeDetermined>0){
            System.out.println("Number is positive");
    }else {
            System.out.println("Number is negative");
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number ");
        int number=input.nextInt();

        PositiveNumberDeterminer positiveNumberDeterminer=new PositiveNumberDeterminer();
        positiveNumberDeterminer.isPositive(number);
    }
}
