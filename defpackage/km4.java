package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Size;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import kotlin.NoWhenBranchMatchedException;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: km4  reason: default package */
public final class km4 implements pz3, Provider {
    public static final s59 y0 = new Object();
    public static volatile km4 z0;
    public Object X;
    public Object Y;
    public Object Z;
    public Object a;
    public Object b;
    public Object c;
    public Object o;
    public Object w0 = hrd.a(0);
    public Object x0;

    /* JADX WARNING: type inference failed for: r6v1, types: [ul7, java.lang.Object] */
    public km4(Context context) {
        r7e r7e = new r7e(new b5(context, 29));
        this.b = new o58(context, 1);
        this.c = new v4b(context);
        this.o = new ud(context);
        ? obj = new Object();
        obj.a = z3d.N(rda.a, qda.a);
        obj.b = r7e;
        obj.c = ez3.O(3, new q6e(5, obj));
        this.X = obj;
        this.Y = new jg8(r7e);
        grd a2 = hrd.a(g());
        this.Z = a2;
        this.x0 = new t0c(a2);
        this.a = "Chroma";
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.km4 r6, long r7, j4a r9, kotlin.coroutines.Continuation r10) {
        /*
            boolean r0 = r10 instanceof defpackage.im4
            if (r0 == 0) goto L_0x0013
            r0 = r10
            im4 r0 = (defpackage.im4) r0
            int r1 = r0.x0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x0 = r1
            goto L_0x0018
        L_0x0013:
            im4 r0 = new im4
            r0.<init>(r6, r10)
        L_0x0018:
            java.lang.Object r10 = r0.Z
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.x0
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            long r7 = r0.Y
            j4a r9 = r0.X
            km4 r6 = r0.o
            defpackage.wx3.H(r10)
        L_0x002c:
            r3 = r7
            r5 = r9
            goto L_0x004d
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            defpackage.wx3.H(r10)
            r0.o = r6
            r0.X = r9
            r0.Y = r7
            r0.x0 = r3
            java.lang.Object r10 = r6.c
            lz2 r10 = (defpackage.lz2) r10
            java.lang.Object r10 = r10.a(r7, r0)
            if (r10 != r1) goto L_0x002c
            goto L_0x0077
        L_0x004d:
            java.lang.Object r6 = r6.Z
            t97 r6 = (defpackage.t97) r6
            java.lang.Object r6 = r6.getValue()
            pk r6 = (pk) r6
            gy9 r6 = (gy9) r6
            boolean r7 = r6.o(r3)
            if (r7 != 0) goto L_0x0060
            goto L_0x0075
        L_0x0060:
            bm4 r7 = new bm4
            g2b r8 = r6.z()
            j2b r8 = (j2b) r8
            i03 r8 = r8.a
            long r1 = r8.n()
            r0 = r7
            r0.<init>(r1, r3, r5)
            gy9.w(r6, r7)
        L_0x0075:
            jue r1 = defpackage.jue.a
        L_0x0077:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.km4.a(km4, long, j4a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static void c(ViewGroup viewGroup, pda pda) {
        myc.J(myc.R(hhd.Q(new es(8, viewGroup), new o8(0), new p8(0, pda)), new p8(1, pda)));
    }

    public static /* synthetic */ void d(km4 km4, ViewGroup viewGroup) {
        pda g = km4.g();
        km4.getClass();
        c(viewGroup, g);
    }

    public ib0 b() {
        String str = ((String) this.a) == null ? " mimeType" : BuildConfig.FLAVOR;
        if (((Integer) this.b) == null) {
            str = str.concat(" profile");
        }
        if (((kje) this.c) == null) {
            str = hr1.g(str, " inputTimebase");
        }
        if (((Size) this.o) == null) {
            str = hr1.g(str, " resolution");
        }
        if (((Integer) this.X) == null) {
            str = hr1.g(str, " colorFormat");
        }
        if (((jb0) this.Y) == null) {
            str = hr1.g(str, " dataSpace");
        }
        if (((Integer) this.Z) == null) {
            str = hr1.g(str, " frameRate");
        }
        if (((Integer) this.w0) == null) {
            str = hr1.g(str, " IFrameInterval");
        }
        if (((Integer) this.x0) == null) {
            str = hr1.g(str, " bitrate");
        }
        if (str.isEmpty()) {
            return new ib0((String) this.a, ((Integer) this.b).intValue(), (kje) this.c, (Size) this.o, ((Integer) this.X).intValue(), (jb0) this.Y, ((Integer) this.Z).intValue(), ((Integer) this.w0).intValue(), ((Integer) this.x0).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public otf e() {
        return (otf) this.x0;
    }

    public void f(xm8 xm8, int i, int i2) {
        xm8 xm82 = xm8;
        s78 e = ((t78) this.x0).e();
        vo8 vo8 = xm82.a;
        long j = vo8.c;
        if (e.d == vo8.x0) {
            if (e.c.containsAll((Set) this.w0)) {
                if (i > 0) {
                    long j2 = e.b;
                    if (j2 != 0) {
                        j = j2;
                    }
                }
                if (i2 > 0) {
                    long j3 = e.a;
                    if (j3 != 0) {
                        j = j3;
                    }
                }
            }
        }
        i22 i22 = (i22) this.Z;
        yhd L = ((pk) this.X).L(new dt(i22.b.a, Long.valueOf(j), (Set) this.w0, Integer.valueOf(i), Integer.valueOf(i2)), cnc.d);
        lce lce = (lce) this.Y;
        lce.getClass();
        eb2 eb2 = (eb2) L.j(new ice(lce, 2, 0)).e();
        List c2 = eb2.c();
        ((to8) this.a).g(i22.a, ((g2b) this.o).a.s(), c2);
        t52 t52 = (t52) this.c;
        t52.getClass();
        vo8 vo82 = xm82.a;
        long j4 = vo82.b;
        long j5 = vo82.o;
        long j6 = i22.a;
        t52.h(j6, false, new m52(t52, (Set) this.w0, eb2, i2, j4, i, j5, j6));
    }

    public pda g() {
        pda t = ((ul7) this.X).t(j());
        return t == null ? rda.a : t;
    }

    public Object get() {
        return new vxe((Context) ((Provider) this.b).get(), (b39) ((Provider) this.c).get(), (a15) ((Provider) this.a).get(), (i37) ((Provider) this.o).get(), (Executor) ((Provider) this.X).get(), (m7e) ((Provider) this.Y).get(), (eye) ((Provider) this.Z).get(), (eye) ((Provider) this.w0).get(), (a03) ((Provider) this.x0).get());
    }

    public List h(long j, rg6 rg6, int i, int i2, long j2, long j3) {
        rg6 rg62 = rg6;
        int i3 = i;
        int i4 = i2;
        if (!(rg62 instanceof xm8)) {
            udd.s("km4", "item must be instanceof Message", (Throwable) null);
            return Collections.emptyList();
        }
        xm8 xm8 = (xm8) rg62;
        if (i4 > 0) {
            f(xm8, i2, 0);
        }
        if (i3 > 0) {
            f(xm8, 0, i);
        }
        return ((pz3) this.b).h(j, rg6, i, i2, j2, j3);
    }

    public boolean i() {
        wj9 r = ((jg8) this.Y).r();
        if (r instanceof wj9) {
            if (((int) ((Math.log10((double) gwf.i(((Number) ((grd) ((ud) this.o).c).getValue()).floatValue(), 0.0f, 10000.0f)) / ((double) 4)) * ((double) 100))) > r.b) {
                return false;
            }
        } else if (r instanceof zj9) {
            return ((zj9) r).b();
        } else {
            if (r.equals(ak9.b)) {
                if (((c33) ((grd) ((v4b) this.c).b).getValue()) != c33.b) {
                    return false;
                }
            } else if (!r.equals(yj9.b)) {
                if (r.equals(xj9.b)) {
                    return false;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return true;
    }

    public String j() {
        boolean i = i();
        jg8 jg8 = (jg8) this.Y;
        return i ? jg8.s().getString("nighttheme", "one.me.sdk.design.OneMeThemeDark") : jg8.s().getString("maintheme", "one.me.sdk.design.OneMeThemeLight");
    }

    public void k(bk9 bk9) {
        jg8 jg8 = (jg8) this.Y;
        SharedPreferences.Editor edit = jg8.s().edit();
        bk9.a.getClass();
        edit.putString("nightmode", y76.o(bk9));
        edit.apply();
        ((hcd) jg8.b).g("nightmode");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        r0 = (ul7) r4.X;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void l(java.lang.String r5) {
        /*
            r4 = this;
            pda r0 = r4.g()
            java.lang.String r0 = r0.getName()
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000f
            return
        L_0x000f:
            java.lang.Object r0 = r4.X
            ul7 r0 = (ul7) r0
            pda r5 = r0.t(r5)
            if (r5 == 0) goto L_0x008f
            java.lang.String r1 = r5.getName()
            java.lang.Object r2 = r0.c
            t97 r2 = (defpackage.t97) r2
            java.lang.Object r2 = r2.getValue()
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2
            r2.put(r1, r5)
            java.lang.Object r2 = r0.a
            java.util.Set r2 = (java.util.Set) r2
            boolean r3 = r2 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0038
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x007a
        L_0x0038:
            java.util.Iterator r2 = r2.iterator()
        L_0x003c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x007a
            java.lang.Object r3 = r2.next()
            pda r3 = (pda) r3
            java.lang.String r3 = r3.getName()
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x003c
            java.lang.String r0 = r5.getName()
            java.lang.Object r1 = r4.Y
            jg8 r1 = (jg8) r1
            android.content.SharedPreferences r2 = r1.s()
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r3 = "maintheme"
            r2.putString(r3, r0)
            r2.apply()
            java.lang.Object r0 = r1.b
            hcd r0 = (defpackage.hcd) r0
            r0.g(r3)
            r0 = 0
            java.lang.Object r4 = r4.Z
            grd r4 = (defpackage.grd) r4
            r4.m(r0, r5)
            goto L_0x008f
        L_0x007a:
            java.lang.Object r4 = r0.b
            t97 r4 = (defpackage.t97) r4
            java.lang.Object r4 = r4.getValue()
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4
            r4.edit()
            el9 r4 = new el9
            java.lang.String r5 = "An operation is not implemented: Указать тут задачу с кастомными темами"
            r4.<init>(r5)
            throw r4
        L_0x008f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.km4.l(java.lang.String):void");
    }
}
