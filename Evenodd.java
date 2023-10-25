import java.util.Scanner;
public class Evenodd{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;
        for(int i=0;i<=n;i++){
        if(i%2==0){
            System.out.println("Even Number");
        } else{
            if(i%2!=0){
                System.out.println("Odd Number");
            }
        }
    }
}
}