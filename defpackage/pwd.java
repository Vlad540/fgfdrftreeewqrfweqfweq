package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: pwd  reason: default package */
public final class pwd extends l5e implements i26 {
    public gvd X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ String w0;
    public final /* synthetic */ qwd x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pwd(String str, qwd qwd, Continuation continuation) {
        super(2, continuation);
        this.w0 = str;
        this.x0 = qwd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        pwd pwd = new pwd(this.w0, this.x0, continuation);
        pwd.Z = obj;
        return pwd;
    }

    public final Object o(Object obj) {
        ou3 ou3;
        gvd gvd;
        fn6 fn6;
        ou3 ou32;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            ou3 ou33 = (ou3) this.Z;
            String str = this.w0;
            if (str == null || str.length() == 0) {
                qwd qwd = this.x0;
                k77[] k77Arr = qwd.j;
                qwd.d.setValue(qwd.k);
                qwd.g.set(new mwd((String) null, 3));
                return jue;
            }
            this.x0.g.updateAndGet(new awd(this.w0, 1));
            String str2 = this.w0;
            this.Z = ou33;
            this.Y = 1;
            Object d = kvd.d((kvd) this.x0.b.getValue(), str2, 0, this, 6);
            if (d == pu3) {
                return pu3;
            }
            Object obj2 = d;
            ou32 = ou33;
            obj = obj2;
        } else if (i == 1) {
            ou32 = (ou3) this.Z;
            wx3.H(obj);
        } else if (i == 2) {
            gvd = this.X;
            ou3 = (ou3) this.Z;
            wx3.H(obj);
            List list = (List) obj;
            this.x0.g.updateAndGet(new iwd(gvd, 2));
            String name = ou3.getClass().getName();
            fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                tn7 tn7 = tn7.X;
                int size = gvd.a.size();
                long j = gvd.b;
                fn6.d(tn7, name, "Stickers sets search. finish, size:" + size + "|marker:" + j, (Throwable) null);
            }
            this.x0.d.m((Object) null, new nwd(2, false, list));
            return jue;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        gvd gvd2 = (gvd) obj;
        phd c = ((lud) this.x0.a.getValue()).c(gvd2.a);
        this.Z = ou32;
        this.X = gvd2;
        this.Y = 2;
        Object d2 = e07.d(c, this);
        if (d2 == pu3) {
            return pu3;
        }
        ou3 = ou32;
        gvd = gvd2;
        obj = d2;
        List list2 = (List) obj;
        this.x0.g.updateAndGet(new iwd(gvd, 2));
        String name2 = ou3.getClass().getName();
        fn6 = udd.e;
        tn7 tn72 = tn7.X;
        int size2 = gvd.a.size();
        long j2 = gvd.b;
        fn6.d(tn72, name2, "Stickers sets search. finish, size:" + size2 + "|marker:" + j2, (Throwable) null);
        this.x0.d.m((Object) null, new nwd(2, false, list2));
        return jue;
    }
}
