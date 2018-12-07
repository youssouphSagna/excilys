package com.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.model.Carte.ColorCarte;
import com.model.Carte.Valeur;

public class PaquetCarte {
	
	private Set<Carte> paquet;	

	public PaquetCarte() {
		
		paquet = new HashSet<>();
		
		for(Valeur v: Carte.Valeur.values()) {
			for(ColorCarte c: Carte.ColorCarte.values()) {
				paquet.add(new Carte(c, v));
			}
		}
	}


	public Set<Carte> getPaquet() {
		return paquet;
	}

	public void setPaquet(Set<Carte> paquet) {
		this.paquet = paquet;
	}
	
	public Set<Carte> triValeur() {
		List<Carte> p = new ArrayList<Carte>(paquet);
		Collections.sort(p, new SortedCarteVal());
	
		paquet.clear();
		paquet.addAll(p);
		
		return paquet;
	}
	
	public Set<Carte> triColor() {
		List<Carte> p = new ArrayList<Carte>(paquet);
		Collections.sort(p, new SortedCarteCol());
	
		paquet.clear();
		paquet.addAll(p);
		
		return paquet;
	}


	@Override
	public String toString() {
		StringBuilder tmp = new StringBuilder("jeu de carte : \n");
		for(Carte c: paquet)
			tmp.append(c + "\n");
		
		return tmp.toString();
	}
	
	
	
	

}
