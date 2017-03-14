package aula03;

public class Quadrado extends Poligono implements Diagonal {
	//AREA QUADRADO
		public double area(){
			return Math.pow(getAltura(), 2);
		}
		
		//DIAGONAL
		public double quadrado(){
			
			return getAltura()*Math.sqrt(2);
			
		}
		
		public double diagonal(){
			return quadrado();
		}
		
		public double perimetro(){
			return 0;
		}

		@Override
		public String toString() {
			return "Quadrado: area()=" + area() + ", diagonal()=" + diagonal()
					+ ", perimetro()=" + perimetro(); //super.toString();
		}

		@Override
		public double volume() {
			// TODO Auto-generated method stub
			return 0;
		}


	
}
