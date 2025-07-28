package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.fresco.ui.common.ControllerListener2;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: n0  reason: default package */
public abstract class n0 {
    public static final l0 m = new Object();
    public static final NullPointerException n = new NullPointerException("No image request was specified!");
    public static final AtomicLong o = new AtomicLong();
    public final Context a;
    public final Set b;
    public final Set c;
    public Object d = null;
    public Object e = null;
    public Object f = null;
    public o3e g;
    public bs3 h = null;
    public boolean i = false;
    public boolean j = false;
    public boolean k;
    public gn4 l = null;

    public n0(Context context, Set set, Set set2) {
        this.a = context;
        this.b = set;
        this.c = set2;
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Object, uo6] */
    public final xwa a() {
        xwa xwa;
        Object obj;
        if (this.g == null || (this.e == null && this.f == null)) {
            if (this.e == null && (obj = this.f) != null) {
                this.e = obj;
                this.f = null;
            }
            n06.s();
            ywa ywa = (ywa) this;
            n06.s();
            try {
                gn4 gn4 = ywa.l;
                String valueOf = String.valueOf(o.getAndIncrement());
                if (gn4 instanceof xwa) {
                    xwa = (xwa) gn4;
                } else {
                    kv2 kv2 = ywa.q;
                    xwa xwa2 = new xwa((Resources) kv2.a, (bd4) kv2.b, (h54) ((wm4) kv2.c), (ExecutorService) ((Executor) kv2.o), (qe4) ((el8) kv2.X), (zy) kv2.Y);
                    o3e o3e = (o3e) kv2.Z;
                    if (o3e != null) {
                        xwa2.D = ((Boolean) o3e.get()).booleanValue();
                    }
                    xwa = xwa2;
                }
                o3e b2 = ywa.b(xwa, valueOf);
                tr6 tr6 = (tr6) ywa.e;
                m54 m54 = ywa.p.h;
                zm0 r = (m54 == null || tr6 == null) ? null : tr6.q != null ? m54.r(tr6, ywa.d) : m54.l(tr6, ywa.d);
                Object obj2 = ywa.d;
                xwa.getClass();
                n06.s();
                xwa.g(obj2, valueOf);
                xwa.s = false;
                xwa.t = false;
                xwa.C = b2;
                xwa.v((b13) null);
                xwa.B = r;
                xwa.E = null;
                xwa.v((b13) null);
                n06.s();
                xwa.t(ywa.r, ywa);
                n06.s();
                xwa.t = false;
                xwa.o = this.k;
                xwa.p = null;
                boolean z = this.i;
                if (z) {
                    if (xwa.d == null) {
                        ? obj3 = new Object();
                        obj3.b = false;
                        obj3.a = 4;
                        obj3.c = 0;
                        xwa.d = obj3;
                    }
                    xwa.d.b = z;
                    if (xwa.e == null) {
                        g76 g76 = new g76(this.a);
                        xwa.e = g76;
                        g76.a = xwa;
                    }
                }
                Set<bs3> set = this.b;
                if (set != null) {
                    for (bs3 a2 : set) {
                        xwa.a(a2);
                    }
                }
                Set<ControllerListener2> set2 = this.c;
                if (set2 != null) {
                    for (ControllerListener2 addListener : set2) {
                        xwa.g.addListener(addListener);
                    }
                }
                bs3 bs3 = this.h;
                if (bs3 != null) {
                    xwa.a(bs3);
                }
                if (this.j) {
                    xwa.a(m);
                }
                n06.s();
                return xwa;
            } catch (Throwable th) {
                n06.s();
                throw th;
            }
        } else {
            throw new IllegalStateException("Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
        }
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.o3e b(defpackage.xwa r14, java.lang.String r15) {
        /*
            r13 = this;
            o3e r0 = r13.g
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            java.lang.Object r5 = r13.e
            r12 = 1
            if (r5 == 0) goto L_0x0017
            java.lang.Object r6 = r13.d
            m0 r0 = new m0
            r1 = r0
            r2 = r13
            r3 = r14
            r4 = r15
            r7 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 == 0) goto L_0x003d
            java.lang.Object r1 = r13.f
            if (r1 == 0) goto L_0x003d
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 2
            r1.<init>(r2)
            r1.add(r0)
            java.lang.Object r10 = r13.f
            java.lang.Object r11 = r13.d
            m0 r0 = new m0
            r6 = r0
            r7 = r13
            r8 = r14
            r9 = r15
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r1.add(r0)
            nv6 r0 = new nv6
            r13 = 0
            r0.<init>(r1, r13)
        L_0x003d:
            if (r0 != 0) goto L_0x0044
            uz3 r0 = new uz3
            r0.<init>()
        L_0x0044:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n0.b(xwa, java.lang.String):o3e");
    }
}
