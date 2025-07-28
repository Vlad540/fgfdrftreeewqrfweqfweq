package defpackage;

import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.util.Map;

/* renamed from: m84  reason: default package */
public final class m84 implements iq6 {
    public final iq6 a;
    public final iq6 b;
    public final nxa c;
    public final ye d = new ye(1, this);
    public final Map e;

    public m84(ye yeVar, we weVar, nxa nxa, Map map) {
        this.a = yeVar;
        this.b = weVar;
        this.c = nxa;
        this.e = map;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        r0 = (defpackage.iq6) r1.get(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.b13 a(defpackage.ax4 r3, int r4, defpackage.tjb r5, defpackage.gq6 r6) {
        /*
            r2 = this;
            r6.getClass()
            r3.n0()
            lq6 r0 = r3.c
            if (r0 == 0) goto L_0x000e
            lq6 r1 = defpackage.lq6.c
            if (r0 != r1) goto L_0x0023
        L_0x000e:
            java.io.InputStream r1 = r3.n()
            if (r1 == 0) goto L_0x0023
            t97 r0 = defpackage.mq6.d
            lq6 r0 = defpackage.xy6.r(r1)     // Catch:{ IOException -> 0x001d }
            r3.c = r0
            goto L_0x0023
        L_0x001d:
            r2 = move-exception
            bm3.z(r2)
            r2 = 0
            throw r2
        L_0x0023:
            java.util.Map r1 = r2.e
            if (r1 == 0) goto L_0x0034
            java.lang.Object r0 = r1.get(r0)
            iq6 r0 = (defpackage.iq6) r0
            if (r0 == 0) goto L_0x0034
            b13 r2 = r0.a(r3, r4, r5, r6)
            return r2
        L_0x0034:
            ye r2 = r2.d
            b13 r2 = r2.a(r3, r4, r5, r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m84.a(ax4, int, tjb, gq6):b13");
    }

    public final CloseableStaticBitmap b(ax4 ax4, gq6 gq6) {
        e13 a2 = this.c.a(ax4, gq6.a);
        try {
            a2.getClass();
            et6 et6 = et6.d;
            ax4.n0();
            int i = ax4.o;
            ax4.n0();
            CloseableStaticBitmap of = CloseableStaticBitmap.of(a2, (tjb) et6, i, ax4.X);
            of.putExtra(HasExtraData.KEY_IS_ROUNDED, Boolean.FALSE);
            return of;
        } finally {
            e13.S(a2);
        }
    }
}
