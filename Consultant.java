package com.inti.model;

public class Consultant {
	
	Etudiant etudiant;
	private String mission;
	private String duree;
	private String entreprise;
	
	public Consultant() {
		super();
	}
	
	public Consultant(Etudiant etudiant, String mission, String duree, String entreprise) {
		super();
		this.etudiant = etudiant;
		this.mission = mission;
		this.duree = duree;
		this.entreprise = entreprise;
	}
	
	public Etudiant getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	public String getMission() {
		return mission;
	}
	public void setMission(String mission) {
		this.mission = mission;
	}
	public String getDuree() {
		return duree;
	}
	public void setDuree(String duree) {
		this.duree = duree;
	}
	public String getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}
}
