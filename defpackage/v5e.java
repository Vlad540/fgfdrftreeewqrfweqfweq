package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.transfer.exceptions.HttpUrlExpiredException;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: v5e  reason: default package */
public final class v5e extends l5e implements m26 {
    public final /* synthetic */ int X;
    public /* synthetic */ Throwable Y;
    public final /* synthetic */ Object Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v5e(Object obj, Continuation continuation, int i) {
        super(4, continuation);
        this.X = i;
        this.Z = obj;
    }

    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.X;
        rj5 rj5 = (rj5) obj;
        Throwable th = (Throwable) obj2;
        ((Number) obj3).longValue();
        Continuation continuation = (Continuation) obj4;
        switch (i) {
            case 0:
                v5e v5e = new v5e((h6e) this.Z, continuation, 0);
                v5e.Y = th;
                return v5e.o(jue.a);
            default:
                v5e v5e2 = new v5e((n6e) this.Z, continuation, 1);
                v5e2.Y = th;
                return v5e2.o(jue.a);
        }
    }

    public final Object o(Object obj) {
        boolean z;
        switch (this.X) {
            case 0:
                wx3.H(obj);
                if (this.Y instanceof HttpUrlExpiredException) {
                    String str = ((h6e) this.Z).b;
                    fn6 fn6 = udd.e;
                    if (fn6 != null && fn6.c()) {
                        fn6.d(tn7.Z, str, "Got error about expired URL, retry upload", (Throwable) null);
                    }
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                wx3.H(obj);
                Throwable th = this.Y;
                ((n6e) this.Z).getClass();
                return Boolean.valueOf((th instanceof TamErrorException) && "invalid.token".equals(((TamErrorException) th).a.b));
        }
    }
}
