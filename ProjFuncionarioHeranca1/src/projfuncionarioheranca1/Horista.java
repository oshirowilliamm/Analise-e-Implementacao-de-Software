package projfuncionarioheranca1;

public class Horista extends Funcionario {
    public double valorHora;
    public int numHora;
    
    public double CalcularSalario(){
        return this.valorHora * this.numHora;
    }
    
}
