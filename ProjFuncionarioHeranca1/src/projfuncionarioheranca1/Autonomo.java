package projfuncionarioheranca1;

public class Autonomo extends Funcionario {
    public double totalVendas;
    public double porcVendas;
    
    public double CalcularSalario(){
        return this.totalVendas * (this.porcVendas / 100);
    }
    
}
