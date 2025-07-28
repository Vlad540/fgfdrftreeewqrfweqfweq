package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: k57  reason: default package */
public final class k57 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ b0d w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k57(String str, String str2, b0d b0d, Continuation continuation) {
        super(2, continuation);
        this.Y = str;
        this.Z = str2;
        this.w0 = b0d;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new k57(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        Object obj2;
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            StringBuilder sb = new StringBuilder("Process js event: ");
            String str = this.Y;
            sb.append(str);
            sb.append(", data = ");
            String str2 = this.Z;
            sb.append(str2);
            udd.H("JsBridge", sb.toString(), (Throwable) null);
            Iterator it = ((List) this.w0.o).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((q57) obj2).c().contains(str)) {
                    break;
                }
            }
            q57 q57 = (q57) obj2;
            if (q57 != null) {
                this.X = 1;
                if (q57.a(str, str2, this) == pu3) {
                    return pu3;
                }
            } else {
                udd.s("JsBridge", "Unhandled method " + str + " in JsBridge", (Throwable) null);
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
