package oop.logging;

import java.io.IOException;
import java.util.logging.*;

public class FileExample {
    private static final Logger logger = Logger.getLogger(FileExample.class.getName());

    public static void main(String[] args) throws IOException {

        FileHandler fileHandler = new FileHandler("files/log.txt");
        fileHandler.setFormatter(new XMLFormatter());
        logger.addHandler(fileHandler);

        logger.info("Informate");
        logger.warning("Ka ndodhe dicka e keqe! po mos u merakos!");
        logger.severe("Barcelona!");
        logger.log(Level.SEVERE, "Apet Reali!", new RuntimeException("Reali e fitoj La Ligen!"));

    }
}
