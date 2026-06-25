package hands_on.design_principles.excersize2;

public class ExcelDocument implements Document {

    @Override
    public void open() {
        System.out.println("Opening Excel Document...");
    }
}
