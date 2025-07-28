package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: qv  reason: default package */
public final class qv extends l5e implements k26 {
    public /* synthetic */ List X;
    public /* synthetic */ long Y;
    public final /* synthetic */ fw Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qv(fw fwVar, Continuation continuation) {
        super(3, continuation);
        this.Z = fwVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long longValue = ((Number) obj2).longValue();
        qv qvVar = new qv(this.Z, (Continuation) obj3);
        qvVar.X = (List) obj;
        qvVar.Y = longValue;
        return qvVar.o(jue.a);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        List list = this.X;
        long j = this.Y;
        k77[] k77Arr = fw.F;
        fw fwVar = this.Z;
        List l = fwVar.l(j);
        kh6 kh6 = fwVar.c;
        if (kh6 != null) {
            StringBuilder i = rf0.i("getHistoryItems return ", l.size(), " out of total ", list.size(), " around ");
            i.append(j);
            kh6.c(i.toString());
        }
        return l;
    }
}
