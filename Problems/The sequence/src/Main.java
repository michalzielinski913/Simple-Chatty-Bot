import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int div=n;
        while (scanner.hasNext()) {
            if (n % 4 == 0) {
                if (n > div) {
                    div = n;
                }
            }

            n = scanner.nextInt();
        }
        System.out.println(div);
        // put your code here
    }
}