package ai.gvs.smackapp.ui.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    private var _clicks = MutableLiveData<Int>()
    val data: LiveData<String>
        get() = _data
    val clicks: LiveData<Int>
        get() = _clicks

    init {
        _data.value = "Hello, Jetpacks!"
        _clicks.value = 0
        var user = User("a", "b")
        Log.e("name", user.name)
        Log.e("lastname", user.lastName)
        user.setSOmethign("asdasdasdasda")
        Log.e("name", user.name)
        Log.e("lastname", user.lastName)
    }
    fun userCLicked(){
        _clicks.value = _clicks.value?.inc()
    }
}
class User constructor(name: String, lastName: String){
    var name: String
    var lastName: String
    init{
        this.name = name
        this.lastName = lastName
    }
    fun setSOmethign(a: String) {
        this.name = a
        this.lastName = a
    }
}