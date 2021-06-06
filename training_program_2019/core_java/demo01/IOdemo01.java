import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class IOdemo01 {
    public static void main(String[] args) {
        char ch;
        int data;
        try (FileInputStream fin = new FileInputStream(FileDescriptor.in);
                FileOutputStream fout = new FileOutputStream("myfile.txt");) {
            System.out.println("Please enter a serial characters and end of '#'");
            while ((ch = (char) fin.read()) != '#') {
                fout.write(ch);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Can't find the file");
        } catch (IOException e) {
            System.out.println("IO exception: " + e.getMessage());
        }
        
    }
}