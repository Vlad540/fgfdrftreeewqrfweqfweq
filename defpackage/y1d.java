package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: y1d  reason: default package */
public final class y1d extends x1d {
    /* JADX WARNING: type inference failed for: r0v4, types: [x1d, y1d] */
    public static y1d d(pye pye, Size size) {
        if (((ks1) pye.d(pye.m0, (Object) null)) != null) {
            ? x1d = new x1d();
            c2d c2d = (c2d) pye.d(pye.k0, (Object) null);
            ia3 ia3 = hga.c;
            int i = c2d.a().g.c;
            if (c2d != null) {
                i = c2d.g.c;
                for (CameraDevice.StateCallback stateCallback : c2d.c) {
                    ArrayList arrayList = x1d.c;
                    if (!arrayList.contains(stateCallback)) {
                        arrayList.add(stateCallback);
                    }
                }
                for (CameraCaptureSession.StateCallback stateCallback2 : c2d.d) {
                    ArrayList arrayList2 = x1d.d;
                    if (!arrayList2.contains(stateCallback2)) {
                        arrayList2.add(stateCallback2);
                    }
                }
                x1d.b.a(c2d.g.e);
                ia3 = c2d.g.b;
            }
            w30 w30 = x1d.b;
            w30.getClass();
            w30.f = fc9.e(ia3);
            if (pye instanceof c3b) {
                Rational rational = d3b.a;
                if (((PreviewPixelHDRnetQuirk) zf4.a.j(PreviewPixelHDRnetQuirk.class)) != null && !d3b.a.equals(new Rational(size.getWidth(), size.getHeight()))) {
                    fc9 c = fc9.c();
                    c.j(js1.Q(CaptureRequest.TONEMAP_MODE), 2);
                    x1d.b.c(new mv4(7, hga.a(c)));
                }
            }
            x1d.b.c = ((Integer) pye.d(js1.X, Integer.valueOf(i))).intValue();
            CameraDevice.StateCallback stateCallback3 = (CameraDevice.StateCallback) pye.d(js1.Z, new CameraDevice.StateCallback());
            ArrayList arrayList3 = x1d.c;
            if (!arrayList3.contains(stateCallback3)) {
                arrayList3.add(stateCallback3);
            }
            CameraCaptureSession.StateCallback stateCallback4 = (CameraCaptureSession.StateCallback) pye.d(js1.w0, new CameraCaptureSession.StateCallback());
            ArrayList arrayList4 = x1d.d;
            if (!arrayList4.contains(stateCallback4)) {
                arrayList4.add(stateCallback4);
            }
            ow1 ow1 = new ow1((CameraCaptureSession.CaptureCallback) pye.d(js1.x0, new CameraCaptureSession.CaptureCallback()));
            x1d.b.b(ow1);
            ArrayList arrayList5 = x1d.e;
            if (!arrayList5.contains(ow1)) {
                arrayList5.add(ow1);
            }
            int u = pye.u();
            if (u != 0) {
                w30 w302 = x1d.b;
                w302.getClass();
                if (u != 0) {
                    ((fc9) w302.f).j(pye.u0, Integer.valueOf(u));
                }
            }
            int y = pye.y();
            if (y != 0) {
                w30 w303 = x1d.b;
                w303.getClass();
                if (y != 0) {
                    ((fc9) w303.f).j(pye.t0, Integer.valueOf(y));
                }
            }
            fc9 c2 = fc9.c();
            z80 z80 = js1.y0;
            c2.j(z80, (String) pye.d(z80, (Object) null));
            z80 z802 = js1.Y;
            Long l = (Long) pye.d(z802, -1L);
            l.getClass();
            c2.j(z802, l);
            x1d.b.c(c2);
            x1d.b.c(lv1.q(pye).p());
            return x1d;
        }
        throw new IllegalStateException("Implementation is missing option unpacker for " + ((String) pye.d(gde.c0, pye.toString())));
    }

    public final void a(ia3 ia3) {
        this.b.c(ia3);
    }

    public final void b(xc4 xc4, zq4 zq4, int i) {
        pb5 a = ra0.a(xc4);
        a.c = null;
        if (zq4 != null) {
            a.Y = zq4;
            a.o = Integer.valueOf(i);
            this.a.add(a.a());
            ((HashSet) this.b.e).add(xc4);
            return;
        }
        throw new NullPointerException("Null dynamicRange");
    }

    public final c2d c() {
        return new c2d(new ArrayList(this.a), new ArrayList(this.c), new ArrayList(this.d), new ArrayList(this.e), this.b.d(), this.f, this.g, this.h, this.i);
    }
}
