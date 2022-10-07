package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties properties;


    static { // Her method'dan önce çalışır
        String dosyaYolu = "configuration.properties";
        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            // fis dosya yolunu tanımladığımız configration.properties dosyasını okudu.
            properties = new Properties();
            properties.load(fis); // fis'in okuduğu bilgileri properties'e yükledi
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String getProperty(String key){
        /*
        test metodundan yolladığımız string key değerini alıp
        Properties class'ından getProperty() methodunu kullanarak
        bu key'e ait value'yu bize getirir
         */
        return properties.getProperty(key);
    }


}
