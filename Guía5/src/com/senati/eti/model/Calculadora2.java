package com.senati.eti.model;

public class Calculadora2 {
	
	private float numero1;
	private float numero2;
	
	public float getNumero1() {
		return numero1;
	}
	public void setNumero1(float numero1) {
		this.numero1 = numero1;
	}
	public float getNumero2() {
		return numero2;
	}
	public void setNumero2(float numero2) {
		this.numero2 = numero2;
	}
	
	public Calculadora2() {

	}
	
	public Calculadora2(float numero1, float numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	public float Operar(int tipo) {
		float rpta = 0;
		switch (tipo) {
		case 1:
			rpta = this.numero1 + this.numero2;
			break;
			
		case 2:
			rpta = this.numero1 - this.numero2;
			break;
			
		case 3:
			rpta = this.numero1 * this.numero2;
			break;
			
		case 4:
			if (this.numero1 == 0 || this.numero2 == 0) {
				System.out.println("Operación imposible.");
			}
			else rpta = this.numero1 / this.numero2;
			break;
			
		case 5:
			if (this.numero1 == 0 || this.numero2 == 0) {
				System.out.println("Operación imposible.");
			}
			else rpta = this.numero1 % this.numero2;
			break;
			
		case 6:
			rpta = (this.numero1 * this.numero2)/2;
			break;
			
		case 7:
			rpta = (this.numero1 * this.numero1)+(this.numero2 * this.numero2);
			break;

		case 8:
			rpta = (this.numero1 * this.numero1)+(this.numero2 * this.numero2);
			break;

		case 9:
			float num_may = (float) this.numero1;
			if (this.numero2 < this.numero1)
				num_may = this.numero1;
			rpta = num_may;
			break;
			
		case 10:
			float num_men = (float) this.numero1;
			if (this.numero2 > this.numero1)
				num_men = this.numero1;
			rpta = num_men;
			break;
			
		case 11:
			rpta = ((this.numero2 * this.numero1)/this.numero1)*100;
			break;	
		}
		return rpta;
	}

}
