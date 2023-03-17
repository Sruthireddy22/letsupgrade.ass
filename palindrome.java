import java.util.*;
public class palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        long r,s=0,t;
        t=n;
        while(n>0){
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if(t==s){
            System.out.println("palidrome number.");
        }
        else{
            System.out.println("Not a palindrome.");
        }
    }
}
