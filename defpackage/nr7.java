package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;
import one.me.android.MainActivity;

/* renamed from: nr7  reason: default package */
public final class nr7 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MainActivity Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nr7(MainActivity mainActivity, Continuation continuation) {
        super(2, continuation);
        this.Y = mainActivity;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nr7) n((Uri) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        nr7 nr7 = new nr7(this.Y, continuation);
        nr7.X = obj;
        return nr7;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        Uri uri = (Uri) this.X;
        String name = this.Y.getClass().getName();
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, name, "handle mytracker link " + uri, (Throwable) null);
        }
        return ((ef7) ((ff7) o2a.a.getAccessor().c(ff7.class)).b.getValue()).e(uri);
    }
}
