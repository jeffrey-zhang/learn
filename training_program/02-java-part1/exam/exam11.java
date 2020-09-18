import java.util.Scanner;
public class exam11{
    public static void main(String[] args) {
        int num;
        Scanner ip = new Scanner(System.in);
        System.out.print("请输入需要打印的三角形的个数");
        num = ip.nextInt();
        ip.close();

        // String grade=input.nextString();
        // System.out.println(grade);

        // //创建输入对象
        // Scanner sc=new Scanner(System.in);
  
        // //获取用户输入的字符串
        // String str="";
        // System.out.print("请输入任意字符:");
        // str=sc.nextLine();
        
        // System.out.println("你输入的字符为:"+str);


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
    //         System.out.println("等边"); 
    //         break;
    //      case 'B' :
    //      case 'C' :
    //         System.out.println("等腰");
    //         break;
    //      case 'D' :
    //         System.out.println("等边");
    //         break;
    //      default :
    //         System.out.println("未知等级");
    //   }
    //   System.out.println("你的等级是 " + grade);


        // 直角三角形
        // int rows=6;
        // for(int i=1;i<=rows;i++){
        //     for(int k=1;k<=i*2-1;k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        // 等腰三角形
        // for(int i = 1; i<=5 ; i++) {
        //     for (int j = 1; j <= rows - i; j++)
        //         System.out.print(" ");
        //         for (int k = 1; k <= i * 2 - 1; k++)
        //             System.out.print("*");
        //             System.out.println();    
        // }

        // 等边三角形
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
