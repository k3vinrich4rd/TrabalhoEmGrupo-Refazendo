import java.util.List;

public class Validacoes {
    public Validacoes() {

    }
    public Boolean procurarCpf(List<Usuario> listaUsuarios, String cpf) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }



    public Boolean procurarEmail(List<Usuario> listaUsuarios, String email) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }
}
