package sections.animationObjects;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class SquareClass extends AnimationObject 
{
	private Color color;
	private double side;
	
	public SquareClass(GraphicsContext graphics, double x, double y, double side) 
	{
            super(graphics);

            this.color = Color.BISQUE;
            this.setX(x);
            this.setY(y);
            this.side = side;
	}
	public SquareClass(GraphicsContext graphics, double x, double y, double side, Color color) 
	{
            super(graphics);

            this.color = color;
            this.setX(x);
            this.setY(y);
            this.side = side;
	}

	public double getSide() {
            return side;
	}

	public void setSide(double side) {
            this.side = side;
	}

	public Color getColor() {
            return color;
	}

	public void setColor(Color color) {
            this.color = color;
	}

	@Override
	public void draw() {
            Paint temp = this.graphics.getFill();
            this.graphics.setFill(this.color);
            this.graphics.fillRect(x_property.get(), y_property.get(), side, side);
            this.graphics.setFill(temp);
		
	}
	public void draw(String text)
	{
            Paint temp = this.graphics.getFill();
            this.graphics.setFill(this.color);
            this.graphics.fillRect(x_property.get(), y_property.get(), side, side);
            this.graphics.setFill(temp);
            this.graphics.fillText(text, x_property.get(), y_property.get());
	}

}
