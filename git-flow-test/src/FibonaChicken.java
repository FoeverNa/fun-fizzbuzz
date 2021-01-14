import java.util.Scanner;

public class FibonaChicken {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer personCount = scanner.nextInt();
        int checkCount = personCount;
        long [] chickenCount = new long[51];
        long result = 0;

        chickenCount[0] = 0;
        chickenCount[1] = 1;
        for (int i = 2; i < 51; i++) {
            chickenCount[i] = chickenCount[i-1] + chickenCount[i-2];
        }

        while (checkCount > 0) {
            for (int i = chickenCount.length - 1; i >= 2; i--) {
                if (personCount == chickenCount[i]) {
                    result = chickenCount[i-1];
                    System.out.println(result);
                    System.exit(0);
                }

                if (checkCount >= chickenCount[i]) {
                    result += chickenCount[i-1];
                    checkCount -= chickenCount[i];
                }
            }
        }

        System.out.println(result);
    }
}


