package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* renamed from: kc0  reason: default package */
public final class kc0 extends sg0 {
    public final /* synthetic */ qt9 a;
    public final /* synthetic */ lc0 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ g0 d;

    public kc0(at9 at9, lc0 lc0, Context context, g0 g0Var) {
        this.a = at9;
        this.b = lc0;
        this.c = context;
        this.d = g0Var;
    }

    public final void e(g0 g0Var) {
        Drawable c2 = this.b.c(this.c);
        at9 at9 = this.a;
        at9.c(c2);
        at9.b();
        g0Var.a();
    }

    public final void g(Bitmap bitmap) {
        g0 g0Var = this.d;
        Context context = this.c;
        at9 at9 = this.a;
        if (bitmap == null) {
            at9.c(this.b.c(context));
            at9.b();
            g0Var.a();
            return;
        }
        igc igc = new igc(context.getResources(), Bitmap.createBitmap(bitmap));
        igc.d.setAntiAlias(true);
        igc.invalidateSelf();
        at9.c(igc);
        at9.b();
        g0Var.a();
    }
}
