
void setup() {
 
  // set the size of your sketch
  size(500,500);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for(int d = 200; d > 0; d-=20){
    if (d%40==0){
    fill(#FFFFFF);
    }
    else{
    fill(#F51414);
    }
    
    ellipse(250,250,d,d);
    
  }

  //Use an if statement and remainder to alternate the color of your rings.
  
  
}
