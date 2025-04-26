public class MyDate1 {
    private int day, month, year;
    private int[] maxDays = {31, 29, 31, 30, 31 ,30 , 31, 31, 30, 31, 30, 31};

    public MyDate1(int day, int month, int year) {
        this.day = day;
        this.month = month - 1;
        this.year = year;
    }
    
    public void incrementDay() {
        int newDay = day + 1;
        if (newDay > maxDays[month]) {
            day = 1;
            incrementMonth();
        } else if (month == 1 && newDay == 29 && !isLeapYear()) {
            day = 1;
            incrementMonth();
        } else {
            day++;
        }
    }

    public void decrementDay() {
        int newDay = day - 1;
        if (newDay == 0) {
            decrementMonth();
            day = maxDays[month];
        }else if (month == 2 && newDay == 0 && !isLeapYear()) {
            decrementMonth();
            day = 28;
        }else {
            day = newDay;
        }
    }

    public void incrementDay(int i) {
        while (i > 0) {
            incrementDay();
            i--;
        }
    }

    public void decrementDay(int i) {
        while (i > 0) {
            decrementDay();
            i--;
        }
    }

    public void incrementMonth() {
        incrementMonth(1);
    }

    public void decrementMonth() {
        incrementMonth(-1);
    }

    public void incrementMonth(int i) {
        int newMonth = (month + i) % 12;
        int yearChange = 0;
        if (newMonth < 0) {
            newMonth += 12;
            yearChange = -1;
        }
        yearChange += (month + i) / 12;
        month = newMonth;
        year += yearChange;
        if (day > maxDays[newMonth]) {
            day = maxDays[month];
            if (month == 1 && !isLeapYear()) {
                day = 28;
            }
        }
    }

    public void decrementMonth(int i) {
        incrementMonth(-i);
    }

    public void incrementYear() {
        incrementYear(1);
    }

    public void decrementYear() {
        incrementYear(-1);
    }

    public void incrementYear(int i) {
        year += i;
        if(month == 1 && day == 29 && !isLeapYear()) {
            day = 28;
        }
    }

    public void decrementYear(int i) {
        incrementYear(-i);
    }

    private boolean isLeapYear() {
        boolean leap = false;
        // if the year is divided by 4
        if (year % 4 == 0) {
            // if the year is century
            if (year % 100 == 0) {
                // if year is divided by 400 then it is a leap year
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            // if the year is not century
            else
                leap = true;
        } else
            leap = false;
        return leap;
    }

    public boolean isBefore(MyDate1 anotherDate) {
        if (year < anotherDate.year)
            return true;
        else if (month < anotherDate.month)
            return true;
        else if (day < anotherDate.day)
            return true;
        return false;
    }

    public boolean isAfter(MyDate1 anotherDate) {
        if (isEqual(anotherDate))
            return false;
        return !isBefore(anotherDate);
    }

    public boolean isEqual(MyDate1 anotherDate) {
        if (year == anotherDate.year && month == anotherDate.month && day == anotherDate.day)
            return true;
        return false;
    }

    public int dayDifference(MyDate1 anotherDate) {
        MyDate1 dateBigger = anotherDate.isAfter(this) ? anotherDate : this;
        MyDate1 dateSmaller = anotherDate.isAfter(this) ? this : anotherDate;

        MyDate1 dateSmallerClone = new MyDate1(dateSmaller.day, dateSmaller.month + 1, dateSmaller.year);

        int count = 0;
        while (!dateBigger.isEqual(dateSmallerClone)) {
            dateSmallerClone.incrementDay();
            count++;
        }
        return count;
    }

    @Override
    public String toString() {
        return year + "-" + (month + 1 < 10 ? "0" : "") + (month + 1) + "-" + (day < 10 ? "0" : "") + day;
    }
}
