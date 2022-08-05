import java.util.ArrayList;
import java.util.List;

public class Vendas {
    private String cpfVendedor;
    private String cpfCliente;
    private String dataRegistroDaVenda;
    private double valorVenda;

    Vendedor vendedor = new Vendedor();

    Validacoes validacoes = new Validacoes();
    Cliente cliente = new Cliente();

    List<Vendas> listaDeVendas = new ArrayList<>();


    public Vendas(String cpfVendedor, String cpfCliente, String dataRegistroDaVenda, double valorVenda) {
        this.cpfVendedor = cpfVendedor;
        this.cpfCliente = cpfCliente;
        this.dataRegistroDaVenda = dataRegistroDaVenda;
        this.valorVenda = valorVenda;
    }


    public Vendas() {

    }

    public void cadastrarVenda(String cpfVendedor, List<Usuario> listaDeVendedores,String cpfCliente, List<Usuario> listaDeClientes, String dataRegistroDaVenda, double valorVenda) {
        Boolean cpfVendedorExistente = validacoes.procurarCpf(listaDeVendedores, cpfVendedor);
        Boolean cpfClienteExistente = validacoes.procurarCpf(listaDeClientes, cpfCliente);
        if (Boolean.FALSE.equals(cpfVendedorExistente)) {
            System.out.println("Erro, efetue o cadastro do vendedor antes de cadastrar uma venda");
        } else if (Boolean.FALSE.equals(cpfClienteExistente)) {// possível problema? (perguntar para a Grazi)
            System.out.println("Erro, efetue o cadastro do cliente antes de cadastrar uma venda");
        } else {
            Vendas vendas = new Vendas(cpfVendedor, cpfCliente, dataRegistroDaVenda, valorVenda);
            listaDeVendas.add(vendas);
            System.out.println("O cadastrado da sua venda foi efetuado com sucesso");
        }


    }

    public void listarVenda() { // possível problema? (perguntar para a Grazi)
        for (Vendas vendas : listaDeVendas) {
            System.out.println("Cpf do vendedor: " + vendas.getCpfVendedor());
            System.out.println("Data de registro da venda: " + vendas.getDataRegistroDaVenda());
            System.out.println("Cpf do cliente: " + vendas.getCpfCliente());
            System.out.println("Valor da venda: " + vendas.getValorVenda());
            System.out.println();
        }
    }

    public String getCpfVendedor() {
        return cpfVendedor;
    }

    public void setCpfVendedor(String cpfVendedor) {
        this.cpfVendedor = cpfVendedor;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
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

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Vendas> getListaDeVendas() {
        return listaDeVendas;
    }

    public void setListaDeVendas(List<Vendas> listaDeVendas) {
        this.listaDeVendas = listaDeVendas;
    }
}



