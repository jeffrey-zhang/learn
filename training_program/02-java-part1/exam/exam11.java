import java.util.Scanner;
public class exam11{
    public static void main(String[] args) {
        int num;
        Scanner ip = new Scanner(System.in);
        System.out.print("��������Ҫ��ӡ�������εĸ���");
        num = ip.nextInt();
        ip.close();

        // String grade=input.nextString();
        // System.out.println(grade);

        // //�����������
        // Scanner sc=new Scanner(System.in);
  
        // //��ȡ�û�������ַ���
        // String str="";
        // System.out.print("�����������ַ�:");
        // str=sc.nextLine();
        
        // System.out.println("��������ַ�Ϊ:"+str);


        for(int w=1;w<=num;w++){
            int rows=6;
                for(int i=1;i<=rows;i++){
                    for(int k=1;k<=i*2-1;k++){
                        System.out.print("*");
            }
            System.out.println();
        }
        }


    //     char grade = 'C';
 
    //   switch(grade)
    //   {
    //      case 'A' :
    //         System.out.println("�ȱ�"); 
    //         break;
    //      case 'B' :
    //      case 'C' :
    //         System.out.println("����");
    //         break;
    //      case 'D' :
    //         System.out.println("�ȱ�");
    //         break;
    //      default :
    //         System.out.println("δ֪�ȼ�");
    //   }
    //   System.out.println("��ĵȼ��� " + grade);


        // ֱ��������
        // int rows=6;
        // for(int i=1;i<=rows;i++){
        //     for(int k=1;k<=i*2-1;k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        // ����������
        // for(int i = 1; i<=5 ; i++) {
        //     for (int j = 1; j <= rows - i; j++)
        //         System.out.print(" ");
        //         for (int k = 1; k <= i * 2 - 1; k++)
        //             System.out.print("*");
        //             System.out.println();    
        // }

        // �ȱ�������
        // for(int i=1;i<rows;i++){
        //     for(int j=1;j<rows-j;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=i*2-1;k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        
    }
} 
