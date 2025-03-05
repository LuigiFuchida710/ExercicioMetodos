public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentarSalario(double percentual) {
        double aumento = this.salario * (percentual / 100);
        this.salario += aumento; 
    }

    public void consultarDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: R$" + String.format("%.2f", this.salario)); 
    }
}
