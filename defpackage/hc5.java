package defpackage;

import java.util.Collections;
import kotlin.coroutines.Continuation;

/* renamed from: hc5  reason: default package */
public final class hc5 {
    public final String a = hc5.class.getName();
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;
    public final t97 f;

    public hc5(t97 t97, t97 t972, t97 t973, t97 t974, t97 t975) {
        this.b = t97;
        this.c = t972;
        this.d = t973;
        this.e = t974;
        this.f = t975;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0071 A[Catch:{ all -> 0x0036 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0092 A[Catch:{ all -> 0x0036 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(long r14, long r16, java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21, kotlin.coroutines.Continuation r22) {
        /*
            r13 = this;
            r1 = r13
            r5 = r16
            r0 = r18
            r2 = r20
            r3 = r22
            boolean r4 = r3 instanceof defpackage.fc5
            if (r4 == 0) goto L_0x001d
            r4 = r3
            fc5 r4 = (defpackage.fc5) r4
            int r7 = r4.Z
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r7 & r8
            if (r9 == 0) goto L_0x001d
            int r7 = r7 - r8
            r4.Z = r7
        L_0x001b:
            r9 = r4
            goto L_0x0023
        L_0x001d:
            fc5 r4 = new fc5
            r4.<init>(r13, r3)
            goto L_0x001b
        L_0x0023:
            java.lang.Object r3 = r9.X
            pu3 r10 = pu3.a
            int r4 = r9.Z
            kfa r11 = defpackage.kfa.a
            r7 = 1
            if (r4 == 0) goto L_0x0041
            if (r4 != r7) goto L_0x0039
            hc5 r1 = r9.o
            wx3.H(r3)     // Catch:{ all -> 0x0036 }
            goto L_0x0091
        L_0x0036:
            r0 = move-exception
            goto L_0x00dc
        L_0x0039:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0041:
            wx3.H(r3)
            java.lang.String r3 = r1.a
            java.lang.String r4 = "File attach click. Start process open file"
            udd.q(r3, r4)
            t97 r4 = r1.c
            if (r2 == 0) goto L_0x005f
            int r8 = r20.length()     // Catch:{ all -> 0x0036 }
            if (r8 != 0) goto L_0x0056
            goto L_0x005f
        L_0x0056:
            java.io.File r8 = new java.io.File     // Catch:{ all -> 0x0036 }
            r8.<init>(r2)     // Catch:{ all -> 0x0036 }
            r2 = r8
            r8 = r19
            goto L_0x006b
        L_0x005f:
            java.lang.Object r2 = r4.getValue()     // Catch:{ all -> 0x0036 }
            mg5 r2 = (defpackage.mg5) r2     // Catch:{ all -> 0x0036 }
            r8 = r19
            java.io.File r2 = r2.i(r8)     // Catch:{ all -> 0x0036 }
        L_0x006b:
            boolean r12 = r2.exists()     // Catch:{ all -> 0x0036 }
            if (r12 != 0) goto L_0x0092
            java.lang.String r2 = "file attach not found"
            r4 = 0
            udd.s(r3, r2, r4)     // Catch:{ all -> 0x0036 }
            t97 r2 = r1.e     // Catch:{ all -> 0x0036 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0036 }
            nve r2 = (defpackage.nve) r2     // Catch:{ all -> 0x0036 }
            g10 r8 = defpackage.g10.a     // Catch:{ all -> 0x0036 }
            r9.o = r1     // Catch:{ all -> 0x0036 }
            r9.Z = r7     // Catch:{ all -> 0x0036 }
            r3 = r14
            r5 = r16
            r7 = r18
            java.lang.Object r0 = r2.a(r3, r5, r7, r8, r9)     // Catch:{ all -> 0x0036 }
            if (r0 != r10) goto L_0x0091
            return r10
        L_0x0091:
            return r11
        L_0x0092:
            int r3 = hr1.t(r21)     // Catch:{ all -> 0x0036 }
            if (r3 == 0) goto L_0x00d6
            if (r3 == r7) goto L_0x00d0
            r0 = 2
            if (r3 != r0) goto L_0x00ca
            java.lang.Object r0 = r4.getValue()     // Catch:{ all -> 0x0036 }
            mg5 r0 = (defpackage.mg5) r0     // Catch:{ all -> 0x0036 }
            t97 r3 = r1.d     // Catch:{ all -> 0x0036 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0036 }
            android.content.Context r3 = (android.content.Context) r3     // Catch:{ all -> 0x0036 }
            android.net.Uri r0 = r0.f(r3, r2)     // Catch:{ all -> 0x0036 }
            android.content.Intent r2 = new android.content.Intent     // Catch:{ all -> 0x0036 }
            java.lang.String r3 = "android.intent.action.VIEW"
            r2.<init>(r3)     // Catch:{ all -> 0x0036 }
            r2.setFlags(r7)     // Catch:{ all -> 0x0036 }
            java.lang.String r3 = js.s(r19)     // Catch:{ all -> 0x0036 }
            if (r3 != 0) goto L_0x00c1
            java.lang.String r3 = "*/*"
        L_0x00c1:
            r2.setDataAndType(r0, r3)     // Catch:{ all -> 0x0036 }
            lfa r3 = new lfa     // Catch:{ all -> 0x0036 }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x0036 }
            goto L_0x00db
        L_0x00ca:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0036 }
            r0.<init>()     // Catch:{ all -> 0x0036 }
            throw r0     // Catch:{ all -> 0x0036 }
        L_0x00d0:
            mfa r3 = new mfa     // Catch:{ all -> 0x0036 }
            r3.<init>(r5, r0)     // Catch:{ all -> 0x0036 }
            goto L_0x00db
        L_0x00d6:
            mfa r3 = new mfa     // Catch:{ all -> 0x0036 }
            r3.<init>(r5, r0)     // Catch:{ all -> 0x0036 }
        L_0x00db:
            return r3
        L_0x00dc:
            kcc r2 = new kcc
            r2.<init>(r0)
            java.lang.Throwable r0 = mcc.a(r2)
            if (r0 == 0) goto L_0x00ee
            java.lang.String r1 = r1.a
            java.lang.String r2 = "cant open file attach"
            udd.s(r1, r2, r0)
        L_0x00ee:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hc5.a(long, long, java.lang.String, java.lang.String, java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object b(long j, long j2, long j3, String str, Continuation continuation) {
        int i = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        jue jue = jue.a;
        pu3 pu3 = pu3.a;
        String str2 = this.a;
        if (i == 0) {
            udd.q(str2, "File attach click. Start process delete message");
            ap8 ap8 = (ap8) this.f.getValue();
            ap8.getClass();
            Object a2 = ap8.a(true, Collections.singletonList(new Long(j2)), continuation);
            if (a2 != pu3) {
                a2 = jue;
            }
            return a2 == pu3 ? a2 : jue;
        }
        long j4 = j2;
        Continuation continuation2 = continuation;
        udd.q(str2, "File attach click. Start process cancel download");
        Object a3 = ((nve) this.e.getValue()).a(j, j2, str, g10.b, continuation);
        return a3 == pu3 ? a3 : jue;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(long r17, long r19, long r21, java.lang.String r23, java.lang.String r24, kotlin.coroutines.Continuation r25) {
        /*
            r16 = this;
            r0 = r16
            r1 = r25
            boolean r2 = r1 instanceof defpackage.gc5
            if (r2 == 0) goto L_0x0018
            r2 = r1
            gc5 r2 = (defpackage.gc5) r2
            int r3 = r2.z0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0018
            int r3 = r3 - r4
            r2.z0 = r3
        L_0x0016:
            r10 = r2
            goto L_0x001e
        L_0x0018:
            gc5 r2 = new gc5
            r2.<init>(r0, r1)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r1 = r10.x0
            pu3 r2 = pu3.a
            int r3 = r10.z0
            r4 = 1
            if (r3 == 0) goto L_0x0042
            if (r3 != r4) goto L_0x003a
            long r2 = r10.w0
            long r4 = r10.Z
            java.lang.String r0 = r10.Y
            java.lang.String r6 = r10.X
            hc5 r7 = r10.o
            wx3.H(r1)
            r11 = r0
            r14 = r2
            r12 = r4
            goto L_0x007a
        L_0x003a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0042:
            wx3.H(r1)
            java.lang.String r1 = "File attach click. Start process download"
            java.lang.String r3 = r0.a
            udd.q(r3, r1)
            t97 r1 = r0.e
            java.lang.Object r1 = r1.getValue()
            r3 = r1
            nve r3 = (defpackage.nve) r3
            g10 r9 = defpackage.g10.X
            r10.o = r0
            r1 = r23
            r10.X = r1
            r11 = r24
            r10.Y = r11
            r12 = r19
            r10.Z = r12
            r14 = r21
            r10.w0 = r14
            r10.z0 = r4
            r4 = r17
            r6 = r19
            r8 = r23
            java.lang.Object r3 = r3.a(r4, r6, r8, r9, r10)
            if (r3 != r2) goto L_0x0078
            return r2
        L_0x0078:
            r7 = r0
            r6 = r1
        L_0x007a:
            t97 r0 = r7.b
            java.lang.Object r0 = r0.getValue()
            pk r0 = (defpackage.pk) r0
            gy9 r0 = (defpackage.gy9) r0
            r16 = r0
            r17 = r11
            r18 = r6
            r19 = r14
            r21 = r12
            r16.x(r17, r18, r19, r21)
            jue r0 = jue.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hc5.c(long, long, long, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
