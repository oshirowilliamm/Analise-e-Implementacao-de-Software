
import javax.swing.JOptionPane;

public class ControleLogin {
    Usuario usuario = new Usuario();
    
    public void Logar(String login, String senha){
        usuario.login = login;
        usuario.senha = senha;
        boolean status = usuario.Validar();
        
        if (status == true){
            new FormSistema().setVisible(true);
        } else{
            JOptionPane.showMessageDialog(null, "Login ou senha incorretos. Tente Novamente");
            new FormLogin().setVisible(true);
        }
    }
}
