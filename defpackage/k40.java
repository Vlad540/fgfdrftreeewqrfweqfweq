package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.webrtc.HardwareVideoEncoderFactory;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;

/* renamed from: k40  reason: default package */
public final class k40 implements ne8 {
    public Object X;
    public Object Y;
    public Object Z;
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;
    public Object o;
    public Object w0;

    public /* synthetic */ k40(ere ere, ViewGroup viewGroup, Object obj, View view, Object obj2, boolean z, Object obj3, int i) {
        this.a = i;
        this.w0 = ere;
        this.c = viewGroup;
        this.o = obj;
        this.X = view;
        this.Y = obj2;
        this.b = z;
        this.Z = obj3;
    }

    public void a(yfd yfd) {
        mfd mfd;
        yfd yfd2 = (yfd) this.w0;
        if (yfd2 != null) {
            if (!yfd2.equals(yfd) || this.b) {
                boolean z = true;
                if (((gx0) ((c9) this.o).b).O1) {
                    this.b = true;
                    return;
                }
                gx0 gx0 = (gx0) ((c9) this.o).b;
                if (gx0.R0) {
                    if ((gx0.F0 || gx0.s()) && (mfd = ((gx0) ((vle) this.c).a).Z) != null) {
                        fe1 fe1 = (fe1) this.Y;
                        boolean z2 = fe1 != null && fe1.u;
                        if (fe1 == null || !fe1.v) {
                            z = false;
                        }
                        mfd.d(new rfd(yfd, z2, z), false, (lfd) null, (ax0) this.Z);
                        this.w0 = yfd;
                        this.b = false;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0119 A[Catch:{ IllegalArgumentException -> 0x0139 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.at1 b(defpackage.qu1 r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            java.lang.String r2 = "requested initial facing is "
            java.lang.String r3 = "OKRTCSvcFactory"
            java.lang.Object r4 = r1.o
            xwb r4 = (defpackage.xwb) r4
            java.lang.String r5 = "creating camera capturer adapter using camera api "
            java.lang.Object r6 = r1.w0
            android.content.Context r6 = (android.content.Context) r6
            r7 = 0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0139 }
            r8.<init>(r5)     // Catch:{ IllegalArgumentException -> 0x0139 }
            boolean r5 = r1.b     // Catch:{ IllegalArgumentException -> 0x0139 }
            r9 = 1
            if (r5 == 0) goto L_0x001f
            r5 = 2
            goto L_0x0020
        L_0x001f:
            r5 = r9
        L_0x0020:
            r8.append(r5)     // Catch:{ IllegalArgumentException -> 0x0139 }
            java.lang.String r5 = r8.toString()     // Catch:{ IllegalArgumentException -> 0x0139 }
            r4.log(r3, r5)     // Catch:{ IllegalArgumentException -> 0x0139 }
            if (r0 == 0) goto L_0x003c
            r5 = 3
            int r8 = r0.a
            if (r8 == r5) goto L_0x003c
            java.lang.String r5 = defpackage.rf0.r(r8)     // Catch:{ IllegalArgumentException -> 0x0139 }
            java.lang.String r2 = r2.concat(r5)     // Catch:{ IllegalArgumentException -> 0x0139 }
            r4.log(r3, r2)     // Catch:{ IllegalArgumentException -> 0x0139 }
        L_0x003c:
            boolean r2 = r1.b     // Catch:{ IllegalArgumentException -> 0x0139 }
            if (r2 == 0) goto L_0x0049
            if (r6 == 0) goto L_0x0049
            pq1 r2 = new pq1     // Catch:{ IllegalArgumentException -> 0x0139 }
            r2.<init>((android.content.Context) r6, (defpackage.xwb) r4)     // Catch:{ IllegalArgumentException -> 0x0139 }
        L_0x0047:
            r13 = r2
            goto L_0x0052
        L_0x0049:
            pq1 r2 = new pq1     // Catch:{ IllegalArgumentException -> 0x0139 }
            boolean r5 = defpackage.d59.a     // Catch:{ IllegalArgumentException -> 0x0139 }
            r5 = r5 ^ r9
            r2.<init>((defpackage.xwb) r4, (boolean) r5)     // Catch:{ IllegalArgumentException -> 0x0139 }
            goto L_0x0047
        L_0x0052:
            java.util.ArrayList r2 = r13.F()     // Catch:{ IllegalArgumentException -> 0x0139 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ IllegalArgumentException -> 0x0139 }
            r5 = r7
            r6 = r5
            r8 = r6
            r10 = r8
        L_0x005e:
            boolean r11 = r2.hasNext()     // Catch:{ IllegalArgumentException -> 0x0139 }
            if (r11 == 0) goto L_0x008b
            java.lang.Object r11 = r2.next()     // Catch:{ IllegalArgumentException -> 0x0139 }
            du1 r11 = (defpackage.du1) r11     // Catch:{ IllegalArgumentException -> 0x0139 }
            boolean r12 = r11 instanceof defpackage.bu1     // Catch:{ IllegalArgumentException -> 0x0139 }
            if (r12 == 0) goto L_0x009b
            if (r5 != 0) goto L_0x005e
            r12 = r11
            bu1 r12 = (defpackage.bu1) r12     // Catch:{ IllegalArgumentException -> 0x0139 }
            java.util.List r12 = r12.b     // Catch:{ IllegalArgumentException -> 0x0139 }
            boolean r12 = r12.isEmpty()     // Catch:{ IllegalArgumentException -> 0x0139 }
            if (r12 != 0) goto L_0x008e
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IllegalArgumentException -> 0x0139 }
            r10 = r11
            bu1 r10 = (defpackage.bu1) r10     // Catch:{ IllegalArgumentException -> 0x0139 }
            java.util.List r10 = r10.b     // Catch:{ IllegalArgumentException -> 0x0139 }
            r5.<init>(r10)     // Catch:{ IllegalArgumentException -> 0x0139 }
            bu1 r11 = (defpackage.bu1) r11     // Catch:{ IllegalArgumentException -> 0x0139 }
            java.lang.String r10 = r11.a     // Catch:{ IllegalArgumentException -> 0x0139 }
            if (r6 == 0) goto L_0x005e
        L_0x008b:
            r14 = r5
            r15 = r6
            goto L_0x00ca
        L_0x008e:
            java.lang.String r11 = "camera.enumerator.npe.front"
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ IllegalArgumentException -> 0x0139 }
            java.lang.String r14 = "No supported formats for front camera"
            r12.<init>(r14)     // Catch:{ IllegalArgumentException -> 0x0139 }
            r4.reportException(r3, r11, r12)     // Catch:{ IllegalArgumentException -> 0x0139 }
            goto L_0x005e
        L_0x009b:
            boolean r12 = r11 instanceof defpackage.au1     // Catch:{ IllegalArgumentException -> 0x0139 }
            if (r12 == 0) goto L_0x005e
            if (r6 != 0) goto L_0x005e
            r12 = r11
            au1 r12 = (defpackage.au1) r12     // Catch:{ IllegalArgumentException -> 0x0139 }
            java.util.List r12 = r12.b     // Catch:{ IllegalArgumentException -> 0x0139 }
            boolean r12 = r12.isEmpty()     // Catch:{ IllegalArgumentException -> 0x0139 }
            if (r12 != 0) goto L_0x00bd
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ IllegalArgumentException -> 0x0139 }
            r8 = r11
            au1 r8 = (defpackage.au1) r8     // Catch:{ IllegalArgumentException -> 0x0139 }
            java.util.List r8 = r8.b     // Catch:{ IllegalArgumentException -> 0x0139 }
            r6.<init>(r8)     // Catch:{ IllegalArgumentException -> 0x0139 }
            au1 r11 = (defpackage.au1) r11     // Catch:{ IllegalArgumentException -> 0x0139 }
            java.lang.String r8 = r11.a     // Catch:{ IllegalArgumentException -> 0x0139 }
            if (r5 == 0) goto L_0x005e
            goto L_0x008b
        L_0x00bd:
            java.lang.String r11 = "camera.enumeratore.npe.back"
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ IllegalArgumentException -> 0x0139 }
            java.lang.String r14 = "No supported formats for back camera"
            r12.<init>(r14)     // Catch:{ IllegalArgumentException -> 0x0139 }
            r4.reportException(r3, r11, r12)     // Catch:{ IllegalArgumentException -> 0x0139 }
            goto L_0x005e
        L_0x00ca:
            if (r0 == 0) goto L_0x00d2
            int r0 = r0.a     // Catch:{ IllegalArgumentException -> 0x0139 }
            if (r0 != r9) goto L_0x00d1
            goto L_0x00d2
        L_0x00d1:
            r9 = 0
        L_0x00d2:
            r16 = r9
            if (r16 == 0) goto L_0x00d7
            goto L_0x00d8
        L_0x00d7:
            r10 = r8
        L_0x00d8:
            java.lang.Object r0 = r1.Z
            r2 = r0
            nfc r2 = (nfc) r2
            java.lang.Object r0 = r1.Y
            r5 = r0
            zja r5 = (defpackage.zja) r5
            if (r10 == 0) goto L_0x00f8
            org.webrtc.CameraVideoCapturer r0 = r13.createCapturer(r10, r5, r2)     // Catch:{ Exception -> 0x00ea }
            r12 = r0
            goto L_0x00f9
        L_0x00ea:
            r0 = move-exception
            r6 = r0
            java.lang.String r0 = "camera.enumerator.create"
            java.lang.RuntimeException r9 = new java.lang.RuntimeException     // Catch:{ IllegalArgumentException -> 0x0139 }
            java.lang.String r10 = "Cant create front camera capturer"
            r9.<init>(r10, r6)     // Catch:{ IllegalArgumentException -> 0x0139 }
            r4.reportException(r3, r0, r9)     // Catch:{ IllegalArgumentException -> 0x0139 }
        L_0x00f8:
            r12 = r7
        L_0x00f9:
            if (r12 == 0) goto L_0x0117
            if (r14 == 0) goto L_0x0117
            if (r15 != 0) goto L_0x0105
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ IllegalArgumentException -> 0x0139 }
            r0.<init>(r14)     // Catch:{ IllegalArgumentException -> 0x0139 }
            r15 = r0
        L_0x0105:
            at1 r0 = new at1     // Catch:{ IllegalArgumentException -> 0x0139 }
            java.lang.Object r2 = r1.c     // Catch:{ IllegalArgumentException -> 0x0139 }
            r11 = r2
            cs9 r11 = (defpackage.cs9) r11     // Catch:{ IllegalArgumentException -> 0x0139 }
            java.lang.Object r1 = r1.o     // Catch:{ IllegalArgumentException -> 0x0139 }
            r17 = r1
            xwb r17 = (defpackage.xwb) r17     // Catch:{ IllegalArgumentException -> 0x0139 }
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ IllegalArgumentException -> 0x0139 }
            return r0
        L_0x0117:
            if (r15 == 0) goto L_0x013e
            if (r14 != 0) goto L_0x0121
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ IllegalArgumentException -> 0x0139 }
            r0.<init>(r15)     // Catch:{ IllegalArgumentException -> 0x0139 }
            r14 = r0
        L_0x0121:
            at1 r0 = new at1     // Catch:{ IllegalArgumentException -> 0x0139 }
            java.lang.Object r6 = r1.c     // Catch:{ IllegalArgumentException -> 0x0139 }
            r11 = r6
            cs9 r11 = (defpackage.cs9) r11     // Catch:{ IllegalArgumentException -> 0x0139 }
            org.webrtc.CameraVideoCapturer r12 = r13.createCapturer(r8, r5, r2)     // Catch:{ IllegalArgumentException -> 0x0139 }
            java.lang.Object r1 = r1.o     // Catch:{ IllegalArgumentException -> 0x0139 }
            r17 = r1
            xwb r17 = (defpackage.xwb) r17     // Catch:{ IllegalArgumentException -> 0x0139 }
            r16 = 0
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ IllegalArgumentException -> 0x0139 }
            return r0
        L_0x0139:
            java.lang.String r0 = "IAE @ camera enumeration"
            r4.log(r3, r0)
        L_0x013e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Cant find camera capturer"
            r0.<init>(r1)
            java.lang.String r1 = "camera.enumerator.null"
            r4.reportException(r3, r1, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k40.b(qu1):at1");
    }

    public void c(yfd yfd) {
        this.w0 = yfd;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [hca, android.view.View] */
    public void d(jba jba) {
        j8e callback;
        int ordinal = jba.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
            }
            b7e b7e = (b7e) this.X;
            if (!(b7e == null || (callback = b7e.getCallback()) == null)) {
                callback.y();
            }
            iba iba = (iba) this.Y;
            if (iba != null) {
                iba.J(jba);
                return;
            }
            return;
        }
        b7e b7e2 = (b7e) this.X;
        if (b7e2 != null) {
            zu4 zu4 = new zu4((Object) this, 25, (Object) jba);
            j8e j8e = b7e2.o;
            if (j8e != null) {
                j8e j8e2 = j8e;
                if (((hca) j8e2.c).getHeight() > 0) {
                    b7e b7e3 = b7e2;
                    b7e3.c(j8e2.p(), j8e2.q(), new nya(zu4, 23, j8e), new opd(11), new z6e(b7e2, 1));
                }
                b7e2.invalidate();
            }
        }
    }

    public void e() {
        if (!this.b) {
            if (((Long) this.Z) != null) {
                ((xwb) this.X).log((String) this.Y, "Duplicate accept event");
            }
            ((fje) ((eje) this.c)).getClass();
            this.Z = Long.valueOf(SystemClock.elapsedRealtime());
        }
    }

    public void f() {
        if (!this.b) {
            Long l = (Long) this.Z;
            if (l == null) {
                ((xwb) this.X).log((String) this.Y, "Data is received but accept event wasn't triggered");
                return;
            }
            ((fje) ((eje) this.c)).getClass();
            ((x41) ((w41) this.o)).c("first_media_received", EventItemValueKt.toEventItemValue(SystemClock.elapsedRealtime() - l.longValue()), new EventItemsMap(Collections.singletonMap("call_type", EventItemValueKt.toEventItemValue((String) this.w0))));
            this.b = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0237  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g() {
        /*
            r23 = this;
            r0 = r23
            int r1 = r0.a
            switch(r1) {
                case 4: goto L_0x0040;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r0.w0
            ere r1 = (ere) r1
            boolean r1 = r1.o
            if (r1 != 0) goto L_0x003f
            java.lang.Object r1 = r0.o
            cre r1 = (cre) r1
            java.lang.Object r2 = r0.c
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            ire.a(r2, r1)
            java.lang.Object r1 = r0.o
            r7 = r1
            cre r7 = (cre) r7
            boolean r8 = r0.b
            java.lang.Object r1 = r0.w0
            r3 = r1
            ere r3 = (ere) r3
            java.lang.Object r1 = r0.c
            r4 = r1
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            java.lang.Object r1 = r0.X
            r5 = r1
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r1 = r0.Y
            r6 = r1
            android.view.View r6 = (android.view.View) r6
            r3.k(r4, r5, r6, r7, r8)
            java.lang.Object r0 = r0.Z
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r2.post(r0)
        L_0x003f:
            return
        L_0x0040:
            java.lang.Object r1 = r0.w0
            ccd r1 = (ccd) r1
            r1.getClass()
            android.view.View r10 = new android.view.View
            java.lang.Object r2 = r0.c
            r11 = r2
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            android.content.Context r2 = r11.getContext()
            r10.<init>(r2)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.lang.Object r2 = r0.o
            r14 = r2
            android.view.View r14 = (android.view.View) r14
            java.lang.Object r2 = r0.X
            r15 = r2
            android.view.View r15 = (android.view.View) r15
            r9 = 0
            if (r15 == 0) goto L_0x00bb
            if (r14 != 0) goto L_0x006f
            goto L_0x00bb
        L_0x006f:
            yr r2 = r1.Z
            boolean r3 = r2.isEmpty()
            r4 = 0
            if (r3 != 0) goto L_0x0099
            cre r3 = r1.A0
            if (r3 != 0) goto L_0x007d
            goto L_0x0099
        L_0x007d:
            yr r3 = new yr
            r3.<init>(r4)
            defpackage.swb.q(r3, r14)
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.Set r6 = r2.keySet()
            r5.<init>(r6)
            r3.l(r5)
            java.util.Set r5 = r3.keySet()
            r2.l(r5)
            goto L_0x009d
        L_0x0099:
            r2.clear()
            r3 = r9
        L_0x009d:
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L_0x00a6
            r1.A0 = r9
            goto L_0x00af
        L_0x00a6:
            if (r3 == 0) goto L_0x00af
            java.util.Collection r5 = r3.values()
            r12.addAll(r5)
        L_0x00af:
            cre r5 = r1.z0
            if (r5 != 0) goto L_0x00c3
            cre r5 = r1.y0
            if (r5 != 0) goto L_0x00c3
            cre r5 = r1.A0
            if (r5 != 0) goto L_0x00c3
        L_0x00bb:
            r19 = r13
            r17 = r14
            r13 = r9
            r9 = r11
            goto L_0x0207
        L_0x00c3:
            cre r5 = r1.A0
            if (r5 == 0) goto L_0x01ec
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            cre r6 = r1.A0
            java.util.ArrayList r7 = r6.Y
            r7.clear()
            int r8 = r12.size()
            r9 = r4
        L_0x00d8:
            if (r9 >= r8) goto L_0x0161
            java.lang.Object r16 = r12.get(r9)
            r4 = r16
            android.view.View r4 = (android.view.View) r4
            r16 = r8
            int r8 = r7.size()
            r17 = r14
            r14 = 0
        L_0x00eb:
            if (r14 >= r8) goto L_0x00fe
            r18 = r11
            java.lang.Object r11 = r7.get(r14)
            if (r11 != r4) goto L_0x00f9
        L_0x00f5:
            r19 = r13
            goto L_0x0154
        L_0x00f9:
            int r14 = r14 + 1
            r11 = r18
            goto L_0x00eb
        L_0x00fe:
            r18 = r11
            r7.add(r4)
            r4 = r8
        L_0x0104:
            int r11 = r7.size()
            if (r4 >= r11) goto L_0x00f5
            java.lang.Object r11 = r7.get(r4)
            android.view.View r11 = (android.view.View) r11
            boolean r14 = r11 instanceof android.view.ViewGroup
            if (r14 == 0) goto L_0x0149
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            int r14 = r11.getChildCount()
            r19 = r13
            r13 = 0
        L_0x011d:
            if (r13 >= r14) goto L_0x0146
            r20 = r14
            android.view.View r14 = r11.getChildAt(r13)
            r21 = r11
            r11 = 0
        L_0x0128:
            if (r11 >= r8) goto L_0x0138
            r22 = r8
            java.lang.Object r8 = r7.get(r11)
            if (r8 != r14) goto L_0x0133
            goto L_0x013d
        L_0x0133:
            int r11 = r11 + 1
            r8 = r22
            goto L_0x0128
        L_0x0138:
            r22 = r8
            r7.add(r14)
        L_0x013d:
            int r13 = r13 + 1
            r14 = r20
            r11 = r21
            r8 = r22
            goto L_0x011d
        L_0x0146:
            r22 = r8
            goto L_0x014d
        L_0x0149:
            r22 = r8
            r19 = r13
        L_0x014d:
            int r4 = r4 + 1
            r13 = r19
            r8 = r22
            goto L_0x0104
        L_0x0154:
            int r9 = r9 + 1
            r8 = r16
            r14 = r17
            r11 = r18
            r13 = r19
            r4 = 0
            goto L_0x00d8
        L_0x0161:
            r18 = r11
            r19 = r13
            r17 = r14
            r7.add(r10)
            r12.add(r10)
            defpackage.swb.b(r6, r12)
            int r4 = r2.c
            if (r4 <= 0) goto L_0x01dd
            if (r3 == 0) goto L_0x01dd
            r4 = 0
            java.lang.Object r2 = r2.f(r4)
            java.lang.Object r2 = r3.get(r2)
            android.view.View r2 = (android.view.View) r2
            cre r3 = r1.A0
            r4 = 2
            r6 = 1
            if (r3 == 0) goto L_0x01b0
            if (r2 == 0) goto L_0x01b0
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            int[] r8 = new int[r4]
            r2.getLocationOnScreen(r8)
            r9 = 0
            r11 = r8[r9]
            r9 = r8[r6]
            int r13 = r2.getWidth()
            int r13 = r13 + r11
            r8 = r8[r6]
            int r14 = r2.getHeight()
            int r14 = r14 + r8
            r7.set(r11, r9, r13, r14)
            ybd r8 = new ybd
            r9 = 1
            r8.<init>(r9, r7)
            r3.K(r8)
        L_0x01b0:
            cre r3 = r1.y0
            if (r3 == 0) goto L_0x01dd
            if (r2 == 0) goto L_0x01dd
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            int[] r4 = new int[r4]
            r2.getLocationOnScreen(r4)
            r8 = 0
            r8 = r4[r8]
            r9 = r4[r6]
            int r11 = r2.getWidth()
            int r11 = r11 + r8
            r4 = r4[r6]
            int r2 = r2.getHeight()
            int r2 = r2 + r4
            r7.set(r8, r9, r11, r2)
            ybd r2 = new ybd
            r4 = 1
            r2.<init>(r4, r7)
            r3.K(r2)
        L_0x01dd:
            cre r2 = r1.z0
            if (r2 == 0) goto L_0x01ea
            ybd r3 = new ybd
            r4 = 0
            r3.<init>(r4, r5)
            r2.K(r3)
        L_0x01ea:
            r9 = r5
            goto L_0x01f3
        L_0x01ec:
            r18 = r11
            r19 = r13
            r17 = r14
            r9 = 0
        L_0x01f3:
            xbd r11 = new xbd
            boolean r5 = r0.b
            r2 = r11
            r3 = r1
            r4 = r15
            r6 = r19
            r7 = r10
            r8 = r12
            r13 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r9 = r18
            acd.a(r9, r11)
        L_0x0207:
            cre r2 = r1.y0
            if (r2 == 0) goto L_0x0228
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r17 == 0) goto L_0x0217
            r4 = r17
            ccd.n(r3, r4)
        L_0x0217:
            r3.removeAll(r12)
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L_0x0226
            r3.add(r10)
            defpackage.swb.b(r2, r3)
        L_0x0226:
            r11 = r3
            goto L_0x0229
        L_0x0228:
            r11 = r13
        L_0x0229:
            if (r11 == 0) goto L_0x0231
            boolean r2 = r11.isEmpty()
            if (r2 == 0) goto L_0x0233
        L_0x0231:
            r1.y0 = r13
        L_0x0233:
            cre r2 = r1.z0
            if (r2 == 0) goto L_0x023a
            r2.c(r10)
        L_0x023a:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            cre r3 = r1.z0
            cre r5 = r1.y0
            cre r7 = r1.A0
            zbd r13 = new zbd
            r2 = r13
            r4 = r12
            r6 = r11
            r8 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.lang.Object r2 = r0.Y
            cre r2 = (cre) r2
            r2.a(r13)
            xbd r13 = new xbd
            r2 = r13
            r3 = r1
            r4 = r10
            r5 = r15
            r6 = r19
            r7 = r12
            r8 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            acd.a(r9, r13)
            p36 r2 = new p36
            r3 = 21
            r4 = 0
            r5 = r19
            r2.<init>(r1, r5, r4, r3)
            acd.a(r9, r2)
            q36 r2 = new q36
            r3 = 19
            r4 = 0
            r2.<init>(r1, r5, r4, r3)
            acd.a(r9, r2)
            java.lang.Object r0 = r0.Z
            k40 r0 = (defpackage.k40) r0
            r0.g()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k40.g():void");
    }

    public void h() {
        if (((Long) this.Z) != null && !this.b) {
            this.b = true;
            ((i03) ((f03) ((t97) this.Y).getValue())).i("app.audio_onboarding_ended", true);
        }
    }

    public String toString() {
        switch (this.a) {
            case 5:
                return d59.c(this);
            default:
                return super.toString();
        }
    }

    public k40(pd pdVar) {
        this.a = 5;
        this.X = (zk7) pdVar.X;
        xwb xwb = (xwb) pdVar.c;
        this.o = xwb;
        this.c = (cs9) pdVar.b;
        xwb.log("OKRTCSvcFactory", "Is VIDEO HW acceleration enabled ? ".concat(d59.a ^ true ? "yes" : "no"));
        xwb.log("OKRTCSvcFactory", "Is Camera2 API enabled ? " + pdVar.a);
        this.b = pdVar.a;
        this.w0 = (Context) pdVar.Y;
        this.Y = new zja(xwb);
        this.Z = new nfc(8, xwb);
        HardwareVideoEncoderFactory.odklSupportedH264HwCodecPrefixes.clear();
        HardwareVideoEncoderFactory.odklSupportedH264HwCodecPrefixes.addAll((List) pdVar.o);
    }

    public k40(fje fje, w41 w41, xwb xwb, String str, String str2) {
        this.a = 3;
        this.c = fje;
        this.o = w41;
        this.X = xwb;
        this.Y = str;
        this.w0 = str2;
    }

    public k40(vle vle, c9 c9Var, xwb xwb, fe1 fe1) {
        this.a = 1;
        this.w0 = null;
        this.b = false;
        this.c = vle;
        this.o = c9Var;
        this.X = xwb;
        this.Z = new ax0(1, this);
        this.Y = fe1;
    }

    public k40(va9 va9, ou3 ou3, t97 t97) {
        this.a = 0;
        this.c = va9;
        hcd b2 = icd.b(0, Integer.MAX_VALUE, 0, 5);
        this.o = b2;
        this.X = new s0c(b2);
        this.Y = t97;
        boolean z = ((i03) ((f03) t97.getValue())).g.getBoolean("app.audio_onboarding_ended", false);
        this.b = z;
        lhd lhd = new lhd(3, (Object) this);
        this.w0 = lhd;
        if (!z) {
            ((nb9) va9).e(lhd);
            lp.q(ou3.getCoroutineContext()).invokeOnCompletion(new l(11, this));
        }
    }

    public k40(WeakReference weakReference) {
        this.a = 2;
        this.c = weakReference;
        this.o = fca.Z;
        this.Z = new ck(6, this);
        this.w0 = new kba(this);
    }
}
