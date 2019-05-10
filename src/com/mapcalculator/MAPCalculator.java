package com.mapcalculator;
public class MAPCalculator {

	public MAPCalculator() {
		// no code required
	}

	public double value(double sbp, double dbp) {

		double map = 0;
		
		//if sbp > dpb vlaue thene xecute the condition otherwise execute else condition
		if (sbp > dbp) {

			//calculating MAP value
			map = 1.0 / 3.0 * sbp + 2.0 / 3.0 * dbp;
			return map;
		} else {
			System.out.println("SBP must always be greater than DBP");

		}
		// return MAP value
		return 0;
	}

	public String category(double map) {
		// return one of “high”, “normal” or “low”
		String str = "";
		
		//if MAP  is les then 70 
		if (map < 70) {
			str = "The lowest MAP value";
			
			//if MAP is between 70 and 100
		} else if (map >= 70 && map <= 100) {
			str = "The Average MAP value";
			
			//if MAP is greater then 100
		} else if (map > 100) {
			str = "The highest MAP value";
		}
		return str;
	}

}
