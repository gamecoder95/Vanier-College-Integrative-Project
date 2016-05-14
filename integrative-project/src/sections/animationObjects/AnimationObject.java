package sections.animationObjects;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.canvas.GraphicsContext;

public abstract class AnimationObject 
{
	//protected Members
	protected SimpleDoubleProperty x_property;
	protected SimpleDoubleProperty y_property;
	protected GraphicsContext graphics;

	//abstract
	abstract void draw();
	
	public AnimationObject(GraphicsContext graphics) 
	{
		this.x_property = new SimpleDoubleProperty(0); 
		this.y_property = new SimpleDoubleProperty(0);
		this.graphics = graphics;
	}
	public AnimationObject(SimpleDoubleProperty x_property, SimpleDoubleProperty y_property, GraphicsContext graphics)
	{
            this.x_property = x_property; 
            this.y_property = y_property;
            this.graphics = graphics;
	}
	public SimpleDoubleProperty getX() {
            return x_property;
	}
	public void setX(double x)
	{
            x_property.set(x);
	}
	public SimpleDoubleProperty getY() {
            return y_property;
	}
	public void setY(double y){
            y_property.set(y);
	}
}
