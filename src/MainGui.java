import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGui extends JPanel {

    MainGui previewJPanel = null;
    MainGui nextJPanel = null;

    GuiJFrame jFrame = null;

    public String textFromArea = "";

    JPanel buttonPanel = new JPanel(new GridLayout(1, 3));

    JLabel labelTitle = new JLabel();
    JTextArea textArea = new JTextArea(30, 30);
    JScrollPane scrollPane = new JScrollPane(textArea);
    JButton buttonPreview = new JButton("Preview");
    JButton buttonNext = new JButton("Next");
    JButton buttonClear = new JButton("Clear");

    public MainGui() {

        setLayout(new BorderLayout());

        labelTitle.setFont(new Font("Arial", Font.PLAIN, 14));
        labelTitle.setHorizontalAlignment(JLabel.CENTER);

        buttonPreview.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setjPanel(MainGui.this.previewJPanel);
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

        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.PAGE_END);
        add(labelTitle, BorderLayout.PAGE_START);

    }

}