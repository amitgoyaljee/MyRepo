package RestApi.SerialDeSerial;

import java.util.List;

public class Pojo2 {
}
//[
//  {
//    "id": 1,
//    "name": "Alice",
//    "emails": ["alice@example.com", "alice.work@example.com"],
//    "address": {
//      "street": "123 Main St",
//      "city": "Wonderland",
//      "geo": {
//        "lat": "10.0",
//        "lng": "20.0"
//      }
//    }
//  },
//  {
//    "id": 2,
//    "name": "Bob",
//    "emails": ["bob@example.com"],
//    "address": {
//      "street": "456 Side St",
//      "city": "Builderland",
//      "geo": {
//        "lat": "30.0",
//        "lng": "40.0"
//      }
//    }
//  }
//]
class User2 {
    private int id;
    private String name;
    private List<String> emails;  // Array inside the object-----getter + setter- alt+insert
    private Address address;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<String> getEmails() { return emails; }
    public void setEmails(List<String> emails) { this.emails = emails; }

    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }
}

class Address2 {
    private String street;
    private String city;
    private Geo geo;

    public String getStreet() { return street; }
    public void setStreet(String street) { this.street = street; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public Geo getGeo() { return geo; }
    public void setGeo(Geo geo) { this.geo = geo; }
}
class Geo2 {
    private String lat;
    private String lng;

    public String getLat() { return lat; }
    public void setLat(String lat) { this.lat = lat; }

    public String getLng() { return lng; }
    public void setLng(String lng) { this.lng = lng; }
}