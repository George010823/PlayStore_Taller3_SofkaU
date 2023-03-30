package taller3_buenasPracticas_POO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Storemusic {

    private List<Song> songs;
    
    PlayList myPlayList = new PlayList();
    List<Song> playlist = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Scanner inpGender = new Scanner(System.in);
    Scanner inpYear = new Scanner(System.in);
    
    public Storemusic() {
    	this.songs = new ArrayList<>();
    }
    
    public void addSong(Song song) {
        this.songs.add(song);
    }
    
    public List<Song> getSongs() {
        return songs;
    }
    
    public void selectSong(List<Song> allSongs) {
    	// Pedir al usuario cuántas canciones desea agregar a la playlist
        System.out.print("¿Cuántas canciones desea agregar a la playlist? ");
        int numSongs = scanner.nextInt();
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("-------------------------------------------Escribe el ID de la canción que deseas agregar.-----------------------------------------");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
        for (Song song : allSongs) {
            System.out.println(song.getId() + ". " + song.getTitle());
        }
        
        while (playlist.size() < numSongs) {
            System.out.print("Escribe el ID de la canción: ");
            int songId = scanner.nextInt();

            Song selectedSong = null;
            for (Song song : allSongs) {
                if (song.getId() == songId) {
                    selectedSong = song;
                    break;
                }
            }

            if (selectedSong == null) {
            	System.out.println("-------------------------------------------------------------------------------------------------------");
				System.out.println("------------------------------------!!!ALERT¡¡¡--------------------------------------------------------");
				System.out.println("-------------------------------------------------------------------------------------------------------");
                System.out.println("Identificador de canción inválido. Inténtalo de nuevo.");
            } else if (playlist.contains(selectedSong)) {
            	System.out.println("-------------------------------------------------------------------------------------------------------");
				System.out.println("------------------------------------!!!ALERT¡¡¡--------------------------------------------------------");
				System.out.println("-------------------------------------------------------------------------------------------------------");
                System.out.println("La canción ya está en tu playlist. Inténtalo de nuevo.");
            } else {
                playlist.add(selectedSong);
                System.out.println("-------------------------------------------------------------------------------------------------------");
				System.out.println("------------------------------------!!!SUCCESS¡¡¡------------------------------------------------------");
				System.out.println("-------------------------------------------------------------------------------------------------------");
                System.out.println("Canción agregada a la playlist.");
            }
        }
        System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("------------------------------------!!!TU PLAYLIST¡¡¡--------------------------------------------------");
		System.out.println("-------------------------------------------------------------------------------------------------------");
        for (Song song : playlist) {
        	System.out.println(song.getId() + ". " + song.getTitle());
        }
    }
    
    public void showPlaylist() {
		if(playlist.isEmpty()) {
        	System.out.println("-------------------------------------------------------------------------------------------------------");
			System.out.println("------------------------------------!!!ALERT¡¡¡--------------------------------------------------------");
			System.out.println("-------------------------------------------------------------------------------------------------------");
            System.out.println("Todavia no has agregado canciones a tu playlist.");
            System.out.println();
		}else {
	        System.out.println("-------------------------------------------------------------------------------------------------------");
			System.out.println("--------------------!!!QUE DESEAS HACER CON TU PLAYLIST¡¡¡---------------------------------------------");
			System.out.println("-------------------------------------------------------------------------------------------------------");
	        for (Song song : playlist) {
	        	System.out.println(song.getId() + ". " + song.getTitle());
	        }
	        System.out.println();
	        myPlayList.showMenuPlayList();
	    	
	    	int game = scanner.nextInt();
	    	switch (game){
	        case 1:
	        	System.out.println("Escribe el genero por el cual deseas filtrar.");
	        	String gender = inpGender.nextLine();
	        	filterGender(gender);
	        	break;
	        case 2:
	        	System.out.println("Escribe el año por el cual deseas filtrar.");
	        	int year = inpYear.nextInt();
	        	filterYear(year);
	        	break;
	        case 3:
	        	orderDuration();
	        	break;
	        case 4:
	        	orderDate();
	        	break;
	        case 5:
	        	System.out.println("-------------------------------------------------------------------------------------------------------");
				System.out.println("----------------------------!!!MENU PRINCIPAL¡¡¡-------------------------------------------------------");
				System.out.println("-------------------------------------------------------------------------------------------------------");
	        	break;
	        }
		}
    }
    
    public void filterYear(int year) {
    	List<Song> filteredSongs = playlist.stream()
    		    .filter(song -> song.getCreatDate().getYear() == year)
    		    .collect(Collectors.toList());
    	System.out.println("Lista de canciones filtradas por año:");
	    for (Song song : filteredSongs) {
	        System.out.println(song.getId() + " - " + song.getTitle());
	    }
	    System.out.println();
    }
    
    public void filterGender(String gender) {
    	List<Song> filteredSongs = playlist.stream()
    		    .filter(song -> song.getGender().equalsIgnoreCase(gender))
    		    .collect(Collectors.toList());
    	System.out.println("Lista de canciones filtradas por genero:");
	    for (Song song : filteredSongs) {
	        System.out.println(song.getId() + " - " + song.getTitle());
	    }
	    System.out.println();
    }
    
    public void orderDuration() {
    	Collections.sort(playlist, Comparator.comparing(Song::getDuration));
    	System.out.println("Lista de canciones ordenadas por duración:");
	    for (Song song : playlist) {
	        System.out.println(song.getDuration() + " - " + song.getTitle());
	    }
	    System.out.println();
    }
    
    public void orderDate() {
    	Collections.sort(playlist, Comparator.comparing(Song::getCreatDate));
    	System.out.println("Lista de canciones ordenadas por fecha de creación:");
	    for (Song song : playlist) {
	        System.out.println(song.getCreatDate() + " - " + song.getTitle());
	    }
	    System.out.println();
    }
}
