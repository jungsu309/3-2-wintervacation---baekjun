import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<>();
        int N, max, min;
        Scanner s= new Scanner(System.in);
        N = s.nextInt();
        int i=0;
        while(i <N){
            int k;
            k = s.nextInt();
            al.add(k);// �������� �׿����� ���ڴ�.
            i++;
        }//������ŭ �� �Էµ��ִ� ��̸���Ʈ �غ� ��.
        max = al.get(0);
        min = al.get(0);//�ѿ��� ���� ó�� �� �־��ش�.
        
        for (int j =0; j<N; j++){
            if (max<al.get(j)){//�ٸ����� �� ū���
                max = al.get(j);
            }
            if (min>al.get(j)){//�ٸ����� �� �������
                min = al.get(j);
            }        
        }
        
        System.out.println(min+" "+ max);
    }
}