package Singleton;

public class Triple {

    private static Triple triple1 = new Triple();
    private static Triple triple2 = new Triple();
    private static Triple triple3 = new Triple();

    public static Triple getInstance(int id){

        switch (id){
            case 1:return triple1;
            case 2:return triple2;
            case 3:return triple3;
            default:break;
        }
    return null;

    }


}
