package defpackage;

import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.os.Trace;
import android.view.Surface;
import androidx.fragment.app.b;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.common.drawable.SavedMessagesIconDrawable;

/* renamed from: dr1  reason: default package */
public final /* synthetic */ class dr1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dr1(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void run() {
        vo8 vo8;
        hs1 hs1;
        switch (this.a) {
            case 0:
                ((Surface) this.b).release();
                ((SurfaceTexture) this.c).release();
                return;
            case 1:
                lr1 lr1 = (lr1) this.b;
                s39 s39 = lr1.L0;
                sn1 sn1 = (sn1) this.c;
                if (s39 == null) {
                    sn1.b(Boolean.FALSE);
                    return;
                }
                sn1.b(Boolean.valueOf(lr1.a.B(lr1.w(s39))));
                return;
            case 2:
                lr1 lr12 = (lr1) this.b;
                lr12.getClass();
                lr12.toString();
                LinkedHashMap linkedHashMap = (LinkedHashMap) lr12.a.b;
                String str = (String) this.c;
                if (linkedHashMap.containsKey(str)) {
                    nye nye = (nye) linkedHashMap.get(str);
                    nye.f = false;
                    if (!nye.e) {
                        linkedHashMap.remove(str);
                    }
                }
                lr12.K();
                return;
            case 3:
                ((a2d) this.b).a((c2d) this.c);
                return;
            case 4:
                ((HashSet) ((zq1) this.b).b.b).remove((as1) this.c);
                return;
            case 5:
                ((st1) this.b).a = (wu1) this.c;
                return;
            case 6:
                List<p62> list = (List) this.c;
                t52 t52 = (t52) this.b;
                nj4 nj4 = t52.l;
                nj4 nj42 = t52.A;
                ((lne) nj42.get()).getClass();
                lne.a("ChatController.load().nonParticipantChats");
                try {
                    ((a04) nj4.get()).a();
                    for (p62 p62 : list) {
                        ((a04) nj4.get()).c.a(p62.b, Long.MAX_VALUE, md4.X);
                        xdc xdc = ((a04) nj4.get()).b;
                        long j = p62.b;
                        xdc.getClass();
                        xdc.a.m().p(new wdc(0, new nv2(xdc, j, 2)));
                        ((pk) t52.p.get()).k(p62.c.a, true);
                    }
                    ((a04) nj4.get()).c();
                    ((a04) nj4.get()).b();
                    ((lne) nj42.get()).getClass();
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    ((a04) nj4.get()).b();
                    throw th;
                }
            case 7:
                t52 t522 = (t52) this.b;
                t522.getClass();
                StringBuilder sb = new StringBuilder("syncPins, pins size = ");
                Map map = (Map) this.c;
                sb.append(map.size());
                udd.p("t52", sb.toString(), new Object[0]);
                Iterator it = ((tr) ((to8) t522.s.get()).l(new ArrayList(map.keySet())).entrySet()).iterator();
                while (true) {
                    wr wrVar = (wr) it;
                    if (wrVar.hasNext()) {
                        wrVar.next();
                        Long l = (Long) map.get(wrVar.getKey());
                        if (!(l == null || (vo8 = (vo8) wrVar.getValue()) == null)) {
                            ((pk) t522.p.get()).E(l.longValue(), Collections.singletonList(Long.valueOf(vo8.c)));
                            udd.p("t52", "syncPin, chatId = " + l, new Object[0]);
                        }
                    } else {
                        return;
                    }
                }
            case 8:
                b bVar = (b) ((e83) this.b);
                int i = e83.H0;
                bVar.a.a(new y73((ex9) this.c, 0, bVar));
                return;
            case 9:
                fga fga = (fga) this.b;
                jib jib = (jib) this.c;
                if (fga.b == fga.d) {
                    synchronized (fga) {
                        hs1 = fga.a;
                        fga.a = null;
                        fga.b = jib;
                    }
                    hs1.getClass();
                    return;
                }
                throw new IllegalStateException("provide() can be called only once.");
            case 10:
                z97 z97 = (z97) this.b;
                jib jib2 = (jib) this.c;
                synchronized (z97) {
                    try {
                        if (z97.b == null) {
                            z97.a.add(jib2);
                        } else {
                            z97.b.add(jib2.get());
                        }
                    } catch (Throwable th2) {
                        while (true) {
                            throw th2;
                            break;
                        }
                    }
                }
                return;
            case 11:
                ls9 ls9 = (ls9) this.c;
                ie3 ie3 = (ie3) this.b;
                ie3.getClass();
                try {
                    ls9.a(ie3.a.b);
                    return;
                } catch (InterruptedException | ExecutionException e) {
                    ls9.onError(e);
                    return;
                }
            case 12:
                for (oe3 oe3 : (List) this.b) {
                    Object obj = ((cf3) this.c).o;
                    oe3.d = obj;
                    oe3.d(oe3.e, obj);
                }
                return;
            case 13:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.b;
                ch7 ch7 = (ch7) this.c;
                synchronized (constraintTrackingWorker.b) {
                    try {
                        if (constraintTrackingWorker.c) {
                            b4d b4d = constraintTrackingWorker.o;
                            String str2 = ef3.a;
                            b4d.j(new Object());
                        } else {
                            constraintTrackingWorker.o.l(ch7);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
            case 14:
                jr3 jr3 = (jr3) this.b;
                jr3.getClass();
                ((Runnable) this.c).run();
                ((CountDownLatch) jr3.d).countDown();
                return;
            case 15:
                List singletonList = Collections.singletonList((mv3) this.c);
                ((oa2) ((kv2) this.b).Y).getClass();
                oa2.I(singletonList);
                return;
            case 16:
                px3 px3 = (px3) this.b;
                px3.getClass();
                try {
                    Process.setThreadPriority(px3.b);
                } catch (Throwable unused) {
                }
                ((Runnable) this.c).run();
                return;
            case 17:
                qx3 qx3 = (qx3) this.b;
                Process.setThreadPriority(qx3.c);
                StrictMode.ThreadPolicy threadPolicy = qx3.o;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                ((Runnable) this.c).run();
                return;
            case 18:
                qe4 qe4 = ((m28) ((lhd) this.b).b).V1;
                Handler handler = (Handler) qe4.b;
                if (handler != null) {
                    handler.post(new r50(qe4, (z50) this.c, 0));
                    return;
                }
                return;
            case 19:
                w64 w64 = (w64) this.b;
                y64 y64 = w64.o;
                if (y64.p != 0 && !w64.c) {
                    Looper looper = y64.t;
                    looper.getClass();
                    w64.b = y64.e(looper, w64.a, (vu5) this.c, false);
                    y64.n.add(w64);
                    return;
                }
                return;
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE /*20*/:
                x64 x64 = (x64) this.b;
                z64 z64 = x64.o;
                if (z64.p != 0 && !x64.c) {
                    Looper looper2 = z64.t;
                    looper2.getClass();
                    x64.b = z64.e(looper2, x64.a, (xu5) this.c, false);
                    z64.n.add(x64);
                    return;
                }
                return;
            case 21:
                d84 d84 = (d84) this.b;
                d84.x0 = false;
                d84.b((Uri) this.c);
                return;
            case 22:
                e84 e84 = (e84) this.b;
                e84.x0 = false;
                e84.d((Uri) this.c);
                return;
            case 23:
                ((bb4) this.b).z0.add((b90) this.c);
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                bb4 bb4 = (bb4) this.b;
                vd6 vd6 = bb4.c;
                q4e q4e = (q4e) this.c;
                Surface d = q4e.d(vd6, new cv1(bb4, 1, q4e));
                bb4.a.p(d);
                bb4.w0.put(q4e, d);
                return;
            case 25:
                bb4 bb42 = (bb4) this.b;
                bb42.x0++;
                vj4 vj4 = bb42.a;
                w36.d((AtomicBoolean) vj4.c, true);
                w36.c((Thread) vj4.e);
                SurfaceTexture surfaceTexture = new SurfaceTexture(vj4.b);
                y4e y4e = (y4e) this.c;
                surfaceTexture.setDefaultBufferSize(y4e.b.getWidth(), y4e.b.getHeight());
                Surface surface = new Surface(surfaceTexture);
                e44 e44 = new e44(bb42, 3, y4e);
                vd6 vd62 = bb42.c;
                y4e.c(vd62, e44);
                y4e.b(surface, vd62, new ab4(bb42, y4e, surfaceTexture, surface));
                surfaceTexture.setOnFrameAvailableListener(bb42, bb42.o);
                return;
            case 26:
                rc4 rc4 = (rc4) this.b;
                rc4.getClass();
                int i2 = ((jn) this.c).b;
                rc4.f.J();
                return;
            case 27:
                rc4 rc42 = (rc4) this.b;
                rc42.getClass();
                rc42.f.c(VideoFrameProcessingException.a((InterruptedException) this.c));
                return;
            case 28:
                Callable callable = (Callable) this.b;
                c9 c9Var = (c9) this.c;
                try {
                    ((ce4) c9Var.b).i(callable.call());
                    return;
                } catch (Exception e2) {
                    ((ce4) c9Var.b).j(e2);
                    return;
                }
            default:
                hi4 hi4 = (hi4) this.b;
                if (hi4.d.offer((Runnable) this.c)) {
                    hi4.a();
                    return;
                }
                throw new IllegalStateException("cannot enqueue any more runnables".toString());
        }
    }
}
