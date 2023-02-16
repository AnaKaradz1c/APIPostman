package files;

public class payload {

    public static String createBookingBody() {
        return "{\n" +
                "    \"firstname\" : \"Dragoljub\",\n" +
                "    \"lastname\" : \"Boranijasevic\",\n" +
                "    \"totalprice\" : 99,\n" +
                "    \"depositpaid\" : false,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2022-01-01\",\n" +
                "        \"checkout\" : \"2023-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Dinner\"\n" +
                "}";
    }

    public static String createBookingBody1() {
        return "{\n" +
                "    \"firstname\" : \"Djub\",\n" +
                "    \"lastname\" : \"Borac\",\n" +
                "    \"totalprice\" : 999,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2023-01-02\",\n" +
                "        \"checkout\" : \"2023-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";
    }

    public static String createBookingBody2() {
        return "{\n" +
                "    \"firstname\" : \"oljub\",\n" +
                "    \"lastname\" : \"Borc\",\n" +
                "    \"totalprice\" : 1,\n" +
                "    \"depositpaid\" : false,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2022-11-01\",\n" +
                "        \"checkout\" : \"2023-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Dinner\"\n" +
                "}";
    }

    public static String createBookingBody3() {
        return "{\n" +
                "    \"firstname\" : \"Dragoljub\",\n" +
                "    \"lastname\" : \"Boranijasevic\",\n" +
                "    \"totalprice\" : 99,\n" +
                "    \"depositpaid\" : false,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2022-01-01\",\n" +
                "        \"checkout\" : \"2023-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Dinner\"\n" +
                "}";
    }

    public static String changeBooking () {
        return "{\n" +
                "    \"firstname\" : \"Ana\",\n" +
                "    \"lastname\" : \"Karadzic\",\n" +
                "    \"totalprice\" : 564,\n" +
                "    \"depositpaid\" : false,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2023-01-01\",\n" +
                "        \"checkout\" : \"2023-03-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Dinner\"\n" +
                "}" ;
    }
}