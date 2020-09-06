public class Arr {
    public static void main(String[] args) {
        /**
         * Data type [] name = new Data type[size];
         * arr의 길이 = arr.length
         */
        int[] a = new int[10];
        double[] b = new double[30];
        String[] c = new String[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = i+1;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
