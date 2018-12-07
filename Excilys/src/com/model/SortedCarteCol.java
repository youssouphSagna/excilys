package com.model;

import java.util.Comparator;

public class SortedCarteCol implements Comparator<Carte>{

	@Override
	public int compare(Carte o1, Carte o2) {
		// TODO Auto-generated method stub
		return o1.getColor().getValue() - o2.getColor().getValue();
	}

}
