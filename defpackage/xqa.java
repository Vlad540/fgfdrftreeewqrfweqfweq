package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: xqa  reason: default package */
public final class xqa extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ flb Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xqa(flb flb, Continuation continuation) {
        super(2, continuation);
        this.Y = flb;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((xqa) n((sra) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xqa xqa = new xqa(this.Y, continuation);
        xqa.X = obj;
        return xqa;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        sra sra = (sra) this.X;
        flb flb = this.Y;
        if (sra == null) {
            flb.setVisibility(8);
        } else {
            flb.setVisibility(0);
            CharSequence a = sra.a.a(flb.getContext());
            if (a != null) {
                flb.setTitle(a);
                mge mge = sra.b;
                flb.setBody(mge != null ? mge.a(flb.getContext()) : null);
                flb.a(sra.c, sra.e);
                flb.setCounter(sra.d);
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        return jue.a;
    }
}
