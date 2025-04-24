package utils;

import lombok.experimental.UtilityClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@UtilityClass
public class PropertiesLoader {
    public String getProperty(String fileName, String propertyName) {
        Properties props = new Properties();
        ClassLoader loader = PropertiesLoader.class.getClassLoader();
        try (InputStream input = loader.getResourceAsStream(fileName)) {
            props.load(input);  // Загружаем свойства из файла
        } catch (IOException e) {
            e.printStackTrace();  // Обрабатываем исключение в случае ошибки
        }
        return props.getProperty(propertyName);
    }
}
