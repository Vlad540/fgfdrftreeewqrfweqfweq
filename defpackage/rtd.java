package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: rtd  reason: default package */
public final class rtd extends l5e implements i26 {
    public int X;
    public int Y;
    public final /* synthetic */ ktd Z;
    public final /* synthetic */ ttd w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rtd(ktd ktd, ttd ttd, Continuation continuation) {
        super(2, continuation);
        this.Z = ktd;
        this.w0 = ttd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new rtd(this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        boolean z;
        int i;
        f73 f73;
        pu3 pu3 = pu3.a;
        int i2 = this.Y;
        ktd ktd = this.Z;
        ttd ttd = this.w0;
        if (i2 == 0) {
            wx3.H(obj);
            boolean z2 = !ktd.z0;
            fa5 fa5 = (fa5) ttd.Y.getValue();
            fa5.getClass();
            long j = ktd.a;
            udd.p("fa5", "markAsFavorite: stickerId=%d, favorite=%b", new Object[]{Long.valueOf(j), Boolean.valueOf(z2)});
            nj4 nj4 = fa5.a;
            w63 w63 = new w63(z2 ? new w63(new phd(((a95) nj4.get()).a(), new i74(23), 0), 2, new da5(fa5, 4)) : c73.a, 0, new w63(((a95) nj4.get()).a(), 2, new u85(0, j, z2)));
            if (z2) {
                udd.p("fa5", "addToFavorites: stickerId=%d", new Object[]{Long.valueOf(j)});
                aa5 aa5 = (aa5) fa5.g.get();
                aa5.getClass();
                f73 = new w63(new jhd(new s95(aa5, j, 1), 0).h(new mb1(13, ft.class)), 2, new g95(19)).k(aa5.d);
                z = true;
            } else {
                z = true;
                f73 = fa5.e(new long[]{j});
            }
            j73 g = new w63(w63, 0, f73).f(new h95(z, j, z2)).g(new u85(4, j, z2));
            this.X = z2 ? 1 : 0;
            this.Y = z ? 1 : 0;
            if (e07.c(g, this) == pu3) {
                return pu3;
            }
            i = z2;
        } else if (i2 == 1) {
            i = this.X;
            wx3.H(obj);
            z = true;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ttd.B0.m((Object) null, ktd.k(ktd, i != 0 ? z : false, false, 7167));
        boolean z3 = i != 0 ? z : false;
        taf.o(ttd.A0, new led(z3 ? phc.n : phc.x, z3 ? nca.e : nca.f));
        return jue.a;
    }
}
