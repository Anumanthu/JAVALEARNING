package javaAdvanced;

import java.io.*;


public class FileInputStreams_bat {


    public static void main(String[] args) throws IOException, InterruptedException {

        int a;

        Runtime runtime = Runtime.getRuntime();

        runtime.exec("cmd /c start C:\\Users\\akindint\\Desktop\\jenkinsWar.bat");

        Thread.sleep(3);

        FileInputStream fis = new FileInputStream("C:\\Users\\akindint\\Desktop\\Selenium Learning\\Softwares\\jenkinsoutput.txt");

        byte b[] = new byte[fis.available()];

        fis.read(b);

        FileOutputStream fos = new FileOutputStream("C:\\Users\\akindint\\Desktop\\Selenium Learning\\Softwares\\jenkinsoutput_otput.txt");
        fos.write(b);

        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\akindint\\Desktop\\Selenium Learning\\Softwares\\jenkinsoutput_otput.txt"));
        String str = null;

        while ((str = reader.readLine()) != null) {
            System.out.println(str);
        }
    }

}
