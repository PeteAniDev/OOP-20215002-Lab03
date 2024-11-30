package hust.soict.globalict.aims.media;

public class Disc extends Media {

	protected String director = null;
	protected int length = Integer.MIN_VALUE;

	public Disc(String title, String category, String director, int length, float cost) {
		super(title, category, cost);
		this.director = director;
		this.length = length;
	}

	public Disc(String title, String category, String director, float cost) {
		super(title, category, cost);
		this.director = director;
	}

	public Disc(String title, String category, float cost) {
		super(title, category, cost);
	}

	public Disc(String title) {
		super(title);
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}

}