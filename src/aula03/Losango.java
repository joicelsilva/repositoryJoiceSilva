package aula03;

public class Losango extends Poligono{
	public double area(){
		return  getBase()*getAltura();
	}
	
	public double perimetro(){
		return 0;
	}

	@Override
	public String toString() {
		return "Losango: area()=" + area() + ", perimetro()=" + perimetro(); //super.toString();
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}
}
