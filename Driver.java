class Address {
     String address;

   public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}

class HomeAddress extends Address {
    public String getAddress() {
        return "Home Address: " + super.getAddress();
    }
}

class OfficeAddress extends Address {
    public String getAddress() {
        return "Office Address: " + super.getAddress();
    }
}

public class Driver{
    public static void main(String[] args) {
        Address homeAddress = new HomeAddress();
        homeAddress.setAddress("123 Main St");
        System.out.println(homeAddress.getAddress());

        Address officeAddress = new OfficeAddress();
        officeAddress.setAddress("456 Business Ave");
        System.out.println(officeAddress.getAddress());
    }
}

