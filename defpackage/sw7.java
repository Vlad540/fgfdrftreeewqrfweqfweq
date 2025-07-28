package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: sw7  reason: default package */
public final class sw7 extends AppCompatTextView {
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (bm3.E(wlb.textAppearanceLineHeightEnabled, context, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, xvb.MaterialTextAppearance);
            Context context2 = getContext();
            int[] iArr = {xvb.MaterialTextAppearance_android_lineHeight, xvb.MaterialTextAppearance_lineHeight};
            int i2 = -1;
            for (int i3 = 0; i3 < 2 && i2 < 0; i3++) {
                i2 = wx3.j(context2, obtainStyledAttributes, iArr[i3], -1);
            }
            obtainStyledAttributes.recycle();
            if (i2 >= 0) {
                setLineHeight(i2);
            }
        }
    }
}
