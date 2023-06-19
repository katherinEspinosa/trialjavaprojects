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

public class CookieController implements Initializable {

    @FXML
    private Button cookieFave1, cookieFave2, cookieFave3, cookieFave4, cookieFave5, cookieFave6, cookieCart1, 
    cookieCart2, cookieCart3, cookieCart4, cookieCart5, cookieCart6,cakeButton, cookieButton, donutButton, 
    pastryButton, toolButton, equipButton, homeButton, cartbasket;

    @FXML
    private ImageView cookie1, cookie2, cookie3, cookie4, cookie5, cookie6;

    @FXML
    private Label cookieprice1, cookieprice2, cookieprice3, cookieprice4, cookieprice5, cookieprice6, 
    cookiename1, cookiename2, cookiename3, cookiename4, cookiename5, cookiename6;

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
       
         // ============== CHOCOCHIP ==================//
        cookiename1.setText(LoginController.chocoCC.getProductName());
        cookieprice1.setText(Double.toString(LoginController.chocoCC.getProductPrice()));
        Image chocochip = new Image(LoginController.chocoCC.getProductImage());
        cookie1.setImage(chocochip);

         // ============== CREME BRULEE SUGAR COOKIE ==================//
        cookiename2.setText(LoginController.cBrulee.getProductName());
        cookieprice2.setText(Double.toString(LoginController.cBrulee.getProductPrice()));
        Image cremebrulee = new Image(LoginController.cBrulee.getProductImage());
        cookie2.setImage(cremebrulee);

         // ============== FORTUNE COOKIES ==================//
        cookiename3.setText(LoginController.fCookie.getProductName());
        cookieprice3.setText(Double.toString(LoginController.fCookie.getProductPrice()));
        Image fortunecookie = new Image(LoginController.fCookie.getProductImage());
        cookie3.setImage(fortunecookie);

         // ============== NO BAKE OATMEAL ==================//
        cookiename4.setText(LoginController.oatmeal.getProductName());
        cookieprice4.setText(Double.toString(LoginController.oatmeal.getProductPrice()));
        Image oatmeall = new Image(LoginController.oatmeal.getProductImage());
        cookie4.setImage(oatmeall);

         // ============== PEANUT BUTTER BLOSSOMS ==================//
        cookiename5.setText(LoginController.pbCookie.getProductName());
        cookieprice5.setText(Double.toString(LoginController.pbCookie.getProductPrice()));
        Image peanutbutter = new Image(LoginController.pbCookie.getProductImage());
        cookie5.setImage(peanutbutter);

         // ============== S'MORES STUFFED COOKIES ==================//
        cookiename6.setText(LoginController.smores.getProductName());
        cookieprice6.setText(Double.toString(LoginController.smores.getProductPrice()));
        Image smoress = new Image(LoginController.smores.getProductImage());
        cookie6.setImage(smoress);
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

        // If cookieCart button is pressed, set product status to true
        if (sourceButton.equals(cookieCart1)) {
            LoginController.chocoChip.setProductStatus(true);
            LoginController.chocoChip.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane19);
        }

        else if (sourceButton == cookieCart2) {
            LoginController.cBrulee.setProductStatus(true);
            LoginController.cBrulee.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane20);
        }

        else if (sourceButton == cookieCart3) {
            LoginController.fCookie.setProductStatus(true);
            LoginController.fCookie.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane21);
        }
        else if (sourceButton == cookieCart4) {
            LoginController.oatmeal.setProductStatus(true);
            LoginController.oatmeal.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane22);
        }
        else if (sourceButton == cookieCart5) {
            LoginController.pbCookie.setProductStatus(true);
            LoginController.pbCookie.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane23);
        }
        else if (sourceButton == cookieCart6) {
            LoginController.smores.setProductStatus(true);
            LoginController.smores.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane24);
        }

        LoginController.cart.showItems();
    }
public void fave(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("Sweet Tuesdays", "Added to Favorites");

        Button sourceButton = (Button) event.getSource();

        // If cookieCart button is pressed, set product status to true
        if (sourceButton.equals(cookieFave1)) {
            LoginController.chocoChip.setProductStatus(true);
            LoginController.chocoChip.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.checkoutController.pane19);
        }

        else if (sourceButton == cookieFave2) {
            LoginController.cBrulee.setProductStatus(true);
            LoginController.cBrulee.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.checkoutController.pane20);
        }

        else if (sourceButton == cookieFave3) {
            LoginController.fCookie.setProductStatus(true);
            LoginController.fCookie.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.checkoutController.pane21);
        }
        else if (sourceButton == cookieFave4) {
            LoginController.oatmeal.setProductStatus(true);
            LoginController.oatmeal.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.checkoutController.pane22);
        }
        else if (sourceButton == cookieFave5) {
            LoginController.pbCookie.setProductStatus(true);
            LoginController.pbCookie.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.checkoutController.pane23);
        }
        else if (sourceButton == cookieFave6) {
            LoginController.smores.setProductStatus(true);
            LoginController.smores.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.checkoutController.pane24);
        }

        LoginController.fave.showItems();
    }


    

}
