package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: xxd  reason: default package */
public final class xxd extends l5e implements i26 {
    public int X;
    public final /* synthetic */ kyd Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xxd(kyd kyd, Continuation continuation) {
        super(2, continuation);
        this.Y = kyd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xxd(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        kyd kyd = this.Y;
        if (i == 0) {
            wx3.H(obj);
            k77[] k77Arr = kyd.G0;
            au9 a = ((fa5) kyd.Z.getValue()).a();
            this.X = 1;
            obj = e07.e(a, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else if (i == 2) {
            wx3.H(obj);
            taf.o(kyd.E0, new p6d(phc.x, new hge(sca.x)));
            return jue;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Iterable<osd> iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(q23.H(iterable, 10));
        for (osd osd : iterable) {
            arrayList.add(new Long(osd.a));
        }
        if (arrayList.isEmpty()) {
            return jue;
        }
        k77[] k77Arr2 = kyd.G0;
        j73 d = ((fa5) kyd.Z.getValue()).d(arrayList);
        this.X = 2;
        if (e07.c(d, this) == pu3) {
            return pu3;
        }
        taf.o(kyd.E0, new p6d(phc.x, new hge(sca.x)));
        return jue;
    }
}
