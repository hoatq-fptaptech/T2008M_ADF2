package managestudent.home;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import managestudent.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public Button btnds;
    public Button btnthem;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ResourceBundle lang = ResourceBundle.getBundle("demo.s9.Session9_Messages");
        btnds.setText(lang.getString("list_student"));
    }

    public void danhsach() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../danhsach/danhsach.fxml"));
        Main.mainStage.setScene(new Scene(root,600,400));
    }

    public void themSV(){

    }
}
