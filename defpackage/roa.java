package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: roa  reason: default package */
public final class roa extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ List Y;
    public final /* synthetic */ voa Z;
    public final /* synthetic */ List w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public roa(List list, voa voa, List list2, Continuation continuation) {
        super(2, continuation);
        this.Y = list;
        this.Z = voa;
        this.w0 = list2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        roa roa = new roa(this.Y, this.Z, this.w0, continuation);
        roa.X = obj;
        return roa;
    }

    public final Object o(Object obj) {
        String str;
        wx3.H(obj);
        ou3 ou3 = (ou3) this.X;
        ArrayList arrayList = new ArrayList();
        for (ioa ioa : this.Y) {
            if (!n1g.A(ou3)) {
                return hw4.a;
            }
            ioa b = voa.b(this.Z, ioa, this.w0);
            if (b == null || (str = b.X) == null || str.length() == 0) {
                arrayList.add(new ioa(ioa.b, ioa.c, ioa.o, (String) null, ioa.Y, (String) null, (String) null, (String) null, (String) null, 0));
            }
        }
        return arrayList;
    }
}
