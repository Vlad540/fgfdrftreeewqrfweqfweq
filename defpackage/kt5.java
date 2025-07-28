package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* renamed from: kt5  reason: default package */
public final class kt5 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ qt5 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kt5(qt5 qt5, Continuation continuation) {
        super(2, continuation);
        this.Z = qt5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((kt5) n((List) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        kt5 kt5 = new kt5(this.Z, continuation);
        kt5.Y = obj;
        return kt5;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            List<dr5> list = (List) this.Y;
            s5a s5a = this.Z.X;
            ArrayList arrayList = new ArrayList(q23.H(list, 10));
            for (dr5 dr5 : list) {
                arrayList.add(new r49(dr5.a, dr5.b, dr5.d, dr5.e));
            }
            fn6 fn6 = udd.e;
            if (fn6 != null) {
                s5a.getClass();
                if (fn6.c()) {
                    fn6.d(tn7.X, "OneMeInitialDataStorage", wn6.h(arrayList.size(), "updateFolders by count: "), (Throwable) null);
                }
            }
            ((AtomicReference) ((s49) s5a.c.getValue()).c).set(arrayList);
            ((s49) s5a.c.getValue()).G();
            grd grd = this.Z.w0;
            this.X = 1;
            grd.m((Object) null, list);
            if (jue == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue;
    }
}
