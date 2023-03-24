import java.util.Scanner;

public class ProbableTopperNumberOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the registration number");
        String registrationNumber = scanner.nextLine();
        int evenCount = 0;
        int oddCount = 0;
        for (int iterator = 0; iterator < registrationNumber.length(); iterator++) {
            int digit = registrationNumber.charAt(iterator) - '0';
            if (digit % 2 == 0) {
                evenCount = evenCount + digit;
            } else {
                oddCount = oddCount + digit;
            }
        }
        if (evenCount == oddCount) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }

}