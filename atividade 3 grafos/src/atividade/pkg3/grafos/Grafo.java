package atividade.pkg3.grafos;
import java.util.Arrays;


public class Grafo {
	private int valor;
	private String cor;
	private int[] vizinhos;
	private int ante;
	private double distancia;
	private int grau;

	public Grafo(int valor) {
		super();
		this.valor = valor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int[] getVizinhos() {
		return vizinhos;
	}

	public void setVizinhos(int[] vizinhos) {
		this.vizinhos = vizinhos;
	}

	public int getGrau() {
		return grau;
	}

	public void setGrau(int grau) {
		this.grau = grau;
	}

	public int getAnte() {
		return ante;
	}

	public void setAnte(int ante) {
		this.ante = ante;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	@Override
	public String toString() {

		return "(" + this.valor + (this.vizinhos.length == 0 ? ")" : ")->" + Arrays.toString(this.vizinhos));
	}

	@Override
	public boolean equals(Object obj) {
		Grafo c = (Grafo) obj;
		return Integer.compare(this.valor, c.valor) == 0;
	}

}