abstract class Jogador implements JogadorInterface {
    protected char cor;

    public Jogador(char cor) {
        if (cor != 'p' && cor != 'b') {
            throw new IllegalArgumentException("Cor inválida");
        }
        this.cor = cor;
    }
}