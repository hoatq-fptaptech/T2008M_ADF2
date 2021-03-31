package managestudent.danhsach;

import config.Connector;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import managestudent.Main;
import models.entity.SinhVien;
import models.ModelSinhVien;
import java.net.URL;
import java.util.ResourceBundle;
public class Controller implements Initializable {
    public TableView<SinhVien> tbview;
    public TableColumn<SinhVien,String> txtName;
    public TableColumn<SinhVien,Integer> txtAge;
    public TableColumn<SinhVien,Integer> txtMark;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        txtName.setCellValueFactory(new PropertyValueFactory<SinhVien,String>("name"));
        txtAge.setCellValueFactory(new PropertyValueFactory<SinhVien,Integer>("age"));
        txtMark.setCellValueFactory(new PropertyValueFactory<SinhVien,Integer>("mark"));

        ObservableList<SinhVien> ds = FXCollections.observableArrayList();
        // lay tu db
        ModelSinhVien modelSinhVien = new ModelSinhVien();
        ds.addAll(modelSinhVien.getListWithSort("mark","desc"));

        tbview.setItems(ds);
    }

    public void trangChu() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../home/home.fxml"));
        Main.mainStage.setScene(new Scene(root,600,400));
    }

    public void submitThemMoi(){
        ModelSinhVien modelSinhVien = new ModelSinhVien();
        SinhVien ss = new SinhVien(null,"Lê Đức Minh",19,5);// sv tao ra tu lay du lieu cua form
        if(modelSinhVien.create(ss)){
            System.out.println("Them moi thanh cong");
        }else {
            System.out.println("Them sv that bai");
        }
    }
}
