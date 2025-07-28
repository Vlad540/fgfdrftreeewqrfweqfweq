package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import androidx.work.WorkRequest;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import one.me.android.OneMeApplication;
import org.webrtc.EglBase10Impl;
import org.webrtc.EglBase14Impl;

/* renamed from: lc  reason: default package */
public final /* synthetic */ class lc implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ lc(int i) {
        this.a = i;
    }

    private final void a() {
    }

    public final void run() {
        switch (this.a) {
            case 0:
                int i = AlarmManagerSchedulerBroadcastReceiver.a;
                return;
            case 1:
                float andSet = (float) yf.a.getAndSet(0);
                float andSet2 = (float) yf.b.getAndSet(0);
                float andSet3 = (float) yf.c.getAndSet(0);
                float f = andSet + andSet2 + andSet3;
                if (f > 0.0f) {
                    float f2 = andSet / f;
                    float f3 = andSet3 / f;
                    int i2 = ((andSet2 / f) > 0.25f ? 1 : ((andSet2 / f) == 0.25f ? 0 : -1));
                    ConcurrentHashMap concurrentHashMap = yf.d;
                    if (i2 > 0 || f3 > 0.1f) {
                        for (Map.Entry entry : concurrentHashMap.entrySet()) {
                            yf.a((dz5) entry.getKey(), -((Number) entry.getValue()).intValue());
                        }
                    } else if (f2 > 0.98f) {
                        for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                            yf.a((dz5) entry2.getKey(), ((Number) entry2.getValue()).intValue());
                        }
                    }
                    concurrentHashMap.clear();
                }
                ((Handler) yf.e.getValue()).postDelayed(yf.f, 2000);
                return;
            case 2:
                long currentTimeMillis = System.currentTimeMillis() - WorkRequest.MIN_BACKOFF_MILLIS;
                ConcurrentHashMap concurrentHashMap2 = cz5.d;
                Date date = new Date(currentTimeMillis);
                ConcurrentHashMap concurrentHashMap3 = cz5.d;
                synchronized (concurrentHashMap3) {
                    try {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry3 : concurrentHashMap3.entrySet()) {
                            if (((dve) entry3.getValue()).b.compareTo(date) < 0) {
                                linkedHashMap.put(entry3.getKey(), entry3.getValue());
                            }
                        }
                        for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                            cs0 cs0 = ((dve) entry4.getValue()).a;
                            ConcurrentHashMap concurrentHashMap4 = cs0.f;
                            for (bs0 bs0 : concurrentHashMap4.values()) {
                                e13.S(bs0.a);
                            }
                            concurrentHashMap4.clear();
                            cs0.j = -1;
                            cz5.d.remove(entry4.getKey());
                        }
                    } finally {
                    }
                }
                ((Handler) yf.e.getValue()).postDelayed(yf.g, WorkRequest.MIN_BACKOFF_MILLIS);
                return;
            case 3:
                jn jnVar = rn0.C;
                if (jnVar != null) {
                    ArrayList arrayList = null;
                    for (int i3 = 0; i3 < rn0.z; i3++) {
                        Bitmap[] bitmapArr = (Bitmap[]) jnVar.o;
                        if (bitmapArr[i3] != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(bitmapArr[i3]);
                        }
                        bitmapArr[i3] = null;
                        ((ls6[]) jnVar.c)[i3] = null;
                    }
                    if (!arrayList.isEmpty()) {
                        ((ScheduledExecutorService) ((r7e) ez3.e.f.b).getValue()).execute(new ie(arrayList, 2));
                    }
                    rn0.C = null;
                    return;
                }
                return;
            case 4:
                ExecutorService executorService = gx0.s2;
                return;
            case 5:
                return;
            case 6:
                int i4 = es1.g;
                return;
            case 7:
                EglBase10Impl.EglConnection.a();
                return;
            case 8:
                EglBase14Impl.EglConnection.b();
                return;
            case 9:
                int i5 = OneMeApplication.w0;
                zy9 d = nqc.a.d();
                d.getClass();
                udd.p("zy9", "invalidate", new Object[0]);
                if (!d.d()) {
                    d.g(false);
                    return;
                }
                return;
            case 10:
                dia.X.set(dia.o);
                return;
            case 11:
                int i6 = s0d.o;
                return;
            default:
                String[] strArr = nxf.F;
                return;
        }
    }
}
