public class Main {
    public static void main(String[] args) {
        // Unit Test for Cash class

        // Test setup
        //Exchange exchange = new NYSE("someAccessKey");
        Exchange fakeExchange = new FakeExchange();
        Cash dollar = new Cash(fakeExchange, 100);
        System.out.println("Dollar: " + dollar.toString());

        // Test 'in' method of Cash
        Cash euro = dollar.in("Euro");
        System.out.println("Dollar to Euro: " + euro.toString());
    }
}

class FakeExchange implements Exchange {
    @Override
    public float rate(String origin, String target) {
        if (origin.equals("USD") && target.equals("Euro")) {
            return 0.85f; 
        }
        return 1.0f; 
    }
}