package com.inti.model;

public class Etudiant {
	
	Candidat candidat;
	private String pwd;
	private String matiere;
	private float note;
	private float moyenne;	
	
	public Etudiant() {
		super();
	}
	
	public Etudiant(Candidat candidat, String pwd, String matiere, float note, float moyenne) {
		super();
		this.candidat = candidat;
		this.pwd = pwd;
		this.matiere = matiere;
		this.note = note;
		this.moyenne = moyenne;
	}
	
	public Candidat getCandidat() {
		return candidat;
	}
	public void setCandidat(Candidat candidat) {
		this.candidat = candidat;
	}
	public String getMatiere() {
		return matiere;
	}
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	public float getNote() {
		return note;
	}
	public void setNote(float note) {
		this.note = note;
	}
	public float getMoyenne() {
		return moyenne;
	}
	public void setMoyenne(float moyenne) {
		this.moyenne = moyenne;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}   

}
