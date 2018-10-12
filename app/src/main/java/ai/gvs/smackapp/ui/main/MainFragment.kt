package ai.gvs.smackapp.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ai.gvs.smackapp.R
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        //observing the data :v
        viewModel.data.observe(this, Observer { data ->
            //view?.findViewById<TextView>(R.id.message)?.text = data
        })

        viewModel.clicks.observe(this, Observer { data ->
            val text: String = viewModel.data.value + " clicks: " + data
            view?.findViewById<TextView>(R.id.message)?.text = text
        })
        view?.findViewById<Button>(R.id.clickButton)?.setOnClickListener {
            viewModel.userCLicked()
        }
    }

}
