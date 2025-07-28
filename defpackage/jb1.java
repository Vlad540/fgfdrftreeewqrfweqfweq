package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: jb1  reason: default package */
public final class jb1 extends taf {
    public final we1 X;
    public volatile Long Y;
    public final grd Z;
    public final String b;
    public final nu7 c;
    public final nxc o;
    public final t0c w0;
    public final l05 x0 = new l05(0);

    public jb1(boolean z, Long l, String str, String str2, nu7 nu7, nxc nxc, op1 op1, we1 we1) {
        this.b = str;
        this.c = nu7;
        this.o = nxc;
        this.X = we1;
        grd a = hrd.a(za1.j);
        this.Z = a;
        this.w0 = new t0c(a);
        ez3.N(new ck5(new s0c(op1.a), new hb1(this, (Continuation) null), 5), this.a);
        if (!(true ^ (str == null || str.length() == 0))) {
            r();
        } else if (str != null) {
            s(z, str, str2, l);
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public final void q(long j) {
        int i = (j > ((long) i1a.b) ? 1 : (j == ((long) i1a.b) ? 0 : -1));
        if (i == 0) {
            r();
            return;
        }
        t0c t0c = this.w0;
        CharSequence charSequence = ((za1) t0c.a.getValue()).c;
        l05 l05 = this.x0;
        if (charSequence == null) {
            taf.o(l05, new s81(new hge(j1a.m)));
        } else if (j == ((long) i1a.a)) {
            CharSequence charSequence2 = ((za1) t0c.a.getValue()).c;
            if (charSequence2 != null) {
                taf.o(l05, new p81(charSequence2));
            }
        } else if (j == ((long) i1a.c)) {
            taf.o(l05, new q81(charSequence));
        } else if (j == ((long) i1a.d)) {
            taf.o(l05, new r81(charSequence));
        } else if (j == ((long) i1a.e)) {
            this.X.j(charSequence.toString(), !((za1) t0c.a.getValue()).i, false, ((za1) t0c.a.getValue()).i, new x2((Object) this, 11, (Object) charSequence));
        } else if (i == 0) {
            r();
        }
    }

    public final void r() {
        if (((za1) this.w0.a.getValue()).c == null && this.Y == null) {
            xs7.E(this.a, (hu3) null, (ru3) null, new ib1(this, (Continuation) null), 3);
            return;
        }
        String name = jb1.class.getName();
        boolean z = ((za1) this.w0.a.getValue()).c != null;
        Long l = this.Y;
        udd.T(name, "Skip creating call link: callLink=" + z + " createJoinLinkRequestId=" + l, new Object[0]);
    }

    public final void s(boolean z, CharSequence charSequence, String str, Long l) {
        grd grd;
        Object value;
        za1 za1;
        ub0 ub0;
        mge lge;
        String W;
        xa1 xa1;
        boolean z2;
        String str2 = str;
        do {
            grd = this.Z;
            value = grd.getValue();
            za1 = (za1) value;
            ub0 = null;
            String str3 = z ^ true ? str2 : null;
            nu7 nu7 = this.c;
            nu7.getClass();
            Context context = (Context) nu7.a;
            if (l != null) {
                long longValue = l.longValue();
                if (str3 == null) {
                    str3 = BuildConfig.FLAVOR;
                }
                ub0 = new ub0(String.valueOf(new lge(str3).a(context)), longValue);
            }
            lge = str2 != null ? new lge(str2) : new hge(j1a.k);
            W = at7.W(charSequence.toString());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(at7.W(charSequence.toString()));
            z2 = false;
            spannableStringBuilder.setSpan(new whe(km4.y0.n(context).g(), new v81(nu7, 1)), 0, spannableStringBuilder.length(), 17);
            xa1 = new xa1(new lge(spannableStringBuilder));
            if (this.b == null) {
                z2 = true;
            }
        } while (!grd.b(value, za1.a(za1, ub0, W, xa1, lge, z2, 225)));
    }
}
