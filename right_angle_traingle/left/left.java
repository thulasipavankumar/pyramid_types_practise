import java.util.Scanner;
public class equilateral {
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter the  number of line to print: ");
        int num = scan.nextInt();
        scan.close();
    }
    public static void printPattern(int n){
        
        for(int i=1;i<=n;i++){
            String lineToPrint = "";
            for(int j=1;j<=i;j--){
                lineToPrint = lineToPrint+""+i;
            }
            System.out.println(lineToPrint);
        
        }
    }
}
