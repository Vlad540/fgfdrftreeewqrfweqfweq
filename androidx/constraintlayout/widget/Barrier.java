package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.HashMap;

public class Barrier extends pe3 {
    public int A0;
    public jg0 B0;
    public int z0;

    public Barrier(Context context) {
        super(context);
        this.a = new int[32];
        this.y0 = new HashMap();
        this.c = context;
        h((AttributeSet) null);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.B0.t0;
    }

    public int getMargin() {
        return this.B0.u0;
    }

    public int getType() {
        return this.z0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [qf6, jg0] */
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        ? qf6 = new qf6();
        qf6.s0 = 0;
        qf6.t0 = true;
        qf6.u0 = 0;
        qf6.v0 = false;
        this.B0 = qf6;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, gwb.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == gwb.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == gwb.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.B0.t0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == gwb.ConstraintLayout_Layout_barrierMargin) {
                    this.B0.u0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.o = this.B0;
        k();
    }

    public final void i(ff3 ff3, boolean z) {
        int i = this.z0;
        this.A0 = i;
        if (z) {
            if (i == 5) {
                this.A0 = 1;
            } else if (i == 6) {
                this.A0 = 0;
            }
        } else if (i == 5) {
            this.A0 = 0;
        } else if (i == 6) {
            this.A0 = 1;
        }
        if (ff3 instanceof jg0) {
            ((jg0) ff3).s0 = this.A0;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.B0.t0 = z;
    }

    public void setDpMargin(int i) {
        this.B0.u0 = (int) ((((float) i) * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.B0.u0 = i;
    }

    public void setType(int i) {
        this.z0 = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
