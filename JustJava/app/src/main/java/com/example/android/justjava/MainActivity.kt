/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 */

package com.example.android.justjava


import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import java.text.NumberFormat

/**
 * This app displays an order form to order coffee.
 */
class MainActivity : AppCompatActivity() {

    var quantity = 2;
    var price = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private fun display(number: Int) {
        val quantityTextView = findViewById<View>(R.id.quantity_text_view) as TextView;
        quantityTextView.text = number.toString();
    }

    private fun displayPrice(number: Int){
        val priceTextView = findViewById<View>(R.id.price_text_view) as TextView;
        priceTextView.text = NumberFormat.getCurrencyInstance().format(number);
    }

    private fun calculatePrice(): Int {
        return quantity * price
    }

    private fun calculatePrice(quantity: Int): Int {
        return quantity * price
    }
    private fun calculatePrice(quantity: Int, cost: Int): Int {
        return quantity * cost
    }

    /**
     * This method is called when the order button is clicked.
     */
    fun submitOrder(view: View) {
        display(quantity);
        val total_price = calculatePrice(quantity,price)
        val str_msg ="Total: $%d\nThankYou!".format(total_price)
        displayPrice(total_price)
    }


    //Need to figure out a way for functions to take input onClick, as writing two separate yet similiar functions is meh
    fun incr (view: View){
        val quantityTextView = findViewById<View>(R.id.quantity_text_view) as TextView;
        quantity += 1;
        quantityTextView.text = quantity.toString();
    }

    fun decr (view: View) {
        val quantityTextView = findViewById<View>(R.id.quantity_text_view) as TextView;
        if (quantity >0)
            quantity -= 1;
        quantityTextView.text = quantity.toString();
    };
}
