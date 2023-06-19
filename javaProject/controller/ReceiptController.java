package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

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
    qty18, qty19, qty20, qty21, qty22, qty23, qty24, qty25, qty26, qty27, qty28, qty29, qty30, qty31, qty32, qty33, 
    qty34, qty35, qty36, qty37, qty38, qty39, qty40, qty41, qty42, qty43, qty44, qty45, qty46, qty47, qty48, product1,
    product2, product3, product4, product5, product6, product7, product8, product9, product10, product11, product12,
    product13, product14, product15, product16, product17, product18, product19, product20, product21, product22, 
    product23, product24, product25, product26, product27, product28, product29,product30, product31, product32, 
    product33, product34, product35, product36, product37, product38, product39,product40, product41, product42,
    product43, product44, product45, product46, product47, product48, price1,price2, price3, price4, price5,  
    price6, price7, price8, price9, price10, price11, price12, price13, price14, price15, price16, price17, price18, 
    price19, price20, price21, price22, price23, price24, price25, price26, price27, price28, price29, price30, price31,
    price32, price33, price34, price35, price36, price37, price38, price39, price40, price41, price42, price43, price44,
    price45, price46, price47, price48, amount1,amount2, amount3, amount4, amount5, amount6, amount7, amount8, amount9,
    amount10,amount11, amount12, amount13, amount14, amount15, amount16, amount17, amount18, amount19, amount20, amount21, 
    amount22, amount, amount23, amount24, amount25, amount26, amount27, amount28, amount29, amount30, amount31, 
    amount32, amount33, amount34, amount35, amount36, amount37, amount38, amount39, amount40, amount41, amount42,
    amount43, amount44, amount45, amount46, amount47, amount48, total;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //HOME
        if (LoginController.cheese.getProductStatus()) {
            product1.setText(LoginController.cheese.getProductName());
            qty1.setText(Double.toString(LoginController.cheese.getProductQuantity()));
            price1.setText(Double.toString(LoginController.cheese.getProductPrice()));
            amount1.setText(Double
                    .toString(LoginController.cheese.getProductPrice() * LoginController.cheese.getProductQuantity()));

            product1.setVisible(true);
            qty1.setVisible(true);
            price1.setVisible(true);
            amount1.setVisible(true);

            item1Amount = LoginController.cheese.getProductPrice() * LoginController.cheese.getProductQuantity();

        }

        if (LoginController.chocoChip.getProductStatus()) {
            product2.setText(LoginController.chocoChip.getProductName());
            qty2.setText(Double.toString(LoginController.chocoChip.getProductQuantity()));
            price2.setText(Double.toString(LoginController.chocoChip.getProductPrice()));
            amount2.setText(Double
                    .toString(LoginController.chocoChip.getProductPrice() * LoginController.chocoChip.getProductQuantity()));

            product2.setVisible(true);
            qty2.setVisible(true);
            price2.setVisible(true);
            amount2.setVisible(true);

            item2Amount = LoginController.chocoChip.getProductPrice() * LoginController.chocoChip.getProductQuantity();
        }

        if (LoginController.churros.getProductStatus()) {
            product3.setText(LoginController.churros.getProductName());
            qty3.setText(Double.toString(LoginController.churros.getProductQuantity()));
            price3.setText(Double.toString(LoginController.churros.getProductPrice()));
            amount3.setText(Double
                    .toString(LoginController.churros.getProductPrice() * LoginController.churros.getProductQuantity()));

            product3.setVisible(true);
            qty3.setVisible(true);
            price3.setVisible(true);
            amount3.setVisible(true);

            item3Amount = LoginController.churros.getProductPrice() * LoginController.churros.getProductQuantity();

        }

        if (LoginController.cRoll.getProductStatus()) {
            product4.setText(LoginController.cRoll.getProductName());
            qty4.setText(Double.toString(LoginController.cRoll.getProductQuantity()));
            price4.setText(Double.toString(LoginController.cRoll.getProductPrice()));
            amount4.setText(Double
                    .toString(LoginController.cRoll.getProductPrice() * LoginController.cRoll.getProductQuantity()));

            product4.setVisible(true);
            qty4.setVisible(true);
            price4.setVisible(true);
            amount4.setVisible(true);

            item4Amount = LoginController.cRoll.getProductPrice() * LoginController.cRoll.getProductQuantity();

        }

         if (LoginController.smores.getProductStatus()) {
            product5.setText(LoginController.smores.getProductName());
            qty5.setText(Double.toString(LoginController.smores.getProductQuantity()));
            price5.setText(Double.toString(LoginController.smores.getProductPrice()));
            amount5.setText(Double
                    .toString(LoginController.smores.getProductPrice() * LoginController.smores.getProductQuantity()));

            product5.setVisible(true);
            qty5.setVisible(true);
            price5.setVisible(true);
            amount5.setVisible(true);

            item5Amount = LoginController.smores.getProductPrice() * LoginController.smores.getProductQuantity();

        }

         if (LoginController.bavarian.getProductStatus()) {
            product6.setText(LoginController.bavarian.getProductName());
            qty6.setText(Double.toString(LoginController.bavarian.getProductQuantity()));
            price6.setText(Double.toString(LoginController.bavarian.getProductPrice()));
            amount6.setText(Double
                    .toString(LoginController.bavarian.getProductPrice() * LoginController.bavarian.getProductQuantity()));

            product6.setVisible(true);
            qty6.setVisible(true);
            price6.setVisible(true);
            amount6.setVisible(true);

            item6Amount = LoginController.bavarian.getProductPrice() * LoginController.bavarian.getProductQuantity();

        }

         if (LoginController.bPans.getProductStatus()) {
            product7.setText(LoginController.bPans.getProductName());
            qty7.setText(Double.toString(LoginController.bPans.getProductQuantity()));
            price7.setText(Double.toString(LoginController.bPans.getProductPrice()));
            amount7.setText(Double
                    .toString(LoginController.bPans.getProductPrice() * LoginController.bPans.getProductQuantity()));

            product7.setVisible(true);
            qty7.setVisible(true);
            price7.setVisible(true);
            amount7.setVisible(true);

            item7Amount = LoginController.bPans.getProductPrice() * LoginController.bPans.getProductQuantity();

        }

         if (LoginController.mBowl.getProductStatus()) {
            product8.setText(LoginController.mBowl.getProductName());
            qty8.setText(Double.toString(LoginController.mBowl.getProductQuantity()));
            price8.setText(Double.toString(LoginController.mBowl.getProductPrice()));
            amount8.setText(Double
                    .toString(LoginController.mBowl.getProductPrice() * LoginController.mBowl.getProductQuantity()));

            product8.setVisible(true);
            qty8.setVisible(true);
            price8.setVisible(true);
            amount8.setVisible(true);

            item8Amount = LoginController.mBowl.getProductPrice() * LoginController.mBowl.getProductQuantity();

        }

         if (LoginController.pBag.getProductStatus()) {
            product9.setText(LoginController.pBag.getProductName());
            qty9.setText(Double.toString(LoginController.pBag.getProductQuantity()));
            price9.setText(Double.toString(LoginController.pBag.getProductPrice()));
            amount9.setText(Double
                    .toString(LoginController.pBag.getProductPrice() * LoginController.pBag.getProductQuantity()));

            product9.setVisible(true);
            qty9.setVisible(true);
            price9.setVisible(true);
            amount9.setVisible(true);

            item9Amount = LoginController.pBag.getProductPrice() * LoginController.pBag.getProductQuantity();

        }

         if (LoginController.cStand.getProductStatus()) {
            product10.setText(LoginController.cStand.getProductName());
            qty10.setText(Double.toString(LoginController.cStand.getProductQuantity()));
            price10.setText(Double.toString(LoginController.cStand.getProductPrice()));
            amount10.setText(Double
                    .toString(LoginController.cStand.getProductPrice() * LoginController.cStand.getProductQuantity()));

            product10.setVisible(true);
            qty10.setVisible(true);
            price10.setVisible(true);
            amount10.setVisible(true);

            item10Amount = LoginController.cStand.getProductPrice() * LoginController.cStand.getProductQuantity();

        }

         if (LoginController.mOven.getProductStatus()) {
            product11.setText(LoginController.mOven.getProductName());
            qty11.setText(Double.toString(LoginController.mOven.getProductQuantity()));
            price11.setText(Double.toString(LoginController.mOven.getProductPrice()));
            amount11.setText(Double
                    .toString(LoginController.mOven.getProductPrice() * LoginController.mOven.getProductQuantity()));

            product11.setVisible(true);
            qty11.setVisible(true);
            price11.setVisible(true);
            amount11.setVisible(true);

            item11Amount = LoginController.mOven.getProductPrice() * LoginController.mOven.getProductQuantity();

        }

         if (LoginController.sMixer.getProductStatus()) {
            product12.setText(LoginController.sMixer.getProductName());
            qty12.setText(Double.toString(LoginController.sMixer.getProductQuantity()));
            price12.setText(Double.toString(LoginController.sMixer.getProductPrice()));
            amount12.setText(Double
                    .toString(LoginController.sMixer.getProductPrice() * LoginController.sMixer.getProductQuantity()));

            product12.setVisible(true);
            qty12.setVisible(true);
            price12.setVisible(true);
            amount12.setVisible(true);

            item12Amount = LoginController.sMixer.getProductPrice() * LoginController.sMixer.getProductQuantity();
         }

            //CAKE 
        if (LoginController.cheese.getProductStatus()) {
            product13.setText(LoginController.cheese.getProductName());
            qty13.setText(Double.toString(LoginController.cheese.getProductQuantity()));
            price13.setText(Double.toString(LoginController.cheese.getProductPrice()));
            amount13.setText(Double
                    .toString(LoginController.cheese.getProductPrice() * LoginController.cheese.getProductQuantity()));

            product13.setVisible(true);
            qty13.setVisible(true);
            price13.setVisible(true);
            amount13.setVisible(true);

            item13Amount = LoginController.cheese.getProductPrice() * LoginController.cheese.getProductQuantity();

        }

         if (LoginController.bForest.getProductStatus()) {
            product14.setText(LoginController.bForest.getProductName());
            qty14.setText(Double.toString(LoginController.bForest.getProductQuantity()));
            price14.setText(Double.toString(LoginController.bForest.getProductPrice()));
            amount14.setText(Double
                    .toString(LoginController.bForest.getProductPrice() * LoginController.bForest.getProductQuantity()));

            product14.setVisible(true);
            qty14.setVisible(true);
            price14.setVisible(true);
            amount14.setVisible(true);

            item14Amount = LoginController.bForest.getProductPrice() * LoginController.bForest.getProductQuantity();

        }

         if (LoginController.chocoCC.getProductStatus()) {
            product15.setText(LoginController.chocoCC.getProductName());
            qty15.setText(Double.toString(LoginController.chocoCC.getProductQuantity()));
            price15.setText(Double.toString(LoginController.chocoCC.getProductPrice()));
            amount15.setText(Double
                    .toString(LoginController.chocoCC.getProductPrice() * LoginController.chocoCC.getProductQuantity()));

            product15.setVisible(true);
            qty15.setVisible(true);
            price15.setVisible(true);
            amount15.setVisible(true);

            item15Amount = LoginController.chocoCC.getProductPrice() * LoginController.chocoCC.getProductQuantity();

        }

         if (LoginController.cCake.getProductStatus()) {
            product16.setText(LoginController.cCake.getProductName());
            qty16.setText(Double.toString(LoginController.cCake.getProductQuantity()));
            price16.setText(Double.toString(LoginController.cCake.getProductPrice()));
            amount16.setText(Double
                    .toString(LoginController.cCake.getProductPrice() * LoginController.cCake.getProductQuantity()));

            product16.setVisible(true);
            qty16.setVisible(true);
            price16.setVisible(true);
            amount16.setVisible(true);

            item16Amount = LoginController.cCake.getProductPrice() * LoginController.cCake.getProductQuantity();

        }

         if (LoginController.redCC.getProductStatus()) {
            product17.setText(LoginController.redCC.getProductName());
            qty17.setText(Double.toString(LoginController.redCC.getProductQuantity()));
            price17.setText(Double.toString(LoginController.redCC.getProductPrice()));
            amount17.setText(Double
                    .toString(LoginController.redCC.getProductPrice() * LoginController.redCC.getProductQuantity()));

            product17.setVisible(true);
            qty17.setVisible(true);
            price17.setVisible(true);
            amount17.setVisible(true);

            item17Amount = LoginController.redCC.getProductPrice() * LoginController.redCC.getProductQuantity();

        }

         if (LoginController.tiramisu.getProductStatus()) {
            product18.setText(LoginController.tiramisu.getProductName());
            qty18.setText(Double.toString(LoginController.tiramisu.getProductQuantity()));
            price18.setText(Double.toString(LoginController.tiramisu.getProductPrice()));
            amount18.setText(Double
                    .toString(LoginController.tiramisu.getProductPrice() * LoginController.tiramisu.getProductQuantity()));

            product18.setVisible(true);
            qty18.setVisible(true);
            price18.setVisible(true);
            amount18.setVisible(true);

            item18Amount = LoginController.tiramisu.getProductPrice() * LoginController.tiramisu.getProductQuantity();

        }

        //COOKIES
         if (LoginController.chocoChip.getProductStatus()) {
            product19.setText(LoginController.chocoChip.getProductName());
            qty19.setText(Double.toString(LoginController.chocoChip.getProductQuantity()));
            price19.setText(Double.toString(LoginController.chocoChip.getProductPrice()));
            amount19.setText(Double
                    .toString(LoginController.chocoChip.getProductPrice() * LoginController.chocoChip.getProductQuantity()));

            product19.setVisible(true);
            qty19.setVisible(true);
            price19.setVisible(true);
            amount19.setVisible(true);

            item19Amount = LoginController.chocoChip.getProductPrice() * LoginController.chocoChip.getProductQuantity();

        }

        
         if (LoginController.cBrulee.getProductStatus()) {
            product20.setText(LoginController.cBrulee.getProductName());
            qty20.setText(Double.toString(LoginController.cBrulee.getProductQuantity()));
            price20.setText(Double.toString(LoginController.cBrulee.getProductPrice()));
            amount20.setText(Double
                    .toString(LoginController.cBrulee.getProductPrice() * LoginController.cBrulee.getProductQuantity()));

            product20.setVisible(true);
            qty20.setVisible(true);
            price20.setVisible(true);
            amount20.setVisible(true);

            item20Amount = LoginController.cBrulee.getProductPrice() * LoginController.cBrulee.getProductQuantity();

        }

        
         if (LoginController.fCookie.getProductStatus()) {
            product21.setText(LoginController.fCookie.getProductName());
            qty21.setText(Double.toString(LoginController.fCookie.getProductQuantity()));
            price21.setText(Double.toString(LoginController.fCookie.getProductPrice()));
            amount21.setText(Double
                    .toString(LoginController.fCookie.getProductPrice() * LoginController.fCookie.getProductQuantity()));

            product21.setVisible(true);
            qty21.setVisible(true);
            price21.setVisible(true);
            amount21.setVisible(true);

            item21Amount = LoginController.fCookie.getProductPrice() * LoginController.fCookie.getProductQuantity();

        }

        
         if (LoginController.oatmeal.getProductStatus()) {
            product22.setText(LoginController.oatmeal.getProductName());
            qty22.setText(Double.toString(LoginController.oatmeal.getProductQuantity()));
            price22.setText(Double.toString(LoginController.oatmeal.getProductPrice()));
            amount22.setText(Double
                    .toString(LoginController.oatmeal.getProductPrice() * LoginController.oatmeal.getProductQuantity()));

            product22.setVisible(true);
            qty22.setVisible(true);
            price22.setVisible(true);
            amount22.setVisible(true);

            item22Amount = LoginController.oatmeal.getProductPrice() * LoginController.oatmeal.getProductQuantity();

        }

        
         if (LoginController.pbCookie.getProductStatus()) {
            product23.setText(LoginController.pbCookie.getProductName());
            qty23.setText(Double.toString(LoginController.pbCookie.getProductQuantity()));
            price23.setText(Double.toString(LoginController.pbCookie.getProductPrice()));
            amount23.setText(Double
                    .toString(LoginController.pbCookie.getProductPrice() * LoginController.pbCookie.getProductQuantity()));

            product23.setVisible(true);
            qty23.setVisible(true);
            price23.setVisible(true);
            amount23.setVisible(true);

            item23Amount = LoginController.pbCookie.getProductPrice() * LoginController.pbCookie.getProductQuantity();

        }

        
         if (LoginController.smores.getProductStatus()) {
            product24.setText(LoginController.smores.getProductName());
            qty24.setText(Double.toString(LoginController.smores.getProductQuantity()));
            price24.setText(Double.toString(LoginController.smores.getProductPrice()));
            amount24.setText(Double
                    .toString(LoginController.smores.getProductPrice() * LoginController.smores.getProductQuantity()));

            product24.setVisible(true);
            qty24.setVisible(true);
            price24.setVisible(true);
            amount24.setVisible(true);

            item24Amount = LoginController.smores.getProductPrice() * LoginController.smores.getProductQuantity();

        }

        //DONUTS
        if (LoginController.bavarian.getProductStatus()) {
            product25.setText(LoginController.bavarian.getProductName());
            qty25.setText(Double.toString(LoginController.bavarian.getProductQuantity()));
            price25.setText(Double.toString(LoginController.bavarian.getProductPrice()));
            amount25.setText(Double
                    .toString(LoginController.bavarian.getProductPrice() * LoginController.bavarian.getProductQuantity()));

            product25.setVisible(true);
            qty25.setVisible(true);
            price25.setVisible(true);
            amount25.setVisible(true);

            item25Amount = LoginController.bavarian.getProductPrice() * LoginController.bavarian.getProductQuantity();

        }
        if (LoginController.cFrost.getProductStatus()) {
            product26.setText(LoginController.cFrost.getProductName());
            qty26.setText(Double.toString(LoginController.cFrost.getProductQuantity()));
            price26.setText(Double.toString(LoginController.cFrost.getProductPrice()));
            amount26.setText(Double
                    .toString(LoginController.cFrost.getProductPrice() * LoginController.cFrost.getProductQuantity()));

            product26.setVisible(true);
            qty26.setVisible(true);
            price26.setVisible(true);
            amount26.setVisible(true);

            item26Amount = LoginController.cFrost.getProductPrice() * LoginController.cFrost.getProductQuantity();

        }
        if (LoginController.churros.getProductStatus()) {
            product27.setText(LoginController.churros.getProductName());
            qty27.setText(Double.toString(LoginController.churros.getProductQuantity()));
            price27.setText(Double.toString(LoginController.churros.getProductPrice()));
            amount27.setText(Double
                    .toString(LoginController.churros.getProductPrice() * LoginController.churros.getProductQuantity()));

            product27.setVisible(true);
            qty27.setVisible(true);
            price27.setVisible(true);
            amount27.setVisible(true);

            item27Amount = LoginController.churros.getProductPrice() * LoginController.churros.getProductQuantity();

        }
        if (LoginController.cTwist.getProductStatus()) {
            product28.setText(LoginController.cTwist.getProductName());
            qty28.setText(Double.toString(LoginController.cTwist.getProductQuantity()));
            price28.setText(Double.toString(LoginController.cTwist.getProductPrice()));
            amount28.setText(Double
                    .toString(LoginController.cTwist.getProductPrice() * LoginController.cTwist.getProductQuantity()));

            product28.setVisible(true);
            qty28.setVisible(true);
            price28.setVisible(true);
            amount28.setVisible(true);

            item28Amount = LoginController.cTwist.getProductPrice() * LoginController.cTwist.getProductQuantity();

        }
        if (LoginController.gDonuts.getProductStatus()) {
            product29.setText(LoginController.gDonuts.getProductName());
            qty29.setText(Double.toString(LoginController.gDonuts.getProductQuantity()));
            price29.setText(Double.toString(LoginController.gDonuts.getProductPrice()));
            amount29.setText(Double
                    .toString(LoginController.gDonuts.getProductPrice() * LoginController.gDonuts.getProductQuantity()));

            product29.setVisible(true);
            qty29.setVisible(true);
            price29.setVisible(true);
            amount29.setVisible(true);

            item29Amount = LoginController.gDonuts.getProductPrice() * LoginController.gDonuts.getProductQuantity();

        }
        if (LoginController.pbDonut.getProductStatus()) {
            product30.setText(LoginController.pbDonut.getProductName());
            qty30.setText(Double.toString(LoginController.pbDonut.getProductQuantity()));
            price30.setText(Double.toString(LoginController.pbDonut.getProductPrice()));
            amount30.setText(Double
                    .toString(LoginController.pbDonut.getProductPrice() * LoginController.pbDonut.getProductQuantity()));

            product30.setVisible(true);
            qty30.setVisible(true);
            price30.setVisible(true);
            amount30.setVisible(true);

            item30Amount = LoginController.pbDonut.getProductPrice() * LoginController.pbDonut.getProductQuantity();

        }
        //PASTRY
         if (LoginController.bibingka.getProductStatus()) {
            product31.setText(LoginController.bibingka.getProductName());
            qty31.setText(Double.toString(LoginController.bibingka.getProductQuantity()));
            price31.setText(Double.toString(LoginController.bibingka.getProductPrice()));
            amount31.setText(Double
                    .toString(LoginController.bibingka.getProductPrice() * LoginController.bibingka.getProductQuantity()));

            product31.setVisible(true);
            qty31.setVisible(true);
            price31.setVisible(true);
            amount31.setVisible(true);

            item31Amount = LoginController.bibingka.getProductPrice() * LoginController.bibingka.getProductQuantity();

        }
         if (LoginController.cRoll.getProductStatus()) {
            product32.setText(LoginController.cRoll.getProductName());
            qty32.setText(Double.toString(LoginController.cRoll.getProductQuantity()));
            price32.setText(Double.toString(LoginController.cRoll.getProductPrice()));
            amount32.setText(Double
                    .toString(LoginController.cRoll.getProductPrice() * LoginController.cRoll.getProductQuantity()));

            product32.setVisible(true);
            qty32.setVisible(true);
            price32.setVisible(true);
            amount32.setVisible(true);

            item32Amount = LoginController.cRoll.getProductPrice() * LoginController.cRoll.getProductQuantity();

        }
         if (LoginController.croissant.getProductStatus()) {
            product33.setText(LoginController.croissant.getProductName());
            qty33.setText(Double.toString(LoginController.croissant.getProductQuantity()));
            price33.setText(Double.toString(LoginController.croissant.getProductPrice()));
            amount33.setText(Double
                    .toString(LoginController.croissant.getProductPrice() * LoginController.croissant.getProductQuantity()));

            product33.setVisible(true);
            qty33.setVisible(true);
            price33.setVisible(true);
            amount33.setVisible(true);

            item33Amount = LoginController.croissant.getProductPrice() * LoginController.croissant.getProductQuantity();

        }
         if (LoginController.eggTart.getProductStatus()) {
            product34.setText(LoginController.eggTart.getProductName());
            qty34.setText(Double.toString(LoginController.eggTart.getProductQuantity()));
            price34.setText(Double.toString(LoginController.eggTart.getProductPrice()));
            amount34.setText(Double
                    .toString(LoginController.eggTart.getProductPrice() * LoginController.eggTart.getProductQuantity()));

            product34.setVisible(true);
            qty34.setVisible(true);
            price34.setVisible(true);
            amount34.setVisible(true);

            item34Amount = LoginController.eggTart.getProductPrice() * LoginController.eggTart.getProductQuantity();

        }
         if (LoginController.empanada.getProductStatus()) {
            product35.setText(LoginController.empanada.getProductName());
            qty35.setText(Double.toString(LoginController.empanada.getProductQuantity()));
            price35.setText(Double.toString(LoginController.empanada.getProductPrice()));
            amount35.setText(Double
                    .toString(LoginController.empanada.getProductPrice() * LoginController.empanada.getProductQuantity()));

            product35.setVisible(true);
            qty35.setVisible(true);
            price35.setVisible(true);
            amount35.setVisible(true);

            item35Amount = LoginController.empanada.getProductPrice() * LoginController.empanada.getProductQuantity();

        }
         if (LoginController.pandesal.getProductStatus()) {
            product36.setText(LoginController.pandesal.getProductName());
            qty36.setText(Double.toString(LoginController.pandesal.getProductQuantity()));
            price36.setText(Double.toString(LoginController.pandesal.getProductPrice()));
            amount36.setText(Double
                    .toString(LoginController.pandesal.getProductPrice() * LoginController.pandesal.getProductQuantity()));

            product36.setVisible(true);
            qty36.setVisible(true);
            price36.setVisible(true);
            amount36.setVisible(true);

            item36Amount = LoginController.pandesal.getProductPrice() * LoginController.pandesal.getProductQuantity();

        }

        //TOOL
         if (LoginController.bPans.getProductStatus()) {
            product37.setText(LoginController.bPans.getProductName());
            qty37.setText(Double.toString(LoginController.bPans.getProductQuantity()));
            price37.setText(Double.toString(LoginController.bPans.getProductPrice()));
            amount37.setText(Double
                    .toString(LoginController.bPans.getProductPrice() * LoginController.bPans.getProductQuantity()));

            product37.setVisible(true);
            qty37.setVisible(true);
            price37.setVisible(true);
            amount37.setVisible(true);

            item37Amount = LoginController.bPans.getProductPrice() * LoginController.bPans.getProductQuantity();

        }

         if (LoginController.mCup.getProductStatus()) {
            product38.setText(LoginController.mCup.getProductName());
            qty38.setText(Double.toString(LoginController.mCup.getProductQuantity()));
            price38.setText(Double.toString(LoginController.mCup.getProductPrice()));
            amount38.setText(Double
                    .toString(LoginController.mCup.getProductPrice() * LoginController.mCup.getProductQuantity()));

            product38.setVisible(true);
            qty38.setVisible(true);
            price38.setVisible(true);
            amount38.setVisible(true);

            item38Amount = LoginController.mCup.getProductPrice() * LoginController.mCup.getProductQuantity();

        }

         if (LoginController.mSpoon.getProductStatus()) {
            product39.setText(LoginController.mSpoon.getProductName());
            qty39.setText(Double.toString(LoginController.mSpoon.getProductQuantity()));
            price39.setText(Double.toString(LoginController.mSpoon.getProductPrice()));
            amount39.setText(Double
                    .toString(LoginController.mSpoon.getProductPrice() * LoginController.mSpoon.getProductQuantity()));

            product39.setVisible(true);
            qty39.setVisible(true);
            price39.setVisible(true);
            amount39.setVisible(true);

            item39Amount = LoginController.mSpoon.getProductPrice() * LoginController.mSpoon.getProductQuantity();

        }

         if (LoginController.mBowl.getProductStatus()) {
            product40.setText(LoginController.mBowl.getProductName());
            qty40.setText(Double.toString(LoginController.mBowl.getProductQuantity()));
            price40.setText(Double.toString(LoginController.mBowl.getProductPrice()));
            amount40.setText(Double
                    .toString(LoginController.mBowl.getProductPrice() * LoginController.mBowl.getProductQuantity()));

            product40.setVisible(true);
            qty40.setVisible(true);
            price40.setVisible(true);
            amount40.setVisible(true);

            item40Amount = LoginController.mBowl.getProductPrice() * LoginController.mBowl.getProductQuantity();

        }

         if (LoginController.pBag.getProductStatus()) {
            product41.setText(LoginController.pBag.getProductName());
            qty41.setText(Double.toString(LoginController.pBag.getProductQuantity()));
            price41.setText(Double.toString(LoginController.pBag.getProductPrice()));
            amount41.setText(Double
                    .toString(LoginController.pBag.getProductPrice() * LoginController.pBag.getProductQuantity()));

            product41.setVisible(true);
            qty41.setVisible(true);
            price41.setVisible(true);
            amount41.setVisible(true);

            item41Amount = LoginController.pBag.getProductPrice() * LoginController.pBag.getProductQuantity();

        }

         if (LoginController.sSpatula.getProductStatus()) {
            product42.setText(LoginController.sSpatula.getProductName());
            qty42.setText(Double.toString(LoginController.sSpatula.getProductQuantity()));
            price42.setText(Double.toString(LoginController.sSpatula.getProductPrice()));
            amount42.setText(Double
                    .toString(LoginController.sSpatula.getProductPrice() * LoginController.sSpatula.getProductQuantity()));

            product42.setVisible(true);
            qty42.setVisible(true);
            price42.setVisible(true);
            amount42.setVisible(true);

            item42Amount = LoginController.sSpatula.getProductPrice() * LoginController.sSpatula.getProductQuantity();

        }

        //EQUIPMENT

        if (LoginController.cStand.getProductStatus()) {
            product43.setText(LoginController.cStand.getProductName());
            qty43.setText(Double.toString(LoginController.cStand.getProductQuantity()));
            price43.setText(Double.toString(LoginController.cStand.getProductPrice()));
            amount43.setText(Double
                    .toString(LoginController.cStand.getProductPrice() * LoginController.cStand.getProductQuantity()));

            product43.setVisible(true);
            qty43.setVisible(true);
            price43.setVisible(true);
            amount43.setVisible(true);

            item42Amount = LoginController.cStand.getProductPrice() * LoginController.cStand.getProductQuantity();

        }

        if (LoginController.fProcessor.getProductStatus()) {
            product44.setText(LoginController.fProcessor.getProductName());
            qty44.setText(Double.toString(LoginController.fProcessor.getProductQuantity()));
            price44.setText(Double.toString(LoginController.fProcessor.getProductPrice()));
            amount44.setText(Double
                    .toString(LoginController.fProcessor.getProductPrice() * LoginController.fProcessor.getProductQuantity()));

            product44.setVisible(true);
            qty44.setVisible(true);
            price44.setVisible(true);
            amount44.setVisible(true);

            item43Amount = LoginController.fProcessor.getProductPrice() * LoginController.fProcessor.getProductQuantity();

        }

        if (LoginController.hMixer.getProductStatus()) {
            product45.setText(LoginController.hMixer.getProductName());
            qty45.setText(Double.toString(LoginController.hMixer.getProductQuantity()));
            price45.setText(Double.toString(LoginController.hMixer.getProductPrice()));
            amount45.setText(Double
                    .toString(LoginController.hMixer.getProductPrice() * LoginController.hMixer.getProductQuantity()));

            product45.setVisible(true);
            qty45.setVisible(true);
            price45.setVisible(true);
            amount45.setVisible(true);

            item44Amount = LoginController.hMixer.getProductPrice() * LoginController.hMixer.getProductQuantity();

        }

        if (LoginController.mOven.getProductStatus()) {
            product46.setText(LoginController.mOven.getProductName());
            qty46.setText(Double.toString(LoginController.mOven.getProductQuantity()));
            price46.setText(Double.toString(LoginController.mOven.getProductPrice()));
            amount46.setText(Double
                    .toString(LoginController.mOven.getProductPrice() * LoginController.mOven.getProductQuantity()));

            product46.setVisible(true);
            qty46.setVisible(true);
            price46.setVisible(true);
            amount46.setVisible(true);

            item45Amount = LoginController.mOven.getProductPrice() * LoginController.mOven.getProductQuantity();

        }

        if (LoginController.sMixer.getProductStatus()) {
            product47.setText(LoginController.sMixer.getProductName());
            qty47.setText(Double.toString(LoginController.sMixer.getProductQuantity()));
            price47.setText(Double.toString(LoginController.sMixer.getProductPrice()));
            amount47.setText(Double
                    .toString(LoginController.sMixer.getProductPrice() * LoginController.sMixer.getProductQuantity()));

            product47.setVisible(true);
            qty47.setVisible(true);
            price47.setVisible(true);
            amount47.setVisible(true);

            item46Amount = LoginController.sMixer.getProductPrice() * LoginController.sMixer.getProductQuantity();

        }

        if (LoginController.wScale.getProductStatus()) {
            product48.setText(LoginController.wScale.getProductName());
            qty48.setText(Double.toString(LoginController.wScale.getProductQuantity()));
            price48.setText(Double.toString(LoginController.wScale.getProductPrice()));
            amount48.setText(Double
                    .toString(LoginController.wScale.getProductPrice() * LoginController.wScale.getProductQuantity()));

            product48.setVisible(true);
            qty48.setVisible(true);
            price48.setVisible(true);
            amount48.setVisible(true);

            item47Amount = LoginController.wScale.getProductPrice() * LoginController.wScale.getProductQuantity();

        }
        

        double final_amount = item1Amount + item2Amount + item3Amount + item4Amount + item5Amount +item6Amount +item7Amount +item8Amount +item9Amount +item10Amount
        + item11Amount +item12Amount +item13Amount +item14Amount +item15Amount +item16Amount+ item17Amount +item18Amount +item19Amount + item20Amount + item21Amount
        + item22Amount +item23Amount +item24Amount +item25Amount +item26Amount +item27Amount +item28Amount + item29Amount +item30Amount + item31Amount +item32Amount +item33Amount +
        item34Amount +item35Amount +item36Amount +item37Amount +item38Amount +item39Amount +item40Amount +item41Amount + item42Amount +item43Amount +item44Amount +item45Amount +item46Amount +item47Amount +item48Amount ;
        total.setText(Double.toString(final_amount));

    }
}
