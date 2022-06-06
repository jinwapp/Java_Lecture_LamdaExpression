package ReferenceOfInstanceMethod_Type2_2;

interface A{
    int abc(String str);
}


public class ReferenceOfInstanceMethod_Type2_2 {
    public static void main(String[] args) {
        A a1 = new A() {
            @Override
            public int abc(String str) {
                return str.length();
            }
        };
        //@2.람다식
        A a2 = (String str) -> {
            return str.length();
        };
        //@3. 인스턴스 메서드 참조 Type2
        A a3 = String::length;

        System.out.println(a1.abc("a"));
        System.out.println(a2.abc("bc"));
        System.out.println(a3.abc("def"));
    }
}
