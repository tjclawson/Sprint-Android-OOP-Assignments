package com.example.interfaces

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.interfaces.dummy.VehicleContent
import com.example.interfaces.model.Vehicle
import kotlinx.android.synthetic.main.activity_item_detail.*
import kotlinx.android.synthetic.main.item_detail.view.*

/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a [ItemListActivity]
 * in two-pane mode (on tablets) or a [ItemDetailActivity]
 * on handsets.
 */
class ItemDetailFragment : Fragment() {

    /**
     * The dummy content this fragment is presenting.
     */
    private var item: Vehicle? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            if (it.containsKey(ARG_ITEM_ID)) {
                // Load the dummy content specified by the fragment
                // arguments. In a real-world scenario, use a Loader
                // to load content from a content provider.
                item = VehicleContent.ITEM_MAP[it.getString(ARG_ITEM_ID)]
                activity?.toolbar_layout?.title = item?.id
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.item_detail, container, false)

        // Show the dummy content as text in a TextView.
        item?.let {
            rootView.item_detail.text = it.travel()
            rootView.button_favorite.text = it.favorite.toString()
        }

        rootView.button_favorite.setOnClickListener {
            if(item?.favorite == true){
                item?.favorite = false
            } else {
                item?.favorite = true
            }
            rootView.button_favorite.text = item?.favorite.toString()
        }

        return rootView
    }

    interface FragmentResponse {
        fun doSomething(something: String)
    }

    private var something: FragmentResponse? = null

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if(context is FragmentResponse) {
            something = context
        }
    }

    override fun onDetach() {
        super.onDetach()
        something = null
    }

    companion object {
        /**
         * The fragment argument representing the item ID that this fragment
         * represents.
         */
        const val ARG_ITEM_ID = "item_id"
    }
}
