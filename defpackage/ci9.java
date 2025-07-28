package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: ci9  reason: default package */
public class ci9 implements at {
    public static ci9 f;
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final Object d;
    public final Object e;

    public ci9(ArrayList arrayList, String str, String str2, int i) {
        this.a = 3;
        this.d = arrayList;
        this.e = str;
        this.c = str2;
        this.b = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x000e, code lost:
        r0 = ((java.util.concurrent.CopyOnWriteArrayList) r3.e).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        if (r0.hasNext() == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001c, code lost:
        r1 = (java.lang.ref.WeakReference) r0.next();
        r2 = (defpackage.d54) r1.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r2 == null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        r2.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        ((java.util.concurrent.CopyOnWriteArrayList) r3.e).remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(defpackage.ci9 r3, int r4) {
        /*
            java.lang.Object r0 = r3.c
            monitor-enter(r0)
            int r1 = r3.b     // Catch:{ all -> 0x0009 }
            if (r1 != r4) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            goto L_0x0036
        L_0x0009:
            r3 = move-exception
            goto L_0x0037
        L_0x000b:
            r3.b = r4     // Catch:{ all -> 0x0009 }
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            java.lang.Object r0 = r3.e
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0036
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            d54 r2 = (defpackage.d54) r2
            if (r2 == 0) goto L_0x002e
            r2.a(r4)
            goto L_0x0016
        L_0x002e:
            java.lang.Object r2 = r3.e
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            r2.remove(r1)
            goto L_0x0016
        L_0x0036:
            return
        L_0x0037:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci9.b(ci9, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0099 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.ci9 h(ws8 r13) {
        /*
            r0 = 2
            r1 = 0
            r2 = 1
            int r3 = defpackage.jjd.K(r13)
            r4 = 0
            if (r3 != 0) goto L_0x000b
            return r4
        L_0x000b:
            r7 = r1
            r8 = r7
            r5 = r4
            r6 = r5
        L_0x000f:
            if (r7 >= r3) goto L_0x00aa
            java.lang.String r9 = r13.z0()
            r9.getClass()
            r10 = -1
            int r11 = r9.hashCode()
            switch(r11) {
                case -683415465: goto L_0x0037;
                case -265713450: goto L_0x002c;
                case 3598564: goto L_0x0021;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x0041
        L_0x0021:
            java.lang.String r11 = "urls"
            boolean r9 = r9.equals(r11)
            if (r9 != 0) goto L_0x002a
            goto L_0x0041
        L_0x002a:
            r10 = r0
            goto L_0x0041
        L_0x002c:
            java.lang.String r11 = "username"
            boolean r9 = r9.equals(r11)
            if (r9 != 0) goto L_0x0035
            goto L_0x0041
        L_0x0035:
            r10 = r2
            goto L_0x0041
        L_0x0037:
            java.lang.String r11 = "credential"
            boolean r9 = r9.equals(r11)
            if (r9 != 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r10 = r1
        L_0x0041:
            switch(r10) {
                case 0: goto L_0x00a3;
                case 1: goto L_0x009e;
                case 2: goto L_0x0049;
                default: goto L_0x0044;
            }
        L_0x0044:
            r13.z()
            goto L_0x00a7
        L_0x0049:
            int r4 = defpackage.jjd.D(r13)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r4)
            r9 = r1
        L_0x0053:
            if (r9 >= r4) goto L_0x005e
            java.lang.String r10 = defpackage.jjd.M(r13)
            r8.add(r10)
            int r9 = r9 + r2
            goto L_0x0053
        L_0x005e:
            boolean r4 = r8.isEmpty()
            if (r4 != 0) goto L_0x0099
            java.util.Iterator r4 = r8.iterator()
        L_0x0068:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x0099
            java.lang.Object r9 = r4.next()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = "stun:"
            boolean r10 = r9.startsWith(r10)
            if (r10 != 0) goto L_0x0097
            java.lang.String r10 = "stuns:"
            boolean r10 = r9.startsWith(r10)
            if (r10 == 0) goto L_0x0085
            goto L_0x0097
        L_0x0085:
            java.lang.String r10 = "turn:"
            boolean r10 = r9.startsWith(r10)
            if (r10 != 0) goto L_0x0095
            java.lang.String r10 = "turns:"
            boolean r9 = r9.startsWith(r10)
            if (r9 == 0) goto L_0x0068
        L_0x0095:
            r4 = r0
            goto L_0x009a
        L_0x0097:
            r4 = 3
            goto L_0x009a
        L_0x0099:
            r4 = r2
        L_0x009a:
            r12 = r8
            r8 = r4
            r4 = r12
            goto L_0x00a7
        L_0x009e:
            java.lang.String r5 = defpackage.jjd.M(r13)
            goto L_0x00a7
        L_0x00a3:
            java.lang.String r6 = defpackage.jjd.M(r13)
        L_0x00a7:
            int r7 = r7 + r2
            goto L_0x000f
        L_0x00aa:
            ci9 r13 = new ci9
            r13.<init>(r4, r5, r6, r8)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci9.h(ws8):ci9");
    }

    public int a(ii5 ii5) {
        if (this.b == 2) {
            n45 n45 = (n45) this.c;
            ii5.b = Math.min((int) ((n45.k() * 100) / n45.c()), 99);
        }
        return this.b;
    }

    public bya c() {
        return new bya((String) this.d, (CharSequence) this.e, this.b, (Bundle) this.c);
    }

    public Object d() {
        Object removeLast;
        synchronized (this.c) {
            removeLast = ((ArrayDeque) this.d).removeLast();
        }
        return removeLast;
    }

    public zs6 e() {
        jn jnVar = new jn(4);
        jg8 jg8 = (jg8) this.e;
        String str = (String) jg8.b;
        if (str != null) {
            jnVar.I(1, str);
        }
        String str2 = (String) jg8.o;
        if (str2 != null) {
            jnVar.I(2, str2);
        }
        return jnVar.k();
    }

    public void f(Object obj) {
        Object d2;
        synchronized (this.c) {
            try {
                d2 = ((ArrayDeque) this.d).size() >= this.b ? d() : null;
                ((ArrayDeque) this.d).addFirst(obj);
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (((hs1) this.e) != null && d2 != null) {
            ((lr6) d2).close();
        }
    }

    public boolean g() {
        boolean isEmpty;
        synchronized (this.c) {
            isEmpty = ((ArrayDeque) this.d).isEmpty();
        }
        return isEmpty;
    }

    public void i(Bundle bundle) {
        this.c = bundle;
    }

    public void release() {
        ((n45) this.c).release();
        this.b = 0;
    }

    public void start() {
        l68 l68 = ((gs4) this.d).a;
        n45 n45 = (n45) this.c;
        n45.getClass();
        n45.O0(ws6.n(l68));
        n45.prepare();
        this.b = 1;
    }

    public String toString() {
        switch (this.a) {
            case 3:
                StringBuilder sb = new StringBuilder("{urls=");
                sb.append((List) this.d);
                sb.append(", username='");
                sb.append((String) this.e);
                sb.append("', credential='");
                sb.append((String) this.c);
                sb.append("', type=");
                int i = this.b;
                sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "STUN" : "TURN" : "UNKNOWN");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public ci9(int i, hs1 hs1) {
        this.a = 1;
        this.c = new Object();
        this.b = i;
        this.d = new ArrayDeque(i);
        this.e = hs1;
    }

    public ci9(Context context) {
        this.a = 0;
        this.d = new Handler(Looper.getMainLooper());
        this.e = new CopyOnWriteArrayList();
        this.c = new Object();
        this.b = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new an(8, this), intentFilter);
    }

    public ci9(Context context, gs4 gs4, qe8 qe8, i6g i6g, int i, Looper looper, zs zsVar, z7e z7e) {
        Context context2 = context;
        gs4 gs42 = gs4;
        z7e z7e2 = z7e;
        this.a = 2;
        this.d = gs42;
        jg8 jg8 = new jg8(i6g);
        this.e = jg8;
        bc4 bc4 = new bc4(context2);
        lb4 lb4 = new lb4(context2);
        lb4.z = true;
        lb4.M = false;
        bc4.b(new nb4(lb4));
        d94.l("bufferForPlaybackMs", 250, 0, "0");
        d94.l("bufferForPlaybackAfterRebufferMs", 500, 0, "0");
        d94.l("minBufferMs", 50000, 250, "bufferForPlaybackMs");
        d94.l("minBufferMs", 50000, 500, "bufferForPlaybackAfterRebufferMs");
        d94.l("maxBufferMs", 50000, 50000, "minBufferMs");
        d94 d94 = new d94(new l34(1), 50000, 50000, 250, 500, false);
        q35 q35 = new q35(context2, new k94(6, new t35(gs42.b, gs42.c, gs42.d, jg8, i, zsVar)), new o35(context2, 4));
        oyb.k(!q35.v);
        q35.d = new k94(2, qe8);
        oyb.k(!q35.v);
        q35.e = new k94(3, bc4);
        oyb.k(!q35.v);
        q35.f = new k94(7, d94);
        oyb.k(!q35.v);
        looper.getClass();
        q35.i = looper;
        oyb.k(!q35.v);
        q35.u = false;
        long j = oze.O() ? 5000 : 500;
        oyb.k(!q35.v);
        q35.s = j;
        if (z7e2 != z7e.a) {
            oyb.k(!q35.v);
            q35.b = z7e2;
        }
        n45 a2 = q35.a();
        this.c = a2;
        a2.B0.a(new s35(this, zsVar));
        this.b = 0;
    }

    public ci9(mn mnVar, Toolbar toolbar) {
        this.a = 5;
        this.b = yqb.toolbar_title;
        this.d = mnVar;
        this.e = toolbar;
    }

    public ci9(String str, CharSequence charSequence, int i) {
        this.a = 4;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
        } else if (TextUtils.isEmpty(charSequence)) {
            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
        } else if (i != 0) {
            this.d = str;
            this.e = charSequence;
            this.b = i;
        } else {
            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
        }
    }
}
