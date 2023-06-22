package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import alert.AlertMaker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class CakeController implements Initializable {

    @FXML
    ImageView cake1, cake2, cake3, cake4, cake5, cake6;

    @FXML
    Button cartButton, homeButton, cakeButton, cookieButton, donutButton, pastryButton, toolButton, equipButton,
    cakeFave1, cakeFave2, cakeFave3, cakeFave4, cakeFave5, cakeFave6, 
    cakeCart1, cakeCart2, cakeCart3, cakeCart4, cakeCart5, cakeCart6;

    @FXML
    Label cakeprice1, cakeprice2, cakeprice3, cakeprice4, cakeprice5, cakeprice6, 
    cakename1, cakename2, cakename3, cakename4, cakename5, cakename6; 

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    static Parent homeRoot = null;
    FXMLLoader loader;

    @FXML 
    static CheckoutController checkoutController = null;
    static FaveController faveController = null;

    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
       
        // ============== BLACK FOREST ==================//
        cakename1.setText(LoginController.bForest.getProductName());
        cakeprice1.setText(Double.toString(LoginController.bForest.getProductPrice()));
        Image blackforest = new Image(LoginController.bForest.getProductImage());
        cake1.setImage(blackforest);

         // ============== CHEESECAKE ==================//
        cakename2.setText(LoginController.cheese.getProductName());
        cakeprice2.setText(Double.toString(LoginController.cheese.getProductPrice()));
        Image cheese = new Image(LoginController.cheese.getProductImage());
        cake2.setImage(cheese);

         // ============== CHOCO MUD CUPCAKE ==================//
        cakename3.setText(LoginController.chocoCC.getProductName());
        cakeprice3.setText(Double.toString(LoginController.chocoCC.getProductPrice()));
        Image chocomudcupcake = new Image(LoginController.chocoCC.getProductImage());
        cake3.setImage(chocomudcupcake);

         // ============== COFFEE CAKE ==================//
        cakename4.setText(LoginController.cCake.getProductName());
        cakeprice4.setText(Double.toString(LoginController.cCake.getProductPrice()));
        Image coffeecake = new Image(LoginController.cCake.getProductImage());
        cake4.setImage(coffeecake);

         // ============== RED VELVET ==================//
        cakename5.setText(LoginController.redCC.getProductName());
        cakeprice5.setText(Double.toString(LoginController.redCC.getProductPrice()));
        Image redvelvet = new Image(LoginController.redCC.getProductImage());
        cake5.setImage(redvelvet);

         // ============== TIRAMISU ==================//
        cakename6.setText(LoginController.tiramisu.getProductName());
        cakeprice6.setText(Double.toString(LoginController.tiramisu.getProductPrice()));
        Image tiramisuu = new Image(LoginController.tiramisu.getProductImage());
        cake6.setImage(tiramisuu);
    }
    

    public void buy(ActionEvent event) throws IOException {

       AlertMaker.showSimpleAlert("Sweet Tuesdays", "Item added");

        Button sourceButton = (Button) event.getSource();

        // If cakeCart button is pressed, set product status to true
        if (sourceButton.equals(cakeCart1)) {
            LoginController.bForest.setProductStatus(true);
            LoginController.bForest.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane1);
        }

        else if (sourceButton == cakeCart2) {
            LoginController.cheese.setProductStatus(true);
            LoginController.cheese.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane2);
        }

        else if (sourceButton == cakeCart3) {
            LoginController.chocoCC.setProductStatus(true);
            LoginController.chocoCC.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane3);
        }
        else if (sourceButton == cakeCart4) {
            LoginController.cCake.setProductStatus(true);
            LoginController.cCake.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane4);
        }
        else if (sourceButton == cakeCart5) {
            LoginController.redCC.setProductStatus(true);
            LoginController.redCC.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane5);
        }
        else if (sourceButton == cakeCart6) {
            LoginController.tiramisu.setProductStatus(true);
            LoginController.tiramisu.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane6);
        }

        LoginController.cart.showItems();
    }
    
    // Goes to Cakes.fxml
    public void gotocakes(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Cakes.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Cookies.fxml
    public void gotocookies(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Cookies.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Donuts.fxml
    public void gotodonuts(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Donuts.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Pastry.fxml
    public void gotopastry(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Pastry.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Tools.fxml
    public void gototools(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Tools.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Equipment.fxml
    public void gotoequip(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Equipment.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Favorite.fxml
    public void gotofaves (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Favorites.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Credits.fxml
    public void gotocredits (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/About.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Home.fxml
    public void gotohome (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Home.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

     // Goes to Checkout.fxml
    public void gotocart (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Checkout.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    

    public void fave(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("Sweet Tuesdays", "Added to Favorites");

        Button sourceButton = (Button) event.getSource();

        // If cakeCart button is pressed, set product status to true
        if (sourceButton.equals(cakeFave1)) {
            LoginController.bForest.setProductStatus(true);
            LoginController.bForest.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane1);
        }

        else if (sourceButton == cakeFave2) {
            LoginController.cheese.setProductStatus(true);
            LoginController.cheese.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane2);
        }

        else if (sourceButton == cakeFave3) {
            LoginController.chocoCC.setProductStatus(true);
            LoginController.chocoCC.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane3);
        }
        else if (sourceButton == cakeFave4) {
            LoginController.cCake.setProductStatus(true);
            LoginController.cCake.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane4);
        }
        else if (sourceButton == cakeFave5) {
            LoginController.redCC.setProductStatus(true);
            LoginController.redCC.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane5);
        }
        else if (sourceButton == cakeFave6) {
            LoginController.tiramisu.setProductStatus(true);
            LoginController.tiramisu.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane6);
        }

        LoginController.fave.showItems();
    }



}