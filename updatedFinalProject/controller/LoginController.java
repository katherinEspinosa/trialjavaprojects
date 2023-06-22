package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.BakingPans;
import model.BavarianDonut;

import model.Bibingka;
import model.BlackForest;
import model.Cart;
import model.Cheesecake;
import model.ChocoMudCC;
import model.ChocolateChip;
import model.ChocolateFrostedDonut;
import model.Churros;
import model.CinnamonRoll;
import model.CinnamonTwistDonut;
import model.CoffeeCake;
import model.CremeBruleeCookie;
import model.Croissant;
import model.EggTart;
import model.Empanada;
import model.Fave;
import model.FoodProcessor;
import model.FortuneCookie;
import model.GlazedDonuts;
import model.HandMixer;
import model.MeasuringCup;
import model.MicrowaveOven;
import model.MixingBowl;
import model.OatmealCookie;
import model.Pandesal;
import model.PeanutButterCookie;
import model.PeanutButterDonut;
import model.PipingBagandTips;
import model.RedVelvet;
import model.Smores;
import model.StandMixer;
import model.Tiramisu;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class LoginController implements Initializable {

    @FXML
    TextField mytextfield;

    @FXML
    PasswordField mypasswordfield;

    @FXML
    Button mybutton;

    @FXML
    Label mywarninglabel;

    @FXML
    HomeController homeController = null;

    @FXML
    static CheckoutController checkoutController = null;
    static FaveController faveController = new FaveController();

    @FXML
    static Parent homeRoot = null;

    FXMLLoader loader;

    //cake
    static Cheesecake cheese = new Cheesecake(); 
    static BlackForest bForest = new BlackForest();
    static ChocoMudCC chocoCC = new ChocoMudCC();
    static CoffeeCake cCake = new CoffeeCake();
    static RedVelvet redCC = new RedVelvet();
    static Tiramisu tiramisu = new Tiramisu(); 

    //cookies
    static ChocolateChip chocoChip = new ChocolateChip();
    static CremeBruleeCookie cBrulee = new CremeBruleeCookie();
    static FortuneCookie fCookie = new FortuneCookie();
    static OatmealCookie oatmeal = new OatmealCookie();
    static PeanutButterCookie pbCookie = new PeanutButterCookie();
    static Smores smores = new Smores(); 

    //donuts
    static BavarianDonut bavarian = new BavarianDonut();
    static ChocolateFrostedDonut cFrost = new ChocolateFrostedDonut();
    static Churros churros = new Churros();
    static CinnamonTwistDonut cTwist = new CinnamonTwistDonut();
    static GlazedDonuts gDonuts = new GlazedDonuts();
    static PeanutButterDonut pbDonut = new PeanutButterDonut(); 

    //pastries
    static Bibingka bibingka = new Bibingka();
    static CinnamonRoll cRoll = new CinnamonRoll();
    static Croissant croissant = new Croissant();
    static EggTart eggTart = new EggTart();
    static Empanada empanada = new Empanada();
    static Pandesal pandesal = new Pandesal(); 

    //tools
    static BakingPans bPans = new BakingPans();
    static MeasuringCup mCup = new MeasuringCup();
    static MixingBowl mBowl = new MixingBowl();
    static PipingBagandTips pBag = new PipingBagandTips();

    //equipments
    static FoodProcessor fProcessor = new FoodProcessor();
    static HandMixer hMixer = new HandMixer();
    static MicrowaveOven mOven = new MicrowaveOven();
    static StandMixer sMixer = new StandMixer();

    static Fave fave = new Fave();
    static Cart cart = new Cart();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

       // ==============    CAKES    ==================//

        // ============== CHEESECAKE ==================//
        cheese.setProductName("Cheesecake");
        cheese.setProductPrice(300.00);
        cheese.setProductImage("images/cheesecake.png");
        
        // ============== BLACK FOREST ==================//
        bForest.setProductName("Black Forest");
        bForest.setProductPrice(250.00);
        bForest.setProductImage("images/blackforest.png");

        // ============== CHOCO MUD CUPCAKE ==================/
        chocoCC.setProductName("Choco Mud CC");
        chocoCC.setProductPrice(115.00);
        chocoCC.setProductImage("images/chocomud.png");

        // ============== RED VELVET CUPCAKE ==================/
        redCC.setProductName("Red Velvet CC");
        redCC.setProductPrice(120.00);
        redCC.setProductImage("images/redvelvet.png");

        // ============== COFFEE CAKE ==================//
        cCake.setProductName("Coffee Cake");
        cCake.setProductPrice(105.00);
        cCake.setProductImage("images/coffeecake.png");

        // ============== TIRAMISU ==================/
        tiramisu.setProductName("Tiramisu");
        tiramisu.setProductPrice(100.00);
        tiramisu.setProductImage("images/tiramisu.png");

        
        // ==============    COOKIES    ==================//

        // ============== CHOCOCHIP ==================//
        chocoChip.setProductName("Chocolate Chips");
        chocoChip.setProductPrice(100.00);
        chocoChip.setProductImage("images/chocochip.png");
        
        // ============== CREME BRULEE SUGAR COOKIE ==================//
        cBrulee.setProductName("Creme Brulee");
        cBrulee.setProductPrice(150.00);
        cBrulee.setProductImage("images/cremebrulee.png");

        // ============== FORTUNE COOKIES  ==================/
        fCookie.setProductName("Fortune Cookies");
        fCookie.setProductPrice(15.00);
        fCookie.setProductImage("images/fortune.png");

        // ============== NO BAKE OATMEAL ==================/
        oatmeal.setProductName("Oatmeal Cookie");
        oatmeal.setProductPrice(100.00);
        oatmeal.setProductImage("images/oatmeal.png");

        // ============== PEANUT BUTTER BLOSSOMS ==================//
        pbCookie.setProductName("Peanut Blosssom");
        pbCookie.setProductPrice(100.00);
        pbCookie.setProductImage("images/peanutbutterblossom.png");

        // ============== S'MORES STUFFED COOKIES ==================/
        smores.setProductName("S'mores Cookies");
        smores.setProductPrice(110.00);
        smores.setProductImage("images/smores.png");

        // ==============    DONUTS    ==================//

        // ============== BAVARIAN CREAM FILLED  ==================//
        bavarian.setProductName("Bavarian");
        bavarian.setProductPrice(25.00);
        bavarian.setProductImage("images/bavarian.png");
        
        // ============== CHOCOLATE FROSTED DONUT ==================//
        cFrost.setProductName("Chocolate Frosted");
        cFrost.setProductPrice(150.00);
        cFrost.setProductImage("images/chocofrost.png");

        // ============== CHURROS ==================/
        churros.setProductName("Churros");
        churros.setProductPrice(115.00);
        churros.setProductImage("images/churros.png");

        // ============== CINNAMON TWIST ==================/
        cTwist.setProductName("Cinnamon Twist");
        cTwist.setProductPrice(120.00);
        cTwist.setProductImage("images/cinnamontwist.png");

        // ============== GLAZED DONUT ==================//
        gDonuts.setProductName("Glazed Donut");
        gDonuts.setProductPrice(30.00);
        gDonuts.setProductImage("images/glazed.png");

        // ============== PEANUT BUTTER DONUTS ==================/
        pbDonut.setProductName("Peanut Butter Donut");
        pbDonut.setProductPrice(110.00);
        pbDonut.setProductImage("images/peanutbutter.png");

        // ==============    PASTRIES    ==================//

        // ============== BIBINGKA ==================//
        bibingka.setProductName("Bibingka");
        bibingka.setProductPrice(55.00);
        bibingka.setProductImage("images/bibingka.png");

        // ============== CINNAMON ROLL ==================/
        cRoll.setProductName("Cinnamon Roll");
        cRoll.setProductPrice(115.00);
        cRoll.setProductImage("images/cinnamonrolls.png");

        // ============== CROISSANT ==================/
        croissant.setProductName("Croissant");
        croissant.setProductPrice(120.00);
        croissant.setProductImage("images/croissant.png");

        // ============== EGG TART ==================//
        eggTart.setProductName("Egg Tart");
        eggTart.setProductPrice(110.00);
        eggTart.setProductImage("images/eggtart.png");

        // ============== EMPANADA ==================/
        empanada.setProductName("Empanada");
        empanada.setProductPrice(110.00);
        empanada.setProductImage("images/empanada.png");

        // ============== PANDESAL ==================/
        pandesal.setProductName("Pandesal");
        pandesal.setProductPrice(3.00);
        pandesal.setProductImage("images/pandesal.png");

        // ==============    BAKING TOOLS    ==================//

        // ============== BAKING PAN/MOULDS ==================//
        bPans.setProductName("Baking Pan Molds");
        bPans.setProductPrice(300.00);
        bPans.setProductImage("images/bakingpanandmolds.png");

        // ============== MEASURING CUP ==================/
        mCup.setProductName("Measuring Cup");
        mCup.setProductPrice(325.00);
        mCup.setProductImage("images/measuringcups.png");

        // ============== MIXING BOWL ==================//
        mBowl.setProductName("Mixing Bowl");
        mBowl.setProductPrice(150.00);
        mBowl.setProductImage("images/mixingbowl.png");

        // ============== PIPING BAG AND TIPS ==================/
        pBag.setProductName("Piping Bag & Tips");
        pBag.setProductPrice(85.00);
        pBag.setProductImage("images/pipingbagandtips.png");


        // ==============    BAKING EQUIPMENTS    ==================//


        // ============== FOOD PROCESSOR ==================/
        fProcessor.setProductName("Food Processor");
        fProcessor.setProductPrice(400.00);
        fProcessor.setProductImage("images/foodprocessor.png");

        // ============== HAND MIXER ==================/
        hMixer.setProductName("Hand Mixer");
        hMixer.setProductPrice(210.00);
        hMixer.setProductImage("images/handmixer.png");

        // ============== MICROWAVE OVEN ==================//
        mOven.setProductName("Microwave Oven");
        mOven.setProductPrice(3500.00);
        mOven.setProductImage("images/microwaveoven.png");

        // ============== STAND MIXER  ==================/
        sMixer.setProductName("Stand Mixer");
        sMixer.setProductPrice(2250.00);
        sMixer.setProductImage("images/standmixer.png");


        // TODO Auto-generated method stub

        try {
            loader = new FXMLLoader(getClass().getResource("/view/Checkout.fxml"));
            homeRoot = loader.load();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();

        }

        // Clears all items in Checkout.fxml
        checkoutController = loader.getController();
        checkoutController.myvbox.getChildren().removeAll(checkoutController.myvbox.getChildren());

        // faveController = loader.getController();
        // faveController.myvbox.getChildren().removeAll(faveController.myvbox.getChildren()); 
    }

    public void login(ActionEvent event) throws IOException {

        String username = mytextfield.getText();
        String password = mypasswordfield.getText();

        if (username.equals("a") && password.equals("a")) {

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Home.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } else {
            mywarninglabel.setVisible(true);
        }
    }

}