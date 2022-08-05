import java.util.List;

public class Validacoes {
    public Boolean procurarCpf(List<Usuario> listaUsuarios, String cpf) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }
    public Validacoes(){

    }
}
