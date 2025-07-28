package defpackage;

import android.view.ViewTreeObserver;

/* renamed from: mo0  reason: default package */
public final /* synthetic */ class mo0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mo0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                ((oo0) this.b).c();
                return true;
            default:
                i55 i55 = (i55) this.b;
                if (!i55.B0 && i55.getMeasuredWidth() > 0) {
                    i55.b(i55.getMeasuredWidth());
                    i55.B0 = true;
                    i55.requestLayout();
                }
                if (i55.B0) {
                    i55.getViewTreeObserver().removeOnPreDrawListener(i55.F0);
                    i55.F0 = null;
                }
                return true;
        }
    }
}
