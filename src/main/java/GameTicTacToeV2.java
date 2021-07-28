
public class GameTicTacToeV2 {


    public static void main(String[] args) {
        Splash splash = new Splash();
        splash.setVisible(true);
        Second_Frame sf = new Second_Frame();
        try {
            for (int i = 1; i <= 100; i++) {
                Thread.sleep(45);
                //splash.lblLouding.setText(Integer.toString(i)+"%");
                splash.prglouding.setValue(i);
                if (i == 100) {
                    splash.setVisible(false);
                    sf.setVisible(true);
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
