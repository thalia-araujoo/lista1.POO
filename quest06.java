 class Fatoriais {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int fatorial = calcularFatorial(i);
            System.out.println("O fatorial de " + i + " é " + fatorial);
        }
    }

    public static int calcularFatorial(int n) {
        if (n == 0) {
            return 1;
        }
        
        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
