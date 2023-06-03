package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckoutController implements Initializable {

    @FXML
    Pane pane1, pane2, pane3, pane4;

    @FXML
    Button backbutton;

    @FXML
    VBox myvbox;

    @FXML
    Label name1, name2, name3, name4, price1, price2, price3, price4,  total;

    @FXML
    ImageView img1, img2, img3, img4;

    @FXML
    private ChoiceBox<String> choicebox1, choicebox2, choicebox3, choicebox4;

    private String[] quantity = { "1", "2", "3", "4"};

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        name1.setText(HomeController.ljs.getHusbandName());
        price1.setText(Double.toString(HomeController.ljs.getHusbandPrice()));
        Image leejongsuk = new Image(HomeController.ljs.getHusbandImage());
        img1.setImage(leejongsuk);

        name2.setText(HomeController.lsh.getHusbandName());
        price2.setText(Double.toString(HomeController.lsh.getHusbandPrice()));
        Image leesangheon = new Image(HomeController.lsh.getHusbandImage());
        img2.setImage(leesangheon);

        name3.setText(HomeController.ljw.getHusbandName());
        price3.setText(Double.toString(HomeController.ljw.getHusbandPrice()));
        Image leejaewook = new Image(HomeController.ljw.getHusbandImage());
        img3.setImage(leejaewook);

        name4.setText(HomeController.ldh.getHusbandName());
        price4.setText(Double.toString(HomeController.ldh.getHusbandPrice()));
        Image leedohyun = new Image(HomeController.ldh.getHusbandImage());
        img4.setImage(leedohyun);

        // Set default quantities in choicebox to 1
        choicebox1.setValue("1");
        choicebox2.setValue("1");
        choicebox3.setValue("1");
        choicebox4.setValue("1");

        // Insert quantity array to choicebox
        choicebox1.getItems().addAll(quantity);
        choicebox2.getItems().addAll(quantity);
        choicebox3.getItems().addAll(quantity);
        choicebox4.getItems().addAll(quantity);

        // Add event handler on all choiceboxes
        choicebox1.setOnAction(this::computeTotal);
        choicebox2.setOnAction(this::computeTotal);
        choicebox3.setOnAction(this::computeTotal);
        choicebox4.setOnAction(this::computeTotal);


        // Set total initial amount
        double totalInitialAmount = 0.00;
        if (HomeController.lsh.getHusbandStatus() || HomeController.ljs.getHusbandStatus() || HomeController.ljw.getHusbandStatus()) {
            totalInitialAmount = Double.parseDouble(choicebox1.getValue()) * HomeController.ljs.getHusbandPrice() +
            +Double.parseDouble(choicebox2.getValue()) * HomeController.lsh.getHusbandPrice()
            + Double.parseDouble(choicebox3.getValue()) * HomeController.ljw.getHusbandPrice()
            + Double.parseDouble(choicebox4.getValue()) * HomeController.ldh.getHusbandPrice();

        }
     
        // Display total initial amount in total label
        total.setText(Double.toString(totalInitialAmount));
    }

    public void addItem(Pane pane) {
        myvbox.getChildren().add(pane);
    }

    public void computeTotal(ActionEvent event) {

        double totalAmount = 0;
        double item1Amount = 0;
        double item2Amount = 0;
        double item3Amount = 0;
        double item4Amount = 0;

        ChoiceBox source = (ChoiceBox) event.getSource();

        // If product is chosen, compute item amount
        if (HomeController.ljs.getHusbandStatus()) {

            double qty = Double.parseDouble(choicebox1.getValue());
            item1Amount = HomeController.ljs.getHusbandPrice() * qty;

            if (source == choicebox1) {
                item1Amount = HomeController.ljs.getHusbandPrice() * qty;
            }
        }

        if (HomeController.lsh.getHusbandStatus()) {

            double qty = Double.parseDouble(choicebox2.getValue());
            item2Amount = HomeController.lsh.getHusbandPrice() * qty;

            if (source == choicebox2) {
                item2Amount = HomeController.lsh.getHusbandPrice() * qty;
            }
        }

        if (HomeController.ljw.getHusbandStatus()) {

            double qty = Double.parseDouble(choicebox3.getValue());
            item3Amount = HomeController.ljw.getHusbandPrice() * qty;

            if (source == choicebox3) {
                item3Amount = HomeController.ljw.getHusbandPrice() * qty;
            }
        }

        if (HomeController.ldh.getHusbandStatus()) {

            double qty = Double.parseDouble(choicebox4.getValue());
            item4Amount = HomeController.ldh.getHusbandPrice() * qty;

            if (source == choicebox3) {
                item4Amount = HomeController.ldh.getHusbandPrice() * qty;
            }
        }

        // Compute total amount for all items chosen
        totalAmount = item1Amount + item2Amount + item3Amount +item4Amount;
        
        // Display total amount in total label
        total.setText(Double.toString(totalAmount));
    }

    public void goback (ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/home.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
    }

}