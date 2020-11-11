public class Casting {
    public static void main(String[] args){

        double a = 1.1;
        double b = 1;   // 자동으로 해줌, 정수를 실수에 담는 것은 가능하다. 자동으로 컨버팅이 된다.
        double b2 = (double) 1; // 수동으로 명시한 것
        System.out.println(b);

        //int c = 1.1; -> 실수는 정수형으로 컨버팅이 불가능
        int d = (int) 1.6; // cating 강제로 캐스팅 뒤에 소수를 없앤다. 손실이 일어난다.
        System.out.println(d);

        // 1 to String
        int i = 5;
        String f = Integer.toString(i);
        System.out.println(f.getClass());


    }
}
