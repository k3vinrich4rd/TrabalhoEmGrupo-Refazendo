import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario {

    List<Usuario> listaDeClientes = new ArrayList<>();

    public Cliente(String nome, String email, String cpf) {
        super(nome, email, cpf);
    }

    public Cliente() {

    }

    @Override
    public void cadastrarUsuario(String nome, String email, String cpf) {
        Boolean cpfExistente = procurarCpf(listaDeClientes, cpf);
        if (Boolean.FALSE.equals(cpfExistente)) {
            Usuario cliente = new Cliente(nome, email, cpf);
            listaDeClientes.add(cliente);
            System.out.println("O seu cadastrado foi efetuado com sucesso.\n");
        } else {
            System.out.println("ERRO: Cliente j� cadastrado(a).");
        }
    }

    public Boolean procurarCpf(List<Usuario> listaUsuarios, String cpf) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
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


}
