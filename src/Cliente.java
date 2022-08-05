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
        Boolean emailExistete = validacoes.procurarEmail(listaDeClientes, email);
        if (!email.contains("@")) {
            System.out.println("Erro: E-mail inválido");
        } else if (Boolean.TRUE.equals(cpfExistente)) {
            System.out.println("Erro: cpf já cadastro");
        } else if (Boolean.TRUE.equals(emailExistete)) {
            System.out.println("Erro: E-mail já cadastrado");
        } else {
            Usuario cliente = new Cliente(nome, email, cpf);
            listaDeClientes.add(cliente);
            System.out.println("O seu cadastrado foi efetuado com sucesso.\n");
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
