public class AtivPratica {
    
    public int Maior(int n1, int n2, int n3, int n4, int n5){
        return Math.max(n1, Math.max(n2, Math.max(n3, Math.max(n4, n5))));
    }
    
    public boolean Multiplo(int num){
        return num % 10 == 0;
    }
    
    public double MediaNormal(double n1, double n2, double n3, double n4, double n5){
        return (n1 + n2 + n3 + n4 + n5) / 5;
    }
    
    public double MediaPond(double port, double mat, double atual){
        return ((port * 1) + (mat * 2) + (atual * 3)) / (1 + 2 + 3);
    }
}
