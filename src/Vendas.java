public class Vendas {
    private String dataRegistroDaVenda;
    private double valorVenda;

    public Vendas(String dataRegistroDaVenda, double valor) {
        this.dataRegistroDaVenda = dataRegistroDaVenda;
        this.valorVenda = valor;
    }

    public String getDataRegistroDaVenda() {
        return dataRegistroDaVenda;
    }

    public void setDataRegistroDaVenda(String dataRegistroDaVenda) {
        this.dataRegistroDaVenda = dataRegistroDaVenda;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValor(double valor) {
        this.valorVenda = valor;
    }
}
