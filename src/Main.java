import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    /*
            (----------------Question 1------------)
        Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
        two numbers , takes two numbers as input
                (------------Solution----------)
        System.out.println("Enter number 1 ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2 ");
        int num2 = in.nextInt();
        System.out.println(num1 + " + " + num2 + " = "+ (num1 + num2 ));
        System.out.println(num1 + " - " + num2 + " = "+ (num1 - num2 ));
        System.out.println(num1 + " * " + num2 + " = "+ (num1 * num2 ));
        System.out.println(num1 + " / " + num2 + " = "+ (num1 / num2 ));
        System.out.println(num1 + " % " + num2 + " = "+ (num1 % num2 ));
     */
        /*
            (----------------Question 2------------)
Write a Java program that takes a number as input and prints
 its multiplication table up to 10.
                (------------Solution----------)
            System.out.println("Enter a Number");
            int num = in.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " * " + i + " = "+ (num * i ));
            }
     */



        /*
            (----------------Question 3------------)
Write a Java program to print the area and perimeter of a circle
                (------------Solution----------)
        System.out.println("Enter a Radius : ");
        double radius = in.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        double circle = Math.PI * Math.pow(radius,2);
        System.out.println("perimeter is = "+ perimeter);
        System.out.println("circle is = "+ circle);
     */


        /*
            (----------------Question 4------------)
Java program to find out the average of a set of integers
                (------------Solution----------)
        //  consider a set is only 6 numbers .
        float sum = 0 ;
        for (int i = 0; i < 6; i++) {
            System.out.println("enter an integer");
            int num = in.nextInt();
            sum += num;
        }
        System.out.println("Average = "+(sum/6));
     */


        /*
            (----------------Question 5------------)
          Write a Java program that accepts three integers as input, adds the first two integers
          together, and then determines whether the sum is equal to the third integer.
                (------------Solution----------)
        System.out.println("Enter number one :");
        int num1 = in.nextInt();
        System.out.println("Enter number one :");
        int num2 = in.nextInt();
        System.out.println("Enter number one :");
        int num3 = in.nextInt();
        boolean checker = false;
        if(num1 + num2 == num3){
            checker = true;
        }
        System.out.println("The result is : "+ checker);
     */

        /*
            (----------------Question 6------------)
            Write a Java program to reverse a word.
                (------------Solution----------)
        System.out.println("Enter a Word");
        String word = in.nextLine();
        StringBuilder sb = new StringBuilder(word);
        System.out.println(word +"   --> Reversed -->   "+sb.reverse());
     */


        /*
            (----------------Question 7------------)
        Java program to check whether the given number is even or odd
                (------------Solution----------)
        System.out.println("enter a number : ");
        int num = in.nextInt();
        System.out.println((num%2==0)?"the number is Even":"the number is Odd");
     */

        /*
            (----------------Question 8------------)
         Java program to convert the temperature in Centigrade to Fahrenheit
                (------------Solution----------)
        System.out.println("Enter temperature in °C: ");
        double centigrade = in.nextFloat();
        //°F = (°C * 9.0/5.0) + 32.0
        System.out.println("Temperature in °F is : "+((centigrade*(9.0/5.0))+32.0));
     */



        /*
            (----------------Question 9------------)
            .Write a Java program that takes a string and a number from the user,then prints the
             character in the given index
                (------------Solution----------)
        System.out.println("Enter a sentence");
        String sentence = in.nextLine();
        System.out.println("Enter a index");
        int index = in.nextInt();
        System.out.println(sentence.charAt(index));
     */


        /*
            (----------------Question 10------------)
        Write a Java program to print the area and perimeter of a rectangle
                (------------Solution----------)
        System.out.println("Enter a width : ");
        double width = in.nextDouble();
        System.out.println("Enter a length : ");
        double length = in.nextDouble();
        double perimeter = 2 * (width + length);
        double area = (width * length);
        System.out.println("Perimeter is = "+ perimeter);
        System.out.println("Area is = "+ area);
     */

        /*
            (----------------Question 11------------)
            Write a Java program to compare two numbers
                (------------Solution----------)
        System.out.println("Enter all number 1 ");
        int num1 = in.nextInt();
        System.out.println("Enter all number 2 ");
        int num2 = in.nextInt();
        if(num1 == num2){
            System.out.println(num1 +" = " +num2);
        }else if(num1 > num2){
            System.out.println(num1 +" != "+num2);
            System.out.println(num1 +" > "+num2);
            System.out.println(num1 +" >= " +num2);

        }else{
            System.out.println(num1 +" != "+num2);
            System.out.println(num1+" < "+num2);
            System.out.println(num1 +" <= " +num2);

        }
     */


        /*
            (----------------Question 12------------)
    Write a Java program to convert seconds to hours, minutes and seconds.
                (------------Solution----------)
        System.out.println("Enter a seconds : ");
        int totalSec = in.nextInt();
        int hours = totalSec/3600 ;
        int remainingSecondAfterHours = totalSec % 3600 ;
        int min = remainingSecondAfterHours / 60;
        int seconds = remainingSecondAfterHours % 60;
        System.out.println(hours+":"+min+":"+seconds);
     */


        /*
            (----------------Question 13------------)
    Write a Java program that accepts four integers from the user and prints equal if all
    four are equal, and not equal otherwise.
                (------------Solution----------)
        System.out.println("enter number 1 ");
        int num1 = in.nextInt();
        System.out.println("enter number 2 ");
        int num2 = in.nextInt();
        System.out.println("enter number 3 ");
        int num3 = in.nextInt();
        System.out.println("enter number 4 ");
        int num4 = in.nextInt();
        if(num1 == num2 && num2 == num3 && num3 == num4 ){
        System.out.println((num1 == num2 && num2 == num3 && num3 == num4 ) ? "it's equals numbers":"it's not equals numbers");
     */

        /*
            (----------------Question 14------------)
    Write a Java program that reads an integer and check whether it is negative, zero, or positive
                (------------Solution----------)
        System.out.println("enter a number ");
        int num1 = in.nextInt();
        if(num1 == 0 ){
            System.out.println("it's zero ");
        }else if(num1>0) {
            System.out.println("positive Number");
        }else{
            System.out.println("negative Number");
        }
     */


        /*
                (----------------Question 15------------)
                Write a program to enter the numbers till the user wants and at the end it
                should display the count of positive, negative and zeros entered (End loop use -1 ,
                Don’t count -1).
                (------------Solution----------)
                System.out.println("Enter Number , (End the program use -1, the -1 not counted)");
                int user = 0 ;
                int zeroCount = 0 ;
                int positiveCount = 0 ;
                int negativeCount = 0 ;
                while(user != -1){

                    user = in.nextInt();

                    if(user == -1){
                        //to break the loop if user entered -1 , and exit the program without count -1 .
                        break;
                    }
                    if(user == 0 ){
                        zeroCount++;
                    } else if (user > 0) {
                        positiveCount++;
                    }else{
                        negativeCount++;
                    }
                }
                System.out.println("positive counter = "+positiveCount);
                System.out.println("negative counter = "+negativeCount);
                System.out.println("zero counter = "+zeroCount);
     */


        /*
            (----------------Question 16------------)
        Write a program that prompts the user to input an integer and then outputs the
        number with the digits reversed.
                (------------Solution----------)
        System.out.println("enter a number");
        int userNumber = in.nextInt();

        while(userNumber > 0 ){
            int digit = userNumber % 10 ;
            System.out.print(digit + " ");
            userNumber = userNumber/10;
        }
     */

        /*
            (----------------Question 17------------)
        Write a program to enter the numbers till the user wants and at the end the
        program should display the largest and smallest numbers entered.
                (------------Solution----------)
         int user = 0 ;
        int largest = 0 ;
        int smallest = 0 ;
        System.out.println("Enter any numbers you want and to Exit the program press (0) ");
        do{
            System.out.println("enter the number");
            user = in.nextInt() ;
            if(user > largest ){
                largest = user ;
            } else if (user < smallest) {
                smallest = user;
            }
        }while(user != 0);
        System.out.println("largest number : " + largest);
        System.out.println("smallest number : " + smallest);

     */


        /*
            (----------------Question 18------------)
        Determine and print the number of times the character ‘a’ appears in the input
        entered by the user.
                (------------Solution----------)
            System.out.println("enter a statement ");
            String s = in.nextLine();
            int counterA = 0 ;
            for (int i = 0; i < s.length()-1; i++) {
                if(s.charAt(i) == ('a')){
                    counterA++;
                }
            }
            System.out.println(": Number of a's : "+counterA);

     */


    }
}