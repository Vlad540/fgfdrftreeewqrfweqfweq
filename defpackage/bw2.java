package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Collections;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: bw2  reason: default package */
public final class bw2 {
    public final Context a;
    public final o2b b;
    public final q2b c;

    public bw2(Context context, o2b o2b, q2b q2b) {
        this.a = context;
        this.b = o2b;
        this.c = q2b;
    }

    public final lk3 a(tf3 tf3) {
        CharSequence charSequence;
        tf3 tf32 = tf3;
        boolean z = false;
        int i = this.b.b(tf3.n()).a;
        boolean z2 = i == 10 || i == 20 || i == 40;
        String p = tf32.p(fj0.b);
        if (tf3.k() != 0 || tf3.w()) {
            z = true;
        }
        if (z) {
            charSequence = null;
        } else {
            boolean z3 = tf32.Y;
            Context context = this.a;
            charSequence = z3 ? context.getString(whc.F) : (!tf3.t() || !tf3.v()) ? tf3.t() ? context.getString(cic.p) : this.c.b(tf32) : context.getString(cic.K2);
        }
        long n = tf3.n();
        String d = tf3.d();
        if (d == null) {
            d = BuildConfig.FLAVOR;
        }
        return new lk3(n, d, ehe.b(tf3.g()), Collections.singletonList(Long.valueOf(tf3.o())), charSequence, (CharSequence) null, p != null ? Uri.parse(p) : null, z2, tf3.u(), tf3.m(), false, (boa) null, 0, tf3.t(), 27648);
    }

    public final t1c b(tf3 tf3) {
        int i = this.b.b(tf3.n()).a;
        return new t1c(tf3.n(), tf3.e(), tf3.p(fj0.c), tf3.m(), i == 10 || i == 20 || i == 40, tf3.u(), false, 192);
    }
}
