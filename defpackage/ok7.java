package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: ok7  reason: default package */
public final class ok7 implements xy5 {
    public static final /* synthetic */ k77[] i;
    public uy5 a = uy5.d;
    public final String b = ok7.class.getName();
    public final ContextScope c;
    public final grd d;
    public final e3 e;
    public final r7e f;
    public final int g;
    public volatile long h;

    static {
        hc9 hc9 = new hc9(ok7.class, "framesJob", "getFramesJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        i = new k77[]{hc9};
    }

    public ok7(pae pae, sma sma) {
        int i2;
        this.c = n1g.a(((n3a) pae).b().plus(new qj(this)));
        this.d = hrd.a(hw4.a);
        this.e = hwf.t();
        this.f = new r7e(new ib7(3));
        int ordinal = sma.a.ordinal();
        if (ordinal == 0) {
            i2 = 5;
        } else if (ordinal == 1) {
            i2 = 10;
        } else if (ordinal == 2) {
            i2 = 20;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.g = i2;
    }

    public final uy5 c() {
        return this.a;
    }

    public final boolean d() {
        v2f v2f = this.a.a;
        if (v2f == null) {
            return false;
        }
        Uri l = v2f.l();
        int i2 = oze.a;
        String scheme = l.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(long r10, kotlin.coroutines.Continuation r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.mk7
            if (r0 == 0) goto L_0x0013
            r0 = r12
            mk7 r0 = (defpackage.mk7) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            mk7 r0 = new mk7
            r0.<init>(r9, r12)
        L_0x0018:
            java.lang.Object r12 = r0.Y
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.w0
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            int r9 = r0.X
            ok7 r10 = r0.o
            defpackage.wx3.H(r12)
            goto L_0x0067
        L_0x002b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0033:
            defpackage.wx3.H(r12)
            int r12 = r9.g
            int r12 = r12 - r3
            double r4 = (double) r12
            float r10 = (float) r10
            long r11 = r9.h
            int r2 = r9.g
            long r6 = (long) r2
            long r11 = r11 / r6
            float r11 = (float) r11
            float r10 = r10 / r11
            double r10 = (double) r10
            double r10 = java.lang.Math.floor(r10)
            int r10 = (int) r10
            double r10 = (double) r10
            double r10 = java.lang.Math.min(r4, r10)
            int r10 = (int) r10
            grd r11 = r9.d
            nl5 r12 = new nl5
            r2 = 3
            r12.<init>(r11, r10, r2)
            r0.o = r9
            r0.X = r10
            r0.w0 = r3
            java.lang.Object r12 = defpackage.ez3.F(r12, r0)
            if (r12 != r1) goto L_0x0064
            return r1
        L_0x0064:
            r8 = r10
            r10 = r9
            r9 = r8
        L_0x0067:
            java.util.List r12 = (java.util.List) r12
            if (r12 == 0) goto L_0x007d
            vy5 r11 = new vy5
            java.lang.Object r9 = r12.get(r9)
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            uy5 r10 = r10.a
            int r12 = r10.b
            int r10 = r10.c
            r11.<init>(r12, r10, r9)
            goto L_0x007e
        L_0x007d:
            r11 = 0
        L_0x007e:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ok7.e(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void prepare() {
        v2f v2f = this.a.a;
        if (v2f == null) {
            udd.s(this.b, "You should call init before prepare!", (Throwable) null);
            return;
        }
        qod E = xs7.E(this.c, (hu3) null, (ru3) null, new nk7(this, v2f, (Continuation) null), 3);
        this.e.o1(this, i[0], E);
    }
}
