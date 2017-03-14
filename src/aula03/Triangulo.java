package aula03;

public class Triangulo extends Poligono {
	
	//AREA TRIANGULO
		public double area(){
			return (getBase()*getAltura())/2;
		}
		
		public double perimetro(){
			return 0;
		}

		@Override
		public String toString() {
			return "Triangulo: area()=" + area() + ", perimetro()=" + perimetro(); //super.toString();
		}

		@Override
		public double volume() {
			// TODO Auto-generated method stub
			return 0;
		}
		
	
}
