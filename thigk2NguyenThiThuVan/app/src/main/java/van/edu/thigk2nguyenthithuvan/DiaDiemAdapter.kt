package van.edu.thigk2nguyenthithuvan

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class DiaDiemAdapter(
    context: Context,
    private val ds: List<DiaDiem>
) : ArrayAdapter<DiaDiem>(context, 0, ds) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context)
            .inflate(R.layout.item_dulich, parent, false)

        val img = view.findViewById<ImageView>(R.id.imgHinh)
        val ten = view.findViewById<TextView>(R.id.txtTen)
        val diaChi = view.findViewById<TextView>(R.id.txtDiaChi)

        val item = ds[position]

        img.setImageResource(item.hinh)
        ten.text = item.ten
        diaChi.text = item.diaChi

        return view
    }
}