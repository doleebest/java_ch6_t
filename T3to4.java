class T3to4 { 
	public static void main(String args[]) { 
		Student s = new Student();
		s.name = "ȫ�浿";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("�̸�="+s.name);
		System.out.println("����="+s.getTotal());
		System.out.println("���="+s.getAverage());
	} 
}

class Student { 
	
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int getTotal() {
		int sum = kor+eng+math;
		return sum;
		//�����ϰ� return kor+eng+math;
	}
	
	float getAverage()
	{
//		float sum = kor+eng+math;
//		float avg = (float)sum/3;
//		return avg;
// Ʋ�� ��
        return (int)(getTotal()/3f*10+0.5f)/10f;
	}
}