
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square wall1;
    private Square window1;
    private Triangle roof1;
    private Square wall2;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(30);
        sun.changeSize(60);
        sun.makeVisible();
        
        wall = new Square();
        wall.moveVertical(80);

        wall.changeSize(100);
        wall.makeVisible();
        
        wall1 = new Square();
        wall1.moveVertical(80);
        wall1.moveHorizontal(80);
        wall1.changeSize(100);
        wall1.makeVisible();


        window = new Square();
        window.changeColor("green");
        window.moveHorizontal(10);
        window.moveVertical(100);
        window.makeVisible();
        
        window1 = new Square();
        window1.changeColor("green");
        window1.moveHorizontal(120);
        window1.moveVertical(100);
        window1.makeVisible();


        roof = new Triangle();
        roof.changeSize(50, 100);
        roof.moveHorizontal(50);
        roof.moveVertical(70);
        roof.makeVisible();
        
        roof1 = new Triangle();
        roof1.changeSize(50, 100);
        roof1.moveHorizontal(150);
        roof1.moveVertical(70);
        roof1.makeVisible();
        
        wall2 = new Square();
        wall2.moveVertical(200);
        wall2.moveHorizontal(150);
        wall2.changeSize(20);
        wall2.makeVisible();
        
        
        


        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
