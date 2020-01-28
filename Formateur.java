import java.util.Arrays;

public class Formateur {
	private int id;
	private String nom;
	private String prenom;
	private String specialite; 
	private String ville;
	private String matiere;
	private String commentaire;
	private Float note;
	private Float moyenne;
	
	float tableaunote []= {note};

	public int getId() {
		return id;
	}

	public void setId(int id) {
		id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getMatiere() {
		return matiere;
	}

	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Float getNote() {
		return note;
	}

	public void setNote(Float note) {
		this.note = note;
	}

	public Float getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(Float moyenne) {
		this.moyenne = moyenne;
	}

	public float[] getTableaunote() {
		return tableaunote;
	}

	public void setTableaunote(float[] tableaunote) {
		this.tableaunote = tableaunote;
	}

	@Override
	public String toString() {
		return "Formateur [Id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", specialite=" + specialite + ", ville="
				+ ville + ", matiere=" + matiere + ", commentaire=" + commentaire + ", note=" + note + ", moyenne="
				+ moyenne + ", tableaunote=" + Arrays.toString(tableaunote) + "]";
	}

	public Formateur() {
		super();
	}

	public Formateur(int id, String nom, String prenom, String specialite, String ville, String matiere,
			String commentaire, Float note, Float moyenne, float[] tableaunote) {
		super();
		id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.specialite = specialite;
		this.ville = ville;
		this.matiere = matiere;
		this.commentaire = commentaire;
		this.note = note;
		this.moyenne = moyenne;
		this.tableaunote = tableaunote;
	}
	
	
}
