package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: gu8  reason: default package */
public final class gu8 extends l5e implements i26 {
    public final /* synthetic */ nu8 X;
    public final /* synthetic */ CharSequence Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gu8(nu8 nu8, CharSequence charSequence, Continuation continuation) {
        super(2, continuation);
        this.X = nu8;
        this.Y = charSequence;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new gu8(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        nu8 nu8 = this.X;
        i22 i22 = (i22) nu8.b.getValue();
        Long l = i22 != null ? new Long(i22.b.a) : null;
        CharSequence charSequence = this.Y;
        if (!(charSequence == null || charSequence.length() == 0 || l == null)) {
            eha eha = (eha) nu8.B0.getValue();
            long longValue = l.longValue();
            if (longValue == 0) {
                eha.getClass();
            } else {
                eha.f(longValue, (e00) null, 0);
            }
        }
        return jue.a;
    }
}
