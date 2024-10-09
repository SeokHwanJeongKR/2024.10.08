package inner.instCls;

public class InstClassTests {
    public static void main(String[] args) {

        InstOuterClass instOuterClass = new InstOuterClass();
        instOuterClass.printInnerclassVariable();

        InstOuterClass.InnerClass innerClass = new InstOuterClass().new InnerClass();


    }
}
