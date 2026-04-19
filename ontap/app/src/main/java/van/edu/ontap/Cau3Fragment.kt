package van.edu.ontap

import van.edu.ontap.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class Cau3Fragment : Fragment() {
    var landScapeAdapter: LandScapeAdapter? = null
    var recyclerViewDatas: ArrayList<LandScape?>? = null
    var recyclerViewLandscape: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Chuẩn bị dữ liệu
        recyclerViewDatas = ArrayList<LandScape?>()
        val landScape1: LandScape = LandScape("ho_hoan_kiem", "Hoàn Kiếm")
        val landScape2: LandScape = LandScape("thap_nghieng_disa", "Tháp Nghiêng Disa")
        val landScape3: LandScape = LandScape("thap_nghieng_disa", "Tháp Nghiêng Disa")
        recyclerViewDatas!!.add(landScape1)
        recyclerViewDatas!!.add(landScape2)
        recyclerViewDatas!!.add(landScape3)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val viewCau3: View = inflater.inflate(R.layout.fragment_cau3, container, false)
        //4
        recyclerViewLandscape = viewCau3.findViewById<RecyclerView?>(R.id.ryCau3)
        //5
        val layoutLinear: RecyclerView.LayoutManager = LinearLayoutManager(viewCau3.getContext())
        recyclerViewLandscape!!.setLayoutManager(layoutLinear)
        //6
        landScapeAdapter = LandScapeAdapter(viewCau3.getContext(), recyclerViewDatas)
        //7
        recyclerViewLandscape!!.setAdapter(landScapeAdapter)
        // Inflate the layout for this fragment
        return viewCau3
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Cau3Fragment.
         */
        // TODO: Rename and change types and number of parameters
        fun newInstance(param1: String?, param2: String?): Cau3Fragment {
            val fragment = Cau3Fragment()
            val args = Bundle()
            return fragment
        }
    }
}