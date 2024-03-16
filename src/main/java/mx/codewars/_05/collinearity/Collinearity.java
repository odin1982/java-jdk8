package mx.codewars._05.collinearity;

import java.math.BigDecimal;
import java.util.Arrays;

//https://www.youtube.com/watch?v=wNkXz8h-9LI
public class Collinearity {
	public static boolean collinearity3(int x1,int y1,int x2,int y2) {
		int x3=0,y3=0;
		double mAB;
		double mAC;
		double mBC;
		if((x1 == 0 && y1==0) || (x2 == 0 && y2==0) || (x1 == 0 && x2==0) || (y1 == 0 && y2==0)) {
			return true;
		}
		
		if(((y2-y1) != 0)  && ((x2-x1) == 0)) 
			return false;
		if(((y3-y2) != 0)  && ((x3-x2) == 0)) 
			return false;
		if(((y3-y1) != 0)  && ((x3-x1) == 0)) 
			return false;
		
		mAB = (((y2-y1) == 0)  && ((x2-x1) == 0)) ? 0 : ( (float)(y2-y1) / (float)(x2-x1) );
		mAC = (((y3-y2) == 0)  && ((x3-x2) == 0)) ? 0 : ((float)(y3-y2)/(float)(x3-x2));
		mBC = (((y3-y1) == 0)  && ((x3-x1) == 0)) ? 0 : ((float)(y3-y1)/(float)(x3-x1));
		
		if(mAC == mBC && mAC == mBC) {
			return true;
		}
		
		return false;
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("Es colinear: " + Collinearity.collinearity3(1, 1, 1, 1));
		System.out.println("Es colinear: " + Collinearity.collinearity3(1, 2, 2, 4));
		System.out.println("Es colinear: " + Collinearity.collinearity3(1, 1, -1, -1));
		System.out.println("Es colinear: " + Collinearity.collinearity3(1, -2, -2, 4));
		System.out.println("Es colinear: " + Collinearity.collinearity3(1, 1, 6, 1));
		System.out.println("Es colinear: " + Collinearity.collinearity3(1, 2, 1, -2));
		
		System.out.println("Es colinear: " + Collinearity.collinearity3(4, 0, 11, 0));
		System.out.println("Es colinear: " + Collinearity.collinearity3(0, 1, 6, 0));
		System.out.println("Es colinear: " + Collinearity.collinearity3(4, 4, 0, 4));
		
		System.out.println("Es colinear: " + Collinearity.collinearity3(0, 0, 0, 0));
		System.out.println("Es colinear: " + Collinearity.collinearity3(0, 0, 1, 0));
		System.out.println("Es colinear: " + Collinearity.collinearity3(5, 7, 0, 0));
		System.out.println("Es colinear: " + Collinearity.collinearity3(0, -152, 0, -770));//expected true
	}

}
