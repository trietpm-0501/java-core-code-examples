package intro;

public class StaticInitializerBlock {
    // Static variable
    static int staticVar;

    // Static initializer block
    static {
        staticVar = 100;
        System.out.println("Static initializer block executed. staticVar = " + staticVar);
    }

    public static void main(String[] args) {
        System.out.println("Main method executed. staticVar = " + staticVar);
    }
}