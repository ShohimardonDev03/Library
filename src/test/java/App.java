import uz.jl.library.config.Encoder;
import uz.jl.library.doa.BookDao;
import uz.jl.library.domains.Book;
import uz.jl.library.domains.Uploads;
import uz.jl.library.enums.Language;
import uz.jl.library.service.BookService;
import uz.jl.library.service.UserService;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class App {
    UserService userService = UserService.instance;
    static Encoder encoder = Encoder.instance;
    static BookDao bookDao = new BookDao();
    static BookService bookService = BookService.instance;

    public static void main(String[] args) throws IOException {
        String text = bookService.getText(new File("/home/shohimardon/Downloads/pirimqul_qodirov_avlodlar_dovoni_roman.pdf"));
        System.out.println(text);
//        File file = new File("/home/shohimardon/Desktop/images/");
//        List<String> images = new ArrayList<>();
//        for (File listFile : file.listFiles()) {
//            if (!listFile.isDirectory()) {
//                images.add(listFile.getAbsolutePath());
//            }
//        }
//        System.out.println("files.length = " + images.size());


        String language = bookService.getLanguage(null, "/home/shohimardon/Downloads/pirimqul_qodirov_avlodlar_dovoni_roman.pdf");
        System.out.println(language);
        //        String calculatePage = String.valueOf(bookService.calculatePage(null, "/home/shohimardon/core-java-volume-i-fundamentals-11th-edition_compress.pdf"));
//        System.out.println(calculatePage);
//        System.out.println(language);
        File file = new File("/home/shohimardon/Downloads/pirimqul_qodirov_avlodlar_dovoni_roman.pdf");
//////        bookService.getFirsPageAsImage();
//        String text = bookService.getText(file);
//        Language russian = Language.convertor("russian");
//        System.out.println("russian = " + russian);
//        bookDao.save(new Book("", "", "", Book.Genre.CI_FI, Language.RU, 4, 4, new Uploads(), new Uploads()));
////
//        Uploads image = bookService.getImage(0, "Haryy Potter", "/home/shohimardon/Documents/library/file/harry_potter_annd_the_sorcerers_stone (3).pdf");
//        System.out.println("image = " + image);
//      try {
//          URL url = new URL("http://localhost:8080/image/name=harry_potter_annd_the_sorcerers_stone");
//          URLConnection connection = url.openConnection();
//          BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//
//          String d;
//          while ((d = reader.readLine()) != null) {
//              System.out.println(d);
//          }
//      }catch (IOException exception){
//          System.out.println("exception = " + exception);
//      }


//        System.out.println(text);
//        bookService.DownloadImage("O'tkan kunlar");

    }

    public static void getImge() {
        Uploads image = bookService.getImage(0, "Haryy Potter", "/home/shohimardon/Documents/library/file/harry_potter_annd_the_sorcerers_stone (3).pdf");

    }
}
