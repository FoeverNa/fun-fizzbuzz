public class Fizzbuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0){
                System.out.println("Fizzbuzz");
            }
            System.out.println(i);
        }
    }
}
