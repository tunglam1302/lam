package ASM;
import java.sql.Connection;
import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String DB_URL = "jdbc:mysql://localhost:3306/ASM";
            String DB_USER = "root";
            String DB_PASSWORD = "";
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement statement = conn.createStatement();
            System.out.println("1:Input book");
            System.out.println("2:Select book by id");
            System.out.println("3:Search book by name");
            System.out.println("4:Get all book from db");
            System.out.println("5:Update book");
            System.out.println("6:Remove book");
            System.out.println("7:Export one book to txt file");
            System.out.println("7:Export all book to txt file");
            Scanner sc = new Scanner(System.in);
            Scanner ac = new Scanner(System.in);
            int choose = sc.nextInt();
            switch (choose) {
                case 1: {
                    System.out.println("Input title");
                    String title = ac.nextLine();
                    System.out.println("Author");
                    String author = ac.nextLine();
                    System.out.println("Release date");
                    String releaseDate = ac.nextLine();
                    System.out.println("Content");
                    String content = ac.nextLine();

                    String addStudent = "INSERT INTO book (title,author,release_date,content) VALUES('" + title + "','" + author + "','" + releaseDate + "','" + content + "')";
                    statement.executeUpdate(addStudent);
                    System.out.println("Success");
                    break;
                }
                case 2: {
                    System.out.println("Input id to search");
                    int id = sc.nextInt();
                    String sql = "SELECT* FROM book WHERE id =" + id;
                    ResultSet resultSet = statement.executeQuery(sql);
                    while (resultSet.next()) {
                        System.out.println("Title: " + resultSet.getString("title") + " Content: " + resultSet.getString("content") + "Author: " + resultSet.getString("author"));
                    }
                    break;
                }
                case 3: {
                    System.out.println("Input title to search");
                    String name = sc.nextLine();
                    String sql = "SELECT * FROM book WHERE name=" + name;
                    ResultSet resultSet = statement.executeQuery(sql);
                    while (resultSet.next()) {
                        System.out.println("Title: " + resultSet.getString("title") + " Content: " + resultSet.getString("content") + "Author: " + resultSet.getString("author"));
                    }
                }
                case 4: {
                    String sql = "SELECT * FROM book ";
                    ResultSet resultSet = statement.executeQuery(sql);
                    while (resultSet.next()) {
                        System.out.println("Title: " + resultSet.getString("title") + " Content: " + resultSet.getString("content") + "Author: " + resultSet.getString("author"));
                    }
                    break;
                }
                case 5: {
                    System.out.println("Select id to update");
                    int id = sc.nextInt();
                    System.out.println("Title  book");
                    String name = ac.nextLine();
                    String query = "update book set title = ? where id = ?";
                    PreparedStatement preparedStmt = conn.prepareStatement(query);
                    preparedStmt.setString(1, name);
                    preparedStmt.setInt(2, id);
                    preparedStmt.executeUpdate();

                    conn.close();
                    System.out.println("Update success");
                    break;

                }
                case 6: {
                    System.out.println("Select id to remove");
                    int id = sc.nextInt();
                    String sql = "DELETE FROM book WHERE id=" + id;
                    statement.execute(sql);
                    System.out.println("Remove success");
                    break;
                }
            }
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}

