import java.util.Random;

import java.util.Scanner;

public class firstGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
           System.out.println("Enter your choice:rock,paper,scissors ");
        String userChoice=sc.next();
        
        int randomNum=rand.nextInt(3);//0,1,2
        String computerChoice;
        if(randomNum==0)
            computerChoice="rock";
        else if(randomNum==1)
            computerChoice="paper";
        else
             computerChoice="scissor";

        System.out.println("computer choose:"+computerChoice);
        if(userChoice.equals(computerChoice)){
     System.out.println("match draw");
        }
        else if
             ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                 (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                 (userChoice.equals("scissors") && computerChoice.equals("paper")))
        
        {
        
           System.out.println("🎉 Congratulations! You Win! 🎉");
    }
        else{
            System.out.println("computer wins");
        }

sc.close();
     

    }
}
