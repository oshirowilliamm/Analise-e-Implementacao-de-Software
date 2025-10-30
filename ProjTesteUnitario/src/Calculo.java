public class Calculo {
    
    public double CalcularMedia(double n1, double n2){
        return (n1 + n2) / 2;
    }
    
    public int MaiorNum(int n1, int n2){
        if (n1 > n2) {
            return n1;
        }
        else{
            return n2;
        }
    }
    
    public boolean VerificaPar(int num){
        return num % 2 == 0;
    }
    
}
