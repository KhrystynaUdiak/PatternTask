package patterns.example;

import java.util.List;


@SuppressWarnings("StringConcatenationInLoop")
class Customer {
    private final String name;
    private List<Rental> rentals;


    public Customer(String name, List<Rental> rentals) {
        this.name = name;
        this.rentals = rentals;
    }

    public List<Rental> getRentals() {
        return rentals;
    }
    public List<Rental> addRental(Rental rental){
        rentals.add(rental);
        return rentals;
    }
    public String getName() {
        return name;
    }

   public void viewCustomerRentalStatement(String view) {
        String data = "";
        for (Rental rental : rentals) {
            data += rental.statement(this);
        }
        if (view.equals("Html")) {
            new HtmlView().view(data);
        } else if(view.equals("file")){
            new FileView().view(data);
        }
    }


}