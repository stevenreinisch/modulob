package de.dubmas.modulob.reaction.generator.templates;

import java.util.LinkedList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

import de.dubmas.modulob.behaviour.Reaction;

public class Util {
	
	@SuppressWarnings("rawtypes")
	public List order(List<Reaction> reactions){
		SortedMap<Integer,Reaction> map = new TreeMap<Integer, Reaction>();
		for(Reaction r: reactions){
			map.put(r.getOrder(), r);
		}
		return new LinkedList<Reaction>(map.values());
	}
}
