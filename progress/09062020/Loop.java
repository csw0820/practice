public class Loop {
    public static void main(String[] args) {
        /**
         * for은 내가 반복횟수를 아는 경우 보통 사용한다
         * while은 내가 반복횟수를 모르는 경우 보통 사용한다
         *
         */
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }
}
        /**
         * if ( i % 2 == 1 ) {
         *             countinue;
         *         } else {
         *             break;
         *         }
         */


