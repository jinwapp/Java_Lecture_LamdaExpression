package ReferenceOfStaticMethod;

interface A{
    void abc();
}

class B{
    static void bcd(){
        System.out.println("스태틱 메서드");
    }
}

public class ReferenceOfStaticMethod {
    public static void main(String[] args) {
        //#. 정적 메서드 참조
        //@1. 익명이너클래스 방법
        A a1  = new A(){
            @Override
            public void abc() {
                B.bcd();
            }
        };
        //@2. 람다식 표현
        A a2 = ()->{B.bcd();};
        //@3. 스태틱 매서드 참조 표현 방식으로 변경
        A a3 = B::bcd;
    }
}
