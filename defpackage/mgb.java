package defpackage;

import android.net.Uri;
import androidx.media3.common.PriorityTaskManager$PriorityTooLowException;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: mgb  reason: default package */
public final class mgb implements tl4 {
    public final Executor a;
    public final yz3 b;
    public final iv0 c;
    public final zv0 d;
    public sl4 e;
    public volatile lgb f;
    public volatile boolean g;

    public mgb(l68 l68, gv0 gv0, Executor executor) {
        executor.getClass();
        this.a = executor;
        a68 a68 = l68.b;
        a68.getClass();
        Map emptyMap = Collections.emptyMap();
        Uri uri = a68.a;
        oyb.m(uri, "The uri must be set.");
        String str = a68.f;
        yz3 yz3 = r2;
        yz3 yz32 = new yz3(uri, 0, 1, (byte[]) null, emptyMap, 0, -1, str, 4, (Object) null);
        this.b = yz3;
        iv0 c2 = gv0.c();
        this.c = c2;
        this.d = new zv0(c2, yz3, (byte[]) null, new ss8(22, this));
    }

    public final void a(sl4 sl4) {
        this.e = sl4;
        boolean z = false;
        while (!z) {
            try {
                if (this.g) {
                    break;
                }
                this.f = new lgb(this);
                this.a.execute(this.f);
                this.f.get();
                z = true;
            } catch (ExecutionException e2) {
                Throwable cause = e2.getCause();
                cause.getClass();
                if (!(cause instanceof PriorityTaskManager$PriorityTooLowException)) {
                    if (cause instanceof IOException) {
                        throw ((IOException) cause);
                    }
                    int i = oze.a;
                    throw cause;
                }
            } catch (Throwable th) {
                lgb lgb = this.f;
                lgb.getClass();
                lgb.a();
                throw th;
            }
        }
        lgb lgb2 = this.f;
        lgb2.getClass();
        lgb2.a();
    }

    public final void cancel() {
        this.g = true;
        lgb lgb = this.f;
        if (lgb != null) {
            lgb.cancel(true);
        }
    }

    public final void remove() {
        iv0 iv0 = this.c;
        ((mgd) iv0.a).l(iv0.X.g(this.b));
    }
}
