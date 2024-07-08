import java.util.Scanner;

public class DSlab1q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character to check whether its vowel or not:");
        char character=sc.nextLine().charAt(0);
        if(character == 'a'||character == 'e'||character =='i'||character =='o'||character =='u'||character =='A'||character =='E'||character =='I'||character =='O'||character =='U'){
            System.out.println("the given character is vowel.");
        }
        else{
            System.out.println("the given character is consonant");
        }
    }
}
