 class TabelaEncadeada {
    public static void main(String[] args) {
        int linhas = 7; // Você pode alterar o número de linhas conforme necessário
        
        //i -> linhas e j -> para colunas
        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
