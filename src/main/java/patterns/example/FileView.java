package patterns.example;

import java.io.*;

public class FileView implements DataView{
    @Override
    public void view(String data) {
        try(BufferedWriter writter = new BufferedWriter(new FileWriter("records.txt"))){
                writter.write(data);
        }catch(IOException e){}
    }

    public void view(Movie movie){
        try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("catalog.txt"))){
            output.writeObject(movie);
        }catch (IOException e){}
    }
}
