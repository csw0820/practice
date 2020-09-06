public class Condition {
    public static void main(String[] args) {
        /**
         * 문자열을 쓸 때는 " "
         * 문자를 쓸 때는 ' '를 쓴다
         * + - * / % 숫자연산자
         * int a = 3;
         * ==은 비교연산자이다 (ture/false)ㄹ 나타낸다
         * ==은 맞는지를 판별하는것이고
         * !=는 아닌지를 판별하는 것이다
         * 비교연산자는 기본데이터타입만 사용이 가능하다
         *
         *          * 숫자 date type
         *          * byte, short, char, int, flot, double, long
         *          *
         *
         */
        if(true) {
            System.out.println("1");
        } else if (true) {
            System.out.println("2");
        } else {
            System.out.println(3);
        }
        int a = 3;
        System.out.println(a != 4);
    }
}
