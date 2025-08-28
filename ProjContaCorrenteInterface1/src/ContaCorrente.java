import javax.swing.JOptionPane;

public class ContaCorrente {
    public String nome;
    private double saldo;
    private int numConta;
    private String banco;
    private int agencia;
    
    //Getters
    public double getSaldo() {
        return this.saldo;
    }
    public int getNumConta() {
        return this.numConta;
    }
    public String getBanco() {
        return this.banco;
    }
    public int getAgencia() {
        return this.agencia;
    }
    
    //Setters
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public void setBanco(String banco) {
        this.banco = banco;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    
    //Functions
    public void Depositar(double valor){
        this.saldo += valor;
        JOptionPane.showMessageDialog(null, "Deposito realizado com Sucesso!!");
    }
    
    public void Sacar(double valor){
        if (valor <= this.saldo){
            this.saldo -= valor;
            JOptionPane.showMessageDialog(null, "Saque realizado com Sucesso!!");
        }else{
             JOptionPane.showMessageDialog(null, "Saldo insuficiente!!");
        }
    }
    
    public double ConsultaSaldo(){
        return this.saldo;
    } 
}
