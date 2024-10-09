package staticCls;

public class StaticOuterClass {

    private final String instanceName = "StaticOuterInstanceName";
    private static final String staticname = "StaticOuterStaticName";

    public final int sharedInstanceValue = 100;
    public static final int sharedStaticValue = 90;

   //---------------------------------------------------------------------------

    static class StaticInnerClass {


        //private final String instanceName = "StaticinnerInstanceName";
        //private static final String innerPrivateStaticname = "StaticinnerStaticName";

        public final int sharedInstanceValue = 100;
        public static final int innerPublicStaticValue = 90;

        public static int a = 10;
        public int b = 20;

        public void test() {

            //System.out.println(instanceName);
            System.out.println(staticname);
            StaticOuterClass staticOuterClass = new StaticOuterClass();
            String outerInstanceClassName = staticOuterClass.instanceName;
            System.out.println("outerInstanceClassName = " + outerInstanceClassName);


        }
    }
    public void accessToInnerClass() {

        int innerPublicStaticValue = StaticInnerClass.innerPublicStaticValue;
        System.out.println("innerPublicStaticValue = " + innerPublicStaticValue);

        StaticInnerClass staticInnerClass = new StaticInnerClass();
        staticInnerClass.test()
    }

}
