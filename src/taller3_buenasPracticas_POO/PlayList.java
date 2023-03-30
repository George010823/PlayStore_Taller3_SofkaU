package taller3_buenasPracticas_POO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayList {

	private List<Song> songs;
	Scanner inpOption = new Scanner(System.in);
	
	public PlayList() {
	    songs = new ArrayList<Song>();
	}
	  
	public void addSong(Song song) {
	    songs.add(song);
	}

	public void deleteSong(Song song) {
	    songs.remove(song);
	}
	
	public void showMenuPrincipal() {
		System.out.println("Por favor seleccione una opción:");
		System.out.println("	1. Ver biblioteca.");
		System.out.println("	2. Crear PlayList.");
		System.out.println("	3. Jugar con mi PlayList.");
		System.out.println("	4. Salir.");
	}
	
	public void showSongs() {
		List<Song> songs = getSongs();
	    for (Song song : songs) {
	    	System.out.println("Title: " + song.getTitle() + ".   ID: " + song.getId() + ". Creat Date: " + song.getCreatDate() + ". "
	    						+ "Duration: " + song.getDuration() + ". Gender: " + song.getGender() + ". Cover: " + song.getCover() 
	    						+ ". Description: " + song.getDescription());
	    }
	}
	
	public void showMenuPlayList() {
		System.out.println("	1. Filtrar canciones por genero.");
		System.out.println("	2. Filtrar canciones por año.");
		System.out.println("	3. Ordenar por duración.");
		System.out.println("	4. Ordenar por fecha.");
		System.out.println("	5. Salir.");
	}

	public List<Song> getSongs() {
	    return songs;
	}
}
