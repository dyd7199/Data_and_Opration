public class StringApp {
    public static void main(String[] args){
        // Character VS String
        System.out.println("Hello World");  //String ""
        System.out.println('H');  //'' -> 문자 character
        System.out.println("H"); //-> 문자열

        System.out.println("Hello " +
                "World"); // 중간에 엔터치면 자동으로 결합 연산자를 붙여줌
        System.out.println("Hello \nWorld");    // \n -> 줄바꿈
        // escape
        System.out.println("Hello \"World\""); // Hello "World"

    }
}
