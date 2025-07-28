package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ttd  reason: default package */
public final class ttd extends taf {
    public static final /* synthetic */ k77[] L0;
    public final l05 A0 = new l05(0);
    public final grd B0;
    public final t0c C0;
    public final grd D0;
    public final t0c E0;
    public final grd F0;
    public final t0c G0;
    public final e3 H0;
    public final e3 I0;
    public final e3 J0;
    public final e3 K0;
    public final t97 X;
    public final t97 Y;
    public final t97 Z;
    public final long b;
    public final pae c;
    public final t97 o;
    public final t97 w0;
    public final t97 x0;
    public final t97 y0;
    public final l05 z0 = new l05(0);

    static {
        Class<ttd> cls = ttd.class;
        L0 = new k77[]{new hc9(cls, "loadStickerJob", "getLoadStickerJob()Lkotlinx/coroutines/Job;"), c3d.g(m7c.a, cls, "loadChatTitleJob", "getLoadChatTitleJob()Lkotlinx/coroutines/Job;"), new hc9(cls, "markFavoriteJob", "getMarkFavoriteJob()Lkotlinx/coroutines/Job;"), new hc9(cls, "markStickerSetFavoriteJob", "getMarkStickerSetFavoriteJob()Lkotlinx/coroutines/Job;")};
    }

    public ttd(long j, pae pae, t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976, t97 t977) {
        this.b = j;
        this.c = pae;
        this.o = t97;
        this.X = t972;
        this.Y = t973;
        this.Z = t974;
        this.w0 = t975;
        this.x0 = t976;
        this.y0 = t977;
        grd a = hrd.a((Object) null);
        this.B0 = a;
        this.C0 = new t0c(a);
        grd a2 = hrd.a("");
        this.D0 = a2;
        this.E0 = new t0c(a2);
        grd a3 = hrd.a((Object) null);
        this.F0 = a3;
        this.G0 = new t0c(a3);
        this.H0 = hwf.t();
        this.I0 = hwf.t();
        this.J0 = hwf.t();
        this.K0 = hwf.t();
    }

    public final void q(Long l) {
        ktd ktd = (ktd) this.B0.getValue();
        if (ktd != null) {
            long j = ktd.b;
            if (j != 0) {
                rn1 c2 = am7.c(((lud) this.X.getValue()).b(j));
                l95 l95 = (l95) this.Z.getValue();
                l95.getClass();
                f00 f00 = new f00(j, 15);
                jk0 jk0 = l95.w0;
                jk0.getClass();
                ez3.N(ez3.J(new ck5(new v11(c2, am7.c(new au9(jk0, f00, 1)), otd.w0, 4), new ptd(this, l, (Continuation) null), 5), this.c.b()), this.a);
                return;
            }
        }
        udd.q(ttd.class.getName(), "Can't load sticker set because we haven't selected sticker or setId");
    }

    public final ktd r(osd osd, boolean z, Long l) {
        osd osd2 = osd;
        String str = osd2.w0;
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            str = osd2.o;
        }
        String str2 = str;
        boolean z2 = l != null && l.longValue() == osd2.a;
        String str3 = ((kb5) ((jb5) this.y0.getValue())).v() ? osd2.D0 : null;
        int i = osd2.c;
        long j = osd2.a;
        long j2 = osd2.z0;
        return new ktd(j, j2, j2, str2, osd2.A0, str3, osd2.b, i, z, z2, 0, 4672);
    }

    public final void s(long j) {
        ktd ktd = (ktd) this.C0.a.getValue();
        if (ktd == null || ktd.a != j) {
            qod D = xs7.D(this.a, this.c.b(), ru3.b, new qtd(this, j, (Continuation) null));
            this.H0.o1(this, L0[0], D);
        }
    }
}
