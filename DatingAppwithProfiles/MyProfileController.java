import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Node;

public class MyProfileController {

    @FXML
    CheckBox myCheckBox;

    @FXML
    ImageView myImageView, petImageView, personalityImageView, entertainmentImageView, timeImageView;

    @FXML
    RadioButton r1, r2, r3, r4, r5, r6, r7, r8, r9;

    Image ekis = new Image(getClass().getResourceAsStream("images/ekis.png"));
    Image love = new Image(getClass().getResourceAsStream("images/love.png"));
    Image cat = new Image(getClass().getResourceAsStream("images/cat.png"));
    Image dog = new Image(getClass().getResourceAsStream("images/dog.png"));
    Image introvert = new Image(getClass().getResourceAsStream("images/introvert.png"));
    Image ambivert = new Image(getClass().getResourceAsStream("images/ambivert.png"));
    Image extrovert = new Image(getClass().getResourceAsStream("images/extrovert.png"));
    Image movie = new Image(getClass().getResourceAsStream("images/movie.png"));
    Image book = new Image(getClass().getResourceAsStream("images/book.png"));
    Image day = new Image(getClass().getResourceAsStream("images/day.png"));
    Image night = new Image(getClass().getResourceAsStream("images/night.png"));


    private Stage stage;
    private Scene scene;
    private Parent root;

    public void looking() {

        if (myCheckBox.isSelected()) {
            myImageView.setImage(love);
        } else {
            myImageView.setImage(ekis);
        }
    }

    public void selectPet() {

        if (r1.isSelected()) {
            petImageView.setImage(cat);
        } else if (r2.isSelected()) {
            petImageView.setImage(dog);
        }
    }

    public void selectPersonality() {

        if (r3.isSelected()) {
            personalityImageView.setImage(introvert);
        } if (r4.isSelected()) {
            personalityImageView.setImage(ambivert);
        } else if (r5.isSelected()) {
            personalityImageView.setImage(extrovert);
        }
    }

    public void selectEntertainment() {
        if (r6.isSelected()) {
            entertainmentImageView.setImage(movie);
        } else if (r7.isSelected()) {
            entertainmentImageView.setImage(book);
        }
    }

    public void selectTime() {
        if (r8.isSelected()) {
            timeImageView.setImage(day);
        } else if (r9.isSelected()) {
            timeImageView.setImage(night);
        }
    }


    public void dateNow(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene.fxml"));
        // Load Scene2Controller
        root = loader.load();
        // Load stage and scene
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}