package com.zy;
public interface Car {

	//移动
	void move(String orientation,int step);
	//获取方向
	String getOrientation();
	//转向
	void turnOrientation(int num);

	int getPositionX();
	int getPositionY();
}
