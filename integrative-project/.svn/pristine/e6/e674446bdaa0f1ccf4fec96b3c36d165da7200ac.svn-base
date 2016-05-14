
package sections;

import Main.Constants;
import Main.MainWindow;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.chart.*;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.input.MouseEvent;


public class ChartSection extends LineChart<Number, Number>
{
    public ChartSection()
    {
        super(new NumberAxis(), new NumberAxis());
        this.setLegendVisible(false);
        getData().add(new XYChart.Series<Number, Number>());
        setCursor(Cursor.CROSSHAIR);
    }
    
    public void setLabels(String chartTitle, String xAxisLabel, String yAxisLabel)
    {
        setTitle(chartTitle);
        getXAxis().setLabel(xAxisLabel);
        getYAxis().setLabel(yAxisLabel);
    }
    
    public void clearData()
    {
        getData().get(Constants.ZERO).getData().clear();
    }
    
    public void addDataPoint(double x, double y)
    {
    	addDataPoint(x, y, false);
    }
    public void addDataPoint(double x, double y, boolean hover)
    {
    	XYChart.Data<Number, Number> data = new Data<Number, Number>(x, y);
    	
    	if(hover)
    	{
    		data.setNode(new HoverDetector(x, y));
    	}
    	
        getData().get(Constants.ZERO).getData().add(data);
    }
    private class HoverDetector extends StackPane
    {
        //made a change to constructor here
    	HoverDetector(final double data_x, final double data_y)
    	{	
            setPrefSize(Constants.HOVER_PREF_SIZE, Constants.HOVER_PREF_SIZE);
            setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent mouseEvent) {

            if(MainWindow.getUserInterface() == Constants.UserInterface.SPORTS_BIKE)
            {
                MainWindow.getAnimSection().drawNewBikeFrame(data_x, data_y);
            }
            else if(MainWindow.getUserInterface() == Constants.UserInterface.NEWTON_LAW
                    || MainWindow.getUserInterface() == Constants.UserInterface.PROJ_MOTION
                    || MainWindow.getUserInterface() == Constants.UserInterface.INF_GEOM_SERIES)
            {
                Label showXYValuesLabel = new Label();

                if(MainWindow.getUserInterface() == Constants.UserInterface.NEWTON_LAW)
                {
                    showXYValuesLabel.setText(Constants.X_TEXT + data_x + Constants.Y_TEXT1 + Constants.FORMATTER.format(data_y) + "m/s");

                }
                else if(MainWindow.getUserInterface() == Constants.UserInterface.PROJ_MOTION)
                {
                    showXYValuesLabel.setText(Constants.X_TEXT + data_x + Constants.Y_TEXT1 + Constants.FORMATTER.format(data_y) + "m");
                }
                else if(MainWindow.getUserInterface() == Constants.UserInterface.INF_GEOM_SERIES)
                {
                    showXYValuesLabel.setText(Constants.X_TEXT + data_x + Constants.Y_TEXT2 + Constants.FORMATTER.format(data_y));
                }
                showXYValuesLabel.setMinSize(Label.USE_PREF_SIZE*Constants.FIVE, Label.USE_PREF_SIZE*Constants.FIVE);
                showXYValuesLabel.setId(Constants.ID_SHOW_XY_VALUES);
                getChildren().add(showXYValuesLabel);
            }

              setCursor(Cursor.NONE);
              toFront();
            }
          });
            setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent mouseEvent) {
                //hovers away
                if(MainWindow.getUserInterface() == Constants.UserInterface.SPORTS_BIKE)
                {
                    MainWindow.getAnimSection().drawNewBikeFrame();
                }
                getChildren().clear();

                setCursor(Cursor.CROSSHAIR);
                toFront();
            }
          });
    	}
    }

}