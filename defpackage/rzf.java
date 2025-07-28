package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.Set;

/* renamed from: rzf  reason: default package */
public final class rzf extends lzf implements oa6, pa6 {
    public static final wyf k = vzf.a;
    public final Context d;
    public final Handler e;
    public final wyf f = k;
    public final Set g;
    public final h2d h;
    public dfd i;
    public pd j;

    public rzf(Context context, Handler handler, h2d h2d) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 0);
        this.d = context;
        this.e = handler;
        this.h = h2d;
        this.g = (Set) h2d.b;
    }

    public final void R(int i2) {
        pd pdVar = this.j;
        dzf dzf = (dzf) ((qa6) pdVar.Y).y0.get((zk) pdVar.c);
        if (dzf == null) {
            return;
        }
        if (dzf.k) {
            dzf.n(new nd3(17));
        } else {
            dzf.R(i2);
        }
    }

    public final void k(nd3 nd3) {
        this.j.i(nd3);
    }

    public final void onConnected() {
        this.i.x(this);
    }
}
