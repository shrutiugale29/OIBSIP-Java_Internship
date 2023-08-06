import java.util.*;

class GuessingGame {
    public static void main(String args[]) 
    {
        // generating random number
        Random rand = new Random();
        int no = rand.nextInt(100);

        int guessno,attempt=0,choice=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t\t\t....Welcome to Number Guessing Game....\n");
        
        while(choice==1)
        {
        System.out.println("\n1. Start the Game \n2. Exit");
        System.out.print("Enter your choice : ");
        choice = sc.nextInt();
        switch(choice)
        {
            case 1 :
                System.out.println("Guess number between 1 - 100 \n\t You will have 10 attempts!\n\n\t\t\tBest Of Luck!\n");

                do {
                    //Take user guesses
                    System.out.print("\n\tEnter Your Guess number : ");
                    guessno = sc.nextInt();

                    if (guessno == no) 
                    {
                        System.out.println("\n\n\t\t\tCongratulations...! You guess the number " + no +" in " + attempt + " guesses");

                        System.out.println("\n\t1. Next Round\n\t2. exit\n");
                        
                    } 
                    else if (guessno < no) 
                    {
                        System.out.println("\n\tGuess Higher...\n");
                    } 
                    else if (guessno > no) 
                    {
                        System.out.println("\n\tGuess Lower...\n");

                    }
                    attempt++;
                    if(attempt==10)
                    {
                        System.out.print("\nYou have done maximum attempt...  Try Again..! \n\n");
                        break;
                    }
                } while (guessno != no);
        
       
            switch(attempt) 
            {
                    case 1:
                    System.out.println("\n\t\tYour score is 100");
                    break;
                    case 2:
                    System.out.println("\n\t\tYour score is 90");
                    break;
                    case 3:
                    System.out.println("\n\t\tYour score is 80");
                    break;
                    case 4:
                    System.out.println("\n\t\tYour score is 70");
                    break;
                    case 5:
                    System.out.println("\n\t\tYour score is 60");
                    break;
                    case 6:
                    System.out.println("\n\t\tYour score is 50");
                    break;
                    case 7:
                    System.out.println("\n\t\tYour score is 40");
                    break;
                    case 8:
                    System.out.println("\n\t\tYour score is 30");
                    break;
                    case 9:
                    System.out.println("\n\t\tYour score is 20");
                    break;
                    case 10:
                    System.out.println("\n\t\tYour score is 10");
                    break;
                }
                break;
            
            case 2 :
                    System.out.println("Exiting...");
                    break;

            default :
                System.out.println("\nEnter valid choice!!");
                break;
        }
    }
        
    }
}