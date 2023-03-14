package aula1;
public class Principal {

    public static void main(String[] args) {

        Filme filme1 = new Filme();
        filme1.setTitulacao("Titulo: Barbie ");
        filme1.setSinopse(" .Este é um filme muito legal para se assistir");
        filme1.setDuracao(120);
        filme1.setAno(2022);
        System.out.println("O filme " + filme1.getTitulacao() + filme1.getSinopse() + ". Tem duração de "
        + filme1.getDuracao() + " minutos e foi lançado em " + filme1.getAno());

        Filme filme2 = new Filme();
        filme2.setTitulacao("Barbie e as sapatilhas magicas ");
        filme2.setSinopse(" conta a bela historia de uma bailarna");
        filme2.setDuracao(150);
        filme2.setAno(2002);
        System.out.println("O filme " + filme2.getTitulacao() + filme2.getSinopse() + ". Tem duração de "
        + filme2.getDuracao() + " minutos e foi lançado em " + filme2.getAno());

    }

}
