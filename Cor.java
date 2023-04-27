package trabalhoCarro;


public class Cor {
    private static final String[] listaCor= new String[7];

    public Cor(){
        listaCor[0]="azul";
        listaCor[1]="Amarelo";
        listaCor[2]="Verde";
        listaCor[3]="Vermelho";
        listaCor[4]="Rosa";
        listaCor[5]="Lilás";
        listaCor[6]="Violeta";

    }


    public void listacores(){
        for (int i=0; i<listaCor.length; i++){
            if( listaCor[i] != null) {
                System.out.println("Cod = " + i + ", Cor: " + listaCor[i]);
            }
        }
    }

    public  String getCor(int cod){

        return listaCor[cod];
    }




}