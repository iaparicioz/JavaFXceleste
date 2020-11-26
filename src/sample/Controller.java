package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.awt.event.MouseEvent;

public class Controller {
    @FXML
    private Label label;
    @FXML
    private TextField editText;
    @FXML
    private Button boton;
    public int aleatorio = 0;
    public int input = 0;

    public Controller() {
    }

    @FXML
    //GENERO EL NUMERO ALEATORIO
    public void setLabelText() {
        this.aleatorio = (int)(Math.random()*10);
        this.label.setText(String.valueOf(this.aleatorio));
    }

    @FXML
    public void onInputEditText() {
        if (this.label.getText().equals(this.editText.getText())) {
            this.boton.setVisible(true);
            this.boton.setDisable(true);
            this.setLabelText();
        } else {
            this.boton.setDisable(true);
        }

    }

    @FXML
    public void onClickBoton() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("newWindow.fxml"));
            Parent root = (Parent)fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception var4) {
            var4.printStackTrace();
        }

    }
}

