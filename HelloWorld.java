// import java.util.Scanner;  

// public class SumOfTwoNumbers {  
//     public static void main(String[] args) {  
//         // Create a Scanner object to read input from the user  
//         Scanner (name) = new Scanner(System.in);  
        
//         // Prompt the user to enter the first number  
//         System.out.print("Enter the first number: ");  
//         int num1 = scanner.nextInt();  
        
//         // Prompt the user to enter the second number  
//         System.out.print("Enter the second number: ");  
//         int num2 = scanner.nextInt();  
        
//         // Calculate the sum of the two numbers  
//         int sum = num1 + num2;  
        
//         // Print the result  
//         System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);  
        
//         // Close the scanner  
//         scanner.close();  
//     }  
// }

// import java.util.*;
import java.util.Scanner;
public class HelloWorld {  
    public static void main(String[] args) {  
        // Print "Hello, World!" to the console  
        // System.out.println("Hello, World!"); 
        // int x = 10;
        // int y = 10;
        // int z = 3;
        // if (x>y&&x>z) {
        //     System.out.println("x");
        // }
        // else if (y>x&&y>z){
        //     System.out.println("y");
        // }
        // else{
        //     System.out.println("z");
        // }
        

        Scanner sc = new Scanner(System.in);
        // int num1 = sc.nextInt();
        // if(num1>=80 && num1<90){
        //     System.out.println("A");
        // }
        // else if(num1>=60 && num1<70){
        //     System.out.println("B");
        // }
        // else if(num1>=50 && num1<60){
        //     System.out.println("C");
        // }
        // else{
        //     System.out.println("Fail");
        // }

        // for(int i = 2;i<=20;i+=2){
        //     System.out.println(i);
        // }



        // int odd = 0;
        // int even = 0;
        // int num1 = sc.nextInt();
        // for(int i = 1;i<=num1;i++){
        //     if(i%2==0){
        //         even+=1;
        //         System.out.println("even" + i);
        //     }
        //     else{
        //         odd+=1;
        //         System.out.println("odd" + i);
        //     }
        // }
        // System.out.println("even = "+ even);
        // System.out.println("odd = "+ odd);




        // int n = sc.nextInt();
        // int n1 = sc.nextInt();
        // // System.out.println(n&n1);
        // // System.out.println(n^n1);

        // n = n1^n;
        // n1 = n1^n;
        // n = n1^n;
        
        // System.out.println(n);
        // System.out.println(n1);



        // //program of sum and sub 
        // int n = sc.nextInt();
        // int n1 = sc.nextInt();
        // String argu = sc.next();

        // switch (argu){
        //     case "+":{
        //         System.out.println(n+n1);
        //     }
        //     break;
        //     case "-":{
        //         System.out.println(n-n1);
        //     }
        // }


// //sum of even no. without using is else in loop
//         int n = sc.nextInt();
//         int sum = 0;
//         for(int i = 0;i<=n ; i+=2){
//             // System.out.println(i);
//             sum +=i;
//         }
//         System.out.println(sum);
//     }  
// }




// //sum of even no. without using is else in loop
//             int n = sc.nextInt();
//             int sum = 0;
//             for(int i = 1;i<=n ; i+=2){
//                 // System.out.println(i);
//                 sum +=i;
//             }
//             System.out.println(sum);




// //sum of /'n' no. 
//             int n = sc.nextInt();
//             int sum = 0;

//             for(int i = 1;i<=n ; i++){
//                 // System.out.println(i);
//                 sum +=i;
//             }
//             System.out.println(sum);




//factorial
                // int fac = 1;
                // int n = sc.nextInt();
                // for(int i = 1;i<=n;i++){
                //     fac*=i;
                // }
                // System.out.println(fac);



// prime no. 
                // int n = sc.nextInt();
                // for(int i = 2;i<n;i++){
                //     if(n%i==0){
                //         System.out.println("not prime");
                //         break;
                //     }
                //     else{
                //         System.out.println("prime");
                //         break;
                //     }
                // }





        // reverse of digit using while loop
                // int n = sc.nextInt();
                // int n2 = 0;
                // while(n!=0){
                //     n2 = n2*10 + (n%10);
                //     n/=10;
                // }
                // System.err.println(n2);
                
                
                
        // reverse  of digit using for loop
                // int n = sc.nextInt();
                // int n2 = 0;
                // int count = 0;
                // for(int i = n ;i!=0;i/=10){
                //     n2 = n2*10 + (i%10);
                //     count++;
                // }
                // System.err.println(n2);
                // System.err.println(count);




            // count no. of 1
                // int n = sc.nextInt();
                // int count = 0;
                // int n2 = 0;
                // while(n!=0){
                    
                //     n2 = n%10;
                //     if(n2 == 1){
                //         count++;
                //     }
                //     else{
                //         n2 = 0;
                //     }
                //     n/=10;
                // }
                // System.out.println(count);




            // reverse the no. and if there is 2 in digit replace it with 5
                //  int n = sc.nextInt();
                // int n2 = 0;
                // int rem = 0;
                // while(n!=0){
                //     rem = n%10;
                //     if(rem == 2){
                //         rem = 5;
                //     }
                //     n2 = n2*10 + rem;
                //     n/=10;
                // }
                // System.err.println(n2);




                // int n = sc.nextInt();
                // boolean bol = true;
                // for(int i = 1;i<=n/2;i++){
                //     if(i*i == n){
                //         // System.out.println("perfect sqaure");
                //         bol = true;
                //         break;
                //     }
                //     else{
                //         bol = false;
                //     }

                // }
                // if(bol == true){
                //     System.out.println("perfect sqaure");   
                // }
                // else{
                //     System.out.println("not perfect sqaure");
                // }



                

                



    }  
}