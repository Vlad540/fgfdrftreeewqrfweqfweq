package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.media.AudioRecord;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.CoroutineExceptionHandlerImpl_commonKt;
import me.leolin.shortcutbadger.BuildConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.SdpObserver;
import org.webrtc.SessionDescription;
import ru.ok.android.api.json.JsonStateException;
import ru.ok.android.api.json.JsonTypeMismatchException;

/* renamed from: gwf  reason: default package */
public abstract class gwf implements i13, SdpObserver {
    public static final x3a a = new x3a(28, (Object) "CRASH_REPORT");
    public static final l77[] b = new l77[0];

    public static final String A(List list, boolean z, boolean z2) {
        if (!z) {
            return String.valueOf(list.size());
        }
        return o23.c0(list, ",", "[", "]", new zn7(z, z2), 24);
    }

    public static final String B(Map map, boolean z, boolean z2) {
        if (!z) {
            return String.valueOf(map.size());
        }
        StringBuilder sb = new StringBuilder("{");
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            sb.append(String.valueOf(key));
            sb.append('=');
            sb.append(R(value, z, z2));
            sb.append(',');
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        if (r9 == null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0085, code lost:
        r9 = me.leolin.shortcutbadger.BuildConfig.FLAVOR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0086, code lost:
        r7 = new rr8(r7, r9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static sr8 C(ws8 r13) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "payloadCatching catch error"
            java.lang.String r2 = "ServerPayload/PayloadCatching"
            int r3 = defpackage.jjd.K(r13)
            r4 = 0
            r5 = 0
            r7 = r4
            r6 = r5
            r8 = r6
        L_0x000f:
            if (r6 >= r3) goto L_0x010c
            r9 = 1
            java.lang.String r10 = defpackage.jjd.M(r13)     // Catch:{ all -> 0x0017 }
            goto L_0x0046
        L_0x0017:
            r10 = move-exception
            defpackage.udd.S(r2, r1, r10)
            java.util.concurrent.CopyOnWriteArraySet r11 = uzc.a
            java.util.Iterator r11 = r11.iterator()
        L_0x0021:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0034
            java.lang.Object r12 = r11.next()
            ny9 r12 = (defpackage.ny9) r12
            r12.getClass()
            defpackage.ny9.a(r10)
            goto L_0x0021
        L_0x0034:
            int r11 = m4b.a
            int r11 = defpackage.hr1.t(r11)
            if (r11 == 0) goto L_0x0045
            if (r11 == r9) goto L_0x0044
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L_0x0044:
            throw r10
        L_0x0045:
            r10 = r4
        L_0x0046:
            java.lang.String r11 = "reaction"
            boolean r11 = defpackage.hhd.f(r10, r11)
            if (r11 == 0) goto L_0x008e
            wr8 r7 = wr8.c
            java.lang.String r9 = defpackage.jjd.M(r13)     // Catch:{ all -> 0x0057 }
            if (r9 != 0) goto L_0x0086
            goto L_0x0085
        L_0x0057:
            r10 = move-exception
            defpackage.udd.S(r2, r1, r10)
            java.util.concurrent.CopyOnWriteArraySet r11 = uzc.a
            java.util.Iterator r11 = r11.iterator()
        L_0x0061:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0074
            java.lang.Object r12 = r11.next()
            ny9 r12 = (defpackage.ny9) r12
            r12.getClass()
            defpackage.ny9.a(r10)
            goto L_0x0061
        L_0x0074:
            int r11 = m4b.a
            int r11 = defpackage.hr1.t(r11)
            if (r11 == 0) goto L_0x0085
            if (r11 == r9) goto L_0x0084
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L_0x0084:
            throw r10
        L_0x0085:
            r9 = r0
        L_0x0086:
            rr8 r10 = new rr8
            r10.<init>(r7, r9)
            r7 = r10
            goto L_0x0108
        L_0x008e:
            java.lang.String r11 = "count"
            boolean r10 = defpackage.hhd.f(r10, r11)
            if (r10 == 0) goto L_0x00d6
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            int r10 = defpackage.jjd.I(r13)     // Catch:{ all -> 0x00a3 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x00a3 }
            goto L_0x00d1
        L_0x00a3:
            r10 = move-exception
            defpackage.udd.S(r2, r1, r10)
            java.util.concurrent.CopyOnWriteArraySet r11 = uzc.a
            java.util.Iterator r11 = r11.iterator()
        L_0x00ad:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x00c0
            java.lang.Object r12 = r11.next()
            ny9 r12 = (defpackage.ny9) r12
            r12.getClass()
            defpackage.ny9.a(r10)
            goto L_0x00ad
        L_0x00c0:
            int r11 = m4b.a
            int r11 = defpackage.hr1.t(r11)
            if (r11 == 0) goto L_0x00d1
            if (r11 == r9) goto L_0x00d0
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L_0x00d0:
            throw r10
        L_0x00d1:
            int r8 = r8.intValue()
            goto L_0x0108
        L_0x00d6:
            r13.z()     // Catch:{ all -> 0x00da }
            goto L_0x0108
        L_0x00da:
            r10 = move-exception
            defpackage.udd.S(r2, r1, r10)
            java.util.concurrent.CopyOnWriteArraySet r11 = uzc.a
            java.util.Iterator r11 = r11.iterator()
        L_0x00e4:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x00f7
            java.lang.Object r12 = r11.next()
            ny9 r12 = (defpackage.ny9) r12
            r12.getClass()
            defpackage.ny9.a(r10)
            goto L_0x00e4
        L_0x00f7:
            int r11 = m4b.a
            int r11 = defpackage.hr1.t(r11)
            if (r11 == 0) goto L_0x0108
            if (r11 == r9) goto L_0x0107
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L_0x0107:
            throw r10
        L_0x0108:
            int r6 = r6 + 1
            goto L_0x000f
        L_0x010c:
            sr8 r13 = new sr8
            if (r7 == 0) goto L_0x0114
            r13.<init>(r7, r8)
            return r13
        L_0x0114:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "reaction is null"
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gwf.C(ws8):sr8");
    }

    public static JSONObject D(m67 m67) {
        try {
            JSONObject jSONObject = new JSONObject();
            m67.s();
            while (m67.peek() != 125) {
                jSONObject.put(m67.T(), E(m67, JSONObject.NULL));
            }
            m67.q();
            return jSONObject;
        } catch (JSONException e) {
            throw new AssertionError(e);
        }
    }

    public static Object E(m67 m67, Object obj) {
        try {
            int peek = m67.peek();
            if (peek == 34) {
                return m67.H();
            }
            if (peek == 49) {
                String V = m67.V();
                if (V.indexOf(46) >= 0 || V.indexOf(101) >= 0 || V.indexOf(69) >= 0) {
                    return Double.valueOf(Double.parseDouble(V));
                }
                long parseLong = Long.parseLong(V);
                return (parseLong < -2147483648L || parseLong > 2147483647L) ? Long.valueOf(parseLong) : Integer.valueOf((int) parseLong);
            } else if (peek == 91) {
                JSONArray jSONArray = new JSONArray();
                m67.u();
                while (m67.peek() != 93) {
                    jSONArray.put(E(m67, (Object) null));
                }
                m67.t();
                return jSONArray;
            } else if (peek == 98) {
                return Boolean.valueOf(m67.a0());
            } else {
                if (peek == 110) {
                    m67.z();
                    return obj;
                } else if (peek == 123) {
                    return D(m67);
                } else {
                    throw JsonStateException.d(peek);
                }
            }
        } catch (JsonTypeMismatchException e) {
            throw new AssertionError(e);
        }
    }

    public static PorterDuff.Mode F(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static zse I(zse zse, String[] strArr, Map map) {
        int i = 0;
        if (zse == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (zse) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                zse zse2 = new zse();
                int length = strArr.length;
                while (i < length) {
                    zse2.a((zse) map.get(strArr[i]));
                    i++;
                }
                return zse2;
            }
        } else if (strArr != null && strArr.length == 1) {
            zse.a((zse) map.get(strArr[0]));
            return zse;
        } else if (strArr != null && strArr.length > 1) {
            int length2 = strArr.length;
            while (i < length2) {
                zse.a((zse) map.get(strArr[i]));
                i++;
            }
        }
        return zse;
    }

    public static bl1 J(ws8 ws8) {
        int i;
        String str;
        int i2;
        ws8 ws82 = ws8;
        long nanoTime = System.nanoTime();
        if (!ws8.m()) {
            return new bl1();
        }
        int i3 = 1;
        int i4 = 0;
        try {
            i = jjd.K(ws8);
        } catch (Throwable th) {
            Throwable th2 = th;
            udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
            Iterator it = uzc.a.iterator();
            while (it.hasNext()) {
                ((ny9) it.next()).getClass();
                ny9.a(th2);
            }
            int t = hr1.t(m4b.a);
            if (t == 0) {
                i = 0;
            } else if (t != 1) {
                throw new NoWhenBranchMatchedException();
            } else {
                throw th2;
            }
        }
        if (i == 0) {
            return new bl1();
        }
        long j = 0;
        long j2 = 0;
        String str2 = null;
        while (i4 < i) {
            try {
                str = jjd.M(ws8);
            } catch (Throwable th3) {
                Throwable th4 = th3;
                udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                Iterator it2 = uzc.a.iterator();
                while (it2.hasNext()) {
                    ((ny9) it2.next()).getClass();
                    ny9.a(th4);
                }
                int t2 = hr1.t(m4b.a);
                if (t2 == 0) {
                    str = null;
                } else if (t2 != i3) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    throw th4;
                }
            }
            if (str == null) {
                i2 = i3;
            } else {
                int hashCode = str.hashCode();
                if (hashCode != 110541305) {
                    if (hashCode != 554416495) {
                        if (hashCode == 698680425 && str.equals("token_refresh_ts")) {
                            try {
                                j2 = jjd.J(ws82, 0);
                            } catch (Throwable th5) {
                                Throwable th6 = th5;
                                udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th6);
                                Iterator it3 = uzc.a.iterator();
                                while (it3.hasNext()) {
                                    ((ny9) it3.next()).getClass();
                                    ny9.a(th6);
                                }
                                int t3 = hr1.t(m4b.a);
                                if (t3 == 0) {
                                    j2 = 0;
                                } else if (t3 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                } else {
                                    throw th6;
                                }
                            }
                            i2 = 1;
                        }
                    } else if (str.equals("token_lifetime_ts")) {
                        try {
                            j = jjd.J(ws82, 0);
                        } catch (Throwable th7) {
                            Throwable th8 = th7;
                            udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th8);
                            Iterator it4 = uzc.a.iterator();
                            while (it4.hasNext()) {
                                ((ny9) it4.next()).getClass();
                                ny9.a(th8);
                            }
                            int t4 = hr1.t(m4b.a);
                            if (t4 == 0) {
                                j = 0;
                            } else if (t4 != 1) {
                                throw new NoWhenBranchMatchedException();
                            } else {
                                throw th8;
                            }
                        }
                        i2 = 1;
                    }
                } else if (str.equals("token")) {
                    try {
                        str2 = jjd.M(ws8);
                    } catch (Throwable th9) {
                        Throwable th10 = th9;
                        udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th10);
                        Iterator it5 = uzc.a.iterator();
                        while (it5.hasNext()) {
                            ((ny9) it5.next()).getClass();
                            ny9.a(th10);
                        }
                        int t5 = hr1.t(m4b.a);
                        if (t5 == 0) {
                            str2 = null;
                        } else if (t5 != 1) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            throw th10;
                        }
                    }
                    i2 = 1;
                }
                try {
                    ws8.z();
                } catch (Throwable th11) {
                    Throwable th12 = th11;
                    udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th12);
                    Iterator it6 = uzc.a.iterator();
                    while (it6.hasNext()) {
                        ((ny9) it6.next()).getClass();
                        ny9.a(th12);
                    }
                    int t6 = hr1.t(m4b.a);
                    if (t6 != 0) {
                        if (t6 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th12;
                    }
                }
                i2 = 1;
            }
            i4++;
            i3 = i2;
        }
        return new bl1(str2 == null ? BuildConfig.FLAVOR : str2, j, j2, nanoTime);
    }

    public static final List K(List list, int i, int i2) {
        hw4 hw4;
        while (true) {
            hw4 = hw4.a;
            if (i < 0 || i > p23.A(list)) {
                return hw4;
            }
            if (i2 == 0) {
                Object Y = o23.Y(i, list);
                return Y != null ? Collections.singletonList(Y) : hw4;
            } else if (i2 > 0) {
                int i3 = i2 + i;
                if (i3 > list.size()) {
                    i3 = list.size();
                }
                try {
                    return list.subList(i, i3);
                } catch (Throwable unused) {
                    return hw4;
                }
            } else {
                int i4 = i2 + i;
                if (i4 < 0) {
                    i4 = 0;
                }
                int i5 = i4;
                i2 = i;
                i = i5;
            }
        }
        return hw4;
    }

    public static int L(int i, int i2, int i3, int i4, int i5, Range range) {
        Rational rational = new Rational(i2, i3);
        Rational rational2 = new Rational(i4, i5);
        double doubleValue = rational.doubleValue();
        int doubleValue2 = (int) (rational2.doubleValue() * doubleValue * ((double) i));
        if (hwf.l(3, "AudioConfigUtil")) {
            String.format("Base Bitrate(%dbps) * Channel Count Ratio(%d / %d) * Sample Rate Ratio(%d / %d) = %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(doubleValue2)});
        }
        if (!n80.f.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(doubleValue2));
            doubleValue2 = num.intValue();
            if (hwf.l(3, "AudioConfigUtil")) {
                String.format("\nClamped to range %s -> %dbps", new Object[]{range, num});
            }
        }
        return doubleValue2;
    }

    public static int M(Range range, int i, int i2, int i3) {
        ArrayList arrayList = null;
        int i4 = i3;
        int i5 = 0;
        while (true) {
            if (range.contains(Integer.valueOf(i4))) {
                int i6 = g60.n;
                if (i4 > 0 && i > 0) {
                    if (AudioRecord.getMinBufferSize(i4, i == 1 ? 16 : 12, i2) > 0) {
                        return i4;
                    }
                }
            } else {
                range.toString();
            }
            if (arrayList == null) {
                arrayList = new ArrayList(m80.e);
                Collections.sort(arrayList, new b30(i3, 0));
            }
            if (i5 >= arrayList.size()) {
                return 44100;
            }
            int intValue = ((Integer) arrayList.get(i5)).intValue();
            i5++;
            i4 = intValue;
        }
    }

    public static void N(List list, u1b u1b, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (u1b.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    public static b0d O(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size() / 2);
        ArrayList arrayList4 = new ArrayList(list.size() / 2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ynd ynd = (eod) it.next();
            int i = ynd.a;
            int i2 = ynd.b;
            if (i == 1) {
                if (i2 == 1) {
                    arrayList.add(ynd);
                } else if (i2 == 2) {
                    arrayList2.add((znd) ynd);
                } else {
                    throw new AssertionError("unreachable: " + ynd);
                }
            } else if (i != 2) {
                throw new AssertionError("unreachable: " + ynd);
            } else if (i2 == 1) {
                arrayList3.add((cod) ynd);
            } else if (i2 == 2) {
                arrayList4.add((dod) ynd);
            } else {
                throw new AssertionError("unreachable: " + ynd);
            }
        }
        return new b0d(arrayList, arrayList3, arrayList2, arrayList4, 14);
    }

    public static ArrayList P(List list, iw1 iw1) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            eod eod = (eod) it.next();
            if (iw1.j.equals(eod.d)) {
                arrayList.add(eod);
            }
        }
        return arrayList;
    }

    public static dz6 Q(dz6 dz6, int i) {
        boolean z = i > 0;
        Integer valueOf = Integer.valueOf(i);
        if (z) {
            if (dz6.c <= 0) {
                i = -i;
            }
            return new dz6(dz6.a, dz6.b, i);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static final String R(Object obj, boolean z, boolean z2) {
        return obj == null ? "null" : obj instanceof bo7 ? ((bo7) obj).getClass().getName().concat(".NULL") : obj instanceof co7 ? ((co7) obj).a(z, z2) : obj.toString();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [dz6, fz6] */
    public static fz6 S(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new dz6(i, i2 - 1, 1);
        }
        fz6 fz6 = fz6.o;
        return fz6.o;
    }

    public static final void T(bve bve) {
        bve.e(ezd.class, new z93(15));
        bve.e(wt6.class, new z93(16));
        bve.e(vp.class, new z93(17));
        bve.e(nh4.class, new ef4(15));
        bve.e(ua6.class, new cl(23));
        bve.e(wa6.class, new cl(24));
        bve.e(wkd.class, new cl(25));
    }

    public static void U(File file, gf5 gf5) {
        gf5.l(file);
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    U(file2, gf5);
                } else {
                    gf5.h(file2);
                }
            }
        }
        gf5.n(file);
    }

    public static Object V(Task task) {
        if (task.h()) {
            return task.f();
        }
        if (((n6g) task).d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.e());
    }

    public static Object a(Task task) {
        a24.n("Must not be called on the main application thread");
        a24.m();
        a24.p(task, "Task must not be null");
        if (task.g()) {
            return V(task);
        }
        fte fte = new fte();
        mh4 mh4 = cee.b;
        task.d(mh4, fte);
        task.c(mh4, fte);
        task.a(mh4, fte);
        ((CountDownLatch) fte.a).await();
        return V(task);
    }

    public static Object b(Task task, long j, TimeUnit timeUnit) {
        a24.n("Must not be called on the main application thread");
        a24.m();
        a24.p(task, "Task must not be null");
        a24.p(timeUnit, "TimeUnit must not be null");
        if (task.g()) {
            return V(task);
        }
        fte fte = new fte();
        mh4 mh4 = cee.b;
        task.d(mh4, fte);
        task.c(mh4, fte);
        task.a(mh4, fte);
        if (((CountDownLatch) fte.a).await(j, timeUnit)) {
            return V(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static n6g c(Callable callable, Executor executor) {
        a24.p(executor, "Executor must not be null");
        n6g n6g = new n6g();
        executor.execute(new c4g(n6g, 3, callable));
        return n6g;
    }

    public static float g(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    public static long h(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    public static float i(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static int j(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static long k(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException(m4b.i(hr1.k(j3, "Cannot coerce value to an empty range: maximum ", " is less than minimum "), j2, '.'));
    }

    public static boolean l(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File l : listFiles) {
                l(l);
            }
        }
        return file.delete();
    }

    public static float m(Context context, int i) {
        return TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    public static n6g n(Exception exc) {
        n6g n6g = new n6g();
        n6g.m(exc);
        return n6g;
    }

    public static n6g o(Object obj) {
        n6g n6g = new n6g();
        n6g.n(obj);
        return n6g;
    }

    public static ViewGroup p(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(16908290);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [vbe, java.lang.Object] */
    public static vbe r(View view) {
        ViewGroup p = p(view);
        if (p == null) {
            return null;
        }
        ? obj = new Object();
        obj.a = p.getOverlay();
        return obj;
    }

    public static Object s(Iterable iterable, Object obj) {
        Iterator it = iterable.iterator();
        return it.hasNext() ? it.next() : obj;
    }

    public static Object t(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return list.get(list.size() - 1);
            }
            throw new NoSuchElementException();
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object u(ArrayList arrayList) {
        Object obj = null;
        if (arrayList instanceof Collection) {
            if (arrayList.isEmpty()) {
                return null;
            }
            if (arrayList instanceof List) {
                return rf0.e(arrayList, 1);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            do {
                obj = it.next();
            } while (it.hasNext());
        }
        return obj;
    }

    public static Object v(e8c e8c) {
        po5 l = e8c.listIterator(0);
        Object next = l.next();
        if (!l.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && l.hasNext(); i++) {
            sb.append(", ");
            sb.append(l.next());
        }
        if (l.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    public static final Size w(Context context) {
        Size size = new Size(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels);
        return size.getHeight() > size.getWidth() ? size : new Size(size.getHeight(), size.getWidth());
    }

    public static final void x(hu3 hu3, Throwable th) {
        try {
            ku3 ku3 = (ku3) hu3.get(zl3.b);
            if (ku3 != null) {
                ku3.g(hu3, th);
            } else {
                CoroutineExceptionHandlerImpl_commonKt.handleUncaughtCoroutineException(hu3, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                jjd.d(runtimeException, th);
                th = runtimeException;
            }
            CoroutineExceptionHandlerImpl_commonKt.handleUncaughtCoroutineException(hu3, th);
        }
    }

    public static ArrayList y(List list) {
        ArrayList arrayList = new ArrayList(list.size() / 2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cod cod = (eod) it.next();
            if (cod.b == 1 && cod.a == 2) {
                arrayList.add(cod);
            }
        }
        return arrayList;
    }

    public static boolean z(View view) {
        WeakHashMap weakHashMap = eaf.a;
        return view.getLayoutDirection() == 1;
    }

    public abstract void G(m3 m3Var, m3 m3Var2);

    public abstract void H(m3 m3Var, Thread thread);

    public abstract boolean d(n3 n3Var, j3 j3Var, j3 j3Var2);

    public abstract boolean e(n3 n3Var, Object obj, Object obj2);

    public abstract boolean f(n3 n3Var, m3 m3Var, m3 m3Var2);

    public void onCreateFailure(String str) {
        throw new RuntimeException(str);
    }

    public void onCreateSuccess(SessionDescription sessionDescription) {
    }

    public void onSetFailure(String str) {
        throw new RuntimeException(str);
    }

    public void onSetSuccess() {
    }
}
