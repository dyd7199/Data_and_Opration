public class Variable {
    public static void main(String[] args){

        int a  = 1; // Number -> interger 정수
        double b = 1.1; // real Number double -> 실수 8바이트의 크기를 가지고 실수를 표현
        float c = 1.1f; // float 4바이트의 크기를 가지고 실수를 표현 소수점 뒤에 f를 붙여 소수임을 알려야함
        String d = "Hello World"; // String
        // 데이터 타입을 명확하게

//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);

        //부동소수점 ex
        float floatNumber = 0.001f + 0.001f + 0.0001f;
        double doubleNumber = 0.01 + 0.001 + 0.0001;

        System.out.println(floatNumber); //프로그래밍 언어에서 실수 표현에는 제약이 있다.
        System.out.println(doubleNumber);   // 부정확



    }
}
