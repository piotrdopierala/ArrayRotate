/**
 * To my tetris game project I need function of rotating elements in grid aka array
 * This is my attempt to implement rotation
 */
public class GridRotateMain {
    public static void main(String[] args) {

        GridInt e = new GridInt(TetrisElements.I.getArray());

        e.prettyPrint();
        System.out.println("-------------------");
        e.rotate90CW();
        e.alignLeft();
        e.prettyPrint();
        System.out.println("-------------------");
        e.rotate90CW();
        e.prettyPrint();
        System.out.println("-------------------");
        e.rotate90CW();
        e.alignTop();
        e.prettyPrint();
        System.out.println("-------------------");

    }
}
