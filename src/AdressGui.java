import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AdressGui extends MainGui {


    public AdressGui(GuiJFrame jFrame) {
        this.jFrame = jFrame;
//        thisJPanel = this;


        buttonNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String adress = textArea.getText();
                Parser.parseAdress(adress);

                if (nextJPanel == null) {
                    nextJPanel = new AdditionGui(jFrame, AdressGui.this);
                }
                jFrame.setjPanel(nextJPanel);

            }
        });

        labelTitle.setText("Скопируйте ШАПКУ документа с адресами");
        buttonPanel.remove(buttonPreview);

    }


}
