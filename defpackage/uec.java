package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: uec  reason: default package */
public final class uec extends l5e implements i26 {
    public int X;
    public final /* synthetic */ zec Y;
    public final /* synthetic */ List Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uec(zec zec, List list, Continuation continuation) {
        super(2, continuation);
        this.Y = zec;
        this.Z = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new uec(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            dsd a = this.Y.a();
            List<on7> list = this.Z;
            ArrayList arrayList = new ArrayList(q23.H(list, 10));
            for (on7 on7 : list) {
                arrayList.add(new rqd(on7.c, on7.b, on7.X, on7.o));
            }
            this.X = 1;
            a.getClass();
            if (r1g.h(a.a, new bsd(a, arrayList, 1), this) == pu3) {
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
