import java.sql.*;
public class DBConnection {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Kamal@002");
            System.out.println("connected");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
