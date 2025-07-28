package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: kz2  reason: default package */
public final class kz2 extends l5e implements i26 {
    public final /* synthetic */ lz2 X;
    public final /* synthetic */ long Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kz2(lz2 lz2, long j, Continuation continuation) {
        super(2, continuation);
        this.X = lz2;
        this.Y = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((kz2) n((ou3) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new kz2(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        lz2 lz2 = this.X;
        String str = lz2.a;
        t97 t97 = lz2.c;
        String str2 = lz2.a;
        StringBuilder sb = new StringBuilder("cancelAllRunningDraftTasks for chat ");
        long j = this.Y;
        sb.append(j);
        udd.p(str, sb.toString(), new Object[0]);
        try {
            List<zde> i = ((jee) t97.getValue()).i(lz2.d);
            int size = i.size();
            udd.p(str2, "cancelAllRunningDraftTasks: all tasks count = " + size, new Object[0]);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (zde zde : i) {
                xl4 xl4 = zde.f;
                if (xl4 instanceof xl4) {
                    if (xl4.o == j) {
                    }
                } else if (xl4 instanceof bm4) {
                    if (((bm4) xl4).o != j) {
                    }
                }
                linkedHashSet.add(new Long(zde.a));
            }
            ((jee) t97.getValue()).e(linkedHashSet);
            int size2 = linkedHashSet.size();
            udd.p(str2, "cancelAllRunningDraftTasks: removed tasks count = " + size2, new Object[0]);
        } catch (Throwable th) {
            udd.s(str2, "cancelAllRunningDraftTasks: error!", th);
        }
        return jue.a;
    }
}
