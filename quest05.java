class SerieFibonacci {
    public static void main(String[] args) {
        int numeroAnterior = 0;
        int numeroAtual = 1;

        System.out.println("Os primeiros números da série de Fibonacci até passar de 100 são:");

        while (numeroAnterior <= 100) {
            System.out.print(numeroAnterior + " ");

            int proximoNumero = numeroAnterior + numeroAtual;
            numeroAnterior = numeroAtual;
            numeroAtual = proximoNumero;
        }
    }
}
