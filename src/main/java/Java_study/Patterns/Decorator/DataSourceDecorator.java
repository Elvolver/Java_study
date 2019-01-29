package Java_study.Patterns.Decorator;

public class DataSourceDecorator implements DataSource {
    private DataSource wrappee;

    DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }
    @Override
    public void writeData(String data) {
        this.wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
