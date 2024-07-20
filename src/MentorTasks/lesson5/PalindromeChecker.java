package MentorTasks.lesson5;



//import java.util.Scanner;
//
//public class PalindromeChecker {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter an integer: ");
//       String word = sc.nextLine();
//        StringBuilder palindrome = new StringBuilder(word);
//        System.out.println("Reversed number: " + palindrome.reverse());
//        if(palindrome.equals(word))
//            System.out.println("The number " + word + " is a palindrome.");
//        else
//            System.out.println("The number " + word + " is not a palindrome.");
//    }
//
//}


import java.util.Scanner;
public class PalindromeChecker {

    public static void main(String[] args) {
        // Scanner obyekti yaradırıq
        Scanner scanner = new Scanner(System.in);

        // İstifadəçidən rəqəmi daxil etməsini tələb edirik
        System.out.print("Rəqəmi daxil edin: ");
        int number = scanner.nextInt();

        // Yeni bir PalindromeCheck obyekti yaradırıq
        PalindromeChecker palindromeChecker = new PalindromeChecker();

        // Rəqəmi tərsinə çevirək
        int reversedNumber = palindromeChecker.reverseNumber(number);

        // Palindrom olub olmadığını yoxlayırıq
        if (number == reversedNumber) {
            System.out.println("Daxil etdiyiniz rəqəm palindromdur.");
        } else {
            System.out.println("Daxil etdiyiniz rəqəm palindrom deyil.");
        }

        // Scanner obyektini bağlayırıq
        scanner.close();
    }

    // Metod: Rəqəmi tərsinə çevirir
    public int reverseNumber(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number = number / 10;
        }
        return reversedNumber;
    }
}
