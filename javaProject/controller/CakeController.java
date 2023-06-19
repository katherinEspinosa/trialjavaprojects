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

public class CakeController implements Initializable {

    @FXML
    private Button cakeFave1, cakeFave2, cakeFave3, cakeFave4, cakeFave5, cakeFave6, cakeCart1, 
    cakeCart2, cakeCart3, cakeCart4, cakeCart5, cakeCart6, cakeButton, cookieButton, donutButton, 
    pastryButton, toolButton, equipButton, homeButton, cartbasket;

    @FXML
    private ImageView cake1, cake2, cake3, cake4, cake5, cake6;

    @FXML
    private Label cakeprice1, cakeprice2, cakeprice3, cakeprice4, cakeprice5, cakeprice6, 
    cakename1, cakename2, cakename3, cakename4, cakename5, cakename6;

    @FXML
    private Scene scene;
    @FXML
    private Stage stage;

    @FXML
    private Parent root = null;
    FXMLLoader loader;

    @FXML
    static CheckoutController checkoutController = null;
    static FaveController favecontroller = null;



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

        // If cakeCart button is pressed, set product status to true
        if (sourceButton.equals(cakeCart1)) {
            LoginController.bForest.setProductStatus(true);
            LoginController.bForest.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane13);
        }

        else if (sourceButton == cakeCart2) {
            LoginController.cheese.setProductStatus(true);
            LoginController.cheese.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane14);
        }

        else if (sourceButton == cakeCart3) {
            LoginController.chocoCC.setProductStatus(true);
            LoginController.chocoCC.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane15);
        }
        else if (sourceButton == cakeCart4) {
            LoginController.cCake.setProductStatus(true);
            LoginController.cCake.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane16);
        }
        else if (sourceButton == cakeCart5) {
            LoginController.redCC.setProductStatus(true);
            LoginController.redCC.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane17);
        }
        else if (sourceButton == cakeCart6) {
            LoginController.tiramisu.setProductStatus(true);
            LoginController.tiramisu.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane18);
        }

        LoginController.cart.showItems();
    }
    
    public void fave(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("Sweet Tuesdays", "Added to Favorites");

        Button sourceButton = (Button) event.getSource();

        // If cakeCart button is pressed, set product status to true
        if (sourceButton.equals(cakeFave1)) {
            LoginController.bForest.setProductStatus(true);
            LoginController.bForest.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane13);
        }

        else if (sourceButton == cakeFave2) {
            LoginController.cheese.setProductStatus(true);
            LoginController.cheese.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane14);
        }

        else if (sourceButton == cakeFave3) {
            LoginController.chocoCC.setProductStatus(true);
            LoginController.chocoCC.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane15);
        }
        else if (sourceButton == cakeFave4) {
            LoginController.cCake.setProductStatus(true);
            LoginController.cCake.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane16);
        }
        else if (sourceButton == cakeFave5) {
            LoginController.redCC.setProductStatus(true);
            LoginController.redCC.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane17);
        }
        else if (sourceButton == cakeFave6) {
            LoginController.tiramisu.setProductStatus(true);
            LoginController.tiramisu.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane18);
        }

        LoginController.fave.showItems();
    }



    

}
