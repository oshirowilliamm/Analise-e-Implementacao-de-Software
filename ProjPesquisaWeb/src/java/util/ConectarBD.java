
package util;

import java.sql.*;

public class ConectarBD {
    Connection conexao;

    public void Conectar(){
      try{
       String usuario="root";
       String senha="";
       String servidor = "localhost:3306";
       String banco="bdnotaalunos";
       String driver = "com.mysql.cj.jdbc.Driver";
       Class.forName(driver);
       String url = "jdbc:mysql://" + servidor + "/" + banco+"?useTimezone=true&serverTimezone=UTC"; // a JDBC url
       conexao = DriverManager.getConnection(url,usuario,senha);

      }
      catch (ClassNotFoundException e){
          System.out.println("Driver não encontrado");   
      }
      catch (Exception e){
          System.out.println("Erro ao conectar Banco");
      }
    
}
}
