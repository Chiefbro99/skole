public class OppgaveG2 {
    public static void main(String[] args) {
        String breddeStr = showInputDialog("Bredde:");
        int bredde = parseInt(breddeStr);

        String hoydeStr = showInputDialog("Høyde:");
        int hoyde = parseInt(hoydeStr);

        int a = areal(bredde,hoyde);

        showMessageDialog(null,"Areal: " + a);
    }
    
    private static int areal(int bredde, int hoyde) {

        int flateareal = bredde * hoyde;

        return flateareal;
    }
    
    private static int lesInnTall(String message) {
        
    }
}
