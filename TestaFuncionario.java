public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João da Silva", 2500.00);
        Funcionario funcionario2 = new Funcionario("Maria Oliveira", 3500.00);

        System.out.println("Dados do Funcionário 1:");
        funcionario1.consultarDados(); 
        System.out.println("\nDados do Funcionário 2:");
        funcionario2.consultarDados(); 


        funcionario1.aumentarSalario(10); // Aumenta o salário em 10%

        System.out.println("\nDados do Funcionário 1 após aumento:");
        funcionario1.consultarDados(); 
    }
}
