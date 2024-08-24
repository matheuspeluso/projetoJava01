package repositories;

import java.io.PrintWriter;

import entities.Cliente;

//classe de repositorio de dados para gravar,editar, consultar ou excluyir infromaçoes de cliente
public class ClienteRepository {

	public void exportarDados(Cliente cliente) {
		try {
			// criando o arquivo txt para gravar os dados do cliente
			var printWriter = new PrintWriter("c:\\temp\\cliente.txt" + cliente.getId() + ".txt");

			// escrever o conteudo do arquivo
			printWriter.write("\nID do cliente...:" + cliente.getId());
			printWriter.write("\nNome...:" + cliente.getNome());
			printWriter.write("\nCPF...:" + cliente.getCpf());
			printWriter.write("\nTelefone...:" + cliente.getTelefone());
			printWriter.write("\nEmail...:" + cliente.getEmail());

			// fechar o arquivo
			printWriter.close();
			System.out.println("Dados gravados com sucesso!");
		} catch (Exception e) {
			System.out.println("\nFalha ao gravar arquivo: " + e.getMessage());
		}
	}
}
