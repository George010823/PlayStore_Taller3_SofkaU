package taller3_buenasPracticas_POO;

import java.time.LocalDate;

public interface Song {

    public String getTitle();
    public int getId();
    public LocalDate getCreatDate();
    public double getDuration();
    public String getGender();
    public String getCover();
    public String getDescription();
    public LocalDate getReleaseDate();
}
