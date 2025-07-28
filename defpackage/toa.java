package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: toa  reason: default package */
public final class toa extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ List Y;
    public final /* synthetic */ voa Z;
    public final /* synthetic */ List w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public toa(ArrayList arrayList, voa voa, ArrayList arrayList2, Continuation continuation) {
        super(2, continuation);
        this.Y = arrayList;
        this.Z = voa;
        this.w0 = arrayList2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        toa toa = new toa((ArrayList) this.Y, this.Z, (ArrayList) this.w0, continuation);
        toa.X = obj;
        return toa;
    }

    public final Object o(Object obj) {
        toa toa = this;
        wx3.H(obj);
        ou3 ou3 = (ou3) toa.X;
        ArrayList arrayList = new ArrayList();
        for (ioa ioa : toa.Y) {
            if (!n1g.A(ou3)) {
                return hw4.a;
            }
            ioa b = voa.b(toa.Z, ioa, toa.w0);
            if (b == null || b.equals(ioa)) {
                toa = this;
            } else {
                int t = hr1.t(hhd.f(ioa.X, b.X) ? b.z0 : ioa.z0);
                String str = ioa.x0;
                String str2 = ioa.y0;
                long j = b.b;
                long j2 = b.c;
                int i = ioa.o;
                String str3 = ioa.X;
                long j3 = b.Y;
                ioa ioa2 = r7;
                ioa ioa3 = new ioa(j, j2, i, str3, j3, (String) null, ioa.w0, str, str2, t);
                arrayList.add(ioa2);
                toa = this;
                ou3 = ou3;
            }
        }
        return arrayList;
    }
}
