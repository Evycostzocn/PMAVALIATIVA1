	}
	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public void exibirInformacoes() {
		System.out.println("CODIGO: " + codigo);
		System.out.println("NOME: " + nomeCliente);
		System.out.println("VEICULO: " + modeloVeiculo);
		System.out.println("PLACA: " + placa);
		System.out.println("DATA: " + data);
		System.out.println("STATUS: " + status);
		System.out.println("VALOR ESTIMADO: " + valor);
		if (servico != null) {
			System.out.println("SERVICO: " + servico.getNome());
			System.out.println("TEMPO: " + servico.getTempo());
			System.out.println("VALOR DO SERVICO: " + servico.getValor());
			System.out.println("CATEGORIA: " + servico.getCategoria());
		}
		if (box != null) {
			System.out.println("BOX: " + box.getNumero());
			System.out.println("TIPO: " + box.getTipoDeServico());
			System.out.println("CAPACIDADE: " + box.getCapacidadeMaximaCarros());
			System.out.println("LOCALIZACAO: " + box.getLocalizacao());
			if (box.getMecanico() != null) {
				System.out.println("MECANICO: " + box.getMecanico().getNome());
				System.out.println("CPF: " + box.getMecanico().getCpf());
				System.out.println("ESPECIALIDADE: " + box.getMecanico().getEspecialidade());
				System.out.println("TELEFONE: " + box.getMecanico().getTelefone());
			}
		} else {
			System.out.println("BOX: ainda nao atribuido.");
			System.out.println("MECANICO: ainda nao atribuido.");
		}
	}
	
}
