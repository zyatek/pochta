import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdditionGui extends MainGui {

    public AdditionGui(GuiJFrame jFrame, MainGui preview) {
        this.jFrame = jFrame;
        previewJPanel = preview;

        labelTitle.setText("Вставьте ДОПОЛНЕНИЯ к документу");

        buttonNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String additions = textArea.getText();
                Parser.parseAdditions(additions);

                if (nextJPanel == null) {
                    nextJPanel = new NumberGui(jFrame,AdditionGui.this);
                }
                jFrame.setjPanel(nextJPanel);


            }
        });




    }


}
