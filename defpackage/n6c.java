package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: n6c  reason: default package */
public class n6c extends ViewGroup.MarginLayoutParams {
    public b7c a;
    public final Rect b = new Rect();
    public boolean c = true;
    public boolean o = false;

    public n6c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public n6c(int i, int i2) {
        super(i, i2);
    }

    public n6c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public n6c(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public n6c(n6c n6c) {
        super(n6c);
    }
}
