package taller3_buenasPracticas_POO;

import java.time.LocalDate;

public class BaseSong extends AbstractSong{
	 private LocalDate releaseDate;

	public BaseSong(String title, int id, LocalDate creatDate, double duration, String gender, String cover,
			String description) {
		super(title, id, creatDate, duration, gender, cover, description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public LocalDate getReleaseDate() {
		// TODO Auto-generated method stub
		return this.releaseDate;
	}

}
