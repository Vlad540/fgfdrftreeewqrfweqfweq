package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieFactory;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: vzb  reason: default package */
public final class vzb extends r6c {
    public final RecyclerView a;
    public final dzb b;
    public final s16 c;
    public final String d = vzb.class.getName();
    public final LinkedHashSet e = new LinkedHashSet();
    public final LinkedList f = new LinkedList();
    public boolean g;

    public vzb(EndlessRecyclerView2 endlessRecyclerView2, dzb dzb, qk8 qk8) {
        this.a = endlessRecyclerView2;
        this.b = dzb;
        this.c = qk8;
    }

    public static final Rect c(vzb vzb, View view) {
        View view2 = (View) vzb.c.invoke();
        if (view2 == null || view == null) {
            return null;
        }
        return mcf.c(view, view2);
    }

    public static final void d(vzb vzb, String str, long j, Rect rect) {
        vzb vzb2 = vzb;
        long j2 = j;
        String str2 = vzb2.d;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, str2, us8.i(j2, "Play message "), (Throwable) null);
        }
        RLottieFactory rLottieFactory = RLottieFactory.INSTANCE;
        RLottieDrawable createByUrl$default = RLottieFactory.createByUrl$default(str, a24.X(((float) mzb.b.getWidth()) * dh4.c().getDisplayMetrics().density), a24.X(((float) mzb.b.getHeight()) * dh4.c().getDisplayMetrics().density), false, false, true, false, true, false, 72, (Object) null);
        createByUrl$default.setAutoRepeat(0);
        vzb2.b.a(j2, createByUrl$default, rect);
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        this.b.setScrollOffset(-i2);
        if (this.g) {
            this.g = false;
            afa.a(recyclerView, new vp6(22, recyclerView, this));
            return;
        }
        g(false);
    }

    public final void e(long j, ryb ryb, String str) {
        String str2 = this.d;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, str2, "Add reaction effect, reaction:" + ryb + ", " + j, (Throwable) null);
        }
        this.e.add(new szb(j, ryb, str));
    }

    public final boolean f(int i) {
        RecyclerView recyclerView = this.a;
        LinearLayoutManager q = gp0.q(recyclerView);
        int W0 = q != null ? q.W0() : -1;
        LinearLayoutManager q2 = gp0.q(recyclerView);
        return i == -1 || W0 > i || i > (q2 != null ? q2.Y0() : -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r6 = r1.longValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(boolean r11) {
        /*
            r10 = this;
            java.util.LinkedList r0 = r10.f
            java.lang.Object r1 = r0.peek()
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L_0x0049
            long r6 = r1.longValue()
            androidx.recyclerview.widget.RecyclerView r2 = r10.a
            b7c r5 = r2.N(r6)
            if (r5 != 0) goto L_0x0017
            return
        L_0x0017:
            java.util.LinkedHashSet r2 = r10.e
            java.util.Iterator r2 = r2.iterator()
        L_0x001d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0031
            java.lang.Object r3 = r2.next()
            r4 = r3
            szb r4 = (defpackage.szb) r4
            long r8 = r4.a
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x001d
            goto L_0x0032
        L_0x0031:
            r3 = 0
        L_0x0032:
            r8 = r3
            szb r8 = (defpackage.szb) r8
            if (r8 != 0) goto L_0x003b
            r0.remove(r1)
            return
        L_0x003b:
            tzb r0 = new tzb
            androidx.recyclerview.widget.RecyclerView r1 = r10.a
            r2 = r0
            r3 = r1
            r4 = r10
            r9 = r11
            r2.<init>(r3, r4, r5, r6, r8, r9)
            afa.a(r1, r0)
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vzb.g(boolean):void");
    }
}
