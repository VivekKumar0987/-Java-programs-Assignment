import java.util.Scanner;


class Factorial{  
    public static void main(String args[]){  
     int i;
     int sum=0;
     int digit=0;
     int  fact=1;  
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number");
     int number = sc.nextInt();  
     
     for(i=1;i<=number;i++){    
         fact=fact*i;    
     }    
     System.out.println("Factorial of "+number+" is: "+fact);    
     
    int num=fact;
    
    while(num > 0)  
    {  
    //finds the last digit of the given number    
    digit = num % 10;  
    //adds last digit to the variable sum  
    sum = sum + digit;  
    //removes the last digit from the number  
    num = num / 10;  
    }  
    //prints the result  
    System.out.println("Sum of Digits: "+sum);      
    }  
}
     