package uz.jl.library.service;

import uz.jl.library.config.Encoder;
import uz.jl.library.doa.BookDao;
import uz.jl.library.domains.Uploads;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
    UserService userService = UserService.instance;
    static Encoder encoder = Encoder.instance;
    static BookDao bookDao = new BookDao();
    static BookService bookService = BookService.instance;

    public static void main(String[] args) throws IOException {
//        String text = bookService.getText(new File("/home/shohimardon/core-java-volume-i-fundamentals-11th-edition_compress.pdf"));

//        String language = bookService.getLanguage(null, "/home/shohimardon/core-java-volume-i-fundamentals-11th-edition_compress.pdf");
//        String calculatePage = String.valueOf(bookService.calculatePage(null, "/home/shohimardon/core-java-volume-i-fundamentals-11th-edition_compress.pdf"));
//        System.out.println(calculatePage);
//        System.out.println(language);
//        File file = new File("/home/shohimardon/Documents/library/file/Fast-as-the-Wind.pdf");
//////        bookService.getFirsPageAsImage();
//        String text = bookService.getText(file);
//        Language russian = Language.convertor("russian");
//        System.out.println("russian = " + russian);
//        bookDao.save(new Book("", "", "", Book.Genre.CI_FI, Language.RU, 4, 4, new Uploads(), new Uploads()));
////
//        Uploads image = bookService.getImage(0, "Haryy Potter", "/home/shohimardon/Documents/library/file/harry_potter_annd_the_sorcerers_stone (3).pdf");
//        System.out.println("image = " + image);
//        System.out.println(text);
//        bookService.DownloadImage("O'tkan kunlar");

        Path temp = Files.move
                (
                        Paths.get("/home/shohimardon/Downloads/pirimqul_qodirov_avlodlar_dovoni_roman.pdf"),
                        Paths.get("/home/shohimardon/Documents/library/file/pirimqul_qodirov_avlodlar_dovoni_roman.pdf")
                );


    }

    public static void getImge() {
        Uploads image = bookService.getImage(0, "Haryy Potter", "/home/shohimardon/Documents/library/file/harry_potter_annd_the_sorcerers_stone (3).pdf");

    }
}
