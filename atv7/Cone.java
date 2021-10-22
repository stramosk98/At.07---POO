package atv7;

public class Cone {
	
	private double Geratriz;
	private double AreaDoFundo;
	private double AreaLateralDoCone;
	private double AreaTotal;
	private double Litros;
	private double Latas;
	private double PreçoTotal;
	private double ladoA;
	private double ladoB;
	private double c;
	private double a2;
	private double tinta;
	



	public Cone(float ladoA, float ladoB, float tinta) {
		setLadoA(ladoA);
		setLadoB(ladoB);
		setTinta(tinta);
		this.a2 = (Math.pow(ladoA, 2));		
		this.c = (Math.pow(ladoB, 2));
		Geratriz = (Math.sqrt(c + a2));
		this.AreaDoFundo = Math.round((Math.PI*(a2)));
		this.AreaLateralDoCone = Math.round((Math.PI*(ladoA * Geratriz)));
		this.AreaTotal = Math.round((Math.PI*(ladoA * (ladoA + Geratriz))));
		this.Litros =  Math.round(3.45 * AreaTotal);
		this.Latas = Math.round(Litros / 18);
		this.PreçoTotal = Math.round(Latas * tinta);
	}


public double getLadoA() {
	return ladoA;
}




public void setLadoA(double ladoA) {
	this.ladoA = ladoA;
}




public double getLadoB() {
	return ladoB;
}




public void setLadoB(double ladoB) {
	this.ladoB = ladoB;
}

public double getTinta() {
	return tinta;
}


public void setTinta(double tinta) {
	if(tinta == 1)
		this.tinta = 238.90;
		if(tinta == 2)
			this.tinta = 467.98;
		if(tinta == 3)
			this.tinta = 758.34;
}


	public double getGeratriz() {
		return Geratriz;
	}




	public void setGeratriz(double geratriz) {
		Geratriz = geratriz;
	}




	public double getAreaDoFundo() {
		return AreaDoFundo;
	}




	public void setAreaDoFundo(double areaDoFundo) {
		AreaDoFundo = areaDoFundo;
	}




	public double getAreaLateralDoCone() {
		return AreaLateralDoCone;
	}




	public void setAreaLateralDoCone(double areaLateralDoCone) {
		AreaLateralDoCone = areaLateralDoCone;
	}




	public double getAreaTotal() {
		return AreaTotal;
	}




	public void setAreaTotal(double areaTotal) {
		AreaTotal = areaTotal;
	}




	public double getLitros() {
		return Litros;
	}




	public void setLitros(double litros) {
		Litros = litros;
	}




	public double getLatas() {
		return Latas;
	}




	public void setLatas(double latas) {
		Latas = latas;
	}




	public double getPreçoTotal() {
		return PreçoTotal;
	}




	public void setPreçoTotal(double preçoTotal) {
		PreçoTotal = preçoTotal;

	}

	public double getC() {
		return c;
	}




	public void setC(double c) {
		this.c = c;
	}




	public double getA2() {
		return a2;
	}




	public void setA2(double a2) {
		this.a2 = a2;
	}



	@Override
	public String toString() {
		return "Cone [Geratriz=" + Geratriz + ", AreaDoFundo=" + AreaDoFundo + ", AreaLateralDoCone="
				+ AreaLateralDoCone + ", AreaTotal=" + AreaTotal + ", Litros=" + Litros + ", Latas=" + Latas
				+ ", PreçoTotal=" + PreçoTotal + ", ladoA=" + ladoA + ", ladoB=" + ladoB + ", tinta=" + tinta + "]";
	}



	
}
