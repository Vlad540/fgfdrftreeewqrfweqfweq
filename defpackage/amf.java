package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: amf  reason: default package */
public final class amf extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;

    public final Object invoke(Object obj, Object obj2) {
        return n((oia) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        l5e l5e = new l5e(2, continuation);
        l5e.Y = obj;
        return l5e;
    }

    public final Object o(Object obj) {
        oia oia;
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            oia oia2 = (oia) this.Y;
            if (oia2 != oia.b) {
                return oia2;
            }
            this.Y = oia2;
            this.X = 1;
            if (ek8.q(600, this) == pu3) {
                return pu3;
            }
            oia = oia2;
        } else if (i == 1) {
            oia = (oia) this.Y;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return oia;
    }
}
