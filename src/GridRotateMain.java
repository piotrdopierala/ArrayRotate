/**
 * To my tetris game project I need function of rotating elements in grid aka array
 * This is my attempt to implement rotation
 */
public class GridRotateMain {
    public static void main(String[] args) {

        Element e = new Element(4);
        e.fillChars();

        e.prettyPrint();

        e.rotate90CW();

        System.out.println("----------------------");
        e.prettyPrint();
    }
}
