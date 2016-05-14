package sections;

import javax.swing.JOptionPane;
import Main.Constants;
import Main.MainWindow;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class MainMenuSection extends VBox implements EventHandler<ActionEvent>
{
	private ComboBox<String> mainOptionBox;
	private final ObservableList<String> mainOptionsList;
        private final Button subChoiceOneButton;
        private final Button subChoiceTwoButton;
        private final Button startButton;
        private final Button pauseButton;
        private final Button resetButton;
        private final Button helpButton;
        private final Button doneButton;
        private final Button continueButton;
        
        
	public MainMenuSection() 
	{
            this.setSpacing(Constants.GUI_SPACING);
            this.setAlignment(Pos.CENTER);
            mainOptionsList = FXCollections.observableArrayList(Constants.OPTION_MECHANICS, Constants.OPTION_WAVES, Constants.OPTION_CALCULUS, Constants.OPTION_EXIT);
            mainOptionBox = new ComboBox<String>(mainOptionsList);
            this.subChoiceOneButton = new Button();
            this.subChoiceTwoButton = new Button();
            this.startButton = new Button(Constants.START_BUTTON);
            this.pauseButton = new Button(Constants.PAUSE_BUTTON);
            this.resetButton = new Button(Constants.RESET_BUTTON);
            this.helpButton = new Button(Constants.HELP_BUTTON);
            this.doneButton = new Button(Constants.DONE_BUTTON);
            this.continueButton = new Button(Constants.CONTINUE_BUTTON);
            mainOptionBox.setOnAction(this);
            subChoiceOneButton.setOnAction(this);
            subChoiceTwoButton.setOnAction(this);
            startButton.setOnAction(this);
            pauseButton.setOnAction(this);
            resetButton.setOnAction(this);
            helpButton.setOnAction(this);
            doneButton.setOnAction(this);
            continueButton.setOnAction(this);
            this.continueButton.setDisable(true);
            this.resetButton.setDisable(true);
            this.pauseButton.setDisable(true);
            showComboBoxMenu();
	}

        public void handle(ActionEvent event) 
        {
            //when you click help, a JOptionPane-like message pops up and shows approproate text depending on userInterface
            if(event.getSource() == mainOptionBox)
            {
                if(((String)(mainOptionBox.getSelectionModel().getSelectedItem())).equalsIgnoreCase(Constants.OPTION_MECHANICS))
                {
                    showSubMenu(Constants.OPTION_NEWTON, Constants.OPTION_PROJ_MOT);
                }
                else if(((String)(mainOptionBox.getSelectionModel().getSelectedItem())).equalsIgnoreCase(Constants.OPTION_WAVES))
                {
                    showSubMenu(Constants.OPTION_OPTICS, Constants.OPTION_THIN_FILM);
                }
                else if(((String)(mainOptionBox.getSelectionModel().getSelectedItem())).equalsIgnoreCase(Constants.OPTION_CALCULUS))
                {
                    showSubMenu(Constants.OPTION_NEW_BIKE, Constants.OPTION_INF_GEOM);
                }
                else if(((String)(mainOptionBox.getSelectionModel().getSelectedItem())).equalsIgnoreCase(Constants.OPTION_EXIT))
                {
                    getChildren().add(new Label(Constants.CONFIRM_EXIT_MSG));
                    showSubMenu(Constants.OPTION_YES, Constants.OPTION_NO);
                }
                mainOptionBox = new ComboBox<String>(mainOptionsList);
                mainOptionBox.setOnAction(this);
            }
            else if(event.getSource() == subChoiceOneButton)
            {
                if(subChoiceOneButton.getText().equalsIgnoreCase(Constants.OPTION_NEWTON))
                {
                    MainWindow.setUserInterface(Constants.UserInterface.NEWTON_LAW);
                    MainWindow.getAnimSection().drawNewtonFrame();
                }
                else if(subChoiceOneButton.getText().equalsIgnoreCase(Constants.OPTION_OPTICS))
                {
                    MainWindow.setUserInterface(Constants.UserInterface.OPTICS);
                }
                else if(subChoiceOneButton.getText().equalsIgnoreCase(Constants.OPTION_NEW_BIKE))
                {
                    MainWindow.setUserInterface(Constants.UserInterface.SPORTS_BIKE);
                }
                else if(subChoiceOneButton.getText().equalsIgnoreCase(Constants.OPTION_YES))
                {
                    System.exit(Constants.ZERO);
                }
                
                if(!subChoiceOneButton.getText().equalsIgnoreCase(Constants.OPTION_YES))
                {
                   showMainMenu(); 
                }
            }
            else if(event.getSource() == subChoiceTwoButton)
            {
                if(subChoiceTwoButton.getText().equalsIgnoreCase(Constants.OPTION_PROJ_MOT))
                {
                    MainWindow.setUserInterface(Constants.UserInterface.PROJ_MOTION);
                    MainWindow.getAnimSection().drawProjMotFrame();
                }
                else if(subChoiceTwoButton.getText().equalsIgnoreCase(Constants.OPTION_THIN_FILM))
                {
                    MainWindow.setUserInterface(Constants.UserInterface.THIN_FILM);
                }
                else if(subChoiceTwoButton.getText().equalsIgnoreCase(Constants.OPTION_INF_GEOM))
                {
                    MainWindow.setUserInterface(Constants.UserInterface.INF_GEOM_SERIES);
                }
                else if(subChoiceTwoButton.getText().equalsIgnoreCase(Constants.OPTION_NO))
                {
                    showComboBoxMenu();
                }
                if(!subChoiceTwoButton.getText().equalsIgnoreCase(Constants.OPTION_NO))
                {
                   showMainMenu(); 
                }
            }
            else if(event.getSource() == startButton)
            {
                if(MainWindow.getGUIControlSection().getValues())
                {
                    MainWindow.getAnimSection().start();
                    this.pauseButton.setDisable(false);
                    this.startButton.setDisable(true);
                    this.startButton.setDisable(true);
                    this.continueButton.setDisable(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, Constants.ERROR_MSG, Constants.ERROR_MSG_TITLE, JOptionPane.ERROR_MESSAGE);
                }
                
            }
            else if(event.getSource() == continueButton)
            {
            	if(MainWindow.getGUIControlSection().getValues())
                {
                    MainWindow.getAnimSection().start(true);
                }
                this.pauseButton.setDisable(false);
                this.startButton.setDisable(true);
                this.startButton.setDisable(true);
                this.continueButton.setDisable(true);
            }
            else if(event.getSource() == pauseButton)
            {
                MainWindow.getAnimSection().stop(true);
                this.continueButton.setDisable(false);
                this.pauseButton.setDisable(true);
            }
            else if(event.getSource() == resetButton)
            {
                MainWindow.getAnimSection().reset();
                this.startButton.setDisable(false);
                this.resetButton.setDisable(true);
            }
            else if(event.getSource() == helpButton)
            {
                if(MainWindow.getUserInterface() == Constants.UserInterface.NEWTON_LAW)
                {
                    JOptionPane.showMessageDialog(null, Constants.NEWTON_HELP_MSG);
                }
                else if(MainWindow.getUserInterface() == Constants.UserInterface.PROJ_MOTION)
                {
                    JOptionPane.showMessageDialog(null, Constants.PROJ_MOT_HELP_MSG);
                }
                else if(MainWindow.getUserInterface() == Constants.UserInterface.OPTICS)
                {
                    JOptionPane.showMessageDialog(null, Constants.OPTICS_HELP_MSG);
                }
                else if(MainWindow.getUserInterface() == Constants.UserInterface.THIN_FILM)
                {
                    JOptionPane.showMessageDialog(null, Constants.THIN_FILM_HELP_MSG);
                }
                else if(MainWindow.getUserInterface() == Constants.UserInterface.SPORTS_BIKE)
                {
                    JOptionPane.showMessageDialog(null, Constants.NEW_BIKE_HELP_MSG);
                }
                else if(MainWindow.getUserInterface() == Constants.UserInterface.INF_GEOM_SERIES)
                {
                    JOptionPane.showMessageDialog(null, Constants.INF_GEOM_HELP_MSG);
                }
            }
            else if(event.getSource() == doneButton)
            {
            	MainWindow.getAnimSection().reset();
                MainWindow.setUserInterface(Constants.UserInterface.NO_CHOICE);
                showComboBoxMenu();
                this.continueButton.setDisable(true);
                this.resetButton.setDisable(true);
                this.pauseButton.setDisable(true);
                this.startButton.setDisable(false);
            }
        }
        
        public Button getPauseButton() 
        {
            return pauseButton;
	}

        public Button getResetButton() 
        {
            return resetButton;
        }

	private void showComboBoxMenu()
        {
            getChildren().clear();
            getChildren().add(mainOptionBox);
        }
        
        private void showSubMenu(String subChoiceOneText, String subChoiceTwoText)
        {
            getChildren().clear();
            subChoiceOneButton.setText(subChoiceOneText);
            subChoiceTwoButton.setText(subChoiceTwoText);
            getChildren().addAll(subChoiceOneButton, subChoiceTwoButton);
        }
        
        private void showMainMenu()
        {
            getChildren().clear();
            getChildren().addAll(startButton, pauseButton, resetButton, helpButton, doneButton, continueButton);
        }


}
