package defpackage;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: yae  reason: default package */
public final class yae implements wzc {
    public static final /* synthetic */ int j = 0;
    public final rf4 a;
    public final g15 b;
    public volatile boolean c;
    public final boolean d;
    public final t97 e;
    public volatile String f;
    public volatile List g;
    public final String h;
    public qw9 i;

    public yae(rf4 rf4, g15 g15, xzc xzc, r7e r7e) {
        this.a = rf4;
        this.b = g15;
        vqc vqc = (vqc) xzc;
        vqc.getClass();
        this.d = t14.a((int) vqc.o(PmsKey.f24debugmode, (long) 0)) != t14.DISABLED;
        this.e = r7e;
        f(ete.c(vqc.v(PmsKey.proxy, (String) null)));
        List g2 = vqc.g(PmsKey.f93proxydomains.name(), hw4.a);
        synchronized (this) {
            this.g = g2;
        }
        StringBuilder sb = new StringBuilder("OKMessages/");
        sb.append(rf4.h().b);
        sb.append(" (");
        sb.append(rf4.h().e);
        sb.append("; ");
        sb.append(rf4.h().h);
        sb.append("; ");
        String l = wn6.l(sb, rf4.h().i, ")");
        try {
            this.h = URLEncoder.encode(l, Charset.defaultCharset().name());
        } catch (UnsupportedEncodingException unused) {
            this.h = l;
        }
    }

    public static void c(yae yae, u93 u93, boolean z) {
        int i2 = 80;
        if (!r1g.p(yae.f)) {
            u93.h(yae.f);
            if (z) {
                i2 = 443;
            }
            u93.k(i2);
            return;
        }
        yae.b.a(new IllegalStateException("proxy is null or empty!"));
        if (z) {
            i2 = 443;
        }
        u93.k(i2);
    }

    public final void a(String str, String str2) {
        f(str2);
    }

    public final void b(List list, List list2) {
        synchronized (this) {
            this.g = list2;
        }
    }

    public final boolean d(String str) {
        if (r1g.p(str)) {
            return false;
        }
        for (String str2 : this.g) {
            if (str.equals(str2)) {
                return true;
            }
            if (str.endsWith("." + str2)) {
                return true;
            }
        }
        return false;
    }

    public final qw9 e() {
        if (this.i == null) {
            pw9 pw9 = new pw9();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            pw9.y = nze.b(timeUnit);
            pw9.z = nze.b(timeUnit);
            stf stf = new stf(7);
            stf.a = (ExecutorService) this.e.getValue();
            pw9.a = stf;
            pw9.x = nze.b(timeUnit);
            pw9.c.add(new xae(this, 1));
            xae xae = new xae(this, 0);
            ArrayList arrayList = pw9.d;
            arrayList.add(xae);
            if (!this.d) {
                this.a.e();
            } else {
                arrayList.add(new qq0(1, "yae"));
            }
            this.i = new qw9(pw9);
        }
        return this.i;
    }

    public final synchronized void f(String str) {
        this.c = !r1g.p(str);
        this.f = str;
    }
}
