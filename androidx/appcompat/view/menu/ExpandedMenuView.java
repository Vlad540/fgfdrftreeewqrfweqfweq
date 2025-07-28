package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public final class ExpandedMenuView extends ListView implements ol8, jm8, AdapterView.OnItemClickListener {
    public static final int[] b = {16842964, 16843049};
    public pl8 a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        ydc D = ydc.D(context, attributeSet, b, 16842868, 0);
        TypedArray typedArray = (TypedArray) D.c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(D.y(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(D.y(1));
        }
        D.E();
    }

    public final boolean a(ul8 ul8) {
        return this.a.q(ul8, (hm8) null, 0);
    }

    public final void b(pl8 pl8) {
        this.a = pl8;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((ul8) getAdapter().getItem(i));
    }
}
