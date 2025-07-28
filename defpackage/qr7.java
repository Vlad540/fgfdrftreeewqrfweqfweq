package defpackage;

import com.jakewharton.processphoenix.ProcessPhoenix;
import kotlin.coroutines.Continuation;
import one.me.android.MainActivity;

/* renamed from: qr7  reason: default package */
public final class qr7 extends l5e implements i26 {
    public /* synthetic */ boolean X;
    public final /* synthetic */ MainActivity Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qr7(MainActivity mainActivity, Continuation continuation) {
        super(2, continuation);
        this.Y = mainActivity;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        jue jue = jue.a;
        ((qr7) n(bool, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        qr7 qr7 = new qr7(this.Y, continuation);
        qr7.X = ((Boolean) obj).booleanValue();
        return qr7;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [one.me.android.MainActivity, android.content.Context] */
    public final Object o(Object obj) {
        wx3.H(obj);
        if (this.X) {
            ProcessPhoenix.b(this.Y);
        }
        return jue.a;
    }
}
