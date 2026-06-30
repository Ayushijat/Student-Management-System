package org.example;

import java.io.FileWriter;

public class FileHandler {

    public static void writeLog(String msg) throws Exception {
        FileWriter fw = new FileWriter("student_log.txt",true);
        fw.write(msg+"\n");
        fw.close();
    }

}
