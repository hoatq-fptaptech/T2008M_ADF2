package demo.s6;

import config.Connector;

import java.sql.*;

public class Main {

    public static void main(String[] args){
        try{

            Statement stt = Connector.getInstance().getStatement();
            // liet ke sinh vien
//            String txt_sql = "select * from SinhVien";

//            ResultSet rs = stt.executeQuery(txt_sql);
//            while (rs.next()){
//                System.out.println(rs.getInt("id"));
//                System.out.println(rs.getString("name"));
//                System.out.println(rs.getInt("age"));
//                System.out.println(rs.getInt("mark"));
//            }

            // them sinh vien
            String insert_sql = "insert into SinhVien(name,age,mark) values('Phạm Văn Minh',20,6)";
            stt.execute(insert_sql);
        }catch (SQLException e){
            System.out.println("SQL ERROR");
        }
    }
}
