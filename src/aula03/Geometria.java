package aula03;

import java.util.ArrayList;

public class Geometria {
	public static void main(String []args){
		
		ArrayList<Figura> fig = new ArrayList<Figura>();
		fig.add(new Circulo());
		fig.add(new Quadrado());
		fig.add(new Losango());
		fig.add(new Retangulo());
		fig.add(new Triangulo());
		
		for(Figura a: fig)
		{

			System.out.println(a.toString());

		}
		
		ArrayList<Poligono> pol = new ArrayList<Poligono>();
		pol.add(new Cubo());
		pol.add(new Cilindro());
		pol.add(new Piramide());
		pol.add(new Esfera());
		
		for (Poligono p: pol){
			System.out.println(p.toString());
		}
	}
}
