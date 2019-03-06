/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anonyme
 */
public class Facture {
    int NumFacture;
    String DateFacture;
    int NumClient;
    int IDAdresseFacturation;
    int IDModeReglement;
    double TotalHT,TotalTVA,TotalTTC;
    String SaisiPar, SaisiLe;
    String Observation;
    
    int[] IDLigneFac, Quantite, IDLigneCde, OrdreAffichage;
    String[] Reference, LibProd;
    double[] PrixVente, Remise, TauxTVA;
    
    public Facture() {
    }

    public Facture(int NumFacture, String DateFacture, int NumClient, int IDAdresseFacturation, int IDModeReglement, double TotalHT, double TotalTVA, double TotalTTC, String SaisiPar, String SaisiLe, String Observation,
            int[] IDLigneFac, String[] Reference, String[] LibProd, int[] Quantite, double[] PrixVente, double[] Remise, double[] TauxTVA, int[] IDLigneCde, int[] OrdreAffichage) {
        this.NumFacture = NumFacture;
        this.DateFacture = DateFacture;
        this.NumClient = NumClient;
        this.IDAdresseFacturation = IDAdresseFacturation;
        this.IDModeReglement = IDModeReglement;
        this.TotalHT = TotalHT;
        this.TotalTVA = TotalTVA;
        this.TotalTTC = TotalTTC;
        this.SaisiPar = SaisiPar;
        this.SaisiLe = SaisiLe;
        this.Observation = Observation;
        this.IDLigneFac = IDLigneFac;
        this.Quantite = Quantite;
        this.IDLigneCde = IDLigneCde;
        this.OrdreAffichage = OrdreAffichage;
        this.Reference = Reference;
        this.LibProd = LibProd;
        this.PrixVente = PrixVente;
        this.Remise = Remise;
        this.TauxTVA = TauxTVA;
    }

    public int getNumFacture() {
        return NumFacture;
    }

    public void setNumFacture(int NumFacture) {
        this.NumFacture = NumFacture;
    }

    public String getDateFacture() {
        return DateFacture;
    }

    public void setDateFacture(String DateFacture) {
        this.DateFacture = DateFacture;
    }

    public int getNumClient() {
        return NumClient;
    }

    public void setNumClient(int NumClient) {
        this.NumClient = NumClient;
    }

    public int getIDAdresseFacturation() {
        return IDAdresseFacturation;
    }

    public void setIDAdresseFacturation(int IDAdresseFacturation) {
        this.IDAdresseFacturation = IDAdresseFacturation;
    }

    public int getIDModeReglement() {
        return IDModeReglement;
    }

    public void setIDModeReglement(int IDModeReglement) {
        this.IDModeReglement = IDModeReglement;
    }

    public double getTotalHT() {
        return TotalHT;
    }

    public void setTotalHT(double TotalHT) {
        this.TotalHT = TotalHT;
    }

    public double getTotalTVA() {
        return TotalTVA;
    }

    public void setTotalTVA(double TotalTVA) {
        this.TotalTVA = TotalTVA;
    }

    public double getTotalTTC() {
        return TotalTTC;
    }

    public void setTotalTTC(double TotalTTC) {
        this.TotalTTC = TotalTTC;
    }

    public String getSaisiPar() {
        return SaisiPar;
    }

    public void setSaisiPar(String SaisiPar) {
        this.SaisiPar = SaisiPar;
    }

    public String getSaisiLe() {
        return SaisiLe;
    }

    public void setSaisiLe(String SaisiLe) {
        this.SaisiLe = SaisiLe;
    }

    public String getObservation() {
        return Observation;
    }

    public void setObservation(String Observation) {
        this.Observation = Observation;
    }

    public int[] getIDLigneFac() {
        return IDLigneFac;
    }

    public void setIDLigneFac(int[] IDLigneFac) {
        this.IDLigneFac = IDLigneFac;
    }

    public int[] getQuantite() {
        return Quantite;
    }

    public void setQuantite(int[] Quantite) {
        this.Quantite = Quantite;
    }

    public int[] getIDLigneCde() {
        return IDLigneCde;
    }

    public void setIDLigneCde(int[] IDLigneCde) {
        this.IDLigneCde = IDLigneCde;
    }

    public int[] getOrdreAffichage() {
        return OrdreAffichage;
    }

    public void setOrdreAffichage(int[] OrdreAffichage) {
        this.OrdreAffichage = OrdreAffichage;
    }

    public String[] getReference() {
        return Reference;
    }

    public void setReference(String[] Reference) {
        this.Reference = Reference;
    }

    public String[] getLibProd() {
        return LibProd;
    }

    public void setLibProd(String[] LibProd) {
        this.LibProd = LibProd;
    }

    public double[] getPrixVente() {
        return PrixVente;
    }

    public void setPrixVente(double[] PrixVente) {
        this.PrixVente = PrixVente;
    }

    public double[] getRemise() {
        return Remise;
    }

    public void setRemise(double[] Remise) {
        this.Remise = Remise;
    }

    public double[] getTauxTVA() {
        return TauxTVA;
    }

    public void setTauxTVA(double[] TauxTVA) {
        this.TauxTVA = TauxTVA;
    }
    
    public int getCount() {
        return Reference.length;
    }
    
    
    
}
