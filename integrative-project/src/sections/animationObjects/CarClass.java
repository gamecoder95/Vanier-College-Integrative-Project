package sections.animationObjects;


import Main.Constants;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


public class CarClass extends AnimationObject
{	
	private final GraphicsContext graphics;
	
	public CarClass(GraphicsContext graphicsContext) 
	{
            super(graphicsContext);
            this.graphics = graphicsContext;
	}
	public void draw()
	{
            graphics.drawImage(Constants.NEWT_LAW_BACK, 0, 0);
            graphics.setFill(Color.BLUE);
            double[] x = Constants.Car_Polygon_X.clone();
            double[] y = Constants.Car_Polygon_Y.clone();

            for(int i = Constants.ZERO; i < Constants.POLYGON_SIDE_NUM; i ++)
            {
                    y[i] += (y_property.doubleValue());
                    x[i] += x_property.doubleValue();
            }

            graphics.fillPolygon(x, y, Constants.POLYGON_SIDE_NUM);
            graphics.setFill(Color.BLACK);
            graphics.fillOval(x_property.doubleValue()+Constants.CAR_WHEEL_ONE_INIT_X, y_property.doubleValue()+Constants.CAR_WHEEL_INIT_Y, Constants.CAR_WHEEL_DIAMETER, Constants.CAR_WHEEL_DIAMETER);
            graphics.fillOval(x_property.doubleValue()+Constants.CAR_WHEEL_TWO_INIT_X, y_property.doubleValue()+Constants.CAR_WHEEL_INIT_Y, Constants.CAR_WHEEL_DIAMETER, Constants.CAR_WHEEL_DIAMETER);
	}
}
