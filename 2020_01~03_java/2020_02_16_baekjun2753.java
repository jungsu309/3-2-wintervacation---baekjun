import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if(num%4==0&&num%100!=0){//4�� ����̸鼭 100�ǹ���� �ƴҶ�
	        System.out.println("1");
            }
        else if (num%400==0){
            System.out.println("1");
            }
        else
            System.out.println("0");
    }
}