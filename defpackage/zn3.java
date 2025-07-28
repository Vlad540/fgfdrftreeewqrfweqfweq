package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: zn3  reason: default package */
public final class zn3 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ long Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zn3(long j, Continuation continuation) {
        super(2, continuation);
        this.Y = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zn3) n((lk3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zn3 zn3 = new zn3(this.Y, continuation);
        zn3.X = obj;
        return zn3;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        lk3 lk3 = (lk3) this.X;
        long j = lk3.a;
        String obj2 = lk3.b.toString();
        Uri uri = lk3.Z;
        String uri2 = uri != null ? uri.toString() : null;
        if (uri2 == null) {
            uri2 = BuildConfig.FLAVOR;
        }
        return new kta(this.Y, j, lk3.y0, obj2, uri2);
    }
}
