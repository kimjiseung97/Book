public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Long Buy(Ticket ticket) {
        return bag.hold(ticket);
    }
}
