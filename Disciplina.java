package TrabalhoDesignPattern;

public class Disciplina implements ProdutoIF{

	private int chTotal;
	private double pctCumprido;
	private String nome;
	
	public Disciplina() {
		super();
	}

	public Disciplina(int chTotal, double pctCumprido, String nome) {
		super();
		this.setChTotal(chTotal);
		this.setPctCumprido(pctCumprido);
		this.setNome(nome);
		
	}

	public double getPctCumprido() {
		return pctCumprido;
	}

	public void setPctCumprido(double pctCumprido) {
		this.pctCumprido = pctCumprido;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getChTotal() {
		return chTotal;
	}

	public void setChTotal(int chTotal) {
		this.chTotal = chTotal;
	}

	@Override
	public void criarProduto() {
		// TODO Auto-generated method stub
		
	}
	
	//getPreco
	
	
}
