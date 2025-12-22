import java.util.Scanner;
public class password{
    public void disp(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an even number:");
        int i=sc.nextInt();
        while(i%2!=0){
            System.out.println("Not an even number! Please try again");
            System.out.print("Enter an even number:");
            i=sc.nextInt();
        }
        System.out.print("Valid even number:" + i);
    }
    public static void main(String args[]){
        password even = new password();
        even.disp();
    }
}