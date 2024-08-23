package MentorTasks.lesson20.homework;

import java.util.Scanner;

public class CaesarCipher {


    public StringBuffer encrypt(String text, int count) {
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            if (Character.isUpperCase(currentChar)) {
                char ch = (char)(((int)currentChar +
                        count - 65) % 26 + 65);
                result.append(ch);
            } else if (Character.isLowerCase(currentChar)) {
                char ch = (char)(((int)currentChar +
                        count - 97) % 26 + 97);
                result.append(ch);
            } else {

                result.append(currentChar);
            }
        }
        return result;
    }


    public StringBuffer decrypt(StringBuffer cipherText, int count) {
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < cipherText.length(); i++) {
            char currentChar = cipherText.charAt(i);

            if (Character.isUpperCase(currentChar)) {
                char ch = (char)(((int)currentChar -
                        count - 65 + 26) % 26 + 65);
                result.append(ch);
            } else if (Character.isLowerCase(currentChar)) {
                char ch = (char)(((int)currentChar -
                        count - 97 + 26) % 26 + 97);
                result.append(ch);
            } else {

                result.append(currentChar);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CaesarCipher caesarCipher = new CaesarCipher();
        System.out.println("Enter text that you want to encrypt: ");
        String plaintext = sc.nextLine();
        System.out.println("Enter number that you want to shift: ");
        int count = sc.nextInt();
        System.out.println("Plaintext  : " + plaintext + "\n");
        System.out.println("Shift : " + count + "\n");


        StringBuffer cipherText = caesarCipher.encrypt(plaintext, count);
        System.out.println("Ciphertext: " + cipherText);


        StringBuffer decryptedText = caesarCipher.decrypt(cipherText, count);
        System.out.println("Decrypted text: " + decryptedText);
    }
}
