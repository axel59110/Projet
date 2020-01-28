
public interface IFormateurTravail  {
	
	public  Formateur AjouterNote();
	void DeleteNote();
	public Formateur UpdateNote();
	void CalculMoyenne();
	public Formateur AjouterCommentaire();
	void DeleteCommentaire();
	public Formateur UpdateCommentaire();
	void TerminerMatiere(); 
	void AvancéeMatière ();
	void WarningEtudiant();
	void FindbyId(int id);
}
