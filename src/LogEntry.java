import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class LogEntry {
    private String createdAt;
    private Date updatedAt;
    private String message;
    // Optional ArrayList<LogEntry> history;

    public LogEntry(String message) {
        LocalDateTime tid = LocalDateTime.now();
        DateTimeFormatter formtid =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formattedDate = tid.format(formtid);
        this.message = message;
        createdAt = formattedDate ;
        updatedAt = new Date();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "LogEntry{" + "createdAt=" + createdAt
                + ", updatedAt=" + updatedAt + ", message='" + message + '\'' + '}';
    }

    // Optional: add old version to history
    public void update(String newMessage) {

    }
}