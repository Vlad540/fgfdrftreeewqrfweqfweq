package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: std  reason: default package */
public final class std extends l5e implements i26 {
    public int X;
    public int Y;
    public final /* synthetic */ hud Z;
    public final /* synthetic */ ttd w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public std(hud hud, ttd ttd, Continuation continuation) {
        super(2, continuation);
        this.Z = hud;
        this.w0 = ttd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new std(this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        int i;
        pu3 pu3 = pu3.a;
        int i2 = this.Y;
        ttd ttd = this.w0;
        boolean z = false;
        if (i2 == 0) {
            wx3.H(obj);
            hud hud = this.Z;
            int i3 = hud.Y != 2 ? 1 : 0;
            k77[] k77Arr = ttd.L0;
            j73 d = ((l95) ttd.Z.getValue()).d(hud.a, hud.Y != 2);
            this.X = i3;
            this.Y = 1;
            if (e07.c(d, this) == pu3) {
                return pu3;
            }
            i = i3;
        } else if (i2 == 1) {
            i = this.X;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        l05 l05 = ttd.A0;
        if (i != 0) {
            z = true;
        }
        taf.o(l05, new led(z ? phc.n : phc.x, z ? iaa.c : iaa.d));
        return jue.a;
    }
}
