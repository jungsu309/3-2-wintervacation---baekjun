import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int n1, n2;
        Scanner s = new Scanner(System.in);
        n1 = s.nextInt();
        n2 = s.nextInt();//�Է¹ޱ�
        
        //n2 = 432�ϰ��
        
        
        int n2_100, n2_10, n2_1;//�ڸ��� �����ϱ�
        n2_100 = n2/100;//100�� �ڸ� ���� 432������ 100 �� ��=4
        n2_10 = (n2%100)/10;//10���ڸ� ���� 432������ 100�� ������->32�� 10���� ���� ���� ��=3
        n2_1 = (n2%100)%10;//1���ڸ� ����432�� 100���� ����������=32�� �ٽ� 10���� �������� ������=2
        int n3, n4, n5, n6;//���� ����ϰ� ���� �ڸ�
        n3 = n1*n2_1;
        n4 = n1*n2_10;
        n5 = n1*n2_100;
        n6 =n1*n2;
        System.out.println(n3+"\n"+n4+"\n"+n5+"\n"+n6);
    }
}