    
public class CUADRADO {
	public int longitudL;
	
	public CUADRADO() {
		longitudL=178054;
	}
	public int calcularPerimetroCu() {
		return longitudL*4;
	}
	public double calculaAreaCu() {
		return Math.pow(longitudL,2);
	}
	public double calculaDiagonalCu() {
		return Math.sqrt(2*(Math.pow(longitudL,2 )));
	}
	public void cambiarLongitudL(int longitudL2) {
		longitudL=longitudL2;
	}

}

