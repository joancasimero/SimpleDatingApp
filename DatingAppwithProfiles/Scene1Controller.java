import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Node;

public class Scene1Controller {

    @FXML
    ImageView myImageView;
    Button myButton;
    Button no;
    private Stage stage;
    private Scene scene;
    private Parent root = null;
    Scene2Controller scene2Controller = null;
    FXMLLoader loader;

    Image mikey = new Image(getClass().getResourceAsStream("images/mikey.jpg"));
    Image sabrina = new Image(getClass().getResourceAsStream("images/sabrina.jpg"));
    Image olivia = new Image(getClass().getResourceAsStream("images/olivia.jpg"));
    Image lisa = new Image(getClass().getResourceAsStream("images/lisa.jpg"));
    Image sana = new Image(getClass().getResourceAsStream("images/sana.jpg"));
    Image noze = new Image(getClass().getResourceAsStream("images/noze.jpg"));
    Image valkyrae = new Image(getClass().getResourceAsStream("images/valkyrae.jpg"));
    Image[] imageArray = { mikey, sabrina, olivia, lisa, sana, noze, valkyrae };
    int counter = imageArray.length;

    public void interested(ActionEvent event) throws IOException {

        if (scene2Controller == null) {
            loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
            root = loader.load();
            scene2Controller = loader.getController();
            scene2Controller.selectImage(scene2Controller.alexa);
        }

        if (counter > 0) {
            myImageView.setImage(imageArray[counter - 1]);
        }

        if (counter == 6) {
            scene2Controller.selectImage(scene2Controller.valkyrae);
        } else if (counter == 5) {
            scene2Controller.selectImage(scene2Controller.noze);
        } else if (counter == 4) {
            scene2Controller.selectImage(scene2Controller.sana);
        } else if (counter == 3) {
            scene2Controller.selectImage(scene2Controller.lisa);
        } else if (counter == 2) {
            scene2Controller.selectImage(scene2Controller.olivia);
        } else if (counter == 1) {
            scene2Controller.selectImage(scene2Controller.sabrina);
        } else if (counter == 0) {
            scene2Controller.selectImage(scene2Controller.mikey);
        }

        if (counter <= 0) {
            try {
                switchToscene2(event);
            } catch (Exception e) {
            }

        }

        counter--;
    }

    public void pass(ActionEvent event) throws IOException {

        if (scene2Controller == null) {
            loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
            root = loader.load();
            scene2Controller = loader.getController();
        }

        if (counter > 0) {
            myImageView.setImage(imageArray[counter - 1]);
        }

        if (counter <= 0) {
            try {
                switchToscene2(event);
            } catch (Exception e) {
            }
        }

        counter--;
    }

    public void switchToscene2(ActionEvent event) throws IOException {
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}