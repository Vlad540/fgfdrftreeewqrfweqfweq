package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* renamed from: dzf  reason: default package */
public final class dzf implements oa6, pa6 {
    public final LinkedList c = new LinkedList();
    public final ok d;
    public final zk e;
    public final d4b f;
    public final HashSet g = new HashSet();
    public final HashMap h = new HashMap();
    public final int i;
    public final rzf j;
    public boolean k;
    public final ArrayList l = new ArrayList();
    public nd3 m = null;
    public int n = 0;
    public final /* synthetic */ qa6 o;

    public dzf(qa6 qa6, la6 la6) {
        this.o = qa6;
        Looper looper = qa6.B0.getLooper();
        b0d a = la6.a();
        h2d h2d = new h2d((Account) a.c, (bs) a.o, (String) a.b, (String) a.X);
        n06 n06 = (n06) la6.c.b;
        a24.o(n06);
        ok h2 = n06.h(la6.a, looper, h2d, la6.o, this, this);
        String str = la6.b;
        if (str != null && (h2 instanceof a)) {
            ((a) h2).G0 = str;
        }
        if (str == null || !(h2 instanceof al9)) {
            this.d = h2;
            this.e = la6.X;
            this.f = new d4b();
            this.i = la6.Z;
            if (h2.j()) {
                Context context = qa6.X;
                z59 z59 = qa6.B0;
                b0d a2 = la6.a();
                this.j = new rzf(context, z59, new h2d((Account) a2.c, (bs) a2.o, (String) a2.b, (String) a2.X));
                return;
            }
            this.j = null;
            return;
        }
        hr1.r(h2);
        throw null;
    }

    public final void R(int i2) {
        Looper myLooper = Looper.myLooper();
        qa6 qa6 = this.o;
        if (myLooper == qa6.B0.getLooper()) {
            f(i2);
        } else {
            qa6.B0.post(new ui0(i2, 5, this));
        }
    }

    public final void a(nd3 nd3) {
        HashSet hashSet = this.g;
        Iterator it = hashSet.iterator();
        if (it.hasNext()) {
            hr1.r(it.next());
            if (x87.F(nd3, nd3.X)) {
                this.d.d();
            }
            throw null;
        }
        hashSet.clear();
    }

    public final void b(Status status) {
        a24.j(this.o.B0);
        c(status, (RuntimeException) null, false);
    }

    public final void c(Status status, RuntimeException runtimeException, boolean z) {
        a24.j(this.o.B0);
        boolean z2 = true;
        boolean z3 = status == null;
        if (runtimeException != null) {
            z2 = false;
        }
        if (z3 != z2) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                j0g j0g = (j0g) it.next();
                if (!z || j0g.a == 2) {
                    if (status != null) {
                        j0g.a(status);
                    } else {
                        j0g.b(runtimeException);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    public final void d() {
        LinkedList linkedList = this.c;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            j0g j0g = (j0g) arrayList.get(i2);
            if (this.d.isConnected()) {
                if (h(j0g)) {
                    linkedList.remove(j0g);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public final void e() {
        ok okVar = this.d;
        qa6 qa6 = this.o;
        a24.j(qa6.B0);
        this.m = null;
        a(nd3.X);
        if (this.k) {
            z59 z59 = qa6.B0;
            zk zkVar = this.e;
            z59.removeMessages(11, zkVar);
            qa6.B0.removeMessages(9, zkVar);
            this.k = false;
        }
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            pzf pzf = (pzf) it.next();
            pzf.a.getClass();
            try {
                v4b v4b = pzf.a;
                ((n8c) ((i6g) v4b.c).a).accept(okVar, new vde());
            } catch (DeadObjectException unused) {
                R(3);
                okVar.b("DeadObjectException thrown while calling register listener method.");
            } catch (RemoteException unused2) {
                it.remove();
            }
        }
        d();
        g();
    }

    public final void f(int i2) {
        qa6 qa6 = this.o;
        a24.j(qa6.B0);
        this.m = null;
        this.k = true;
        String i3 = this.d.i();
        d4b d4b = this.f;
        d4b.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i2 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i2 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (i3 != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(i3);
        }
        d4b.p(true, new Status(20, sb.toString(), (PendingIntent) null, (nd3) null));
        z59 z59 = qa6.B0;
        zk zkVar = this.e;
        z59.sendMessageDelayed(Message.obtain(z59, 9, zkVar), 5000);
        z59 z592 = qa6.B0;
        z592.sendMessageDelayed(Message.obtain(z592, 11, zkVar), 120000);
        ((SparseIntArray) qa6.Z.b).clear();
        for (pzf pzf : this.h.values()) {
            pzf.c.run();
        }
    }

    public final void g() {
        qa6 qa6 = this.o;
        z59 z59 = qa6.B0;
        zk zkVar = this.e;
        z59.removeMessages(12, zkVar);
        z59 z592 = qa6.B0;
        z592.sendMessageDelayed(z592.obtainMessage(12, zkVar), qa6.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(defpackage.j0g r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof defpackage.hzf
            java.lang.String r1 = "DeadObjectException thrown while running ApiCallRunner."
            r2 = 1
            if (r0 != 0) goto L_0x001d
            ok r0 = r14.d
            boolean r3 = r0.j()
            d4b r4 = r14.f
            r15.d(r4, r3)
            r15.c(r14)     // Catch:{ DeadObjectException -> 0x0016 }
            goto L_0x001c
        L_0x0016:
            r14.R(r2)
            r0.b(r1)
        L_0x001c:
            return r2
        L_0x001d:
            r0 = r15
            hzf r0 = (defpackage.hzf) r0
            ib5[] r3 = r0.g(r14)
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L_0x0072
            int r6 = r3.length
            if (r6 != 0) goto L_0x002c
            goto L_0x0072
        L_0x002c:
            ok r6 = r14.d
            ib5[] r6 = r6.h()
            if (r6 != 0) goto L_0x0036
            ib5[] r6 = new defpackage.ib5[r4]
        L_0x0036:
            yr r7 = new yr
            int r8 = r6.length
            r7.<init>(r8)
            r8 = r4
        L_0x003d:
            int r9 = r6.length
            if (r8 >= r9) goto L_0x0052
            r9 = r6[r8]
            java.lang.String r10 = r9.a
            long r11 = r9.b()
            java.lang.Long r9 = java.lang.Long.valueOf(r11)
            r7.put(r10, r9)
            int r8 = r8 + 1
            goto L_0x003d
        L_0x0052:
            int r6 = r3.length
            r8 = r4
        L_0x0054:
            if (r8 >= r6) goto L_0x0072
            r9 = r3[r8]
            java.lang.String r10 = r9.a
            java.lang.Object r10 = r7.get(r10)
            java.lang.Long r10 = (java.lang.Long) r10
            if (r10 == 0) goto L_0x0073
            long r10 = r10.longValue()
            long r12 = r9.b()
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L_0x006f
            goto L_0x0073
        L_0x006f:
            int r8 = r8 + 1
            goto L_0x0054
        L_0x0072:
            r9 = r5
        L_0x0073:
            if (r9 != 0) goto L_0x008b
            ok r0 = r14.d
            boolean r3 = r0.j()
            d4b r4 = r14.f
            r15.d(r4, r3)
            r15.c(r14)     // Catch:{ DeadObjectException -> 0x0084 }
            goto L_0x008a
        L_0x0084:
            r14.R(r2)
            r0.b(r1)
        L_0x008a:
            return r2
        L_0x008b:
            ok r15 = r14.d
            r15.getClass()
            qa6 r15 = r14.o
            boolean r15 = r15.C0
            if (r15 == 0) goto L_0x00fe
            boolean r15 = r0.f(r14)
            if (r15 == 0) goto L_0x00fe
            zk r15 = r14.e
            ezf r0 = new ezf
            r0.<init>(r15, r9)
            java.util.ArrayList r15 = r14.l
            int r15 = r15.indexOf(r0)
            r1 = 5000(0x1388, double:2.4703E-320)
            r3 = 15
            if (r15 < 0) goto L_0x00ca
            java.util.ArrayList r0 = r14.l
            java.lang.Object r15 = r0.get(r15)
            ezf r15 = (defpackage.ezf) r15
            qa6 r0 = r14.o
            z59 r0 = r0.B0
            r0.removeMessages(r3, r15)
            qa6 r14 = r14.o
            z59 r14 = r14.B0
            android.os.Message r15 = android.os.Message.obtain(r14, r3, r15)
            r14.sendMessageDelayed(r15, r1)
            goto L_0x00fd
        L_0x00ca:
            java.util.ArrayList r15 = r14.l
            r15.add(r0)
            qa6 r15 = r14.o
            z59 r15 = r15.B0
            android.os.Message r3 = android.os.Message.obtain(r15, r3, r0)
            r15.sendMessageDelayed(r3, r1)
            qa6 r15 = r14.o
            z59 r15 = r15.B0
            r1 = 16
            android.os.Message r0 = android.os.Message.obtain(r15, r1, r0)
            r1 = 120000(0x1d4c0, double:5.9288E-319)
            r15.sendMessageDelayed(r0, r1)
            nd3 r15 = new nd3
            r0 = 2
            r15.<init>(r0, r5)
            boolean r0 = r14.i(r15)
            if (r0 != 0) goto L_0x00fd
            qa6 r0 = r14.o
            int r14 = r14.i
            r0.b(r15, r14)
        L_0x00fd:
            return r4
        L_0x00fe:
            com.google.android.gms.common.api.UnsupportedApiCallException r14 = new com.google.android.gms.common.api.UnsupportedApiCallException
            r14.<init>(r9)
            r0.b(r14)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzf.h(j0g):boolean");
    }

    public final boolean i(nd3 nd3) {
        synchronized (qa6.F0) {
            this.o.getClass();
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [pd, mh0, java.lang.Object] */
    public final void j() {
        qa6 qa6 = this.o;
        a24.j(qa6.B0);
        ok okVar = this.d;
        if (!okVar.isConnected() && !okVar.c()) {
            try {
                s5c s5c = qa6.Z;
                Context context = qa6.X;
                s5c.getClass();
                a24.o(context);
                int g2 = okVar.g();
                SparseIntArray sparseIntArray = (SparseIntArray) s5c.b;
                int i2 = sparseIntArray.get(g2, -1);
                if (i2 == -1) {
                    i2 = 0;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= sparseIntArray.size()) {
                            i2 = -1;
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i3);
                        if (keyAt > g2 && sparseIntArray.get(keyAt) == 0) {
                            break;
                        }
                        i3++;
                    }
                    if (i2 == -1) {
                        i2 = ((na6) s5c.c).b(context, g2);
                    }
                    sparseIntArray.put(g2, i2);
                }
                if (i2 != 0) {
                    nd3 nd3 = new nd3(i2, (PendingIntent) null);
                    nd3.toString();
                    m(nd3, (RuntimeException) null);
                    return;
                }
                zk zkVar = this.e;
                ? obj = new Object();
                obj.Y = qa6;
                obj.o = null;
                obj.X = null;
                obj.a = false;
                obj.b = okVar;
                obj.c = zkVar;
                if (okVar.j()) {
                    rzf rzf = this.j;
                    a24.o(rzf);
                    dfd dfd = rzf.i;
                    if (dfd != null) {
                        dfd.disconnect();
                    }
                    Integer valueOf = Integer.valueOf(System.identityHashCode(rzf));
                    h2d h2d = rzf.h;
                    h2d.Z = valueOf;
                    Handler handler = rzf.e;
                    rzf.i = (dfd) rzf.f.h(rzf.d, handler.getLooper(), h2d, (efd) h2d.Y, rzf, rzf);
                    rzf.j = obj;
                    Set set = rzf.g;
                    if (set == null || set.isEmpty()) {
                        handler.post(new lde(14, (Object) rzf));
                    } else {
                        rzf.i.w();
                    }
                }
                try {
                    okVar.e(obj);
                } catch (SecurityException e2) {
                    m(new nd3(10), e2);
                }
            } catch (IllegalStateException e3) {
                m(new nd3(10), e3);
            }
        }
    }

    public final void k(nd3 nd3) {
        m(nd3, (RuntimeException) null);
    }

    public final void l(j0g j0g) {
        a24.j(this.o.B0);
        boolean isConnected = this.d.isConnected();
        LinkedList linkedList = this.c;
        if (!isConnected) {
            linkedList.add(j0g);
            nd3 nd3 = this.m;
            if (nd3 == null || nd3.b == 0 || nd3.c == null) {
                j();
            } else {
                m(nd3, (RuntimeException) null);
            }
        } else if (h(j0g)) {
            g();
        } else {
            linkedList.add(j0g);
        }
    }

    public final void m(nd3 nd3, RuntimeException runtimeException) {
        dfd dfd;
        a24.j(this.o.B0);
        rzf rzf = this.j;
        if (!(rzf == null || (dfd = rzf.i) == null)) {
            dfd.disconnect();
        }
        a24.j(this.o.B0);
        this.m = null;
        ((SparseIntArray) this.o.Z.b).clear();
        a(nd3);
        if ((this.d instanceof m0g) && nd3.b != 24) {
            qa6 qa6 = this.o;
            qa6.b = true;
            z59 z59 = qa6.B0;
            z59.sendMessageDelayed(z59.obtainMessage(19), 300000);
        }
        if (nd3.b == 4) {
            b(qa6.E0);
        } else if (this.c.isEmpty()) {
            this.m = nd3;
        } else if (runtimeException != null) {
            a24.j(this.o.B0);
            c((Status) null, runtimeException, false);
        } else if (this.o.C0) {
            c(qa6.c(this.e, nd3), (RuntimeException) null, true);
            if (!this.c.isEmpty() && !i(nd3) && !this.o.b(nd3, this.i)) {
                if (nd3.b == 18) {
                    this.k = true;
                }
                if (this.k) {
                    qa6 qa62 = this.o;
                    zk zkVar = this.e;
                    z59 z592 = qa62.B0;
                    z592.sendMessageDelayed(Message.obtain(z592, 9, zkVar), 5000);
                    return;
                }
                b(qa6.c(this.e, nd3));
            }
        } else {
            b(qa6.c(this.e, nd3));
        }
    }

    public final void n(nd3 nd3) {
        a24.j(this.o.B0);
        ok okVar = this.d;
        String name = okVar.getClass().getName();
        String valueOf = String.valueOf(nd3);
        okVar.b("onSignInFailed for " + name + " with " + valueOf);
        m(nd3, (RuntimeException) null);
    }

    public final void o() {
        a24.j(this.o.B0);
        Status status = qa6.D0;
        b(status);
        this.f.p(false, status);
        for (ih7 c0g : (ih7[]) this.h.keySet().toArray(new ih7[0])) {
            l(new c0g(c0g, new vde()));
        }
        a(new nd3(4));
        ok okVar = this.d;
        if (okVar.isConnected()) {
            okVar.f(new vbe(this));
        }
    }

    public final void onConnected() {
        Looper myLooper = Looper.myLooper();
        qa6 qa6 = this.o;
        if (myLooper == qa6.B0.getLooper()) {
            e();
        } else {
            qa6.B0.post(new lde(12, (Object) this));
        }
    }
}
