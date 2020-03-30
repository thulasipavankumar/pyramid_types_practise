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
            String spaces = "";
            for(int j=n;j>i;j--){
                spaces = spaces+" ";
            }
            System.out.println(spaces+""+i);
        
        }
    }
}
