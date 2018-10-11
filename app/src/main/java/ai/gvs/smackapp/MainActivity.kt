package ai.gvs.smackapp

import android.os.Bundle
import ai.gvs.smackapp.ui.main.MainFragment

class MainActivity : AppCompatActivitypatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow()
        }
    }

}
