package android.hfad.com.sudoku;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class TableCell extends AppCompatTextView {

    public TableCell(final Context context, final String text, int width, Typeface font) {
        super(context);
        setText(text);
        setTextColor(Color.WHITE);
        int padding = (int) AppConstant.convertDpToPixel(3, context);
        setPadding(0, padding, 0, padding);
        setGravity(Gravity.CENTER);
        setMaxLines(1);
        setWidth(width);
        setTypeface(font);
        if(text.length() > 0) {
            setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, getText(),Toast.LENGTH_LONG).show();
                }
            });
        }
    }

}
