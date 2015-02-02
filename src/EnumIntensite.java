enum EnumIntensite{
  RIEN (0),
  FAIBLE (1),
  MOYEN (2),
  FORT (3);
  
  private int valeur = -1;
  
  EnumIntensite(int valeur){
   this.valeur = valeur; 
  }
  
  int getValeur(){
    return this.valeur; 
  }
}
