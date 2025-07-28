package defpackage;

import android.graphics.SurfaceTexture;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: v65  reason: default package */
public final /* synthetic */ class v65 implements i4f {
    public final /* synthetic */ int a;
    public final /* synthetic */ y65 b;

    public /* synthetic */ v65(y65 y65, int i) {
        this.a = i;
        this.b = y65;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.I0 = false;
                return;
            case 1:
                y65 y65 = this.b;
                y65.F0 = null;
                if (!y65.E0 || !y65.y0.isEmpty()) {
                    y65.B();
                    return;
                }
                y65.E0 = false;
                u65 u65 = y65.X;
                u65.getClass();
                ((lh0) u65).c();
                b24.a();
                ScheduledFuture scheduledFuture = y65.H0;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                y65.H0 = null;
                return;
            case 2:
                y65 y652 = this.b;
                ConcurrentLinkedQueue concurrentLinkedQueue = y652.y0;
                int size = concurrentLinkedQueue.size();
                int i = y652.D0;
                Locale locale = Locale.US;
                StringBuilder m = me4.m(size, "Forcing EOS after missing ", " frames for ");
                m.append(y65.L0);
                m.append(" ms, with available frame count: ");
                m.append(i);
                ez3.j0(m.toString());
                y652.E0 = false;
                y652.F0 = null;
                y652.I0 = true;
                while (true) {
                    int i2 = y652.D0;
                    if (i2 > 0) {
                        y652.D0 = i2 - 1;
                        y652.w0.updateTexImage();
                        y652.y0.remove();
                    } else {
                        concurrentLinkedQueue.clear();
                        y652.z();
                        return;
                    }
                }
            case 3:
                y65 y653 = this.b;
                if (!y653.y0.isEmpty() || y653.F0 != null) {
                    y653.E0 = true;
                    ScheduledFuture scheduledFuture2 = y653.H0;
                    if (scheduledFuture2 != null) {
                        scheduledFuture2.cancel(false);
                    }
                    y653.H0 = null;
                    y653.H0 = y653.z0.schedule(new oc4(16, y653), y65.L0, TimeUnit.MILLISECONDS);
                    return;
                }
                u65 u652 = y653.X;
                u652.getClass();
                ((lh0) u652).c();
                b24.a();
                ScheduledFuture scheduledFuture3 = y653.H0;
                if (scheduledFuture3 != null) {
                    scheduledFuture3.cancel(false);
                }
                y653.H0 = null;
                return;
            case 4:
                y65 y654 = this.b;
                y654.getClass();
                b24.a();
                if (y654.I0) {
                    SurfaceTexture surfaceTexture = y654.w0;
                    surfaceTexture.updateTexImage();
                    ez3.j0("Dropping frame received on SurfaceTexture after forcing EOS: " + (surfaceTexture.getTimestamp() / 1000));
                    return;
                }
                if (y654.E0) {
                    ScheduledFuture scheduledFuture4 = y654.H0;
                    if (scheduledFuture4 != null) {
                        scheduledFuture4.cancel(false);
                    }
                    y654.H0 = null;
                    y654.H0 = y654.z0.schedule(new oc4(16, y654), y65.L0, TimeUnit.MILLISECONDS);
                }
                y654.D0++;
                y654.B();
                return;
            default:
                y65 y655 = this.b;
                y655.C0++;
                y655.B();
                return;
        }
    }
}
