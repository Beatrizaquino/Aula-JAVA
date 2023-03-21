public class Conta {
    public float saldo;
    public Boolean status;
    public int numero;

    //retonando obrigatoriamente um valor verdadeiro ou falso para saber se a verificação tem um resultado desejado
    public Boolean Sacar(float valor) {
        //necessário verificar o saque
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
        
    }

    public void Depositar(float valor) {
        this.saldo += valor;
    }
}
