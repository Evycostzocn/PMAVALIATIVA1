package AA1;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	// O enunciado pede um metodo para criar os mecanicos e boxes.
	public static void criarMecanicosEBoxes(ArrayList<Mecanico> mecanicos, ArrayList<Box> boxes) {
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
		
		box1.setNumero(1);
		box1.setCapacidadeMaximaCarros(3);
		box1.setLocalizacao("Esquerda");
		box1.setTipoDeServico("Carcaça");
		box1.setMecanico(mecanico1);
		
		box2.setNumero(2);
		box2.setCapacidadeMaximaCarros(2);
		box2.setLocalizacao("Direita");
		box2.setTipoDeServico("Desmanche de motor");
		box2.setMecanico(mecanico3);
		
		box3.setNumero(3);
		box3.setCapacidadeMaximaCarros(4);
		box3.setLocalizacao("Centro");
		box3.setTipoDeServico("Elétrica");
		box3.setMecanico(mecanico2);
		

		mecanicos.add(mecanico1);
		mecanicos.add(mecanico2);
		mecanicos.add(mecanico3);
		boxes.add(box1);
		boxes.add(box2);
		boxes.add(box3);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Mecanico> mecanicos = new ArrayList<>();
		ArrayList<Box> boxes = new ArrayList<>();
		ArrayList<OS> ordens = new ArrayList<>();
		criarMecanicosEBoxes(mecanicos, boxes);
		int opcao;

		do {
			System.out.println("\n===== OFICINA =====");
			System.out.println("1 - Cadastrar OS");
			System.out.println("2 - Associar mecanico a um box");
			System.out.println("3 - Atribuir OS a um box");
			System.out.println("4 - Exibir OS de um box");
			System.out.println("5 - Quantidade de OS finalizadas por box");
			System.out.println("6 - Buscar OS por status");
			System.out.println("7 - Exibir detalhes de uma OS");
			System.out.println("8 - Finalizar uma OS");
			System.out.println("9 - Sair");
			System.out.print("Escolha: ");
			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
				case 1: {
					// Uma nova OS para cada cadastro, evitando sobrescrever a anterior.
					OS os = new OS();
					System.out.println("Informe o codigo da OS: ");
					int codigo = sc.nextInt();
					sc.nextLine();
					boolean existe = false;
					for (OS ordem : ordens) {
						if (ordem.getCodigo() == codigo) existe = true;
					}
					if (existe) {
						System.out.println("Codigo ja cadastrado.");
						break;
					}
					os.setCodigo(codigo);
