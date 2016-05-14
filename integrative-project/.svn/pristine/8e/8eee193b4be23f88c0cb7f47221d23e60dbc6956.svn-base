package sections;
import Main.Constants;
import Main.MainWindow;
import calculations.Variables;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;

public class GUIControlSection extends VBox implements EventHandler<ActionEvent>
{
	private final Label enterValuesLabel = new Label(Constants.ENTER_VAL_LABEL_TEXT);
	
	private final FlowPane forceFlowPane = new FlowPane();
	private final Label forceLabel = new Label(Constants.FORCE_LABEL_TEXT);
	private final TextField forceTextField = new TextField()
	{
                @Override
		public void replaceText(int start, int end, String text) 
		{
			if (text.matches(Constants.NUMBERS_ONLY_REGEX)) {
	            super.replaceText(start, end, text);
	        }
		}
	};
	
	private final FlowPane massFlowPane = new FlowPane();
	private final Label massLabel = new Label(Constants.MASS_LABEL_TEXT);
	private final TextField massTextField = new TextField(){
                @Override
		public void replaceText(int start, int end, String text) 
		{
			if (text.matches(Constants.NUMBERS_ONLY_REGEX)) {
	            super.replaceText(start, end, text);
	        }
		}
	};
	
	private final FlowPane initVelFLowPane = new FlowPane();
	private final Label initVelLabel = new Label(Constants.INIT_VEL_LABEL_TEXT);
	private final TextField initVelTextField = new TextField(){
                @Override
		public void replaceText(int start, int end, String text) 
		{
			if (text.matches(Constants.NUMBERS_ONLY_REGEX)) {
	            super.replaceText(start, end, text);
	        }
		}
	};
	
	private final FlowPane projectileFlowPane = new FlowPane();
	private final ObservableList<String> projectileList = Constants.PROJECTILE_TYPE_LIST;
	private final ComboBox<String> projectileOptionBox = new ComboBox<String>(projectileList);
	private final Label projectileTypeLabel = new Label(Constants.PROJECTYLE_TYPE_LABEL_TEXT);

    
	private final FlowPane gravityFlowPane = new FlowPane();
	private final ObservableList<String> GravityList = Constants.GRAVITY_TYPE_LIST;
	private final ComboBox<String> gravityOptionBox = new ComboBox<String>(GravityList);
	private final Label gravityTypeLabel = new Label(Constants.GRAVITY_TYPE_LABEL_TEXT);
	
	private final FlowPane angleFLowPane = new FlowPane();
	private final Label angleLabel = new Label(Constants.ANGLE_LABEL_TEXT);
	private final TextField angleTextField = new TextField(){
                @Override
		public void replaceText(int start, int end, String text) 
		{
			if (text.matches(Constants.NUMBERS_ONLY_REGEX)) {
	            super.replaceText(start, end, text);
	        }
		}
	};
	
	private final FlowPane objectHeightFLowPane = new FlowPane();
	private final Label objectHeightLabel = new Label(Constants.OBJ_HEIGHT_LABEL_TEXT);
	private final TextField objectHeightTextField = new TextField(){
                @Override
		public void replaceText(int start, int end, String text) 
		{
			if (text.matches(Constants.NUMBERS_ONLY_REGEX)) {
	            super.replaceText(start, end, text);
	        }
		}
	};
	
	private final FlowPane objectDistanceFLowPane = new FlowPane();
	private final Label objectDistanceLabel = new Label(Constants.OBJ_DIST_LABEL_TEXT);
	private final TextField objectDistanceTextField = new TextField(){
                @Override
		public void replaceText(int start, int end, String text) 
		{
			if (text.matches(Constants.NUMBERS_ONLY_REGEX)) {
	            super.replaceText(start, end, text);
	        }
		}
	};;
	
	private final FlowPane focalDistFLowPane = new FlowPane();
	private final Label focalDistLabel = new Label(Constants.FOCAL_DIST_LABEL_TEXT);
	private final TextField focalDistTextField = new TextField(){
                @Override
		public void replaceText(int start, int end, String text) 
		{
			if (text.matches(Constants.NUMBERS_ONLY_REGEX)) {
	            super.replaceText(start, end, text);
	        }
		}
	};
	
	private final FlowPane materialFlowPane = new FlowPane();
	private final ObservableList<String> materialList = Constants.MATERIAL_TYPE_LIST;
	private final ComboBox<String> materialOptionBox = new ComboBox<String>(materialList);
	private final Label materialListLabel = new Label(Constants.MATERIAL_LIST_LABEL_TEXT);
	
	private final Label indexRefMatLabel = new Label(Constants.INDEX_REF_MAT_LABEL_TEXT);
	
	private final FlowPane thicknessFLowPane = new FlowPane();
	private final Label thicknessLabel = new Label(Constants.THICKNESS_LABEL_TEXT);
	private final TextField thicknessTextField = new TextField(){
                @Override
		public void replaceText(int start, int end, String text) 
		{
			if (text.matches(Constants.NUMBERS_ONLY_REGEX)) {
	            super.replaceText(start, end, text);
	        }
		}
	};
	
	private final FlowPane costBikeFLowPane = new FlowPane();
	private final Label costBikeLabel = new Label(Constants.COST_BIKE_LABEL_TEXT);
	private final TextField costBikeTextField = new TextField(){
                @Override
		public void replaceText(int start, int end, String text) 
		{
			if (text.matches(Constants.NUMBERS_ONLY_REGEX)) {
	            super.replaceText(start, end, text);
	        }
		}
	};
	
	private final FlowPane costSetUpFLowPane = new FlowPane();
	private final Label costSetUpLabel = new Label(Constants.COST_SET_UP_LABEL_TEXT);
	private final TextField costSetUpTextField = new TextField(){
                @Override
		public void replaceText(int start, int end, String text) 
		{
			if (text.matches(Constants.NUMBERS_ONLY_REGEX)) {
	            super.replaceText(start, end, text);
	        }
		}
	};
	
	private final FlowPane indexRefFilmFLowPane = new FlowPane();
	private final Label indexRefFilmLabel = new Label(Constants.INDEX_REF_FILM_TEXT);
	private final TextField indexRefFilmTextField = new TextField(){
                @Override
		public void replaceText(int start, int end, String text) 
		{
			if (text.matches(Constants.NUMBERS_ONLY_REGEX)) {
	            super.replaceText(start, end, text);
	        }
		}
	};
	
	private final FlowPane lenslFlowPane = new FlowPane();
	private final ObservableList<String> lensList = Constants.LENS_TYPE_LIST;
	private final ComboBox<String> lensOptionBox = new ComboBox<String>(lensList);
	private final Label lensLabel = new Label(Constants.LENS_LABEL_TEXT);
	
	private final FlowPane coffiecientFLowPane = new FlowPane();
	private final Label coefficientLabel = new Label(Constants.COEFF_LABEL_TEXT);
	private final TextField coefficientTextField = new TextField(){
		@Override
                public void replaceText(int start, int end, String text) 
		{
			if (text.matches(Constants.NUMBERS_ONLY_REGEX)) {
	            super.replaceText(start, end, text);
	        }
		}
	};
	
	private final FlowPane baseFLowPane = new FlowPane();
	private final Label baseLabel = new Label(Constants.BASE_LABEL_TEXT);
	private final TextField baseTextField = new TextField(){
                @Override
		public void replaceText(int start, int end, String text) 
		{
			if (text.matches(Constants.NUMBERS_ONLY_REGEX)) {
	            super.replaceText(start, end, text);
	        }
		}
	};
	
	private final FlowPane exponentFLowPane = new FlowPane();
	private final Label exponentLabel = new Label(Constants.EXPONENT_LABEL_TEXT);
	private final TextField exponentTextField = new TextField(){
                @Override
		public void replaceText(int start, int end, String text) 
		{
			if (text.matches(Constants.NUMBERS_ONLY_REGEX)) {
	            super.replaceText(start, end, text);
	        }
		}
	};
	
	private final Label infSumEquationLabel = new Label();
	private final Label partSumEquationLabel = new Label();
	
	/**
         * Constructor
         */
	public GUIControlSection()
	{
            this.setSpacing(Constants.GUI_SPACING);
            this.setAlignment(Pos.CENTER);
            this.setPadding(new Insets(Constants.FIVE));

            this.massFlowPane.getChildren().addAll(massLabel, massTextField);
            this.forceFlowPane.getChildren().addAll(forceLabel, forceTextField);

            this.projectileFlowPane.getChildren().addAll(projectileTypeLabel,projectileOptionBox);
            this.gravityFlowPane.getChildren().addAll(gravityTypeLabel, gravityOptionBox);
            this.angleFLowPane.getChildren().addAll(angleLabel, angleTextField);
            this.initVelFLowPane.getChildren().addAll(initVelLabel, initVelTextField);

            this.objectHeightFLowPane.getChildren().addAll(objectHeightLabel, objectHeightTextField);
            this.objectDistanceFLowPane.getChildren().addAll(objectDistanceLabel, objectDistanceTextField);
            this.focalDistFLowPane.getChildren().addAll(focalDistLabel, focalDistTextField);
            this.lenslFlowPane.getChildren().addAll(lensLabel, lensOptionBox);

            this.materialFlowPane.getChildren().addAll(materialListLabel, materialOptionBox);
            this.thicknessFLowPane.getChildren().addAll(thicknessLabel, thicknessTextField);
            this.indexRefFilmFLowPane.getChildren().addAll(indexRefFilmLabel, indexRefFilmTextField);

            this.costBikeFLowPane.getChildren().addAll(costBikeLabel, costBikeTextField);
            this.costSetUpFLowPane.getChildren().addAll(costSetUpLabel, costSetUpTextField);

            this.coffiecientFLowPane.getChildren().addAll(coefficientLabel, coefficientTextField);
            this.baseFLowPane.getChildren().addAll(baseLabel, baseTextField);
            this.exponentFLowPane.getChildren().addAll(exponentLabel, exponentTextField);

            massTextField.setOnAction(this);
            forceTextField.setOnAction(this);

            projectileOptionBox.setOnAction(this);
            gravityOptionBox.setOnAction(this);
            angleTextField.setOnAction(this);
            initVelTextField.setOnAction(this);

            objectHeightTextField.setOnAction(this);
            objectDistanceTextField.setOnAction(this);
            focalDistTextField.setOnAction(this);
            lensOptionBox.setOnAction(this);

            materialOptionBox.setOnAction(this);
            thicknessTextField.setOnAction(this);
            indexRefFilmTextField.setOnAction(this);

            costBikeTextField.setOnAction(this);
            costSetUpTextField.setOnAction(this);

            coefficientTextField.setOnAction(this);
            baseTextField.setOnAction(this);
            exponentTextField.setOnAction(this);
	}
	public void showNewtonLawControls()
	{
            this.getChildren().clear();
            this.getChildren().addAll(enterValuesLabel, massFlowPane, forceFlowPane);
	}
	
	public void showProjMotControls()
	{
            this.getChildren().clear();
            this.getChildren().addAll(enterValuesLabel, projectileFlowPane, gravityFlowPane, angleFLowPane, initVelFLowPane);
	}
	
	public void showOpticsControls()
	{
            this.getChildren().clear();
            this.getChildren().addAll(enterValuesLabel, objectHeightFLowPane, objectDistanceFLowPane, focalDistFLowPane, lenslFlowPane);
	}
	
	public void showThinFilmControls()
	{
            this.getChildren().clear();
            this.getChildren().addAll(enterValuesLabel, materialFlowPane, indexRefMatLabel, thicknessFLowPane, indexRefFilmFLowPane);
	}
	
	public void showNewBikeControls()
	{
            this.getChildren().clear();
            this.getChildren().addAll(enterValuesLabel, costBikeFLowPane, costSetUpFLowPane);
	}
	
	public void showInfSeriesControls()
	{
            this.getChildren().clear();
            this.getChildren().addAll(enterValuesLabel, coffiecientFLowPane,baseFLowPane,exponentFLowPane,infSumEquationLabel,partSumEquationLabel);
	}
        
        public boolean getValues()
        {
            boolean disableSection = true;
            switch(MainWindow.getUserInterface())
            {
                
                case NEWTON_LAW:
                    if(massTextField.getText().isEmpty()
                            || forceTextField.getText().isEmpty()
                            || Double.valueOf(massTextField.getText()) == Constants.ZERO
                            || Double.valueOf(forceTextField.getText()) == Constants.ZERO)
                    {
                        disableSection = false;
                        break;
                    }
                    Variables.setMass(Double.valueOf(massTextField.getText()));
                    Variables.setForce(Double.valueOf(forceTextField.getText()));
                    break;
                    
                case PROJ_MOTION:
                	if(gravityOptionBox.getSelectionModel().getSelectedItem() == null
                			|| projectileOptionBox.getSelectionModel().getSelectedItem().isEmpty()
                			|| initVelTextField.getText().isEmpty()
                			|| angleTextField.getText().isEmpty()
                                        || Double.valueOf(initVelTextField.getText()) == Constants.ZERO)
                	{
                		disableSection = false;
                		break;
                	}
                        
                	Variables.setGravityType(gravityOptionBox.getSelectionModel().getSelectedItem());
                	if(Variables.getGravityType() == Constants.GRAVITY_TYPE_LIST.get(Constants.ZERO))
                	{
                		//No gravity
                		Variables.setGravity(Constants.GRAVITY_NOTHING);
                	}
                	else if(Variables.getGravityType() == Constants.GRAVITY_TYPE_LIST.get(Constants.ONE))
                	{
                		//Earth
                		Variables.setGravity(Constants.GRAVITY_EARTH);
                	}
                	else if(Variables.getGravityType() == Constants.GRAVITY_TYPE_LIST.get(Constants.TWO))
                	{
                		//Super Mario
                		Variables.setGravity(Constants.GRAVITY_SUPERMARIO);
                	}
                	else if(Variables.getGravityType() == Constants.GRAVITY_TYPE_LIST.get(Constants.TWO))
                	{
                		//Super Mario 2
                		Variables.setGravity(Constants.GRAVITY_SUPERMARIO2);
                	}
                	else if(Variables.getGravityType() == Constants.GRAVITY_TYPE_LIST.get(Constants.FOUR))
                	{
                		//Super Mario 3
                		Variables.setGravity(Constants.GRAVITY_SUPERMARIO3);
                	}
                	else if(Variables.getGravityType() == Constants.GRAVITY_TYPE_LIST.get(Constants.FIVE))
                	{
                		//Super Mario World
                		Variables.setGravity(Constants.GRAVITY_SUPERWORLD);
                	}
                	else if(Variables.getGravityType() == Constants.GRAVITY_TYPE_LIST.get(Constants.SIX))
                	{
                		//Super Mario Sunshine
                		Variables.setGravity(Constants.GRAVITY_MARIOSUNSHINE);
                	}
                	else if(Constants.GRAVITY_TYPE_LIST.get(Constants.SEVEN) == Constants.GRAVITY_TYPE_LIST.get(Constants.SEVEN))
                	{
                		//Super Paper Mario 
                		Variables.setGravity(Constants.GRAVITY_SUPERPAPER);
                	}
                	else if(Variables.getGravityType() == Constants.GRAVITY_TYPE_LIST.get(Constants.EIGHT))
                	{
                		//Super  Mario 64 
                		Variables.setGravity(Constants.GRAVITY_SUPERMARIO64);
                	}
                	Variables.setProjectileType(projectileOptionBox.getSelectionModel().getSelectedItem());
                	Variables.setVelocity(Double.valueOf(initVelTextField.getText()));
                	Variables.setAngle(Double.valueOf(angleTextField.getText()));
                	break;
                    
                case OPTICS:
                    if(((String)(lensOptionBox.getSelectionModel().getSelectedItem())) == null
                            || objectHeightTextField.getText().isEmpty()
                            || objectDistanceTextField.getText().isEmpty()
                            || focalDistTextField.getText().isEmpty()
                            || Double.valueOf(objectHeightTextField.getText()) == Constants.ZERO
                            || Double.valueOf(objectDistanceTextField.getText()) == Constants.ZERO
                            || Double.valueOf(focalDistTextField.getText()) == Constants.ZERO)
                    {
                        disableSection = false;
                        break;
                    }
                    Variables.setLensType(lensOptionBox.getSelectionModel().getSelectedItem());
                    Variables.setObjHeight(Double.valueOf(objectHeightTextField.getText()));
                    Variables.setObjDistance(Double.valueOf(objectDistanceTextField.getText()));
                    Variables.setFocalPoint(((Variables.getLensType().equalsIgnoreCase(Constants.LENS_DIVERGING))
                                            ? -Double.valueOf(focalDistTextField.getText())
                                            : Double.valueOf(focalDistTextField.getText())));
                    if(Variables.getLensType().equalsIgnoreCase(Constants.LENS_CONVERGING) 
                    		&& (int)Variables.getFocalPoint() == (int)Variables.getObjDistance())
                    {
                    	Variables.setFocalPoint(Variables.getFocalPoint() + Constants.DIST_ADJUST);
                    }
                    MainWindow.getAnimSection().drawOpticsFrame();
                    break;
                    
                case THIN_FILM:
                    if(((String)(materialOptionBox.getSelectionModel().getSelectedItem())) == null
                            || thicknessTextField.getText().isEmpty()
                            || indexRefFilmTextField.getText().isEmpty()
                            || Double.valueOf(thicknessTextField.getText()) == Constants.ZERO
                            || Double.valueOf(indexRefFilmTextField.getText()) == Constants.ZERO)
                    {
                        disableSection = false;
                        break;
                    }
                    Variables.setThickness(Double.valueOf(thicknessTextField.getText()));
                    Variables.setIndexRefFilm(Double.valueOf(indexRefFilmTextField.getText()));
                    MainWindow.getAnimSection().drawThinFlimFrame();
                    break;
                    
                case SPORTS_BIKE:
                    if(costBikeTextField.getText().isEmpty()
                            || costSetUpTextField.getText().isEmpty())
                    {
                        disableSection = false;
                        break;
                    }
                    
                    Variables.setCostMake(Double.valueOf(costBikeTextField.getText()));
                    Variables.setCostSetUp(Double.valueOf(costSetUpTextField.getText()));
                    break;
                case INF_GEOM_SERIES:
                	if(this.coefficientTextField.getText().isEmpty()
                            || this.baseTextField.getText().isEmpty()
                            || this.exponentTextField.getText().isEmpty())
                	{
                		disableSection = false;
                        break;
                	}
                	Variables.setCoefficient(Double.valueOf(this.coefficientTextField.getText()));
                	MainWindow.getChartSection().clearData();
                	Variables.setBase(Double.valueOf(this.baseTextField.getText()));
                	Variables.setExponent(Integer.valueOf(this.exponentTextField.getText()));
                	break;
                    
                default:
                    disableSection = false;
                    break;
            }
            setDisable(disableSection);
            return disableSection;
        }

	@Override
	public void handle(ActionEvent event) 
	{
            if(event.getSource() == materialOptionBox)
            {
                Variables.setMaterialType(((String)(materialOptionBox.getSelectionModel().getSelectedItem())));
                MainWindow.getAnimSection().drawThinFlimFrame();
                if(Variables.getMaterialType().equalsIgnoreCase(Constants.MATERIAL_TYPE_LIST.get(Constants.ZERO)))
                {
                    indexRefMatLabel.setText(Constants.INDEX_REF_MAT_LABEL_TEXT + Constants.INDEX_REF_WATER);
                    Variables.setIndexRefMaterial(Constants.INDEX_REF_WATER);
                }
                else if(Variables.getMaterialType().equalsIgnoreCase(Constants.MATERIAL_TYPE_LIST.get(Constants.ONE)))
                {
                    indexRefMatLabel.setText(Constants.INDEX_REF_MAT_LABEL_TEXT + Constants.INDEX_REF_GLYCERIN);
                    Variables.setIndexRefMaterial(Constants.INDEX_REF_GLYCERIN);
                }
                else if(Variables.getMaterialType().equalsIgnoreCase(Constants.MATERIAL_TYPE_LIST.get(Constants.TWO)))
                {
                    indexRefMatLabel.setText(Constants.INDEX_REF_MAT_LABEL_TEXT + Constants.INDEX_REF_OIL);
                    Variables.setIndexRefMaterial(Constants.INDEX_REF_OIL);
                }
                else if(Variables.getMaterialType().equalsIgnoreCase(Constants.MATERIAL_TYPE_LIST.get(Constants.THREE)))
                {
                    indexRefMatLabel.setText(Constants.INDEX_REF_MAT_LABEL_TEXT + Constants.INDEX_REF_ZIRCON);
                    Variables.setIndexRefMaterial(Constants.INDEX_REF_ZIRCON);
                }
                else if(Variables.getMaterialType().equalsIgnoreCase(Constants.MATERIAL_TYPE_LIST.get(Constants.FOUR)))
                {
                    indexRefMatLabel.setText(Constants.INDEX_REF_MAT_LABEL_TEXT + Constants.INDEX_REF_DIAMOND);
                    Variables.setIndexRefMaterial(Constants.INDEX_REF_DIAMOND);
                }
                else if(Variables.getMaterialType().equalsIgnoreCase(Constants.MATERIAL_TYPE_LIST.get(Constants.FIVE)))
                {
                    indexRefMatLabel.setText(Constants.INDEX_REF_MAT_LABEL_TEXT + Constants.INDEX_REF_PYREX);
                    Variables.setIndexRefMaterial(Constants.INDEX_REF_PYREX);
                }

            }
            else if(event.getSource() == thicknessTextField)//note: user has to press enter to make this work
            {
                Variables.setThickness(Double.valueOf(thicknessTextField.getText()));
            }
            else if(event.getSource() == indexRefFilmTextField)
            {
                Variables.setIndexRefFilm(Double.valueOf(indexRefFilmTextField.getText()));
            }
            else if(event.getSource() == this.forceTextField)
            {
            	Variables.setForce(Double.valueOf(forceTextField.getText()));
            }
            else if(event.getSource() == this.massTextField)
            {
            	Variables.setMass(Double.valueOf(massTextField.getText()));
            }
            else if(event.getSource() == objectHeightTextField)
            {
                Variables.setObjHeight(Double.valueOf(objectHeightTextField.getText()));
            }
            else if(event.getSource() == objectDistanceTextField)
            {
                Variables.setObjDistance(Double.valueOf(objectDistanceTextField.getText()));
            }
            else if(event.getSource() == focalDistTextField)
            {
                Variables.setFocalPoint(Double.valueOf(focalDistTextField.getText()));
            }
            else if(event.getSource() == lensOptionBox)
            {
                Variables.setLensType(((String)(lensOptionBox.getSelectionModel().getSelectedItem())));
            }
            else if(event.getSource() == costBikeTextField)
            {
                Variables.setCostMake(Double.valueOf(costBikeTextField.getText()));
            }
            else if(event.getSource() == costSetUpTextField)
            {
                Variables.setCostSetUp(Double.valueOf(costSetUpTextField.getText()));
            }
            else if(event.getSource() == angleTextField)
            {
            	Variables.setAngle(Double.valueOf(angleTextField.getText()));
            	MainWindow.getAnimSection().drawProjMotFrame();
            }
	}
}
