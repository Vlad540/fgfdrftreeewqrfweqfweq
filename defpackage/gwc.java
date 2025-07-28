package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: gwc  reason: default package */
public final class gwc extends RecyclerView {
    public final void onMeasure(int i, int i2) {
        gwc.super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(me4.p((float) 150, dh4.c().getDisplayMetrics().density, View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
    }
}
