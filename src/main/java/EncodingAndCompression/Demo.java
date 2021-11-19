package EncodingAndCompression;

import EncodingAndCompression.components.FileDataSource;
import EncodingAndCompression.decorators.CompressionDecorator;
import EncodingAndCompression.decorators.DataSourceDecorator;
import EncodingAndCompression.decorators.EncryptionDecorator;

public class Demo {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith, 10000,\nSteven Jobs, 90000";
        DataSourceDecorator encoded = new CompressionDecorator(
                                        new EncryptionDecorator(
                                            new FileDataSource("OutputDemo.txt")));

        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("./OutputDemo.txt");

        System.out.println("--Input ----");
        System.out.println(salaryRecords);
        System.out.println("- Encoded -----");
        System.out.println(plain.readData());
        System.out.println("- Decoded -------");
        System.out.println(encoded.readData());
    }
}
