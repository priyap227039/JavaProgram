import java.util.Scanner;
public class simpleCalculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number ");
        int num1=sc.nextInt();
        System.out.println("enter Second number ");
        int num2=sc.nextInt();
        System.out.println("enter any operator(+, -, *, /, %): ");

        String opt=sc.next();
        switch(opt){
            case "+":
                System.out.println("The sum of two numbers is "+(num1+num2));
                break;
            
             case "-":
                System.out.println("The difference between two numbers is "+(num1-num2));
                break;
            
             case "*":
                System.out.println("The product of two numbers is "+(num1*num2));
                break;
            
             case "/":
                if (num2 != 0)
                    System.out.println("Division = " + (num1 / num2));
                else
                    System.out.println("Cannot divide by zero");
                break;
            
             case "%":
                System.out.println("The module of two numbers is "+(num1%num2));
                break;

            default:
                System.out.println("Inavlid operator");    
        }
        sc.close();
    }
}
            

        

        


    
