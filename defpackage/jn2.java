package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: jn2  reason: default package */
public final class jn2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ nn2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jn2(nn2 nn2, Continuation continuation) {
        super(2, continuation);
        this.Y = nn2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jn2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new jn2(this.Y, continuation);
    }

    public final Object o(Object obj) {
        o62 o62;
        String str;
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            nn2 nn2 = this.Y;
            i22 i22 = (i22) nn2.Z0.a.getValue();
            if (!(i22 == null || (o62 = i22.b) == null || (str = o62.I) == null)) {
                this.X = 1;
                if (((l47) nn2.L0.getValue()).a(str, this) == pu3) {
                    return pu3;
                }
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue;
    }
}
