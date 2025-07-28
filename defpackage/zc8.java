package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: zc8  reason: default package */
public final class zc8 extends Handler {
    public boolean a = true;
    public boolean b = true;
    public final /* synthetic */ cd8 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zc8(cd8 cd8, Looper looper) {
        super(looper);
        this.c = cd8;
    }

    public final void a(boolean z, boolean z2) {
        boolean z3 = false;
        this.a = this.a && z;
        if (this.b && z2) {
            z3 = true;
        }
        this.b = z3;
        if (!hasMessages(1)) {
            sendEmptyMessage(1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0079 A[Catch:{ DeadObjectException -> 0x0058, RemoteException -> 0x0050 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0078 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r20) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            int r2 = r0.what
            r3 = 1
            if (r2 != r3) goto L_0x00c7
            cd8 r2 = r1.c
            fza r0 = r2.r
            qza r4 = r2.s
            vje r4 = r4.c0()
            qza r5 = r2.s
            n2d r5 = r5.K()
            fza r6 = r2.r
            int r6 = r6.k
            fza r0 = r0.n(r4, r5, r6)
            r2.r = r0
            boolean r11 = r1.a
            boolean r12 = r1.b
            me8 r13 = r2.g
            fza r14 = r13.G0(r0)
            nxc r15 = r13.e
            ws6 r10 = r15.t()
            r16 = 0
            r9 = r16
        L_0x0037:
            int r0 = r10.size()
            if (r9 >= r0) goto L_0x00c2
            java.lang.Object r0 = r10.get(r9)
            r8 = r0
            ic8 r8 = (defpackage.ic8) r8
            k96 r0 = r15.B(r8)     // Catch:{ DeadObjectException -> 0x0058, RemoteException -> 0x0050 }
            if (r0 == 0) goto L_0x005f
            int r0 = r0.i()     // Catch:{ DeadObjectException -> 0x0058, RemoteException -> 0x0050 }
            r5 = r0
            goto L_0x007b
        L_0x0050:
            r0 = move-exception
            r20 = r8
            r17 = r9
            r18 = r10
            goto L_0x009f
        L_0x0058:
            r20 = r8
            r17 = r9
            r18 = r10
            goto L_0x00b5
        L_0x005f:
            nxc r0 = r13.e     // Catch:{ DeadObjectException -> 0x0058, RemoteException -> 0x0050 }
            boolean r0 = r0.J(r8)     // Catch:{ DeadObjectException -> 0x0058, RemoteException -> 0x0050 }
            if (r0 != 0) goto L_0x0075
            md8 r0 = r2.h     // Catch:{ DeadObjectException -> 0x0058, RemoteException -> 0x0050 }
            nxc r0 = r0.e     // Catch:{ DeadObjectException -> 0x0058, RemoteException -> 0x0050 }
            boolean r0 = r0.J(r8)     // Catch:{ DeadObjectException -> 0x0058, RemoteException -> 0x0050 }
            if (r0 == 0) goto L_0x0072
            goto L_0x0075
        L_0x0072:
            r0 = r16
            goto L_0x0076
        L_0x0075:
            r0 = r3
        L_0x0076:
            if (r0 != 0) goto L_0x0079
            goto L_0x00c2
        L_0x0079:
            r5 = r16
        L_0x007b:
            eya r0 = r15.s(r8)     // Catch:{ DeadObjectException -> 0x0058, RemoteException -> 0x0050 }
            qza r4 = r2.s     // Catch:{ DeadObjectException -> 0x0058, RemoteException -> 0x0050 }
            eya r4 = r4.s()     // Catch:{ DeadObjectException -> 0x0058, RemoteException -> 0x0050 }
            eya r7 = defpackage.am7.s(r0, r4)     // Catch:{ DeadObjectException -> 0x0058, RemoteException -> 0x0050 }
            hc8 r4 = r8.d     // Catch:{ DeadObjectException -> 0x0058, RemoteException -> 0x0050 }
            defpackage.oyb.l(r4)     // Catch:{ DeadObjectException -> 0x0058, RemoteException -> 0x0050 }
            int r0 = r8.c     // Catch:{ DeadObjectException -> 0x0058, RemoteException -> 0x0050 }
            r6 = r14
            r20 = r8
            r8 = r11
            r17 = r9
            r9 = r12
            r18 = r10
            r10 = r0
            r4.d(r5, r6, r7, r8, r9, r10)     // Catch:{ DeadObjectException -> 0x00b5, RemoteException -> 0x009e }
            goto L_0x00bc
        L_0x009e:
            r0 = move-exception
        L_0x009f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Exception in "
            r4.<init>(r5)
            java.lang.String r5 = r20.toString()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            defpackage.ez3.k0(r4, r0)
            goto L_0x00bc
        L_0x00b5:
            nxc r0 = r13.e
            r4 = r20
            r0.V(r4)
        L_0x00bc:
            int r9 = r17 + 1
            r10 = r18
            goto L_0x0037
        L_0x00c2:
            r1.a = r3
            r1.b = r3
            return
        L_0x00c7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid message what="
            r2.<init>(r3)
            int r0 = r0.what
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zc8.handleMessage(android.os.Message):void");
    }
}
