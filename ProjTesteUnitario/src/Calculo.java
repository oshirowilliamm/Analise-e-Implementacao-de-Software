public class Calculo {
    
    public double Media(double n1, double n2){
        return (n1 + n2) / 2;
    }
    
    public int MaiorNum(int n1, int n2, int n3){
        return Math.max(n1, Math.max(n2, n3));
        
    }
    
    public boolean Par(int num){
        return num % 2 == 0;
    }
    
}
