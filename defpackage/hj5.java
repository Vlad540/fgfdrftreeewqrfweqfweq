package defpackage;

import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: hj5  reason: default package */
public final class hj5 implements Drawable.Callback {
    public final oc4 a;
    public final ii4 b;
    public final /* synthetic */ ij5 c;

    public hj5(ij5 ij5) {
        this.c = ij5;
        this.a = new oc4(19, ij5);
        this.b = new ii4((Object) ij5, 29, (Object) this);
    }

    public final void invalidateDrawable(Drawable drawable) {
        ij5 ij5 = this.c;
        RecyclerView recyclerView = ij5.x0;
        ii4 ii4 = this.b;
        if (recyclerView != null) {
            recyclerView.removeCallbacks(ii4);
        }
        RecyclerView recyclerView2 = ij5.x0;
        if (recyclerView2 != null) {
            recyclerView2.post(ii4);
        }
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        ij5 ij5 = this.c;
        RecyclerView recyclerView = ij5.x0;
        ii4 ii4 = this.b;
        if (recyclerView != null) {
            recyclerView.removeCallbacks(ii4);
        }
        RecyclerView recyclerView2 = ij5.x0;
        if (recyclerView2 != null) {
            recyclerView2.postDelayed(ii4, j - System.currentTimeMillis());
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        RecyclerView recyclerView = this.c.x0;
        if (recyclerView != null) {
            recyclerView.removeCallbacks(this.b);
        }
    }
}
