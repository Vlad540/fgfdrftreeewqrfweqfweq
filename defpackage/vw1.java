package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: vw1  reason: default package */
public final class vw1 extends n7e {
    public final /* synthetic */ int a;
    public final Object b;

    public vw1(ww1 ww1) {
        this.a = 0;
        this.b = ww1;
    }

    private final void i(p7e p7e) {
    }

    public void a(q7e q7e) {
        switch (this.a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onActive((CameraCaptureSession) ((b2b) q7e.q().b).b);
                return;
            case 2:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((n7e) it.next()).a(q7e);
                }
                return;
            default:
                return;
        }
    }

    public void b(q7e q7e) {
        switch (this.a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onCaptureQueueEmpty((CameraCaptureSession) ((b2b) q7e.q().b).b);
                return;
            case 2:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((n7e) it.next()).b(q7e);
                }
                return;
            default:
                return;
        }
    }

    public void c(p7e p7e) {
        switch (this.a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onClosed((CameraCaptureSession) ((b2b) p7e.q().b).b);
                return;
            case 2:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((n7e) it.next()).c(p7e);
                }
                return;
            default:
                return;
        }
    }

    public final void d(p7e p7e) {
        switch (this.a) {
            case 0:
                synchronized (((ww1) this.b).a) {
                    try {
                        switch (hr1.t(((ww1) this.b).i)) {
                            case 0:
                            case 1:
                            case 2:
                            case 4:
                                throw new IllegalStateException("onConfigureFailed() should not be possible in state: ".concat(rf0.s(((ww1) this.b).i)));
                            case 3:
                            case 5:
                            case 6:
                                ((ww1) this.b).d();
                                break;
                        }
                        int i = ((ww1) this.b).i;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onConfigureFailed((CameraCaptureSession) ((b2b) p7e.q().b).b);
                return;
            default:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((n7e) it.next()).d(p7e);
                }
                return;
        }
    }

    public final void e(q7e q7e) {
        switch (this.a) {
            case 0:
                synchronized (((ww1) this.b).a) {
                    try {
                        switch (hr1.t(((ww1) this.b).i)) {
                            case 0:
                            case 1:
                            case 2:
                            case 4:
                            case 7:
                                throw new IllegalStateException("onConfigured() should not be possible in state: ".concat(rf0.s(((ww1) this.b).i)));
                            case 3:
                                ww1 ww1 = (ww1) this.b;
                                ww1.i = 5;
                                ww1.e = q7e;
                                ww1.k(ww1.f);
                                ww1 ww12 = (ww1) this.b;
                                ww12.o.c().c(new ds1(6, ww12), pa2.j());
                                break;
                            case 5:
                                ((ww1) this.b).e = q7e;
                                break;
                            case 6:
                                q7e.j();
                                break;
                        }
                        int i = ((ww1) this.b).i;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onConfigured((CameraCaptureSession) ((b2b) q7e.q().b).b);
                return;
            default:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((n7e) it.next()).e(q7e);
                }
                return;
        }
    }

    public final void f(q7e q7e) {
        switch (this.a) {
            case 0:
                synchronized (((ww1) this.b).a) {
                    try {
                        if (hr1.t(((ww1) this.b).i) != 0) {
                            int i = ((ww1) this.b).i;
                        } else {
                            throw new IllegalStateException("onReady() should not be possible in state: ".concat(rf0.s(((ww1) this.b).i)));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onReady((CameraCaptureSession) ((b2b) q7e.q().b).b);
                return;
            default:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((n7e) it.next()).f(q7e);
                }
                return;
        }
    }

    public final void g(p7e p7e) {
        switch (this.a) {
            case 0:
                synchronized (((ww1) this.b).a) {
                    try {
                        ww1 ww1 = (ww1) this.b;
                        if (ww1.i != 1) {
                            ww1.d();
                        } else {
                            throw new IllegalStateException("onSessionFinished() should not be possible in state: ".concat(rf0.s(((ww1) this.b).i)));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                return;
            default:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((n7e) it.next()).g(p7e);
                }
                return;
        }
    }

    public void h(q7e q7e, Surface surface) {
        switch (this.a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onSurfacePrepared((CameraCaptureSession) ((b2b) q7e.q().b).b, surface);
                return;
            case 2:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((n7e) it.next()).h(q7e, surface);
                }
                return;
            default:
                return;
        }
    }

    public vw1(int i, List list) {
        Object obj;
        this.a = i;
        switch (i) {
            case 2:
                ArrayList arrayList = new ArrayList();
                this.b = arrayList;
                arrayList.addAll(list);
                return;
            default:
                if (list.isEmpty()) {
                    obj = new CameraCaptureSession.StateCallback();
                } else if (list.size() == 1) {
                    obj = (CameraCaptureSession.StateCallback) list.get(0);
                } else {
                    obj = new ys1(list);
                }
                this.b = obj;
                return;
        }
    }
}
