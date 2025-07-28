package defpackage;

import android.content.Intent;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import one.me.android.MainActivity;
import one.me.android.deeplink.LinkInterceptorActivity;

/* renamed from: or7  reason: default package */
public final class or7 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MainActivity Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public or7(MainActivity mainActivity, Continuation continuation) {
        super(2, continuation);
        this.Y = mainActivity;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((or7) n((ne7) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        or7 or7 = new or7(this.Y, continuation);
        or7.X = obj;
        return or7;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [one.me.android.MainActivity, android.content.Context, android.app.Activity] */
    public final Object o(Object obj) {
        wx3.H(obj);
        int i = LinkInterceptorActivity.O0;
        ? r2 = this.Y;
        Intent intent = new Intent(r2, LinkInterceptorActivity.class);
        intent.putExtra("link:result", (ne7) this.X);
        r2.startActivity(intent);
        g37 g37 = r2.d1;
        if (g37 != null) {
            g37.cancel((CancellationException) null);
        }
        r2.d1 = null;
        return jue.a;
    }
}
