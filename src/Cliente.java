import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario {

    List<Usuario> listaDeClientes = new ArrayList<>();
    Validacoes validacoes = new Validacoes();

    public Cliente(String nome, String email, String cpf) {
        super(nome, email, cpf);
    }

    public Cliente() {

    }

    @Override
    public void cadastrarUsuario(String nome, String email, String cpf) {
        Boolean cpfExistente = validacoes.procurarCpf(listaDeClientes, cpf);
        if (Boolean.FALSE.equals(cpfExistente)) {
            Usuario cliente = new Cliente(nome, email, cpf);
            listaDeClientes.add(cliente);
            System.out.println("O seu cadastrado foi efetuado com sucesso.\n");
        } else {
            System.out.println("ERRO: Cliente já cadastrado(a).");
        }
    }


    @Override
    public void listarUsuario() {
        for (Usuario listaDeCliente : listaDeClientes) {
            System.out.println("Nome do cliente: " + listaDeCliente.getNome());
            System.out.println("E-mail do cliente: " + listaDeCliente.getEmail());
            System.out.println("Cpf do cliente: " + listaDeCliente.getCpf());
            System.out.println();
        }
    }

    public List<Usuario> getListaDeClientes() {
        return listaDeClientes;
    }

    public void setListaDeClientes(List<Usuario> listaDeClientes) {
        this.listaDeClientes = listaDeClientes;
    }
}
