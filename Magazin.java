import java.io.*;

public class Magazin implements Serializable{
    Produs[] produse = new Produs[100];
    int n;
    
    public void adaugaProdus(Produs p) throws PMPException{
        if(n<100){
            produse[n] = p;
            n++;
        }else{
            throw new PMPException();
        }
    }
    
    public void stergeProdus(String serie){
        for(int i=0;i<n;i++){
            if(produse[i].serie.equals(serie)){
                for(int j = i;j<n-1;j++){
                    produse[j] = produse[j+1];
                }
                produse[n-1] = null;
                n--;
                break;
            }
        }
    }
    
    public void afisareProduse(){
        for(int i=0;i<n;i++){
            System.out.println(produse[i]);
        }
    }
    
    public void afisareCiocolate(){
        for(int i=0;i<n;i++){
            if(produse[i] instanceof Ciocolata){
                System.out.println(produse[i]);
            }
        }
    }
    
    public void salvare(String fisier){
        try{
            ObjectOutputStream out = 
                new ObjectOutputStream(
                    new FileOutputStream(fisier)
                );
            out.writeObject(this);
            out.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
