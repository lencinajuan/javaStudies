//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //System.out.println("Esse é o Screen Match");
        //System.out.println("FIlme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        //System.out.println("Ano de Lançamento: " + anoDeLancamento);

        boolean incluidoNoPlano = true;
        double notaDoFIlme = 8.1;

        //Média calculada por 3 notas
        double media = (9.8 + 6.3 + 8.0) / 3;
        //System.out.println(media);

        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom
                Ano de Lançamento
                """ + anoDeLancamento;
        //System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);


    }
}