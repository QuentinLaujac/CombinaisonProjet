package metier;
public enum EnumCombinaison{
  RIEN (-1),
  TETE_AVANT (1),
  CORPS (2);
  
  private int valeur = -1;
  
  EnumCombinaison(int valeur){
   this.valeur = valeur; 
  }
  
  int getValeur(){
    return this.valeur; 
  }
}
