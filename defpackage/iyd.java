package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;

/* renamed from: iyd  reason: default package */
public final class iyd extends l5e implements i26 {
    public int X;
    public final /* synthetic */ lyd Y;
    public final /* synthetic */ hud Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iyd(lyd lyd, hud hud, Continuation continuation) {
        super(2, continuation);
        this.Y = lyd;
        this.Z = hud;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new iyd(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            lyd lyd = this.Y;
            AtomicLong atomicLong = lyd.z0;
            hud hud = this.Z;
            atomicLong.compareAndSet(0, hud.a);
            j73 d = ((l95) lyd.Y.getValue()).d(hud.a, true);
            this.X = 1;
            if (e07.c(d, this) == pu3) {
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
