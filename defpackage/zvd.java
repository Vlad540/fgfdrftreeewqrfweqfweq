package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: zvd  reason: default package */
public final class zvd extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ cwd Z;
    public final /* synthetic */ xvd w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zvd(cwd cwd, xvd xvd, Continuation continuation) {
        super(2, continuation);
        this.Z = cwd;
        this.w0 = xvd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zvd zvd = new zvd(this.Z, this.w0, continuation);
        zvd.Y = obj;
        return zvd;
    }

    public final Object o(Object obj) {
        ou3 ou3;
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            ou3 ou32 = (ou3) this.Y;
            xvd xvd = this.w0;
            String str = xvd.a;
            long j = xvd.b;
            this.Y = ou32;
            this.X = 1;
            Object b = ((kvd) this.Z.o.getValue()).b(str, j, 50, this);
            if (b == pu3) {
                return pu3;
            }
            ou3 = ou32;
            obj = b;
        } else if (i == 1) {
            ou3 = (ou3) this.Y;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        fvd fvd = (fvd) obj;
        this.Z.A0.updateAndGet(new yvd(fvd, 0));
        String name = ou3.getClass().getName();
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            int size = fvd.a.size();
            long j2 = fvd.b;
            fn6.d(tn7, name, "Stickers search next page. finish, size:" + size + "|marker:" + j2, (Throwable) null);
        }
        List<osd> list = fvd.a;
        cwd cwd = this.Z;
        ArrayList arrayList = new ArrayList(q23.H(list, 10));
        for (osd q : list) {
            arrayList.add(cwd.q(cwd, q));
        }
        this.Z.Z.m((Object) null, new xrc(2, o23.i0(((xrc) this.Z.Z.getValue()).b, arrayList)));
        return jue.a;
    }
}
