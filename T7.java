class MyPoint { 
	int x;
	int y;

	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
    }
	//인스턴스메서드 getDistance를 작성하시오.
	double getDistance(int x1, int y1) {
			return Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y));
	}
}


class T7{
	public static void main(String args[]) {
		MyPoint point = new MyPoint(1, 1);
		
		//p와 (2,2)의 거리를 구한다.
		System.out.println(point.getDistance(2,2));
   }
}