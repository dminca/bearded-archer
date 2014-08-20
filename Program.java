import java.io.*;

public class Program{
    static Magazin m = new Magazin();
    public static void main(String [] args){
        try{
            BufferedReader cons = new BufferedReader(
                new InputStreamReader(System.in)
            );
            
            String cmd = "";
            
            while(true){
                System.out.print("Comanda: ");
                cmd = cons.readLine();
                String [] v = cmd.split("\\s+");
                
                switch(v[0]){
                    case "exit": System.exit(0);
                    case "ap":
                        
                        String serie = v[2];
                        double pret = Double.parseDouble(v[3]);
                        if(v[1].equals("b")){
                            double pa = Double.parseDouble(v[4]);
                            m.adaugaProdus(
                                new Bere(serie,pret,pa)
                            );
                        }
                        
                        if(v[1].equals("c")){
                            int kcal = Integer.parseInt(v[4]);
                            m.adaugaProdus(
                                new Ciocolata(serie,pret,kcal)
                            );
                        }
                        System.out.println("A fost adaugat produsul!");
                    break;
                    
                    case "afisare":
                        m.afisareProduse();
                    break;
                    
                    case "afisarec":
                        m.afisareCiocolate();
                    break;
                    
                    case "sp":
                        m.stergeProdus(v[1]);
                    break;
                    
                    case "salvare":
                        m.salvare(v[1]);
                    break;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
