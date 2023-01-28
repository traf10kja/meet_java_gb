package hw_2.task_0;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static Logger log = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte res = sc.nextByte();

        try (FileWriter fw = new FileWriter("result.txt", false)) {
            fw.write(res);
        }
        catch (IOException exception){
            log.log(Level.INFO, "Exception: ", exception);
        }


       

    }

    }
