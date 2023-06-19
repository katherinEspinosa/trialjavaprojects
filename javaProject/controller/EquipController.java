package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import alert.AlertMaker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
// import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class EquipController implements Initializable {

    @FXML
    private Button equipFave1, equipFave2, equipFave3, equipFave4, equipFave5, equipFave6, equipCart1, 
    equipCart2, equipCart3, equipCart4, equipCart5, equipCart6, cakeButton, cookieButton, donutButton, 
    pastryButton, toolButton, equipButton, homeButton, cartbasket;

    @FXML
    private ImageView equip1, equip2, equip3, equip4, equip5, equip6;

    @FXML
    private Label equipPrice1, equipPrice2, equipPrice3, equipPrice4, equipPrice5, equipPrice6, 
    equipname1, equipname2, equipname3, equipname4, equipname5, equipname6;

    @FXML
    private Scene scene;
    @FXML
    private Stage stage;

    @FXML
    private Parent root = null;
    FXMLLoader loader;

    @FXML
    static CheckoutController checkoutController = null;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
       
        // ============== CAKE STAND ==================//
        equipname1.setText(LoginController.cStand.getProductName());
        equipPrice1.setText(Double.toString(LoginController.cStand.getProductPrice()));
        Image cakeStand = new Image(LoginController.cStand.getProductImage());
        equip1.setImage(cakeStand);

        // ============== FOOD PROCESSOR ==================//
        equipname2.setText(LoginController.fProcessor.getProductName());
        equipPrice2.setText(Double.toString(LoginController.fProcessor.getProductPrice()));
        Image foodProcessor = new Image(LoginController.fProcessor.getProductImage());
        equip2.setImage(foodProcessor);

        // ============== HAND MIXER ==================//
        equipname3.setText(LoginController.hMixer.getProductName());
        equipPrice3.setText(Double.toString(LoginController.hMixer.getProductPrice()));
        Image handMixer = new Image(LoginController.hMixer.getProductImage());
        equip3.setImage(handMixer);

        // ============== MICROWAVE OVEN ==================//
        equipname4.setText(LoginController.mOven.getProductName());
        equipPrice4.setText(Double.toString(LoginController.mOven.getProductPrice()));
        Image microwaveOven = new Image(LoginController.mOven.getProductImage());
        equip4.setImage(microwaveOven);

        // ============== STAND MIXER ==================//
        equipname5.setText(LoginController.sMixer.getProductName());
        equipPrice5.setText(Double.toString(LoginController.sMixer.getProductPrice()));
        Image standMixer = new Image(LoginController.sMixer.getProductImage());
        equip5.setImage(standMixer);

        // ============== WEIGHING SCALE ==================//
        equipname6.setText(LoginController.wScale.getProductName());
        equipPrice6.setText(Double.toString(LoginController.wScale.getProductPrice()));
        Image weighingScale = new Image(LoginController.wScale.getProductImage());
        equip6.setImage(weighingScale);
    }


    // Goes to newedited.fxml
   public void gotohome(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/newedited.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to cakes.fxml
    public void gotocakes (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/cakes.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to cookies.fxml
    public void gotocookies (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/cookies.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to donuts.fxml
    public void gotodonuts (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/donuts.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to pastries.fxml
    public void gotopastries (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/pastries.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to favorite.fxml
    public void gotofaves (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/favorites.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

   // Goes to bakingtools.fxml
    public void gototools (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/bakingtools.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    // Goes to bakingEquipment.fxml
    public void gotoequips (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/bakingEquipment.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to checkout.fxml
    public void gotocart (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/checkout.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void buy(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("Sweet Tuesdays", "Item added");

        Button sourceButton = (Button) event.getSource();

        // If equipCart button is pressed, set product status to true
        if (sourceButton.equals(equipCart1)) {
            LoginController.cStand.setProductStatus(true);
            LoginController.cStand.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane43);
        }

        else if (sourceButton == equipCart2) {
            LoginController.fProcessor.setProductStatus(true);
            LoginController.fProcessor.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane44);
        }

        else if (sourceButton == equipCart3) {
            LoginController.hMixer.setProductStatus(true);
            LoginController.hMixer.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane45);
        }
        else if (sourceButton == equipCart4) {
            LoginController.mOven.setProductStatus(true);
            LoginController.mOven.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane46);
        }
        else if (sourceButton == equipCart5) {
            LoginController.sMixer.setProductStatus(true);
            LoginController.sMixer.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane47);
        }
        else if (sourceButton == equipCart6) {
            LoginController.wScale.setProductStatus(true);
            LoginController.wScale.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane48);
        }

        LoginController.cart.showItems();
    }

public void fave(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("Sweet Tuesdays", "Added to Favorites");

        Button sourceButton = (Button) event.getSource();

        // If cakeCart button is pressed, set product status to true
        if (sourceButton.equals(equipFave1)) {
            LoginController.cStand.setProductStatus(true);
            LoginController.cStand.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane43);
        }

        else if (sourceButton == equipFave2) {
            LoginController.fProcessor.setProductStatus(true);
            LoginController.fProcessor.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane44);
        }

        else if (sourceButton == equipFave3) {
            LoginController.hMixer.setProductStatus(true);
            LoginController.hMixer.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane45);
        }
        else if (sourceButton == equipFave4) {
            LoginController.mOven.setProductStatus(true);
            LoginController.mOven.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane46);
        }
        else if (sourceButton == equipFave5) {
            LoginController.sMixer.setProductStatus(true);
            LoginController.sMixer.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane47);
        }
        else if (sourceButton == equipFave6) {
            LoginController.wScale.setProductStatus(true);
            LoginController.wScale.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane48);
        }

        LoginController.fave.showItems();
    }

    

}
