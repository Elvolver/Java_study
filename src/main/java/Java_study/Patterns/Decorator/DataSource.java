package Java_study.Patterns.Decorator;

/**
 * Created with IntelliJ IDEA.
 * User: volkov
 * Date: 29.01.19
 * Time: 17:43
 * To change this template use File | Settings | File Templates.
 */
public interface DataSource {
    public void writeData(String data);
    public String readData();
}
