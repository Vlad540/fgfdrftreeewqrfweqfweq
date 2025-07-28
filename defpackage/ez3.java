package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import androidx.work.impl.WorkDatabase;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.TimeoutCancellationException;
import me.leolin.shortcutbadger.BuildConfig;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: ez3  reason: default package */
public abstract class ez3 {
    public static final byte[] a = {0, 0, 0, 1};
    public static final String[] b = {BuildConfig.FLAVOR, "A", "B", "C"};
    public static final Object c = new Object();
    public static final t3e d = new t3e();
    public static eg9 e;

    public static void A(String str) {
        synchronized (c) {
            c(str, (Throwable) null);
        }
    }

    public static void B(String str, Throwable th) {
        synchronized (c) {
            c(str, th);
        }
    }

    public static final Object C(pj5 pj5, rj5 rj5, Continuation continuation) {
        if (!(rj5 instanceof sie)) {
            Object c2 = pj5.c(rj5, continuation);
            return c2 == pu3.a ? c2 : jue.a;
        }
        throw ((sie) rj5).a;
    }

    /* JADX WARNING: type inference failed for: r6v4, types: [l7c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v7, types: [er3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object D(defpackage.pj5 r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof defpackage.em5
            if (r0 == 0) goto L_0x0013
            r0 = r6
            em5 r0 = (defpackage.em5) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            em5 r0 = new em5
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.Y
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            bm5 r5 = r0.X
            l7c r0 = r0.o
            defpackage.wx3.H(r6)     // Catch:{ AbortFlowException -> 0x002b }
            goto L_0x005e
        L_0x002b:
            r6 = move-exception
            goto L_0x005a
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            defpackage.wx3.H(r6)
            l7c r6 = new l7c
            r6.<init>()
            kotlinx.coroutines.internal.Symbol r2 = defpackage.wr9.a
            r6.a = r2
            bm5 r2 = new bm5
            r4 = 0
            r2.<init>(r6, r4)
            r0.o = r6     // Catch:{ AbortFlowException -> 0x0056 }
            r0.X = r2     // Catch:{ AbortFlowException -> 0x0056 }
            r0.Z = r3     // Catch:{ AbortFlowException -> 0x0056 }
            java.lang.Object r5 = r5.c(r2, r0)     // Catch:{ AbortFlowException -> 0x0056 }
            if (r5 != r1) goto L_0x0054
            goto L_0x0064
        L_0x0054:
            r0 = r6
            goto L_0x005e
        L_0x0056:
            r5 = move-exception
            r0 = r6
            r6 = r5
            r5 = r2
        L_0x005a:
            java.lang.Object r1 = r6.a
            if (r1 != r5) goto L_0x006d
        L_0x005e:
            java.lang.Object r1 = r0.a
            kotlinx.coroutines.internal.Symbol r5 = defpackage.wr9.a
            if (r1 == r5) goto L_0x0065
        L_0x0064:
            return r1
        L_0x0065:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Expected at least one element"
            r5.<init>(r6)
            throw r5
        L_0x006d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez3.D(pj5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r7v4, types: [l7c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v7, types: [er3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object E(defpackage.zqd r5, defpackage.km5 r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof defpackage.fm5
            if (r0 == 0) goto L_0x0013
            r0 = r7
            fm5 r0 = (defpackage.fm5) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            fm5 r0 = new fm5
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.Z
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.w0
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            dm5 r5 = r0.Y
            l7c r6 = r0.X
            i26 r0 = r0.o
            defpackage.wx3.H(r7)     // Catch:{ AbortFlowException -> 0x002d }
            goto L_0x0064
        L_0x002d:
            r7 = move-exception
            goto L_0x0060
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            defpackage.wx3.H(r7)
            l7c r7 = new l7c
            r7.<init>()
            kotlinx.coroutines.internal.Symbol r2 = defpackage.wr9.a
            r7.a = r2
            dm5 r2 = new dm5
            r4 = 0
            r2.<init>(r6, r7, r4)
            r0.o = r6     // Catch:{ AbortFlowException -> 0x005b }
            r0.X = r7     // Catch:{ AbortFlowException -> 0x005b }
            r0.Y = r2     // Catch:{ AbortFlowException -> 0x005b }
            r0.w0 = r3     // Catch:{ AbortFlowException -> 0x005b }
            java.lang.Object r5 = r5.c(r2, r0)     // Catch:{ AbortFlowException -> 0x005b }
            if (r5 != r1) goto L_0x0058
            goto L_0x006a
        L_0x0058:
            r0 = r6
            r6 = r7
            goto L_0x0064
        L_0x005b:
            r5 = move-exception
            r0 = r6
            r6 = r7
            r7 = r5
            r5 = r2
        L_0x0060:
            java.lang.Object r1 = r7.a
            if (r1 != r5) goto L_0x007f
        L_0x0064:
            java.lang.Object r1 = r6.a
            kotlinx.coroutines.internal.Symbol r5 = defpackage.wr9.a
            if (r1 == r5) goto L_0x006b
        L_0x006a:
            return r1
        L_0x006b:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Expected at least one element matching the predicate "
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L_0x007f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez3.E(zqd, km5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [l7c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v7, types: [er3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object F(defpackage.pj5 r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof defpackage.hm5
            if (r0 == 0) goto L_0x0013
            r0 = r6
            hm5 r0 = (defpackage.hm5) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            hm5 r0 = new hm5
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.Y
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            bm5 r5 = r0.X
            l7c r0 = r0.o
            defpackage.wx3.H(r6)     // Catch:{ AbortFlowException -> 0x002b }
            goto L_0x005a
        L_0x002b:
            r6 = move-exception
            goto L_0x0056
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            defpackage.wx3.H(r6)
            l7c r6 = new l7c
            r6.<init>()
            bm5 r2 = new bm5
            r4 = 1
            r2.<init>(r6, r4)
            r0.o = r6     // Catch:{ AbortFlowException -> 0x0052 }
            r0.X = r2     // Catch:{ AbortFlowException -> 0x0052 }
            r0.Z = r3     // Catch:{ AbortFlowException -> 0x0052 }
            java.lang.Object r5 = r5.c(r2, r0)     // Catch:{ AbortFlowException -> 0x0052 }
            if (r5 != r1) goto L_0x0050
            goto L_0x005c
        L_0x0050:
            r0 = r6
            goto L_0x005a
        L_0x0052:
            r5 = move-exception
            r0 = r6
            r6 = r5
            r5 = r2
        L_0x0056:
            java.lang.Object r1 = r6.a
            if (r1 != r5) goto L_0x005d
        L_0x005a:
            java.lang.Object r1 = r0.a
        L_0x005c:
            return r1
        L_0x005d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez3.F(pj5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r7v3, types: [l7c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v3, types: [er3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object G(defpackage.t0c r5, m6f r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof defpackage.im5
            if (r0 == 0) goto L_0x0013
            r0 = r7
            im5 r0 = (defpackage.im5) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            im5 r0 = new im5
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.Y
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            dm5 r5 = r0.X
            l7c r6 = r0.o
            defpackage.wx3.H(r7)     // Catch:{ AbortFlowException -> 0x002b }
            goto L_0x005e
        L_0x002b:
            r7 = move-exception
            goto L_0x005a
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            defpackage.wx3.H(r7)
            l7c r7 = new l7c
            r7.<init>()
            dm5 r2 = new dm5
            r4 = 1
            r2.<init>(r6, r7, r4)
            r0.o = r7     // Catch:{ AbortFlowException -> 0x0058 }
            r0.X = r2     // Catch:{ AbortFlowException -> 0x0058 }
            r0.Z = r3     // Catch:{ AbortFlowException -> 0x0058 }
            zqd r5 = r5.a     // Catch:{ AbortFlowException -> 0x0058 }
            java.lang.Object r5 = r5.c(r2, r0)     // Catch:{ AbortFlowException -> 0x0058 }
            if (r5 != r1) goto L_0x0052
            goto L_0x0060
        L_0x0052:
            r6 = r7
            goto L_0x005e
        L_0x0054:
            r6 = r7
            r7 = r5
            r5 = r2
            goto L_0x005a
        L_0x0058:
            r5 = move-exception
            goto L_0x0054
        L_0x005a:
            java.lang.Object r0 = r7.a
            if (r0 != r5) goto L_0x0061
        L_0x005e:
            java.lang.Object r1 = r6.a
        L_0x0060:
            return r1
        L_0x0061:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez3.G(t0c, m6f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final ik5 H(pj5 pj5, i26 i26) {
        int i = am5.a;
        return new ik5(new ck5(pj5, i26, 4), 1);
    }

    public static pj5 I(pj5 pj5) {
        int i = am5.a;
        if (i > 0) {
            return i == 1 ? new ik5(pj5, 1) : new u02(i, -2, 1, bw4.a, pj5);
        }
        throw new IllegalArgumentException(wn6.h(i, "Expected positive concurrency level, but had ").toString());
    }

    public static final pj5 J(pj5 pj5, hu3 hu3) {
        if (hu3.get(xhd.c) == null) {
            return hu3.equals(bw4.a) ? pj5 : pj5 instanceof g36 ? fja.f((g36) pj5, hu3, 0, 0, 6) : new x02(0, 0, 12, hu3, pj5);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + hu3).toString());
    }

    public static String K(String str, Object... objArr) {
        int indexOf;
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i = 0;
        int i2 = 0;
        while (i < objArr.length && (indexOf = str.indexOf("%s", i2)) != -1) {
            sb.append(str.substring(i2, indexOf));
            sb.append(objArr[i]);
            i2 = indexOf + 2;
            i++;
        }
        sb.append(str.substring(i2));
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i3 = i + 1; i3 < objArr.length; i3++) {
                sb.append(", ");
                sb.append(objArr[i3]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String L(Throwable th) {
        boolean z;
        if (th == null) {
            return null;
        }
        synchronized (c) {
            Throwable th2 = th;
            while (true) {
                if (th2 == null) {
                    z = false;
                    break;
                }
                try {
                    if (th2 instanceof UnknownHostException) {
                        z = true;
                        break;
                    }
                    th2 = th2.getCause();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (z) {
                return "UnknownHostException (no network)";
            }
            String replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
            return replace;
        }
    }

    public static void M(String str) {
        synchronized (c) {
            c(str, (Throwable) null);
        }
    }

    public static final qod N(pj5 pj5, ou3 ou3) {
        return xs7.E(ou3, (hu3) null, (ru3) null, new wk5(pj5, (Continuation) null), 3);
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [t97, mjc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v6, types: [ave, t97, java.lang.Object] */
    public static t97 O(int i, s16 s16) {
        int i2 = y97.$EnumSwitchMapping$0[hr1.t(i)];
        if (i2 == 1) {
            return new r7e(s16);
        }
        s59 s59 = s59.X;
        if (i2 == 2) {
            ? obj = new Object();
            obj.a = s16;
            obj.b = s59;
            return obj;
        } else if (i2 == 3) {
            ? obj2 = new Object();
            obj2.a = s16;
            obj2.b = s59;
            return obj2;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final b12 P(pj5 pj5, i26 i26) {
        int i = am5.a;
        return h0(pj5, new zl5((Object) i26, (Continuation) null, 0));
    }

    public static final q02 Q(pj5... pj5Arr) {
        int i = am5.a;
        return new q02(pj5Arr.length == 0 ? hw4.a : new ds(0, pj5Arr), bw4.a, -2, 1, 1);
    }

    public static mj0 R(String str) {
        return new mj0(sl.a(str));
    }

    public static final boolean S(String str) {
        return !str.equals("GET") && !str.equals("HEAD");
    }

    public static final String T(Long l) {
        if (l.longValue() > 0) {
            return String.format(Locale.ENGLISH, "%d [%tF %tT %tL]", Arrays.copyOf(new Object[]{l, l, l, l}, 4));
        }
        return l + "ms";
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [eze, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03f0, code lost:
        defpackage.udd.q("ConfigurationUserSettingsParsing", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e0, code lost:
        r7 = r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final gze U(ws8 r12) {
        /*
            r0 = 0
            r1 = 1
            java.lang.String r2 = "payloadCatching catch error"
            java.lang.String r3 = "ServerPayload/PayloadCatching"
            eze r4 = new eze
            r4.<init>()
            int r5 = defpackage.jjd.K(r12)     // Catch:{ all -> 0x0010 }
            goto L_0x003f
        L_0x0010:
            r5 = move-exception
            defpackage.udd.S(r3, r2, r5)
            java.util.concurrent.CopyOnWriteArraySet r6 = uzc.a
            java.util.Iterator r6 = r6.iterator()
        L_0x001a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x002d
            java.lang.Object r7 = r6.next()
            ny9 r7 = (defpackage.ny9) r7
            r7.getClass()
            defpackage.ny9.a(r5)
            goto L_0x001a
        L_0x002d:
            int r6 = m4b.a
            int r6 = defpackage.hr1.t(r6)
            if (r6 == 0) goto L_0x003e
            if (r6 == r1) goto L_0x003d
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        L_0x003d:
            throw r5
        L_0x003e:
            r5 = r0
        L_0x003f:
            r6 = r0
        L_0x0040:
            if (r6 >= r5) goto L_0x0453
            java.lang.String r7 = defpackage.jjd.M(r12)     // Catch:{ all -> 0x0047 }
            goto L_0x0079
        L_0x0047:
            r7 = move-exception
            defpackage.udd.S(r3, r2, r7)     // Catch:{ all -> 0x0064 }
            java.util.concurrent.CopyOnWriteArraySet r8 = uzc.a     // Catch:{ all -> 0x0064 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0064 }
        L_0x0051:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x0064 }
            if (r9 == 0) goto L_0x0067
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x0064 }
            ny9 r9 = (defpackage.ny9) r9     // Catch:{ all -> 0x0064 }
            r9.getClass()     // Catch:{ all -> 0x0064 }
            defpackage.ny9.a(r7)     // Catch:{ all -> 0x0064 }
            goto L_0x0051
        L_0x0064:
            r12 = move-exception
            goto L_0x0426
        L_0x0067:
            int r8 = m4b.a     // Catch:{ all -> 0x0064 }
            int r8 = defpackage.hr1.t(r8)     // Catch:{ all -> 0x0064 }
            if (r8 == 0) goto L_0x0078
            if (r8 == r1) goto L_0x0077
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0064 }
            r12.<init>()     // Catch:{ all -> 0x0064 }
            throw r12     // Catch:{ all -> 0x0064 }
        L_0x0077:
            throw r7     // Catch:{ all -> 0x0064 }
        L_0x0078:
            r7 = 0
        L_0x0079:
            if (r7 == 0) goto L_0x0423
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r8.<init>()     // Catch:{ all -> 0x00ba }
            r8.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r9 = "="
            r8.append(r9)     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x00ba }
            int r9 = r7.hashCode()     // Catch:{ all -> 0x00ba }
            switch(r9) {
                case -2099474505: goto L_0x03ba;
                case -1972016425: goto L_0x0396;
                case -1965172674: goto L_0x0376;
                case -1917056995: goto L_0x0352;
                case -952000630: goto L_0x0331;
                case -747186863: goto L_0x030c;
                case -694542025: goto L_0x02e7;
                case -658898441: goto L_0x02c2;
                case -389923664: goto L_0x029d;
                case -248197113: goto L_0x0278;
                case 75243: goto L_0x0253;
                case 2634307: goto L_0x022e;
                case 130531239: goto L_0x0209;
                case 136965804: goto L_0x01e8;
                case 640193528: goto L_0x0191;
                case 836229259: goto L_0x016c;
                case 1633771469: goto L_0x0147;
                case 1684923157: goto L_0x0123;
                case 1911151182: goto L_0x0103;
                case 1950966460: goto L_0x00e3;
                case 1958389377: goto L_0x00bd;
                case 2130809258: goto L_0x0095;
                default: goto L_0x0093;
            }     // Catch:{ all -> 0x00ba }
        L_0x0093:
            goto L_0x03c2
        L_0x0095:
            java.lang.String r9 = "HIDDEN"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x009f
            goto L_0x03c2
        L_0x009f:
            boolean r7 = r12.u0()     // Catch:{ all -> 0x00ba }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r10.<init>()     // Catch:{ all -> 0x00ba }
            r10.append(r8)     // Catch:{ all -> 0x00ba }
            r10.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = r10.toString()     // Catch:{ all -> 0x00ba }
            r4.h = r9     // Catch:{ all -> 0x00ba }
            goto L_0x03f0
        L_0x00ba:
            r7 = move-exception
            goto L_0x03f6
        L_0x00bd:
            java.lang.String r9 = "M_CALL_PUSH_NOTIFICATION"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x00c7
            goto L_0x03c2
        L_0x00c7:
            java.lang.String r7 = defpackage.jjd.M(r12)     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r9.<init>()     // Catch:{ all -> 0x00ba }
            r9.append(r8)     // Catch:{ all -> 0x00ba }
            r9.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00ba }
            int r7 = sxe.c(r7)     // Catch:{ all -> 0x00ba }
            r4.r = r7     // Catch:{ all -> 0x00ba }
        L_0x00e0:
            r7 = r8
            goto L_0x03f0
        L_0x00e3:
            java.lang.String r9 = "DIALOGS_PUSH_NOTIFICATION"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x00ed
            goto L_0x03c2
        L_0x00ed:
            java.lang.String r7 = r12.z0()     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r9.<init>()     // Catch:{ all -> 0x00ba }
            r9.append(r8)     // Catch:{ all -> 0x00ba }
            r9.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00ba }
            r4.c = r7     // Catch:{ all -> 0x00ba }
            goto L_0x00e0
        L_0x0103:
            java.lang.String r9 = "CHATS_PUSH_SOUND"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x010d
            goto L_0x03c2
        L_0x010d:
            java.lang.String r7 = r12.z0()     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r9.<init>()     // Catch:{ all -> 0x00ba }
            r9.append(r8)     // Catch:{ all -> 0x00ba }
            r9.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00ba }
            r4.g = r7     // Catch:{ all -> 0x00ba }
            goto L_0x00e0
        L_0x0123:
            java.lang.String r9 = "SAFE_MODE"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x012d
            goto L_0x03c2
        L_0x012d:
            boolean r7 = defpackage.jjd.E(r12)     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r9.<init>()     // Catch:{ all -> 0x00ba }
            r9.append(r8)     // Catch:{ all -> 0x00ba }
            r9.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00ba }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x00ba }
            r4.u = r7     // Catch:{ all -> 0x00ba }
            goto L_0x00e0
        L_0x0147:
            java.lang.String r9 = "CHATS_INVITE"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x0151
            goto L_0x03c2
        L_0x0151:
            java.lang.String r7 = r12.z0()     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r9.<init>()     // Catch:{ all -> 0x00ba }
            r9.append(r8)     // Catch:{ all -> 0x00ba }
            r9.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00ba }
            int r7 = sxe.d(r7)     // Catch:{ all -> 0x00ba }
            r4.o = r7     // Catch:{ all -> 0x00ba }
            goto L_0x00e0
        L_0x016c:
            java.lang.String r9 = "AUDIO_TRANSCRIPTION_ENABLED"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x0176
            goto L_0x03c2
        L_0x0176:
            boolean r7 = defpackage.jjd.E(r12)     // Catch:{ all -> 0x00ba }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r10.<init>()     // Catch:{ all -> 0x00ba }
            r10.append(r8)     // Catch:{ all -> 0x00ba }
            r10.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = r10.toString()     // Catch:{ all -> 0x00ba }
            r4.t = r9     // Catch:{ all -> 0x00ba }
            goto L_0x03f0
        L_0x0191:
            java.lang.String r9 = "INACTIVE_TTL"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x019b
            goto L_0x03c2
        L_0x019b:
            java.lang.String r7 = defpackage.jjd.M(r12)     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r9.<init>()     // Catch:{ all -> 0x00ba }
            r9.append(r8)     // Catch:{ all -> 0x00ba }
            r9.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00ba }
            fze r9 = fze.X     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x01e4
            r10 = -1
            int r11 = r7.hashCode()
            switch(r11) {
                case 1596: goto L_0x01d1;
                case 1658: goto L_0x01c6;
                case 1751: goto L_0x01bb;
                default: goto L_0x01ba;
            }
        L_0x01ba:
            goto L_0x01db
        L_0x01bb:
            java.lang.String r11 = "6M"
            boolean r7 = r7.equals(r11)
            if (r7 != 0) goto L_0x01c4
            goto L_0x01db
        L_0x01c4:
            r10 = 2
            goto L_0x01db
        L_0x01c6:
            java.lang.String r11 = "3M"
            boolean r7 = r7.equals(r11)
            if (r7 != 0) goto L_0x01cf
            goto L_0x01db
        L_0x01cf:
            r10 = r1
            goto L_0x01db
        L_0x01d1:
            java.lang.String r11 = "1M"
            boolean r7 = r7.equals(r11)
            if (r7 != 0) goto L_0x01da
            goto L_0x01db
        L_0x01da:
            r10 = r0
        L_0x01db:
            switch(r10) {
                case 0: goto L_0x01e2;
                case 1: goto L_0x01df;
                case 2: goto L_0x01e4;
                default: goto L_0x01de;
            }
        L_0x01de:
            goto L_0x01e4
        L_0x01df:
            fze r9 = fze.o     // Catch:{ all -> 0x00ba }
            goto L_0x01e4
        L_0x01e2:
            fze r9 = fze.c     // Catch:{ all -> 0x00ba }
        L_0x01e4:
            r4.q = r9     // Catch:{ all -> 0x00ba }
            goto L_0x00e0
        L_0x01e8:
            java.lang.String r9 = "CHATS_PUSH_NOTIFICATION"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x01f2
            goto L_0x03c2
        L_0x01f2:
            java.lang.String r7 = r12.z0()     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r9.<init>()     // Catch:{ all -> 0x00ba }
            r9.append(r8)     // Catch:{ all -> 0x00ba }
            r9.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00ba }
            r4.d = r7     // Catch:{ all -> 0x00ba }
            goto L_0x00e0
        L_0x0209:
            java.lang.String r9 = "CHATS_LED"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x0213
            goto L_0x03c2
        L_0x0213:
            int r7 = r12.v0()     // Catch:{ all -> 0x00ba }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r10.<init>()     // Catch:{ all -> 0x00ba }
            r10.append(r8)     // Catch:{ all -> 0x00ba }
            r10.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = r10.toString()     // Catch:{ all -> 0x00ba }
            r4.k = r9     // Catch:{ all -> 0x00ba }
            goto L_0x03f0
        L_0x022e:
            java.lang.String r9 = "VIBR"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x0238
            goto L_0x03c2
        L_0x0238:
            boolean r7 = r12.u0()     // Catch:{ all -> 0x00ba }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r10.<init>()     // Catch:{ all -> 0x00ba }
            r10.append(r8)     // Catch:{ all -> 0x00ba }
            r10.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = r10.toString()     // Catch:{ all -> 0x00ba }
            r4.l = r9     // Catch:{ all -> 0x00ba }
            goto L_0x03f0
        L_0x0253:
            java.lang.String r9 = "LED"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x025d
            goto L_0x03c2
        L_0x025d:
            int r7 = r12.v0()     // Catch:{ all -> 0x00ba }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r10.<init>()     // Catch:{ all -> 0x00ba }
            r10.append(r8)     // Catch:{ all -> 0x00ba }
            r10.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = r10.toString()     // Catch:{ all -> 0x00ba }
            r4.i = r9     // Catch:{ all -> 0x00ba }
            goto L_0x03f0
        L_0x0278:
            java.lang.String r9 = "CHATS_VIBR"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x0282
            goto L_0x03c2
        L_0x0282:
            boolean r7 = r12.u0()     // Catch:{ all -> 0x00ba }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r10.<init>()     // Catch:{ all -> 0x00ba }
            r10.append(r8)     // Catch:{ all -> 0x00ba }
            r10.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = r10.toString()     // Catch:{ all -> 0x00ba }
            r4.n = r9     // Catch:{ all -> 0x00ba }
            goto L_0x03f0
        L_0x029d:
            java.lang.String r9 = "DONT_DISTURB_UNTIL"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x02a7
            goto L_0x03c2
        L_0x02a7:
            long r9 = r12.w0()     // Catch:{ all -> 0x00ba }
            java.lang.Long r7 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r11.<init>()     // Catch:{ all -> 0x00ba }
            r11.append(r8)     // Catch:{ all -> 0x00ba }
            r11.append(r9)     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = r11.toString()     // Catch:{ all -> 0x00ba }
            r4.b = r7     // Catch:{ all -> 0x00ba }
            goto L_0x00e0
        L_0x02c2:
            java.lang.String r9 = "DIALOGS_VIBR"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x02cc
            goto L_0x03c2
        L_0x02cc:
            boolean r7 = r12.u0()     // Catch:{ all -> 0x00ba }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r10.<init>()     // Catch:{ all -> 0x00ba }
            r10.append(r8)     // Catch:{ all -> 0x00ba }
            r10.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = r10.toString()     // Catch:{ all -> 0x00ba }
            r4.m = r9     // Catch:{ all -> 0x00ba }
            goto L_0x03f0
        L_0x02e7:
            java.lang.String r9 = "PUSH_NEW_CONTACTS"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x02f1
            goto L_0x03c2
        L_0x02f1:
            boolean r7 = r12.u0()     // Catch:{ all -> 0x00ba }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r10.<init>()     // Catch:{ all -> 0x00ba }
            r10.append(r8)     // Catch:{ all -> 0x00ba }
            r10.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = r10.toString()     // Catch:{ all -> 0x00ba }
            r4.a = r9     // Catch:{ all -> 0x00ba }
            goto L_0x03f0
        L_0x030c:
            java.lang.String r9 = "SUGGEST_STICKERS"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x0316
            goto L_0x03c2
        L_0x0316:
            java.lang.String r7 = defpackage.jjd.M(r12)     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r9.<init>()     // Catch:{ all -> 0x00ba }
            r9.append(r8)     // Catch:{ all -> 0x00ba }
            r9.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00ba }
            int r7 = sxe.e(r7)     // Catch:{ all -> 0x00ba }
            r4.s = r7     // Catch:{ all -> 0x00ba }
            goto L_0x00e0
        L_0x0331:
            java.lang.String r9 = "PUSH_SOUND"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x033b
            goto L_0x03c2
        L_0x033b:
            java.lang.String r7 = r12.z0()     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r9.<init>()     // Catch:{ all -> 0x00ba }
            r9.append(r8)     // Catch:{ all -> 0x00ba }
            r9.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00ba }
            r4.e = r7     // Catch:{ all -> 0x00ba }
            goto L_0x00e0
        L_0x0352:
            java.lang.String r9 = "SEARCH_BY_PHONE"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x035b
            goto L_0x03c2
        L_0x035b:
            java.lang.String r7 = defpackage.jjd.M(r12)     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r9.<init>()     // Catch:{ all -> 0x00ba }
            r9.append(r8)     // Catch:{ all -> 0x00ba }
            r9.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00ba }
            int r7 = sxe.d(r7)     // Catch:{ all -> 0x00ba }
            r4.v = r7     // Catch:{ all -> 0x00ba }
            goto L_0x00e0
        L_0x0376:
            java.lang.String r9 = "DIALOGS_PUSH_SOUND"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x037f
            goto L_0x03c2
        L_0x037f:
            java.lang.String r7 = r12.z0()     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r9.<init>()     // Catch:{ all -> 0x00ba }
            r9.append(r8)     // Catch:{ all -> 0x00ba }
            r9.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00ba }
            r4.f = r7     // Catch:{ all -> 0x00ba }
            goto L_0x00e0
        L_0x0396:
            java.lang.String r9 = "INCOMING_CALL"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x039f
            goto L_0x03c2
        L_0x039f:
            java.lang.String r7 = r12.z0()     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r9.<init>()     // Catch:{ all -> 0x00ba }
            r9.append(r8)     // Catch:{ all -> 0x00ba }
            r9.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00ba }
            int r7 = sxe.d(r7)     // Catch:{ all -> 0x00ba }
            r4.p = r7     // Catch:{ all -> 0x00ba }
            goto L_0x00e0
        L_0x03ba:
            java.lang.String r9 = "DIALOGS_LED"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x03d7
        L_0x03c2:
            r12.z()     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r7.<init>()     // Catch:{ all -> 0x00ba }
            r7.append(r8)     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = "skip!"
            r7.append(r8)     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00ba }
            goto L_0x03f0
        L_0x03d7:
            int r7 = r12.v0()     // Catch:{ all -> 0x00ba }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r10.<init>()     // Catch:{ all -> 0x00ba }
            r10.append(r8)     // Catch:{ all -> 0x00ba }
            r10.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = r10.toString()     // Catch:{ all -> 0x00ba }
            r4.j = r9     // Catch:{ all -> 0x00ba }
        L_0x03f0:
            java.lang.String r8 = "ConfigurationUserSettingsParsing"
            defpackage.udd.p(r8, r7, new java.lang.Object[0])     // Catch:{ all -> 0x00ba }
            goto L_0x0423
        L_0x03f6:
            defpackage.udd.S(r3, r2, r7)     // Catch:{ all -> 0x0064 }
            java.util.concurrent.CopyOnWriteArraySet r8 = uzc.a     // Catch:{ all -> 0x0064 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0064 }
        L_0x03ff:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x0064 }
            if (r9 == 0) goto L_0x0412
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x0064 }
            ny9 r9 = (defpackage.ny9) r9     // Catch:{ all -> 0x0064 }
            r9.getClass()     // Catch:{ all -> 0x0064 }
            defpackage.ny9.a(r7)     // Catch:{ all -> 0x0064 }
            goto L_0x03ff
        L_0x0412:
            int r8 = m4b.a     // Catch:{ all -> 0x0064 }
            int r8 = defpackage.hr1.t(r8)     // Catch:{ all -> 0x0064 }
            if (r8 == 0) goto L_0x0423
            if (r8 == r1) goto L_0x0422
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0064 }
            r12.<init>()     // Catch:{ all -> 0x0064 }
            throw r12     // Catch:{ all -> 0x0064 }
        L_0x0422:
            throw r7     // Catch:{ all -> 0x0064 }
        L_0x0423:
            int r6 = r6 + r1
            goto L_0x0040
        L_0x0426:
            defpackage.udd.S(r3, r2, r12)
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x042f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0442
            java.lang.Object r2 = r0.next()
            ny9 r2 = (defpackage.ny9) r2
            r2.getClass()
            defpackage.ny9.a(r12)
            goto L_0x042f
        L_0x0442:
            int r0 = m4b.a
            int r0 = defpackage.hr1.t(r0)
            if (r0 == 0) goto L_0x0453
            if (r0 == r1) goto L_0x0452
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        L_0x0452:
            throw r12
        L_0x0453:
            gze r12 = new gze
            r12.<init>(r4)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez3.U(ws8):gze");
    }

    public static final j02 V(i02 i02) {
        return new j02(i02, false);
    }

    public static final bc W(djc djc, long j, i26 i26) {
        if (j > 0) {
            return new bc(djc, 18, new ll5(j, i26, (Continuation) null));
        }
        throw new IllegalArgumentException(us8.i(j, "Expected positive amount of retries, but had ").toString());
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.Map, kgd] */
    public static final Map X(ws8 ws8) {
        int a2 = ws8.n().a();
        iw4 iw4 = iw4.a;
        if (a2 != 8) {
            ws8.z();
            return iw4;
        }
        int K = jjd.K(ws8);
        if (K == 0) {
            return iw4;
        }
        ? kgd = new kgd(K);
        for (int i = 0; i < K; i++) {
            String M = jjd.M(ws8);
            if (M != null) {
                kgd.put(M, Y(ws8));
            } else {
                ws8.z();
            }
        }
        return kgd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Long} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object Y(ws8 r4) {
        /*
            sp8 r0 = r4.n()
            int r0 = r0.a()
            if (r0 != 0) goto L_0x000c
            r0 = -1
            goto L_0x0014
        L_0x000c:
            int[] r1 = wa3.$EnumSwitchMapping$0
            int r0 = defpackage.hr1.t(r0)
            r0 = r1[r0]
        L_0x0014:
            r1 = 0
            switch(r0) {
                case 1: goto L_0x0072;
                case 2: goto L_0x0069;
                case 3: goto L_0x0051;
                case 4: goto L_0x004c;
                case 5: goto L_0x0047;
                case 6: goto L_0x0021;
                case 7: goto L_0x001c;
                default: goto L_0x0018;
            }
        L_0x0018:
            r4.z()
            return r1
        L_0x001c:
            java.util.Map r4 = X(r4)
            goto L_0x007c
        L_0x0021:
            sp8 r0 = r4.n()
            int r0 = r0.a()
            r2 = 7
            if (r0 != r2) goto L_0x0042
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r0 = r4.s0()
            r2 = 0
        L_0x0036:
            if (r2 >= r0) goto L_0x0045
            java.lang.Object r3 = Y(r4)
            r1.add(r3)
            int r2 = r2 + 1
            goto L_0x0036
        L_0x0042:
            r4.z()
        L_0x0045:
            r4 = r1
            goto L_0x007c
        L_0x0047:
            java.lang.String r4 = defpackage.jjd.N(r4, r1)
            goto L_0x007c
        L_0x004c:
            java.lang.Float r4 = defpackage.jjd.H(r4, r1)
            goto L_0x007c
        L_0x0051:
            sp8 r0 = r4.n()
            int r0 = r0.a()
            r2 = 3
            if (r0 != r2) goto L_0x0065
            long r0 = r4.w0()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            goto L_0x0045
        L_0x0065:
            r4.z()
            goto L_0x0045
        L_0x0069:
            boolean r4 = defpackage.jjd.E(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            goto L_0x007c
        L_0x0072:
            byte r4 = r4.readByte()
            r0 = -64
            if (r4 != r0) goto L_0x007d
            jue r4 = defpackage.jue.a
        L_0x007c:
            return r4
        L_0x007d:
            java.lang.String r0 = "Nil"
            org.msgpack.core.MessagePackException r4 = ws8.r0(r0, r4)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez3.Y(ws8):java.lang.Object");
    }

    public static void Z(View view, lw7 lw7) {
        zs4 zs4 = lw7.a.b;
        if (zs4 != null && zs4.a) {
            float f = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap weakHashMap = eaf.a;
                f += t9f.i((View) parent);
            }
            kw7 kw7 = lw7.a;
            if (kw7.m != f) {
                kw7.m = f;
                lw7.q();
            }
        }
    }

    public static final int a(ez3 ez3, XmlPullParser xmlPullParser, String str) {
        ez3.getClass();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public static final Object a0(yje yje, i26 i26) {
        Object obj;
        Object makeCompletingOnce$kotlinx_coroutines_core;
        lp.t(yje, true, new ej4(0, ek8.z(yje.uCont.getContext()).invokeOnTimeout(yje.a, yje, yje.getContext())));
        try {
            if (!(i26 instanceof bh0)) {
                obj = urd.T(i26, yje, yje);
            } else {
                ete.g(2, i26);
                obj = i26.invoke(yje, yje);
            }
        } catch (Throwable th) {
            obj = new r73(th, false);
        }
        pu3 pu3 = pu3.a;
        if (obj == pu3 || (makeCompletingOnce$kotlinx_coroutines_core = yje.makeCompletingOnce$kotlinx_coroutines_core(obj)) == j47.b) {
            return pu3;
        }
        if (makeCompletingOnce$kotlinx_coroutines_core instanceof r73) {
            Throwable th2 = ((r73) makeCompletingOnce$kotlinx_coroutines_core).a;
            if (!(th2 instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th2).a != yje) {
                throw th2;
            } else if (obj instanceof r73) {
                throw ((r73) obj).a;
            }
        } else {
            obj = j47.a(makeCompletingOnce$kotlinx_coroutines_core);
        }
        return obj;
    }

    public static final boolean b(int i, ez3 ez3) {
        ez3.getClass();
        return i != -1;
    }

    public static String b0(o10 o10) {
        int i = 5;
        while (true) {
            j10 j10 = o10.a;
            int i2 = j10 == null ? -1 : vbd.$EnumSwitchMapping$0[j10.ordinal()];
            if (i2 == 1) {
                return o10.b.a();
            }
            if (i2 == 2) {
                return o10.d.d;
            }
            if (i2 != 3) {
                return null;
            }
            f10 f10 = o10.g;
            a10 a10 = f10.f;
            if (a10 != null) {
                if (a10 != null) {
                    return a10.a();
                }
                return null;
            } else if (!f10.a() || i < 0 || (o10 = f10.g) == null) {
                return null;
            } else {
                i--;
            }
        }
    }

    public static void c(String str, Throwable th) {
        String L = L(th);
        if (!TextUtils.isEmpty(L)) {
            L.replace("\n", "\n  ");
        }
    }

    /* JADX WARNING: type inference failed for: r6v4, types: [l7c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v7, types: [er3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c0(ik5 r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof defpackage.jm5
            if (r0 == 0) goto L_0x0013
            r0 = r6
            jm5 r0 = (defpackage.jm5) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            jm5 r0 = new jm5
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.Y
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            bm5 r5 = r0.X
            l7c r0 = r0.o
            defpackage.wx3.H(r6)     // Catch:{ AbortFlowException -> 0x002b }
            goto L_0x005e
        L_0x002b:
            r6 = move-exception
            goto L_0x005a
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            defpackage.wx3.H(r6)
            l7c r6 = new l7c
            r6.<init>()
            kotlinx.coroutines.internal.Symbol r2 = defpackage.wr9.a
            r6.a = r2
            bm5 r2 = new bm5
            r4 = 2
            r2.<init>(r6, r4)
            r0.o = r6     // Catch:{ AbortFlowException -> 0x0056 }
            r0.X = r2     // Catch:{ AbortFlowException -> 0x0056 }
            r0.Z = r3     // Catch:{ AbortFlowException -> 0x0056 }
            java.lang.Object r5 = r5.c(r2, r0)     // Catch:{ AbortFlowException -> 0x0056 }
            if (r5 != r1) goto L_0x0054
            goto L_0x0066
        L_0x0054:
            r0 = r6
            goto L_0x005e
        L_0x0056:
            r5 = move-exception
            r0 = r6
            r6 = r5
            r5 = r2
        L_0x005a:
            java.lang.Object r1 = r6.a
            if (r1 != r5) goto L_0x0067
        L_0x005e:
            java.lang.Object r5 = r0.a
            kotlinx.coroutines.internal.Symbol r6 = defpackage.wr9.a
            if (r5 != r6) goto L_0x0065
            r5 = 0
        L_0x0065:
            r1 = r5
        L_0x0066:
            return r1
        L_0x0067:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez3.c0(ik5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Uri d(String str) {
        if (str.length() == 0) {
            return null;
        }
        return (p0e.Q(str, "file:", true) || p0e.Q(str, "http", true) || p0e.Q(str, "content", true) || p0e.Q(str, "android.resource", true) || p0e.Q(str, "res:/", true)) ? Uri.parse(str) : Uri.parse("file:".concat(str));
    }

    public static final t0c d0(pj5 pj5, ou3 ou3, vcd vcd, Object obj) {
        v2b l = xy6.l(pj5);
        grd a2 = hrd.a(obj);
        xs7.D(ou3, (hu3) l.c, hhd.f(vcd, ucd.a) ? ru3.a : ru3.o, new mm5(vcd, (pj5) l.b, a2, obj, (Continuation) null));
        return new t0c(a2);
    }

    public static final pj5 e(pj5 pj5, int i, int i2) {
        if (i < 0 && i != -2 && i != -1) {
            throw new IllegalArgumentException(wn6.h(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        } else if (i != -1 || i2 == 1) {
            if (i == -1) {
                i2 = 2;
                i = 0;
            }
            int i3 = i;
            int i4 = i2;
            return pj5 instanceof g36 ? fja.f((g36) pj5, (hu3) null, i3, i4, 1) : new x02(i3, i4, 2, (hu3) null, pj5);
        } else {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
    }

    public static final nl5 e0(pj5 pj5, int i) {
        if (i > 0) {
            return new nl5(pj5, i, 1);
        }
        throw new IllegalArgumentException(rf0.f(i, "Requested element count ", " should be positive").toString());
    }

    public static /* synthetic */ pj5 f(pj5 pj5, int i, int i2) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        return e(pj5, i, 1);
    }

    public static void f0(ps1 ps1, ArrayList arrayList) {
        if (ps1 instanceof qs1) {
            Iterator it = ((qs1) ps1).a.iterator();
            while (it.hasNext()) {
                f0((ps1) it.next(), arrayList);
            }
        } else if (ps1 instanceof ow1) {
            arrayList.add(((ow1) ps1).a);
        } else {
            arrayList.add(new pr1(ps1));
        }
    }

    public static String g(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        Object[] objArr = {b[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(z ? 'H' : 'L'), Integer.valueOf(i4)};
        int i5 = mze.a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i6 = 0; i6 < length; i6++) {
            sb.append(String.format(".%02X", new Object[]{Integer.valueOf(iArr[i6])}));
        }
        return sb.toString();
    }

    public static final qhe g0(e0f e0f, p6e p6e) {
        c0f c0f = e0f.b;
        phe phe = null;
        ohe ohe = c0f != null ? new ohe(c0f.a, c0f.b) : null;
        ArrayList arrayList = new ArrayList(q23.H(hw4.a, 10));
        if (!(e0f.a == null || p6e == null)) {
            phe = new phe(p6e);
        }
        return new qhe(phe, ohe, arrayList);
    }

    public static final rn1 h(i26 i26) {
        return new rn1(i26, bw4.a, -2, 1);
    }

    public static final b12 h0(pj5 pj5, k26 k26) {
        int i = am5.a;
        return new b12(k26, pj5, bw4.a, -2, 1);
    }

    /* JADX WARNING: type inference failed for: r7v4, types: [l7c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v2, types: [er3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.Serializable i(defpackage.pj5 r5, defpackage.rj5 r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof defpackage.jl5
            if (r0 == 0) goto L_0x0013
            r0 = r7
            jl5 r0 = (defpackage.jl5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            jl5 r0 = new jl5
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.X
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            l7c r5 = r0.o
            defpackage.wx3.H(r7)     // Catch:{ all -> 0x0029 }
            goto L_0x004e
        L_0x0029:
            r6 = move-exception
            r1 = r6
            goto L_0x0053
        L_0x002c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0034:
            defpackage.wx3.H(r7)
            l7c r7 = new l7c
            r7.<init>()
            ac r2 = new ac     // Catch:{ all -> 0x0050 }
            r4 = 19
            r2.<init>(r6, r4, r7)     // Catch:{ all -> 0x0050 }
            r0.o = r7     // Catch:{ all -> 0x0050 }
            r0.Y = r3     // Catch:{ all -> 0x0050 }
            java.lang.Object r5 = r5.c(r2, r0)     // Catch:{ all -> 0x0050 }
            if (r5 != r1) goto L_0x004e
            goto L_0x0082
        L_0x004e:
            r1 = 0
            goto L_0x0082
        L_0x0050:
            r5 = move-exception
            r1 = r5
            r5 = r7
        L_0x0053:
            java.lang.Object r5 = r5.a
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            if (r5 == 0) goto L_0x005f
            boolean r6 = r5.equals(r1)
            if (r6 != 0) goto L_0x007f
        L_0x005f:
            xhd r6 = xhd.c
            hu3 r7 = r0.b
            fu3 r6 = r7.get(r6)
            g37 r6 = (defpackage.g37) r6
            if (r6 == 0) goto L_0x0080
            boolean r7 = r6.isCancelled()
            if (r7 != 0) goto L_0x0072
            goto L_0x0080
        L_0x0072:
            java.util.concurrent.CancellationException r6 = r6.getCancellationException()
            if (r6 == 0) goto L_0x0080
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x007f
            goto L_0x0080
        L_0x007f:
            throw r1
        L_0x0080:
            if (r5 != 0) goto L_0x0083
        L_0x0082:
            return r1
        L_0x0083:
            boolean r6 = r1 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L_0x008b
            defpackage.jjd.d(r5, r1)
            throw r5
        L_0x008b:
            defpackage.jjd.d(r1, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez3.i(pj5, rj5, kotlin.coroutines.Continuation):java.io.Serializable");
    }

    public static final void i0(t4b t4b, WorkDatabase workDatabase, sa3 sa3, List list, ztf ztf, Set set) {
        buf y = workDatabase.y();
        String str = ztf.a;
        ztf l = y.l(str);
        if (l == null) {
            throw new IllegalArgumentException(wn6.i("Worker with ", str, " doesn't exist"));
        } else if (!l.b.a()) {
            if (!(l.d() ^ ztf.d())) {
                boolean d2 = t4b.d(str);
                if (!d2) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((rmc) it.next()).d(str);
                    }
                }
                workDatabase.q(new xe8(workDatabase, ztf, l, list, str, set, d2));
                if (!d2) {
                    dnc.a(sa3, workDatabase, list);
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder("Can't update ");
            String str2 = "OneTime";
            sb.append(l.d() ? "Periodic" : str2);
            sb.append(" Worker to ");
            if (ztf.d()) {
                str2 = "Periodic";
            }
            throw new UnsupportedOperationException(wn6.l(sb, str2, " Worker. Update operation must preserve worker's type."));
        }
    }

    public static void j(Boolean bool) {
        if (!bool.booleanValue()) {
            throw new IllegalArgumentException();
        }
    }

    public static void j0(String str) {
        synchronized (c) {
            c(str, (Throwable) null);
        }
    }

    public static void k(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void k0(String str, Throwable th) {
        synchronized (c) {
            c(str, th);
        }
    }

    public static void l(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(K(str, objArr));
        }
    }

    public static final Object l0(long j, i26 i26, Continuation continuation) {
        if (j > 0) {
            return a0(new yje(j, continuation), i26);
        }
        throw new TimeoutCancellationException("Timed out immediately", (g37) null);
    }

    public static void m(int i, int i2) {
        String str;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                str = K("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i2 >= 0) {
                str = K("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            } else {
                throw new IllegalArgumentException(wn6.h(i2, "negative size: "));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    /* JADX WARNING: type inference failed for: r10v4, types: [l7c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v2, types: [er3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m0(long r7, defpackage.i26 r9, kotlin.coroutines.Continuation r10) {
        /*
            boolean r0 = r10 instanceof defpackage.zje
            if (r0 == 0) goto L_0x0013
            r0 = r10
            zje r0 = (defpackage.zje) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            zje r0 = new zje
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.X
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            l7c r7 = r0.o
            defpackage.wx3.H(r10)     // Catch:{ TimeoutCancellationException -> 0x002a }
            goto L_0x0058
        L_0x002a:
            r8 = move-exception
            goto L_0x005b
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0034:
            defpackage.wx3.H(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L_0x003e
            return r3
        L_0x003e:
            l7c r10 = new l7c
            r10.<init>()
            r0.getClass()     // Catch:{ TimeoutCancellationException -> 0x0059 }
            r0.o = r10     // Catch:{ TimeoutCancellationException -> 0x0059 }
            r0.Y = r4     // Catch:{ TimeoutCancellationException -> 0x0059 }
            yje r2 = new yje     // Catch:{ TimeoutCancellationException -> 0x0059 }
            r2.<init>(r7, r0)     // Catch:{ TimeoutCancellationException -> 0x0059 }
            r10.a = r2     // Catch:{ TimeoutCancellationException -> 0x0059 }
            java.lang.Object r10 = a0(r2, r9)     // Catch:{ TimeoutCancellationException -> 0x0059 }
            if (r10 != r1) goto L_0x0058
            return r1
        L_0x0058:
            return r10
        L_0x0059:
            r8 = move-exception
            r7 = r10
        L_0x005b:
            g37 r9 = r8.a
            java.lang.Object r7 = r7.a
            if (r9 != r7) goto L_0x0062
            return r3
        L_0x0062:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez3.m0(long, i26, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static void n(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    public static void o(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static final Object p(pj5 pj5, Continuation continuation) {
        Object c2 = pj5.c(bl9.a, continuation);
        return c2 == pu3.a ? c2 : jue.a;
    }

    public static final Object q(pj5 pj5, i26 i26, Continuation continuation) {
        Object p = p(f(P(pj5, i26), 0, 2), continuation);
        return p == pu3.a ? p : jue.a;
    }

    public static final bc r(pj5 pj5, pj5 pj52, pj5 pj53, pj5 pj54, o26 o26) {
        return new bc(new pj5[]{pj5, pj52, pj53, pj54}, 20, o26);
    }

    public static final bc s(pj5 pj5, pj5 pj52, pj5 pj53, m26 m26) {
        return new bc(new pj5[]{pj5, pj52, pj53}, 19, m26);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [udd, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v2, types: [udd, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v3, types: [udd, java.lang.Object] */
    public static udd t(int i) {
        return i != 0 ? i != 1 ? new Object() : new Object() : new Object();
    }

    public static void u(Exception exc, String str) {
        synchronized (c) {
            c(str, exc);
        }
    }

    public static void v(String str) {
        synchronized (c) {
            c(str, (Throwable) null);
        }
    }

    public static final zdc w(Context context, String str, Class cls) {
        if (true ^ (str == null || h0e.c0(str))) {
            return new zdc(context, str, cls);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder".toString());
    }

    public static final pj5 x(pj5 pj5, long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i >= 0) {
            return i == 0 ? pj5 : new tj5(0, new al5(new je2(j, 1), pj5, (Continuation) null));
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r1.c == r4) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.gj4 y(defpackage.pj5 r3, defpackage.i26 r4) {
        /*
            r0 = 2
            defpackage.ete.g(r0, r4)
            t13 r0 = defpackage.lp.c
            boolean r1 = r3 instanceof defpackage.gj4
            if (r1 == 0) goto L_0x0016
            r1 = r3
            gj4 r1 = (defpackage.gj4) r1
            u16 r2 = r1.b
            if (r2 != r0) goto L_0x0016
            i26 r0 = r1.c
            if (r0 != r4) goto L_0x0016
            goto L_0x001c
        L_0x0016:
            gj4 r0 = new gj4
            r0.<init>(r3, r4)
            r3 = r0
        L_0x001c:
            gj4 r3 = (defpackage.gj4) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez3.y(pj5, i26):gj4");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r2.c == r0) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.pj5 z(defpackage.pj5 r4) {
        /*
            boolean r0 = r4 instanceof defpackage.zqd
            if (r0 == 0) goto L_0x0005
            goto L_0x0021
        L_0x0005:
            vg0 r0 = defpackage.lp.d
            t13 r1 = defpackage.lp.c
            boolean r2 = r4 instanceof defpackage.gj4
            if (r2 == 0) goto L_0x0019
            r2 = r4
            gj4 r2 = (defpackage.gj4) r2
            u16 r3 = r2.b
            if (r3 != r1) goto L_0x0019
            i26 r1 = r2.c
            if (r1 != r0) goto L_0x0019
            goto L_0x001f
        L_0x0019:
            gj4 r1 = new gj4
            r1.<init>(r4, r0)
            r4 = r1
        L_0x001f:
            gj4 r4 = (defpackage.gj4) r4
        L_0x0021:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez3.z(pj5):pj5");
    }
}
