
void setup() {
 
  // set the size of your sketch
  size(500,500);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for(int i = 0; i<11; i++){
  for(int d = 20; d < 21; d-=2){
    
    ellipse(250,250,d,d);
    
  }
  }
  //Use an if statement and remainder to alternate the color of your rings.
  
  
}
