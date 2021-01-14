import java.util.Scanner;

public class FibonaChicken {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer personCount = scanner.nextInt();
        int[] chickenCount = new int[personCount];
        for (int i = 0; i < personCount; i++) {
            chickenCount[i] = 0;
        }

        chickenCount[0] = 1;
        chickenCount[1] = 1;

        if (personCount == 1) {
            System.out.println("1인 1닭");
        } else if (personCount == 2) {
            System.out.println("2인 " + chickenCount[1] + "닭");
        } else {
            for (int i = 2; i < personCount; i++) {
                chickenCount[i] = chickenCount[i-1] + chickenCount[i-2];
            }
            System.out.println(personCount+"인 " + chickenCount[personCount-1] + "닭");
        }
    }
}


