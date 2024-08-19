package recorridoMatrices;

public class algunaFilaPar {
    //al menos una fila con todos sus elementos pares
public static boolean esPar(int n){
    //Devuelve true si el n es par
    return n%2 == 0; 
}

    public static boolean filaPar(int [] fila){
        //Devuelve true si el arreglo es par 
        boolean acum1 = true; 
        for(int i=0; i<fila.length; i++){
            acum1 = acum1 && esPar(fila[i]) ; 
        }
        return acum1; 
    }

    public static boolean algunaFilaEsPar(int [][] mat){
        //se fija si la matriz esta vacia es null o no tiene columnas 
    
        boolean acumFinal = false; 

        //si esta vacia o null da true
        if (mat == null || mat.length == 0) {
            return true;
        }
        //ver si las filas de la matriz tienen columnas 
        for(int f=0; f<mat.length; f++){
            if(mat[f].length == 0){
                return true; 
            }
            acumFinal = acumFinal || filaPar(mat[f]);
        }        
        return acumFinal; 
    }

    public static void main(String[] args){
        int [][] mat = {
            {1,1,11}, 
            {1,1,11}
        };
        System.out.println(algunaFilaEsPar(mat));
    }
}
