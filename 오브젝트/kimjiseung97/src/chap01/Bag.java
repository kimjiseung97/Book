public class Bag {

    private Long amount;
    private Ticket ticket;
    private Invitation invitation;

    public Long hold(Ticket ticket){
        if(hasInvitation()){
            setTicket(ticket);
            return 0L;
        }else{
            setTicket(ticket);
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }

    }


    public boolean hasInvitation(){
        return invitation!=null;
    }

    public boolean hasTicket(){
        return ticket!=null;
    }

    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private void minusAmount(Long amount){
        this.amount -=amount;
    }



}