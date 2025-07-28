package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.Collections;
import java.util.Set;

/* renamed from: la6  reason: default package */
public abstract class la6 {
    public final zk X;
    public final Looper Y;
    public final int Z;
    public final Context a;
    public final String b;
    public final qe4 c;
    public final nk o;
    public final fzf w0;
    public final hk9 x0;
    public final qa6 y0;

    public la6(Context context, qe4 qe4, GoogleSignInOptions googleSignInOptions, hk9 hk9) {
        this(context, qe4, (nk) googleSignInOptions, new ka6(hk9, Looper.getMainLooper()));
    }

    public final b0d a() {
        b0d b0d = new b0d(6);
        b0d.c = null;
        Set emptySet = Collections.emptySet();
        if (((bs) b0d.o) == null) {
            b0d.o = new bs(0);
        }
        ((bs) b0d.o).addAll(emptySet);
        Context context = this.a;
        b0d.X = context.getClass().getName();
        b0d.b = context.getPackageName();
        return b0d;
    }

    public final n6g b(ih7 ih7, int i) {
        a24.p(ih7, "Listener key cannot be null.");
        qa6 qa6 = this.y0;
        qa6.getClass();
        vde vde = new vde();
        qa6.e(vde, i, this);
        ozf ozf = new ozf(new c0g(ih7, vde), qa6.x0.get(), this);
        z59 z59 = qa6.B0;
        z59.sendMessage(z59.obtainMessage(13, ozf));
        return vde.a;
    }

    public final n6g c(int i, ms6 ms6) {
        vde vde = new vde();
        qa6 qa6 = this.y0;
        qa6.getClass();
        qa6.e(vde, ms6.b, this);
        ozf ozf = new ozf(new d0g(i, ms6, vde, this.x0), qa6.x0.get(), this);
        z59 z59 = qa6.B0;
        z59.sendMessage(z59.obtainMessage(4, ozf));
        return vde.a;
    }

    public la6(Context context, qe4 qe4, nk nkVar, ka6 ka6) {
        a24.p(context, "Null context is not permitted.");
        a24.p(qe4, "Api must not be null.");
        a24.p(ka6, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        a24.p(applicationContext, "The provided context did not have an application context.");
        this.a = applicationContext;
        String q = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.b = q;
        this.c = qe4;
        this.o = nkVar;
        this.Y = ka6.b;
        this.X = new zk(qe4, nkVar, q);
        this.w0 = new fzf(this);
        qa6 f = qa6.f(applicationContext);
        this.y0 = f;
        this.Z = f.w0.getAndIncrement();
        this.x0 = ka6.a;
        z59 z59 = f.B0;
        z59.sendMessage(z59.obtainMessage(7, this));
    }
}
