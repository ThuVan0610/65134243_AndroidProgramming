package van.edu.appmonan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MonAnAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<MonAn> dsMonAn;
    private LayoutInflater inflater;

    public MonAnAdapter(Context context, ArrayList<MonAn> dsMonAn) {
        this.context = context;
        this.dsMonAn = dsMonAn;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return dsMonAn.size();
    }

    @Override
    public Object getItem(int position) {
        return dsMonAn.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_monan, parent, false);
        }

        MonAn monAn = dsMonAn.get(position);

        TextView tvTen = convertView.findViewById(R.id.tvTenMonAn);
        TextView tvGia = convertView.findViewById(R.id.tvDonGia);
        TextView tvMoTa = convertView.findViewById(R.id.tvMoTa);
        ImageView img = convertView.findViewById(R.id.img_anhDaiDien);

        tvTen.setText(monAn.getTenMonAn());
        tvGia.setText(monAn.getDonGia() + " đ");
        tvMoTa.setText(monAn.getMoTa());
        img.setImageResource(monAn.getIdAnhMinhHoa());

        return convertView;
    }
}