public class Client {
    private int id;
    private String name;

    public Client() {
    }

    public Client(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Client clone() throws CloneNotSupportedException {
        Client c=new Client(this.id,this.name);
        return c;
    }
}
