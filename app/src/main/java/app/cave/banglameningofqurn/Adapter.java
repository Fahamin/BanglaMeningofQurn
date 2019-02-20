package app.cave.banglameningofqurn;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends ArrayAdapter<Model> {
    List<Model> DataModelList;
    Context context;
    int resource;

    ImageView imageView;
    TextView textView;
    public Adapter(Context context, int resource, List<Model> DataModelList) {
        super(context, resource, DataModelList);
        this.context = context;
        this.resource = resource;
        this.DataModelList = DataModelList;
    }


    @NonNull
    @Override
    public View getView(final int position, @Nullable final View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(resource, null, false);

        imageView = view.findViewById(R.id.qurnImgID);
        textView = view.findViewById(R.id.suraNameID);
        Model model = DataModelList.get(position);

        //imageView.setImageDrawable(context.getResources().getDrawable(model.getImage()));
        textView.setText(model.getSuraName());

        return view;
    }
}
