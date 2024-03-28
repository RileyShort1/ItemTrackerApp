package home;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class HomePageController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToDefineNewCategoryPage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../newcategory/DefineNewCategoryPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToNewStorageLocationPage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../newstoragelocation/NewStorageLocationPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
