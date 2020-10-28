public class Client {
    public static void main(String[] args) {
        PropertyRegister propertyRegister = new PropertyRegister();
        UI ui = new UI();

        //Test data input start
        if (    propertyRegister.addProperty(1445, "Gloppen", 77, 631, "", 1017.6, "Jens Olsen") &&
                propertyRegister.addProperty(1445, "Gloppen", 77, 131, "Syningom", 661.3 , "Nicolay Madsen") &&
                propertyRegister.addProperty(1445, "Gloppen", 75, 19, "Fugletun", 650.6, "Evilyn Jensen") &&
                propertyRegister.addProperty(1445, "Gloppen", 74, 188, "", 1457.2, "Karl Ove Bråten") &&
                propertyRegister.addProperty(1445, "Gloppen", 69, 47, "Høiberg ", 1339.4, "Elsa Indregård")) {
            System.out.println("Successfully added all test properties");
        } //Test data input stop

        ui.start(propertyRegister);
    }
}
