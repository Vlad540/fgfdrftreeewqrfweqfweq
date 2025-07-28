package defpackage;

import android.graphics.Rect;
import android.view.View;

/* renamed from: tzb  reason: default package */
public final class tzb implements Runnable {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ vzb a;
    public final /* synthetic */ b7c b;
    public final /* synthetic */ long c;
    public final /* synthetic */ szb o;

    public tzb(View view, vzb vzb, b7c b7c, long j, szb szb, boolean z) {
        this.a = vzb;
        this.b = b7c;
        this.c = j;
        this.o = szb;
        this.X = z;
    }

    public final void run() {
        if (!this.a.f(this.b.h())) {
            this.a.f.remove(Long.valueOf(this.c));
            this.a.e.remove(this.o);
            View findViewById = this.b.a.findViewById(this.o.c.a.toString().hashCode());
            Rect c2 = vzb.c(this.a, findViewById);
            if (c2 != null) {
                String str = this.a.d;
                fn6 fn6 = udd.e;
                if (fn6 != null && fn6.c()) {
                    tn7 tn7 = tn7.X;
                    boolean z = this.X;
                    fn6.d(tn7, str, "Play pending reaction effect, by place:" + c2 + ", onCreation:" + z, (Throwable) null);
                }
                vzb vzb = this.a;
                szb szb = this.o;
                vzb.d(vzb, szb.b, szb.a, c2);
                if (this.X) {
                    this.b.a.addOnLayoutChangeListener(new uzb(this.a, findViewById, this.c));
                }
            }
        }
    }
}
