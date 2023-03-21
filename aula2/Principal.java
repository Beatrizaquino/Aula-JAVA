package aula2;
public class Principal {
    //metodo que vai ser executado antes de tudo
    public static void main(String[] args) {
        
        Prof lucas = new Prof();
        lucas.nome = "Lucas Matto";
        lucas.cpf = " 082.037.651-57";
        System.out.println(lucas.nome + lucas.cpf); 
    }

    
}
