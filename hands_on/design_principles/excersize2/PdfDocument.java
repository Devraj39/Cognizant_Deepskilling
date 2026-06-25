package hands_on.design_principles.excersize2;

public class PdfDocument implements Document {

    @Override
    public void open() {
        System.out.println("Opening PDF Document...");
    }
}
