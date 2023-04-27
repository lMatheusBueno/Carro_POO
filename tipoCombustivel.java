package trabalhoCarro;

import java.util.Scanner;
public class tipoCombustivel {
    Scanner scanner = new Scanner(System.in);

    private static final String[] listaOp= new String[4];


    public  tipoCombustivel(){
        listaOp[0]="Gasolina";
        listaOp[1]="Alcóol";
        listaOp[2]="Diesel comum";
        listaOp[3]="Gasolina e Alcóol";
    }


    public void listaTipo(){
        for (int i=0; i<listaOp.length; i++){
            if( listaOp[i] != null) {
                System.out.println("Cod = " + i + ": "+listaOp[i]);
            }
        }
    }

    public String getTCombustivel(int cod){

        return listaOp[cod];
    }


}