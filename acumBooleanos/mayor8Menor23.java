
public class mayor8Menor23 {

    public static boolean todosMayor8(Integer [] lista){
        boolean ret = true; 
        for(int i = 0; i < lista.length; i++){
            ret = ret && lista[i] > 8;
        }
        return ret; 
    }

    public static boolean algunoMenor23(Integer [] lista){
        boolean ret = false;
        for(int i = 0; i < lista.length; i++) {
            ret = ret || lista[i] < 23;
        }
        return ret; 
    }
    public static void main(String[] args){
        Integer [] lista1 = {9,10,11};
        Integer [] lista2 = {90,100,110};
    System.out.println(todosMayor8(lista1) && algunoMenor23(lista1));
    System.out.println(todosMayor8(lista2) && algunoMenor23(lista2));
    
    }
}