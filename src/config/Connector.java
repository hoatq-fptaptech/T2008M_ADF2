package config;
import java.sql.*;
public class Connector {
    private static Connector connector;

    public final static String connectString = "jdbc:mysql://localhost:3306/T2008M";
    public final static String user = "root";
    public final static String password = "root";// neu dung mamp la root con xampp thi bo trong

    Statement statement;

    private Connector() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(connectString, user, password);
            setStatement(conn.createStatement());
        }catch (Exception e){
            System.out.println("ERROR");
        }
    }

    public static Connector getInstance(){
        if(connector == null)
            connector = new Connector();
        return connector;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }
}
