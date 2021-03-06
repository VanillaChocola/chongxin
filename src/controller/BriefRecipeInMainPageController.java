package controller;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.Recipe;

public class BriefRecipeInMainPageController implements Initializable {

    @FXML
    private ImageView recipeImg;

    @FXML
    private Label recipeName;

    @FXML
    private Label recipeDescription;
    
    private Recipe eachBriefRecipe;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		eachBriefRecipe = MainPageController.matchRecipes.pop();
		
		MainPageController.recipeCopies.add(eachBriefRecipe);

		recipeName.setText(eachBriefRecipe.getName());
		
		recipeDescription.setText(eachBriefRecipe.getBriefDescription());
		
		recipeImg.setImage(new Image( new File(eachBriefRecipe.getThumbnail()).toURI().toString(),  80, 80, false, false));
		
	}

}
