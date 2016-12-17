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

        //create JPanel + Layout
        JPanel jPanel = new JPanel();
        GridBagLayout gbLayout = new GridBagLayout();
        jPanel.setLayout(gbLayout);
//        jPanel.setBackground(Color.BLUE);
        add(jPanel);


        //create content
        JTextArea textArea = new JTextArea(30, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);

        JButton buttonNext = new JButton("Next");
        JButton buttonClear = new JButton("Clear");
        JButton buttonPreview = new JButton("Preview");

        GridBagConstraints constraints1 = new GridBagConstraints();
        constraints1.weightx = 0;
        constraints1.weighty = 0;
        constraints1.gridx = 0;
        constraints1.gridy = 0;
        constraints1.gridheight = 1;
        constraints1.gridwidth = 3;
        constraints1.anchor = GridBagConstraints.CENTER;

        jPanel.add(scrollPane, constraints1);

        GridBagConstraints constraints2 = new GridBagConstraints();
        constraints2.weightx = 0;
        constraints2.weighty = 0;
        constraints2.gridx = 2;
        constraints2.gridy = 4;
        constraints2.gridheight = 1;
        constraints2.gridwidth = 1;
        constraints1.anchor = GridBagConstraints.CENTER;
//        constraints2.insets = new Insets(2, 20, 2, 2);

        jPanel.add(buttonNext, constraints2);

        GridBagConstraints constraints3 = new GridBagConstraints();
        constraints3.weightx = 0;
        constraints3.weighty = 0;
        constraints3.gridx = 0;
        constraints3.gridy = 4;
        constraints3.gridheight = 1;
        constraints3.gridwidth = 1;
        constraints1.anchor = GridBagConstraints.CENTER;
//        constraints3.insets = new Insets(2, 20, 2, 2);

        jPanel.add(buttonPreview, constraints3);


        GridBagConstraints constraints4 = new GridBagConstraints();
        constraints4.weightx = 0;
        constraints4.weighty = 0;
        constraints4.gridx = 1;
        constraints4.gridy = 4;
        constraints4.gridheight = 1;
        constraints4.gridwidth = 1;
        constraints1.anchor = GridBagConstraints.CENTER;
//        constraints3.insets = new Insets(2, 20, 2, 2);

        jPanel.add(buttonClear, constraints4);

        add(jPanel);

        setVisible(true);

    }
}
