import java.util.Scanner;
import java.util.Random;

class game{
     int systemnumber;
     int inputnumber;
     int numberofguess=0;
      game(){
          Random rn = new Random();
          this.systemnumber = rn.nextInt(1,50);
    }
    public void takeuserinput(){
        System.out.print("GUESS THE NUMBER:");
        Scanner sc = new Scanner(System.in);
        inputnumber = sc.nextInt();
    }

    boolean iscorrect(){
        numberofguess++;
        if(inputnumber == systemnumber) {
            System.out.format("YOU GOT IT IN %d attempts.",numberofguess);
            return true;
        }
        else if (inputnumber > systemnumber) {
            System.out.println("TOO HIGH");
        }
        else {
            System.out.println("TOO LESS");
        }
        return false;
    }


}

// USING CONSTRUCTORS, METHODS & CLASS;

public class Guess_the_Number {
    public static void main(String[] args) {
        /*
        Create a class Game, which allows a user to play "Guess the Number"
        game once. Game should have the following methods:
        1. Constructor to generate the random number
        2. takeUserInput() to take a user input of number
        3. isCorrectNumber() to detect whether the number entered by the user is true
        4. getter and setter for no0fGuesses
        Use properties such as no0fGuesses(int), to get this task done!
        */
        game g = new game();
        boolean b = false;
        while (!b) {
            g.takeuserinput();
            b = g.iscorrect();
        }

    }
}

//ITERATIVE
/*
import java.util.Scanner;
import java.util.Random;

public class Guess_the_Number {
    public static void main(String[] args) {
        int inputvalue, guesscount, randomvalue;
        boolean value = false;
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);
        randomvalue = rn.nextInt(1, 50);
        guesscount = 0;
        while (!value) {
            guesscount++;
            System.out.print("ENTER THE NUMBER:");

            inputvalue = sc.nextInt();
            if (inputvalue == randomvalue) {
                value = true;
            } else if (inputvalue > randomvalue) {
                System.out.println("TOO HIGH");
            } else
                System.out.println("TOO LOW");
        }
        System.out.println("YOU GUESED IN "+ guesscount +"ATTEMPTS");
    }
}

 */
