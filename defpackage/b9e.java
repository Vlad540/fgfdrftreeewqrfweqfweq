package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import one.me.sdk.vendor.StoreServicesInfo$ServicesNotAvailableException;
import one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener;

/* renamed from: b9e  reason: default package */
public final class b9e implements pp7 {
    public final t97 X;
    public final t97 Y;
    public final ContextScope Z;
    public final String a = b9e.class.getName();
    public final t97 b;
    public final t97 c;
    public final t97 o;

    public b9e(t97 t97, t97 t972, t97 t973, b27 b27, t97 t974, t97 t975, ku3 ku3) {
        this.b = t97;
        this.c = t972;
        this.o = t973;
        this.X = t974;
        this.Y = t975;
        this.Z = n1g.a(b27.a.limitedParallelism(1, "vendor").plus(ku3));
    }

    public final void a() {
        n1g.c(this.Z, (CancellationException) null);
    }

    public final f03 b() {
        return (f03) this.c.getValue();
    }

    public final pv3 c() {
        return (pv3) this.Y.getValue();
    }

    public final String d() {
        String string = ((lqc) b()).g.getString("user.fcmToken", (String) null);
        if (!(string == null || string.length() == 0)) {
            g().getClass();
            if ("GCM".equals(((lqc) b()).g.getString("user.pushDeviceType", (String) null))) {
                return string;
            }
        }
        xs7.E(this.Z, (hu3) null, (ru3) null, new y8e(this, (SystemServicesManager$PushTokenGeneratedListener) this.X.getValue(), (Continuation) null), 3);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054 A[Catch:{ Exception -> 0x002d }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0095 A[Catch:{ Exception -> 0x002d }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            java.lang.String r0 = "getPushToken: got "
            boolean r1 = r7 instanceof defpackage.z8e
            if (r1 == 0) goto L_0x0015
            r1 = r7
            z8e r1 = (defpackage.z8e) r1
            int r2 = r1.w0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.w0 = r2
            goto L_0x001a
        L_0x0015:
            z8e r1 = new z8e
            r1.<init>(r5, r7)
        L_0x001a:
            java.lang.Object r7 = r1.Y
            pu3 r2 = pu3.a
            int r3 = r1.w0
            r4 = 1
            if (r3 == 0) goto L_0x0038
            if (r3 != r4) goto L_0x0030
            one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener r6 = r1.X
            b9e r5 = r1.o
            wx3.H(r7)     // Catch:{ Exception -> 0x002d }
            goto L_0x004e
        L_0x002d:
            r6 = move-exception
            goto L_0x00a0
        L_0x0030:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0038:
            wx3.H(r7)
            ezd r7 = r5.g()     // Catch:{ Exception -> 0x002d }
            r1.o = r5     // Catch:{ Exception -> 0x002d }
            r1.X = r6     // Catch:{ Exception -> 0x002d }
            r1.w0 = r4     // Catch:{ Exception -> 0x002d }
            fb6 r7 = (defpackage.fb6) r7     // Catch:{ Exception -> 0x002d }
            java.lang.Object r7 = r7.b(r1)     // Catch:{ Exception -> 0x002d }
            if (r7 != r2) goto L_0x004e
            return r2
        L_0x004e:
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x002d }
            java.lang.String r1 = r5.a     // Catch:{ Exception -> 0x002d }
            if (r7 == 0) goto L_0x005e
            int r2 = r7.length()     // Catch:{ Exception -> 0x002d }
            if (r2 != 0) goto L_0x005b
            goto L_0x005e
        L_0x005b:
            java.lang.String r2 = "normal"
            goto L_0x0060
        L_0x005e:
            java.lang.String r2 = "empty"
        L_0x0060:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002d }
            r3.<init>(r0)     // Catch:{ Exception -> 0x002d }
            r3.append(r2)     // Catch:{ Exception -> 0x002d }
            java.lang.String r0 = " token"
            r3.append(r0)     // Catch:{ Exception -> 0x002d }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x002d }
            udd.q(r1, r0)     // Catch:{ Exception -> 0x002d }
            f03 r0 = r5.b()     // Catch:{ Exception -> 0x002d }
            lqc r0 = (defpackage.lqc) r0     // Catch:{ Exception -> 0x002d }
            java.lang.String r1 = "user.fcmToken"
            r0.l(r1, r7)     // Catch:{ Exception -> 0x002d }
            f03 r0 = r5.b()     // Catch:{ Exception -> 0x002d }
            ezd r1 = r5.g()     // Catch:{ Exception -> 0x002d }
            r1.getClass()     // Catch:{ Exception -> 0x002d }
            java.lang.String r1 = "GCM"
            lqc r0 = (defpackage.lqc) r0     // Catch:{ Exception -> 0x002d }
            java.lang.String r2 = "user.pushDeviceType"
            r0.l(r2, r1)     // Catch:{ Exception -> 0x002d }
            if (r7 == 0) goto L_0x00a7
            int r0 = r7.length()     // Catch:{ Exception -> 0x002d }
            if (r0 != 0) goto L_0x009c
            goto L_0x00a7
        L_0x009c:
            r6.onPushTokenGenerated(r7)     // Catch:{ Exception -> 0x002d }
            goto L_0x00a7
        L_0x00a0:
            java.lang.String r5 = r5.a
            java.lang.String r7 = "getPushToken: failed"
            udd.s(r5, r7, r6)
        L_0x00a7:
            jue r5 = jue.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b9e.e(one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final String f() {
        ih5 ih5;
        fb6 fb6 = (fb6) g();
        if (fb6.a()) {
            r7e r7e = fb6.c;
            n6g n6g = null;
            if (r7e.a() && (ih5 = (ih5) r7e.getValue()) != null) {
                try {
                    Object obj = lh5.m;
                    ih5.a();
                    n6g = ((lh5) ih5.d.a(mh5.class)).c();
                } catch (Exception e) {
                    udd.s(fb6.b, "getInstanceIdTask: failed to get FirebaseInstanceId", e);
                }
            }
            if (n6g != null) {
                try {
                    return (String) gwf.a(n6g);
                } catch (Exception e2) {
                    throw new Exception("getServiceInstanceId: getInstanceId failed", e2);
                }
            } else {
                throw new Exception("failed to get instance id task");
            }
        } else {
            throw new StoreServicesInfo$ServicesNotAvailableException();
        }
    }

    public final ezd g() {
        return (ezd) this.b.getValue();
    }
}
