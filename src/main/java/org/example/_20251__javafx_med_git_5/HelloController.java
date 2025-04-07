package org.example._20251__javafx_med_git_5;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
  @FXML
  private Label welcomeText;

  @FXML
  protected void onHelloButtonClick() {
    welcomeText.setText("WillVelkommen zum JavaFX Application!");
  }
}