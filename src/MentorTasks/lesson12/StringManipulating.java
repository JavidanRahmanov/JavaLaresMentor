package MentorTasks.lesson12;


public class StringManipulating {
    public static void main(String args[]) {
        String word1 = "Action";
        String word2 = "SatisfactionZ";
//	CountCharacters();
//	ConvertUppercase();
//	ConvertLowercase();
//	IsStartWithA(word2);
//	IsEndsWithZ(word1);
//	replaceE();
//	SplitString();
//	findFirstIndex();
//	substring();
        removeWhitespaces();

    }

    static void CountCharacters() {
        String word = "Salam Dunya!";
        int a = word.length();
        System.out.println(a);
    }
    static void ConvertUppercase() {
        String word = "yoxlama1: Salam ";
        System.out.println(word.toUpperCase());
    }
    static void ConvertLowercase() {
        String word = "Yoxlama2: Dunya ";
        System.out.println(word.toLowerCase());
    }

    static boolean IsStartWithA(String word) {
        char result = word.charAt(0);

        if(result == 'A' || result == 'a') {
            System.out.println("String starts with 'A'");
            return true;

        }

        else {
            System.out.println("String doesn't start with 'A'");
            return false;
        }
    }
    static boolean IsEndsWithZ(String word) {
        char result = word.charAt(word.length()-1);

        if(result == 'Z' || result == 'z') {
            System.out.println("String ends with 'Z'");
            return true;

        }

        else {
            System.out.println("String doesn't end with 'Z'");
            return false;
        }
    }
    static void replaceE() {
        String word = "engineer";
        String newWord = word.replace('e', 'E');
        System.out.println(newWord);
    }
    static void SplitString() {
        String word = "Salam Dunya!";
        String[] arr = word.split(" ");
        for(String e: arr) {
            System.out.println(e);
        }
    }
    static void findFirstIndex() {
        String word = "Colombo";
        int index = word.indexOf('o');
        System.out.println(index);
    }
    static void substring() {
        String word = "Colombo Mountain";
        String newWord = word.substring(4,10);
        System.out.println(newWord);
    }
    static void removeWhitespaces() {
        String word = "   Colombo Mountain   ";
        String newWord = word.trim();
        System.out.println(newWord);
    }
}

