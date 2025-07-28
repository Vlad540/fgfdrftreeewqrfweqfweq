package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: bqd  reason: default package */
public final class bqd extends l5e implements i26 {
    public int X;
    public final /* synthetic */ dqd Y;
    public final /* synthetic */ uj3 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bqd(dqd dqd, uj3 uj3, Continuation continuation) {
        super(2, continuation);
        this.Y = dqd;
        this.Z = uj3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new bqd(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            List singletonList = Collections.singletonList(this.Z);
            mi3 mi3 = mi3.b;
            this.X = 1;
            obj = ((ap3) this.Y.Y.getValue()).a.t(singletonList, mi3);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
