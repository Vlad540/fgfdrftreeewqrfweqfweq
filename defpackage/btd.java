package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: btd  reason: default package */
public final class btd {
    public final pk a;
    public final zsd b;
    public final qmc c;
    public final lce d;

    public btd(pk pkVar, zsd zsd, qmc qmc, lce lce) {
        this.a = pkVar;
        this.b = zsd;
        this.c = qmc;
        this.d = lce;
    }

    public final ho5 a(String str) {
        bm9 bm9 = new bm9((dfa) null, 10);
        if (!r1g.p(str)) {
            bm9.s(ApiProtocol.KEY_TOKEN, str);
            mhd mhd = new mhd(new phd(((gy9) this.a).L(bm9, this.c).h(new mb1(13, atd.class)).h(new xsd(13)).h(new xsd(14)), new sic(13, this), 0), new xsd(15), 1);
            lce lce = this.d;
            lce.getClass();
            return mhd.j(new ice(lce, 3, 0));
        }
        throw new IllegalStateException("token cannot be null");
    }
}
