package accessModifiers;

public class SubRootClass {
    void printDefault() {
        System.out.println("Default");
    }
    public void printPublic() {
        System.out.println("Public");
    }
    protected void printProtected() {
        System.out.println("Protected");
    }
    private void printPrivate() {
        System.out.println("Private");
    }
}
