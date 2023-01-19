
public class Livro {
	
	private int codigo;
	private String titulo;
	private String autor;
	private String edicao;
	private int anoactual;
	private int anodepublicacao;
	
	public static int objectoscriados=0;
	
	
	
	public Livro(int codigo, String titulo,String autor,String edicao, int anoactual,
			int anodepublicacao) {
		
		
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.edicao = edicao;
		this.anoactual = anoactual;
		this.anodepublicacao = anodepublicacao;
		
		
		objectoscriados++;
	}	
	public String getEdicao() {
		return edicao;
	}
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAnoactual() {
		return anoactual;
	}
	public void setAnoactual(int anoactual) {
		this.anoactual = anoactual;
	}
	public int getAnodepublicao() {
		return anodepublicacao;
	}
	public void setAnodepublicao(int anodepublicao) {
		this.anodepublicacao = anodepublicao;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public static int getObjectoscriados() {
		return objectoscriados;
	}
	public static void setObjectoscriados(int objectoscriados) {
		Livro.objectoscriados = objectoscriados;
	}

	public String toString() {
		return "Livro [autor = " + autor  + "edicao = "+edicao+ ", codigo=" + codigo
				+ ", titulo=" + titulo + ", anoactual="
				+ anoactual + ", anodepublicao=" + anodepublicacao+ "]"+calcularTempoDeExistencia();
	}
	public int calcularTempoDeExistencia(){
		int idade;
		idade = anoactual - anodepublicacao;
		return idade;
	}
	
	public boolean equals(Livro livro2){
		if(codigo == livro2.getCodigo()){
			return true;
		}else{
			return false;
		}
	}
	
	
	
	
	public void imprimir(){
		
		System.out.println("Codigo: " + codigo);
		System.out.println("titulo: " +titulo );
		System.out.println("autor: " + autor);
		System.out.println(" edicao: "+edicao);
		System.out.println("Ano de publicao: " + anodepublicacao);
		System.out.println("Ano actual: " + anoactual);
		System.out.println("Tempo De Existencia: " + calcularTempoDeExistencia());
		
	}
}
