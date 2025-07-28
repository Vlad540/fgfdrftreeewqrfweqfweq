package defpackage;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: sb8  reason: default package */
public final class sb8 extends Handler {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ ub8 c;

    public sb8(ub8 ub8) {
        this.c = ub8;
    }

    public static void a(rb8 rb8, int i, Object obj) {
        yb8 yb8 = rb8.a;
        int i2 = 65280 & i;
        fja fja = rb8.b;
        if (i2 == 256) {
            xb8 xb8 = (i == 264 || i == 262) ? (xb8) ((yia) obj).b : (xb8) obj;
            if (i == 264 || i == 262) {
                xb8 xb82 = (xb8) ((yia) obj).a;
            }
            if (xb8 == null) {
                return;
            }
            if ((rb8.d & 2) != 0 || xb8.h(rb8.c)) {
                switch (i) {
                    case 257:
                        fja.p();
                        return;
                    case 258:
                        fja.r();
                        return;
                    case 259:
                        fja.q(xb8);
                        return;
                    case 260:
                        fja.u(xb8);
                        return;
                    case 261:
                        fja.getClass();
                        return;
                    case 262:
                        fja.s(xb8);
                        return;
                    case 263:
                        fja.t();
                        return;
                    case 264:
                        fja.s(xb8);
                        return;
                    default:
                        return;
                }
            } else {
                yb8.c();
            }
        } else if (i2 == 512) {
            wb8 wb8 = (wb8) obj;
            switch (i) {
                case 513:
                    fja.m();
                    return;
                case 514:
                    fja.o();
                    return;
                case 515:
                    fja.n();
                    return;
                default:
                    return;
            }
        } else if (i2 == 768 && i == 769) {
            hr1.r(obj);
            fja.v();
        }
    }

    public final void b(int i, Object obj) {
        obtainMessage(i, obj).sendToTarget();
    }

    public final void handleMessage(Message message) {
        int l;
        ArrayList arrayList = this.a;
        int i = message.what;
        Object obj = message.obj;
        ub8 ub8 = this.c;
        if (i == 259 && ub8.f().c.equals(((xb8) obj).c)) {
            ub8.n(true);
        }
        ArrayList arrayList2 = this.b;
        if (i == 262) {
            xb8 xb8 = (xb8) ((yia) obj).b;
            ub8.c.r(xb8);
            if (ub8.p != null && xb8.d()) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ub8.c.q((xb8) it.next());
                }
                arrayList2.clear();
            }
        } else if (i != 264) {
            switch (i) {
                case 257:
                    ub8.c.p((xb8) obj);
                    break;
                case 258:
                    ub8.c.q((xb8) obj);
                    break;
                case 259:
                    p8e p8e = ub8.c;
                    xb8 xb82 = (xb8) obj;
                    p8e.getClass();
                    if (xb82.c() != p8e && (l = p8e.l(xb82)) >= 0) {
                        p8e.w((s8e) p8e.G0.get(l));
                        break;
                    }
            }
        } else {
            xb8 xb83 = (xb8) ((yia) obj).b;
            arrayList2.add(xb83);
            ub8.c.p(xb83);
            ub8.c.r(xb83);
        }
        try {
            int size = ub8.f.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ArrayList arrayList3 = ub8.f;
                    yb8 yb8 = (yb8) ((WeakReference) arrayList3.get(size)).get();
                    if (yb8 == null) {
                        arrayList3.remove(size);
                    } else {
                        arrayList.addAll(yb8.b);
                    }
                } else {
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        a((rb8) arrayList.get(i2), i, obj);
                    }
                    arrayList.clear();
                    return;
                }
            }
        } catch (Throwable th) {
            arrayList.clear();
            throw th;
        }
    }
}
