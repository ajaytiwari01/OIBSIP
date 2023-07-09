import java.util.Scanner;
public class guessinggame{
	public static void guessingnumber()
	{
     Scanner scan=new Scanner(System.in);
     int number= 1+(int)(100*Math.random());
     int chance=5; // NUMBER OF TRAILS GIVEN TO GUESS THE NUMBER
     int i,guessnumber;
     System.out.println(" NUMBER GUESSING GAME ");
     System.out.println(" A NUMBER IS IN BETWEEN 1 TO 100 " + " GUESS THE NUMBER " + " WITHIN 5 TRAILS ");
     for(i=0;i<chance;i++)
     {
     	System.out.println("GUESS THE NUMBER :- ");
     	guessnumber=scan.nextInt();
     	if(number==guessnumber)
     	{
     		System.out.println(" GREAT!! "+" YOU GUESSED IT RIGHT ");
     		break;
     	}
     	else if(number> guessnumber && i!=chance-1)
     	{
     		System.out.println(" THE NUMBER IS GREATER THAN " +guessnumber);
     	}
        else if(number<guessnumber && i!=chance-1)
        {
            System.out.println(" THE NUMBER IS LESS THAN " +guessnumber);
        }

     }

     if(i==chance)
     {
        System.out.println(" Oops!! "+" YOU COULD NOT GUESS THE NUMBER ");
        System.out.println(" THE NUMBER IS = " +number);
        
     }
     //System.out.println("NUMBER OF TRAILS TAKEN TO GUESS THE NUMBER = "+i);
     switch(i){
     case(0):
        System.out.println(" YOUR SCORE IS = 10 ");
        break;
     case(1):
        System.out.println(" YOUR SCORE IS = 8 ");
        break;
     case(2):
        System.out.println(" YOUR SCORE IS = 6 ");
        break;
     case(3):
        System.out.println(" YOUR SCORE IS = 4 ");
        break;
     case (4):
        System.out.println("YOUR SCORE IS = 2 ");
        break;
    case(5):
        System.out.println("YOUR SCORE IS = 0 ");
        break;
     }
     System.out.println("TO PLAY AGAIN PRESS 1 ");
     int j =scan.nextInt();
     if(j==1)
     {
        guessingnumber();
     }
     else
     {
        System.out.println("THANK YOU FOR PLAYING");
        System.exit(0);
     }
 }

public static void main(String[] args)
{
    guessingnumber();
} 

}
