public class Produto {
    private String nome;
    private float valor;
    private String pesoDigitado;
    private float peso;

    public Produto(String nome, float valor, String pesoDigitado) {
        this.nome = nome;
        this.valor = valor;
        setPesoDigitado(pesoDigitado);
    }

    public String getNome() {
        return nome;
    }

    public float getValor() {
        return valor;
    }

    public float getPeso() {
        return peso;
    }

    public void setPesoDigitado(String pesoDigitado) {
        if (pesoDigitado == null || pesoDigitado.trim().isEmpty()) {
            throw new IllegalArgumentException("Peso não pode ser nulo ou vazio.");
        }

        this.pesoDigitado = pesoDigitado.trim().toLowerCase();
        this.peso = converteGramas();
    }

    private float converteGramas() {
        if (pesoDigitado.endsWith("kg")) {
            float kg = Float.parseFloat(pesoDigitado.replace("kg", "").trim());
            return kg * 1000;
        } else if (pesoDigitado.endsWith("g")) {
            return Float.parseFloat(pesoDigitado.replace("g", "").trim());
        } else {
            throw new IllegalArgumentException("Formato inválido! Use 'kg' ou 'g'.");
        }
    }
}
