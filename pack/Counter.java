package my.pack;

import java.util.Scanner;

public class Counter {
	
	public int counter;
	public int firstBorderValue;
	public int lastBorderValue;
	
	public Counter(int startCounter, int firstBorderValue, int lastBorderValue) {
		this.counter=startCounter;
		this.firstBorderValue= firstBorderValue;
		this.lastBorderValue= lastBorderValue;
	};
	public Counter() {
		Scanner sc = new Scanner(System.in); 
        System.out.println("������� ����������� ������������� ����� ��� ���������� �������� ��������");
        if (sc.hasNext()) { 
			this.counter=sc.nextInt();
			}
        
        System.out.println("������� ����������� ������������� ����� ��� ������ ������� ��������� ��������");
        if (sc.hasNext()) { 
			this.firstBorderValue=sc.nextInt();
			}
        
        System.out.println("������� ����������� ������������� ����� ��� ������� ������� ��������� ��������");
        if (sc.hasNext()) { 
			this.lastBorderValue=sc.nextInt();
			}
	};
	public void countPlus() {
			this.counter=counter+1;
	}
	public void countMines() {
			if(counter>0) {
				counter=counter-1;
			}else System.out.println("������� �� ����� ���� ��������, ������� �������� ������ ��� ����� 0"); 
		}
	
	public int getCurrentCounter() {
		return counter;
	}

	public int getFirstBorderValue() {
		return firstBorderValue;
	}
	public int getLastBorderValue() {
		return lastBorderValue;
	}
	public static void main(String[] args) {
		Counter count=new Counter();
		Counter countValue=new Counter(2,1,10);
		
		//���������� ����� ����������
		System.out.println("�������� �������� - "+count.getCurrentCounter()+" ������������ �������� - "+countValue.getCurrentCounter());
		do {
			count.countPlus();
			//System.out.println("�������� �������� - "+count.getCurrentCounter()+" ������������ �������� - "+countValue.getCurrentCounter());
		}while(count.getCurrentCounter()<count.getLastBorderValue());
		
		do {
			countValue.countPlus();
		}while(countValue.counter<countValue.lastBorderValue);
	
		
		System.out.println("����������� �������� �������� - "+count.getCurrentCounter()+" ����������� ������������ �������� - "+countValue.getCurrentCounter());
		
		//���������� ����� ����������
		System.out.println("�������� �������� - "+count.getCurrentCounter()+" ������������ �������� - "+countValue.getCurrentCounter());
		do {
			count.countMines();
			//System.out.println("�������� �������� - "+count.getCurrentCounter()+" ������������ �������� - "+countValue.getCurrentCounter());
		}while(count.getCurrentCounter()>count.firstBorderValue);
		
		do {
			countValue.countMines();
		}while(countValue.counter<countValue.firstBorderValue);
		
		System.out.println("����������� �������� �������� - "+count.getCurrentCounter()+" ����������� ������������ �������� - "+countValue.getCurrentCounter());

		
	};
}
