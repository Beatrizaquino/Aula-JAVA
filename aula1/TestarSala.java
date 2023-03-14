package aula1;
public class TestarSala {
    
    public static void main(String[] args) {
        
        Sala sala1 = new Sala();
        sala1.setDescricao("Sala cheia e barulhenta. ");
        sala1.setlocalizacao("IFRO - Campus Vilhena/RO .");
        sala1.setqtdcadeira(23);
        sala1.setTipoDeTela(" Não sei o que é isso");
        System.out.println(sala1.getDescricao() + "Lozalizada " + sala1.getLocalizacao() + " Com" + sala1.getQtdCadeiras() + "cadeiras disponiveis. " + sala1.getTipoDeTela());
    }
}
