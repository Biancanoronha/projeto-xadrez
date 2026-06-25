class Tabuleiro {
    private String[][] casas = new String[8][8];

    public Tabuleiro() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                casas[i][j] = "   ";
            }
        }
        colocarPecas();
        mostrar();
    }

    public void colocarPecas() {
        // Exemplo de peças (pode expandir se quiser)
        casas[0][0] = "T1b";
        casas[0][1] = "H1b";
        casas[0][2] = "B1b";
        casas[0][3] = "Q0b";
        casas[0][4] = "K0b";
    }

    public void mostrar() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("[" + casas[i][j] + "]");
            }
            System.out.println();
        }
    }

    public boolean acabouOJogo() {
        return false;
    }
}