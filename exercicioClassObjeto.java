package poo;

public class cliente {
	//atributos
	private String nome;
	private String cabelo;
	private float idade;
	private int altura;
	//constutores
	public cliente(String nome, String cabelo, float idade, int altura) {
		super();
		this.nome = nome;
		this.cabelo = cabelo;
		this.idade = idade;
		this.altura = altura;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCabelo() {
		return cabelo;
	}
	public void setCabelo(String cabelo) {
		this.cabelo = cabelo;
	}
	public float getIdade() {
		return idade;
	}
	public void setIdade(float idade) {
		this.idade = idade;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
		public void imprimirInfo() {
			System.out.println("\nNome:"+nome+"Cabelo:"+cabelo+"Idade"+idade+"altura"+altura);
		
	}
  

     }
public class clientePoo {

	public static void main(String[] args) {
		// construtor 
		cliente p1 = new cliente ();
		p1.nome ="Ana";
		p1.cabelo ="loira";
		p1.idade=20f;
		// construtor 
		cliente p2 = new cliente("Ana","loira");

		//construtor 
		cliente p3 = new cliente("Pedro","ruivo",18f);
		
		//construtor 
		cliente p4 = new cliente("Joao","Branco",26f);
		
		//cliente1
	
	    cliente auto= cliente("\nNome do cliente");
	    auto.imprimirInfo();
	    
	    System.out.println("\n");
	    auto.imprimirInfo();
	    }

}  
     
    	 