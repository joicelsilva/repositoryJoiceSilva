package aula03;

public class Retangulo extends Poligono implements Diagonal{
	//AREA RETANGULO
		public double area(){
			return getAltura()*getBase();
		}
		

		//DIAGONAL
		public double retangulo(){
			double valor = Math.pow(super.getAltura(), 2)+Math.pow(super.getBase(), 2);
			double resultado = Math.sqrt(valor);
			
			return resultado;
			
		}

		@Override
		public double diagonal() {
			return retangulo();
		}
		
		public double perimetro(){
			return 0;
		}


		@Override
		public String toString() {
			return "Retangulo: area()=" + area() + ", diagonal()=" + diagonal()
					+ ", perimetro()=" + perimetro(); //super.toString();
		}


		@Override
		public double volume() {
			// TODO Auto-generated method stub
			return 0;
		}


		
	
}
