package van.edu.ontap

import van.edu.ontap.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment


class Cau1Fragment : Fragment() {
    var editText_Met: EditText? = null
    var editText_KiLoMet: EditText? = null
    var btnKetQua: Button? = null
    var btnReset: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val viewCau1: View = inflater.inflate(R.layout.fragment_cau1, container, false)
        // Tìm điều khiển trong view này
        editText_Met = viewCau1.findViewById<EditText?>(R.id.donViDoM)
        editText_KiLoMet = viewCau1.findViewById<EditText?>(R.id.donViDoKM)
        btnKetQua = viewCau1.findViewById<Button?>(R.id.btnKetQuaDo)
        btnReset = viewCau1.findViewById<Button?>(R.id.reset)
        btnKetQua!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val duLieuMet = editText_Met!!.getText().toString()
                val duLieuKiLoMet = editText_KiLoMet!!.getText().toString()
                //
                if (!duLieuMet.isEmpty())  // user có nhập dữ liệu mét, cần đổi sang km
                {
                    val met = duLieuMet.toDouble()
                    val km = met / 1000
                    Toast.makeText(
                        viewCau1.getContext(),
                        met.toString() + " m = " + km + " km",
                        Toast.LENGTH_SHORT
                    ).show()
                    editText_KiLoMet!!.setText(km.toString())
                } else {
                    val km = duLieuKiLoMet.toDouble()
                    val met = km * 1000
                    Toast.makeText(
                        viewCau1.getContext(),
                        km.toString() + " km = " + met + " m",
                        Toast.LENGTH_SHORT
                    ).show()
                    editText_Met!!.setText(met.toString())
                }
            }
        })
        btnReset!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                editText_Met!!.setText("")
                editText_KiLoMet!!.setText("")
            }
        })

        return viewCau1
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Cau1Fragment.
         */
        // TODO: Rename and change types and number of parameters
        fun newInstance(param1: String?, param2: String?): Cau1Fragment {
            val fragment = Cau1Fragment()
            val args = Bundle()
            fragment.setArguments(args)
            return fragment
        }
    }
}