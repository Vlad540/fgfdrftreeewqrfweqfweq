package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: aj2  reason: default package */
public final class aj2 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ Set Z;
    public final /* synthetic */ fj2 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aj2(bs bsVar, fj2 fj2, Continuation continuation) {
        super(2, continuation);
        this.Z = bsVar;
        this.w0 = fj2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        aj2 aj2 = new aj2(this.Z, this.w0, continuation);
        aj2.Y = obj;
        return aj2;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            ou3 ou3 = (ou3) this.Y;
            StringBuilder sb = new StringBuilder("getFcmHistory: chats=");
            Set set = this.Z;
            sb.append(set);
            udd.q("fj2", sb.toString());
            if (set.isEmpty()) {
                return fw4.a;
            }
            djc djc = new djc(new zi2(this.w0, set, (Continuation) null));
            this.X = 1;
            v2b l = xy6.l(djc);
            a73 a = z3d.a();
            xs7.E(ou3, (hu3) l.c, (ru3) null, new nm5((pj5) l.b, a, (Continuation) null), 2);
            obj = a.awaitInternal(this);
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
