import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    public void writerInFile(String string){
        FileWriter writer;

        {
            try {
                writer = new FileWriter("ListStudent.bd", false);
                writer.write(string);
                writer.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
