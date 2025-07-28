package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: exd  reason: default package */
public final class exd extends l5e implements i26 {
    public int X;
    public final /* synthetic */ gxd Y;
    public final /* synthetic */ Long Z;
    public final /* synthetic */ Long w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public exd(gxd gxd, Long l, Long l2, Continuation continuation) {
        super(2, continuation);
        this.Y = gxd;
        this.Z = l;
        this.w0 = l2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new exd(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            k77[] k77Arr = gxd.F0;
            l95 l95 = (l95) this.Y.o.getValue();
            Long l = this.Z;
            long longValue = l.longValue();
            Long l2 = this.w0;
            long longValue2 = l2.longValue();
            l95.getClass();
            udd.p("l95", "setFavoriteStickerSetMoved: stickerSetId=%d, targetPositionStickerId=%d", new Object[]{l, l2});
            long j = longValue2;
            w63 w63 = new w63(l95.b(), 2, new i95(longValue, longValue2, 0));
            w95 w95 = (w95) l95.Y.getValue();
            w95.getClass();
            j73 f = new w63(w63, 0, new w63(new jhd(new t95(w95, longValue, j), 0).h(new mb1(13, qt.class)), 2, new g95(15)).k(w95.d)).g(new g95(3)).f(new j95(longValue, j));
            this.X = 1;
            if (e07.c(f, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
