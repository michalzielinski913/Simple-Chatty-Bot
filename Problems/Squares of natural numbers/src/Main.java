import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();
        for(int i=1;i<=N;i++)
        {
            if((i*i)<=N)
            {
                System.out.println(i*i);
            }else
            {
                break;
            }
        }
        // put your code here
    }
}