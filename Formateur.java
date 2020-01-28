import java.util.Arrays;

public class Formateur {
	int Id;
	String nom;
	String pr�nom;
	String sp�cialit�; 
	String ville;
	String mati�re;
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

	public String getPr�nom() {
		return pr�nom;
	}

	public void setPr�nom(String pr�nom) {
		this.pr�nom = pr�nom;
	}

	public String getSp�cialit�() {
		return sp�cialit�;
	}

	public void setSp�cialit�(String sp�cialit�) {
		this.sp�cialit� = sp�cialit�;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getMati�re() {
		return mati�re;
	}

	public void setMati�re(String mati�re) {
		this.mati�re = mati�re;
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
		return "Formateur [Id=" + Id + ", nom=" + nom + ", pr�nom=" + pr�nom + ", sp�cialit�=" + sp�cialit� + ", ville="
				+ ville + ", mati�re=" + mati�re + ", commentaire=" + commentaire + ", note=" + note + ", moyenne="
				+ moyenne + ", tableaunote=" + Arrays.toString(tableaunote) + "]";
	}

	public Formateur() {
		super();
	}

	public Formateur(int id, String nom, String pr�nom, String sp�cialit�, String ville, String mati�re,
			String commentaire, Float note, Float moyenne, float[] tableaunote) {
		super();
		Id = id;
		this.nom = nom;
		this.pr�nom = pr�nom;
		this.sp�cialit� = sp�cialit�;
		this.ville = ville;
		this.mati�re = mati�re;
		this.commentaire = commentaire;
		this.note = note;
		this.moyenne = moyenne;
		this.tableaunote = tableaunote;
	}
	
	
}
