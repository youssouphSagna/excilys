package com.model;

public class Carte {
	
	private ColorCarte color;
	private Valeur valeur;
	
	public enum ColorCarte {
		Coeur(100), Carreau(50), Pique(25) ,Trèfle(5);
		private final int id;
		ColorCarte(int id) {
			this.id = id;
		}
		
		public int getValue() {
			return this.id;
		}
		
	}
	
	public enum Valeur {
		Deux(2), Trois(3), Quatre(4), Cinq(5), Six(6), Sept(7), Huit(8), Neuf(9), Dix(10), Valet(11), Dame(12), Roi(13), Ass(14);
		
		private final int id;
		Valeur(int id) {
			this.id = id;
		}
		
		public int getValue() {
			return id;
		}
		
	}
	
	

	public Carte(ColorCarte color, Valeur valeur) {
		super();
		this.color = color;
		this.valeur = valeur;
	}

	public ColorCarte getColor() {
		return color;
	}

	public void setColor(ColorCarte color) {
		this.color = color;
	}

	public Valeur getValeur() {
		return valeur;
	}

	public void setValeur(Valeur valeur) {
		this.valeur = valeur;
	}


	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = this.getColor().getValue()* this.getValeur().getValue();
		
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carte other = (Carte) obj;
		if (color != other.color)
			return false;
		if (valeur != other.valeur)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Carte [color=" + color + ", valeur=" + valeur + "]";
	}
	
	
	
	
	
	

}
