import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class TicketService {
    private Map<String, Ticket> tickets;

    public TicketService() {
        tickets = new HashMap<>();
        for (int i = 1; i <= 10; i++) {
            String id = String.format("%04d", i);
            Ticket ticket = new Ticket(id, "Hall" + (i % 3 + 1), 100 + i, System.currentTimeMillis(), false, (char)('A' + i % 3), 5.0, new TicketPrice(100.0, 10.0));
            tickets.put(id, ticket);
        }
    }
}
