import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.FilterInputStream;



class InputStreamDecorator extends FilterInputStream {

 protected InputStreamDecorator(InputStream in) {
  super(in);
 }

 public int read() throws IOException {
  int c = super.read();
  return (c == -1 ? c : Character.toLowerCase((char) c));
 }

 public int read(byte[] b, int offset, int len) throws IOException {
  int result = super.read(b, offset, len);
  for (int i = offset; i < offset + result; i++) {
   b[i] = (byte) Character.toLowerCase((char) b[i]);
  }
  return result;
 }
}


class Ass2Q1 {
 public static void main(String[] args) throws IOException {
  int c;
  try {
   InputStream in = new InputStreamDecorator(new BufferedInputStream(
     new FileInputStream("/home/symsc15/SADP/Ass2/Q1/sample.txt")));
   while ((c = in.read()) >= 0) {
    System.out.print((char) c);
   }
   in.close();
  } catch (IOException e) {
   e.printStackTrace();
  }
 }
}
