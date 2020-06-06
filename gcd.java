import java.io.*; 
import java.util.Scanner;
class gcd { 
      
    // Function to check if it is possible 
    // to convert the string into palindrome 
    static boolean checkPalindrome(String str){ 
      
    int n = str.length();      
  
    // Counting number of characters  
    // that should be changed. 
    int count = 0; 
      
    for (int i = 0; i < n/2; ++i) 
      
        if (str.charAt(i) != str.charAt(n - i - 1))  
            ++count; 
      
    // If count of changes is less than 
    // or equal to 1 
    return (count <= 1); 
    } 
      
// Driver Function     
public static void main(String[] args) { 
      Scanner sc=new Scanner (System.in);
    String str = sc.nextLine();  
          
    if (checkPalindrome(str)) 
      
        System.out.println(0); 
    else
        System.out.println(1); 
          
    } 
      
}