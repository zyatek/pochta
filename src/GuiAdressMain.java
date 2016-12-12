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
        jPanel.setBackground(Color.BLUE);
        add(jPanel);


        //create content

        JButton buttonPass = new JButton("Password");
        JButton buttonLog = new JButton("Login");

        JLabel labelPass = new JLabel("Password");
        JLabel labelLog = new JLabel("Login");

        JTextField textPass = new JTextField(20);
        JTextField textLog = new JTextField(20);

        JTextArea textArea = new JTextArea(3, 10);

        GridBagConstraints constraints1 = new GridBagConstraints();
        constraints1.weightx = 0.9;
        constraints1.weighty = 0;
        constraints1.gridx = 0;
        constraints1.gridy = 0;
        constraints1.gridheight = 3;
        constraints1.gridwidth = 3;

        jPanel.add(textArea, constraints1);


        GridBagConstraints constraints2 = new GridBagConstraints();
        constraints2.weightx = 0.9;
        constraints2.gridx = 3;
        constraints2.gridy = 0;
        constraints2.gridheight = 2;
        constraints2.gridwidth = 1;
        constraints2.insets = new Insets(2, 20, 2, 2);

        jPanel.add(buttonLog, constraints2);


//        constraints.gridx = 0;
//        constraints.gridy = 0;
//        constraints.gridheight = 1;
//        constraints.gridwidth = 1;
//        constraints.anchor = GridBagConstraints.WEST;
//        constraints.fill = GridBagConstraints.BOTH;
//        constraints.insets = new Insets(1, 3, 2, 4);
//
//        jPanel.add(buttonPass, constraints);



        //https://www.youtube.com/watch?v=cGSwzF6vfSc&t=875s
//http://www.frolov-lib.ru/programming/javasamples/vol5/vol5_5/
//
////        constraints.anchor = GridBagConstraints.NORTH;
////        constraints.fill   = GridBagConstraints.NONE;
////        constraints.gridheight = GridBagConstraints.RELATIVE; // количество ячеек в высоту для компонента
////        constraints.gridwidth  = GridBagConstraints.RELATIVE;// количество ячеек в ширину для компонента
////        constraints.gridx = 0;//номер ячейки по оси х
////        constraints.gridy = 0;// номер ячейки по оси y
////        constraints.insets = new Insets(20, 0, 0, 0);
////        constraints.ipadx = 0;
////        constraints.ipady = 0;
////        constraints.weightx = 0.0;
////        constraints.weighty = 0.0;
//
////
//
//        //add components
//        JButton button = new JButton("Hello");
//        gbLayout.setConstraints(button, constraints);
//        JTextArea textArea = new JTextArea("good");
//        jPanel.add(button);
//        jPanel.add(textArea);






        //start app

        add(jPanel);

        setVisible(true);

    }
}
