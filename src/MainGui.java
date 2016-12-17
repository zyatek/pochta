import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class MainGui extends JFrame {

    MainGui previewJFrame = null;
    MainGui nextJFrame = null;
    MainGui thisObject = null;

//    Parser parser = new Parser();
    public String textFromArea = "";

    JPanel jPanel = new JPanel();
    JPanel buttonPanel = new JPanel(new GridLayout(1, 3));

    JLabel labelTitle = new JLabel();
    JTextArea textArea = new JTextArea(30, 30);
    JScrollPane scrollPane = new JScrollPane(textArea);
    JButton buttonPreview = new JButton("Preview");
    JButton buttonNext = new JButton("Next");
    JButton buttonClear = new JButton("Clear");

    AdressGui adressGui;
    AdditionGui additionGui;

    public MainGui() {
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

        jPanel.setLayout(new BorderLayout());

        labelTitle.setFont(new Font("Arial", Font.PLAIN, 14));
        labelTitle.setHorizontalAlignment(JLabel.CENTER);

        buttonPreview.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                previewJFrame.setVisible(true);
                setVisible(false);

            }
        });


        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
            }
        });

        buttonPanel.add(buttonPreview);
        buttonPanel.add(buttonClear);
        buttonPanel.add(buttonNext);

        jPanel.add(scrollPane, BorderLayout.CENTER);
        jPanel.add(buttonPanel, BorderLayout.PAGE_END);
        jPanel.add(labelTitle, BorderLayout.PAGE_START);

        add(jPanel);

        setLocationRelativeTo(null);

        setVisible(true);
    }
}