import processing.serial.*;

Serial myPort;
String val;
int intensite;
EnumCombinaison enumCombinaison = EnumCombinaison.RIEN;
EnumIntensite enumIntensite = EnumIntensite.MOYEN;
ArrayList<Zone> avantHaut = new ArrayList<Zone>();
ArrayList<Zone> avantBas = new ArrayList<Zone>();
ArrayList<Zone> derriereHaut = new ArrayList<Zone>();
ArrayList<Zone> derriereBas = new ArrayList<Zone>();

PImage img;

void setup (){
  // A changer selon le port utilise
  String portName = Serial.list()[1];
  myPort = new Serial(this, portName, 9600); 
  
  //preparation du canvas
  size(668,515);
  img = loadImage("body.jpeg");
  image(img, 0, 0);
  fill(255, 0, 0);
  rect(618,0,50,50);
  fill(255, 255, 0);
  rect(618,50,50,50);
  fill(0,255,0);
  rect(618,100,50,50);
  
  //Preparation des listes
  /**Pour accelerer un peu le bazar, le 
  * canvas est séparé en 4 : devant derriere et haut bas 
  *(séparation au niveau de la taille donc les poignet/mains sont dans la partie basse
  */
  avantHaut.add(new Zone(100, 0, 150, 75, EnumCombinaison.TETE_AVANT));
  
}

void draw (){
  if(mousePressed){
    print(mouseX + " " + mouseY + "\n");
    verifierPartieCorps(mouseX, mouseY);
    print(enumCombinaison.getValeur() + ";"+enumIntensite.getValeur()+"\n"); 
    myPort.write(enumCombinaison.getValeur()+";"+enumIntensite.getValeur()+"\0");
  }
}

void verifierPartieCorps(int x, int y){
  if(mouseX >= 618){
    if (mouseY >= 0 && mouseY < 50){
       enumIntensite = EnumIntensite.FAIBLE;
    }else if(mouseY >= 50 && mouseY < 100){
       enumIntensite = EnumIntensite.MOYEN;
    }else if(mouseY >= 100 && mouseY < 150){
       enumIntensite = EnumIntensite.FORT;
    }
  } else if (mouseY < 250){
    if(mouseX > 300){
      chercherZone(derriereHaut);
    }else{
      chercherZone(avantHaut);
    }
  }else{
    if(mouseX > 300){
      chercherZone(derriereBas);
    }else{
      chercherZone(avantBas);
    }
  }
}

void chercherZone(ArrayList<Zone> zones){
  for (Zone zone : zones){
    println("ChercherZone");
    if(mouseX >= zone.getX() && mouseX <= zone.getXFin() && mouseY >= zone.getY() && mouseY <= zone.getYFin()){
      enumCombinaison = zone.getPartie();
    } 
  }
}
