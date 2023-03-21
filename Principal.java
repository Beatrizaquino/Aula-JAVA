//objeto é uma - representação do mundo real, eu pessoa tenho atributos d eindentificação logo posso me transformar em objeto 
//o que é classe - pode se dizer que é uma forma para construção de um objeto
// variavel um espaço alocado na memoria
public class Principal {
    public static void main(String[] args) {
        PF pessoafisica = new PF();
        Endereco endereco = new Endereco();
        Conta conta = new Conta();

        endereco.rua = "João Demetrio";
        endereco.numero = 31;
        endereco.bairro = "Jardim das Oliveiras";
        endereco.cep = 783900;
        endereco.cidade = "Vilhena";
        endereco.estado = "Rondônia";

        conta.numero = 202210405;
        conta.status = true;


        pessoafisica.nome = "Beatriz";
        pessoafisica.endereco = endereco;
        pessoafisica.cpf = " 082.037.651-57" ;
        pessoafisica.conta = conta;
        System.out.println(pessoafisica.endereco);
    }
}
