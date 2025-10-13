package RestApi.JsonReader;


public class JsonPojo2 {

    Id id;
    String name;

    public void setId(Id id) {
        this.id = id;
    }
    public Id getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

}
class Id {
    int id1;
    String name;
    public void setId1(int id1) {
        this.id1 = id1;
    }
    public int getId1() {
        return id1;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

}