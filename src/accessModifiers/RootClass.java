package accessModifiers;

import accessModifiers.One.OneClass;

public class RootClass{
    public static void main(String[] args){
        OneClass oc = new OneClass();

        oc.printPublic();
    }
}
