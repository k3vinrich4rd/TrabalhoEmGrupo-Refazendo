import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Usuario {
    List<Usuario> listaDeVendedores = new ArrayList<>();
    Validacoes validacoes = new Validacoes();

    public Vendedor(String nome, String email, String cpf) {
        super(nome, email, cpf);
    }

    public Vendedor() {

    }

    @Override
    public void cadastrarUsuario(String nome, String email, String cpf) {
        Boolean cpfExistente = validacoes.procurarCpf(listaDeVendedores, cpf);
        if (Boolean.FALSE.equals(cpfExistente)) {
            Usuario vendedor = new Vendedor(nome, email, cpf);
            listaDeVendedores.add(vendedor);
            System.out.println("O seu cadastrado foi efetuado com sucesso.\n");
        } else {
            System.out.println("ERRO: Vendedor(a) j� cadastrado(a).");
        }

    }



    @Override
    public void listarUsuario() {
        for (Usuario listaDeVendedore : listaDeVendedores) {
            System.out.println("Nome do vendedor: " + listaDeVendedore.getNome());
            System.out.println("E-mail do vendedor: " + listaDeVendedore.getEmail());
            System.out.println("Cpf do vendedor: " + listaDeVendedore.getCpf());
            System.out.println();
        }
    }

    public List<Usuario> getListaDeVendedores() {
        return listaDeVendedores;
    }

    public void setListaDeVendedores(List<Usuario> listaDeVendedores) {
        this.listaDeVendedores = listaDeVendedores;
    }
}



