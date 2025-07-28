package defpackage;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: ut1  reason: default package */
public final class ut1 extends CameraDevice.StateCallback {
    public final /* synthetic */ int a;
    public final Object b;

    public ut1(s30 s30) {
        this.a = 1;
        this.b = s30;
    }

    private final void c(CameraDevice cameraDevice) {
    }

    public void a() {
        ArrayList l;
        synchronized (((s30) this.b).b) {
            l = ((s30) this.b).l();
            ((LinkedHashSet) ((s30) this.b).X).clear();
            ((LinkedHashSet) ((s30) this.b).c).clear();
            ((LinkedHashSet) ((s30) this.b).o).clear();
        }
        Iterator it = l.iterator();
        while (it.hasNext()) {
            q7e q7e = (q7e) ((p7e) it.next());
            synchronized (q7e.a) {
                try {
                    List<xc4> list = q7e.j;
                    if (list != null) {
                        for (xc4 b2 : list) {
                            b2.b();
                        }
                        q7e.j = null;
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            q7e.t.d();
        }
    }

    public void b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (((s30) this.b).b) {
            linkedHashSet.addAll((LinkedHashSet) ((s30) this.b).X);
            linkedHashSet.addAll((LinkedHashSet) ((s30) this.b).c);
        }
        ((Executor) ((s30) this.b).a).execute(new ds1(7, linkedHashSet));
    }

    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onClosed(cameraDevice);
                }
                return;
            default:
                b();
                a();
                return;
        }
    }

    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onDisconnected(cameraDevice);
                }
                return;
            default:
                b();
                a();
                return;
        }
    }

    public final void onError(CameraDevice cameraDevice, int i) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onError(cameraDevice, i);
                }
                return;
            default:
                b();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                synchronized (((s30) this.b).b) {
                    linkedHashSet.addAll((LinkedHashSet) ((s30) this.b).X);
                    linkedHashSet.addAll((LinkedHashSet) ((s30) this.b).c);
                }
                ((Executor) ((s30) this.b).a).execute(new n30(i, 6, linkedHashSet));
                a();
                return;
        }
    }

    public final void onOpened(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onOpened(cameraDevice);
                }
                return;
            default:
                return;
        }
    }

    public ut1(ArrayList arrayList) {
        this.a = 0;
        this.b = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CameraDevice.StateCallback stateCallback = (CameraDevice.StateCallback) it.next();
            if (!(stateCallback instanceof vt1)) {
                ((ArrayList) this.b).add(stateCallback);
            }
        }
    }
}
