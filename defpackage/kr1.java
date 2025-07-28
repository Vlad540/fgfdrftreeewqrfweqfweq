package defpackage;

import android.hardware.camera2.CameraDevice;
import android.os.SystemClock;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: kr1  reason: default package */
public final class kr1 extends CameraDevice.StateCallback {
    public final Executor a;
    public final ScheduledExecutorService b;
    public jr1 c;
    public ScheduledFuture d;
    public final ir1 e;
    public final /* synthetic */ lr1 f;

    /* JADX WARNING: type inference failed for: r1v1, types: [ir1, java.lang.Object] */
    public kr1(lr1 lr1, ryc ryc, vd6 vd6, long j) {
        this.f = lr1;
        this.a = ryc;
        this.b = vd6;
        ? obj = new Object();
        obj.c = this;
        obj.b = -1;
        obj.a = j;
        this.e = obj;
    }

    public final boolean a() {
        if (this.d == null) {
            return false;
        }
        Objects.toString(this.c);
        this.f.toString();
        this.c.b = true;
        this.c = null;
        this.d.cancel(false);
        this.d = null;
        return true;
    }

    public final void b() {
        boolean z = true;
        e07.p((String) null, this.c == null);
        if (this.d != null) {
            z = false;
        }
        e07.p((String) null, z);
        ir1 ir1 = this.e;
        ir1.getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        if (ir1.b == -1) {
            ir1.b = uptimeMillis;
        }
        int i = ((uptimeMillis - ir1.b) > ((long) ir1.b()) ? 1 : ((uptimeMillis - ir1.b) == ((long) ir1.b()) ? 0 : -1));
        lr1 lr1 = this.f;
        if (i >= 0) {
            ir1.b = -1;
            ir1.b();
            lr1.E(4, (u80) null, false);
            return;
        }
        this.c = new jr1(this, 0, this.a);
        ir1.a();
        Objects.toString(this.c);
        boolean z2 = lr1.R0;
        lr1.toString();
        this.d = this.b.schedule(this.c, (long) ir1.a(), TimeUnit.MILLISECONDS);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r2 = r2.z0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c() {
        /*
            r2 = this;
            lr1 r2 = r2.f
            boolean r0 = r2.R0
            if (r0 == 0) goto L_0x000f
            int r2 = r2.z0
            r0 = 1
            if (r2 == r0) goto L_0x0010
            r1 = 2
            if (r2 != r1) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kr1.c():boolean");
    }

    public final void onClosed(CameraDevice cameraDevice) {
        this.f.toString();
        boolean z = this.f.y0 == null;
        e07.p("Unexpected onClose callback on camera device: " + cameraDevice, z);
        int t = hr1.t(this.f.W0);
        if (t == 1 || t == 4) {
            e07.p((String) null, this.f.B0.isEmpty());
            this.f.s();
        } else if (t == 5 || t == 6) {
            lr1 lr1 = this.f;
            int i = lr1.z0;
            if (i != 0) {
                "Camera closed due to error: ".concat(lr1.v(i));
                lr1.toString();
                b();
                return;
            }
            lr1.J(false);
        } else {
            throw new IllegalStateException("Camera closed while in state: ".concat(rf0.q(this.f.W0)));
        }
    }

    public final void onDisconnected(CameraDevice cameraDevice) {
        this.f.toString();
        onError(cameraDevice, 1);
    }

    public final void onError(CameraDevice cameraDevice, int i) {
        lr1 lr1 = this.f;
        lr1.y0 = cameraDevice;
        lr1.z0 = i;
        nu7 nu7 = lr1.V0;
        ((lr1) nu7.b).toString();
        nu7.i();
        int t = hr1.t(this.f.W0);
        if (t != 1) {
            switch (t) {
                case 4:
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    cameraDevice.getId();
                    rf0.n(this.f.W0);
                    int i2 = 6;
                    boolean z = false;
                    e07.p("Attempt to handle open error from non open state: ".concat(rf0.q(this.f.W0)), this.f.W0 == 8 || this.f.W0 == 9 || this.f.W0 == 10 || this.f.W0 == 7 || this.f.W0 == 6);
                    int i3 = 3;
                    if (i == 1 || i == 2 || i == 4) {
                        cameraDevice.getId();
                        lr1 lr12 = this.f;
                        if (lr12.z0 != 0) {
                            z = true;
                        }
                        e07.p("Can only reopen camera device after error if the camera device is actually in an error state.", z);
                        if (i == 1) {
                            i3 = 2;
                        } else if (i == 2) {
                            i3 = 1;
                        }
                        lr12.E(7, new u80((Throwable) null, i3), true);
                        lr12.r();
                        return;
                    }
                    cameraDevice.getId();
                    if (i == 3) {
                        i2 = 5;
                    }
                    this.f.E(5, new u80((Throwable) null, i2), true);
                    this.f.r();
                    return;
                default:
                    throw new IllegalStateException("onError() should not be possible from state: ".concat(rf0.q(this.f.W0)));
            }
        }
        cameraDevice.getId();
        rf0.n(this.f.W0);
        this.f.r();
    }

    public final void onOpened(CameraDevice cameraDevice) {
        this.f.toString();
        lr1 lr1 = this.f;
        lr1.y0 = cameraDevice;
        lr1.z0 = 0;
        this.e.b = -1;
        int t = hr1.t(lr1.W0);
        if (t == 1 || t == 4) {
            e07.p((String) null, this.f.B0.isEmpty());
            this.f.y0.close();
            this.f.y0 = null;
        } else if (t == 5 || t == 6 || t == 7) {
            this.f.F(9);
            bv1 bv1 = this.f.F0;
            String id = cameraDevice.getId();
            lr1 lr12 = this.f;
            if (bv1.e(id, lr12.E0.B(lr12.y0.getId()))) {
                this.f.B();
            }
        } else {
            throw new IllegalStateException("onOpened() should not be possible from state: ".concat(rf0.q(this.f.W0)));
        }
    }
}
