import java.util.Scanner;
class hotel_bill{
    public static void main(String args[]){
        String item1="dosa";
        String item2="chapati";
        String item3="idli";
        String item4="poori";
        int price1=40;
        int price2=40;
        int price3=30;
        int price4=30;
        Scanner sc=new Scanner(System.in);
        System.out.println("MENU:");
        System.out.println("1.Dosa\n2.Chapati\n3.Idli\n4.Poori\n");
        System.out.print("How many " + item1 + " do you need:");
        int quantity1=sc.nextInt();
        int p1=quantity1*price1;
        System.out.println("Item 1 Total price: Rs:"+p1);
        System.out.print("How many " + item2 + " do you need:");
        int quantity2=sc.nextInt();
        int p2=quantity2*price2;
        System.out.println("Item 2 Total price: Rs:"+p2);
        System.out.print("How many "+ item3 + " do you need:");
        int quantity3=sc.nextInt();
        int p3=quantity3*price3;
        System.out.println("Item 3 Total price: Rs:"+p3);
        System.out.print("How many " + item4 + " do you need:");
        int quantity4=sc.nextInt();
        int p4=quantity4*price4;
        System.out.println("Item 4 Total price: Rs:"+p4);
        int subtotal=p1+p2+p3+p4;
        System.out.println("Subtotal: Rs:"+subtotal);
        double gst=0.18*subtotal;
        System.out.println("GST(18%): Rs:"+gst);
        double tax=0.05*subtotal;
        System.out.println("Service Tax(5%): Rs:"+tax);
        double total=subtotal+gst+tax;
        System.out.println("FINAL BILL:\nRs:"+total);
    }
}