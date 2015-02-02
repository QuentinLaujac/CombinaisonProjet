package metier;

class Zone {
  private int x;
  private int y;
  private int xfin;
  private int yfin;
  private EnumCombinaison partie;
 
 public Zone (int x, int y, int xfin, int yfin, EnumCombinaison partie){
  this.x = x;
  this.y = y;
  this.xfin = xfin;
  this.yfin = yfin;
  this.partie = partie;
 } 
 
 public int getX(){
   return this.x;
 }
 
 public int getY(){
   return this.y;
 }
 
 public int getXFin(){
   return this.xfin;
 }
 
 public int getYFin(){
   return this.yfin;
 }
 
 public EnumCombinaison getPartie (){
  return this.partie; 
 }
}
