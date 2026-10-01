package AA1;

public class OS {
	private int codigo;
	private String nomeCliente;
	private String modeloVeiculo;
	private String placa;
	private String data;
	private String status;
	private double valor;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getModeloVeiculo() {
		return modeloVeiculo;
	}
	public void setModeloVeiculo(String modeloVeiculo) {
		this.modeloVeiculo = modeloVeiculo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void exibirInformacoes() {
		System.out.println("CODIGO: " + codigo);
		System.out.println("NOME: " + nomeCliente);
		System.out.println("VEICULO: " + modeloVeiculo);
		System.out.println("PLACA: " + placa);
		System.out.println("DATA: " + data);
		System.out.println("STATUS: " + status);
		System.out.println("VALOR: " + valor);
	}
	
}
