package pojo;

public class D_32_Ana_Karadzic_BodyPets {

    private int id;
    private int petId;
    private int quantity;
    private String shipDate;
    private String status;
    private boolean complete;

    public int getId(int getID) {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getShipDate() {
        return shipDate;
    }

    public void setShipDate(String shipDate) {
        this.shipDate = shipDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }


    public static String newOrderCreated () {
      return  "{\n" +
                "    \"id\": 1,\n" +
                "    \"petId\": 1789,\n" +
                "    \"quantity\": 1,\n" +
                "    \"shipDate\": \"2023-01-26T16:11:51.026+0000\",\n" +
                "    \"status\": \"placed\",\n" +
                "    \"complete\": true\n" +
                "}";
    }
}
