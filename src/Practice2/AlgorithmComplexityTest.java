package Practice2;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();
        int[] frequentChar = new int[255];                         //{1}
        for (int i = 0; i < inputString.length(); i++) {           //{2}
            /* Tìm ví trí tương ứng của ký tự trong bảng ASCII */
            int ascii = inputString.charAt(i);               //{3}
            /* Tăng giá trị tần suất */
            frequentChar[ascii] += 1;                              //{4}
        }

        int max = 0;
        char character = (char) 255;
        System.out.println(character);
        for (int i = 0; i < 255; i++) {
            if (frequentChar[i]>max){
                max = frequentChar[i];
                character = (char) i;
            }
        }
        System.out.println("The most appearing letter is "+ character+ " with a frequency of " + max +" times.");
    }
}
