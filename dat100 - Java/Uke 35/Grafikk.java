import easygraphics.*; // Husk å importere biblioteket hvis det ligger i en pakke

public class Grafikk extends EasyGraphics {
    public static void main(String[] args) {
        launch(args);
    }
    
    public void run() {
        makeWindow("Grafikk", 1400, 600);
        drawCircle(300, 140, 120);
    }
}