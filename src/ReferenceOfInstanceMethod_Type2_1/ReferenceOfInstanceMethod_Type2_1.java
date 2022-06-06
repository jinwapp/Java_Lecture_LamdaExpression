package ReferenceOfInstanceMethod_Type2_1;

interface A{
    void abc(B b, int k);
}

class B{
    void bcd(int k){
        System.out.println(k);
    }
}

public class ReferenceOfInstanceMethod_Type2_1 {
    public static void main(String[] args) {
        //#인스턴스 메서드 참조 Type 2
        //@1 익명이너클래스
        A a1 = new A(){
            @Override
            public void abc(B b, int k) {
                // 객체 b가 만들어져서 매개변수 b로 넘어온 케이스기 때문에 객체 b를 만들지 않아도된다.
                b.bcd(k);
            }
        };
        //@2 람다식
        A a2 = (B b, int k)->b.bcd(k);

        //@2 람다식
        A a3 = (B b, int k)->b.bcd(k);

    }
}
