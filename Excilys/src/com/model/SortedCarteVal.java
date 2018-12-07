package com.model;

import java.util.Comparator;

public class SortedCarteVal implements Comparator<Carte> {

	@Override
	public int compare(Carte o1, Carte o2) {
		
		return o1.getValeur().ordinal() - o2.getValeur().ordinal();
	}

}
