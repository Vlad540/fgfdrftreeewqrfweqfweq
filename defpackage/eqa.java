package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: eqa  reason: default package */
public final class eqa extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ gqa Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eqa(gqa gqa, Continuation continuation) {
        super(2, continuation);
        this.Z = gqa;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((jqa) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        eqa eqa = new eqa(this.Z, continuation);
        eqa.Y = obj;
        return eqa;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            jqa jqa = (jqa) this.Y;
            boolean z = jqa instanceof hqa;
            gqa gqa = this.Z;
            if (z) {
                if (((hqa) jqa).a != gqa.i.get()) {
                    return jue;
                }
                hcd hcd = gqa.g;
                aqa aqa = aqa.a;
                this.X = 1;
                if (hcd.a(aqa, this) == pu3) {
                    return pu3;
                }
            } else if (!(jqa instanceof iqa)) {
                throw new NoWhenBranchMatchedException();
            } else if (((iqa) jqa).a != gqa.i.get()) {
                return jue;
            } else {
                hcd hcd2 = gqa.g;
                bqa bqa = new bqa(gqa.a);
                this.X = 2;
                if (hcd2.a(bqa, this) == pu3) {
                    return pu3;
                }
            }
        } else if (i == 1 || i == 2) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue;
    }
}
