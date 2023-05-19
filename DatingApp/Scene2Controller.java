import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class Scene2Controller {

    @FXML
    ImageView alexa;
    @FXML
    ImageView sabrina;
    @FXML
    ImageView olivia;
    @FXML
    ImageView mikey;
    @FXML
    ImageView lisa;
    @FXML
    ImageView sana;
    @FXML
    ImageView noze;
    @FXML
    ImageView valkyrae;

    public void selectImage(ImageView image) {
        image.setOpacity(1.0);
    }
}