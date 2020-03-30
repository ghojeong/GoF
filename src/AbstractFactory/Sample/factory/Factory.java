package AbstractFactory.Sample.factory;

public abstract class Factory {
    public static Factory getFactory(String className) {
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(className).getConstructor().newInstance();
        } catch (ClassNotFoundException e) {
            System.err.println("���饹 " + className + " �����Ĥ���ޤ���");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }

    public abstract Link createLink(String caption, String url);

    public abstract Tray createTray(String caption);

    public abstract Page createPage(String title, String author);
}
