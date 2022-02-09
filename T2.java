import java.util.prefs.NodeChangeListener;

class T2 { 
	public static void main(String args[]) { 
		Student s = new Student();
		s.name = "È«±æµ¿";
		s.ban = 1;
		s.no =1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("ÀÌ¸§="s.name);
		System.out.println("ÃÑÁ¡="s.getTotal());
		System.out.println("Æò±Õ="s.getAverage());
	} 
}

class Student { 
	int getTotal() {
		int sum = s+b+c;
		return sum;
	}
	
	float getAverage()
	{
		float sum = s.kor+s.eng+s.math;
		float avg = (float)sum/3;
		return avg;
	}
}