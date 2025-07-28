package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: fe8  reason: default package */
public final /* synthetic */ class fe8 implements nf3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ic8 b;
    public final /* synthetic */ int c;

    public /* synthetic */ fe8(ic8 ic8, int i, int i2) {
        this.a = i2;
        this.b = ic8;
        this.c = i;
    }

    public final void accept(Object obj) {
        gb7 gb7;
        p2d p2d;
        int i = this.c;
        ic8 ic8 = this.b;
        int i2 = -1;
        switch (this.a) {
            case 0:
                try {
                    gb7 = (gb7) ((ch7) obj).get();
                    oyb.h(gb7, "LibraryResult must not be null");
                } catch (CancellationException e) {
                    ez3.k0("Library operation cancelled", e);
                    String str = gb7.g;
                    f2d f2d = new f2d("no error message provided", 1, Bundle.EMPTY);
                    gb7 = new gb7(f2d.a, SystemClock.elapsedRealtime(), (h78) null, f2d, (Object) null, 4);
                } catch (InterruptedException | ExecutionException e2) {
                    ez3.k0("Library operation failed", e2);
                    String str2 = gb7.g;
                    f2d f2d2 = new f2d("no error message provided", -1, Bundle.EMPTY);
                    gb7 = new gb7(f2d2.a, SystemClock.elapsedRealtime(), (h78) null, f2d2, (Object) null, 4);
                }
                try {
                    hc8 hc8 = ic8.d;
                    oyb.l(hc8);
                    hc8.f(i, gb7);
                    return;
                } catch (RemoteException e3) {
                    ez3.k0("Failed to send result to browser " + ic8, e3);
                    return;
                }
            default:
                try {
                    p2d = (p2d) ((ch7) obj).get();
                    oyb.h(p2d, "SessionResult must not be null");
                } catch (CancellationException e4) {
                    ez3.k0("Session operation cancelled", e4);
                    p2d = new p2d(1);
                } catch (InterruptedException | ExecutionException e5) {
                    ez3.k0("Session operation failed", e5);
                    if (e5.getCause() instanceof UnsupportedOperationException) {
                        i2 = -6;
                    }
                    p2d = new p2d(i2);
                }
                me8.M0(ic8, i, p2d);
                return;
        }
    }
}
