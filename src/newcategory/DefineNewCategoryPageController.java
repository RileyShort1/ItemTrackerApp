package newcategory;

import datamanager.DataManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

import java.io.IOException;

public class DefineNewCategoryPageController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private TextField newCategoryInput;
    @FXML
    private Button submit;

    public void submitCategory(ActionEvent event) {

        String category = newCategoryInput.getText();

        DataManager db = DataManager.getDBInstance();
        db.addCategory(category);

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