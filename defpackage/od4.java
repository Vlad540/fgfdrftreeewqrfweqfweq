package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: od4  reason: default package */
public final class od4 extends wr3 {
    public final Handler X = new Handler(Looper.getMainLooper());
    public wc3 Y;
    public final long o = 1000;

    public final void a() {
        wc3 wc3 = this.Y;
        if (wc3 != null) {
            this.X.removeCallbacks(wc3);
        }
        wc3 wc32 = this.Y;
        if (wc32 != null) {
            wc32.run();
        }
        this.Y = null;
    }

    public final void f(wr3 wr3, rr3 rr3) {
        wc3 wc3 = this.Y;
        if (wc3 != null) {
            this.X.removeCallbacks(wc3);
        }
        this.Y = null;
    }

    public final void g(ViewGroup viewGroup, View view, View view2, boolean z, ur3 ur3) {
        wc3 wc3 = this.Y;
        Handler handler = this.X;
        if (wc3 != null) {
            handler.removeCallbacks(wc3);
        }
        wc3 wc32 = new wc3(view, z, this, viewGroup, view2, ur3);
        handler.postDelayed(wc32, this.o);
        this.Y = wc32;
    }
}
