import java.util.Scanner;
class details{
    public static void main(String args[]){
        Scanner detail=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=detail.nextLine();
        System.out.print("Enter your age: ");
        int age=detail.nextInt();
        detail.nextLine();
        System.out.print("Enter your college name:");
        String college=detail.nextLine();
        System.out.print("Enter your mail id: ");
        String mailid=detail.nextLine();
        System.out.print("Enter your department name: ");
        String dept=detail.nextLine();
    }
}