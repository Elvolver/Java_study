package Java_study.Patterns.Decorator;

/**
 * Created with IntelliJ IDEA.
 * User: volkov
 * Date: 29.01.19
 * Time: 18:22
 * To change this template use File | Settings | File Templates.
 */
public class CompressionDecorator extends DataSourceDecorator {
    CompressionDecorator(DataSource source) {
        super(source);
    }
}
