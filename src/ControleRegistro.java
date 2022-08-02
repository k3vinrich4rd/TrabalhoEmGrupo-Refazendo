import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ControleRegistro {
    List<Usuario> listaDeVendedores = new ArrayList<>();
    List<Usuario> listaDeClientes = new ArrayList<>();
    List<Vendas> listaDeVendas = new ArrayList<>();
    Scanner input = new Scanner(System.in);


    public void cadastrarCliente() {
        System.out.println("\n-------------------------------------");
        System.out.print("Informações de cadastro - Cliente\n");
        System.out.println("-------------------------------------");
        System.out.print("Informe seu nome: ");
        String nomeCliente = input.nextLine();

        System.out.print("Informe seu e-mail: ");
        String emailCliente = input.nextLine();
        System.out.print("Informe seu cpf: ");
        String cpfCliente = input.nextLine();
        System.out.println();

        if (!procurarCpf(listaDeClientes, cpfCliente)) {
            Usuario cliente = new Cliente(nomeCliente, emailCliente, cpfCliente);
            listaDeClientes.add(cliente);
            System.out.println("O seu cadastrado foi efetuado com sucesso.\n");
        } else {
            System.out.println("ERRO: Cliente já cadastrado(a).");
        }
    }


    public void listarVendas() {
        for (Vendas listaDeVenda : listaDeVendas) {
            System.out.println("Data de registro da venda: " + listaDeVenda.getDataRegistroDaVenda());
            System.out.println("Valor do produto: " + listaDeVenda.getValorVenda());
            System.out.println();
        }
    }

    public boolean procurarCpf(List<Usuario> listaUsuarios, String cpf) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }


}

