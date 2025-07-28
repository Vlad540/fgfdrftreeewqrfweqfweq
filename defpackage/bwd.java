package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: bwd  reason: default package */
public final class bwd extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ cwd w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bwd(String str, cwd cwd, Continuation continuation) {
        super(2, continuation);
        this.Z = str;
        this.w0 = cwd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        bwd bwd = new bwd(this.Z, this.w0, continuation);
        bwd.Y = obj;
        return bwd;
    }

    public final Object o(Object obj) {
        ou3 ou3;
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        int i2 = 2;
        if (i == 0) {
            wx3.H(obj);
            ou3 ou32 = (ou3) this.Y;
            String str = this.Z;
            if (str == null || str.length() == 0) {
                this.w0.A0.updateAndGet(new pb2(9));
                this.w0.Z.m((Object) null, new xrc(2, (List) this.w0.z0.get()));
                return jue;
            }
            this.w0.A0.updateAndGet(new awd(this.Z, 0));
            String str2 = this.Z;
            this.Y = ou32;
            this.X = 1;
            Object b = ((kvd) this.w0.o.getValue()).b(str2, 0, 50, this);
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
        this.w0.A0.updateAndGet(new yvd(fvd, 1));
        String name = ou3.getClass().getName();
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            int size = fvd.a.size();
            long j = fvd.b;
            fn6.d(tn7, name, "Stickers search. finish, size:" + size + "|marker:" + j, (Throwable) null);
        }
        List<osd> list = fvd.a;
        cwd cwd = this.w0;
        ArrayList arrayList = new ArrayList(q23.H(list, 10));
        for (osd q : list) {
            arrayList.add(cwd.q(cwd, q));
        }
        if (arrayList.isEmpty()) {
            i2 = 3;
        }
        this.w0.Z.m((Object) null, new xrc(i2, arrayList));
        return jue;
    }
}
