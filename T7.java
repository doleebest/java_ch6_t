class MyPoint { 
	int x;
	int y;

	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
    }
	//�ν��Ͻ��޼��� getDistance�� �ۼ��Ͻÿ�.
	double getDistance(int x1, int y1) {
			return Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y));
	}
}


class T7{
	public static void main(String args[]) {
		MyPoint point = new MyPoint(1, 1);
		
		//p�� (2,2)�� �Ÿ��� ���Ѵ�.
		System.out.println(point.getDistance(2,2));
   }
}