import java.sql.*;
import java.util.ArrayList;

public class Main {

    static DbHelper helper = new DbHelper();

    static Connection connection = null;

    public static void main(String[] args) throws SQLException {
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            String sql = "delete from actor where actor_id= ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,3);
            statement.executeUpdate();
            System.out.println("Kayıt silindi");
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }

    public static void selectDemo() throws SQLException{
        Statement statement = null;
        ResultSet resultSet;

        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select actor_id , first_name , last_name , last_update from actor");
            ArrayList<Actor> actors = new ArrayList<Actor>();
            while (resultSet.next()){
                actors.add(new Actor(
                        resultSet.getInt("actor_id"),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name"),
                        resultSet.getString("last_update")));
            }
            System.out.println(actors.size());
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            connection.close();
        }
    }

    public static void insertData() throws SQLException {
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            String sql = "insert into actor(first_name,last_name,last_update) values (?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, "Enes");
            statement.setString(2, "Inandi");
            statement.setString(3, "02.08.2023 20:53");
            System.out.println("Kayıt eklendi");
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }

    public static void updateData()throws SQLException{
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            String sql = "update actor set last_name='Brown' where actor_id= ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,2);
            statement.executeUpdate();
            System.out.println("Kayıt güncellendi");
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }
}