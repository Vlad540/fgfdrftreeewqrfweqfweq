package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import android.util.ArrayMap;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: er1  reason: default package */
public final class er1 extends CameraDevice.StateCallback {
    public final /* synthetic */ sn1 a;
    public final /* synthetic */ lr1 b;

    public er1(lr1 lr1, sn1 sn1) {
        this.b = lr1;
        this.a = sn1;
    }

    public final void onClosed(CameraDevice cameraDevice) {
        this.b.toString();
        this.a.b((Object) null);
    }

    public final void onDisconnected(CameraDevice cameraDevice) {
        this.b.toString();
        this.a.b((Object) null);
    }

    public final void onError(CameraDevice cameraDevice, int i) {
        this.b.toString();
        this.a.b((Object) null);
    }

    public final void onOpened(CameraDevice cameraDevice) {
        CameraDevice cameraDevice2 = cameraDevice;
        lr1 lr1 = this.b;
        lr1.toString();
        ww1 ww1 = new ww1(lr1.T0, new xe6(Collections.emptyList()), false);
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        Surface surface = new Surface(surfaceTexture);
        cs6 cs6 = new cs6(surface);
        ct0.A(cs6.e).c(new dr1(surface, 0, surfaceTexture), pa2.j());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        fc9 c = fc9.c();
        ArrayList arrayList = new ArrayList();
        nc9 a2 = nc9.a();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        zq4 zq4 = zq4.d;
        pb5 a3 = ra0.a(cs6);
        a3.Y = zq4;
        linkedHashSet.add(a3.a());
        lr1.toString();
        ArrayList arrayList5 = new ArrayList(linkedHashSet);
        ArrayList arrayList6 = new ArrayList(arrayList2);
        ArrayList arrayList7 = new ArrayList(arrayList3);
        ArrayList arrayList8 = new ArrayList(arrayList4);
        ArrayList arrayList9 = new ArrayList(hashSet);
        hga a4 = hga.a(c);
        ArrayList arrayList10 = new ArrayList(arrayList);
        s9e s9e = s9e.b;
        ArrayMap arrayMap = new ArrayMap();
        Map map = a2.a;
        for (Iterator it = map.keySet().iterator(); it.hasNext(); it = it) {
            String str = (String) it.next();
            arrayMap.put(str, map.get(str));
        }
        c2d c2d = new c2d(arrayList5, arrayList6, arrayList7, arrayList8, new pw1(arrayList9, a4, 1, false, arrayList10, false, new s9e(arrayMap), (ws1) null), (a2d) null, (InputConfiguration) null, 0, (ra0) null);
        s39 s39 = lr1.N0;
        j36 a5 = j36.a(hwf.f(new n36(ww1.l(c2d, cameraDevice2, new q7e((xe6) s39.e, (xe6) s39.f, (s30) s39.d, (Executor) s39.a, (ScheduledExecutorService) s39.b, (Handler) s39.c)), 0)));
        j9 j9Var = new j9(ww1, 10, cs6);
        a5.getClass();
        ryc ryc = lr1.c;
        oy1 N = ct0.N(a5, j9Var, ryc);
        Objects.requireNonNull(cameraDevice);
        N.c(new b(27, cameraDevice2), ryc);
    }
}
