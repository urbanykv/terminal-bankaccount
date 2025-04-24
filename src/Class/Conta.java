package Class;

public class Conta {
    private String NomeCliente;
    private int NumeroConta;
    private String Agencia;
    private double Saldo;

    public Conta(String NomeCliente, int NumeroConta, String Agencia, double Saldo) {
        this.NomeCliente = NomeCliente;
        this.NumeroConta = NumeroConta;
        this.Agencia = Agencia;
        this.Saldo = Saldo;
    }

    public String ApresentarDados() {
        return "Olá, " + this.NomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + this.Agencia + ", conta " + this.NumeroConta + " e seu saldo " + this.Saldo + " já está disponível para saque.";
    };
};