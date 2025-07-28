package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;

public class Flow extends bdf {
    public qj5 B0;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [qf6, qj5] */
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        ? qf6 = new qf6();
        qf6.s0 = 0;
        qf6.t0 = 0;
        qf6.u0 = 0;
        qf6.v0 = 0;
        qf6.w0 = 0;
        qf6.x0 = 0;
        qf6.y0 = false;
        qf6.z0 = 0;
        qf6.A0 = 0;
        qf6.B0 = new sj0(0);
        qf6.C0 = null;
        qf6.D0 = -1;
        qf6.E0 = -1;
        qf6.F0 = -1;
        qf6.G0 = -1;
        qf6.H0 = -1;
        qf6.I0 = -1;
        qf6.J0 = 0.5f;
        qf6.K0 = 0.5f;
        qf6.L0 = 0.5f;
        qf6.M0 = 0.5f;
        qf6.N0 = 0.5f;
        qf6.O0 = 0.5f;
        qf6.P0 = 0;
        qf6.Q0 = 0;
        qf6.R0 = 2;
        qf6.S0 = 2;
        qf6.T0 = 0;
        qf6.U0 = -1;
        qf6.V0 = 0;
        qf6.W0 = new ArrayList();
        qf6.X0 = null;
        qf6.Y0 = null;
        qf6.Z0 = null;
        qf6.b1 = 0;
        this.B0 = qf6;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, gwb.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == gwb.ConstraintLayout_Layout_android_orientation) {
                    this.B0.V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == gwb.ConstraintLayout_Layout_android_padding) {
                    qj5 qj5 = this.B0;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    qj5.s0 = dimensionPixelSize;
                    qj5.t0 = dimensionPixelSize;
                    qj5.u0 = dimensionPixelSize;
                    qj5.v0 = dimensionPixelSize;
                } else if (index == gwb.ConstraintLayout_Layout_android_paddingStart) {
                    qj5 qj52 = this.B0;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    qj52.u0 = dimensionPixelSize2;
                    qj52.w0 = dimensionPixelSize2;
                    qj52.x0 = dimensionPixelSize2;
                } else if (index == gwb.ConstraintLayout_Layout_android_paddingEnd) {
                    this.B0.v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == gwb.ConstraintLayout_Layout_android_paddingLeft) {
                    this.B0.w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == gwb.ConstraintLayout_Layout_android_paddingTop) {
                    this.B0.s0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == gwb.ConstraintLayout_Layout_android_paddingRight) {
                    this.B0.x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == gwb.ConstraintLayout_Layout_android_paddingBottom) {
                    this.B0.t0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == gwb.ConstraintLayout_Layout_flow_wrapMode) {
                    this.B0.T0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == gwb.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.B0.D0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == gwb.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.B0.E0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == gwb.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.B0.F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == gwb.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.B0.H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == gwb.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.B0.G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == gwb.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.B0.I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == gwb.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.B0.J0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == gwb.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.B0.L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == gwb.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.B0.N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == gwb.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.B0.M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == gwb.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.B0.O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == gwb.ConstraintLayout_Layout_flow_verticalBias) {
                    this.B0.K0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == gwb.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.B0.R0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == gwb.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.B0.S0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == gwb.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.B0.P0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == gwb.ConstraintLayout_Layout_flow_verticalGap) {
                    this.B0.Q0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == gwb.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.B0.U0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.o = this.B0;
        k();
    }

    public final void i(ff3 ff3, boolean z) {
        qj5 qj5 = this.B0;
        int i = qj5.u0;
        if (i <= 0 && qj5.v0 <= 0) {
            return;
        }
        if (z) {
            qj5.w0 = qj5.v0;
            qj5.x0 = i;
            return;
        }
        qj5.w0 = i;
        qj5.x0 = qj5.v0;
    }

    public final void l(qj5 qj5, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (qj5 != null) {
            qj5.V(mode, size, mode2, size2);
            setMeasuredDimension(qj5.z0, qj5.A0);
            return;
        }
        setMeasuredDimension(0, 0);
    }

    public final void onMeasure(int i, int i2) {
        l(this.B0, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.B0.L0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.B0.F0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.B0.M0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.B0.G0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.B0.R0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.B0.J0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.B0.P0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.B0.D0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.B0.N0 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.B0.H0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.B0.O0 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.B0.I0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.B0.U0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.B0.V0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        qj5 qj5 = this.B0;
        qj5.s0 = i;
        qj5.t0 = i;
        qj5.u0 = i;
        qj5.v0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.B0.t0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.B0.w0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.B0.x0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.B0.s0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.B0.S0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.B0.K0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.B0.Q0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.B0.E0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.B0.T0 = i;
        requestLayout();
    }
}
