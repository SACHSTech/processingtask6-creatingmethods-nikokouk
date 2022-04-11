import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(77,18,255);
    // bob
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
          //Drawing ground (rectangle)
    
    ground((0), (float) (height / 1.6), (width), (height));

    //Drawing house base (rectangle)
  
    base((float) (width/4), (float) (height/2), (float) (width/4), (float) (height/4));


    //Drawing door (rectangles)
    
    door((float) (width/3.33), (float) (height*.65), (float) (width/16), (float) (height/10));
    
    //Drawing windows (rectangles)

    window((float) (width/3.33), (float) (height/1.818), (float) (width/6.666), (float) (height/13.33));
    
    //Drawing roof (triangle)

    roof((float) (width/4), (float) (height/2), (float) (width/2), (float) (height/2), (float) (width/2.66), (float) (height/2.5));
    

    //Drawing sun (circle)
    

    sun((float) (width/1.333), (float) (height*.175), (float) (width/5), (float) (height/5)); 

    // Draw flower

    flower((float) (width/10) , (float) (height*.6) , (float) (width*.06));
    flower((float) (width*.6), (float) (height*.8), (float) (width*.04));
    flower((float) (width*.8), (float) (height*.76), (float) (width*.02));
    flower((float) (width*.2), (float) (height*.9), (float) (width*.06));


    

  }

    /**
    Method for ground
    @param X1 for horizontal coordinate
    @param Y1 for vertical coordinate
    @param X2 for horzontal size
    @param Y2 for vertical size
    **/
    public void ground(float X1, float Y1, float X2, float Y2){
      fill(18,74,19);
      stroke(200);    
      rect(X1, Y1, X2, Y2);
      }
  
    /**Method for house base
    @param X1 for horizontal coordinate
    @param Y1 for vertical coordinate
    @param X2 for horzontal size
    @param Y2 for vertical size
    **/

    public void base(float X1, float Y1, float X2, float Y2){
      fill(110, 31, 31);
      rect(X1, Y1, X2, Y2);
    }
    /**Method for door
    @param X1 for horizontal coordinate
    @param Y1 for vertical coordinate
    @param X2 for horzontal size
    @param Y2 for vertical size
    **/
    public void door(float X1, float Y1, float X2, float Y2){
      fill(166,86,2);
      rect(X1, Y1, X2, Y2);
      }

    /**Method for window
    @param X1 for horizontal coordinate
    @param Y1 for vertical coordinate
    @param X2 for horzontal size
    @param Y2 for vertical size
    **/
    public void window(float X1, float Y1, float X2, float Y2){
      fill(245, 230, 215);
      rect(X1, Y1, X2, Y2);
      }

    /**Method for roof
    @param X1 for first horizontal coordinate
    @param Y1 for first vertical coordinate
    @param X2 for second horizontal coordinate
    @param Y2 for second vertical coordinate
    @param X3 for third horizontal coordinate
    @param Y3 for third vertical coordinate
    **/
    public void roof(float X1, float Y1, float X2, float Y2, float X3, float Y3){
      fill(135, 34, 27);
      triangle(X1, Y1, X2, Y2, X3, Y3);
      }

    /**Method for Sun
    @param X1 for horizontal coordinate
    @param Y1 for vertical coordinate
    @param X2 for horzontal size
    @param Y2 for vertical size
    **/
    public void sun(float X1, float Y1, float X2, float Y2){
      fill(252, 227, 3);
      ellipse(X1, Y1, X2, Y2);
      }

    void flower(float flowerX, float flowerY, float petalSize) {
  float petalDistance = petalSize / 2;

  fill(300, 50, 20);

    // upper-left petal
    ellipse(flowerX - petalDistance, flowerY - petalDistance, 
    petalSize, petalSize);

    // upper-right petal
    ellipse(flowerX + petalDistance, flowerY - petalDistance, 
    petalSize, petalSize);

    // lower-left petal
    ellipse(flowerX - petalDistance, flowerY + petalDistance, 
    petalSize, petalSize);

    // lower-right petal
    ellipse(flowerX + petalDistance, flowerY + petalDistance, 
    petalSize, petalSize);

    // center petal
    fill(86, 227, 126);
    ellipse(flowerX, flowerY, 
    petalSize, petalSize);
}

}