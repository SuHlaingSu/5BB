import android.view.View
import android.widget.LinearLayout
import androidx.viewpager.widget.PagerAdapter

class LinearLayoutPagerAdapter<T>(items : List<T>) : PagerAdapter() {

    var items: List<T> = mutableListOf()

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return (`object` as LinearLayout) === view
    }

    override fun getCount(): Int {
        return items.size
    }

}