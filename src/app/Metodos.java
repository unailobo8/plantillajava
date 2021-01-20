package app;

public class Metodos{
    public String metodo1(int numero){
        
        if(numero % 15 == 0){
            return " Facebook ";
        }else{
            if(numero % 5 ==0){
                return " Book ";
            }else{
                if (numero % 3 ==0){
                    return " Face ";
                }else{
                    return String.valueOf(numero);
                }
            }
        }

    }

    public String metodo2(int[] numero2){
        String frase ="";
        for(int i=0; i<numero2.length; i++){
            frase = frase + metodo1(numero2[i]);
        }
        return frase;
    }

}