package MHJ.MHJLaboratorio1;

public class Movies {
    public int Id;
    public String title;
    public int Year;

    public Movies(int id, String title, int year) {
        Id = id;
        this.title = title;
        Year = year;

    }

    public Movies() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
