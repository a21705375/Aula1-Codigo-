import java.util.ArrayList;
import java.util.HashMap;

//Criação da classe automóvel
class Automovel{
    String marca;
    String modelo;
    String matricula;
    int cilindrada;

    Automovel(String marca, String modelo, String matricula,int cilindrada){
        this.marca=marca;
        this.modelo=modelo;
        this.matricula=matricula;
        this.cilindrada=cilindrada;
    }

    Automovel(){

    }

    public String toString(){
        return "Marca: "+marca+" Modelo: "+modelo+" Matricula: "+matricula+" Cilindrada: "+cilindrada;
    }



}


public class Main {


    public static HashMap<String,Integer> getMap(Automovel automoveis[]){
        HashMap<String,Integer> map=new HashMap<>();
        int count=0;

        for (int i=0;i<automoveis.length;i++){
            if (!map.containsKey(automoveis[i].marca)){
                map.put(automoveis[i].marca,1);
            }else {
                count=map.get(automoveis[i].marca);
                count++;
                map.put(automoveis[i].marca,count);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        Automovel auto1=new Automovel();
        auto1.marca="BMW";
        auto1.modelo="23";
        auto1.matricula="AA-20-EY";
        auto1.cilindrada=1000;
        Automovel auto2=new Automovel("Mercedes", "Benz","AA-20-EY",1500);



        ArrayList<Automovel> automoveisList=new ArrayList<>();
       /* automoveisList.add(auto1);
        automoveisList.add(auto2);
        System.out.println(automoveisList.size());
        */
        Automovel[] automoveis=new Automovel[4];
        Automovel auto3=new Automovel("Audi","A5","AC-23-89",2000);
        Automovel auto4=new Automovel("Audi","Punto","RH-20-89",2550);
        Automovel auto5=new Automovel("Ford","Fiesta","BE-55-84",1000);
        Automovel auto6=new Automovel("Mazda","3S","BD-89-90",20);


        automoveis[0]=auto3;
        automoveis[1]=auto4;
        automoveis[2]=auto5;
        automoveis[3]=auto6;

        for (int i=0;i<automoveis.length;i++){
            System.out.println(automoveis[i]);
        }
        System.out.println();

        ArrayList<Automovel> lista=new ArrayList<>();
        lista.add(auto3);
        lista.add(auto4);
        lista.add(auto5);
        lista.add(auto6);

        short a=0;

        for (Automovel a1:lista){
            System.out.println(a1);
        }

        HashMap<String,Integer> autoMap=new HashMap<>();
        int count=1;
        for (Automovel a1:lista){
            if (!autoMap.containsKey(a1.marca)){
                autoMap.put(a1.marca,1);
            }else {
                count=autoMap.get(a1.marca);
                count++;
                autoMap.put(a1.marca,count);
            }
        }

        System.out.println();

        for (String marca:autoMap.keySet()){
            System.out.println(autoMap.get(marca)+" "+marca);
        }

        HashMap<String,Integer> map=new HashMap<>();
        map=getMap(automoveis);

        System.out.println();

        for (String marca:map.keySet()){
            System.out.println(autoMap.get(marca)+" "+marca);
        }

    }

}
