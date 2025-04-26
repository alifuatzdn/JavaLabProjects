public class MyDateTime {
    MyDate date;
    MyTime time;

    public MyDateTime(MyDate date, MyTime time) {
        this.date = date;
        this.time = time;
    }

    @Override
    public String toString() {
        return date.toString() + time.toString();
    }

    public void incrementDay() {
        date.incrementDay();
    }

    public void incrementHour() {
        incrementHour(1);
    }

    public void incrementHour(int i) {
        int remainingDay = time.incrementHour(i);
        if (remainingDay >= 0) {
            date.incrementDay(remainingDay);
        } else {
            date.decrementDay(-remainingDay);
        }
    }

    public void decrementHour(int i) {
        incrementHour(-i);
    }

    public void incrementMinute(int i) {
        int remainingMinute = time.incrementMinute(i);
        incrementHour(remainingMinute);
    }

    public void decrementMinute(int i) {
        incrementMinute(-i);
    }

    public void incrementYear(int i) {
        date.incrementYear(i);
    }

    public void decrementDay() {
        date.decrementDay();
    }

    public void decrementYear() {
        date.decrementYear();
    }

    public void decrementMonth() {
        date.decrementMonth();
    }

    public void incrementDay(int i) {
        date.incrementDay(i);
    }

    public void decrementMonth(int i) {
        date.decrementMonth(i);
    }


    public void decrementDay(int i) {
        date.decrementDay(i);
    }


    public void incrementMonth(int i) {
        date.incrementMonth(i);
    }

    public void decrementYear(int i) {
        date.decrementYear(i);
    }

    public void incrementMonth() {
        date.incrementMonth();
    }

    public void incrementYear() {
        date.incrementYear();
    }

    public boolean isBefore(MyDateTime anotherDateTime) {
        if (this.date.isBefore(anotherDateTime.date))
            return true;
        else if (this.date.isEqual(anotherDateTime.date) && this.time.isBefore(anotherDateTime.time))
            return true;
        return false;
    }

    public boolean isAfter(MyDateTime anotherDateTime) {
        if (this.time.isEqual(anotherDateTime.time))
            return false;
        return !isBefore(anotherDateTime);
    }

    public String dayTimeDifference(MyDateTime anotherDateTime){
        MyDateTime dateTimeBigger = this.isAfter(anotherDateTime) ? this : anotherDateTime;
        MyDateTime dateTimeSmaller = this.isBefore(anotherDateTime) ? this : anotherDateTime;

        int hour = (23 - dateTimeSmaller.time.hour) + dateTimeBigger.time.hour;
        int minute = (60 - dateTimeSmaller.time.minute) + dateTimeBigger.time.minute;

        hour += minute / 60;
        minute = minute % 60;
        int day = 0;

        if (hour > 23) {
            day = hour / 24;
            hour = hour % 24;
        }
        day += (this.date.dayDifference(anotherDateTime.date) - 1);

        return (day == 0 ? "" : day + " day(s) ") + (hour == 0 ? "" : hour + " hour(s) ") + (minute == 0 ? "\n" : minute + " minute(s)\n");
    }
}

