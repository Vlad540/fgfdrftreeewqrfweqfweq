package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.ArrayMap;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import androidx.media3.transformer.ExportException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: w30  reason: default package */
public final class w30 {
    public boolean a;
    public boolean b;
    public int c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;
    public Object h;

    public w30(gf6 gf6, ws6 ws6) {
        this.d = new ArrayList();
        gf6.getClass();
        this.e = new i44(false, true);
        this.g = h50.e;
        this.h = k50.a;
        this.f = new f50(ws6);
    }

    public static boolean f(TotalCaptureResult totalCaptureResult, boolean z) {
        if (totalCaptureResult == null) {
            return false;
        }
        afc afc = new afc(s9e.b, totalCaptureResult);
        Set set = ss3.a;
        boolean z2 = afc.t() == 2 || afc.t() == 1 || ss3.a.contains(afc.s());
        boolean z3 = afc.p() == 2;
        boolean z4 = !z ? z3 || ss3.c.contains(afc.m()) : z3 || ss3.d.contains(afc.m());
        boolean z5 = afc.u() == 2 || ss3.b.contains(afc.f());
        Objects.toString(afc.m());
        Objects.toString(afc.s());
        Objects.toString(afc.f());
        return z2 && z4 && z5;
    }

    public static boolean g(int i, TotalCaptureResult totalCaptureResult) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return false;
                }
                if (i != 3) {
                    throw new AssertionError(i);
                }
            }
            return true;
        }
        Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
        return num != null && num.intValue() == 4;
    }

    public void a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            b((ps1) it.next());
        }
    }

    public void b(ps1 ps1) {
        ArrayList arrayList = (ArrayList) this.d;
        if (!arrayList.contains(ps1)) {
            arrayList.add(ps1);
        }
    }

    public void c(ia3 ia3) {
        for (z80 z80 : ia3.f()) {
            fc9 fc9 = (fc9) this.f;
            fc9.getClass();
            try {
                fc9.h(z80);
            } catch (IllegalArgumentException unused) {
            }
            ((fc9) this.f).g(z80, ia3.m(z80), ia3.h(z80));
        }
    }

    public pw1 d() {
        ArrayList arrayList = new ArrayList((HashSet) this.e);
        hga a2 = hga.a((fc9) this.f);
        int i = this.c;
        boolean z = this.a;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.d);
        boolean z2 = this.b;
        s9e s9e = s9e.b;
        ArrayMap arrayMap = new ArrayMap();
        nc9 nc9 = (nc9) this.g;
        for (String str : nc9.a.keySet()) {
            arrayMap.put(str, nc9.a.get(str));
        }
        return new pw1(arrayList, a2, i, z, arrayList2, z2, new s9e(arrayMap), (ws1) this.h);
    }

    public yr1 e(int i, int i2, int i3) {
        xe6 xe6 = (xe6) this.f;
        kp0 kp0 = new kp0(xe6, 4);
        yr1 yr1 = new yr1(this.c, (Executor) this.g, (ScheduledExecutorService) this.h, (zq1) this.d, this.b, kp0);
        ArrayList arrayList = yr1.h;
        zq1 zq1 = (zq1) this.d;
        if (i == 0) {
            arrayList.add(new ur1(zq1));
        }
        if (i2 == 3) {
            arrayList.add(new es1(zq1, (Executor) this.g, (ScheduledExecutorService) this.h, new wwc(xe6)));
        } else if (this.a) {
            boolean z = ((ga3) this.e).b;
            if (z || this.c == 3 || i3 == 1) {
                arrayList.add(new gs1((zq1) this.d, i2, (Executor) this.g, (ScheduledExecutorService) this.h, !z && ((AtomicInteger) zq1.o.c).get() <= 0));
            } else {
                arrayList.add(new tr1(zq1, i2, kp0));
            }
        }
        Objects.toString(arrayList);
        return yr1;
    }

    public boolean h() {
        return !((ByteBuffer) this.h).hasRemaining() && this.c >= ((ArrayList) this.d).size() && ((i44) this.e).e();
    }

    public y30 i(gs4 gs4, xu5 xu5) {
        oyb.d(xu5.D != -1);
        try {
            y30 y30 = new y30((h50) this.g, gs4, xu5);
            if (Objects.equals((h50) this.g, h50.e)) {
                h50 h50 = y30.a;
                this.g = h50;
                ((f50) this.f).a(h50);
                ((f50) this.f).b();
            }
            ((ArrayList) this.d).add(new v30(y30));
            LinkedHashMap linkedHashMap = b24.a;
            synchronized (b24.class) {
            }
            return y30;
        } catch (AudioProcessor$UnhandledAudioFormatException e2) {
            throw ExportException.b(e2, "Error while registering input " + ((ArrayList) this.d).size());
        }
    }

    public w30(zq1 zq1, et1 et1, xe6 xe6, ryc ryc, vd6 vd6) {
        boolean z = true;
        this.c = 1;
        this.d = zq1;
        Integer num = (Integer) et1.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.b = (num == null || num.intValue() != 2) ? false : z;
        this.g = ryc;
        this.h = vd6;
        this.f = xe6;
        this.e = new ga3(xe6, 8);
        this.a = pa2.w(new rgc(23, et1));
    }

    public w30() {
        this.e = new HashSet();
        this.f = fc9.c();
        this.c = -1;
        this.a = false;
        this.d = new ArrayList();
        this.b = false;
        this.g = nc9.a();
    }

    public w30(pw1 pw1) {
        HashSet hashSet = new HashSet();
        this.e = hashSet;
        this.f = fc9.c();
        this.c = -1;
        this.a = false;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.b = false;
        this.g = nc9.a();
        hashSet.addAll(pw1.a);
        this.f = fc9.e(pw1.b);
        this.c = pw1.c;
        arrayList.addAll(pw1.e);
        this.b = pw1.f;
        ArrayMap arrayMap = new ArrayMap();
        s9e s9e = pw1.g;
        for (String str : s9e.a.keySet()) {
            arrayMap.put(str, s9e.a.get(str));
        }
        this.g = new s9e(arrayMap);
        this.a = pw1.d;
    }
}
