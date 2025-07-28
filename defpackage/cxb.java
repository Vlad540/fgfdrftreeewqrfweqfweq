package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.WeakHashMap;

/* renamed from: cxb  reason: default package */
public abstract class cxb extends ConstraintLayout {
    public final eq6 K0 = new eq6(29, this);
    public int L0;
    public final lw7 M0;

    public cxb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(wrb.material_radial_view_group, this);
        lw7 lw7 = new lw7();
        this.M0 = lw7;
        m8c m8c = new m8c(0.5f);
        buf e = lw7.a.a.e();
        e.e = m8c;
        e.f = m8c;
        e.g = m8c;
        e.h = m8c;
        lw7.setShapeAppearanceModel(e.c());
        this.M0.l(ColorStateList.valueOf(-1));
        lw7 lw72 = this.M0;
        WeakHashMap weakHashMap = eaf.a;
        setBackground(lw72);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xvb.RadialViewGroup, i, 0);
        this.L0 = obtainStyledAttributes.getDimensionPixelSize(xvb.RadialViewGroup_materialCircleRadius, 0);
        obtainStyledAttributes.recycle();
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = eaf.a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            eq6 eq6 = this.K0;
            handler.removeCallbacks(eq6);
            handler.post(eq6);
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        w();
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            eq6 eq6 = this.K0;
            handler.removeCallbacks(eq6);
            handler.post(eq6);
        }
    }

    public final void setBackgroundColor(int i) {
        this.M0.l(ColorStateList.valueOf(i));
    }

    public abstract void w();
}
