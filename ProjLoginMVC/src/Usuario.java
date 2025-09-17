public class Usuario {
    public String login;
    public String senha;
    
    //Validando se o login e senha estão certos
    public boolean Validar(){
        if (this.login.equals("Edu") && this.senha.equals("1234")){
            return true;
        } else{
            return false;
        }
    }
    
}
