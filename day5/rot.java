public class rot {
    public static void main(String[] args) {
        int x = 5, y = 10;
        int n = y - x + 1;   // ✅ FIXED

        int x1 = x;
        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++) {
            int nu = x;

            for(int j = 0; j < n; j++) {

                arr[i][j] = nu;

                nu++;   // increase

                // ✅ wrap back to x when exceeds y
                if(nu > y) {
                    nu = x;
                }
            }
            x++;   // shift row start

            // ✅ also wrap x
            if(x > y) {
                x = x1;
            }
        }

        // print
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
