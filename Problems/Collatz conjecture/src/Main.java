import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(n);
        while(n!=1)
        {
            if(n %2==1)
            {
                n=(3*n)+1;
            }else
            {
                n=n/2;
            }
            System.out.println(" "+n);
        }

        // put your code here
    }
}