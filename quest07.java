 class SequenciaCollatz {
    public static void main(String[] args) {
        int x = 20; 
        
        while (x != 1) {
            System.out.print(x + " -> ");
            
            if (x % 2 == 0) {
                x /= 2; // Se x é par, divida por 2
            } else {
                x = 3 * x + 1; // Se x é ímpar, aplique a fórmula 3x + 1
            }
        }
        
        System.out.println(1); // Imprima o último valor (1)
    }
}
