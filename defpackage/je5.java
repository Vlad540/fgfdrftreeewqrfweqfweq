package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: je5  reason: default package */
public final class je5 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ le5 Y;
    public final /* synthetic */ String Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public je5(le5 le5, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = le5;
        this.Z = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new je5(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            le5 le5 = this.Y;
            djc djc = new djc(new fk5(le5.c, new ck5(le5.m, new ge5(this.Z, (Continuation) null)), new gw2(11, le5), (Continuation) null));
            bw bwVar = new bw(7, (Object) le5);
            this.X = 1;
            if (djc.c(bwVar, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
