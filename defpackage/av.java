package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: av  reason: default package */
public final class av extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ fw Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ z63 w0;
    public final /* synthetic */ z63 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public av(fw fwVar, long j, a73 a73, a73 a732, Continuation continuation) {
        super(2, continuation);
        this.Y = fwVar;
        this.Z = j;
        this.w0 = a73;
        this.x0 = a732;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        av avVar = new av(this.Y, this.Z, this.w0, this.x0, continuation);
        avVar.X = obj;
        return avVar;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ou3 ou3 = (ou3) this.X;
        fw fwVar = this.Y;
        hu3 hu3 = fwVar.t;
        n3a n3a = fwVar.b;
        xs7.E(ou3, hu3.plus(n3a.b()), (ru3) null, new yu(this.Y, this.Z, this.w0, (Continuation) null), 2);
        return xs7.E(ou3, fwVar.t.plus(n3a.b()), (ru3) null, new zu(this.Y, this.Z, this.x0, (Continuation) null), 2);
    }
}
