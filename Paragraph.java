public class Paragraph implements Element
{
    private String paragraph_title;
    private AlignStrategy align;

    public Paragraph()
    {

    }

    @Override
    public String toString()
    {
        return "Paragraph" + paragraph_title;
    }

    public String getparagraph_title()
    {
        return paragraph_title;
    }

    public void setparagraph_title(String paragraph_title)
    {
        this.paragraph_title = paragraph_title;
    }

    public Paragraph(String paragraph_title)
    {
        super();
        this.paragraph_title = paragraph_title;
    }


    public AlignStrategy getAlignStrategy() {
        return align;
    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.align = alignStrategy;
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

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void print()
    {
        if (align != null)
        {
            align.print(paragraph_title);
        }
        else
        {
            System.out.println(paragraph_title);
        }
    }

}