package projfuncionarioheranca1;


public class Mensalista extends Funcionario{
    
    public double salbruto;
    public double desconto;
    
    public double CalcularSalario() {
        return this.salbruto - this.desconto;
    }
    
}
