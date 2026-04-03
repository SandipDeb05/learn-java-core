package accessModifiers.Two;

import accessModifiers.One.OneClass;

public class TwoClass extends OneClass{

    void printDefault(){
        System.out.println("Default");
    }
    public void printPublic(){
        System.out.println("Public");
    }
    protected void printProtected(){
        System.out.println("Protecteds");
    }
    private void printPrivate(){
        System.out.println("Private");
        printProtected();
    }

    public static void main(String[] args){
        OneClass oc = new OneClass();
        oc.printPublic();
        TwoClass tc = new TwoClass();
        tc.printPrivate();
    }
}
