package Java_study.Patterns.Decorator;

/**
 * Created with IntelliJ IDEA.
 * User: volkov
 * Date: 29.01.19
 * Time: 17:55
 * To change this template use File | Settings | File Templates.
 */
public class EncryptionDecorator extends DataSourceDecorator {
    EncryptionDecorator(DataSource source) {
        super(source);
    }
}
