package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: db2  reason: default package */
public final class db2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ j60 Y;
    public final /* synthetic */ i22 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public db2(j60 j60, i22 i22, Continuation continuation) {
        super(2, continuation);
        this.Y = j60;
        this.Z = i22;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((db2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new db2(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            j60 j60 = this.Y;
            long j = this.Z.a;
            this.X = 1;
            obj = ((bv2) ((t97) j60.X).getValue()).t(j, (Set) j60.o, this);
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
