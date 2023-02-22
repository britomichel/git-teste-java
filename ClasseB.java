public class ClasseB {
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // branch-alternativo (version)
    public String toString() {
        return String.valueOf(idade);
    }
}
