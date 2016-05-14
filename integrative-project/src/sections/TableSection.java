

package sections;

import Main.Constants;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class TableSection extends TableView
{
    private final TableColumn colTitle;
    private final TableColumn colRightValue;
    private final TableColumn colLeftValue;

    private final ObservableList<TableEntry> dataList = FXCollections.observableArrayList();
      
    public TableSection(double prefWidth, double prefHeight)
    {
        this(prefWidth, prefHeight, Constants.EMPTY_STRING, Constants.EMPTY_STRING, Constants.EMPTY_STRING);
    }
    public TableSection(double prefWidth, double prefHeight, String titleLabel, String leftValueLabel, String rightValueLabel)
    {
        setEditable(false);
        setPrefSize(prefWidth + Constants.TWO, prefHeight);
        
        colTitle = new TableColumn();
        colTitle.setPrefWidth(prefWidth);
        colTitle.setEditable(false);
        colTitle.setResizable(false);
        colTitle.setSortable(false);
        
        colRightValue = new TableColumn();
        colRightValue.setPrefWidth(prefWidth * Constants.ONE_HALF);
        colRightValue.setCellValueFactory(
               new PropertyValueFactory<TableEntry,String>(Constants.LEFT_VALUE));
        colRightValue.setEditable(false);
        colRightValue.setResizable(false);
        colRightValue.setSortable(false);
        
        colLeftValue = new TableColumn();
        colLeftValue.setPrefWidth(colRightValue.getPrefWidth());
        colLeftValue.setCellValueFactory(
                new PropertyValueFactory<TableEntry,String>(Constants.RIGHT_VALUE));
        colLeftValue.setEditable(false);
        colLeftValue.setResizable(false);
        colLeftValue.setSortable(false);

        setColumnLabels(titleLabel, rightValueLabel, leftValueLabel);
        setItems(dataList);
        colTitle.getColumns().addAll(colRightValue, colLeftValue);
        getColumns().add(colTitle);

        setDisabled(true);
    }

    public void setColumnLabels(String titleLabel, String leftValueLabel, String rightValueLabel)
    {
        colTitle.setText(titleLabel);
        colRightValue.setText(rightValueLabel);
        colLeftValue.setText(leftValueLabel);
    }
    
    public void clearRows()
    {
        dataList.clear();
    }
    
    public void addRow(double leftValue, double rightValue)
    {
        addRow(Constants.FORMATTER.format(leftValue), Constants.FORMATTER.format(rightValue));
    }
    
    public void addRow(String leftValue, String rightValue)
    {
        dataList.add(new TableEntry(leftValue, rightValue));
    }
    
    public void addLeftValue(String leftValue)
    {
        dataList.add(new TableEntry(leftValue));
    }
    
    public void setRightValue(int index, double rightValue)
    {
        setRightValue(index, Constants.FORMATTER.format(rightValue));
    }
    
    public void setRightValue(int index, String rightValue)
    {
        if(index >= Constants.ZERO && index < dataList.size())
        {
            TableEntry tableEntryToModify = new TableEntry(dataList.get(index).getLeftValue(), rightValue);
            dataList.remove(index);
            dataList.add(index, tableEntryToModify);
            
        }
    }
    
    protected class TableEntry
    {
          private final SimpleStringProperty rightValue;
          private final SimpleStringProperty leftValue;

          TableEntry(String leftValue)
          {
              this(leftValue, null);
          }
          
          TableEntry(String leftValue, String rightValue)
          {
              this.leftValue  = new SimpleStringProperty(leftValue);
              this.rightValue = new SimpleStringProperty(rightValue);
          }

          public String getRightValue() 
          {
              return rightValue.get();
          }

          public String getLeftValue() 
          {
              return leftValue.get();
          }
          
          public void setRightValue(String strRightValue)
          {
              rightValue.set(strRightValue);
          }
          
          public void setLeftValue(String strLeftValue)
          {
              leftValue.set(strLeftValue);
          }
    }
}

