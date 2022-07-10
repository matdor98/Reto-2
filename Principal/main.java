package Principal;
import Modelo.Conexion;
import Vistas.*;

public class main {

    public static void main(String[] args) {
        
        Conexion conexion = new Conexion();
        conexion.getConnection();
        Login login = new Login();
        login.setVisible(true);
    }
}
