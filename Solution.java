import java.util.*;


public class Solution {



    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n ; 
        
        n = input.nextInt();
        
        if(n%2!=0 && n<=100) {
            System.out.println("Weird");
        }
        else if(n%2==0 && n<=100) {
            if(n>=2 && n<=5) {
                System.out.println("Not Weird");
            }
            else if(n>=6 && n<=20) {
                System.out.println("Weird");
            }
            else if(n>20) {
                System.out.println("Not Weird");
            }
        }
        
        
    }
}