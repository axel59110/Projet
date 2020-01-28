import java.util.Arrays;

public class Formateur {
	int Id;
	String nom;
	String prénom;
	String spécialité; 
	String ville;
	String matière;
	String commentaire;
	Float note;
	Float moyenne;
	
	float tableaunote []= {note};

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrénom() {
		return prénom;
	}

	public void setPrénom(String prénom) {
		this.prénom = prénom;
	}

	public String getSpécialité() {
		return spécialité;
	}

	public void setSpécialité(String spécialité) {
		this.spécialité = spécialité;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getMatière() {
		return matière;
	}

	public void setMatière(String matière) {
		this.matière = matière;
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
		return "Formateur [Id=" + Id + ", nom=" + nom + ", prénom=" + prénom + ", spécialité=" + spécialité + ", ville="
				+ ville + ", matière=" + matière + ", commentaire=" + commentaire + ", note=" + note + ", moyenne="
				+ moyenne + ", tableaunote=" + Arrays.toString(tableaunote) + "]";
	}

	public Formateur() {
		super();
	}

	public Formateur(int id, String nom, String prénom, String spécialité, String ville, String matière,
			String commentaire, Float note, Float moyenne, float[] tableaunote) {
		super();
		Id = id;
		this.nom = nom;
		this.prénom = prénom;
		this.spécialité = spécialité;
		this.ville = ville;
		this.matière = matière;
		this.commentaire = commentaire;
		this.note = note;
		this.moyenne = moyenne;
		this.tableaunote = tableaunote;
	}
	
	
}
