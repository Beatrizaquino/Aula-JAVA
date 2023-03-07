public class Principal {
 
    public static void main(String[] args) {
        
        Filme filme1 =  new Filme();  
        filme1.setTitulacao("Titulo: Barbie ");
        filme1.setSinopse(" Sinopse: Este é um filme muito legal para se assistir");
        filme1.setDuracao(120);
        filme1.setAno(2022);
        System.out.println("O filme" + filme1.getTitulacao() + ". " + filme1.getSinopse() + ". Tem duração de "  + filme1.getDuracao() + " minutos e foi lançado em " + filme1.getAno());
         
    }

    

    
}
