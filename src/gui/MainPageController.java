package gui;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import main.Main;

public class MainPageController {
    @FXML
    ListView list_construction_machines;
    @FXML
    ListView list_contracts;
    @FXML
    ListView list_customers;

    public Main main;

    public void setMain (Main main){
        this.main = main;
    }

}
