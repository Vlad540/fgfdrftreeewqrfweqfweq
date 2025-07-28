package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

/* renamed from: fx  reason: default package */
public final class fx extends Handler {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ fx() {
        this.a = 6;
    }

    private final void a(Message message) {
        Set<fo4> set;
        Set<fo4> set2;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        if (i == 1) {
            v64 v64 = (v64) this.b;
            if (obj != v64.y) {
                return;
            }
            if (v64.p == 2 || v64.i()) {
                v64.y = null;
                boolean z = obj2 instanceof Exception;
                nu7 nu7 = v64.c;
                if (z) {
                    nu7.x((Exception) obj2, false);
                    return;
                }
                try {
                    v64.b.j((byte[]) obj2);
                    nu7.b = null;
                    HashSet hashSet = (HashSet) nu7.a;
                    ws6 j = ws6.j(hashSet);
                    hashSet.clear();
                    po5 l = j.listIterator(0);
                    while (l.hasNext()) {
                        v64 v642 = (v64) l.next();
                        if (v642.l()) {
                            v642.h(true);
                        }
                    }
                } catch (Exception e) {
                    nu7.x(e, true);
                }
            }
        } else if (i == 2) {
            v64 v643 = (v64) this.b;
            if (obj == v643.x && v643.i()) {
                v643.x = null;
                if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                    v643.k((Throwable) obj2, false);
                    return;
                }
                try {
                    byte[] bArr = (byte[]) obj2;
                    if (v643.e == 3) {
                        m35 m35 = v643.b;
                        byte[] bArr2 = v643.w;
                        int i2 = oze.a;
                        m35.i(bArr2, bArr);
                        au3 au3 = v643.i;
                        synchronized (au3.b) {
                            set2 = au3.o;
                        }
                        for (fo4 b2 : set2) {
                            b2.b();
                        }
                        return;
                    }
                    byte[] i3 = v643.b.i(v643.v, bArr);
                    int i4 = v643.e;
                    if (!((i4 != 2 && (i4 != 0 || v643.w == null)) || i3 == null || i3.length == 0)) {
                        v643.w = i3;
                    }
                    v643.p = 4;
                    au3 au32 = v643.i;
                    synchronized (au32.b) {
                        set = au32.o;
                    }
                    for (fo4 a2 : set) {
                        a2.a();
                    }
                } catch (Exception | NoSuchMethodError e2) {
                    v643.k(e2, true);
                }
            }
        }
    }

    private final void b(Message message) {
        Set<eo4> set;
        Set<eo4> set2;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        if (i == 0) {
            u64 u64 = (u64) this.b;
            if (obj != u64.x) {
                return;
            }
            if (u64.o == 2 || u64.i()) {
                u64.x = null;
                boolean z = obj2 instanceof Exception;
                qe4 qe4 = u64.c;
                if (z) {
                    qe4.D((Exception) obj2, false);
                    return;
                }
                try {
                    u64.b.j((byte[]) obj2);
                    qe4.c = null;
                    HashSet hashSet = (HashSet) qe4.b;
                    ws6 j = ws6.j(hashSet);
                    hashSet.clear();
                    po5 l = j.listIterator(0);
                    while (l.hasNext()) {
                        u64 u642 = (u64) l.next();
                        if (u642.l()) {
                            u642.h(true);
                        }
                    }
                } catch (Exception e) {
                    qe4.D(e, true);
                }
            }
        } else if (i == 1) {
            u64 u643 = (u64) this.b;
            if (obj == u643.w && u643.i()) {
                u643.w = null;
                if (obj2 instanceof Exception) {
                    u643.k((Exception) obj2, false);
                    return;
                }
                try {
                    byte[] bArr = (byte[]) obj2;
                    if (u643.e == 3) {
                        l35 l35 = u643.b;
                        byte[] bArr2 = u643.v;
                        int i2 = mze.a;
                        l35.i(bArr2, bArr);
                        au3 au3 = u643.i;
                        synchronized (au3.b) {
                            set2 = au3.o;
                        }
                        for (eo4 b2 : set2) {
                            b2.b();
                        }
                        return;
                    }
                    byte[] i3 = u643.b.i(u643.u, bArr);
                    int i4 = u643.e;
                    if (!((i4 != 2 && (i4 != 0 || u643.v == null)) || i3 == null || i3.length == 0)) {
                        u643.v = i3;
                    }
                    u643.o = 4;
                    au3 au32 = u643.i;
                    synchronized (au32.b) {
                        set = au32.o;
                    }
                    for (eo4 a2 : set) {
                        a2.a();
                    }
                } catch (Exception e2) {
                    u643.k(e2, true);
                }
            }
        }
    }

    private final void c(Message message) {
        nc8 nc8;
        m18 m18;
        fx fxVar;
        if (message.what == 1) {
            synchronized (((m18) this.b).a) {
                nc8 = (nc8) ((WeakReference) ((m18) this.b).c).get();
                m18 = (m18) this.b;
                fxVar = (fx) m18.d;
            }
            if (nc8 != null && m18 == nc8.getCallback() && fxVar != null) {
                nc8.a((pd8) message.obj);
                ((m18) this.b).getClass();
                nc8.a((pd8) null);
            }
        }
    }

    public void d(Runnable runnable) {
        if (Thread.currentThread() == getLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: gx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: gx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: hx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: gx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: hx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: gx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: gx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: gx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: gx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v36, resolved type: gx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v37, resolved type: gx} */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0373 A[LOOP:3: B:115:0x0373->B:118:0x037f, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0425 A[LOOP:7: B:172:0x0425->B:175:0x0430, LOOP_START] */
    public final void handleMessage(android.os.Message r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = 3
            r3 = 4
            r4 = 0
            r5 = 2
            r6 = 0
            r7 = 1
            int r8 = r0.a
            switch(r8) {
                case 0: goto L_0x0408;
                case 1: goto L_0x0354;
                case 2: goto L_0x0350;
                case 3: goto L_0x034c;
                case 4: goto L_0x0314;
                case 5: goto L_0x02d9;
                case 6: goto L_0x00f2;
                case 7: goto L_0x00bb;
                case 8: goto L_0x0095;
                case 9: goto L_0x006f;
                case 10: goto L_0x0056;
                case 11: goto L_0x002d;
                case 12: goto L_0x0029;
                default: goto L_0x000f;
            }
        L_0x000f:
            java.lang.Object r1 = r1.obj
            ic8 r1 = (defpackage.ic8) r1
            java.lang.Object r0 = r0.b
            nxc r0 = (nxc) r0
            boolean r2 = r0.J(r1)
            if (r2 == 0) goto L_0x0028
            hc8 r2 = r1.d     // Catch:{ RemoteException -> 0x0025 }
            defpackage.oyb.l(r2)     // Catch:{ RemoteException -> 0x0025 }
            r2.onDisconnected()     // Catch:{ RemoteException -> 0x0025 }
        L_0x0025:
            r0.V(r1)
        L_0x0028:
            return
        L_0x0029:
            r20.c(r21)
            return
        L_0x002d:
            int r1 = r1.what
            java.lang.Object r0 = r0.b
            ob8 r0 = (defpackage.ob8) r0
            if (r1 == r7) goto L_0x0040
            if (r1 == r5) goto L_0x0038
            goto L_0x0055
        L_0x0038:
            r0.Y = r6
            va8 r1 = r0.X
            r0.f(r1)
            goto L_0x0055
        L_0x0040:
            r0.w0 = r6
            e3 r1 = r0.o
            if (r1 == 0) goto L_0x0055
            pb8 r2 = r0.Z
            java.lang.Object r1 = r1.a
            ub8 r1 = (defpackage.ub8) r1
            wb8 r0 = r1.d(r0)
            if (r0 == 0) goto L_0x0055
            r1.l(r0, r2)
        L_0x0055:
            return
        L_0x0056:
            int r1 = r1.what
            java.lang.Object r0 = r0.b
            jb8 r0 = (defpackage.jb8) r0
            if (r1 == r7) goto L_0x006b
            if (r1 == r5) goto L_0x0061
            goto L_0x006e
        L_0x0061:
            xb8 r1 = r0.L0
            if (r1 == 0) goto L_0x006e
            r0.L0 = r4
            r0.o()
            goto L_0x006e
        L_0x006b:
            r0.n()
        L_0x006e:
            return
        L_0x006f:
            int r2 = r1.what
            if (r2 == r7) goto L_0x0074
            goto L_0x0094
        L_0x0074:
            java.lang.Object r1 = r1.obj
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.b
            ab8 r0 = (defpackage.ab8) r0
            r0.getClass()
            long r2 = android.os.SystemClock.uptimeMillis()
            r0.E0 = r2
            java.util.ArrayList r2 = r0.y0
            r2.clear()
            java.util.ArrayList r2 = r0.y0
            r2.addAll(r1)
            za8 r0 = r0.z0
            r0.C()
        L_0x0094:
            return
        L_0x0095:
            int r2 = r1.what
            if (r2 == r7) goto L_0x009a
            goto L_0x00ba
        L_0x009a:
            java.lang.Object r1 = r1.obj
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.b
            ka8 r0 = (defpackage.ka8) r0
            r0.getClass()
            long r2 = android.os.SystemClock.uptimeMillis()
            r0.C0 = r2
            java.util.ArrayList r2 = r0.y0
            r2.clear()
            java.util.ArrayList r2 = r0.y0
            r2.addAll(r1)
            ja8 r0 = r0.z0
            r0.notifyDataSetChanged()
        L_0x00ba:
            return
        L_0x00bb:
            int r4 = r1.what
            int r5 = r1.arg1
            java.lang.Object r6 = r1.obj
            android.os.Bundle r1 = r21.peekData()
            java.lang.Object r0 = r0.b
            aa8 r0 = (defpackage.aa8) r0
            android.util.SparseArray r7 = r0.j
            java.lang.Object r7 = r7.get(r5)
            u7c r7 = (defpackage.u7c) r7
            if (r7 != 0) goto L_0x00d4
            goto L_0x00f1
        L_0x00d4:
            android.util.SparseArray r0 = r0.j
            r0.remove(r5)
            if (r4 == r2) goto L_0x00ec
            if (r4 == r3) goto L_0x00de
            goto L_0x00f1
        L_0x00de:
            if (r1 != 0) goto L_0x00e1
            goto L_0x00e6
        L_0x00e1:
            java.lang.String r0 = "error"
            r1.getString(r0)
        L_0x00e6:
            android.os.Bundle r6 = (android.os.Bundle) r6
            java.util.Objects.toString(r6)
            goto L_0x00f1
        L_0x00ec:
            android.os.Bundle r6 = (android.os.Bundle) r6
            r7.a(r6)
        L_0x00f1:
            return
        L_0x00f2:
            java.lang.Object r2 = r0.b
            wd8 r2 = (defpackage.wd8) r2
            if (r2 == 0) goto L_0x02d5
            android.os.Bundle r0 = r21.getData()
            int r3 = r1.what
            java.lang.String r4 = "data_callback_token"
            java.lang.String r5 = "data_calling_uid"
            java.lang.String r8 = "data_calling_pid"
            java.lang.String r9 = "data_package_name"
            java.lang.String r10 = "data_root_hints"
            java.lang.String r11 = "data_media_item_id"
            java.lang.String r12 = "data_result_receiver"
            x3a r2 = r2.b
            switch(r3) {
                case 1: goto L_0x026d;
                case 2: goto L_0x0255;
                case 3: goto L_0x0229;
                case 4: goto L_0x0206;
                case 5: goto L_0x01d8;
                case 6: goto L_0x01a9;
                case 7: goto L_0x0190;
                case 8: goto L_0x0153;
                case 9: goto L_0x0116;
                default: goto L_0x0111;
            }
        L_0x0111:
            r21.toString()
            goto L_0x02d8
        L_0x0116:
            java.lang.String r3 = "data_custom_action_extras"
            android.os.Bundle r17 = r0.getBundle(r3)
            defpackage.vc8.a(r17)
            java.lang.String r3 = "data_custom_action"
            java.lang.String r16 = r0.getString(r3)
            android.os.Parcelable r0 = r0.getParcelable(r12)
            r18 = r0
            android.support.v4.os.ResultReceiver r18 = (android.support.v4.os.ResultReceiver) r18
            v18 r15 = new v18
            android.os.Messenger r0 = r1.replyTo
            r15.<init>(r0)
            r2.getClass()
            boolean r0 = android.text.TextUtils.isEmpty(r16)
            if (r0 != 0) goto L_0x02d8
            if (r18 != 0) goto L_0x0141
            goto L_0x02d8
        L_0x0141:
            java.lang.Object r0 = r2.b
            wd8 r0 = (defpackage.wd8) r0
            fx r0 = r0.Z
            kuf r1 = new kuf
            r13 = r1
            r14 = r2
            r13.<init>(r14, r15, r16, r17, r18)
            r0.d(r1)
            goto L_0x02d8
        L_0x0153:
            java.lang.String r3 = "data_search_extras"
            android.os.Bundle r17 = r0.getBundle(r3)
            defpackage.vc8.a(r17)
            java.lang.String r3 = "data_search_query"
            java.lang.String r16 = r0.getString(r3)
            android.os.Parcelable r0 = r0.getParcelable(r12)
            r18 = r0
            android.support.v4.os.ResultReceiver r18 = (android.support.v4.os.ResultReceiver) r18
            v18 r15 = new v18
            android.os.Messenger r0 = r1.replyTo
            r15.<init>(r0)
            r2.getClass()
            boolean r0 = android.text.TextUtils.isEmpty(r16)
            if (r0 != 0) goto L_0x02d8
            if (r18 != 0) goto L_0x017e
            goto L_0x02d8
        L_0x017e:
            java.lang.Object r0 = r2.b
            wd8 r0 = (defpackage.wd8) r0
            fx r0 = r0.Z
            t18 r1 = new t18
            r13 = r1
            r14 = r2
            r13.<init>(r14, r15, r16, r17, r18)
            r0.d(r1)
            goto L_0x02d8
        L_0x0190:
            v18 r0 = new v18
            android.os.Messenger r1 = r1.replyTo
            r0.<init>(r1)
            java.lang.Object r1 = r2.b
            wd8 r1 = (defpackage.wd8) r1
            fx r1 = r1.Z
            p36 r3 = new p36
            r4 = 12
            r3.<init>((java.lang.Object) r2, (java.lang.Object) r0, (boolean) r6, (int) r4)
            r1.d(r3)
            goto L_0x02d8
        L_0x01a9:
            android.os.Bundle r18 = r0.getBundle(r10)
            defpackage.vc8.a(r18)
            v18 r3 = new v18
            android.os.Messenger r1 = r1.replyTo
            r3.<init>(r1)
            java.lang.String r19 = r0.getString(r9)
            int r15 = r0.getInt(r8)
            int r14 = r0.getInt(r5)
            java.lang.Object r0 = r2.b
            wd8 r0 = (defpackage.wd8) r0
            fx r0 = r0.Z
            i54 r1 = new i54
            r13 = r1
            r16 = r3
            r17 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r0.d(r1)
            goto L_0x02d8
        L_0x01d8:
            java.lang.String r3 = r0.getString(r11)
            android.os.Parcelable r0 = r0.getParcelable(r12)
            android.support.v4.os.ResultReceiver r0 = (android.support.v4.os.ResultReceiver) r0
            v18 r4 = new v18
            android.os.Messenger r1 = r1.replyTo
            r4.<init>(r1)
            r2.getClass()
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L_0x02d8
            if (r0 != 0) goto L_0x01f6
            goto L_0x02d8
        L_0x01f6:
            java.lang.Object r1 = r2.b
            wd8 r1 = (defpackage.wd8) r1
            fx r1 = r1.Z
            t18 r5 = new t18
            r5.<init>(r2, r4, r3, r0)
            r1.d(r5)
            goto L_0x02d8
        L_0x0206:
            java.lang.String r16 = r0.getString(r11)
            android.os.IBinder r17 = r0.getBinder(r4)
            v18 r15 = new v18
            android.os.Messenger r0 = r1.replyTo
            r15.<init>(r0)
            java.lang.Object r0 = r2.b
            wd8 r0 = (defpackage.wd8) r0
            fx r0 = r0.Z
            kuf r1 = new kuf
            r18 = 3
            r13 = r1
            r14 = r2
            r13.<init>(r14, r15, r16, r17, r18)
            r0.d(r1)
            goto L_0x02d8
        L_0x0229:
            java.lang.String r3 = "data_options"
            android.os.Bundle r18 = r0.getBundle(r3)
            defpackage.vc8.a(r18)
            java.lang.String r16 = r0.getString(r11)
            android.os.IBinder r17 = r0.getBinder(r4)
            v18 r15 = new v18
            android.os.Messenger r0 = r1.replyTo
            r15.<init>(r0)
            java.lang.Object r0 = r2.b
            wd8 r0 = (defpackage.wd8) r0
            fx r0 = r0.Z
            s18 r1 = new s18
            r19 = 0
            r13 = r1
            r14 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r0.d(r1)
            goto L_0x02d8
        L_0x0255:
            v18 r0 = new v18
            android.os.Messenger r1 = r1.replyTo
            r0.<init>(r1)
            java.lang.Object r1 = r2.b
            wd8 r1 = (defpackage.wd8) r1
            fx r1 = r1.Z
            q36 r3 = new q36
            r4 = 9
            r3.<init>((java.lang.Object) r2, (java.lang.Object) r0, (boolean) r6, (int) r4)
            r1.d(r3)
            goto L_0x02d8
        L_0x026d:
            android.os.Bundle r18 = r0.getBundle(r10)
            defpackage.vc8.a(r18)
            java.lang.String r3 = r0.getString(r9)
            int r14 = r0.getInt(r8)
            int r15 = r0.getInt(r5)
            v18 r0 = new v18
            android.os.Messenger r1 = r1.replyTo
            r0.<init>(r1)
            java.lang.Object r1 = r2.b
            wd8 r1 = (defpackage.wd8) r1
            if (r3 == 0) goto L_0x02b6
            android.content.pm.PackageManager r4 = r1.getPackageManager()
            java.lang.String[] r4 = r4.getPackagesForUid(r15)
            if (r4 == 0) goto L_0x02b9
            int r5 = r4.length
        L_0x0298:
            if (r6 >= r5) goto L_0x02b9
            r8 = r4[r6]
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x02b4
            r18 r4 = new r18
            r13 = r4
            r16 = r0
            r17 = r2
            r19 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19)
            fx r0 = r1.Z
            r0.d(r4)
            goto L_0x02d8
        L_0x02b4:
            int r6 = r6 + r7
            goto L_0x0298
        L_0x02b6:
            r1.getClass()
        L_0x02b9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Package/uid mismatch: uid="
            r1.<init>(r2)
            r1.append(r15)
            java.lang.String r2 = " package="
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x02d5:
            r0.removeCallbacksAndMessages(r4)
        L_0x02d8:
            return
        L_0x02d9:
            java.lang.Object r2 = r1.obj
            byte[] r2 = (byte[]) r2
            if (r2 != 0) goto L_0x02e0
            goto L_0x0313
        L_0x02e0:
            java.lang.Object r0 = r0.b
            z64 r0 = (defpackage.z64) r0
            java.util.ArrayList r0 = r0.m
            java.util.Iterator r0 = r0.iterator()
        L_0x02ea:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0313
            java.lang.Object r4 = r0.next()
            v64 r4 = (defpackage.v64) r4
            r4.p()
            byte[] r7 = r4.v
            boolean r7 = java.util.Arrays.equals(r7, r2)
            if (r7 == 0) goto L_0x02ea
            int r0 = r1.what
            if (r0 == r5) goto L_0x0306
            goto L_0x0313
        L_0x0306:
            int r0 = r4.e
            if (r0 != 0) goto L_0x0313
            int r0 = r4.p
            if (r0 != r3) goto L_0x0313
            int r0 = defpackage.oze.a
            r4.h(r6)
        L_0x0313:
            return
        L_0x0314:
            java.lang.Object r2 = r1.obj
            byte[] r2 = (byte[]) r2
            if (r2 != 0) goto L_0x031b
            goto L_0x034b
        L_0x031b:
            java.lang.Object r0 = r0.b
            y64 r0 = (defpackage.y64) r0
            java.util.ArrayList r0 = r0.m
            java.util.Iterator r0 = r0.iterator()
        L_0x0325:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x034b
            java.lang.Object r4 = r0.next()
            u64 r4 = (defpackage.u64) r4
            byte[] r7 = r4.u
            boolean r7 = java.util.Arrays.equals(r7, r2)
            if (r7 == 0) goto L_0x0325
            int r0 = r1.what
            if (r0 == r5) goto L_0x033e
            goto L_0x034b
        L_0x033e:
            int r0 = r4.e
            if (r0 != 0) goto L_0x034b
            int r0 = r4.o
            if (r0 != r3) goto L_0x034b
            int r0 = defpackage.mze.a
            r4.h(r6)
        L_0x034b:
            return
        L_0x034c:
            r20.a(r21)
            return
        L_0x0350:
            r20.b(r21)
            return
        L_0x0354:
            java.lang.Object r0 = r0.b
            r6 = r0
            jx r6 = (defpackage.jx) r6
            r6.getClass()
            int r0 = r1.what
            if (r0 == r7) goto L_0x03d3
            if (r0 == r5) goto L_0x03a5
            if (r0 == r2) goto L_0x039f
            if (r0 == r3) goto L_0x0383
            java.util.concurrent.atomic.AtomicReference r0 = r6.o
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            int r1 = r1.what
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2.<init>(r1)
        L_0x0373:
            boolean r1 = r0.compareAndSet(r4, r2)
            if (r1 == 0) goto L_0x037b
            goto L_0x03fa
        L_0x037b:
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L_0x0373
            goto L_0x03fa
        L_0x0383:
            java.lang.Object r0 = r1.obj
            android.os.Bundle r0 = (android.os.Bundle) r0
            android.media.MediaCodec r1 = r6.a     // Catch:{ RuntimeException -> 0x038e }
            r1.setParameters(r0)     // Catch:{ RuntimeException -> 0x038e }
            goto L_0x03fa
        L_0x038e:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r1 = r6.o
        L_0x0391:
            boolean r2 = r1.compareAndSet(r4, r0)
            if (r2 == 0) goto L_0x0398
            goto L_0x03fa
        L_0x0398:
            java.lang.Object r2 = r1.get()
            if (r2 == 0) goto L_0x0391
            goto L_0x03fa
        L_0x039f:
            ga3 r0 = r6.X
            r0.g()
            goto L_0x03fa
        L_0x03a5:
            java.lang.Object r0 = r1.obj
            r2 = r0
            hx r2 = (defpackage.hx) r2
            int r8 = r2.a
            int r9 = r2.b
            android.media.MediaCodec$CryptoInfo r10 = r2.d
            long r11 = r2.e
            int r13 = r2.f
            java.lang.Object r1 = defpackage.jx.w0     // Catch:{ RuntimeException -> 0x03c1 }
            monitor-enter(r1)     // Catch:{ RuntimeException -> 0x03c1 }
            android.media.MediaCodec r7 = r6.a     // Catch:{ all -> 0x03be }
            r7.queueSecureInputBuffer(r8, r9, r10, r11, r13)     // Catch:{ all -> 0x03be }
            monitor-exit(r1)     // Catch:{ all -> 0x03be }
            goto L_0x03d1
        L_0x03be:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x03be }
            throw r0     // Catch:{ RuntimeException -> 0x03c1 }
        L_0x03c1:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r3 = r6.o
        L_0x03c4:
            boolean r1 = r3.compareAndSet(r4, r0)
            if (r1 == 0) goto L_0x03cb
            goto L_0x03d1
        L_0x03cb:
            java.lang.Object r1 = r3.get()
            if (r1 == 0) goto L_0x03c4
        L_0x03d1:
            r4 = r2
            goto L_0x03fa
        L_0x03d3:
            java.lang.Object r0 = r1.obj
            r2 = r0
            hx r2 = (defpackage.hx) r2
            int r8 = r2.a
            int r9 = r2.b
            int r10 = r2.c
            long r11 = r2.e
            int r13 = r2.f
            android.media.MediaCodec r7 = r6.a     // Catch:{ RuntimeException -> 0x03e8 }
            r7.queueInputBuffer(r8, r9, r10, r11, r13)     // Catch:{ RuntimeException -> 0x03e8 }
            goto L_0x03f9
        L_0x03e8:
            r0 = move-exception
            r3 = r0
            java.util.concurrent.atomic.AtomicReference r6 = r6.o
        L_0x03ec:
            boolean r0 = r6.compareAndSet(r4, r3)
            if (r0 == 0) goto L_0x03f3
            goto L_0x03f9
        L_0x03f3:
            java.lang.Object r0 = r6.get()
            if (r0 == 0) goto L_0x03ec
        L_0x03f9:
            goto L_0x03d1
        L_0x03fa:
            if (r4 == 0) goto L_0x0407
            java.util.ArrayDeque r1 = defpackage.jx.Z
            monitor-enter(r1)
            r1.add(r4)     // Catch:{ all -> 0x0404 }
            monitor-exit(r1)     // Catch:{ all -> 0x0404 }
            goto L_0x0407
        L_0x0404:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0404 }
            throw r0
        L_0x0407:
            return
        L_0x0408:
            java.lang.Object r0 = r0.b
            r2 = r0
            ix r2 = (defpackage.ix) r2
            r2.getClass()
            int r0 = r1.what
            if (r0 == 0) goto L_0x0467
            if (r0 == r7) goto L_0x0439
            if (r0 == r5) goto L_0x0433
            java.util.concurrent.atomic.AtomicReference r0 = r2.d
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            int r1 = r1.what
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r3.<init>(r1)
        L_0x0425:
            boolean r1 = r0.compareAndSet(r4, r3)
            if (r1 == 0) goto L_0x042c
            goto L_0x048d
        L_0x042c:
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L_0x0425
            goto L_0x048d
        L_0x0433:
            ga3 r0 = r2.e
            r0.g()
            goto L_0x048d
        L_0x0439:
            java.lang.Object r0 = r1.obj
            r3 = r0
            gx r3 = (defpackage.gx) r3
            int r6 = r3.a
            int r7 = r3.b
            android.media.MediaCodec$CryptoInfo r8 = r3.d
            long r9 = r3.e
            int r11 = r3.f
            java.lang.Object r1 = defpackage.ix.h     // Catch:{ RuntimeException -> 0x0455 }
            monitor-enter(r1)     // Catch:{ RuntimeException -> 0x0455 }
            android.media.MediaCodec r5 = r2.a     // Catch:{ all -> 0x0452 }
            r5.queueSecureInputBuffer(r6, r7, r8, r9, r11)     // Catch:{ all -> 0x0452 }
            monitor-exit(r1)     // Catch:{ all -> 0x0452 }
            goto L_0x0465
        L_0x0452:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0452 }
            throw r0     // Catch:{ RuntimeException -> 0x0455 }
        L_0x0455:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r5 = r2.d
        L_0x0458:
            boolean r1 = r5.compareAndSet(r4, r0)
            if (r1 == 0) goto L_0x045f
            goto L_0x0465
        L_0x045f:
            java.lang.Object r1 = r5.get()
            if (r1 == 0) goto L_0x0458
        L_0x0465:
            r4 = r3
            goto L_0x048d
        L_0x0467:
            java.lang.Object r0 = r1.obj
            r1 = r0
            gx r1 = (defpackage.gx) r1
            int r6 = r1.a
            int r7 = r1.b
            int r8 = r1.c
            long r9 = r1.e
            int r11 = r1.f
            android.media.MediaCodec r5 = r2.a     // Catch:{ RuntimeException -> 0x047c }
            r5.queueInputBuffer(r6, r7, r8, r9, r11)     // Catch:{ RuntimeException -> 0x047c }
            goto L_0x048c
        L_0x047c:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r2 = r2.d
        L_0x047f:
            boolean r3 = r2.compareAndSet(r4, r0)
            if (r3 == 0) goto L_0x0486
            goto L_0x048c
        L_0x0486:
            java.lang.Object r3 = r2.get()
            if (r3 == 0) goto L_0x047f
        L_0x048c:
            r4 = r1
        L_0x048d:
            if (r4 == 0) goto L_0x049a
            java.util.ArrayDeque r1 = defpackage.ix.g
            monitor-enter(r1)
            r1.add(r4)     // Catch:{ all -> 0x0497 }
            monitor-exit(r1)     // Catch:{ all -> 0x0497 }
            goto L_0x049a
        L_0x0497:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0497 }
            throw r0
        L_0x049a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fx.handleMessage(android.os.Message):void");
    }

    public boolean sendMessageAtTime(Message message, long j) {
        switch (this.a) {
            case 6:
                Bundle data = message.getData();
                ClassLoader classLoader = j18.class.getClassLoader();
                classLoader.getClass();
                data.setClassLoader(classLoader);
                data.putInt("data_calling_uid", Binder.getCallingUid());
                int callingPid = Binder.getCallingPid();
                if (callingPid > 0) {
                    data.putInt("data_calling_pid", callingPid);
                } else if (!data.containsKey("data_calling_pid")) {
                    data.putInt("data_calling_pid", -1);
                }
                return super.sendMessageAtTime(message, j);
            default:
                return super.sendMessageAtTime(message, j);
        }
    }

    public /* synthetic */ fx(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fx(Object obj, Looper looper, int i) {
        super(looper);
        this.a = i;
        this.b = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fx(aa8 aa8) {
        super(Looper.getMainLooper());
        this.a = 7;
        this.b = aa8;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fx(Looper looper, nxc nxc) {
        super(looper);
        this.a = 13;
        this.b = nxc;
    }
}
