import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by vladimir on 25.06.17.
 */
public class Logger {

    private BufferedWriter file;

    public Logger (String putKFailu) throws FileNotFoundException {

        file = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(putKFailu,true)));
    }

    public void log (String message){


        Date tecushayaData = new Date();
        SimpleDateFormat formater = new SimpleDateFormat("EEEEE  d.M.y H:mm  ");

        try {
            file.write(formater.format(tecushayaData));
            file.write(message );
            file.newLine();
        } catch (IOException e) {
            System.out.println("pohibka vo vremya zapisi v file");
        }
    }

    public void end(){

        try {
            file.flush();
            file.close();
        } catch (IOException e) {
            System.out.println("ne udalos zakrit file");
        }
    }





}
