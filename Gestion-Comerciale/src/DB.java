/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Anonyme
 */
public class DB {
   
    		public static Boolean autoriser=false;
                public static Boolean deleted=true;
		public static Connection connect;
                public static ArrayList<Client> clients;
                public static ArrayList<Fournisseur> fournisseurs;
                public static ArrayList<Produit> produits;
                public static ArrayList<Facture> factures;
                
                public static int Num;
                public static ArrayList<Double> TVA;
                public static ArrayList<String> VRS;
                public static ArrayList<String> CFs,CPs,DMs;
                public static ArrayList<Integer> IDMs;
	
		DB(String utilisateur,String motdepasse) {
			
			 try {

			      Class.forName("com.mysql.jdbc.Driver").newInstance();
			      //System.out.println("Driver O.K.");

			      String url = "jdbc:mysql://localhost/gestioncommercialdb";
			      String user = "root";
			      String passwd = "";
			      
			      connect = DriverManager.getConnection(url, user, passwd);
			      //System.out.println("Connexion effective !");

			      Statement statement=connect.createStatement();  
			      ResultSet rs=statement.executeQuery("SELECT * FROM login WHERE NomUtilisateur='"+utilisateur+"' AND MotDePasse='"+motdepasse+"'");  
			      while(rs.next()) autoriser=true;

			    } catch (Exception e) {

			      e.printStackTrace();

			    }
			
		}
    
                
                static void CloseDB() {
 
                        try {
                            connect.close();
                        } catch (SQLException ex) {
                            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    
                }
                
                static void SelectNumClientDB() {
 
                        try {
                            Statement statement=connect.createStatement();  
			    ResultSet rs=statement.executeQuery("SELECT * FROM client");
                            clients = new ArrayList<Client>();
                            
                            while(rs.next()) {
                                clients.add(new Client(
                                        rs.getInt("NumClient"),
                                        rs.getString("NomClient"),
                                        rs.getString("Prenom"),
                                        rs.getString("Societe"),
                                        rs.getString("Civilite"),
                                        rs.getString("Adresse"),
                                        rs.getString("CodePostal"),
                                        rs.getString("Ville"),
                                        rs.getString("Pays"),
                                        rs.getString("Telephone"),
                                        rs.getString("Mobile"),
                                        rs.getString("Fax"),
                                        rs.getString("Email")
                                ));
                                
                            }
                             
			      
                        } catch (SQLException ex) {
                            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    
                }
                
                static void SelectNumFournisseurDB() {
 
                        try {
                            Statement statement=connect.createStatement();  
			    ResultSet rs=statement.executeQuery("SELECT * FROM fournisseur");
                            fournisseurs = new ArrayList<Fournisseur>();
                            
                            while(rs.next()) {
                                fournisseurs.add(new Fournisseur(
                                        rs.getInt("NumFournisseur"),
                                        rs.getString("Nom"),
                                        rs.getString("Prenom"),
                                        rs.getString("Societe"),
                                        rs.getString("Civilite"),
                                        rs.getString("Adresse"),
                                        rs.getString("CodePostal"),
                                        rs.getString("Ville"),
                                        rs.getString("Pays"),
                                        rs.getString("Telephone"),
                                        rs.getString("Mobile"),
                                        rs.getString("Fax"),
                                        rs.getString("Email")
                                ));
                                
                            }
                             
			      
                        } catch (SQLException ex) {
                            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    
                }
                
                static void SelectRefProduitDB() {
 
                        try {
                            Statement statement=connect.createStatement();  
			    ResultSet rs=statement.executeQuery("SELECT * FROM produit");
                            produits = new ArrayList<Produit>();
                            
                            while(rs.next()) {
                                produits.add(new Produit(
                                        rs.getString("Reference"),
                                        rs.getString("genCode"),
                                        rs.getString("codeBarre"),
                                        rs.getString("LibProd"),
                                        rs.getString("description"),
                                        rs.getDouble("PrixHT"),
                                        rs.getInt("QteReappro"),
                                        rs.getInt("QteMini"),
                                        rs.getDouble("TauxTVA"),
                                        rs.getString("Photo"),
                                        rs.getInt("NumFournisseur"),
                                        rs.getInt("plusAuCatalogue"),
                                        rs.getString("SaisiPar"),
                                        rs.getString("SaisiLe"),
                                        rs.getString("CodeFamille"),
                                        rs.getString("CodePort")
                                ));
                                
                            }
                             
			      
                        } catch (SQLException ex) {
                            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    
                }
                             
                static void SelectNumFactureDB() {
 
                        try {
                            Statement statement=connect.createStatement();  
			    ResultSet rs=statement.executeQuery("SELECT * FROM facture");
                            
                            factures = new ArrayList<Facture>();
                            int NumFacture;
                            
                            while(rs.next()) {
                                NumFacture = rs.getInt("NumFacture");
                                
                                
                                Statement statement2=connect.createStatement();  
                                ResultSet rs2=statement2.executeQuery("SELECT *,count(*) AS L FROM lignefac WHERE NumFacture="+NumFacture);
                                int i=0;
                                rs2.next(); int L=rs2.getInt("L");
                                
                                    int[] IDLigneFac = new int[L],
                                          Quantite = new int[L],
                                          IDLigneCde = new int[L],
                                          OrdreAffichage = new int[L];
                                    String[] Reference = new String[L],
                                             LibProd = new String[L];
                                    double[] PrixVente = new double[L],
                                             Remise = new double[L],
                                             TauxTVA = new double[L];
                                rs2.beforeFirst();
                                 while(rs2.next()) {
                                     IDLigneFac[i] = rs2.getInt("IDLigneFac");
                                     Reference[i] = rs2.getString("Reference");
                                     LibProd[i] = rs2.getString("LibProd");
                                     Quantite[i] = rs2.getInt("Quantite");
                                     PrixVente[i] = rs2.getDouble("PrixVente");
                                     Remise[i] = rs2.getDouble("Remise");
                                     TauxTVA[i] = rs2.getDouble("TauxTVA");
                                     IDLigneCde[i] = rs2.getInt("IDLigneCde");
                                     OrdreAffichage[i] = rs2.getInt("OrdreAffichage");
                                     i++;
                                 }
                                
                                factures.add(new Facture(
                                        NumFacture,
                                        rs.getString("DateFacture"),
                                        rs.getInt("NumClient"),
                                        rs.getInt("IDAdresseFacturation"),
                                        rs.getInt("IDModeReglement"),
                                        rs.getDouble("TotalHT"),
                                        rs.getDouble("TotalTVA"),
                                        rs.getDouble("TotalTTC"),
                                        rs.getString("SaisiPar"),
                                        rs.getString("SaisiLe"),
                                        rs.getString("Observation"),
                                        IDLigneFac,
                                        Reference,
                                        LibProd,
                                        Quantite,
                                        PrixVente,
                                        Remise,
                                        TauxTVA,
                                        IDLigneCde,
                                        OrdreAffichage
                                ));
                                
                            }
                             
			      
                        } catch (SQLException ex) {
                            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    
                }
                           
                static void SelectTauxTVADB() {
 
                        try {
                            Statement statement=connect.createStatement();  
			    ResultSet rs=statement.executeQuery("SELECT * FROM tva");
                            TVA = new ArrayList<Double>();
                            
                            while(rs.next()) {
                                TVA.add(rs.getDouble("TauxTVA"));
                            }
                             
			      
                        } catch (SQLException ex) {
                            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    
                }
                
                static void SelectVerssement() {
 
                        try {
                            Statement statement=connect.createStatement();  
			    ResultSet rs=statement.executeQuery("SELECT * FROM verssement");
                            VRS = new ArrayList<String>();
                            
                            while(rs.next()) {
                                VRS.add(rs.getString("client"));
                                VRS.add(rs.getString("verssement"));
                                VRS.add(rs.getString("date_verssement"));
                            }
                             
			      
                        } catch (SQLException ex) {
                            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    
                }
                
                static void SelectCodeFamilleDB() {
 
                        try {
                            Statement statement=connect.createStatement();  
			    ResultSet rs=statement.executeQuery("SELECT * FROM famille");
                            CFs = new ArrayList<String>();
                            
                            while(rs.next()) {
                                CFs.add(rs.getString("Libelle"));
                            }
                             
			      
                        } catch (SQLException ex) {
                            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    
                }
                
                static void SelectCodePortDB() {
 
                        try {
                            Statement statement=connect.createStatement();  
			    ResultSet rs=statement.executeQuery("SELECT * FROM fraisport");
                            CPs = new ArrayList<String>();
                            
                            while(rs.next()) {
                                CPs.add(rs.getString("CodePort"));
                            }
                             
			      
                        } catch (SQLException ex) {
                            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    
                }
                
                static void SelectIDModeRegelementDB() {
 
                        try {
                            Statement statement=connect.createStatement();  
			    ResultSet rs=statement.executeQuery("SELECT * FROM modereglement");
                            IDMs = new ArrayList<Integer>();
                            DMs = new ArrayList<String>();
                            
                            while(rs.next()) {
                                IDMs.add(rs.getInt("IDModeReglement"));
                                DMs.add(rs.getString("LibModeReglement"));
                            }
                             
			      
                        } catch (SQLException ex) {
                            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    
                }
                
               
                static void UpdateDB(Client client) {
 
                            Statement statement;
                        try {
                            statement = connect.createStatement();
                            statement.executeUpdate("UPDATE client SET "+
			    		  "Societe='"+client.getSociete()+"',"+
			    		  "Civilite='"+client.getCivilite()+"',"+
			    		  "NomClient='"+client.getNomClient()+"',"+
			    		  "Prenom='"+client.getPrenom()+"',"+
			    		  "Adresse='"+client.getAdresse()+"',"+
			    		  "CodePostal='"+client.getCodePostal()+"',"+
			    		  "Ville='"+client.getVille()+"',"+
			    		  "Pays='"+client.getPays()+"',"+
			    		  "Telephone='"+client.getTelephone()+"',"+
			    		  "Fax='"+client.getFax()+"',"+
			    		  "Email='"+client.getEmail()+
			    		  "' WHERE NumClient="+client.getNum());
                            
                            
                        } catch (SQLException ex) {
                            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
                        }
                            
                }
                
                static void UpdateDB(Fournisseur fournisseur) {
 
                            Statement statement;
                        try {
                            statement = connect.createStatement();
                            statement.executeUpdate("UPDATE client SET "+
			    		  "Societe='"+fournisseur.getSociete()+"',"+
			    		  "Civilite='"+fournisseur.getCivilite()+"',"+
			    		  "NomClient='"+fournisseur.getNom()+"',"+
			    		  "Prenom='"+fournisseur.getPrenom()+"',"+
			    		  "Adresse='"+fournisseur.getAdresse()+"',"+
			    		  "CodePostal='"+fournisseur.getCodePostal()+"',"+
			    		  "Ville='"+fournisseur.getVille()+"',"+
			    		  "Pays='"+fournisseur.getPays()+"',"+
			    		  "Telephone='"+fournisseur.getTelephone()+"',"+
			    		  "Fax='"+fournisseur.getFax()+"',"+
			    		  "Email='"+fournisseur.getEmail()+
			    		  "' WHERE NumFournisseur="+fournisseur.getNum());
                            
                            
                        } catch (SQLException ex) {
                            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
                        }
                            
                }
                
                static void UpdateDB(Produit produit) {
 
                            Statement statement;
                        try {
                            statement = connect.createStatement();
                            statement.executeUpdate("UPDATE produit SET "+
			    		  "SaisiPar='"+produit.getSaisiPar()+"',"+
                                          "SaisiLe='"+produit.getSaisiLe()+"',"+
                                          "CodeFamille='"+produit.getCodeFamille()+"',"+
                                          "CodePort='"+produit.getCodePort()+"',"+
			    		  "genCode='"+produit.getGenCode()+"',"+
			    		  "CodeBarre='"+produit.getCodeBar()+"',"+
			    		  "LibProd='"+produit.getLibProd()+"',"+
			    		  "description='"+produit.getDescription()+"',"+
			    		  "PrixHT='"+produit.getPrixHT()+"',"+
			    		  "QteReappro='"+produit.getQteReappro()+"',"+
			    		  "QteMini='"+produit.getQteMini()+"',"+
			    		  "TauxTVA='"+produit.getTauxTVA()+"',"+
			    		  "NumFournisseur='"+produit.getNumFournisseur()+"',"+
			    		  "PlusAuCatalogue='"+produit.getPlusAuCatalogue()+
			    		  "' WHERE Reference='"+produit.getRef()+"'");
                            
                            
                        } catch (SQLException ex) {
                            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
                        }
                            
                }
                
                static void UpdateDB(Facture facture) {
 
                            Statement statement,statement2[] = new Statement[facture.getCount()];
                        try {
                            statement = connect.createStatement();
                            statement.executeUpdate("UPDATE facture SET "+
			    		  "NumClient="+facture.getNumClient()+","+
			    		  "IDModeReglement="+facture.getIDModeReglement()+","+
			    		  "TotalHT="+facture.getTotalHT()+","+
			    		  "TotalTVA="+facture.getTotalTVA()+","+
                                          "TotalTTC="+facture.getTotalTTC()+","+
                                          "Observation='"+facture.getObservation()+
			    		  "' WHERE NumFacture="+facture.getNumFacture());
                            
                            for(int i=0; i<statement2.length;i++) {
                            statement2[i] = connect.createStatement();
                            statement2[i].executeUpdate("UPDATE lignefac SET "+
                                    "Reference='"+facture.getReference()[i]+ "',"+
                                    "LibProd='"+facture.getLibProd()[i]+ "',"+
                                    "Quantite="+facture.getQuantite()[i]+ ","+
                                    "PrixVente="+facture.getPrixVente()[i]+ ","+
                                    "Remise="+facture.getRemise()[i]+ ","+
                                    "TauxTVA="+facture.getTauxTVA()[i]+
                                    " WHERE NumFacture="+facture.getNumFacture());
                            
                            
                            }
                            
                        } catch (SQLException ex) {
                            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
                        }
                            
                }
                
                static void InsertDB(Client client) {
 
                            Statement statement,statement2;
                        try {
                            statement = connect.createStatement();
                            statement.executeUpdate("INSERT INTO client VALUES ("+
                                          client.getNum()+",'"+
			    		  client.getSociete()+"','"+
			    		  client.getCivilite()+"','"+
			    		  client.getNomClient()+"','"+
			    		  client.getPrenom()+"','"+
			    		  client.getAdresse()+"','"+
			    		  client.getCodePostal()+"','"+
			    		  client.getVille()+"','"+
			    		  client.getPays()+"','"+
			    		  client.getTelephone()+"','"+
                                          client.getMobile()+"','"+      
			    		  client.getFax()+"','"+
			    		  client.getEmail()+"',"+
                                          "NULL"+","+
                                          "NULL"+","+
                                          "NULL"+","+
                                          "NULL"+","+
			    		  "NULL"+","+
                                          "NULL"+","+
                                          "NULL"+","+
                                          "NULL"+","+
                                          "NULL"+");");
                            
                            statement2 = connect.createStatement();
                            statement2.executeUpdate("INSERT INTO adr_facturation VALUES ("+
                                          client.getNum()+","+
                                          client.getNum()+",'"+
                                          client.getCivilite()+"',"+
                                          "NULL,'"+
			    		  client.getAdresse()+"','"+
			    		  client.getCodePostal()+"','"+
			    		  client.getVille()+"','"+
			    		  client.getPays()+"','"+
			    		  client.getTelephone()+"','"+
                                          client.getMobile()+"','"+      
			    		  client.getFax()+"','"+
			    		  client.getEmail()+"',"+
                                          "NULL"+")");
                            
                        } catch (SQLException ex) {
                            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
                        }
                            
                }
                
                static void InsertDB(Fournisseur fournisseur) {
 
                            Statement statement;
                        try {
                            statement = connect.createStatement();
                            statement.executeUpdate("INSERT INTO fournisseur VALUES ("+
                                          fournisseur.getNum()+",'"+
			    		  fournisseur.getSociete()+"','"+
			    		  fournisseur.getCivilite()+"','"+
			    		  fournisseur.getNom()+"','"+
			    		  fournisseur.getPrenom()+"','"+
			    		  fournisseur.getAdresse()+"','"+
			    		  fournisseur.getCodePostal()+"','"+
			    		  fournisseur.getVille()+"','"+
			    		  fournisseur.getPays()+"','"+
			    		  fournisseur.getTelephone()+"','"+
                                          fournisseur.getMobile()+"','"+      
			    		  fournisseur.getFax()+"','"+
			    		  fournisseur.getEmail()+"',"+
                                          "NULL"+")");
                            
                            
                        } catch (SQLException ex) {
                            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
                        }
                            
                }
                
                static void InsertDB(Produit produit) {
 
                            Statement statement;
                        try {
                            statement = connect.createStatement();
                            statement.executeUpdate("INSERT INTO produit VALUES ('"+
                                          produit.getRef()+"','"+
			    		  produit.getGenCode()+"','"+
			    		  produit.getCodeBar()+"','"+
			    		  produit.getLibProd()+"','"+
			    		  produit.getDescription()+"','"+
			    		  produit.getPrixHT()+"','"+
			    		  produit.getQteReappro()+"','"+
			    		  produit.getQteMini()+"','"+
			    		  produit.getTauxTVA()+"','"+
			    		  "NULL"+"','"+
                                          produit.getNumFournisseur()+"','"+      
			    		  produit.getPlusAuCatalogue()+"','"+
			    		  produit.getSaisiPar()+"','"+
                                          produit.getSaisiLe()+"','"+
                                          produit.getCodeFamille()+"','"+
                                          produit.getCodePort()+"')");
                            
                            
                        } catch (SQLException ex) {
                            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
                        }
                            
                }
                
                static void InsertDB(Facture facture) {
                            Statement statement,statement2[] = new Statement[facture.getCount()];
                        try {
                            System.out.println("date :"+facture.getDateFacture());
                            statement = connect.createStatement();
                            statement.executeUpdate("INSERT INTO `facture`("
                                    + "`DateFacture`, `NumClient`, `IDAdresseFacturation`,"
                                    + " `IDModeReglement`, `TotalHt`, `TotalTva`, "
                                    + "`TotalFraisPort`, `TotalTtc`, `Remise`,"
                                    + " `Acquittee`, `SaisiPar`, `SaisiLe`, "
                                    + "`Observations`, `NumCommande`) VALUES('"+
			    		  facture.getDateFacture()+"',"+
			    		  facture.getNumClient()+","+
                                          facture.getIDAdresseFacturation()+","+
			    		  facture.getIDModeReglement()+","+
			    		  facture.getTotalHT()+","+
			    		  facture.getTotalTVA()+","+
                                          "NULL"+","+
                                          facture.getTotalTTC()+","+
			    		  "NULL"+","+
			    		  "NULL"+",'"+
                                          facture.getSaisiPar()+"','"+      
			    		  facture.getSaisiLe()+"','"+
                                          facture.getObservation()+"',"+
                                          "NULL"+");");
                            
                            for(int i=0; i<statement2.length;i++) {
                            statement2[i] = connect.createStatement();
                            statement2[i].executeUpdate("INSERT INTO `lignefac`("
                                    + "`Reference`,"
                                    + " `LibProd`, `Quantite`, `PrixVente`,"
                                    + " `Remise`, `TauxTva`) VALUES( '"+
                                    facture.getReference()[i]+ "','"+
                                    facture.getLibProd()[i]+ "',"+
                                    facture.getQuantite()[i]+ ","+
                                    facture.getPrixVente()[i]+ ","+
                                    "NULL"+","+
                                    facture.getTauxTVA()[i]+ ");");
                            
                            
                            }
                            
                        } catch (SQLException ex) {
                            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
                        }
                            
                }
                
                static void DeleteDB(Client client) {
 
                            Statement statement,statement2;
                        try {
                            
                            statement2 = connect.createStatement();
                            statement2.executeUpdate("DELETE FROM adr_facturation WHERE NumClient="+client.getNum());
                            
                            statement = connect.createStatement();
                            statement.executeUpdate("DELETE FROM client WHERE NumClient="+client.getNum());
                            
                            ResultSet rs=statement.executeQuery("SELECT * FROM client WHERE NumClient="+client.getNum());  
			      while(rs.next()) deleted=false;
                            
                        } catch (SQLException ex) {
                            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
                        }
                            
                }
                
                static void DeleteDB(Fournisseur fournisseur) {
 
                            Statement statement;
                        try {
                            statement = connect.createStatement();
                            statement.executeUpdate("DELETE FROM client WHERE NumFournisseur="+fournisseur.getNum());
                            
                        } catch (SQLException ex) {
                            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
                        }
                            
                }
                
                static void DeleteDB(Produit produit) {
 
                            Statement statement;
                        try {
                            statement = connect.createStatement();
                            statement.executeUpdate("DELETE FROM produit WHERE Reference='"+produit.getRef()+"'");
                            
                        } catch (SQLException ex) {
                            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
                        }
                            
                }
                
                
                static void AutoNum() {
                    
                    
            
                    ResultSet  rs;
                        try {
                            PreparedStatement  pre = connect.prepareStatement("SELECT NumClient FROM client ");
                            rs = pre.executeQuery();
                            if (rs.next()) {
                            rs.last();
                            Num = rs.getInt(1)+1; } else {
                                Num = 1;
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    
                    
                    
                    
                }
                
                static void AutoNumFournisseur() {
                    
                    
            
                    ResultSet  rs;
                        try {
                            PreparedStatement  pre = connect.prepareStatement("SELECT NumFournisseur FROM fournisseur ");
                            rs = pre.executeQuery();
                            if (rs.next()) {
                            rs.last();
                            Num = rs.getInt(1)+1; } else {
                                Num = 1;
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    
                }
                
                static void AutoNumFacture() {
                    
                    
            
                    ResultSet  rs;
                        try {
                            PreparedStatement  pre = connect.prepareStatement("SELECT NumClient FROM facture ");
                            rs = pre.executeQuery();
                            if (rs.next()) {
                            rs.last();
                            Num = rs.getInt(1)+1; } else {
                                Num = 1;
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    
                    
                    
                    
                }
                
}
