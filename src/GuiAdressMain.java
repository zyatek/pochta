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
//        contentPane.setLayout(new GridLayout(4, 4));


        //create content
        JPanel jPanel = new JPanel();
        GridBagLayout gbLayout = new GridBagLayout();
        jPanel.setLayout(gbLayout);
        GridBagConstraints constraints = new GridBagConstraints();

        constraints.anchor = GridBagConstraints.NORTH;
        constraints.fill   = GridBagConstraints.NONE;
        constraints.gridheight = 1;
        constraints.gridwidth  = GridBagConstraints.REMAINDER;
        constraints.gridx = GridBagConstraints.RELATIVE;
        constraints.gridy = GridBagConstraints.RELATIVE;
        constraints.insets = new Insets(40, 0, 0, 0);
        constraints.ipadx = 0;
        constraints.ipady = 0;
        constraints.weightx = 0.0;
        constraints.weighty = 0.0;



        //add components
        JButton button = new JButton("Hello");
        gbLayout.setConstraints(button, constraints);
        jPanel.add(button);




        //start app
        add(jPanel);
        setLocationRelativeTo(null);
        setVisible(true);

    }
}
