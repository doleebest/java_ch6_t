class T24
{
	/*
(1) abs . �޼��带 �ۼ��Ͻÿ�
	 */
	public static int abs(int value) {
		if(value<0)
			return -value;
		else {
			return value;
		}
	}
	
	public static void main(String[] args)
	{
		int value = 5;
		System.out.println(value+"�� ���밪 :"+abs(value));
		value = -10;
		System.out.println(value+" �� ���밪 :"+abs(value));
	}
}