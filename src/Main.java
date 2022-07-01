import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double number1, number2 ;
        int select;
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the first number :");
        number1= inp.nextDouble();

        System.out.print("Enter the second number :");
        number2= inp.nextDouble();

        System.out.println(" Additon=1 \n Subtraction=2 \n Multiplication=3 \n Divison=4");
        System.out.print("Select the number you want to calculate = ");
        select= inp.nextInt();


        switch (select){
            case 1:
                System.out.println(number1+number2);
                break;
            case 2:
                System.out.println(number1-number2);
                break;
            case 3:
                System.out.println(number1*number2);
                break;
            case 4:
                if ((number1==0)||(number2==0)) {
                    System.out.println("You can't divide using 0 (zero)");
                }else{  System.out.println(number1/number2);}
                break;
                default:
                System.out.println("You selected  an invalid number. Choose the numbers from 1 to 4.");
        }

    }
}
