public class DataType {
    public static void main(String[] args){
        System.out.println(6); // Number
        System.out.println("six"); // String
        System.out.println("6"); // String 6
        // 데이터 타입 "" 문자열 그냥숫자는 숫자
        System.out.println(6+6); // 12 -> 더하기 연산자
        System.out.println("6"+"6"); //66 -> 결합연산자

        System.out.println(6*6); //36
        //System.out.println("6"*"6"); 문자열은 *라는 연산을 사용하지 못한다.
        System.out.println("1111".length()); // .length 문자열 길이
        //System.out.println(1111.length()); 숫자에선는 불가능
        // 따라서 데이터 타입이 중요하다.!!

    }
}
