package defpackage;

import android.content.Intent;
import android.hardware.camera2.CaptureResult;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.tasks.Task;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import org.apache.http.protocol.HTTP;

/* renamed from: cqc  reason: default package */
public final class cqc implements gu3, jbe, cr3, m96, ws1, dt7, rwa, pz3, gj7 {
    public static final cqc X = new Object();
    public static tzc Y = new Object();
    public static final /* synthetic */ cqc Z = new Object();
    public static final cqc a = new Object();
    public static final cqc b = new Object();
    public static final /* synthetic */ cqc c = new Object();
    public static final /* synthetic */ cqc o = new Object();

    public static y0c r(String str) {
        String i = wn6.i("https://player.vimeo.com/video/", str, "/config");
        String h = rf0.h("https://vimeo.com/", str);
        qw9 qw9 = new qw9();
        s86 s86 = new s86();
        s86.q(i);
        ((xe6) s86.c).n(HTTP.CONTENT_TYPE, "application/json");
        ((xe6) s86.c).n("Referer", h);
        return qw9.b(s86.j());
    }

    public static List t(List list, List list2) {
        if (list.isEmpty()) {
            return o23.m0(list2, zo4.b);
        }
        if (list2.isEmpty()) {
            return list;
        }
        lg7 c2 = hwf.c();
        c2.addAll(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            u(c2, (fp4) it.next());
        }
        if (c2.getSize() > 15) {
            v87 v87 = new v87(kxb.a);
            int i = 0;
            while (c2.getSize() > 14) {
                i += ((fp4) c2.a(v87.nextInt(c2.getSize()))).c;
            }
            u(c2, new fp4("unknown", "max_size_exceeded", i));
        }
        return hwf.a(c2);
    }

    public static void u(lg7 lg7, fp4 fp4) {
        int i;
        int size = lg7.getSize();
        p23.E(lg7.getSize(), 0, size);
        int i2 = size - 1;
        int i3 = 0;
        while (true) {
            if (i3 > i2) {
                i = -(i3 + 1);
                break;
            }
            i = (i3 + i2) >>> 1;
            fp4 fp42 = (fp4) lg7.get(i);
            int compareTo = fp42.a.compareTo(fp4.a);
            if (compareTo == 0 && (compareTo = fp42.b.compareTo(fp4.b)) == 0) {
                compareTo = 0;
            }
            if (compareTo >= 0) {
                if (compareTo <= 0) {
                    break;
                }
                i2 = i - 1;
            } else {
                i3 = i + 1;
            }
        }
        if (i >= 0) {
            fp4 fp43 = (fp4) lg7.get(i);
            lg7.set(i, new fp4(fp43.a, fp43.b, fp43.c + fp4.c));
            return;
        }
        lg7.add((-i) - 1, fp4);
    }

    public static int v(View view) {
        WeakHashMap weakHashMap = eaf.a;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return v(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    public void a() {
    }

    public boolean b(MotionEvent motionEvent) {
        return false;
    }

    public Object d(apa apa) {
        return Integer.valueOf(apa.Y0);
    }

    public s9e e() {
        return s9e.b;
    }

    public us1 f() {
        return us1.a;
    }

    public int g() {
        return 1;
    }

    public long getTimestamp() {
        return -1;
    }

    public List h(long j, rg6 rg6, int i, int i2, long j2, long j3) {
        return hw4.a;
    }

    public void j(float f, float f2) {
    }

    public Object l(Task task) {
        Intent intent = (Intent) ((Bundle) task.f()).getParcelable("notification_data");
        if (intent != null) {
            return new h13(intent);
        }
        return null;
    }

    public void load() {
        synchronized (vx3.c) {
            Object obj = vx3.d;
            synchronized (obj) {
                if (!vx3.e) {
                    long a2 = vx3.a();
                    synchronized (obj) {
                        vx3.f = a2;
                        vx3.e = true;
                    }
                }
            }
        }
    }

    public ss1 m() {
        return ss1.a;
    }

    public long n(int i, long j, float f) {
        long j2;
        if (j <= 0) {
            return System.currentTimeMillis();
        }
        if (i > 10) {
            j2 = (long) 300000;
        } else {
            udd.p("cqc", "errorCount = %d^2 * 3 * 1000", new Object[]{Integer.valueOf(i)});
            j2 = (long) (i * i * 3000);
        }
        return j2 + j;
    }

    public CaptureResult o() {
        return null;
    }

    public void q(float f, float f2, int i, int i2, ewa ewa) {
    }

    public ts1 s() {
        return ts1.a;
    }
}
