package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImprimeEstudante {
    public void imprimirEstudante(Estudante estudante) {
        estudante.nome = "Tsunade Gostosa";

        /* Quando modificamos uma variavel referencia dentro de um metodo por exemplo, estamos
        alterando o valor diretamente no endereço de memória, na raiz., então,
        se printarmos no main o estudante.nome de forma separada, sera printado "Tsunade Gostosa"
        pois a variavel foi alterada de forma definitiva na raiz.*/

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
    public void imprimeEstudante (String nome, int idade, char sexo) {
        nome = "Tsunade Gostosa";
        idade = 26;
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(sexo);

    }


}
