package taller3_buenasPracticas_POO;

import java.time.LocalDate;

public abstract class AbstractSong implements Song {

	protected String title;
	protected int id;
	protected LocalDate creatDate;
	protected double duration;
	protected String gender;
	protected String cover;
	protected String description;
	
	public AbstractSong(String title, int id, LocalDate creatDate, double duration, String gender, String cover, String description) {
		this.title = title;
		this.id = id;
		this.creatDate = creatDate;
		this.duration = duration;
		this.gender = gender;
		this.cover = cover;
		this.description = description;
	}

	@Override
	public String getTitle() {
		return title;
	}
	
	@Override
	public int getId() {
		return id;
	}

	@Override
	public LocalDate getCreatDate() {
		return creatDate;
	}

	@Override
	public double getDuration() {
		return duration;
	}

	@Override
	public String getGender() {
		return gender;
	}

	@Override
	public String getCover() {
		return cover;
	}

	@Override
	public String getDescription() {
		return description;
	}
}
