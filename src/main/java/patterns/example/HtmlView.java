package patterns.example;

public class HtmlView implements DataView{

    @Override
    public void view(String data) {
        System.out.println("HTML view" + data);
    }
}
