package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import java.util.HashMap;

/* renamed from: id9  reason: default package */
public final class id9 extends u2 {
    public final GestureDetector X;
    public final Handler Y = new Handler(Looper.getMainLooper());
    public final Rect Z = new Rect();
    public final yj4 c;
    public final yj4 o;
    public ne9 w0;
    public final bd x0;
    public se9 y0;

    public id9(oe9 oe9, ne9 ne9, Context context, bd bdVar) {
        super(0, (Object) oe9);
        this.w0 = ne9;
        this.x0 = bdVar;
        yj4 yj4 = new yj4(context);
        this.c = yj4;
        yj4 yj42 = new yj4(context);
        this.o = yj42;
        this.X = new GestureDetector(context, new tz(14, this));
        yj4.a = new c9(17, this);
        yj42.a = new u5g(20, this);
        oe9.A(this.w0);
        oe9.t(this);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [me9, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0034, code lost:
        r4 = r1.I0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void Z1(defpackage.id9 r8, boolean r9, int r10) {
        /*
            se9 r0 = r8.y0
            if (r0 != 0) goto L_0x0006
            goto L_0x0094
        L_0x0006:
            android.os.Handler r0 = r8.Y
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            ne9 r1 = r8.w0
            me9 r2 = new me9
            r2.<init>()
            int r1 = r1.a
            r2.a = r10
            r2.b = r9
            r1 = 1
            r2.c = r1
            ne9 r1 = new ne9
            r1.<init>((defpackage.me9) r2)
            r8.w0 = r1
            java.lang.Object r2 = r8.b
            ge9 r2 = (defpackage.ge9) r2
            oe9 r2 = (defpackage.oe9) r2
            r2.A(r1)
            se9 r1 = r8.y0
            r2 = 0
            if (r1 != 0) goto L_0x0034
        L_0x0032:
            r4 = r2
            goto L_0x003b
        L_0x0034:
            p7f r4 = r1.I0
            if (r4 != 0) goto L_0x0039
            goto L_0x0032
        L_0x0039:
            long r4 = r4.k
        L_0x003b:
            r6 = 10000(0x2710, double:4.9407E-320)
            if (r9 == 0) goto L_0x0041
            long r4 = r4 + r6
            goto L_0x0042
        L_0x0041:
            long r4 = r4 - r6
        L_0x0042:
            if (r1 != 0) goto L_0x0046
        L_0x0044:
            r6 = r2
            goto L_0x004d
        L_0x0046:
            p7f r1 = r1.I0
            if (r1 != 0) goto L_0x004b
            goto L_0x0044
        L_0x004b:
            long r6 = r1.j
        L_0x004d:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x0058
            r8.b2(r10, r9)
            r8.a2()
            r4 = r6
        L_0x0058:
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0063
            r8.b2(r10, r9)
            r8.a2()
            goto L_0x0064
        L_0x0063:
            r2 = r4
        L_0x0064:
            se9 r1 = r8.y0
            if (r1 == 0) goto L_0x0080
            java.lang.Object r1 = r1.a
            java.util.Set r1 = (java.util.Set) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0070:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0080
            java.lang.Object r4 = r1.next()
            kf9 r4 = (defpackage.kf9) r4
            r4.Y0(r2)
            goto L_0x0070
        L_0x0080:
            hd9 r1 = new hd9
            r1.<init>(r8, r9, r10)
            r9 = 600(0x258, double:2.964E-321)
            r0.postDelayed(r1, r9)
            eq6 r1 = new eq6
            r2 = 18
            r1.<init>(r2, r8)
            r0.postDelayed(r1, r9)
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.id9.Z1(id9, boolean, int):void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [me9, java.lang.Object] */
    public final void a2() {
        ne9 ne9 = this.w0;
        ? obj = new Object();
        obj.a = ne9.a;
        obj.b = ne9.b;
        obj.c = ne9.c;
        obj.a = 0;
        obj.c = false;
        ne9 ne92 = new ne9((me9) obj);
        this.w0 = ne92;
        ((oe9) ((ge9) this.b)).A(ne92);
        this.c.c = 0;
        this.o.c = 0;
    }

    public final void b2(int i, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("forward", Boolean.valueOf(z));
        hashMap.put("seconds", Integer.valueOf(i));
        this.x0.h("SEEK_BY_DOUBLE_TAP", hashMap);
    }
}
