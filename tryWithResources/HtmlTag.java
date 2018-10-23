package pl.kurs.tryWithResources;

public class HtmlTag implements AutoCloseable {

    private final String tag;

    public HtmlTag(String tag)
    {
        this.tag = tag;
        System.out.println("<" + tag + ">");
    }

    public void body(String text)
    {
        System.out.println(text);
    }

    public void close()
    {
        System.out.println("</" + tag + ">");
    }

    public static void main(String[] args) {

        try(
        HtmlTag tag = new HtmlTag("h1");
        HtmlTag tag1 = new HtmlTag("h5");
        ){
            tag1.body("To jest jakiś tekst");
        }

    }

}
