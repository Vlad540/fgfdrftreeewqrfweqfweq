package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: nv8  reason: default package */
public final class nv8 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageWriteWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nv8(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.Y = messageWriteWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((r2e) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        nv8 nv8 = new nv8(continuation, this.Y);
        nv8.X = obj;
        return nv8;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        r2e r2e = (r2e) this.X;
        MessageWriteWidget messageWriteWidget = this.Y;
        nq3 nq3 = messageWriteWidget.F0;
        if (nq3 != null) {
            nq3.dismiss();
        }
        if (r2e != null) {
            x2e x2e = r2e.b;
            if (!x2e.Y.isEmpty()) {
                List list = x2e.Y;
                ArrayList arrayList = new ArrayList(q23.H(list, 10));
                int i = 0;
                for (Object next : list) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        arrayList.add(new pq3(i, (mge) new lge((String) next), (Integer) null, (Integer) null, 28));
                        i = i2;
                    } else {
                        p23.G();
                        throw null;
                    }
                }
                nq3 build = pfa.a(1).j(r2e.a).e(arrayList).b().build();
                build.q(messageWriteWidget);
                messageWriteWidget.F0 = build;
            }
        }
        return jue.a;
    }
}
