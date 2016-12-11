import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class GuiAdressMain extends JFrame {

    public GuiAdressMain() {
        super("Pochta");

        //set setting JFrame
        setSize(700, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        URL imagePath = getClass().getResource("/img/Pochta256.jpg");

        BufferedImage image = null;
        try {
            image = ImageIO.read(imagePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        setIconImage(image);

        //Content Pane
//        Container contentPane = getContentPane();
//        contentPane.setLayout(new GridLayout(2, 1));


        //create content
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout());




        //start app

        setLocationRelativeTo(null);
        setVisible(true);

    }
}
