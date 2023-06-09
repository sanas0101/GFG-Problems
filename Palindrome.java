import java.util.*;
public class Palindrome{

    public static void main(String [] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter word");
       String word=sc.next();
       System.out.println();
       
       boolean isPalindrome=true;
       for(int i=0;i<word.length()/2;i++)
       {
           if(word.charAt(i)!=word.charAt(word.length()-1-i)){
           isPalindrome=false;
           break;
           }
       }
       if(isPalindrome){
       System.out.println("It's Palindrome");}
       else{
        System.out.println("It's not Palindrome");
       }
       
    }
    
}