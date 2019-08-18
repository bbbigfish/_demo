package com.zy;
public class CarMap {
	private int row = 0;
	private int column = 0;

	public CarMap(int row,int column) {
		this.row = row;
		this.column = column;
	}

	public boolean isInMap(int positionX,int positionY,int row,int column)throws Exception{
		if(positionX>row||positionX<1||positionY>column||positionY<1){
			throw new Exception("超出边界！");
		}
		return true;
	}

	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	
}
