package pixLab.classes;
import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
    	int tempBlue = pixelObj.getBlue();
        pixelObj.setBlue(0);
        tempBlue = pixelObj.getBlue();
      }
    }
  }
  
  /**
   * Set the Red Value to 0.
   */
  
  public void zeroRed()
  {
	  Pixel[][] original = this.getPixels2D();
	  for(int row = 0; row < original.length; row++)
	  {
		  for(int col = 0; col < original[0].length; col++)
		  {
			  Pixel currentPixel = original[row][col];
			  currentPixel.setRed(0);
		  }
	  }
  }
  
  /**
   * Sets the Green value to 0.
   */
  
  public void zeroGreen()
  {
	  Pixel[][] original = this.getPixels2D();
	  for(int row = 0; row < original.length; row++)
	  {
		  for(int col = 0; col < original[0].length; col++)
		  {
			  Pixel currentPixel = original[row][col];
			  currentPixel.setGreen(0);
		  }
	  }
  }
  
  /**
   * Sets Green Value to the max number.
   */
  public void maxGreen()
  {
	  Pixel[][] original = this.getPixels2D();
	  for(int row = 0; row < original.length; row++)
	  {
		  for(int col = 0; col < original[0].length; col++)
		  {
			  Pixel currentPixel = original[row][col];
			  currentPixel.setGreen(256);
		  }
	  }
  }
  
  /**
   * Sets Red Value to the max number.
   */
  
  public void maxRed()
  {
	  Pixel[][] original = this.getPixels2D();
	  for(int row = 0; row < original.length; row++)
	  {
		  for(int col = 0; col < original[0].length; col++)
		  {
			  Pixel currentPixel = original[row][col];
			  currentPixel.setRed(256);
		  }
	  }
  }
  
  /**
   * Sets Blue Value to the max number.
   */
  
  public void maxBlue()
  {
	  Pixel[][] original = this.getPixels2D();
	  for(int row = 0; row < original.length; row++)
	  {
		  for(int col = 0; col < original[0].length; col++)
		  {
			  Pixel currentPixel = original[row][col];
			  currentPixel.setBlue(256);
		  }
	  }
  }
  
  public void keepOnlyBlue()
  {
	  Pixel[][] original = this.getPixels2D();
	  for(int row = 0; row < original.length; row++)
	  {
		  for(int col = 0; col < original[0].length; col++)
		  {
			  Pixel currentPixel = original[row][col];
			  currentPixel.setRed(0);
			  currentPixel.setGreen(0);
		  }
	  }
  }
  
  public void keepOnlyRed()
  {
	  Pixel[][] original = this.getPixels2D();
	  for(int row = 0; row < original.length; row++)
	  {
		  for(int col = 0; col < original[0].length; col++)
		  {
			  Pixel currentPixel = original[row][col];
			  currentPixel.setBlue(0);
			  currentPixel.setGreen(0);
		  }
	  }
  }
  
  public void keepOnlyGreen()
  {
	  Pixel[][] original = this.getPixels2D();
	  for(int row = 0; row < original.length; row++)
	  {
		  for(int col = 0; col < original[0].length; col++)
		  {
			  Pixel currentPixel = original[row][col];
			  currentPixel.setRed(0);
			  currentPixel.setBlue(0);
		  }
	  }
  }
  
  
  public void grayScale()
  	   {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	    	int average = (int)pixelObj.getAverage();
	    	pixelObj.setBlue(average);
	    	pixelObj.setRed(average);
	    	pixelObj.setGreen(average);
	    	
	      }
	     }
  		}
  
  public void negate()
  {
	  Pixel[][] original = this.getPixels2D();
	  for(int row = 0; row < original.length; row++)
	  {
		  for(int col = 0; col < original[0].length; col++)
		  {
			  Pixel currentPixel = original[row][col];
			  
			  int newRed;
			  int newBlue;
			  int newGreen;
			  
			  newBlue = 255 - currentPixel.getBlue();
			  newGreen = 255 - currentPixel.getGreen();
			  newRed = 255 -currentPixel.getRed();
			  
			  currentPixel.setRed(newRed);
			  currentPixel.setBlue(newBlue);
			  currentPixel.setGreen(newGreen);
		  }
	  }
  }
  
  
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  public void randomColor()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[] row : pixels)
	  {
		  for(Pixel currentPixel : row)
		  {
			  int randomRed, randomBlue, randomGreen;
			  randomRed = (int)(Math.random()* 256);
			  randomBlue = (int)(Math.random()* 256);
			  randomGreen = (int)(Math.random()* 256);
			  currentPixel.setBlue(randomBlue);
			  currentPixel.setGreen(randomGreen);
			  currentPixel.setRed(randomRed);
		  }
	  }
  }
  
  public void mirrorVerticalRighttoLeft()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	  int pictureWidth = pixels[0].length;
	  for(int row = 0; row < pixels.length; row++)
	  {
		  for(int col = pixels[0].length - 1; col > pictureWidth/2; col--)
		  {
			  rightPixel = pixels[row][col];
			  leftPixel = pixels[row][(pictureWidth/2 - (col - pictureWidth/2))];
			  leftPixel.setColor(rightPixel.getColor());
		  }
	  }
	  
  }
  
  public void mirrorHorizontal()
  {
	  Pixel[][] pixels =this.getPixels2D();
	  Pixel TopPixel = null;
	  Pixel BottomPixel = null;
	  for(int col = 0; col < pixels[0].length; col++)
	  {
		for(int row = 0; row < pixels.length/2; row++)
		{
			TopPixel = pixels[row][col];
			BottomPixel = pixels[((pixels.length/2) + (pixels.length/2 - row) - 1)][col];
			BottomPixel.setColor(TopPixel.getColor());
		}
	  }
  }
  
  /*
   * 
   */
  
  public void mirrorHorizontalBottomToTop()
  {
	  Pixel[][] pixels =this.getPixels2D();
	  Pixel TopPixel = null;
	  Pixel BottomPixel = null;
	  for(int col = 0; col < pixels[0].length; col++)
	  {
		for(int row = pixels.length - 1; row >= pixels.length/2; row--)
		{
			BottomPixel = pixels[row][col];
			TopPixel = pixels[((pixels.length/2) - (row - (pixels.length/2)) + 1)][col];
			TopPixel.setColor(BottomPixel.getColor());
		}
	  }
  }
  
  public void mirrorArms()
  {
	 mirrorHorizontalBottomToTop();
  }
  
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }

  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  public void copy(int startRow, int endRow, int startCol, int endCol)
  {
	    
  }
  
  public void fixUnderwater()
  {
	  Pixel[][] original = this.getPixels2D();
	  for(int row = 0; row < original.length; row++)
	  {
		  for(int col = 0; col < original[0].length; col++)
		  {
			  Pixel currentPixel = original[row][col];
			
			  currentPixel.setGreen(Math.abs(100 - currentPixel.getGreen()));
			  currentPixel.setBlue(Math.abs(100 - currentPixel.getBlue()));
			  currentPixel.setRed(Math.abs(50 + currentPixel.getRed()));
			
		  }
	  }
  }
  
  public void mirrorGull()
  {
	  int mirrorPoint = 400;
	  Pixel[][] original = this.getPixels2D();
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	  int count = 0;
	  for(int row = 220; row < 330; row++)
	  {
		  for(int col = 248; col < 348; col++)
		  {
			  leftPixel = original[row][col];
			  rightPixel = original[row][mirrorPoint - col + mirrorPoint];
			  rightPixel.setColor(leftPixel.getColor());
		  }
	  }
  }
  
  public void edgeDetection2(int edgeDist)
  {
	  
	  Pixel TopPixel = null;
	  Pixel BottomPixel = null;
	  Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    Pixel[][] pixels = this.getPixels2D();
	    Color rightColor = null;
	    Color topColor = null;
			 for(int col = 0; col < pixels[0].length; col++)
			  {
				for(int row = pixels.length - 1; row >= pixels.length/2; row--)
				{
					BottomPixel = pixels[row][col];
					TopPixel = pixels[((pixels.length/2) - (row - (pixels.length/2)) + 1)][col];
					TopPixel.setColor(BottomPixel.getColor());
					if(BottomPixel.colorDistance(topColor) > edgeDist)
					{
						BottomPixel.setColor(Color.BLACK);
					}
					else
					{
						BottomPixel.setColor(Color.WHITE);
					}
				}
		  }
	   /*
	    for (int row = 0; row < pixels.length; row++)
	    {
	      for (int col2 = 0;  col2 < pixels[0].length-1; col2++)
	      {
	        leftPixel = pixels[row][col2];
	        rightPixel = pixels[row][col2+1];
	        rightColor = rightPixel.getColor();
	        if (leftPixel.colorDistance(rightColor) > 
	            edgeDist)
	          leftPixel.setColor(Color.BLACK);
	        else
	          leftPixel.setColor(Color.WHITE);
	      }
	    }*/
  }
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("seagull.jpg");
    beach.explore();
    beach.edgeDetection2(70);
    beach.explore();
 
    
  }
  
} // this } is the end of class Picture, put all new methods before this
