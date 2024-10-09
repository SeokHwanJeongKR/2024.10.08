package staticCls;

public class StaticOuterClassTest {

    public static void main(String[] args) {

    }
    // 인스턴스 생성 테스트
    static void test1() {
        StaticOuterClass staticOuterClass = new StaticOuterClass();
        staticOuterClass.accessToInnerClass();

        StaticOuterClass.StaticInnerClass staticInnerClass = new StaticOuterClass.StaticInnerClass();
    }
}
