package recorridoMatrices;

public class algunaColumnaPar {
    public static boolean esPar(int n){
        //Devuelve true si el n es par
        return n%2 == 0; 
    }
    public static boolean columnaPar(int [] col) {
        boolean colPar= true;
        for(int c = 0; c < col.length; c++){
            colPar = colPar && esPar(col[c]);
        }
        return colPar;
    }    
    public static boolean algunaColumnaEsPar(int [][] mat){
        boolean acumFinal = false; 
        if(mat == null || mat.length == 0){
            return true;
        }
        for(int c = 0; c <mat[0].length; c++){
            if (mat[0].length == 0) {
                return true;
            }

        }
        return true; 
    }
    
    public static void main(String [] args){
        int [][] mat = {
             {1,3,5},
             {2,4,6}   
        };
        System.out.println(algunaColumnaEsPar(mat));
    }
}
