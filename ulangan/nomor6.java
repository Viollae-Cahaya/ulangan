public class nomor6 {
    public static void main(String[] args) {
        int N=5, K=10, j, i;
        int[] DATA = {4, 1, 8, 7, 4};
        boolean bisa=false;
        
        for (i=0; i<N-1; i++) {
            for (j=1; j<N; j++) {
                if (DATA[i]+DATA[j] == K) {
                    bisa = true;
                }
            }
        }
        if (bisa==true) {
            System.out.println("bisa");
        } else {
            System.out.println("tidak bisa");
        }
    }
}
