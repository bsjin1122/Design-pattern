package factory_pattern;

public interface DB {
    public int execute(String url);
    public void setUrl(String url);
}
