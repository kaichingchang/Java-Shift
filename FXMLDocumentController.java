/*
 *《程式語言教學誌》的範例程式
 * http://kaiching.org/
 * 檔名：FXMLDocumentController.java
 * 功能：位元運算的 Controller 類別
 * 作者：張凱慶
 */

package shiftdemo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private void handleButtonAction1(ActionEvent event) {
        label.setText(String.valueOf(8 << 1));
        button1.setDisable(true);
    }

    @FXML
    private void handleButtonAction2(ActionEvent event) {
        label.setText(String.valueOf(8 << 2));
        button2.setDisable(true);
    }

    @FXML
    private void handleButtonAction3(ActionEvent event) {
        label.setText(String.valueOf(8 << 3));
        button3.setDisable(true);
    }

    @FXML
    private void handleButtonAction4(ActionEvent event) {
        label.setText(String.valueOf(8 >> 3));
        button4.setDisable(true);
    }

    @FXML
    private void handleButtonAction5(ActionEvent event) {
        label.setText(String.valueOf(8 >> 2));
        button5.setDisable(true);
    }

    @FXML
    private void handleButtonAction6(ActionEvent event) {
        label.setText(String.valueOf(8 >> 1));
        button6.setDisable(true);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
