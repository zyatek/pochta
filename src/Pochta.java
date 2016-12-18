import javax.swing.*;

public class Pochta {


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GuiJFrame();
            }
        });
    }
}
