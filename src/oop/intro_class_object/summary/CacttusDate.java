package oop.intro_class_object.summary;

public class CacttusDate {
    //variablat instance, atributet, internal data
    private int year = 1970;
    private int month = 1;
    private int day = 1;

    //constructors
    public CacttusDate() {

    }

    public CacttusDate(int year, int month, int day) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year <= 0) {
            System.out.println("Viti nuk guxon te jete <= 0! ");
            return;
        }
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            System.out.println("Muaji eshte jasht vlerave te lejuara nga 1..12!");
            return;
        }
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        int maxDays = 30;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> maxDays = 31;
            case 2 -> {
                boolean isLeapYear = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
                maxDays = isLeapYear ? 29 : 28;
            }
        }
        if (day < 1 || day > maxDays) {
            System.out.println("Dita eshte jasht rangut te vlerave te lejuara gjate muajit!");
            return;
        }
        this.day = day;
    }

    public void print() {
        System.out.printf("%d.%d.%d %n", day, month, year);
    }

    // 8.8.2020
    public static CacttusDate valueOf(String strDate) {
        String[] dateParts = strDate.split("\\."); //ndaje daten me pike

        int day = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int year = Integer.parseInt(dateParts[2]);

        return new CacttusDate(year, month, day);
    }
}















