import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZippingMultipleFiles {
    public static void main(String[] args) throws IOException {


        String fileName1 = "/home/shohimardon/Documents/library/file/harry_potter_annd_the_sorcerers_stone.pdf";
        String fileName2 = "/home/shohimardon/Documents/library/image/kecha va Kunduz8e1d45a0-fb1f-400f-9a94-02ef2d5c206a";
//
        zipFile(new ArrayList<>(Arrays.asList(fileName1, fileName2)), "multi");
    }


    public static String zipFile(List<String> srcFiles, String zipName) throws IOException {
//        String sourceFile = "test1.txt";

        FileOutputStream fos = new FileOutputStream("/home/shohimardon/Documents/library/zipFiles/" + zipName + ".zip");
        ZipOutputStream zipOut = new ZipOutputStream(fos);
        for (String srcFile : srcFiles) {
            File fileToZip = new File(srcFile);
            FileInputStream fis = new FileInputStream(fileToZip);
            ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
            zipOut.putNextEntry(zipEntry);

            byte[] bytes = new byte[1024];
            int length;
            while ((length = fis.read(bytes)) >= 0) {
                zipOut.write(bytes, 0, length);
            }
            fis.close();
        }
        zipOut.close();
        fos.close();
        return "/home/shohimardon/Documents/library/zipFiles/" + zipName + ".zip";
    }


}
