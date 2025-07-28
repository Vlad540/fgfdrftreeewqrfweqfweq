package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: to2  reason: default package */
public final class to2 extends l5e implements k26 {
    public final /* synthetic */ int X;
    public /* synthetic */ mda Y;
    public /* synthetic */ pda Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ to2(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        mda mda = (mda) obj;
        pda pda = (pda) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                to2 to2 = new to2(3, continuation, 0);
                to2.Y = mda;
                to2.Z = pda;
                jue jue = jue.a;
                to2.o(jue);
                return jue;
            case 1:
                to2 to22 = new to2(3, continuation, 1);
                to22.Y = mda;
                to22.Z = pda;
                jue jue2 = jue.a;
                to22.o(jue2);
                return jue2;
            default:
                to2 to23 = new to2(3, continuation, 2);
                to23.Y = mda;
                to23.Z = pda;
                jue jue3 = jue.a;
                to23.o(jue3);
                return jue3;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                wx3.H(obj);
                this.Y.onThemeChanged(this.Z);
                return jue.a;
            case 1:
                wx3.H(obj);
                this.Y.onThemeChanged(this.Z);
                return jue.a;
            default:
                wx3.H(obj);
                this.Y.onThemeChanged(this.Z);
                return jue.a;
        }
    }
}
