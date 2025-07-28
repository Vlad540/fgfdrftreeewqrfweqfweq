package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: t7b  reason: default package */
public final class t7b extends l5e implements k26 {
    public final /* synthetic */ int X;
    public /* synthetic */ nea Y;
    public /* synthetic */ pda Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t7b(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        nea nea = (nea) obj;
        pda pda = (pda) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                t7b t7b = new t7b(3, continuation, 0);
                t7b.Y = nea;
                t7b.Z = pda;
                jue jue = jue.a;
                t7b.o(jue);
                return jue;
            default:
                t7b t7b2 = new t7b(3, continuation, 1);
                t7b2.Y = nea;
                t7b2.Z = pda;
                jue jue2 = jue.a;
                t7b2.o(jue2);
                return jue2;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                wx3.H(obj);
                this.Y.setBackgroundColor(this.Z.b().h);
                return jue.a;
            default:
                wx3.H(obj);
                this.Y.setBackgroundColor(this.Z.b().i);
                return jue.a;
        }
    }
}
