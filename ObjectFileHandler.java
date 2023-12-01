import java.io.*;

public class ObjectFileHandler {

    public static <T> void writeObjectToFile(T object, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(object);
            System.out.println("Đã ghi vào " + fileName);
        } catch (IOException e) {
            System.err.println("Lỗi khi ghi vào " + fileName);
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> T readObjectFromFile(String fileName, Class<T> clazz) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            Object object = ois.readObject();
            System.out.println("Đã đọc từ " + fileName);
            return clazz.cast(object);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Lỗi khi đọc từ " + fileName);
            e.printStackTrace();
        }
        return null;
    }
}
