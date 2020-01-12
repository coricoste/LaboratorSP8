import java.util.concurrent.TimeUnit;

public class Image implements Element
{
    private String title_image;

    @Override
    public String toString()
    {
        return "Image" + title_image;
    }

    public String getNameI() {
        return title_image;
    }

    public void setNameI(String title_image)
    {
        this.title_image = title_image;
    }

    public Image(String title_image)
    {
        super();
        this.title_image = title_image;
        try
        {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Image()
    {

    }

    @Override
    public void add(Element element) {
        System.out.println("ERORR");
    }

    @Override
    public void remove(Element element) {
        System.out.println("ERORR");
    }

    @Override
    public Element getElement(int index) {
        System.out.println("ERORR");
        return null;
    }

    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }

    public void print()
    {
        System.out.println("Image title: " + title_image);
    }

}