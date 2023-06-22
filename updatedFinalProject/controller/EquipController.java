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
    private Button equipFave1, equipFave2, equipFave3, equipFave4, equipCart1, 
    equipCart2, equipCart3, equipCart4, cakeButton, cookieButton, donutButton, 
    pastryButton, toolButton, equipButton, homeButton, cartbasket;

    @FXML
    private ImageView equip1, equip2, equip3, equip4;

    @FXML
    private Label equipprice1, equipprice2, equipprice3, equipprice4,  
    equipname1, equipname2, equipname3, equipname4;

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
       
        // ============== FOOD PROCESSOR ==================//
        equipname1.setText(LoginController.fProcessor.getProductName());
        equipprice1.setText(Double.toString(LoginController.fProcessor.getProductPrice()));
        Image foodProcessor = new Image(LoginController.fProcessor.getProductImage());
        equip1.setImage(foodProcessor);

        // ============== HAND MIXER ==================//
        equipname2.setText(LoginController.hMixer.getProductName());
        equipprice2.setText(Double.toString(LoginController.hMixer.getProductPrice()));
        Image handMixer = new Image(LoginController.hMixer.getProductImage());
        equip2.setImage(handMixer);

        // ============== MICROWAVE OVEN ==================//
        equipname3.setText(LoginController.mOven.getProductName());
        equipprice3.setText(Double.toString(LoginController.mOven.getProductPrice()));
        Image microwaveOven = new Image(LoginController.mOven.getProductImage());
        equip3.setImage(microwaveOven);

        // ============== STAND MIXER ==================//
        equipname4.setText(LoginController.sMixer.getProductName());
        equipprice4.setText(Double.toString(LoginController.sMixer.getProductPrice()));
        Image standMixer = new Image(LoginController.sMixer.getProductImage());
        equip4.setImage(standMixer);

      
    }


    // Goes to Home.fxml
   public void gotohome(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Home.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Cakes.fxml
    public void gotocakes (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Cakes.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Cookies.fxml
    public void gotocookies (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Cookies.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Donuts.fxml
    public void gotodonuts (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Donuts.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Pastry.fxml
    public void gotopastry (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Pastry.fxml"));
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

    // Goes to Tools.fxml
    public void gototools (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Tools.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Equipment.fxml
    public void gotoequip (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Equipment.fxml"));
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

     // Goes to Credits.fxml
    public void gotocredits (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/About.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void buy(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("Sweet Tuesdays", "Item added");

        Button sourceButton = (Button) event.getSource();

        // If equipCart button is pressed, set product status to true

        if (sourceButton == equipCart1) {
            LoginController.fProcessor.setProductStatus(true);
            LoginController.fProcessor.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane29);
        }

        else if (sourceButton == equipCart2) {
            LoginController.hMixer.setProductStatus(true);
            LoginController.hMixer.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane30);
        }
        else if (sourceButton == equipCart3) {
            LoginController.mOven.setProductStatus(true);
            LoginController.mOven.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane31);
        }
        else if (sourceButton == equipCart4) {
            LoginController.sMixer.setProductStatus(true);
            LoginController.sMixer.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane32);
        }
     

        LoginController.cart.showItems();
    }

public void fave(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("Sweet Tuesdays", "Added to Favorites");

        Button sourceButton = (Button) event.getSource();

        // If cakeCart button is pressed, set product status to true

        if (sourceButton == equipFave1) {
            LoginController.fProcessor.setProductStatus(true);
            LoginController.fProcessor.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane29);
        }

        else if (sourceButton == equipFave2) {
            LoginController.hMixer.setProductStatus(true);
            LoginController.hMixer.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane30);
        }
        else if (sourceButton == equipFave3) {
            LoginController.mOven.setProductStatus(true);
            LoginController.mOven.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane31);
        }
        else if (sourceButton == equipFave4) {
            LoginController.sMixer.setProductStatus(true);
            LoginController.sMixer.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane32);
        }
        

        LoginController.fave.showItems();
    }

    

}
