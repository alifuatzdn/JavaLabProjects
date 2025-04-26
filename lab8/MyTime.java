public class MyTime {
    int hour;
    int minute;

    public MyTime(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    @Override
    public String toString() {
        return String.format(" %02d:%02d", hour, minute);
    }

    public int incrementHour(int i) {
        int remaining = 0;
        if (hour + i > 23 || hour + i < 0) {
            remaining = (hour + i) / 24;
            hour = (hour + i) % 24;
            if (hour < 0) {
                hour = 24 + hour;
                remaining--;
            }
            return remaining;
        }
        hour += i;
        return remaining;
    }

    public int incrementMinute(int i) {
        int remaining = 0;
        if (minute + i > 59 || minute + i < 0) {
            remaining = (minute + i) / 60;
            minute = (minute + i) % 60;
            if (minute < 0) {
                minute = 60 + minute;
                remaining--;
            }
            return remaining;
        }
        minute += i;
        return remaining;
    }

    public boolean isBefore(MyTime anotherTime) {
        if (hour < anotherTime.hour)
            return true;
        else if (hour == anotherTime.hour) {
            if (minute < anotherTime.minute)
                return true;
        }
        return false;
    }

    public boolean isAfter(MyTime anotherTime) {
        if (hour == anotherTime.hour && minute == anotherTime.minute)
            return false;
        return !isBefore(anotherTime);
    }

    public boolean isEqual(MyTime anotherTime) {
        if (hour == anotherTime.hour && minute == anotherTime.minute)
            return true;
        return false;
    }
}
