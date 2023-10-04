 class VerificarPrimo {
    public static void main(String[] args) {
        System.out.print("Digite um número para verificar se é primo: ");
        int numero = 16; 
        
        boolean ehPrimo = true;
        
        //verificando
        if (numero <= 1) {
            ehPrimo = false;
        } else {
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }
        
        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}
