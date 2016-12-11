import javafx.application.Application;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class GuiAdressMain extends JFrame {

    public GuiAdressMain() {
        super("Pochta");

        //set setting JFrame
        setSize(700, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

//        URL imagePath = getClass().getResource("/img/Pochta24.jpg");
//        if (imagePath == null) {
//            System.out.println("null");
//
//        } else {
//            System.out.println("image");
//        }
        Image image = null;
        try {
            image = ImageIO.read(new File("/img/Pochta24.png"));
        } catch (IOException e) {
            e.printStackTrace();

        }
        setIconImage(image);

//        setIconImage(new ImageIcon());

//        Image imgLabel = new ImageIcon(Application.class.getResource("src/img/Pochta24.jpg")).getImage();
//        setIconImage(imgLabel);

        //Content Pane
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());

        //create content



        setLocationRelativeTo(null);
        setVisible(true);

    }
}
