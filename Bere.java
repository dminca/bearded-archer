public class Bere extends Produs{
    double pa;
    
    public Bere(String serie, double pret, double pa){
        this.serie = serie;
        this.pret = pret;
        this.pa = pa;
    }
    
    public String toString(){
        return "BERE: "+serie+" "+pret+" "+pa;
    }
}
