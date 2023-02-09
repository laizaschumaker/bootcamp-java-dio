public class Comentarios {

public static void main(String[] args) {
    
}

    // Olá, eu sou um comentário em uma única linha.

    /* Comentário com múltiplas linhas:
    * Atenção: Não devemos usar comentários
    * para compensar a falta de coerência
    * no código ou substituir boas práticas.
    */

    /** 
    * As duas estrelinhas acima
    * são para identificar que você
    * pretende elaborar um comentário
    * a nível de documentação.
    * Que incrível!
    */

    /* 
    * ABAIXO, UM EXEMPLO DO QUE NÃO SE DEVE FAZER!
    * Este método foi elaborado as pressas
    * por isso eu abrevei o nome das variáveis
    * mas olha, ele tem a finalidade de somar ou  multiplicar
    * dois números
    */

    public int somaMultiplica (int n, int x, String m){
        int r = 0; // r é igual ao resultado
        if (m == "M"){ // M= multiplicação
            r= n * x;
        }else{
            // se não soma mesmo
            r = n + x;
        }
        return r;
    }

}
