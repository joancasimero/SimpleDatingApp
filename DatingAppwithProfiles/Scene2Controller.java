import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Node;

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
    @FXML
    Button alexaButton, lisaButton, mikeyButton, nozeButton, oliviaButton, sabrinaButton, sanaButton, valkyraeButton;

    public void selectImage(ImageView image) {
        image.setOpacity(1.0);
    }
    
    public void alexaProfile(ActionEvent event) throws IOException{
        if (alexa.getOpacity() == 1.0) {
            alexaButton.setVisible(true);
        
            Parent root = FXMLLoader.load(getClass().getResource("AlexaProfile.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
    }

    public void lisaProfile(ActionEvent event) throws IOException{
        if (lisa.getOpacity() == 1.0) {
            lisaButton.setVisible(true);
        
            Parent root = FXMLLoader.load(getClass().getResource("LisaProfile.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
    }

    public void mikeyProfile(ActionEvent event) throws IOException{
        if (mikey.getOpacity() == 1.0) {
            mikeyButton.setVisible(true);
        
            Parent root = FXMLLoader.load(getClass().getResource("MikeyProfile.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
    }

    public void nozeProfile(ActionEvent event) throws IOException{
        if (noze.getOpacity() == 1.0) {
            nozeButton.setVisible(true);
        
            Parent root = FXMLLoader.load(getClass().getResource("NozeProfile.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
    }

    public void oliviaProfile(ActionEvent event) throws IOException{
        if (olivia.getOpacity() == 1.0) {
            oliviaButton.setVisible(true);
        
            Parent root = FXMLLoader.load(getClass().getResource("OliviaProfile.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
    }

    public void sabrinaProfile(ActionEvent event) throws IOException{
        if (sabrina.getOpacity() == 1.0) {
            sabrinaButton.setVisible(true);
        
            Parent root = FXMLLoader.load(getClass().getResource("SabrinaProfile.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
    }

    public void sanaProfile(ActionEvent event) throws IOException{
        if (sana.getOpacity() == 1.0) {
            sanaButton.setVisible(true);
        
            Parent root = FXMLLoader.load(getClass().getResource("SanaProfile.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
    }

    public void valkyraeProfile(ActionEvent event) throws IOException{
        if (valkyrae.getOpacity() == 1.0) {
            valkyraeButton.setVisible(true);
        
            Parent root = FXMLLoader.load(getClass().getResource("ValkyraeProfile.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
    }
        
    }