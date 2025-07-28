package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: pe7  reason: default package */
public final class pe7 extends l5e implements i26 {
    public final /* synthetic */ long X;
    public final /* synthetic */ ef7 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ long w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pe7(long j, ef7 ef7, long j2, long j3, Continuation continuation) {
        super(2, continuation);
        this.X = j;
        this.Y = ef7;
        this.Z = j2;
        this.w0 = j3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new pe7(this.X, this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        int i = (this.X > 0 ? 1 : (this.X == 0 ? 0 : -1));
        ef7 ef7 = this.Y;
        long j = this.Z;
        if (i > 0) {
            return ((to8) ef7.c.getValue()).q(j);
        }
        if (j > 0) {
            return ((to8) ef7.c.getValue()).j(this.w0, j);
        }
        return null;
    }
}
