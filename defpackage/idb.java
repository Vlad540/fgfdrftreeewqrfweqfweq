package defpackage;

import java.util.HashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: idb  reason: default package */
public final class idb extends l5e implements i26 {
    public int X;
    public final /* synthetic */ jdb Y;
    public final /* synthetic */ Map Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public idb(jdb jdb, HashMap hashMap, Continuation continuation) {
        super(2, continuation);
        this.Y = jdb;
        this.Z = hashMap;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new idb(this.Y, (HashMap) this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            jdb jdb = this.Y;
            if (!((ed3) jdb.Z.getValue()).f()) {
                hcd hcd = jdb.x0;
                Boolean bool = Boolean.TRUE;
                this.X = 1;
                if (hcd.a(bool, this) == pu3) {
                    return pu3;
                }
            } else {
                i22 i22 = (i22) ((aw2) ((bv2) jdb.c.getValue())).m(jdb.b).a.getValue();
                if (i22 == null) {
                    return jue;
                }
                jdb.C0.set(((gy9) ((pk) jdb.X.getValue())).l(i22.a, i22.b.a, 0, (String) null, false, (HashMap) this.Z));
                return jue;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue;
    }
}
