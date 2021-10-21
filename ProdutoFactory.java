package TrabalhoDesignPattern;


public class ProdutoFactory {

	public ProdutoIF getProduto(String tipoProduto) {
		
		if(tipoProduto == null) {
			return null;
		}
		if(tipoProduto.equalsIgnoreCase("CURSO")){
	            return new Curso();
	        } else if(tipoProduto.equalsIgnoreCase("DISCIPLINA")){
	            return new Disciplina();
	        } else if(tipoProduto.equalsIgnoreCase("LIVRO")){
	            return new Livro();
	        }
			
		return null;
	}
}
