package com.aim.movie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {

    private static final String URL = "jdbc:mysql://localhost:3306/movie";
    private static final String USER = "root";
    private static final String PASS = "Misery88?";

    public static void main( String[] args ) {

        try {

            Connection connection = DriverManager.getConnection(URL, USER, PASS);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from movies");

            while (resultSet.next()) {
                String movieTitle = resultSet.getString("movie_name");
                System.out.println("Movie Title: " + movieTitle);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

            Scanner input = new Scanner(System.in)
            System.out.println("Please enter a movie title: ");
            String movieTitle = input.nextLine();
            input.close();

            String sql = "select movie_name, first_name, last_name from movies m "
                    + "join directors d on d.director_id on m.director_id ",

            StringBuilder sql2 = new StringBuilder();
            sql2.append("select movie_name, first)name, last_name ");
            sql2.append("from movies m ");
            sql2.append("join direcctors d on director_id = m.director_id ");
            sql2.append("join reatings r on r.rating_")
            )        

            Connection connection = DriverManager.getConnection(URL, USER, PASS);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from movies;");

            while(resultSet.next()) {
                String movieTitle = resultSet.getString("movie_name");
                System.out.println("Movie Title: " + movieTitle);
            }

        };
    }

}}
