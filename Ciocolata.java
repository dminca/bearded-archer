public class Ciocolata extends Produs{
    int kCal;
    
    public Ciocolata(String serie, double pret, int kCal){
        this.serie = serie;
        this.pret = pret;
        this.kCal = kCal;
    }
    
    public String toString(){
        return "CIOCOLATA: "+serie+" "+pret+" "+kCal;
    }
}
