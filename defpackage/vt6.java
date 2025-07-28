package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.List;

/* renamed from: vt6  reason: default package */
public final /* synthetic */ class vt6 implements hx9, kx9, gx9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wt6 b;

    public /* synthetic */ vt6(wt6 wt6, int i) {
        this.a = i;
        this.b = wt6;
    }

    public void d() {
        if (this.b.d != null) {
            xhd.i();
        }
    }

    public void l(Task task) {
        tt6 i;
        wt6 wt6 = this.b;
        switch (this.a) {
            case 0:
                if (task.h()) {
                    wt6.c = (bdc) task.f();
                    return;
                }
                return;
            default:
                if (wt6.d != null && (i = o2a.a.i()) != null) {
                    List list = tt6.p;
                    i.c(1, (Integer) null);
                    return;
                }
                return;
        }
    }

    public void onFailure(Exception exc) {
        if (this.b.d != null) {
            xhd.i();
        }
    }
}
