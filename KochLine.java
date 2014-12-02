/**Chris Sigmund
//December 1st, 2014
//Class KochLine inherits from the line class and performs calculations
//on points to create a KochLine segment
 * 
 */

package edu.cofc.csci221.ui;

public class KochLine extends Line {
	
	private Point p1 = null;
	private Point p2 = null;
	private Point p3 = null;
	private Point p4 = null;
	private Point p5 = null;
	
	
/**
 * Create KochLine constructor with 2 parameters	
 * @param start
 * @param end
 */
	public KochLine ( Point start, Point end) {
		
		super(start, end);
		
		p1 = super.getStart();
		
		p5 = super.getEnd();
		
		
		}
	/**
	 * Get Kochline segment A.
	 * @return lineA
	 * PreCondition: none
	 * PostCondition: return lineA
	 */
	
	public KochLine getLineA() {
		
		KochLine lineA = new KochLine (p1, p2);
		
		return lineA;
	}
	
	/**
	 * Get Kochline segment B.
	 * @return lineB
	 * PreCondition: none
	 * PostCondition: return lineB
	 */
	public KochLine getLineB() {
		
		KochLine lineB = new KochLine (p2, p3);
		
		return lineB;
	}
	
	/**
	 * Get Kochline segment C.
	 * @return lineC
	 * PreCondition: none
	 * PostCondition: return lineC
	 */
	public KochLine getLineC() {
		
		KochLine lineC = new KochLine (p3, p4);
		
		return lineC;
	}
	
	/**
	 * Get Kochline segment D.
	 * @return lineD
	 * PreCondition: none
	 * PostCondition: return lineD
	 */
	public KochLine getLineD() {
		
		
		KochLine lineD = new KochLine (p4, p5);
		
		return lineD;
	}
	
	/**
	 * Computes p2, p3, and p4 (x,y) values.
	 * PreCondition: none
	 * PostCondition: the calculated values of p2, p3, and p4 (x,y)
	 */
	public void computeFractal () {

		int x1 = p1.getX();
		int y1 = p1.getY();
		int x5 = p5.getX();
		int y5 = p5.getY();
		
		int deltaX = x5 - x1;
        int deltaY = y5 - y1;

        int x2 = x1 + deltaX / 3;
        int y2 = y1 + deltaY / 3;

        int x3 = (int) (0.5 * (x1+x5) + Math.sqrt(3) * (y1-y5)/6);
        int y3 = (int) (0.5 * (y1+y5) + Math.sqrt(3) * (x5-x1)/6);

        int x4 = x1 + 2 * deltaX /3;
        int y4 = y1 + 2 * deltaY /3;
        
        
        p2 = new Point (x2, y2);
        p3 = new Point (x3, y3);
        p4 = new Point (x4, y4);
		
        }
	
	/**
	 * Checks if the line segemnts A, B, C, D are valid
	 * @return boolean
	 * PreCondition: none
	 * PostConditoon: returns a boolean after checking if the KochLine segments are valid
	 */
	public boolean isKochLineValid () {
		
		boolean valid = true;
		
		
		if (getLineA().isValid()) {
			
			return valid;
			
		} else if (getLineB().isValid()) {
			
			return valid;
			
		} else if (getLineC().isValid()) {
			
			return valid;
			
		}else if (getLineD().isValid()) {
			
			return valid;
			
		} else {
			
			return false;
		}
		
		
	}

}
