 class ReajusteSalario {
    public static void main(String[] args) {
        // Salário atual do colaborador
        double salarioAtual = 1500.0; 
        
        double percentualAumento;
        
        if (salarioAtual <= 280) {
            percentualAumento = 20;
        } else if (salarioAtual <= 700) {
            percentualAumento = 15;
        } else if (salarioAtual <= 1500) {
            percentualAumento = 10;
        } else {
            percentualAumento = 5;
        }
        
        double aumento = (percentualAumento / 100) * salarioAtual;
        double novoSalario = salarioAtual + aumento;
        
        System.out.println("Salário antes do reajuste: R$ " + salarioAtual);
        System.out.println("Percentual de aumento aplicado: " + percentualAumento + "%");
        System.out.println("Valor do aumento: R$ " + aumento);
        System.out.println("Novo salário após o aumento: R$ " + novoSalario);
    }
}
