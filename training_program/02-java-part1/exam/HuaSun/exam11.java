import java.util.Scanner;
public class exam11{
    public static void main(String[] args) {
        int num;
        int A;
        Scanner ip = new Scanner(System.in);
        System.out.println("请输入需要打印的三角形的个数");
        num = ip.nextInt();
        System.out.println("1(等边) 2(等腰) 3(直角)" );
        A=ip.nextInt();
        System.out.println("你输入的字符为:"+A);

        if(A==1){
            for(int w=1;w<=num;w++){
                int rows=6;
                    for(int i=1;i<rows;i++){
                        for(int j=1;j<rows-j;j++){
                            System.out.print(" ");
                        }
                        for(int k=1;k<=i*2-1;k++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
        }
        else if(A==2){
            for(int w=1;w<=num;w++){
                for(int i = 1; i<=5 ; i++) {
                    int rows=6;
                    for (int j = 1; j <= rows - i; j++)
                        System.out.print(" ");
                        for (int k = 1; k <= i * 2 - 1; k++)
                            System.out.print("*");
                            System.out.println();    
                }
             }
        }
        else if(A==3){
            for(int w=1;w<=num;w++){
                int rows=6;
                for(int i=1;i<=rows;i++){
                    for(int k=1;k<=i*2-1;k++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
             }
        }

 
    //   switch(A)
    //   {
    //      case '1' :
    //         for(int w=1;w<=num;w++){
    //             int rows=6;
    //                 for(int i=1;i<rows;i++){
    //                     for(int j=1;j<rows-j;j++){
    //                         System.out.print(" ");
    //                     }
    //                     for(int k=1;k<=i*2-1;k++){
    //                         System.out.print("*");
    //                     }
    //                     System.out.println();
    //                 }
    //             }
    //         break;
    //      case '2' :
    //      for(int w=1;w<=num;w++){
    //         for(int i = 1; i<=5 ; i++) {
    //             int rows=6;
    //             for (int j = 1; j <= rows - i; j++)
    //                 System.out.print(" ");
    //                 for (int k = 1; k <= i * 2 - 1; k++)
    //                     System.out.print("*");
    //                     System.out.println();    
    //         }
    //      }
    //         break;
    //      case '3' :
    //      for(int w=1;w<=num;w++){
    //         int rows=6;
    //         for(int i=1;i<=rows;i++){
    //             for(int k=1;k<=i*2-1;k++){
    //                 System.out.print("*");
    //             }
    //             System.out.println();
    //         }
    //      }
    //         break;
    //      default :
    //         System.out.println("");
    //   }


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
