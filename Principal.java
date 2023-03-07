public class Principal {
 
    public static void main(String[] args) {
        
        Filme filme1 =  new Filme();  
        filme1.setTitulacao("Titulo: Barbie");
        System.out.println(filme1.getTitulacao());

        Filme sinopse1 = new Filme();
        sinopse1.setSinopse("Sinopse: Este é um filme muito legal para se assistir");
        System.out.println(sinopse1.getSinopse());

        Filme duracao = new Filme();
        duracao.setDuracao(120);
        System.out.println(duracao.getDuracao()); 

        Filme ano = new Filme();
        ano.setAno(2022);
        System.out.println(ano.getAno());
         
    }

    

    
}
