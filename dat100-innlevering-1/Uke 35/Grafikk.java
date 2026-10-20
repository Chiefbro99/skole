import easygraphics.*; // Husk å importere biblioteket hvis det ligger i en pakke

public class Grafikk extends EasyGraphics {
    public static void main(String[] args) {
        launch(args);
    }
    
    public void run() {
        makeWindow("Grafikk", 350, 150);
        drawCircle(150, 70, 60);
    }
}