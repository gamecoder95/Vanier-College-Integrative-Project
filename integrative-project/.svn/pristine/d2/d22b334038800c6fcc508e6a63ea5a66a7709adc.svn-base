package calculations;

import Main.Constants;
import java.util.ArrayList;

public class FormulaHelper 
{
	//Newton's Second Law
	
	public static double computeAccel(double force, double mass)
	{
            return (force/mass);
	}
	
	public static double computeVelocity(double deltaTime, double acceleration)
	{
            return ((deltaTime*acceleration));
	}
	
	public static double computeDisplacement(double deltaTime, double curVelocty, double prevDisplacement)
	{
            return ((deltaTime*curVelocty)+prevDisplacement);
	}
	
	//Projectile motion
	public static double computeCurrentHeight(double deltaTime, double curVelocty_y, double prevHeight, double gravity)
	{
            return ((curVelocty_y*deltaTime)+(Constants.ONE_HALF*-Constants.ONE*gravity*Math.pow(deltaTime, Constants.TWO)));
	}
	
	public static double getVertVel(double angleDegrees, double initVel)
	{
            return (initVel * Math.sin(Math.toRadians(angleDegrees)));
	}
	public static double getHorVel(double angleDegrees, double initVel)
	{
            return (initVel * Math.cos(Math.toRadians(angleDegrees)));
	}
        
	//Optics
	public static double computeImageDistance(double focalPoint, double objectDistance)
	{
            return (Constants.ONE/((Constants.ONE/focalPoint)-(Constants.ONE/objectDistance)));
	}
	
	public static double computeImageHeight(double objectHeight, double imagedistance, double objectDistance)
	{
            return -((imagedistance/objectDistance)*objectHeight);
	}

        private static double computeWaveLengthThinFilm(double indexRefFilm, double thickness, int m, boolean constructive)
        {
            return (Constants.TWO * indexRefFilm * thickness)/(m + ((constructive)? Constants.ZERO : Constants.ONE_HALF));
        }
        
        private static ArrayList<Double> getWaveLengthsThinFilm(double indexRefFilm, double thickness, boolean constructive)
        {
            double waveLength;
            int m = (constructive)? Constants.ONE : Constants.ZERO;
            ArrayList<Double> waveLengthList = new ArrayList<Double>();
            
            do
            {
                waveLength = computeWaveLengthThinFilm(indexRefFilm, thickness, m++, constructive);
                if(waveLength >= Constants.MIN_VIS_LIGHT_LENGTH && waveLength <= Constants.MAX_VIS_LIGHT_LENGTH)
                {
                    waveLengthList.add(waveLength);
                }
                
            }while(waveLength >= Constants.MIN_VIS_LIGHT_LENGTH);
            
            return waveLengthList;
        }
        
        public static ArrayList<Double> getWaveLengthsConstructive(double indexRefFilm, double thickness)
        {
            return getWaveLengthsThinFilm(indexRefFilm, thickness, true);
        }
        
        public static ArrayList<Double> getWaveLengthsDestructive(double indexRefFilm, double thickness)
        {
            return getWaveLengthsThinFilm(indexRefFilm, thickness, false);
        }
        
        public static double computeInfSum(double coefficient, double base)
        {
            return coefficient * (Constants.ONE/(Constants.ONE - base));
        }
        
        public static double computeTermOfSum(double coefficient, double base, int exponent)
        {
            return coefficient * Math.pow(base, exponent);
        }
        
        public static double computePartialSum(double coefficient, double base, int lastTermNumber)
        {
            double partialSum = Constants.ZERO;
            for(int i = Constants.ZERO; i < lastTermNumber; ++i)
            {
                partialSum += computeTermOfSum(coefficient, base, i);
            }
            return partialSum;
        }
}
