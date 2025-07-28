package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;

/* renamed from: uuf  reason: default package */
public abstract class uuf {
    public static final ColorDrawable a = new ColorDrawable(0);

    public static Drawable a(Drawable drawable, pgc pgc, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            Paint paint = bitmapDrawable.getPaint();
            pgc.getClass();
            hgc hgc = new hgc(resources, bitmap, paint);
            b(hgc, pgc);
            return hgc;
        } else if (drawable instanceof NinePatchDrawable) {
            mgc mgc = new mgc((NinePatchDrawable) drawable);
            b(mgc, pgc);
            return mgc;
        } else if (drawable instanceof ColorDrawable) {
            jgc jgc = new jgc(((ColorDrawable) drawable).getColor());
            b(jgc, pgc);
            return jgc;
        } else {
            m75.m("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        }
    }

    public static void b(ggc ggc, pgc pgc) {
        ggc.b(pgc.b);
        ggc.m(pgc.c);
        ggc.a(pgc.f, pgc.e);
        ggc.i(pgc.g);
        ggc.k();
        ggc.e(pgc.h);
        ggc.g();
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable c(android.graphics.drawable.Drawable r3, defpackage.pgc r4, android.content.res.Resources r5) {
        /*
            defpackage.n06.s()     // Catch:{ all -> 0x0034 }
            if (r3 == 0) goto L_0x003e
            if (r4 == 0) goto L_0x003e
            int r0 = r4.a     // Catch:{ all -> 0x0034 }
            r1 = 2
            if (r0 == r1) goto L_0x000d
            goto L_0x003e
        L_0x000d:
            boolean r0 = r3 instanceof defpackage.ow5     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0036
            r0 = r3
            ow5 r0 = (defpackage.ow5) r0     // Catch:{ all -> 0x0034 }
        L_0x0014:
            android.graphics.drawable.Drawable r1 = r0.j()     // Catch:{ all -> 0x0034 }
            if (r1 == r0) goto L_0x0023
            boolean r2 = r1 instanceof defpackage.xm4     // Catch:{ all -> 0x0034 }
            if (r2 != 0) goto L_0x001f
            goto L_0x0023
        L_0x001f:
            r0 = r1
            xm4 r0 = (defpackage.xm4) r0     // Catch:{ all -> 0x0034 }
            goto L_0x0014
        L_0x0023:
            android.graphics.drawable.ColorDrawable r1 = a     // Catch:{ all -> 0x0034 }
            android.graphics.drawable.Drawable r1 = r0.f(r1)     // Catch:{ all -> 0x0034 }
            android.graphics.drawable.Drawable r4 = a(r1, r4, r5)     // Catch:{ all -> 0x0034 }
            r0.f(r4)     // Catch:{ all -> 0x0034 }
            defpackage.n06.s()
            return r3
        L_0x0034:
            r3 = move-exception
            goto L_0x0042
        L_0x0036:
            android.graphics.drawable.Drawable r3 = a(r3, r4, r5)     // Catch:{ all -> 0x0034 }
            defpackage.n06.s()
            return r3
        L_0x003e:
            defpackage.n06.s()
            return r3
        L_0x0042:
            defpackage.n06.s()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uuf.c(android.graphics.drawable.Drawable, pgc, android.content.res.Resources):android.graphics.drawable.Drawable");
    }

    public static Drawable d(Drawable drawable, pgc pgc) {
        try {
            if (!(drawable == null || pgc == null)) {
                if (pgc.a == 1) {
                    lgc lgc = new lgc(drawable);
                    b(lgc, pgc);
                    lgc.D0 = pgc.d;
                    lgc.invalidateSelf();
                    n06.s();
                    return lgc;
                }
            }
            n06.s();
            return drawable;
        } finally {
            n06.s();
        }
    }

    public static Drawable e(Drawable drawable, ilc ilc) {
        n06.s();
        if (drawable == null || ilc == null) {
            n06.s();
            return drawable;
        }
        glc glc = new glc(drawable, ilc);
        n06.s();
        return glc;
    }
}
