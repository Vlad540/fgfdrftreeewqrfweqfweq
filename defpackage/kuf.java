package defpackage;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.os.ResultReceiver;
import android.view.MenuItem;
import android.view.View;
import androidx.work.impl.WorkDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;

/* renamed from: kuf  reason: default package */
public final class kuf implements Runnable {
    public final Object X;
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object o;

    public /* synthetic */ kuf(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
        this.X = obj4;
    }

    public final void run() {
        r4a r4a;
        tna tna;
        t97 t97;
        aec aec;
        Object obj = this.X;
        Object obj2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.o;
        switch (this.a) {
            case 0:
                c0d c0d = (c0d) obj3;
                udd.p("luf", "set beans for task = %s", new Object[]{c0d});
                c0d.a = (d0d) ((t97) obj4).getValue();
                try {
                    udd.p("luf", "start processing task = %s", new Object[]{c0d});
                    c0d.x();
                    udd.p("luf", "finished processing task = %s", new Object[]{c0d});
                    return;
                } catch (Exception e) {
                    udd.s("luf", "exception = " + e.getMessage() + ", task = " + c0d, e);
                    r4a = (g15) obj;
                    r4a.c(e, true);
                    c0d.w();
                    if (c0d instanceof tna) {
                        tna = (tna) c0d;
                        t97 = (t97) obj2;
                        ((jee) t97.getValue()).c(tna.getId());
                        zde j = ((jee) t97.getValue()).j(tna.getId());
                        if (j != null && j.c >= 10) {
                            tna.f();
                            break;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    r4a.c(new Exception("TaskRunnable: failed to execute onMaxFailCount method for task " + tna.getId() + " type " + tna.getType(), th), true);
                    break;
                }
            case 1:
                cx1 cx1 = (cx1) obj3;
                if (cx1 != null) {
                    za6 za6 = (za6) obj;
                    ((dx1) za6.a).P0 = true;
                    cx1.b.c(false);
                    ((dx1) za6.a).P0 = false;
                }
                MenuItem menuItem = (MenuItem) obj2;
                if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                    ((pl8) obj4).q(menuItem, (hm8) null, 4);
                    return;
                }
                return;
            case 2:
                if (((AtomicBoolean) obj3).compareAndSet(false, true)) {
                    ((n83) obj2).d();
                    m73 m73 = (m73) obj;
                    v63 v63 = m73.X;
                    if (v63 == null) {
                        ((g73) obj4).onError(new TimeoutException(i15.e(m73.b, m73.c)));
                        return;
                    }
                    v63.i(new mb1(5, this));
                    return;
                }
                return;
            case 3:
                x3a x3a = (x3a) obj;
                l18 l18 = (l18) ((wd8) x3a.b).X.get(((u18) obj3).a.getBinder());
                if (l18 != null) {
                    wd8 wd8 = (wd8) x3a.b;
                    wd8.getClass();
                    HashMap hashMap = l18.f;
                    String str = (String) obj2;
                    IBinder iBinder = (IBinder) obj4;
                    if (iBinder == null) {
                        try {
                            hashMap.remove(str);
                        } catch (Throwable th2) {
                            wd8.Y = null;
                            throw th2;
                        }
                    } else {
                        List list = (List) hashMap.get(str);
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (iBinder == ((yia) it.next()).a) {
                                    it.remove();
                                }
                            }
                            if (list.size() == 0) {
                                hashMap.remove(str);
                            }
                        }
                    }
                    wd8.Y = null;
                    return;
                }
                return;
            case 4:
                x3a x3a2 = (x3a) obj;
                l18 l182 = (l18) ((wd8) x3a2.b).X.get(((u18) obj3).a.getBinder());
                Bundle bundle = (Bundle) obj2;
                if (l182 == null) {
                    Objects.toString(bundle);
                    return;
                }
                wd8 wd82 = (wd8) x3a2.b;
                wd82.Y = l182;
                if (bundle == null) {
                    Bundle bundle2 = Bundle.EMPTY;
                }
                ((ResultReceiver) obj4).send(-1, (Bundle) null);
                wd82.Y = null;
                return;
            case 5:
                zv1 zv1 = (yv1) obj2;
                try {
                    xs7.M(((hu3) obj3).minusKey(cqc.c), new cec((aec) obj4, zv1, (i26) obj, (Continuation) null));
                    return;
                } catch (Throwable th3) {
                    zv1.cancel(th3);
                    return;
                }
            case 6:
                wrf.h((View) obj3, (asf) obj2, (s5c) obj4);
                ((ValueAnimator) obj).start();
                return;
            default:
                b4d b4d = (b4d) obj4;
                UUID uuid = (UUID) obj3;
                String uuid2 = uuid.toString();
                a24 B = a24.B();
                String str2 = ttf.c;
                StringBuilder sb = new StringBuilder("Updating progress for ");
                sb.append(uuid);
                sb.append(" (");
                zy3 zy3 = (zy3) obj2;
                sb.append(zy3);
                sb.append(")");
                B.t(str2, sb.toString());
                ttf ttf = (ttf) obj;
                WorkDatabase workDatabase = ttf.a;
                WorkDatabase workDatabase2 = ttf.a;
                workDatabase.c();
                try {
                    ztf l = workDatabase2.y().l(uuid2);
                    if (l != null) {
                        if (l.b == ctf.b) {
                            ptf ptf = new ptf(uuid2, zy3);
                            stf x = workDatabase2.x();
                            aec = (aec) x.a;
                            aec.b();
                            aec.c();
                            ((qtf) x.b).C(ptf);
                            aec.r();
                            aec.l();
                        } else {
                            a24 B2 = a24.B();
                            B2.k0(str2, "Ignoring setProgressAsync(...). WorkSpec (" + uuid2 + ") is not in a RUNNING state.");
                        }
                        b4d.j((Object) null);
                        workDatabase2.r();
                        workDatabase2.l();
                        return;
                    }
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                } catch (Throwable th4) {
                    try {
                        a24.B().y(ttf.c, "Error updating Worker progress", th4);
                        b4d.k(th4);
                    } catch (Throwable th5) {
                        workDatabase2.l();
                        throw th5;
                    }
                }
        }
        ((jee) t97.getValue()).d(tna.getId());
        udd.q("luf", "remove task because it cause too many exceptions: ".concat(kuf.class.getName()));
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "WorkerService.TaskRunnable{" + ((c0d) this.b) + '}';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ kuf(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.X = obj;
        this.b = obj2;
        this.c = obj3;
        this.o = obj4;
    }

    public kuf(c0d c0d, t97 t97, g15 g15, t97 t972) {
        this.a = 0;
        this.b = c0d;
        this.c = t97;
        this.X = g15;
        this.o = t972;
    }

    public kuf(x3a x3a, v18 v18, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.a = 4;
        this.X = x3a;
        this.b = v18;
        this.c = bundle;
        this.o = resultReceiver;
    }
}
