package inner.instCls;

//outer class
public class InstOuterClass {

    private final String name = "InstOuterClass";
    protected final String protectedValue = "ProtectedValue";
    private final int sharedValue = 123;
    private final String duplicatedName = "duplicatedName";
    String defaultValue = "defaultValue";
    //inner class
    //1. 인스턴스 클래스 <-
    //2. 스태틱 이너 클래스
    class InnerClass {


        public static final String constValue = "ConstValue";
        private final int sharedValue = 90;
        private final String duplicatedName = "duplicatedName";

        public void printOuterMEmeberVars() {
            System.out.println(name);
            System.out.println("protectedValue = " + protectedValue);
            System.out.println("sharedValue = " + sharedValue);
            System.out.println("sharedValue = " + InstOuterClass.this.sharedValue);
            System.out.println("defaultValue = " + defaultValue);

            System.out.println(sharedValue);
            //만약 아웃 클래스의 sharedValue를 쓰고 싶다면 InstOuterclass.this.sharedValue;방식으로 호출 해야한다.
        }
        public void printDuplicateName() {
            String outerVariable = InstOuterClass.this.duplicatedName;
            String innerVariable = this.duplicatedName;

            System.out.println("outerVariable = " + outerVariable);
            System.out.println("innerVariable = " + innerVariable);
        }


    }

    public void printInnerclassVariable() {

        String constValue = InnerClass.constValue;
        System.out.println("constValue = " + constValue);

        InnerClass innerClass = new InnerClass();
        String innerduplicatedName = innerClass.duplicatedName;
        System.out.println("innerduplicatedName = " + innerduplicatedName);

        int innerShearedValue = innerClass.sharedValue;
        System.out.println("innerShearedValue = " + innerShearedValue);


    }
}
