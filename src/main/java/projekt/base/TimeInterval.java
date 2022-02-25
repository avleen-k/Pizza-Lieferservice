package projekt.base;

import java.time.Duration;
import java.time.LocalDateTime;

public class TimeInterval {

    private LocalDateTime start;
    private LocalDateTime end;

    public TimeInterval(LocalDateTime start, LocalDateTime end)
    {
        if (start == null)
            throw new NullPointerException("start");
        if (end == null)
        {
            throw new NullPointerException("end");
        }
        if (start.isAfter(end))
            throw new IllegalArgumentException("Start "+ start.toString()+ " is after end "+ end.toString());
        this.end=end;
        this.start = start;
    }


    public LocalDateTime getStart() {
        return start;
    }

    public LocalDateTime getEnd() {
        return end;
    }
    public Duration getDuration()
    {
        Duration duration = Duration.between(this.start, this.end);
        return duration;
    }
}
