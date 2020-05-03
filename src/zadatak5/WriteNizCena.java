package zadatak5;

import java.io.*;

public class WriteNizCena {

    public static void main(String[] args) {
        NizCena j = new NizCena();
        j.DodajCenuProizvoda(123.0);
        j.DodajCenuProizvoda(234.55);
        j.DodajCenuProizvoda(301.0);
        j.DodajCenuProizvoda(5000.0);
        
        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cene.txt")));
            out.print("Cene veće od 300: ");
            for(int i =0; i < j.nizCena.size() ; i++){
                if (j.nizCena.get(i).getValue() > 300.0){
                    out.print (j.nizCena.get(i).getValue() + ", ");
                }
            }
            out.println();
            out.println("Razlika između najviše i najniže cene je: " + j.RazlikaMaxIMinCene());
            out.close();
        }
        
        catch (Exception e){
            System.out.println("Greška:" + e.getMessage());
        }
    }
}