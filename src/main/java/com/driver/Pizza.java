package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isCheeseAdded=false;
    private boolean isExtraToppingAdded=false;
    private boolean isBillCharged=false;
    private boolean isTakeAway=false;

    private int extraToppingPrice;
    private int extraCheesePrice;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price+=300;
            this.extraCheesePrice=80;
            this.extraToppingPrice=70;
        }
        else{
            this.price+=400;
            this.extraCheesePrice=80;
            this.extraToppingPrice=120;
        }

        this.bill="Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded==false){
            this.price+=80;
            isCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isExtraToppingAdded==false){

            if(isVeg){
                this.price+=70;
            }
            else{
                this.price+=120;
            }
            isExtraToppingAdded=true;
        }
    }

    public void addTakeaway() {
        // your code goes here
        if (isTakeAway == false) {
            this.price += 20;
            isTakeAway=true;
        }
    }

    public String getBill() {
        // your code goes here
        if (isBillCharged == false) {

//            if (isVeg) {
//                this.bill += "Base Price Of The Pizza: 300\n";
//            }
//            else {
//                this.bill +="Base Price Of The Pizza: 400\n";
//            }

            if(isCheeseAdded){
                this.bill+="Extra Cheese Added: "+this.extraCheesePrice+"\n";
            }
            if(isExtraToppingAdded){
                if(isVeg){
                    this.bill+="Extra Toppings Added: "+this.extraToppingPrice+"\n";
                }
                else{
                    this.bill+="Extra Toppings Added: "+this.extraToppingPrice+"\n";
                }
            }

            if(isTakeAway){
                this.bill+="Paperbag Added: 20\n";
            }

            this.bill+="Total Price: "+this.price+"\n";
            isBillCharged=true;

        }
        return this.bill;
    }
}
