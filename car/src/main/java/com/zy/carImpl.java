package com.zy;
public class carImpl implements Car {
	private int positionX = 1;
	private int positionY = 1;
	private String orientation = "North";
	//{0:"North",1:"East",2:"South",3:"West"}
	private int num =0;
	//CarMap carMap;
	@Override
	public void move(String orientation,int step) {
		if("North".equals(orientation)){positionY+=step;}
		if("East".equals(orientation)){positionX+=step;}
		if("South".equals(orientation)){positionY-=step;}
		if("West".equals(orientation)){positionX-=step;}
	}

	@Override
	public void turnOrientation(int num) {
		++num;
		if(num>3) {
			num = 0;
		}
		switch(num){
			case 0 :  this.num = num;orientation = "North" ; break;
			case 1 :  this.num = num;orientation = "East" ; break;
			case 2 :  this.num = num;orientation = "South" ; break;
			case 3 :  this.num = num;orientation = "West" ; break;
		}
		
	}

	@Override
	public int getPositionX() {	return positionX;}

	@Override
	public int getPositionY() {	return positionY;}

	@Override
	public String getOrientation() {return orientation;}

	

	
	

}
