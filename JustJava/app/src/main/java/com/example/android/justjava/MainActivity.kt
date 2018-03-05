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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * This method is called when the order button is clicked.
     */
    fun submitOrder(view: View) {
        display(quantity);
        displayPrice(quantity* 5);
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
