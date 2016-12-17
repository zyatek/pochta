import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AdressGui extends MainGui {

    AdressGui thisObject = this;

    public AdressGui() {


            buttonNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String adress = textArea.getText();
                parser.parseAdress(adress);

                if (nextJFrame == null) {
                    nextJFrame = new AdditionGui(thisObject);
                }
                nextJFrame.setVisible(true);
                setVisible(false);
            }
        });

        labelTitle.setText("Скопируйте сюда ШАПКУ иска/заявления с адресами");
        buttonPanel.remove(buttonPreview);

    }


}
