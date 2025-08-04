import java.util.*;

public class Calculator
{
    static Scanner sc = new Scanner(System.in);
    public static void add()
    {
        System.out.println("Addition of Numbers:");
        System.out.println("--------------------");

        System.out.println("Enter the number of values to add:");
        int n = sc.nextInt();
        
        double sum =0;
        for(int i =1;i<=n;i++)
        {
            System.out.println("Enter value "+ i + ":");
            double num= sc.nextDouble();
            sum += num;
        }
        
        System.out.println("Addition of numbers is: " + sum);
    }
    
    public static void subtract()
    {
        System.out.println("Subtraction of numbers:");
        System.out.println("-----------------------");
        
        
        System.out.println("Enter the number of values to subtract:");
        int n = sc.nextInt();
        if(n ==0)
        {
            System.out.println("Nothing to subtract");
            return;
        }
       System.out.println("Enter value 1" );
       double sub = sc.nextDouble();

        for(int i =2;i<=n;i++)
        {
            System.out.println("Enter value" + i + ":");
            double num= sc.nextDouble();
            sub -= num;
        }
        System.out.println("Subtraction of numbers is : " + sub);
    }
    
    public static void multiply()
    {
        System.out.println("Multiplication of numbers");
        System.out.println("-------------------------");
        
        System.out.println("Enter the number of values to multiply:");
        int n = sc.nextInt();
        
        double mul= 1;
        for(int i =1;i<=n;i++)
        {
            System.out.println("Enter value " + i + ":");
            double num = sc.nextInt();
            mul = mul*num;
        }
        System.out.println("Multiplication of numbers is : " + mul);
    }
    
    public static void division()
    {
        System.out.println("Division of numbers");
        System.out.println("-------------------");

        System.out.println("Enter the dividend:");
        double n = sc.nextDouble();
        System.out.println("Enter the divisor:");
        double m = sc.nextDouble();
        
        if(m ==0)
        {
            System.out.println("Error: Division is not possible!");
        }
        else
        {
        double div = n/m;
       System.out.println("Divison of numbers is : " + div);
        }
    }
    
    public static void square()
    {
        System.out.println("Square of the number");
        System.out.println("--------------------");
        
        System.out.println("Enter the number:");
        double n = sc.nextDouble();
        
        double squ = n*n;
        System.out.println("Sqaure of the number " + n + " is : " + squ);
    }
    
    public static void squareRoot()
    {
        System.out.println("Square root of the number");
        System.out.println("-------------------------");
        
        System.out.println("Enter the number:");
        double n = sc.nextDouble();
        
        if(n<0)
        {
            System.out.println("Error : Cannot take square root for negative numbers.");
            return ;
        }
        else
        {
            double sq = Math.sqrt(n);
             System.out.println("Sqaure root of number " + n + " is : " + sq);
        }
    }
    
    public static void power()
    {
        System.out.println("Computing power");
        System.out.println("---------------");
        
        System.out.println("Enter the base value:");
        double n = sc.nextInt();
        System.out.println("Enter the exponent value:");
        double m = sc.nextInt();
        
        double res = Math.pow(n, m);
        System.out.println("Result: " + res);
    }
    public static void main(String args[])
    {
    
        boolean valid = true;
        
        while(valid)
        {
            System.out.println("Simple Calculator");
            System.out.println("-----------------");
            System.out.println("Select the operation:");
            System.out.println("1 . Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square of the number");
            System.out.println("6.Square root of the number");
            System.out.println("7. Power");
            System.out.println("8 Exit");
            
            System.out.println("Enter your choice (1-8):");
            int choice = sc.nextInt();
            
            switch(choice)
            {
                case 1 :
                    add();
                    break;
                case 2:
                    subtract();
                    break;
                case 3:
                    multiply();
                    break;
                case 4 :
                    division();
                    break;
                case 5:
                    square();
                    break;
                case 6:
                    squareRoot();
                    break;
                case 7:
                    power();
                    break;
                case 8:
                    valid = false;
                    System.out.println("Exiting calculator!");
                    break;
                default:
                    System.out.println("Invalid choise. Please choose between 1 and 8.");
            }
            System.out.println();
        }
        sc.close();
    }
}