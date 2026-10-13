class Auction {
    String product, bidder;
    double price, highestBid;

    Auction(String product, double price) {
        this.product = product.toUpperCase();
        this.price = price;
        highestBid = price;
    }

    void bid(String name, double amount) {
        bidder = name.toUpperCase();
        System.out.println("Bidder Name    : " + bidder);
        System.out.printf("Bid Amount     : Rs. %.2f%n", amount);

        if (amount > highestBid) {
            highestBid = amount;
            System.out.println("Bid Status     : Bid Accepted");
        } else {
            System.out.println("Bid Status     : Bid Rejected - Bid Must Be Higher");
        }
    }

    void bid(String name) {
        bid(name, highestBid + 1000);
    }

    void display() {
        System.out.println("\n---------- AUCTION SUMMARY ----------");
        System.out.println("Product Name   : " + product);
        System.out.println("Winning Bidder : " + bidder);
        System.out.printf("Final Bid Amount: Rs. %.2f%n", highestBid);
    }
}

public class Main {
    public static void main(String[] args) {
        Auction a = new Auction("Laptop", 50000);

        System.out.println("======== ONLINE AUCTION PLATFORM ========");
        System.out.println("Product Name   : " + a.product);
        System.out.printf("Starting Price : Rs. %.2f%n", a.price);

        a.bid("Ravi", 52000);
        a.bid("Priya", 55000);
        a.bid("Ravi", 53000);

        a.display();
    }
}