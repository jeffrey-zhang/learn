package com.trendmicro;
// package com.trendmicro.csv;

import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.File;

// import java.io.BufferedReader;
// import java.io.File;
// import java.io.IOException;
// import java.io.InputStreamReader;

/**
 * Hello world!
 */
public final class App {
    private static int row;

    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // 需要处理的csv表格
        File infile = new File(
                "/home/sunhua/sunhua-product/src/main/java/com/trendmicro/QueryETSWithUserName_2020-07-08_2020-09-18.csv");

        // String strLine = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(infile));
            String rows = reader.readLine();
            String rows1 = rows.substring(1, rows.length());
            // System.out.println(rows1);

            // 表头数据
            String item1[] = rows1.split(",");
            // System.out.println(item1.length);

            String line = null;
            int lineCount = 1;
            while ((line = reader.readLine()) != null) {

                if (lineCount == 1) {
                    System.out.println(line);
                    String item[] = line.split(",");
                    System.out.println(item.length);
                    System.out.println(item[2]);
                } else {

                }
                lineCount++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
