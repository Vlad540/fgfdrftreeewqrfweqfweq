package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.media.ImageWriter;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: ys1  reason: default package */
public final class ys1 extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ys1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(CameraCaptureSession cameraCaptureSession) {
    }

    public void onActive(CameraCaptureSession cameraCaptureSession) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onActive(cameraCaptureSession);
                }
                return;
            case 1:
                p7e p7e = (p7e) this.b;
                p7e.k(cameraCaptureSession);
                p7e.a((q7e) p7e);
                return;
            default:
                super.onActive(cameraCaptureSession);
                return;
        }
    }

    public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onCaptureQueueEmpty(cameraCaptureSession);
                }
                return;
            case 1:
                p7e p7e = (p7e) this.b;
                p7e.k(cameraCaptureSession);
                p7e.b((q7e) p7e);
                return;
            default:
                super.onCaptureQueueEmpty(cameraCaptureSession);
                return;
        }
    }

    public void onClosed(CameraCaptureSession cameraCaptureSession) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onClosed(cameraCaptureSession);
                }
                return;
            case 1:
                p7e p7e = (p7e) this.b;
                p7e.k(cameraCaptureSession);
                p7e.c(p7e);
                return;
            default:
                super.onClosed(cameraCaptureSession);
                return;
        }
    }

    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        sn1 sn1;
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed(cameraCaptureSession);
                }
                return;
            case 1:
                try {
                    ((p7e) this.b).k(cameraCaptureSession);
                    p7e p7e = (p7e) this.b;
                    p7e.d(p7e);
                    synchronized (((p7e) this.b).a) {
                        e07.o(((p7e) this.b).h, "OpenCaptureSession completer should not null");
                        p7e p7e2 = (p7e) this.b;
                        sn1 = p7e2.h;
                        p7e2.h = null;
                    }
                    sn1.d(new IllegalStateException("onConfigureFailed"));
                    return;
                } catch (Throwable th) {
                    synchronized (((p7e) this.b).a) {
                        e07.o(((p7e) this.b).h, "OpenCaptureSession completer should not null");
                        p7e p7e3 = (p7e) this.b;
                        sn1 sn12 = p7e3.h;
                        p7e3.h = null;
                        sn12.d(new IllegalStateException("onConfigureFailed"));
                        throw th;
                    }
                }
            default:
                return;
        }
    }

    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        sn1 sn1;
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onConfigured(cameraCaptureSession);
                }
                return;
            case 1:
                try {
                    ((p7e) this.b).k(cameraCaptureSession);
                    p7e p7e = (p7e) this.b;
                    p7e.e((q7e) p7e);
                    synchronized (((p7e) this.b).a) {
                        e07.o(((p7e) this.b).h, "OpenCaptureSession completer should not null");
                        p7e p7e2 = (p7e) this.b;
                        sn1 = p7e2.h;
                        p7e2.h = null;
                    }
                    sn1.b((Object) null);
                    return;
                } catch (Throwable th) {
                    synchronized (((p7e) this.b).a) {
                        e07.o(((p7e) this.b).h, "OpenCaptureSession completer should not null");
                        p7e p7e3 = (p7e) this.b;
                        sn1 sn12 = p7e3.h;
                        p7e3.h = null;
                        sn12.b((Object) null);
                        throw th;
                    }
                }
            default:
                Surface inputSurface = cameraCaptureSession.getInputSurface();
                if (inputSurface != null) {
                    ((ewf) this.b).j = ImageWriter.newInstance(inputSurface, 1);
                    return;
                }
                return;
        }
    }

    public void onReady(CameraCaptureSession cameraCaptureSession) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onReady(cameraCaptureSession);
                }
                return;
            case 1:
                p7e p7e = (p7e) this.b;
                p7e.k(cameraCaptureSession);
                p7e.f((q7e) p7e);
                return;
            default:
                super.onReady(cameraCaptureSession);
                return;
        }
    }

    public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onSurfacePrepared(cameraCaptureSession, surface);
                }
                return;
            case 1:
                p7e p7e = (p7e) this.b;
                p7e.k(cameraCaptureSession);
                p7e.h((q7e) p7e, surface);
                return;
            default:
                super.onSurfacePrepared(cameraCaptureSession, surface);
                return;
        }
    }

    public ys1(List list) {
        this.a = 0;
        this.b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraCaptureSession.StateCallback stateCallback = (CameraCaptureSession.StateCallback) it.next();
            if (!(stateCallback instanceof zs1)) {
                ((ArrayList) this.b).add(stateCallback);
            }
        }
    }
}
