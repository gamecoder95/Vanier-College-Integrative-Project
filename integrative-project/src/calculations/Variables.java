


package calculations;

import Main.Constants;
import java.util.ArrayList;


public class Variables 
{
    private static double velocity;
    private static double displacement;
    private static double force;
    private static double mass;
    private static double acceleration;
    private static double height;
    private static double angle;
    private static double gravity;
    private static double objHeight;
    private static double objDistance;
    private static double focalPoint;
    private static double imageHeight;
    private static double imageDistance;
    private static double costMake;
    private static double costSetUp;
    private static double maxProfit;
    private static String lensType;
    private static String materialType;
    private static double thickness;
    private static ArrayList<Double> waveLengthsConst;
    private static ArrayList<Double> waveLengthsDest;
    private static double indexRefFilm;
    private static double indexRefMaterial;
    private static double base;
    private static double coefficient;
    private static int    exponent;
    private static String projectileType;
    private static String gravityType;
    
    static
    {
        velocity = Constants.ZERO;
        displacement = Constants.ZERO;
        force = Constants.ZERO;
        mass = Constants.ZERO;
        acceleration = Constants.ZERO;
        height = Constants.ZERO;
        angle = Constants.ZERO;
        gravity = Constants.ZERO;
        objHeight = Constants.ZERO;
        objDistance = Constants.ZERO;
        focalPoint = Constants.ZERO;
        imageHeight = Constants.ZERO;
        imageDistance = Constants.ZERO;
        costMake = Constants.ZERO;
        costSetUp = Constants.ZERO;
        maxProfit = Constants.ZERO;
        lensType = Constants.EMPTY_STRING;
        materialType = Constants.EMPTY_STRING;
        thickness = Constants.ZERO;
        waveLengthsConst = new ArrayList<Double>();
        waveLengthsDest  = new ArrayList<Double>();
        indexRefFilm = Constants.ZERO;
        indexRefMaterial = Constants.ZERO;
        base = Constants.ZERO;
        coefficient = Constants.ZERO;
        exponent = Constants.ZERO;
        projectileType = Constants.EMPTY_STRING;
        gravityType = Constants.EMPTY_STRING;
    }
    
    public static double getVelocity() 
    {
        return velocity;
    }

    public static void setVelocity(double v) 
    {
        velocity = v;
    }

    public static double getDisplacement() 
    {
        return displacement;
    }

    public static void setDisplacement(double d) 
    {
        displacement = d;
    }

    public static double getForce() 
    {
        return force;
    }

    public static void setForce(double f) 
    {
        force = f;
    }

    public static double getMass() 
    {
        return mass;
    }

    public static void setMass(double m) 
    {
        mass = m;
    }

    public static double getAcceleration() 
    {
        return acceleration;
    }

    public static void setAcceleration(double a) 
    {
        acceleration = a;
    }

    public static double getHeight() 
    {
        return height;
    }

    public static void setHeight(double h) 
    {
        height = h;
    }

    public static double getAngle() 
    {
        return angle;
    }

    public static void setAngle(double theta) 
    {
        angle = theta;
    }

    public static double getGravity() 
    {
        return gravity;
    }

    public static void setGravity(double g) 
    {
        gravity = g;
    }

    public static double getObjHeight() 
    {
        return objHeight;
    }

    public static void setObjHeight(double ho) 
    {
        objHeight = ho;
    }

    public static double getObjDistance() 
    {
        return objDistance;
    }

    public static void setObjDistance(double dO) 
    {
        objDistance = dO;
    }

    public static double getFocalPoint() 
    {
        return focalPoint;
    }

    public static void setFocalPoint(double fp) 
    {
        focalPoint = fp;
    }

    public static double getImageHeight() 
    {
        return imageHeight;
    }

    public static void setImageHeight(double hi) 
    {
        imageHeight = hi;
    }

    public static double getImageDistance() 
    {
        return imageDistance;
    }

    public static void setImageDistance(double di) 
    {
        imageDistance = di;
    }

    public static double getCostMake() 
    {
        return costMake;
    }

    public static void setCostMake(double cost) 
    {
        costMake = cost;
    }

    public static double getCostSetUp() 
    {
        return costSetUp;
    }

    public static void setCostSetUp(double cost) 
    {
        costSetUp = cost;
    }
    
    public static double getMaxProfit() 
    {
        return maxProfit;
    }

    public static void setMaxProfit(double p) 
    {
        maxProfit = p;
    }

    public static String getLensType() 
    {
        return lensType;
    }

    public static void setLensType(String lens) 
    {
        lensType = lens;
    }

    public static String getMaterialType() 
    {
        return materialType;
    }

    public static void setMaterialType(String material) 
    {
        materialType = material;
    }

    public static double getThickness() 
    {
        return thickness;
    }

    public static void setThickness(double t) 
    {
        thickness = t;
    }

    public static ArrayList<Double> getWaveLengthsConst() 
    {
        return waveLengthsConst;
    }

    public static void setWaveLengthsConst(ArrayList<Double> waveLengths) 
    {
        waveLengthsConst = waveLengths;
    }

    public static ArrayList<Double> getWaveLengthsDest() 
    {
        return waveLengthsDest;
    }

    public static void setWaveLengthsDest(ArrayList<Double> waveLengths) 
    {
        waveLengthsDest = waveLengths;
    }

    public static double getIndexRefFilm() 
    {
        return indexRefFilm;
    }

    public static void setIndexRefFilm(double nf) 
    {
        indexRefFilm = nf;
    }

    public static double getIndexRefMaterial() 
    {
        return indexRefMaterial;
    }

    public static void setIndexRefMaterial(double nm) 
    {
        indexRefMaterial = nm;
    }

    public static double getBase() 
    {
        return base;
    }

    public static void setBase(double r) 
    {
        base = r;
    }

    public static double getCoefficient() 
    {
        return coefficient;
    }

    public static void setCoefficient(double a) 
    {
        coefficient = a;
    }

    public static int getExponent() 
    {
        return exponent;
    }

    public static void setExponent(int k) 
    {
        exponent = k;
    }

    public static String getProjectileType() 
    {
        return projectileType;
    }

    public static void setProjectileType(String projectile) 
    {
        projectileType = projectile;
    }

    public static String getGravityType() 
    {
        return gravityType;
    }

    public static void setGravityType(String gravity) 
    {
        gravityType = gravity;
    }
}
