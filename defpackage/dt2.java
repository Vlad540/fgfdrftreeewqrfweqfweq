package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: dt2  reason: default package */
public final class dt2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ fu2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dt2(fu2 fu2, Continuation continuation) {
        super(2, continuation);
        this.Y = fu2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dt2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new dt2(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        fu2 fu2 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            k77[] k77Arr = fu2.Z0;
            this.X = 1;
            obj = ((v72) fu2.E0.getValue()).d(fu2.c, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ep5 ep5 = (ep5) obj;
        Set set = ep5 != null ? ep5.Y : null;
        fu2.O0.m((Object) null, Boolean.valueOf(!(set == null || set.isEmpty())));
        return jue.a;
    }
}
