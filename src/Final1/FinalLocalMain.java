package Final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        //final 지역변수1
        final int data1;
        data1 = 10; //최초 한번만 할당 가능
        //data1 = 20; //컴파일 오류


        //final 지역변수2
        final int data2 = 10;
        //data2 = 20; //컴파일 오류
        method(10); //final은 한번 값이 할당되면 변경할 수 없음
    }

    static void method(final int parameter) {
        //parameter = 20; //컴파일 오류
    }
}
