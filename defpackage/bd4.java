package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import me.leolin.shortcutbadger.BuildConfig;
import org.webrtc.EglBase;
import org.webrtc.NativeDoubleArrayConsumer;

/* renamed from: bd4  reason: default package */
public final class bd4 implements j26 {
    public static bd4 Z;
    public Object X;
    public Object Y;
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public Object o;

    public bd4() {
        this.a = 0;
        this.b = new Object();
        this.Y = new re(14, this);
        this.o = new ArrayList();
        this.X = new ArrayList();
        this.c = new Handler(Looper.getMainLooper());
    }

    public static bd4 c(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        bd4 bd4 = new bd4(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) bd4.X)) {
            try {
                ((ArrayDeque) bd4.X).clear();
                String string = ((SharedPreferences) bd4.b).getString((String) bd4.c, BuildConfig.FLAVOR);
                if (!TextUtils.isEmpty(string)) {
                    if (string.contains((String) bd4.o)) {
                        String[] split = string.split((String) bd4.o, -1);
                        int length = split.length;
                        for (String str : split) {
                            if (!TextUtils.isEmpty(str)) {
                                ((ArrayDeque) bd4.X).add(str);
                            }
                        }
                    }
                }
            } finally {
            }
        }
        return bd4;
    }

    public static synchronized bd4 d() {
        bd4 bd4;
        synchronized (bd4.class) {
            try {
                if (Z == null) {
                    Z = new bd4();
                }
                bd4 = Z;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return bd4;
    }

    public void a(ls4 ls4, js4 js4, boolean z) {
        tic.b((pn1) this.Y);
        mbe mbe = (mbe) this.c;
        Resources resources = (Resources) this.b;
        dhd f = (js4 == null || !js4.o) ? ((i6g) this.o).f(resources, mbe) : ((i6g) this.X).f(resources, mbe);
        pn1 pn1 = new pn1(new q34((Object) this, (Object) ls4, (Parcelable) js4, z, 3), 2, new ss8(16, this));
        f.k(pn1);
        this.Y = pn1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object apply(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.b
            u16 r2 = (defpackage.u16) r2
            java.lang.Object r2 = r2.invoke(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x001c
            et9 r0 = defpackage.ms9.g(r1)
            goto L_0x00ae
        L_0x001c:
            java.lang.Object r2 = r0.c
            ge0 r2 = (ge0) r2
            int r3 = r2.c
            r4 = 1
            int r3 = r3 + r4
            r2.c = r3
            r5 = 3
            r6 = 0
            if (r3 <= r5) goto L_0x002d
        L_0x002b:
            r8 = r6
            goto L_0x0087
        L_0x002d:
            l55 r5 = r2.a
            long r8 = r5.a
            float r8 = (float) r8
            float r9 = r5.c
            double r9 = (double) r9
            float r3 = (float) r3
            r11 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 - r11
            double r12 = (double) r3
            double r9 = java.lang.Math.pow(r9, r12)
            float r3 = (float) r9
            float r8 = r8 * r3
            long r9 = r5.b
            float r3 = (float) r9
            float r8 = java.lang.Math.min(r8, r3)
            long r8 = (long) r8
            float r5 = r5.d
            r10 = 0
            int r10 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r10 != 0) goto L_0x0050
            goto L_0x006d
        L_0x0050:
            float r8 = (float) r8
            float r5 = r5 * r8
            float r9 = r8 - r5
            float r9 = java.lang.Math.max(r9, r11)
            long r9 = (long) r9
            float r5 = r5 + r8
            float r3 = java.lang.Math.min(r5, r3)
            long r11 = (long) r3
            double r13 = java.lang.Math.random()
            long r11 = r11 - r9
            r15 = 1
            long r11 = r11 + r15
            double r11 = (double) r11
            double r13 = r13 * r11
            int r3 = (int) r13
            long r11 = (long) r3
            long r8 = r9 + r11
        L_0x006d:
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0072
            goto L_0x002b
        L_0x0072:
            if (r3 < 0) goto L_0x00b5
            long r10 = r2.d
            long r10 = r10 + r8
            r2.d = r10
            long r12 = r2.b
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 <= 0) goto L_0x0081
            r3 = r4
            goto L_0x0082
        L_0x0081:
            r3 = 0
        L_0x0082:
            if (r3 != r4) goto L_0x0085
            goto L_0x002b
        L_0x0085:
            if (r3 != 0) goto L_0x00af
        L_0x0087:
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x00a3
            int r2 = r2.c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r3 = r0.o
            i26 r3 = (defpackage.i26) r3
            r3.invoke(r1, r2)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.Object r0 = r0.X
            qmc r0 = (defpackage.qmc) r0
            zv9 r0 = defpackage.ms9.u(r8, r1, r0)
            goto L_0x00ae
        L_0x00a3:
            java.lang.Object r0 = r0.Y
            u16 r0 = (defpackage.u16) r0
            r0.invoke(r1)
            et9 r0 = defpackage.ms9.g(r1)
        L_0x00ae:
            return r0
        L_0x00af:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00b5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Interval is invalid. Must be greater than 0."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bd4.apply(java.lang.Object):java.lang.Object");
    }

    public void b(ad4 ad4) {
        synchronized (this.b) {
            ((ArrayList) this.o).remove(ad4);
        }
    }

    public String toString() {
        switch (this.a) {
            case 3:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.b) + ", mProviderPackage: " + ((String) this.c) + ", mQuery: " + ((String) this.o) + ", mCertificates:");
                int i = 0;
                while (true) {
                    List list = (List) this.X;
                    if (i < list.size()) {
                        sb.append(" [");
                        List list2 = (List) list.get(i);
                        for (int i2 = 0; i2 < list2.size(); i2++) {
                            sb.append(" \"");
                            sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                            sb.append("\"");
                        }
                        sb.append(" ]");
                        i++;
                    } else {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                }
            default:
                return super.toString();
        }
    }

    public bd4(u16 u16, ge0 ge0, i26 i26, qmc qmc, u16 u162) {
        this.a = 6;
        this.b = u16;
        this.c = ge0;
        this.o = i26;
        this.X = qmc;
        this.Y = u162;
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [nu7, java.lang.Object] */
    public bd4(gx0 gx0, ocd ocd, xwb xwb, gvf gvf, bi biVar, cc9 cc9, EglBase eglBase) {
        this.a = 1;
        this.b = xwb;
        this.c = biVar;
        h2d h2d = new h2d(1);
        this.o = h2d;
        ? obj = new Object();
        obj.a = biVar;
        obj.b = nu7.c;
        this.X = obj;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.Y = new pi(this, new smc(14), biVar, eglBase, h2d);
        rgc rgc = new rgc(1, this);
        if (!hhd.f((NativeDoubleArrayConsumer.Consumer) obj.b, rgc)) {
            obj.b = rgc;
            ((AtomicInteger) h2d.Z).set(0);
        }
        copyOnWriteArraySet.add(new gf6(this));
    }

    public bd4(Context context, Resources resources, mbe mbe, i6g i6g, i6g i6g2) {
        this.a = 4;
        this.b = resources;
        this.c = mbe;
        this.o = i6g;
        this.X = i6g2;
    }

    public bd4(String str, String str2, String str3, List list) {
        this.a = 3;
        str.getClass();
        this.b = str;
        str2.getClass();
        this.c = str2;
        this.o = str3;
        list.getClass();
        this.X = list;
        this.Y = str + "-" + str2 + "-" + str3;
    }

    public bd4(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.a = 5;
        this.X = new ArrayDeque();
        this.b = sharedPreferences;
        this.c = "topic_operation_queue";
        this.o = ",";
        this.Y = scheduledThreadPoolExecutor;
    }

    public bd4(String str) {
        this.a = 2;
        this.b = hw4.a;
        this.o = new ArrayList();
        new HashSet();
        this.X = new ArrayList();
        this.c = new ArrayList();
        this.Y = new ArrayList();
    }
}
