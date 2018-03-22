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
import android.util.Log
import android.view.View
import android.widget.CheckBox
import android.widget.TextView

/**
 * This app displays an order form to order coffee.
 */
class MainActivity : AppCompatActivity() {

    var quantity = 2;
    var price = 5;

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

    private fun displayMessage(text: String) {
        val priceTextView = findViewById<View>(R.id.order_summary_text_view) as TextView;
        priceTextView.text = text
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
     * This method is called when the order button is clicked}.
     */
    fun submitOrder(view: View) {
        val total_price = calculatePrice()
        val checkBox = findViewById<CheckBox>(R.id.whipped_cream)
        val hasWhippedCream = checkBox.isChecked
        val chocoBox = findViewById<CheckBox>(R.id.chocolate_checkbox)
        val hasChocolate = chocoBox.isChecked


//        Log.v("Is checkbox clicked?", hasWhippedCream.toString())

        val str_msg = createOrderSummary(total_price, hasWhippedCream, hasChocolate)
        displayMessage(str_msg)
    }

    fun createOrderSummary(total_price: Int, hasCream: Boolean, hasChocolate: Boolean): String {

        var msg = "Name Kaptain Kunai\n"
        msg += "Add whipped cream? %s\n".format(if (hasCream == true) "True" else "False")
        msg += "Add chocolate? %s\n".format(if (hasChocolate == true) "True" else "False")
        msg += "Quantity: %d\nTotal: $%d\nThank You!".format(quantity, total_price)
        return msg
    }

    //Need to figure out a way for functions to take input onClick, as writing two separate yet similiar functions is meh
    fun incr(view: View) {
        quantity += 1;
        display(quantity)
    }

    fun decr(view: View) {
        if (quantity > 0)
            quantity -= 1;
        display(quantity)
    }
}
