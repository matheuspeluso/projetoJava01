package principal;

import java.util.UUID;

import javax.swing.JOptionPane;

import entities.Cliente;
import repositories.ClienteRepository;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Atalhos - ctrol+ shift + F ctrol + f11 - run
		 */
		System.out.println("Sistema para cadastro de clientes");
		System.out.println("Turma de Java WebDeveloper - Sábado");

		// criando objeto para classe cliente
		var cliente = new Cliente();// instanciando cliente
		cliente.setId(UUID.randomUUID());
		cliente.setNome(JOptionPane.showInputDialog("Informe o Nome do cliente: "));
		cliente.setCpf(JOptionPane.showInputDialog("Informe o cpf do cliente: "));
		cliente.setTelefone(JOptionPane.showInputDialog("Informe o telefone do cliente: "));
		cliente.setEmail(JOptionPane.showInputDialog("Informe o email do cliente: "));

		// imprimir os dados do cliente

		System.out.println("\nDados do Cliente: ");
		System.out.println("\tId......:" + cliente.getId());
		System.out.println("\tNome......:" + cliente.getNome());
		System.out.println("\tTelefone......:" + cliente.getTelefone());
		System.out.println("\tEmail......:" + cliente.getEmail());
		System.out.println("\tCpf......:" + cliente.getCpf());

		// criando um objeto para a classe clienterepository

		var clienteRepository = new ClienteRepository();

		// executando a exportação dos dados como arquivo

		clienteRepository.exportarDados(cliente);
	}

}
