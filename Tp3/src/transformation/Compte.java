package transformation;
public class Compte {	
	int code ;
	   double solde;
	   String dateCreation ;
	public Compte(int code, double solde, String dateCreation) {
		super();
		this.code = code;
		this.solde = solde;
		this.dateCreation = dateCreation;}
 public int getCode() {
		return code;}
 public void setCode(int code) {
		this.code = code;}
	public double getSolde() {
		return solde;}
 public void setSolde(double solde) {
		this.solde = solde;}
	public String getDateCreation() {
		return dateCreation;}
	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;}
	public String getCompte (Compte c) {
		return "Compte [code="+code+",solde="+solde+",dateCreation="+dateCreation+"]";
		}}
