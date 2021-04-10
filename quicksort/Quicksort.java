import java.util.*;

public class Quicksort{


    public static double[] quickSort (double[] lista, int izq, int dcha){
             
        int primero = izq;
        int ultimo = dcha;
        int pivote = lista[primero];

        while (primero < ultimo){
            while(lista[primero] < pivote){ primero++; }
            while(lista[ultimo] > pivote){ ultimo--; }

            if (primero <= ultimo){
                int aux = lista[ultimo];
                lista[ultimo] = lista[primero];
                lista[primero] = aux;
                primero++;
                ultimo--;
            }
        }
      
   
            if (izq < ultimo){
                quickSort(lista, izq, ultimo);
            }

            if (primero < dcha){
                quickSort(lista, primero, dcha);
            }

            return lista;
        }   
    

    public static void main(String[] args) {

        double [] lista = {3, 1, 5, 6, 2, 0, 9};
        double [] res = quickSort(lista, 0, lista.length-1);
       
        for (int x : res){
            System.out.println(x);
        }

    }
}