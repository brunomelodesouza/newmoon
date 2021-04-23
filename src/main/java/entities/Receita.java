package entities;


public class Receita {
	
	private String author;
    private String date;
    private String description;
    private Boolean hasRevenues;

    
   public Receita(){}

    public Receita(String author, String date, String description){
        this.author = author;
        this.date = date;
        this.description = description;
    }

    // Getters and Setters

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getHasRevenues() {
        return hasRevenues;
    }

    public void setHasRevenues(Boolean hasRevenues) {
        this.hasRevenues = hasRevenues;
    }


}
