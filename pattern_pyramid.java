
public class pattern_pyramid {

    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < i*2+1; k++) {
                System.out.print("* ");
            }
            System.out.println("");

        }
    }
}
