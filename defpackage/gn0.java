package defpackage;

import android.graphics.Bitmap;

/* renamed from: gn0  reason: default package */
public final /* synthetic */ class gn0 implements i4f {
    public final /* synthetic */ jn0 a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ bz5 c;
    public final /* synthetic */ dke d;

    public /* synthetic */ gn0(jn0 jn0, Bitmap bitmap, bz5 bz5, dke dke) {
        this.a = jn0;
        this.b = bitmap;
        this.c = bz5;
        this.d = dke;
    }

    public final void run() {
        jn0 jn0 = this.a;
        jn0.getClass();
        dke dke = this.d;
        oyb.c("Bitmap queued but no timestamps provided.", dke.hasNext());
        jn0.o.add(new in0(this.b, this.c, dke));
        jn0.A();
        jn0.y0 = false;
    }
}
