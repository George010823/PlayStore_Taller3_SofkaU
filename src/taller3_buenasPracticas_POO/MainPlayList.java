package taller3_buenasPracticas_POO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPlayList {

	private static int option = 0;
	
	public static void main(String[] args) {
		
		Scanner inpOption = new Scanner(System.in);
		PlayList myListMusic = new PlayList();
		Storemusic processMusic = new Storemusic();
		
		Song song1 = new BaseSong("Bohemian Rhapsody", 1, LocalDate.of(1984, 10, 8), 5.55D, "Rock", "Piano", "Team Queen");
		Song song2 = new BaseSong("Stairway to Heaven", 2, LocalDate.of(1985, 11, 9), 4.35D, "Rock", "Guitar", "Team Led Zeppelin");
		Song song3 = new BaseSong("Hotel California", 3, LocalDate.of(1986, 12, 10), 3.58D, "Balada", "Batery", "Team Eagles");
		Song song4 = new BaseSong("Imagine", 4, LocalDate.of(1987, 01, 11), 2.25D, "Rock", "Metal", "The Singer is John Lennon");
		Song song5 = new BaseSong("Sweet Child O' Mine", 5, LocalDate.of(1990, 02, 25), 3.25D, "Classic", "Bass", "Team Guns N' Roses");
		Song song6 = new BaseSong("Separate Ways", 6, LocalDate.of(1991, 03, 28), 7.15D, "Urban", "Alone", "Team Journey");
		Song song7 = new BaseSong("Despacito", 7, LocalDate.of(2017, 04, 8), 3.48D, "Reggaeton", "Piano", "Luis Fonsi");
		Song song8 = new BaseSong("Rolling in the Deep", 8, LocalDate.of(2010, 05, 19), 3.48D, "Pop", "Guitar", "Adele");
		Song song9 = new BaseSong("Billie Jean", 9, LocalDate.of(1982, 06, 30), 4.54D, "Pop", "Batery", "Michael Jackson");
		Song song10 = new BaseSong("I Will Always Love You", 10, LocalDate.of(1992, 07, 1), 4.31D, "Balada", "Metal", "Whitney Houston");
		Song song11 = new BaseSong("Happy", 11, LocalDate.of(2013, 8, 11), 3.53D, "Pop", "Bass", "Pharrell Williams");
		Song song12 = new BaseSong("Smells Like Teen Spirit", 12, LocalDate.of(1991, 9, 21), 5.15D, "Rock", "Alone", "Nirvana");
		
		myListMusic.addSong(song1);
		myListMusic.addSong(song2);
		myListMusic.addSong(song3);
		myListMusic.addSong(song4);
		myListMusic.addSong(song5);
		myListMusic.addSong(song6);
		myListMusic.addSong(song7);
		myListMusic.addSong(song8);
		myListMusic.addSong(song9);
		myListMusic.addSong(song10);
		myListMusic.addSong(song11);
		myListMusic.addSong(song12);
		
		List<Song> allSongs = new ArrayList<>();
		allSongs.add(song1);
		allSongs.add(song2);
		allSongs.add(song3);
		allSongs.add(song4);
		allSongs.add(song5);
		allSongs.add(song6);
		allSongs.add(song7);
		allSongs.add(song8);
		allSongs.add(song9);
		allSongs.add(song10);
		allSongs.add(song11);
		allSongs.add(song12);
		
		int bandera = 0;
		do {
			do {
				myListMusic.showMenuPrincipal();
				
				option = inpOption.nextInt();
				
				if(option >= 1 && option <= 4) {
					bandera = 1;
				} else {
					System.out.println("-------------------------------------------------");
					System.out.println("Opción no disponible, vuelva a intentar porfavor.");
					System.out.println("-------------------------------------------------");
				}
			}while(bandera == 0);
			
			switch(option) {
			case 1:
				System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("---------------------------------------------------------Play Store.--------------------------------------------------------------");
				System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
				myListMusic.showSongs();
				System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("---------------------------------------------------------Play Store.--------------------------------------------------------------");
				System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
				break;
			case 2:
				System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("--------------------------------------------------------Creación PlayList.--------------------------------------------------------");
				System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
				processMusic.selectSong(allSongs);
				System.out.println();
				break;
			case 3:
				processMusic.showPlaylist();
				break;
			case 4:
				System.out.println("-------------------------");
				System.out.println("!Gracias¡, vuelva pronto.");
				System.out.println("-------------------------");
				bandera = 2;
				break;
			default:
				break;
			}
		}while(bandera !=2);
    
	}
}
