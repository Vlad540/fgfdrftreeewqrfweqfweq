package defpackage;

import android.os.Handler;
import android.widget.AbsListView;

/* renamed from: wg7  reason: default package */
public final class wg7 implements AbsListView.OnScrollListener {
    public final /* synthetic */ xg7 a;

    public wg7(xg7 xg7) {
        this.a = xg7;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            xg7 xg7 = this.a;
            if (xg7.O0.getInputMethodMode() != 2 && xg7.O0.getContentView() != null) {
                Handler handler = xg7.K0;
                vg7 vg7 = xg7.G0;
                handler.removeCallbacks(vg7);
                vg7.run();
            }
        }
    }
}
