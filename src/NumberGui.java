import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberGui extends MainGui {

    JLabel nameLabel = new JLabel("Введите название документа");
    JLabel numberLabel = new JLabel("Введите номер документа");
    JLabel dataLabel = new JLabel("Введите дату документа");

    JTextField nameField = new JTextField();
    JTextField numberField = new JTextField("№140/8/",5);
    JTextField dataField = new JTextField(10);

    public NumberGui(GuiJFrame jFrame, MainGui preview) {

        this.jFrame = jFrame;
        previewJPanel = preview;

        labelTitle.setText("Внесите реквизиты документа");

        JPanel centerJPanel = new JPanel(new GridLayout(3,1));
        JPanel westJPanel = new JPanel(new GridLayout(3,1));

        westJPanel.add(nameLabel);
        centerJPanel.add(nameField);
        westJPanel.add(numberLabel);
        centerJPanel.add(numberField);
        westJPanel.add(dataLabel);
        centerJPanel.add(dataField);

        add(westJPanel, BorderLayout.WEST);
        add(centerJPanel, BorderLayout.CENTER);

        buttonNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] detailsDoc = new String[3];
                detailsDoc[0] = nameField.getText();
                detailsDoc[1] = numberField.getText();
                detailsDoc[2] = dataField.getText();

                Parser.parseDetailsDoc(detailsDoc);

                jFrame.setVisible(false);

            }
        });

        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                numberField.setText("№140/8/");
                dataField.setText("");
            }
        });


        //set button Finish"

        buttonNext.setText("Finish");


    }
}
