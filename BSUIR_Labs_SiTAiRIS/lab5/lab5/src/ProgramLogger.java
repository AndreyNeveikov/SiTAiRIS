import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class ProgramLogger {
    private static ProgramLogger programLogger;

    public static synchronized ProgramLogger getProgramLogger(){
        if(programLogger == null){
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

    private ProgramLogger(){

    }

    public void addLogInfo(String logInfo){
        Date date = new Date();
        String logFile = date + " " + logInfo + "\n";

        try(FileWriter writer = new FileWriter(
                "E:\\СиТАиРИС\\BSUIR_Labs_SiTAiRIS\\lab5\\LogFile\\ProgramLogs.txt", true))
        {
            writer.write(logFile);
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
