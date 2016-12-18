import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class GuiJFrame extends JFrame {

    JPanel jPanel = null;

    public GuiJFrame() {
        super("Pochta");

        //set setting JFrame
        setSize(700, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        setLocationRelativeTo(null);

        //icon
        URL imagePath = getClass().getResource("/img/Pochta256.jpg");
        BufferedImage image = null;
        try {
            image = ImageIO.read(imagePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        setIconImage(image);

        //!!!!! insert JPanel

        setjPanel(jPanel);

        setLocationRelativeTo(null);

        setVisible(true);
    }

    public void setjPanel(JPanel jPanel) {
        if (jPanel == null) {
            jPanel = new AdressGui(this);
            this.jPanel = jPanel;
            add(jPanel);
        }

        remove(this.jPanel);
        this.jPanel = jPanel;
        add(jPanel);
        validate();
        repaint();
    }



}
