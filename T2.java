import java.util.prefs.NodeChangeListener;

class T2 { 
	public static void main(String args[]) { 
		Student s = new Student();
		s.name = "ȫ�浿";
		s.ban = 1;
		s.no =1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("�̸�="s.name);
		System.out.println("����="s.getTotal());
		System.out.println("���="s.getAverage());
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