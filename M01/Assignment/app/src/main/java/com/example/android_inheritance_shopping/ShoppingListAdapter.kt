package com.example.android_inheritance_shopping

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.shopping_item_list.view.*

class ShoppingListAdapter(val shoppingList: MutableList<ShoppingItem>): RecyclerView.Adapter<ShoppingListAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.shopping_item_list, parent, false) as View)
    }

    override fun getItemCount(): Int {
        return shoppingList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = shoppingList[position]
        holder.listTextView.text = item.getDisplayName()
        holder.shoppingItemParent.background = ContextCompat.getDrawable(holder.shoppingItemParent.context, item.colorId)

    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val listTextView: TextView = view.card_text
        val shoppingItemParent: CardView = view.card_parent
    }

}
