package intro;

public class AnonymousBlock {
    // Instance variable
    int instanceVar;

    // Anonymous block
    {
        instanceVar = 50;
        System.out.println("Anonymous block executed. instanceVar = " + instanceVar);
    }

    public AnonymousBlock() {
        System.out.println("Constructor executed. instanceVar = " + instanceVar);
    }

    public static void main(String[] args) {
        System.out.println("Main method started.");
        AnonymousBlock example = new AnonymousBlock();
        System.out.println("Main method ended.");
    }
}
