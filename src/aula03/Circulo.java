package aula03;

public class Circulo extends Figura{
	@Override
	public double area(){
		return 0;
	}
	
	public double perimetro(){
		return 0;
	}
	

	@Override
	public String toString() {
		return "Circulo: area()=" + area() + ", perimetro()=" + perimetro(); //super.toString();
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}
	
//	ArrayList<Figura> a = new ArrayList<>();
//	a.add(new Circulo(aaaa,a,aa));
	
}
