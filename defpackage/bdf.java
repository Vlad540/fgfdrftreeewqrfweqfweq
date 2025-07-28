package defpackage;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: bdf  reason: default package */
public abstract class bdf extends pe3 {
    public boolean A0;
    public boolean z0;

    public final void f(ConstraintLayout constraintLayout) {
        e(constraintLayout);
    }

    public void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, gwb.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == gwb.ConstraintLayout_Layout_android_visibility) {
                    this.z0 = true;
                } else if (index == gwb.ConstraintLayout_Layout_android_elevation) {
                    this.A0 = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public abstract void l(qj5 qj5, int i, int i2);

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.z0 || this.A0) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.b; i++) {
                    View view = (View) constraintLayout.a.get(this.a[i]);
                    if (view != null) {
                        if (this.z0) {
                            view.setVisibility(visibility);
                        }
                        if (this.A0 && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        d();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        d();
    }
}
