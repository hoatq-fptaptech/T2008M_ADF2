package managestudent.danhsach;

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
import managestudent.model.SinhVien;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.sql.Statement;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public TableView<SinhVien> tbview;
    public TableColumn<SinhVien,String> txtName;
    public TableColumn<SinhVien,Integer> txtAge;
    public TableColumn<SinhVien,Integer> txtMark;

    public final static String connectString = "jdbc:mysql://localhost:3306/T2008M";
    public final static String user = "root";
    public final static String password = "root";// neu dung mamp la root con xampp thi bo trong



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        txtName.setCellValueFactory(new PropertyValueFactory<SinhVien,String>("name"));
        txtAge.setCellValueFactory(new PropertyValueFactory<SinhVien,Integer>("age"));
        txtMark.setCellValueFactory(new PropertyValueFactory<SinhVien,Integer>("mark"));

        ObservableList<SinhVien> ds = FXCollections.observableArrayList();
        // lay sinh vien tu file student.bin de nap vao danh sach
//        try {
//            FileInputStream fis = new FileInputStream("student.bin");
//            DataInputStream dis = new DataInputStream(fis);
//            int line = 0;
//            String txt = dis.readLine();
//            String[] str = new String[3];
//            while (txt != null){
//                str[line] = txt;
//                line++;
//                txt = dis.readLine();
//                if(line >=3){
//                    SinhVien sv = new SinhVien(str[0],Integer.parseInt(str[1]),Integer.parseInt(str[2]));
//                    ds.add(sv);
//                    line = 0;
//                }
//            }
//            tbview.setItems(ds);
//        }catch (IOException io){
//            System.out.println("ERROR");
//        }

        // lay tu db
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(connectString, user, password);
            Statement stt = conn.createStatement();
            // liet ke sinh vien
            String txt_sql = "select * from SinhVien";

            ResultSet rs = stt.executeQuery(txt_sql);
            while (rs.next()) {
//                System.out.println(rs.getInt("id"));
                String name = rs.getString("name");
                int age = rs.getInt("age");
                int mark = rs.getInt("mark");
                SinhVien sv = new SinhVien(name,age,mark);
                ds.add(sv);
            }
            tbview.setItems(ds);
        }catch (ClassNotFoundException e){

        }catch (SQLException e){

        }
    }

    public void trangChu() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../home/home.fxml"));
        Main.mainStage.setScene(new Scene(root,600,400));
    }
}
