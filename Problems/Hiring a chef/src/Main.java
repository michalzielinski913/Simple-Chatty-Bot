import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.next();
        int age = scanner.nextInt();
        String education = scanner.next();
        int yearsOfExperience = scanner.nextInt();
        String cuisinePreference = scanner.next();
        System.out.println("The form for " + nome + " is completed. We will contact you if we need a chef that cooks " + cuisinePreference + " dishes.");


    }
}