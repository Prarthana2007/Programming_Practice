public class loop{
    public void rightside(){
        System.out.println("Right angle triangle:");
        for(int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void leftside(){
        System.out.println("Left angle triangle:");
        for(int i=1;i<=5;i++) {
            for (int k=1;k<5-i;k++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main (String args[]){
        loop disp=new loop();
        disp.rightside();
        disp.leftside();
    }
}