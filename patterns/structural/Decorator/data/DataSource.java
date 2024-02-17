package Decorator.data;

public interface DataSource {
    void writeData(String data);

    String readData();
}
