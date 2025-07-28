package defpackage;

import android.graphics.Bitmap;
import android.os.Environment;

/* renamed from: hkc  reason: default package */
public final class hkc extends sg0 {
    public final /* synthetic */ g0 a;
    public final /* synthetic */ yv1 b;
    public final /* synthetic */ ikc c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public hkc(g0 g0Var, zv1 zv1, ikc ikc, boolean z, boolean z2) {
        this.a = g0Var;
        this.b = zv1;
        this.c = ikc;
        this.d = z;
        this.e = z2;
    }

    public final void d() {
        yv1 yv1 = this.b;
        if (yv1.isActive()) {
            yv1.cancel(new Throwable("Cancelled with fresco pipeline"));
        }
    }

    public final void e(g0 g0Var) {
        this.b.resumeWith((Object) null);
    }

    public final void g(Bitmap bitmap) {
        String str;
        boolean h = this.a.h();
        yv1 yv1 = this.b;
        if (!h) {
            yv1.resumeWith((Object) null);
        } else if (bitmap == null) {
            yv1.resumeWith((Object) null);
        } else {
            ikc ikc = this.c;
            boolean z = this.d;
            if (z) {
                StringBuilder l = hr1.l(ikc.c.a.getCacheDir().getPath());
                l.append(cla.b);
                str = l.toString();
            } else {
                ikc.getClass();
                str = Environment.DIRECTORY_PICTURES;
            }
            yv1.resumeWith(ikc.d(new kn0(str, bitmap), this.e, z));
        }
    }
}
