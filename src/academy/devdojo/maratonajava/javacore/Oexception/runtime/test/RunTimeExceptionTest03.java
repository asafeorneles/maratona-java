package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();
    }

    private static String abreConexao(){
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexao aberta";
        }catch(RuntimeException e){
            e.printStackTrace();
        }
        finally{
            System.out.println("Fechando recurso liberado pelo SO        ");
        }
        return null;
    }
}
