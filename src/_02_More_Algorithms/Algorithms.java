package _02_More_Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algorithms {
	
	public static int findBrokenEgg(List<String> eggs) {
		return eggs.indexOf("cracked");
	}
	
	public static int countPearls(List<Boolean> oysters) {
		int num = 0;
		for(boolean o: oysters) {
			if(o == true) {
				num++;
			}
		}
		return num;
	}
	public static double findTallest(List<Double> peeps){
		double tallBoy = 0;
		for(double p: peeps) {
			if(p > tallBoy) {
				tallBoy = p;
			}
		}
		return tallBoy;
	}
	public static String findLongestWord(List<String> peeps){
		int tallBoy = 1;
		for(int i = 1; i < peeps.size(); i++) {
			if(peeps.get(i).length() > peeps.get(tallBoy).length()) {
				tallBoy = i;
			}
		}
		return peeps.get(tallBoy);
	}
	public static boolean containsSOS(List<String> message) {
		for(String m: message) {
			if(m.equals(" ... --- ... ")) {
				return true;
			}
		}
		return false;
	}
	public static List<Double> sortScores(List<Double> results) {
		Double[] r = new Double[results.size()];
		for(int i = 0; i < r.length; i++) {
			r[i] = results.get(i);
		}
		Lazy.sort(r);
		return Arrays.asList(r);
	}
	public static List<String> sortDNA(List<String> results) {
		String[] r = new String[results.size()];
		for(int i = 0; i < r.length; i++) {
			r[i] = results.get(i);
		}
		Lazy.sort2(r);
		return Arrays.asList(r);
	}
	public static List<String> sortWords(List<String> results) {
		String[] r = new String[results.size()];
		for(int i = 0; i < r.length; i++) {
			r[i] = results.get(i);
		}
		Lazy.sort3(r);
		return Arrays.asList(r);
	}
}
