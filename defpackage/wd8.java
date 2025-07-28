package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: wd8  reason: default package */
public final class wd8 extends Service {
    public static final /* synthetic */ int A0 = 0;
    public final yr X = new kgd(0);
    public l18 Y;
    public final fx Z;
    public q18 a;
    public final x3a b = new x3a(18, (Object) this);
    public final l18 c = new l18(this, "android.media.session.MediaController", -1, -1, (v18) null);
    public final ArrayList o = new ArrayList();
    public uc8 w0;
    public final rd8 x0;
    public final cd8 y0;
    public final nxc z0;

    /* JADX WARNING: type inference failed for: r0v3, types: [kgd, yr] */
    public wd8(cd8 cd8) {
        fx fxVar = new fx();
        fxVar.b = this;
        this.Z = fxVar;
        this.x0 = rd8.a(cd8.f);
        this.y0 = cd8;
        this.z0 = new nxc(cd8);
    }

    public final void a(uc8 uc8) {
        attachBaseContext(this.y0.f);
        onCreate();
        if (uc8 == null) {
            throw new IllegalArgumentException("Session token may not be null");
        } else if (this.w0 == null) {
            this.w0 = uc8;
            q18 q18 = this.a;
            q18.getClass();
            ((wd8) q18.d).Z.d(new p36((Object) q18, (Object) uc8, false, 11));
        } else {
            throw new IllegalStateException("The session token has already been set");
        }
    }

    public final nu7 b(Bundle bundle) {
        q18 q18 = this.a;
        q18.getClass();
        pd8 K = q18.K();
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        ic8 ic8 = new ic8(K, 0, 0, this.x0.b(K), (hc8) null, bundle);
        AtomicReference atomicReference = new AtomicReference();
        ga3 ga3 = new ga3(false, 1);
        oze.W(this.y0.l, new wc3((Object) this, (Object) atomicReference, (Object) ic8, (Object) ga3, 8));
        try {
            ga3.a();
            gc8 gc8 = (gc8) atomicReference.get();
            gc8.getClass();
            this.z0.l(K, ic8, gc8.a, gc8.b);
            return am7.c;
        } catch (InterruptedException e) {
            ez3.B("Couldn't get a result from onConnect", e);
            return null;
        }
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public final IBinder onBind(Intent intent) {
        q18 q18 = this.a;
        q18.getClass();
        o18 o18 = (o18) q18.b;
        o18.getClass();
        return o18.onBind(intent);
    }

    public final void onCreate() {
        super.onCreate();
        q18 q18 = new q18(this);
        this.a = q18;
        q18.J();
    }

    public final void onDestroy() {
        this.Z.b = null;
    }
}
