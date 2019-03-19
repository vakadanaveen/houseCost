package com.houseCost;

public class HouseCost{
	public static int findCost(String type,int area){
		int cost=0;
		if(type.equalsIgnoreCase("standard materials")){
			cost=area*1200;
		}
		else if(type.equalsIgnoreCase("above standard materials")){
			cost=area*1500;
		}
		else if(type.equalsIgnoreCase("high standard materials")){
			cost=area*1800;
		}
		else if(type.equalsIgnoreCase("high standard materials and fully automated home")){
			cost=area*2500;
		}
		else{
			return -1;
		}
		return cost;
	}
}