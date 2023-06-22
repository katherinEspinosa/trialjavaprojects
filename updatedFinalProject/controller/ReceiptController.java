package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ReceiptController implements Initializable {

    @FXML
    double item1Amount, item2Amount, item3Amount, item4Amount, item5Amount, item6Amount, item7Amount, item8Amount,
    item9Amount, item10Amount, item11Amount, item12Amount, item13Amount, item14Amount, item15Amount, item16Amount,
    item17Amount, item18Amount,item19Amount, item20Amount, item21Amount, item22Amount, item23Amount, item24Amount,
    item25Amount, item26Amount, item27Amount, item28Amount, item29Amount, item30Amount, item31Amount, item32Amount, 
    item33Amount, item34Amount, item35Amount, item36Amount, item37Amount, item38Amount, item39Amount,item40Amount, 
    item41Amount, item42Amount, item43Amount, item44Amount, item45Amount, item46Amount, item47Amount, item48Amount;

    @FXML
    Label qty1, qty2, qty3, qty4, qty5, qty6, qty7, qty8 , qty9, qty10, qty11, qty12, qty13, qty14, qty15, qty16, qty17,
    qty18, qty19, qty20, qty21, qty22, qty23, qty24, qty25, qty26, qty27, qty28, qty29, qty30, qty31, qty32, product1,
    product2, product3, product4, product5, product6, product7, product8, product9, product10, product11, product12,
    product13, product14, product15, product16, product17, product18, product19, product20, product21, product22, 
    product23, product24, product25, product26, product27, product28, product29,product30, product31, product32, price1,price2, price3, price4, price5,  
    price6, price7, price8, price9, price10, price11, price12, price13, price14, price15, price16, price17, price18, 
    price19, price20, price21, price22, price23, price24, price25, price26, price27, price28, price29, price30, price31,
    price32, amount1,amount2, amount3, amount4, amount5, amount6, amount7, amount8, amount9,
    amount10,amount11, amount12, amount13, amount14, amount15, amount16, amount17, amount18, amount19, amount20, amount21, 
    amount22, amount23, amount24, amount25, amount26, amount27, amount28, amount29, amount30, amount31, 
    amount32, total;

    @FXML
    Button exitButton, homeButton;
    
    @FXML 
    Stage stage; 

    @Override
    public void initialize(URL location, ResourceBundle resources) {


            //CAKE 
        if (LoginController.bForest.getProductStatus()) {
            product1.setText(LoginController.bForest.getProductName());
            qty1.setText(Double.toString(LoginController.bForest.getProductQuantity()));
            price1.setText(Double.toString(LoginController.bForest.getProductPrice()));
            amount1.setText(Double
                    .toString(LoginController.bForest.getProductPrice() * LoginController.bForest.getProductQuantity()));

            product1.setVisible(true);
            qty1.setVisible(true);
            price1.setVisible(true);
            amount1.setVisible(true);

            item1Amount = LoginController.bForest.getProductPrice() * LoginController.bForest.getProductQuantity();

        }

        if (LoginController.cheese.getProductStatus()) {
            product2.setText(LoginController.cheese.getProductName());
            qty2.setText(Double.toString(LoginController.cheese.getProductQuantity()));
            price2.setText(Double.toString(LoginController.cheese.getProductPrice()));
            amount2.setText(Double
                    .toString(LoginController.cheese.getProductPrice() * LoginController.cheese.getProductQuantity()));

            product2.setVisible(true);
            qty2.setVisible(true);
            price2.setVisible(true);
            amount2.setVisible(true);

            item2Amount = LoginController.cheese.getProductPrice() * LoginController.cheese.getProductQuantity();

        }


         if (LoginController.chocoCC.getProductStatus()) {
            product3.setText(LoginController.chocoCC.getProductName());
            qty3.setText(Double.toString(LoginController.chocoCC.getProductQuantity()));
            price3.setText(Double.toString(LoginController.chocoCC.getProductPrice()));
            amount3.setText(Double
                    .toString(LoginController.chocoCC.getProductPrice() * LoginController.chocoCC.getProductQuantity()));

            product3.setVisible(true);
            qty3.setVisible(true);
            price3.setVisible(true);
            amount3.setVisible(true);

            item3Amount = LoginController.chocoCC.getProductPrice() * LoginController.chocoCC.getProductQuantity();

        }

         if (LoginController.cCake.getProductStatus()) {
            product4.setText(LoginController.cCake.getProductName());
            qty4.setText(Double.toString(LoginController.cCake.getProductQuantity()));
            price4.setText(Double.toString(LoginController.cCake.getProductPrice()));
            amount4.setText(Double
                    .toString(LoginController.cCake.getProductPrice() * LoginController.cCake.getProductQuantity()));

            product4.setVisible(true);
            qty4.setVisible(true);
            price4.setVisible(true);
            amount4.setVisible(true);

            item4Amount = LoginController.cCake.getProductPrice() * LoginController.cCake.getProductQuantity();

        }

         if (LoginController.redCC.getProductStatus()) {
            product5.setText(LoginController.redCC.getProductName());
            qty5.setText(Double.toString(LoginController.redCC.getProductQuantity()));
            price5.setText(Double.toString(LoginController.redCC.getProductPrice()));
            amount5.setText(Double
                    .toString(LoginController.redCC.getProductPrice() * LoginController.redCC.getProductQuantity()));

            product5.setVisible(true);
            qty5.setVisible(true);
            price5.setVisible(true);
            amount5.setVisible(true);

            item5Amount = LoginController.redCC.getProductPrice() * LoginController.redCC.getProductQuantity();

        }

         if (LoginController.tiramisu.getProductStatus()) {
            product6.setText(LoginController.tiramisu.getProductName());
            qty6.setText(Double.toString(LoginController.tiramisu.getProductQuantity()));
            price16.setText(Double.toString(LoginController.tiramisu.getProductPrice()));
            amount6.setText(Double
                    .toString(LoginController.tiramisu.getProductPrice() * LoginController.tiramisu.getProductQuantity()));

            product6.setVisible(true);
            qty6.setVisible(true);
            price6.setVisible(true);
            amount6.setVisible(true);

            item6Amount = LoginController.tiramisu.getProductPrice() * LoginController.tiramisu.getProductQuantity();

        }

        //COOKIES
         if (LoginController.chocoChip.getProductStatus()) {
            product7.setText(LoginController.chocoChip.getProductName());
            qty7.setText(Double.toString(LoginController.chocoChip.getProductQuantity()));
            price7.setText(Double.toString(LoginController.chocoChip.getProductPrice()));
            amount7.setText(Double
                    .toString(LoginController.chocoChip.getProductPrice() * LoginController.chocoChip.getProductQuantity()));

            product7.setVisible(true);
            qty7.setVisible(true);
            price7.setVisible(true);
            amount7.setVisible(true);

            item7Amount = LoginController.chocoChip.getProductPrice() * LoginController.chocoChip.getProductQuantity();

        }

        
         if (LoginController.cBrulee.getProductStatus()) {
            product8.setText(LoginController.cBrulee.getProductName());
            qty8.setText(Double.toString(LoginController.cBrulee.getProductQuantity()));
            price8.setText(Double.toString(LoginController.cBrulee.getProductPrice()));
            amount8.setText(Double
                    .toString(LoginController.cBrulee.getProductPrice() * LoginController.cBrulee.getProductQuantity()));

            product8.setVisible(true);
            qty8.setVisible(true);
            price8.setVisible(true);
            amount8.setVisible(true);

            item8Amount = LoginController.cBrulee.getProductPrice() * LoginController.cBrulee.getProductQuantity();

        }

        
         if (LoginController.fCookie.getProductStatus()) {
            product9.setText(LoginController.fCookie.getProductName());
            qty9.setText(Double.toString(LoginController.fCookie.getProductQuantity()));
            price9.setText(Double.toString(LoginController.fCookie.getProductPrice()));
            amount9.setText(Double
                    .toString(LoginController.fCookie.getProductPrice() * LoginController.fCookie.getProductQuantity()));

            product9.setVisible(true);
            qty9.setVisible(true);
            price9.setVisible(true);
            amount9.setVisible(true);

            item9Amount = LoginController.fCookie.getProductPrice() * LoginController.fCookie.getProductQuantity();

        }

        
         if (LoginController.oatmeal.getProductStatus()) {
            product10.setText(LoginController.oatmeal.getProductName());
            qty10.setText(Double.toString(LoginController.oatmeal.getProductQuantity()));
            price10.setText(Double.toString(LoginController.oatmeal.getProductPrice()));
            amount10.setText(Double
                    .toString(LoginController.oatmeal.getProductPrice() * LoginController.oatmeal.getProductQuantity()));

            product10.setVisible(true);
            qty10.setVisible(true);
            price10.setVisible(true);
            amount10.setVisible(true);

            item10Amount = LoginController.oatmeal.getProductPrice() * LoginController.oatmeal.getProductQuantity();

        }

        
         if (LoginController.pbCookie.getProductStatus()) {
            product11.setText(LoginController.pbCookie.getProductName());
            qty11.setText(Double.toString(LoginController.pbCookie.getProductQuantity()));
            price11.setText(Double.toString(LoginController.pbCookie.getProductPrice()));
            amount11.setText(Double
                    .toString(LoginController.pbCookie.getProductPrice() * LoginController.pbCookie.getProductQuantity()));

            product11.setVisible(true);
            qty11.setVisible(true);
            price11.setVisible(true);
            amount11.setVisible(true);
            item11Amount = LoginController.pbCookie.getProductPrice() * LoginController.pbCookie.getProductQuantity();

        }

        
         if (LoginController.smores.getProductStatus()) {
            product12.setText(LoginController.smores.getProductName());
            qty12.setText(Double.toString(LoginController.smores.getProductQuantity()));
            price12.setText(Double.toString(LoginController.smores.getProductPrice()));
            amount12.setText(Double
                    .toString(LoginController.smores.getProductPrice() * LoginController.smores.getProductQuantity()));

            product12.setVisible(true);
            qty12.setVisible(true);
            price12.setVisible(true);
            amount12.setVisible(true);

            item12Amount = LoginController.smores.getProductPrice() * LoginController.smores.getProductQuantity();

        }

        //DONUTS
        if (LoginController.bavarian.getProductStatus()) {
            product13.setText(LoginController.bavarian.getProductName());
            qty13.setText(Double.toString(LoginController.bavarian.getProductQuantity()));
            price13.setText(Double.toString(LoginController.bavarian.getProductPrice()));
            amount13.setText(Double
                    .toString(LoginController.bavarian.getProductPrice() * LoginController.bavarian.getProductQuantity()));

            product13.setVisible(true);
            qty13.setVisible(true);
            price13.setVisible(true);
            amount13.setVisible(true);

            item13Amount = LoginController.bavarian.getProductPrice() * LoginController.bavarian.getProductQuantity();

        }
        if (LoginController.cFrost.getProductStatus()) {
            product14.setText(LoginController.cFrost.getProductName());
            qty14.setText(Double.toString(LoginController.cFrost.getProductQuantity()));
            price14.setText(Double.toString(LoginController.cFrost.getProductPrice()));
            amount14.setText(Double
                    .toString(LoginController.cFrost.getProductPrice() * LoginController.cFrost.getProductQuantity()));

            product14.setVisible(true);
            qty14.setVisible(true);
            price14.setVisible(true);
            amount14.setVisible(true);

            item14Amount = LoginController.cFrost.getProductPrice() * LoginController.cFrost.getProductQuantity();

        }
        if (LoginController.churros.getProductStatus()) {
            product15.setText(LoginController.churros.getProductName());
            qty15.setText(Double.toString(LoginController.churros.getProductQuantity()));
            price15.setText(Double.toString(LoginController.churros.getProductPrice()));
            amount15.setText(Double
                    .toString(LoginController.churros.getProductPrice() * LoginController.churros.getProductQuantity()));

            product15.setVisible(true);
            qty15.setVisible(true);
            price15.setVisible(true);
            amount15.setVisible(true);

            item15Amount = LoginController.churros.getProductPrice() * LoginController.churros.getProductQuantity();

        }
        if (LoginController.cTwist.getProductStatus()) {
            product16.setText(LoginController.cTwist.getProductName());
            qty16.setText(Double.toString(LoginController.cTwist.getProductQuantity()));
            price16.setText(Double.toString(LoginController.cTwist.getProductPrice()));
            amount16.setText(Double
                    .toString(LoginController.cTwist.getProductPrice() * LoginController.cTwist.getProductQuantity()));

            product16.setVisible(true);
            qty16.setVisible(true);
            price16.setVisible(true);
            amount16.setVisible(true);

            item16Amount = LoginController.cTwist.getProductPrice() * LoginController.cTwist.getProductQuantity();

        }
        if (LoginController.gDonuts.getProductStatus()) {
            product17.setText(LoginController.gDonuts.getProductName());
            qty17.setText(Double.toString(LoginController.gDonuts.getProductQuantity()));
            price17.setText(Double.toString(LoginController.gDonuts.getProductPrice()));
            amount17.setText(Double
                    .toString(LoginController.gDonuts.getProductPrice() * LoginController.gDonuts.getProductQuantity()));

            product17.setVisible(true);
            qty17.setVisible(true);
            price17.setVisible(true);
            amount17.setVisible(true);

            item17Amount = LoginController.gDonuts.getProductPrice() * LoginController.gDonuts.getProductQuantity();

        }
        if (LoginController.pbDonut.getProductStatus()) {
            product18.setText(LoginController.pbDonut.getProductName());
            qty18.setText(Double.toString(LoginController.pbDonut.getProductQuantity()));
            price18.setText(Double.toString(LoginController.pbDonut.getProductPrice()));
            amount18.setText(Double
                    .toString(LoginController.pbDonut.getProductPrice() * LoginController.pbDonut.getProductQuantity()));

            product18.setVisible(true);
            qty18.setVisible(true);
            price18.setVisible(true);
            amount18.setVisible(true);

            item18Amount = LoginController.pbDonut.getProductPrice() * LoginController.pbDonut.getProductQuantity();

        }
        //PASTRY
         if (LoginController.bibingka.getProductStatus()) {
            product19.setText(LoginController.bibingka.getProductName());
            qty19.setText(Double.toString(LoginController.bibingka.getProductQuantity()));
            price19.setText(Double.toString(LoginController.bibingka.getProductPrice()));
            amount19.setText(Double
                    .toString(LoginController.bibingka.getProductPrice() * LoginController.bibingka.getProductQuantity()));

            product19.setVisible(true);
            qty19.setVisible(true);
            price19.setVisible(true);
            amount19.setVisible(true);

            item19Amount = LoginController.bibingka.getProductPrice() * LoginController.bibingka.getProductQuantity();

        }
         if (LoginController.cRoll.getProductStatus()) {
            product20.setText(LoginController.cRoll.getProductName());
            qty20.setText(Double.toString(LoginController.cRoll.getProductQuantity()));
            price20.setText(Double.toString(LoginController.cRoll.getProductPrice()));
            amount20.setText(Double
                    .toString(LoginController.cRoll.getProductPrice() * LoginController.cRoll.getProductQuantity()));

            product20.setVisible(true);
            qty20.setVisible(true);
            price20.setVisible(true);
            amount20.setVisible(true);

            item20Amount = LoginController.cRoll.getProductPrice() * LoginController.cRoll.getProductQuantity();

        }
         if (LoginController.croissant.getProductStatus()) {
            product21.setText(LoginController.croissant.getProductName());
            qty21.setText(Double.toString(LoginController.croissant.getProductQuantity()));
            price21.setText(Double.toString(LoginController.croissant.getProductPrice()));
            amount21.setText(Double
                    .toString(LoginController.croissant.getProductPrice() * LoginController.croissant.getProductQuantity()));

            product21.setVisible(true);
            qty21.setVisible(true);
            price21.setVisible(true);
            amount21.setVisible(true);

            item21Amount = LoginController.croissant.getProductPrice() * LoginController.croissant.getProductQuantity();

        }
         if (LoginController.eggTart.getProductStatus()) {
            product22.setText(LoginController.eggTart.getProductName());
            qty22.setText(Double.toString(LoginController.eggTart.getProductQuantity()));
            price22.setText(Double.toString(LoginController.eggTart.getProductPrice()));
            amount22.setText(Double
                    .toString(LoginController.eggTart.getProductPrice() * LoginController.eggTart.getProductQuantity()));

            product22.setVisible(true);
            qty22.setVisible(true);
            price22.setVisible(true);
            amount22.setVisible(true);

            item22Amount = LoginController.eggTart.getProductPrice() * LoginController.eggTart.getProductQuantity();

        }
         if (LoginController.empanada.getProductStatus()) {
            product23.setText(LoginController.empanada.getProductName());
            qty23.setText(Double.toString(LoginController.empanada.getProductQuantity()));
            price23.setText(Double.toString(LoginController.empanada.getProductPrice()));
            amount23.setText(Double
                    .toString(LoginController.empanada.getProductPrice() * LoginController.empanada.getProductQuantity()));

            product23.setVisible(true);
            qty23.setVisible(true);
            price23.setVisible(true);
            amount23.setVisible(true);

            item23Amount = LoginController.empanada.getProductPrice() * LoginController.empanada.getProductQuantity();

        }
         if (LoginController.pandesal.getProductStatus()) {
            product24.setText(LoginController.pandesal.getProductName());
            qty24.setText(Double.toString(LoginController.pandesal.getProductQuantity()));
            price24.setText(Double.toString(LoginController.pandesal.getProductPrice()));
            amount24.setText(Double
                    .toString(LoginController.pandesal.getProductPrice() * LoginController.pandesal.getProductQuantity()));

            product24.setVisible(true);
            qty24.setVisible(true);
            price24.setVisible(true);
            amount24.setVisible(true);

            item24Amount = LoginController.pandesal.getProductPrice() * LoginController.pandesal.getProductQuantity();

        }

        //TOOL
         if (LoginController.bPans.getProductStatus()) {
            product25.setText(LoginController.bPans.getProductName());
            qty25.setText(Double.toString(LoginController.bPans.getProductQuantity()));
            price25.setText(Double.toString(LoginController.bPans.getProductPrice()));
            amount25.setText(Double
                    .toString(LoginController.bPans.getProductPrice() * LoginController.bPans.getProductQuantity()));

            product25.setVisible(true);
            qty25.setVisible(true);
            price25.setVisible(true);
            amount25.setVisible(true);

            item25Amount = LoginController.bPans.getProductPrice() * LoginController.bPans.getProductQuantity();

        }

         if (LoginController.mCup.getProductStatus()) {
            product26.setText(LoginController.mCup.getProductName());
            qty26.setText(Double.toString(LoginController.mCup.getProductQuantity()));
            price26.setText(Double.toString(LoginController.mCup.getProductPrice()));
            amount26.setText(Double
                    .toString(LoginController.mCup.getProductPrice() * LoginController.mCup.getProductQuantity()));

            product26.setVisible(true);
            qty26.setVisible(true);
            price26.setVisible(true);
            amount26.setVisible(true);

            item26Amount = LoginController.mCup.getProductPrice() * LoginController.mCup.getProductQuantity();

        }


         if (LoginController.mBowl.getProductStatus()) {
            product27.setText(LoginController.mBowl.getProductName());
            qty27.setText(Double.toString(LoginController.mBowl.getProductQuantity()));
            price27.setText(Double.toString(LoginController.mBowl.getProductPrice()));
            amount27.setText(Double
                    .toString(LoginController.mBowl.getProductPrice() * LoginController.mBowl.getProductQuantity()));

            product27.setVisible(true);
            qty27.setVisible(true);
            price27.setVisible(true);
            amount27.setVisible(true);

            item27Amount = LoginController.mBowl.getProductPrice() * LoginController.mBowl.getProductQuantity();

        }

         if (LoginController.pBag.getProductStatus()) {
            product28.setText(LoginController.pBag.getProductName());
            qty28.setText(Double.toString(LoginController.pBag.getProductQuantity()));
            price28.setText(Double.toString(LoginController.pBag.getProductPrice()));
            amount28.setText(Double
                    .toString(LoginController.pBag.getProductPrice() * LoginController.pBag.getProductQuantity()));

            product28.setVisible(true);
            qty28.setVisible(true);
            price28.setVisible(true);
            amount28.setVisible(true);

            item41Amount = LoginController.pBag.getProductPrice() * LoginController.pBag.getProductQuantity();

        }

        //EQUIPMENT


        if (LoginController.fProcessor.getProductStatus()) {
            product29.setText(LoginController.fProcessor.getProductName());
            qty29.setText(Double.toString(LoginController.fProcessor.getProductQuantity()));
            price29.setText(Double.toString(LoginController.fProcessor.getProductPrice()));
            amount29.setText(Double
                    .toString(LoginController.fProcessor.getProductPrice() * LoginController.fProcessor.getProductQuantity()));

            product29.setVisible(true);
            qty29.setVisible(true);
            price29.setVisible(true);
            amount29.setVisible(true);

            item29Amount = LoginController.fProcessor.getProductPrice() * LoginController.fProcessor.getProductQuantity();

        }

        if (LoginController.hMixer.getProductStatus()) {
            product30.setText(LoginController.hMixer.getProductName());
            qty30.setText(Double.toString(LoginController.hMixer.getProductQuantity()));
            price30.setText(Double.toString(LoginController.hMixer.getProductPrice()));
            amount30.setText(Double
                    .toString(LoginController.hMixer.getProductPrice() * LoginController.hMixer.getProductQuantity()));

            product30.setVisible(true);
            qty30.setVisible(true);
            price30.setVisible(true);
            amount30.setVisible(true);

            item44Amount = LoginController.hMixer.getProductPrice() * LoginController.hMixer.getProductQuantity();

        }

        if (LoginController.mOven.getProductStatus()) {
            product31.setText(LoginController.mOven.getProductName());
            qty31.setText(Double.toString(LoginController.mOven.getProductQuantity()));
            price31.setText(Double.toString(LoginController.mOven.getProductPrice()));
            amount31.setText(Double
                    .toString(LoginController.mOven.getProductPrice() * LoginController.mOven.getProductQuantity()));

            product31.setVisible(true);
            qty31.setVisible(true);
            price31.setVisible(true);
            amount31.setVisible(true);

            item31Amount = LoginController.mOven.getProductPrice() * LoginController.mOven.getProductQuantity();

        }

        if (LoginController.sMixer.getProductStatus()) {
            product32.setText(LoginController.sMixer.getProductName());
            qty32.setText(Double.toString(LoginController.sMixer.getProductQuantity()));
            price32.setText(Double.toString(LoginController.sMixer.getProductPrice()));
            amount32.setText(Double
                    .toString(LoginController.sMixer.getProductPrice() * LoginController.sMixer.getProductQuantity()));

            product32.setVisible(true);
            qty32.setVisible(true);
            price32.setVisible(true);
            amount32.setVisible(true);

            item32Amount = LoginController.sMixer.getProductPrice() * LoginController.sMixer.getProductQuantity();

        }
        

        double final_amount = item1Amount + item2Amount + item3Amount + item4Amount + item5Amount +item6Amount +item7Amount +item8Amount +item9Amount +item10Amount
        + item11Amount +item12Amount +item13Amount +item14Amount +item15Amount +item16Amount+ item17Amount +item18Amount +item19Amount + item20Amount + item21Amount
        + item22Amount +item23Amount +item24Amount +item25Amount +item26Amount +item27Amount +item28Amount + item29Amount +item30Amount + item31Amount +item32Amount;

        total.setText(Double.toString(final_amount));

    }

      // Goes to Home.fxml
   public void gotohome(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Home.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void exit (ActionEvent event )  { 
        javafx.application.Platform.exit();
    }
}
