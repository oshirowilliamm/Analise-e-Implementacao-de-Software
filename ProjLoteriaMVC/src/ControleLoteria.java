
import javax.swing.JOptionPane;

public class ControleLoteria {
    Loteria lot = new Loteria();
    
    public void CadastrarNumeros(int num1, int num2, int num3){
        lot.num1 = num1;
        lot.num2 = num2;
        lot.num3 = num3;
    }
    
    public int Sortear1(){
        int s1 = (int)(Math.random() * 21);
        return s1;
    }
    
    public int Sortear2(int s1){
        int s2;
        
        do{
            s2 = (int)(Math.random() * 21);
        } while (s2 == s1);
        
        return s2;
    }
    
    public int Sortear3(int s1, int s2){
        int s3;
        
        do{
            s3 = (int)(Math.random() * 21);
        } while (s3 == s1 || s3 == s2);
        
        return s3;
    }
    
    public int Resultado(int s1, int s2, int s3){
        int numAcertos = 0;
        
        if (lot.num1 == s1 || lot.num1 == s2 || lot.num1 == s3){
           numAcertos++;
        }
        if (lot.num2 == s1 || lot.num2 == s2 || lot.num2 == s3){
           numAcertos++;
        }
        if (lot.num3 == s1 || lot.num3 == s2 || lot.num3 == s3){
           numAcertos++;
        }
        
        return numAcertos;
    }
    
    public double Premiar(int numAcertos){
        return numAcertos * 1000;
    }
}
