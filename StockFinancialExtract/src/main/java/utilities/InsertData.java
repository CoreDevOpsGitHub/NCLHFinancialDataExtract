package utilities;


import org.apache.commons.lang3.StringUtils;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class InsertData {

    //Create a method to connect to database
                //name of the method (String (Variable We want to receive), String (Variable we want to receive))


    String StockSymbol = theActorInTheSpotlight().recall("StockSymbol_Tag");
    String OperatingMargin = theActorInTheSpotlight().recall("OperatingMargin");
    String ProfitMargin = theActorInTheSpotlight().recall("ProfitMargin");
    String ReturnOnAssets = theActorInTheSpotlight().recall("ReturnOnAssets");
    String ReturnOnEquity = theActorInTheSpotlight().recall("ReturnOnEquity");
    String StockTicker = theActorInTheSpotlight().recall("StockTicker");


    String FinalStockTicker =  StringUtils.substringBetween(StockTicker, "(", ")");
    String FinalOperatingMargin = OperatingMargin.replace("%","");
    String FinalStockSymbol = StockSymbol;
    String FinalProfitMargin = ProfitMargin.replace("%","");
    String FinalReturnOnAssets = ReturnOnAssets.replace("%","");;
    String FinalReturnOnEquity = ReturnOnEquity.replace("%","");;



    public void InsertDataMethod(){
        try{

            //Connect to Database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mysql","root","Ahk45515!");


            System.out.println("is this wokring");
            System.out.println(FinalOperatingMargin+ FinalProfitMargin+ StockSymbol);

            //Create a sql statement
            Statement query = connect.createStatement();
            String sql1 = "insert into FinancialSchema.YahooExtract (\n" +
                    "  StockSymbol,\n" +
                    "  ProfitMargin,\n" +
                    "    OperatingMargin,\n" +
                    "    ReturnOnAssets,\n" +
                    "    ReturnOnEquity,\n" +
                    "    Inserted_Date) \n" +


                    "values (\n" +
                    "'" + FinalStockTicker + "'"+  ",   \n" +
                    FinalProfitMargin +  ",   \n" +
                    FinalOperatingMargin + ",   \n" +
                    FinalReturnOnAssets + ",   \n" +
                    FinalReturnOnEquity + ",   \n" +

                    "    current_time) \n" + ";" ;

            System.out.println(sql1);

            query.execute(sql1);


        }

        catch (ClassNotFoundException ex){
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE,null,ex);
        }

        catch(SQLException ex){
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE,null,ex);
            ex.printStackTrace();
        }
    }



}
