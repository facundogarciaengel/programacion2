package recorridoMatrices;

public class algunaColumnaPar {

    public static boolean esPar(int n){
        //Devuelve true si el n es par
        return n%2 == 0; 
    }

    public static boolean columnaPar(int [][] mat, int c){
        boolean acumCol = true;
        for(int f = 0; f < mat.length; f++){
            acumCol = acumCol && esPar(mat[f][c]);
    }
    return acumCol; 
}
   //primero tengo que recorrer un ciclo en mat[i][0] 
   //segundo tengo que recorrer un ciclo en mat[i+1][0]

   //tercero tengo que recorrer un ciclo en mat[i][1]
   //cuarto tengo que recorrer un ciclo en mat[i+1][1]


   //quinto tengo que recorrer un ciclo en mat[i][2]
   //sexto tengo que recorrer un ciclo en mat[i+1][2]

   public static boolean  algunaColumnaEsPar(int [][] mat){
    boolean acumfinal = false;
    for(int c = 0; c<mat[0].length; c++){
      acumfinal = acumfinal || columnaPar(mat, c);
    }
    return acumfinal; 
   }



    public static void main(String [] args){
        int [][] mat = {
             {1,3,4},
             {2,4,6}   
        };
        System.out.println(algunaColumnaEsPar(mat));
    }
}


//[][][] 1 - c=0,f=0;       3 - c=1,f=0;       5  -   c=2, f=0  
//[][][] 2 - c=0,f=1;       4 - c=1,f=1;       6  -    c=2, f=1