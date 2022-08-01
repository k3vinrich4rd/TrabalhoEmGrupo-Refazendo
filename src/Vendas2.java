import java.util.ArrayList;
import java.util.List;

public class Vendas2 implements Listar{
    private String DataDeRegistroDaVenda;
    List<Usuario> listaDeVendedores = new ArrayList<>();
    private double precoDoProduto;


    public Vendas2(String dataDeRegistroDaVenda, double precoDoProduto) {
        DataDeRegistroDaVenda = dataDeRegistroDaVenda;
        this.precoDoProduto = precoDoProduto;
    }

    public Vendas2(){

    }

    public void cadastrarVenda(){

    }
    @Override
    public void listarUsuario() {

    }

    public String getDataDeRegistroDaVenda() {
        return DataDeRegistroDaVenda;
    }

    public void setDataDeRegistroDaVenda(String dataDeRegistroDaVenda) {
        DataDeRegistroDaVenda = dataDeRegistroDaVenda;
    }

    public double getPrecoDoProduto() {
        return precoDoProduto;
    }

    public void setPrecoDoProduto(double precoDoProduto) {
        this.precoDoProduto = precoDoProduto;
    }


}
