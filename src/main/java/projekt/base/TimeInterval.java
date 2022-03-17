package projekt.base;

import java.time.Duration;
import java.time.LocalDateTime;

public class TimeInterval {

    private LocalDateTime start;
    private LocalDateTime end;

    /*
    constructor
    The public constructor has two parameters of formal type LocalDateTime and uses them to initialize the two attributes. As usual, start with the first and end with the second parameter. If either of the two current parameters is null, a NullPointerException is thrown with the message "start" if the first parameter is null,
     otherwise with the message "end" if the second parameter is null.
     If the time window is negative length,throw a IllegalArgumentException
     @param start
     @param end
     */
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


    /*
    @return the value of start
     */
    public LocalDateTime getStart() {
        return start;
    }

    /*
    @return the value of end
     */
    public LocalDateTime getEnd() {
        return end;
    }

    /*
    calculate the duration from start to end
    @return the duration
     */
    public Duration getDuration()
    {
        Duration duration = Duration.between(this.start, this.end);
        return duration;
    }
}
