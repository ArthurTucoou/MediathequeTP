package mediatheque;

public class BookPrinter implements ItemVisitor {
    
    @Override
    public void visit(Book m) {
        System.out.println("Book visité: " + m);
    }

    @Override
    public void visit(CD m) {}
}