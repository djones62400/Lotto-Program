import java.util.Scanner;
import java.util.Random;
public class Lottoprototype3{
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        //declare all random variables
        int Num1 = (int) (Math.random()*50);    
        int Num2 = (int) (Math.random()*50);
        int Num3 = (int) (Math.random()*50);
        int Num4 = (int) (Math.random()*50);
        int Num5 = (int) (Math.random()*50);
        int Num6 = (int) (Math.random()*50);
        int Num7 = (int) (Math.random()*50);
        int count = 0; //used for the while loop in looping the program until all 7 numbers have been entered
        int counter = 0;// used to count the amount of matches in the if statement
        String ord = "";// stores the 'st' in '1st', the 'nd' in '2nd' etc
        int guess; //the numbers the user inputs
        String phrase = "";//the switch case phrase to add on o inform how much the user won
        while (count!=7){
        count=count+1;  //program counter
        switch(count){ //uses the counter in order to know if it needs a 'st' for 1, a 'nd' for 2 etc.
            case 1: ord="st";// needs case 1 as case 0 is impossible as the counter will always be above 1
            break;
            case 2: ord="nd";
            break;
            case 3: ord="rd";
            break;
            case 4: ord="th";
            break;
            case 5: ord="th";
            break;
            case 6: ord="th";
            break;
            case 7: ord="th"; 
            break;
        }    
        System.out.println("Please enter "+count+ord+" number");// user input plus the ordinal indicator
        guess = input.nextInt(); //stored as 'guess'
        if (guess<1 || guess>49){
            System.out.println("Invalid entry, please re enter the numbers"); // checks to see if the user variables are correctly entered
            System.exit(1);//force exits the system
        }
        if (guess == Num1 || guess == Num2 || guess == Num3 || guess == Num4 || guess == Num5 ||guess == Num6 || guess == Num7){
                counter=counter+1; //counter is used to tally up the amount of matches and then can be taken to the switch case to declare the winnings
            }
        switch (counter){
            case 0: phrase = "£0";
            break;                      // can start at case 0 as there is an option for no matches
            case 1: phrase = "£0";
            break;
            case 2: phrase = "£0";
            break;
            case 3: phrase = "£10!";
            break;
            case 4: phrase = "£100!";
            break;
            case 5: phrase = "£10,000!";
            break;
            case 6: phrase = "£1,000,000!";
            break;
        }
        
    }
    System.out.println("You won "+phrase);// outputs winnings
}
}
                
          