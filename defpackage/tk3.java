package defpackage;

import android.net.Uri;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: tk3  reason: default package */
public final class tk3 extends l5e implements i26 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ String Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tk3(Object obj, Continuation continuation, String str) {
        super(2, continuation);
        this.X = obj;
        this.Y = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tk3) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new tk3(this.X, continuation, this.Y);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        boa boa = (boa) this.X;
        long j = (long) boa.a;
        List k0 = x87.k0(boa);
        String str = boa.g;
        return new lk3(j, boa.b, (String) null, k0, (CharSequence) null, this.Y, str != null ? Uri.parse(str) : null, false, false, boa.a(), false, boa, 0, false, 29696);
    }
}
