package magno_toniolo.exercicio20201013;

public class Desconto {
    private Double desconto;

    public Desconto(Double desconto) {
        this.desconto = desconto;
        if (desconto > 100.00 | desconto < 0.00 | desconto == null) {
            throw new RuntimeException("Digite um valor de desconto válido, entre 0% e 100%");
        }
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Double getDesconto() {
        return desconto;
    }

}
