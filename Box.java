package AA1;
import java.util.ArrayList;

public class Box {
	private int numero;
	private String tipoDeServico;
	private int capacidadeMaximaCarros;
	private String localizacao;
	private Mecanico mecanico;
	private ArrayList<OS> ordens = new ArrayList<>();
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTipoDeServico() {
		return tipoDeServico;
	}
	public void setTipoDeServico(String tipoDeServico) {
		this.tipoDeServico = tipoDeServico;
	}
	public int getCapacidadeMaximaCarros() {
		return capacidadeMaximaCarros;
	}
	public void setCapacidadeMaximaCarros(int capacidadeMaximaCarros) {
		this.capacidadeMaximaCarros = capacidadeMaximaCarros;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public Mecanico getMecanico() {
		return mecanico;
	}
	public void setMecanico(Mecanico mecanico) {
		this.mecanico = mecanico;
	}
	public ArrayList<OS> getOrdens() {
		return ordens;
	}

	public void exibirOS() {
		for (OS os : ordens) {
			os.exibirInformacoes();
		}
		System.out.println("TOTAL DE ORDENS: " + ordens.size());
	}
}
