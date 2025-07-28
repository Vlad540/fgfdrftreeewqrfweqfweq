package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.Settings;

/* renamed from: h7a  reason: default package */
public final class h7a {
    public final Context a;
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;

    public h7a(Context context, t97 t97, t97 t972, t97 t973, t97 t974) {
        this.a = context;
        this.b = t97;
        this.c = t972;
        this.d = t973;
        this.e = t974;
        Uri uri = Settings.System.DEFAULT_RINGTONE_URI;
    }

    public final zm9 a() {
        return (zm9) this.e.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(i22 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.d7a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            d7a r0 = (defpackage.d7a) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            d7a r0 = new d7a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.Y
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.w0
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            i22 r5 = r0.X
            h7a r4 = r0.o
            defpackage.wx3.H(r6)
            goto L_0x004b
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            defpackage.wx3.H(r6)
            e7a r6 = new e7a
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.o = r4
            r0.X = r5
            r0.w0 = r3
            r2 = 200(0xc8, double:9.9E-322)
            java.lang.Object r6 = defpackage.ez3.m0(r2, r6, r0)
            if (r6 != r1) goto L_0x004b
            return r1
        L_0x004b:
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            if (r6 != 0) goto L_0x0066
            zm9 r4 = r4.a()
            r4.getClass()
            r5.h0()
            r5.i0()
            java.lang.CharSequence r6 = r5.B0
            long r0 = r5.e()
            android.graphics.Bitmap r6 = r4.e(r6, r0)
        L_0x0066:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h7a.b(i22, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(tf3 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.f7a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            f7a r0 = (defpackage.f7a) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            f7a r0 = new f7a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.Y
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.w0
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            tf3 r5 = r0.X
            h7a r4 = r0.o
            defpackage.wx3.H(r6)
            goto L_0x004b
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            defpackage.wx3.H(r6)
            g7a r6 = new g7a
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.o = r4
            r0.X = r5
            r0.w0 = r3
            r2 = 200(0xc8, double:9.9E-322)
            java.lang.Object r6 = defpackage.ez3.m0(r2, r6, r0)
            if (r6 != r1) goto L_0x004b
            return r1
        L_0x004b:
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            if (r6 != 0) goto L_0x0062
            zm9 r4 = r4.a()
            r4.getClass()
            java.lang.CharSequence r6 = r5.m()
            long r0 = r5.n()
            android.graphics.Bitmap r6 = r4.e(r6, r0)
        L_0x0062:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h7a.c(tf3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void d() {
        km4.y0.n(this.a).g().b().a.getClass();
    }

    public final int e() {
        return Long.hashCode(((g2b) this.b.getValue()).a.s());
    }

    public final wo9 f(String str, boolean z) {
        if (str.length() == 0) {
            return null;
        }
        return new wo9(str, z, new Uri.Builder().scheme("content").authority("one.me.android.notifications").appendPath("message_image").appendPath(str).appendPath(String.valueOf(z)).build());
    }
}
