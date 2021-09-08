/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploquicksort;

/**
 *
 * @author user
 */
public class EjemploQuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Arreglo a ordenar
        int[] arreglo = {9,5,6,2,1,12,4,12,42,10};
        
        // Mostramos el arreglo inicial
        imprimirArreglo(arreglo);
        
        //Llamada al metodo para ordenar el arreglo
        //Aqui se ponen los limites del arreglo que en este caso son
        //Diez valores del 0 al 9
        quicksort(arreglo,0,9);
        
        //Mostramos el arreglo final
        imprimirArreglo(arreglo);
    }
    public static void quicksort(int[] arreglo, int izq, int der){
        //PIVOTE
        int pivote = arreglo[izq];
    
        //Los elementos > al pivote van a la derecha,
        //Los elementos < al pivote van a la izquierda
        //variables auxiliares
        int i=izq;
        int j=der;
        int swap;
    
        //Se evaluan los elementos para ubicar el nuevo pivote
        while(i<j){
            //Mientras que arreglo[i] sea menor que al pivote se aumenta i
            //Cuando no se cumpla el while el elemento es mayor al pivote
            //y debera ir a la derecha
            while(arreglo[i]<=pivote && i<j){
                i++;
            }
            //Mientras que arreglo[j] sea mayor al pivote se disminuye j
            //Cuando no se cumpla el while el elemento es menor al pivote
            // y debera ir a la izquierda
            while(arreglo[j]>pivote){
                j--;
            }
            //Siempre y cuando i sea menor a j se hace un intercambio de elementos
            if(i<j){
                swap = arreglo[i];
                arreglo[i]=arreglo[j];
                arreglo[j]=swap;
                
                //Imprimimos el nuevo arreglo despues del intercambio
                imprimirArreglo(arreglo);
            }
        }
        arreglo[izq] = arreglo[j];
        arreglo[j]=pivote;
        
        if(izq<j-1){
            quicksort(arreglo, izq, j-1);
        }
        if(j+1<der){
            quicksort(arreglo, j+1,der);
        }
    }
    
    public static void imprimirArreglo(int[] arreglo){
        for(int i=0; i<arreglo.length;i++){
            System.out.println(arreglo[i]+" ");
        }
        System.out.println("");
        System.out.println("------------------------");
    }
}
