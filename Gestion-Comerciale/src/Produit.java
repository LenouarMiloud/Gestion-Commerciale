/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anonyme
 */
public class Produit {

    public String getRef() {
        return Ref;
    }

    public void setRef(String Ref) {
        this.Ref = Ref;
    }

    public String getGenCode() {
        return GenCode;
    }

    public void setGenCode(String GenCode) {
        this.GenCode = GenCode;
    }

    public String getCodeBar() {
        return CodeBar;
    }

    public void setCodeBar(String CodeBar) {
        this.CodeBar = CodeBar;
    }

    public String getLibProd() {
        return LibProd;
    }

    public void setLibProd(String LibProd) {
        this.LibProd = LibProd;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public double getPrixHT() {
        return PrixHT;
    }

    public void setPrixHT(double PrixHT) {
        this.PrixHT = PrixHT;
    }

    public int getQteReappro() {
        return QteReappro;
    }

    public void setQteReappro(int QteReappro) {
        this.QteReappro = QteReappro;
    }

    public int getQteMini() {
        return QteMini;
    }

    public void setQteMini(int QteMini) {
        this.QteMini = QteMini;
    }

    public double getTauxTVA() {
        return TauxTVA;
    }

    public void setTauxTVA(double TauxTVA) {
        this.TauxTVA = TauxTVA;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String Photo) {
        this.Photo = Photo;
    }

    public int getNumFournisseur() {
        return NumFournisseur;
    }

    public void setNumFournisseur(int NumFournisseur) {
        this.NumFournisseur = NumFournisseur;
    }

    public int getPlusAuCatalogue() {
        return PlusAuCatalogue;
    }

    public void setPlusAuCatalogue(int PlusAuCatalogue) {
        this.PlusAuCatalogue = PlusAuCatalogue;
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

    public String getCodeFamille() {
        return CodeFamille;
    }

    public void setCodeFamille(String CodeFamille) {
        this.CodeFamille = CodeFamille;
    }

    public String getCodePort() {
        return CodePort;
    }

    public void setCodePort(String CodePort) {
        this.CodePort = CodePort;
    }
   
    String Ref;
    String GenCode;
    String CodeBar;
    String LibProd;
    String Description;
    double PrixHT;
    int QteReappro;
    int QteMini;
    double TauxTVA;
    String Photo;
    int NumFournisseur;
    int PlusAuCatalogue;
    String SaisiPar;
    String SaisiLe;
    String CodeFamille;
    String CodePort;
    
    
    Produit(String Ref, String GenCode, String CodeBar, String LibProd, String Description, double PrixHT, int QteR, int QteM,
            double TauxTVA, String Photo, int NumFournisseur, int PlusAuCatalogue, String SaisiPar, String SaisiLe, String CodeFamille, String CodePort) {
        this.Ref=Ref;
        this.GenCode=GenCode;
        this.CodeBar=CodeBar;
        this.LibProd=LibProd;
        this.Description=Description;
        this.PrixHT=PrixHT;
        this.QteReappro=QteR;
        this.QteMini=QteM;
        this.TauxTVA=TauxTVA;
        this.Photo=Photo;
        this.NumFournisseur=NumFournisseur;
        this.PlusAuCatalogue=PlusAuCatalogue;
        this.SaisiPar=SaisiPar;
        this.SaisiLe=SaisiLe;
        this.CodeFamille=CodeFamille;
        this.CodePort=CodePort;
    }
    
    
    
    
    Produit() {
        
    }
    
}
