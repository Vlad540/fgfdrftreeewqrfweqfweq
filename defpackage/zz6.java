package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.messages.video.fetcher.FetcherException;

/* renamed from: zz6  reason: default package */
public final class zz6 extends kj0 {
    public final ad3 a;
    public final lce b;
    public final mbe c;
    public final tt0 d;
    public final pk e;
    public final long f;
    public final long g;
    public final long h;
    public final String i;
    public volatile long j;
    public final vw k = new vw();
    public final AtomicBoolean l = new AtomicBoolean(false);

    public zz6(ad3 ad3, lce lce, mbe mbe, tt0 tt0, pk pkVar, long j2, long j3, long j4, String str) {
        this.a = ad3;
        this.b = lce;
        this.c = mbe;
        this.d = tt0;
        this.e = pkVar;
        this.f = j2;
        this.g = j3;
        this.h = j4;
        this.i = str;
    }

    public final dhd a() {
        vw vwVar = this.k;
        Object obj = vwVar.a.get();
        Object obj2 = vw.X;
        if (obj != obj2 || vwVar.c == null) {
            vw vwVar2 = this.k;
            e3 e3Var = new e3((Object) this);
            vwVar2.getClass();
            kt9 kt9 = new kt9(vwVar2, new ea6(15, e3Var), new mv4(15, e3Var), new d36(e3Var));
            lce lce = this.b;
            lce.getClass();
            mv9 mv9 = new mv9(0, new au9(kt9, new ice(lce, 1, 2), 6));
            if (this.l.get()) {
                return mv9;
            }
            if (!this.a.e()) {
                return dhd.f(new FetcherException(2, "No internet connection"));
            }
            this.d.d(this);
            this.l.compareAndSet(false, true);
            this.j = ((gy9) this.e).M(false, this.f, this.g, this.h, 0, "", false, true, this.i);
            return mv9;
        }
        vw vwVar3 = this.k;
        return dhd.g(vwVar3.a.get() == obj2 ? vwVar3.c : null);
    }

    @a1e
    public final void onEvent(h7f h7f) {
        if (h7f.a == this.j) {
            vw vwVar = this.k;
            if (vwVar.a.get() != vw.X || vwVar.b != null) {
                ((nbe) this.c).a().b(new zo5(h7f, 8, this));
            }
        }
    }

    @a1e
    public final void onEvent(jh0 jh0) {
        if (jh0.a == this.j) {
            vw vwVar = this.k;
            if (vwVar.a.get() != vw.X || vwVar.b != null) {
                ((nbe) this.c).a().b(new zo5(jh0, 7, this));
            }
        }
    }
}
