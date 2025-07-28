package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

/* renamed from: rr1  reason: default package */
public class rr1 {
    public static final rr1 a = new Object();

    public void a(pye pye, w30 w30) {
        pye pye2 = pye;
        w30 w302 = w30;
        pw1 pw1 = (pw1) pye2.d(pye.l0, (Object) null);
        ia3 ia3 = hga.c;
        z80 z80 = pw1.i;
        HashSet hashSet = new HashSet();
        fc9 c = fc9.c();
        ArrayList arrayList = new ArrayList();
        nc9 a2 = nc9.a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        hga a3 = hga.a(c);
        ArrayList arrayList3 = new ArrayList(arrayList);
        s9e s9e = s9e.b;
        ArrayMap arrayMap = new ArrayMap();
        Map map = a2.a;
        for (String str : map.keySet()) {
            arrayMap.put(str, map.get(str));
        }
        s9e s9e2 = new s9e(arrayMap);
        int i = -1;
        new pw1(arrayList2, a3, -1, false, arrayList3, false, s9e2, (ws1) null);
        if (pw1 != null) {
            w302.a(pw1.e);
            i = pw1.c;
            ia3 = pw1.b;
        }
        w302.f = fc9.e(ia3);
        w302.c = ((Integer) pye2.d(js1.X, Integer.valueOf(i))).intValue();
        w302.b(new ow1((CameraCaptureSession.CaptureCallback) pye2.d(js1.x0, new CameraCaptureSession.CaptureCallback())));
        w302.c(lv1.q(pye).p());
    }
}
