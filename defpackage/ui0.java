package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.datepicker.MaterialCalendar;

/* renamed from: ui0  reason: default package */
public final class ui0 implements Runnable {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public /* synthetic */ ui0(int i, int i2, Object obj) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ((xi0) this.c).z0.x(this.b, 4);
                return;
            case 1:
                vx3 vx3 = (vx3) ((fte) this.c).a;
                if (vx3 != null) {
                    vx3.D(this.b);
                    return;
                }
                return;
            case 2:
                ((MaterialCalendar) this.c).w1.B0(this.b);
                return;
            case 3:
                ((SystemForegroundService) this.c).X.cancel(this.b);
                return;
            case 4:
                ((RecyclerView) this.c).B0(this.b);
                return;
            default:
                ((dzf) this.c).f(this.b);
                return;
        }
    }

    public ui0(RecyclerView recyclerView, int i) {
        this.a = 4;
        this.b = i;
        this.c = recyclerView;
    }

    public ui0(xi0 xi0) {
        this.a = 0;
        this.c = xi0;
        this.b = -1;
    }
}
