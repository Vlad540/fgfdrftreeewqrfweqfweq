package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zi9  reason: default package */
public final class zi9 extends l5e implements k26 {
    public final /* synthetic */ int X;
    public /* synthetic */ fm Y;
    public /* synthetic */ pda Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zi9(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        fm fmVar = (fm) obj;
        pda pda = (pda) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                zi9 zi9 = new zi9(3, continuation, 0);
                zi9.Y = fmVar;
                zi9.Z = pda;
                jue jue = jue.a;
                zi9.o(jue);
                return jue;
            default:
                zi9 zi92 = new zi9(3, continuation, 1);
                zi92.Y = fmVar;
                zi92.Z = pda;
                jue jue2 = jue.a;
                zi92.o(jue2);
                return jue2;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                wx3.H(obj);
                this.Y.setBackgroundColor(this.Z.b().i);
                return jue.a;
            default:
                wx3.H(obj);
                this.Y.setBackgroundColor(this.Z.b().h);
                return jue.a;
        }
    }
}
