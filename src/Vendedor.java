import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Usuario{
    public Vendedor(String nome, String email, String cpf) {
        super(nome, email, cpf);
    }
    public Vendedor(){

    }
    List<Usuario> listaDeVendedores = new ArrayList<>();

    @Override
    public void listarUsuario() {

    }

    @Override
    public void cadastrarUsuario(String nome, String email, String cpf) {
        Boolean cpfExistente = procurarCpf(listaDeVendedores, cpf);
        if (Boolean.FALSE.equals(cpfExistente)) {
            Usuario vendedor = new Vendedor(nome, email, cpf);
            listaDeVendedores.add(vendedor);
            System.out.println("O seu cadastrado foi efetuado com sucesso.\n");
        } else {
            System.out.println("ERRO: Vendedor(a) já cadastrado(a).");
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
}
