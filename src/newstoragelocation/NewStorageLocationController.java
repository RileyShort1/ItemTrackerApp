package newstoragelocation;

import datamanager.DataManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class NewStorageLocationController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private TextField newLocationInput;
    @FXML
    private TextField locationDescriptionInput;
    @FXML
    private Button submit;

    public void submitCategory(ActionEvent event) {

        String location = newLocationInput.getText();
        String description = locationDescriptionInput.getText();

        DataManager db = DataManager.getDBInstance();
        db.addStorageLocation(location, description);

        try {
            switchToHomePage(event);
        }
        catch (IOException e){
            System.out.print(e.toString());
        }
    }

    public void switchToHomePage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../home/HomePage.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
