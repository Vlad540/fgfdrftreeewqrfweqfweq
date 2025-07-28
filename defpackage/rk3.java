package defpackage;

import android.content.Context;
import android.net.Uri;
import kotlin.coroutines.Continuation;

/* renamed from: rk3  reason: default package */
public final class rk3 extends l5e implements i26 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ wk3 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rk3(Object obj, Continuation continuation, wk3 wk3) {
        super(2, continuation);
        this.X = obj;
        this.Y = wk3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rk3) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new rk3(this.X, continuation, this.Y);
    }

    public final Object o(Object obj) {
        CharSequence charSequence;
        wx3.H(obj);
        tf3 tf3 = (tf3) this.X;
        wk3 wk3 = this.Y;
        l2b b = ((o2b) wk3.e.getValue()).b(tf3.n());
        boolean e = ((o2b) wk3.e.getValue()).e(tf3.n());
        String p = tf3.p(fj0.b);
        if (tf3.k() != 0 || tf3.w()) {
            charSequence = null;
        } else {
            boolean z = tf3.Y;
            Context context = wk3.c;
            charSequence = z ? context.getString(whc.F) : (!tf3.t() || !tf3.v()) ? tf3.t() ? context.getString(cic.p) : ((q2b) wk3.f.getValue()).b(tf3) : context.getString(cic.K2);
        }
        long n = tf3.n();
        String d = tf3.d();
        if (d != null) {
            return new lk3(n, d, ehe.b(tf3.g()), hr1.o(tf3.o()), charSequence, (CharSequence) null, p != null ? Uri.parse(p) : null, e, tf3.u(), tf3.m(), tf3.Y, (boa) null, b.b, tf3.t(), 14336);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
