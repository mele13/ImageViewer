package control;

import java.io.File;
import model.Image;
import persistence.FileImageLoader;

/**
 * @author Mele13
 * 
 * Aplicación que muestra imágenes y permite navegar entre ellas.
 */
public class Main {

    public static void main(String[] args) {
        File file = new File("Images");
        FileImageLoader imageLoader = new FileImageLoader(file);
        Image image = imageLoader.load();       
        MainFrame mainFrame = new MainFrame(imageLoader);
        mainFrame.getImageDisplay().show(image);        
    }
}