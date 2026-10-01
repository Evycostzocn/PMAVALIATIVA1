//Cenário
//Uma oficina mecânica deseja informatizar o sistema de gerenciamento de boxes e ordens
//de serviço.
//Cada mecânico possui as seguintes informações: nome, CPF, especialidade e telefone.
//Cada box possui as seguintes informações: número, tipo de serviço permitido, capacidade
//máxima de veículos e localização.
//Cada box está vinculado a um mecânico responsável.
//Para cada ordem de serviço, devem ser armazenadas informações como: código, nome do
//cliente, modelo do veículo, placa do veículo, data, status da ordem (aberta, em execução,
//finalizada), valor estimado.
//O sistema também deve permitir armazenar informações do serviço associado a cada ordem.
//O serviço possui as seguintes informações: nome, tempo estimado, valor e categoria.
//Cada box pode receber várias ordens de serviço, contanto que estas ordens estejam associadas ao mesmo tipo de serviço.
//1
//Funcionalidades do Sistema
//1. Cadastrar ordem de serviço
//2. Associar um mecânico a um box
//3. Atribuir ordem de serviço a um box
//4. Exibir todas as ordens atribuídas a um box específico. Informe também o total de
//ordens ao final.
//5. Informar a quantidade total de ordens finalizadas por cada box
//6. Buscar ordens por status. É necessário exibir os detalhes da ordem, incluindo box e
//mecânico.
//7. Exibir os detalhes completos de uma ordem específica
//O usuário deve acessar essas funcionalidades através de um menu.
//Faça um método na classe main para criar 3 mecânicos e 3 boxes assim que o programa
//for executado.
//Regras de negócio
//1. Um mecânico pode ser responsável por apenas um box.
//2. Um box pode possuir várias ordens de serviço, mas a ordem não depende do box.
//3. Ordens com status "aberta"não possuem box atribuído.
//4. Ordens com status "finalizada"precisam manter a informação do box utilizado. Porém, o box não precisa manter a informação desta ordem.

package AA1;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		OS os = new OS();
		
		Mecanico mecanico1 = new Mecanico();
		Mecanico mecanico2 = new Mecanico();
		Mecanico mecanico3 = new Mecanico();
		
		Box box1 = new Box();
		Box box2 = new Box();
		Box box3 = new Box();
		
		mecanico1.setNome("Julio");
		mecanico1.setCpf("999.999.999-99");
		mecanico1.setEspecialidade("Carcaça");
		mecanico1.setTelefone("319999999999");
		
		mecanico2.setNome("Pedroo");
		mecanico2.setCpf("888.888.888-88");
		mecanico2.setEspecialidade("Elétrica");
		mecanico2.setTelefone("31888888888");
		
		mecanico3.setNome("Arthur");
		mecanico3.setCpf("777.777.777-77");
		mecanico3.setEspecialidade("Motor");
		mecanico3.setTelefone("3177777777777");
		
		box1.setCapacidadeMaximaCarros(3);
		box1.setLocalizacao("Esquerda");
		box1.setTipoDeServico("Carcaça");
		box1.setMecanico(mecanico1);
		
		box2.setCapacidadeMaximaCarros(2);
		box2.setLocalizacao("Direita");
		box2.setTipoDeServico("Desmanche de motor");
		box2.setMecanico(mecanico3);
		
		box3.setCapacidadeMaximaCarros(4);
		box3.setLocalizacao("Centro");
		box3.setTipoDeServico("Elétrica");
		box3.setMecanico(mecanico2);
		
		int codigo;
		String data;
		String nome;
		String modeloVeiculo;
		String placa;
		double valorServico;
		int boxDesejado;
		int countOS;
		
		int opcao;

	        do {
	            System.out.println("\n===== OFICINA =====");
	            System.out.println("1 - Cadastrar Ordem de Serviço (OS)");
	            System.out.println("2 - Exibir OS's de um box");
	            System.out.println("3 - Exibir OS's finalizadas de um box");
	            System.out.println("4 - Buscar OS's por status");
	            System.out.println("5 - Exibir os detalhes de uma OS's");
	            System.out.println("6 - Finalizar");
	            System.out.print("Escolha: ");

	            opcao = sc.nextInt();
	            sc.nextLine();

	            switch (opcao) {
	                case 1:
	                    // Cadastrar OS

	                	
	                	System.out.println("Informe o código da OS a ser cadastrada: ");
	                    codigo = sc.nextInt();
	                    
	                    System.out.println("Informe o nome do cliente: ");
	                    nome = sc.nextLine();
	                    
	                    sc.nextLine();
	                    
	                    System.out.println("Informe o modelo do veiculo: ");
	                    modeloVeiculo = sc.nextLine();
	                    
	                    sc.nextLine();
	                    
	                    System.out.println("Informe a placa do veiculo: ");
	                    placa = sc.nextLine();
	                    
	                    sc.nextLine();
	                    
	                    System.out.println("Informe a data a ser cadastrada: ");
	                    data = sc.nextLine();
	                    
	                    sc.nextLine();
	                    
	                    System.out.println("Informe o valor total do servico: ");
	                    valorServico = sc.nextDouble();
	                    
	                    sc.nextLine();
	                    
	                    System.out.println("Informe o box que deseja cadastrar: ");
	                    boxDesejado = sc.nextInt();
	                    
	                    sc.nextLine();
	                   
	                	os.setNomeCliente(nome);
	                    os.setCodigo(codigo);
	                    os.setModeloVeiculo(modeloVeiculo);
	                    os.setPlaca(placa);
	                    os.setData(data);
	                    os.setValor(valorServico);
	                  
	                    Box box = new Box();
	                    box.setNumero(boxDesejado);

	                    break;

	                case 2:
	                    // Exibir OS de um box
	                	
	                	System.out.println("Informe o box que deseja verificar as OS's: ");
	                    boxDesejado = sc.nextInt();
	                    
	                    if (boxDesejado == 1) {
	                    	os.exibirInformacoes();
	                    }
	                    
	                    else if (boxDesejado == 2) {
	                    	os.exibirInformacoes();
	                    }
	                    
	                    else if (boxDesejado == 3) {
	                    	os.exibirInformacoes();
	                    }
	               

	                case 3:
	                    // Exibir OS's finalizadas de um box
	                	
	                	
	                	System.out.println("Informe o box que deseja verificar as OS's: ");
	                    boxDesejado = sc.nextInt();
	                    
	                    if (boxDesejado == 1) {
	                    	if (os.getStatus() == "finalizada") {
		                		box1.exibirOS();
		                	}
	                    }
	                    
	                    else if (boxDesejado == 2) {
	                    	if (os.getStatus() == "finalizada") {
		                		box2.exibirOS();
		                	}
	                    }
	                    
	                    else if (boxDesejado == 3) {
	                    	if (os.getStatus() == "finalizada") {
		                		box3.exibirOS();
		                	}
	                    }

	                    break;

	                case 4:
	                    // Buscar OS's por status
	                	break;
	                
	                case 5:
	                	// Exibir os detalhes de uma OS
	                	
	                	break;
	            }

	        } while (opcao != 6);
		
		
	}
}
