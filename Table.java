public class Table implements Element
{
    private String table_name;

    public Table() {

    }

    @Override
    public String toString() {
        return "Table" + table_name;
    }

    public String gettable_name()
    {
        return table_name;
    }

    public void settable_name(String table_name)
    {
        this.table_name = table_name;
    }

    public Table(String table_name)
    {
        super();
        this.table_name = table_name;
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
        System.out.println("Table: " + table_name);
    }

}