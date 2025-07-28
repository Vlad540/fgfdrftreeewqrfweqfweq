package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import java.util.List;

/* renamed from: z66  reason: default package */
public final class z66 {
    public static final jlc q = jlc.h;
    public static final jlc r = jlc.g;
    public final Resources a;
    public int b = 300;
    public float c = 0.0f;
    public Drawable d = null;
    public ilc e;
    public Drawable f;
    public ilc g;
    public Drawable h;
    public ilc i;
    public Drawable j;
    public ilc k;
    public ilc l;
    public Drawable m;
    public List n;
    public StateListDrawable o;
    public pgc p;

    public z66(Resources resources) {
        this.a = resources;
        jlc jlc = q;
        this.e = jlc;
        this.f = null;
        this.g = jlc;
        this.h = null;
        this.i = jlc;
        this.j = null;
        this.k = jlc;
        this.l = r;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
    }

    public final y66 a() {
        List<Drawable> list = this.n;
        if (list != null) {
            for (Drawable drawable : list) {
                drawable.getClass();
            }
        }
        return new y66(this);
    }
}
