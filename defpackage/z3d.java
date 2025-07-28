package defpackage;

import android.animation.ObjectAnimator;
import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Property;
import android.util.Size;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import me.leolin.shortcutbadger.BuildConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: z3d  reason: default package */
public abstract class z3d {
    public static final int[] a = {1, 2, 3, 6};
    public static final int[] b = {48000, 44100, 32000};
    public static final int[] c = {24000, 22050, 16000};
    public static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final ns7 g = new ns7(11);
    public static final qzf h = new qzf(5);
    public static final z26 i = new Object();
    public static final gf6 j = new gf6(11);
    public static final lu7 k = new Object();
    public static final s59 l = new Object();
    public static final Object m = null;
    public static Integer n;
    public static Integer o;

    public static hbc A(Context context, o10 o10, boolean z) {
        j10 j10 = o10.a;
        if (j10 == j10.Z) {
            f10 f10 = o10.g;
            if (f10.a()) {
                return A(context, f10.g, z);
            }
            a10 a10 = f10.f;
            if (a10 != null) {
                return y(context, a10.c, a10.o, z);
            }
        } else if (j10 == j10.c) {
            a10 a102 = o10.b;
            return y(context, a102.c, a102.o, z);
        } else {
            boolean J = ete.J(o10);
            v00 v00 = o10.j;
            if (!J) {
                if (o10.a == j10.o) {
                    return z(context, o10.d, z);
                }
                if (ete.L(o10)) {
                    return z(context, v00.d.d, z);
                }
            } else if (!z) {
                return null;
            } else {
                a10 a103 = v00.d.b;
                return y(context, a103.c, a103.o, z);
            }
        }
        return null;
    }

    public static String B(String str) {
        if (r1g.p(str)) {
            udd.T("z3d", "getStickerToken: response is empty or null", new Object[0]);
            return null;
        }
        try {
            JSONObject jSONObject = new JSONArray(str).getJSONObject(0);
            if (jSONObject.has("token")) {
                return jSONObject.getString("token");
            }
            return null;
        } catch (JSONException e2) {
            udd.s("z3d", "getStickerToken: error", e2);
            return null;
        }
    }

    public static final ArrayList C(int i2) {
        dz6 dz6 = new dz6(i2, 23, 1);
        ArrayList arrayList = new ArrayList(q23.H(dz6, 10));
        Iterator it = dz6.iterator();
        while (((ez6) it).c) {
            arrayList.add(new zie(((ez6) it).a()));
        }
        return arrayList;
    }

    public static boolean D() {
        return jq0.d;
    }

    public static LinkedHashSet E(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(ju7.S(objArr.length));
        cs.e0(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static Set F(Iterable iterable, Set set) {
        Collection s0 = iterable instanceof Collection ? (Collection) iterable : o23.s0(iterable);
        if (s0.isEmpty()) {
            return o23.w0(set);
        }
        if (s0 instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object next : set) {
                if (!s0.contains(next)) {
                    linkedHashSet.add(next);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(s0);
        return linkedHashSet2;
    }

    public static final ArrayList G(int i2) {
        dz6 dz6 = new dz6(i2, 59, 1);
        ArrayList arrayList = new ArrayList(q23.H(dz6, 10));
        Iterator it = dz6.iterator();
        while (((ez6) it).c) {
            arrayList.add(new zie(((ez6) it).a()));
        }
        return arrayList;
    }

    public static ye6 H(String... strArr) {
        if (strArr.length % 2 == 0) {
            Object clone = strArr.clone();
            if (clone != null) {
                String[] strArr2 = (String[]) clone;
                int length = strArr2.length;
                int i2 = 0;
                while (i2 < length) {
                    String str = strArr2[i2];
                    if (str == null) {
                        throw new IllegalArgumentException("Headers cannot be null".toString());
                    } else if (str != null) {
                        strArr2[i2] = h0e.B0(str).toString();
                        i2++;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                }
                dz6 Q = gwf.Q(new dz6(0, strArr2.length - 1, 1), 2);
                int i3 = Q.a;
                int i4 = Q.b;
                int i5 = Q.c;
                if (i5 < 0 ? i3 >= i4 : i3 <= i4) {
                    while (true) {
                        String str2 = strArr2[i3];
                        String str3 = strArr2[i3 + 1];
                        j(str2);
                        l(str3, str2);
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    }
                }
                return new ye6(strArr2);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
        }
        throw new IllegalArgumentException("Expected alternating header names and values".toString());
    }

    public static LinkedHashSet I(Set set, Collection collection) {
        Integer valueOf = collection instanceof Collection ? Integer.valueOf(collection.size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(ju7.S(valueOf != null ? set.size() + valueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        u23.K(collection, linkedHashSet);
        return linkedHashSet;
    }

    public static void J(AtomicLong atomicLong, long j2) {
        long j3;
        long j4;
        do {
            j3 = atomicLong.get();
            if (j3 != Long.MAX_VALUE) {
                j4 = j3 - j2;
                if (j4 < 0) {
                    xs7.F(new IllegalStateException(us8.i(j4, "More produced than requested: ")));
                    j4 = 0;
                }
            } else {
                return;
            }
        } while (!atomicLong.compareAndSet(j3, j4));
    }

    public static int K(int i2, yze yze) {
        switch (i2) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i2 - 2);
            case 6:
                return yze.v() + 1;
            case 7:
                return yze.A() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i2 - 8);
            default:
                return -1;
        }
    }

    public static void L(RecyclerView recyclerView, Runnable runnable) {
        g(recyclerView, 0, 5, runnable, (Runnable) null);
    }

    public static final lg7 M(View view, float f2, float f3, long j2, long j3) {
        lg7 c2 = hwf.c();
        c2.add(f(view, View.SCALE_X, f2, f3, j2, j3, 96));
        c2.add(f(view, View.SCALE_Y, f2, f3, j2, j3, 96));
        return hwf.a(c2);
    }

    public static Set N(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return qw4.a;
        }
        if (length == 1) {
            return Collections.singleton(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(ju7.S(objArr.length));
        cs.e0(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static int O(int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (i2 == 1) {
            return 90;
        }
        if (i2 == 2) {
            return 180;
        }
        if (i2 == 3) {
            return 270;
        }
        throw new IllegalArgumentException(wn6.h(i2, "Unsupported surface rotation: "));
    }

    public static final void P(bve bve) {
        bve.e(f87.class, new vrd(3));
        bve.e(lwd.class, new n5b(29));
        bve.e(qwd.class, new yud(0));
    }

    public static final void Q(bve bve) {
        bve.c(z24.class, new w8d(23));
    }

    public static void R(String str, Writer writer) {
        writer.write(34);
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '\\' || charAt == '\"' || charAt <= 31) {
                if (i3 > i2) {
                    writer.write(str, i2, i3 - i2);
                }
                writer.write(92);
                if (charAt == 12) {
                    writer.write(102);
                } else if (charAt != 13) {
                    if (charAt != '\"' && charAt != '/' && charAt != '\\') {
                        switch (charAt) {
                            case 8:
                                writer.write(98);
                                break;
                            case 9:
                                writer.write(116);
                                break;
                            case 10:
                                writer.write(110);
                                break;
                            default:
                                writer.write(117);
                                writer.write(ct0.v((charAt >> 12) & 15));
                                writer.write(ct0.v((charAt >> 8) & 15));
                                writer.write(ct0.v((charAt >> 4) & 15));
                                writer.write(ct0.v(charAt & 15));
                                break;
                        }
                    } else {
                        writer.write(charAt);
                    }
                } else {
                    writer.write(114);
                }
                i2 = i3 + 1;
            }
        }
        if (length > i2) {
            writer.write(str, i2, length - i2);
        }
        writer.write(34);
    }

    public static a73 a() {
        return new a73((g37) null);
    }

    public static long b(AtomicLong atomicLong, long j2) {
        long j3;
        do {
            j3 = atomicLong.get();
            if (j3 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j3, c(j3, j2)));
        return j3;
    }

    public static long c(long j2, long j3) {
        long j4 = j2 + j3;
        if (j4 < 0) {
            return Long.MAX_VALUE;
        }
        return j4;
    }

    public static void d(Context context, o10 o10, ywa ywa, boolean z, boolean z2) {
        hbc A;
        Object obj;
        Object obj2;
        Object obj3 = ywa.e;
        if (obj3 == null || ((tr6) obj3).i == null) {
            hbc A2 = A(context, o10, z);
            if (!(A2 == null || (obj2 = ywa.e) == null)) {
                ur6 b2 = ur6.b((tr6) obj2);
                b2.d = A2;
                ywa.e = b2.a();
            }
            if (!z && z2 && (A = A(context, o10, true)) != null && (obj = ywa.e) != null) {
                ur6 b3 = ur6.b((tr6) obj);
                b3.d = A;
                ywa.f = b3.a();
            }
        }
    }

    public static final ObjectAnimator e(View view, Property property, float f2, float f3, long j2, long j3, int i2, int i3) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, new float[]{f2, f3});
        ofFloat.setDuration(j2);
        ofFloat.setStartDelay(j3);
        ofFloat.setRepeatMode(i2);
        ofFloat.setRepeatCount(i3);
        return ofFloat;
    }

    public static /* synthetic */ ObjectAnimator f(View view, Property property, float f2, float f3, long j2, long j3, int i2) {
        return e(view, property, f2, f3, j2, (i2 & 16) != 0 ? 0 : j3, 1, 0);
    }

    public static final void g(RecyclerView recyclerView, int i2, int i3, Runnable runnable, Runnable runnable2) {
        if (recyclerView != null) {
            Handler handler = recyclerView.getHandler();
            if (handler != null && handler.hasMessages(61453)) {
                recyclerView.getHandler().removeMessages(61453, runnable);
            }
            if (!recyclerView.Z() && Looper.getMainLooper().isCurrentThread()) {
                runnable.run();
            } else if (i2 != i3) {
                f7c f7c = new f7c(recyclerView, i2, i3, runnable, runnable2);
                Message obtain = Message.obtain(recyclerView.getHandler(), f7c);
                obtain.what = 61453;
                obtain.obj = runnable;
                Handler handler2 = recyclerView.getHandler();
                if (handler2 != null) {
                    handler2.sendMessageAtFrontOfQueue(obtain);
                } else {
                    recyclerView.post(f7c);
                }
            } else if (runnable2 != null) {
                runnable2.run();
            }
        } else if (runnable2 != null) {
            runnable2.run();
        }
    }

    public static u3d h(u3d u3d) {
        ht7 ht7 = u3d.a;
        ht7.b();
        return ht7.x0 > 0 ? u3d : u3d.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0088, code lost:
        if (r13 == r1.g) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0097, code lost:
        if ((r20.v() * 1000) == r1) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a5, code lost:
        if (r6 == r1) goto L_0x00a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean i(defpackage.yze r20, defpackage.ti5 r21, int r22, le4 r23) {
        /*
            r0 = r20
            r1 = r21
            r2 = 10
            r3 = 1
            int r4 = r0.b
            long r5 = r20.w()
            r7 = 16
            long r7 = r5 >>> r7
            r9 = r22
            long r9 = (long) r9
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            r10 = 0
            if (r9 == 0) goto L_0x001a
            return r10
        L_0x001a:
            r11 = 1
            long r7 = r7 & r11
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x0023
            r7 = r3
            goto L_0x0024
        L_0x0023:
            r7 = r10
        L_0x0024:
            r8 = 12
            long r13 = r5 >> r8
            r15 = 15
            long r13 = r13 & r15
            int r9 = (int) r13
            r13 = 8
            long r13 = r5 >> r13
            long r13 = r13 & r15
            int r13 = (int) r13
            r14 = 4
            long r17 = r5 >> r14
            long r14 = r17 & r15
            int r14 = (int) r14
            long r15 = r5 >> r3
            r17 = 7
            r19 = r9
            long r8 = r15 & r17
            int r8 = (int) r8
            long r5 = r5 & r11
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 != 0) goto L_0x0048
            r5 = r3
            goto L_0x0049
        L_0x0048:
            r5 = r10
        L_0x0049:
            r6 = 7
            if (r14 > r6) goto L_0x0052
            int r6 = r1.h
            int r6 = r6 - r3
            if (r14 != r6) goto L_0x00c3
            goto L_0x0059
        L_0x0052:
            if (r14 > r2) goto L_0x00c3
            int r6 = r1.h
            r9 = 2
            if (r6 != r9) goto L_0x00c3
        L_0x0059:
            if (r8 != 0) goto L_0x005c
            goto L_0x0060
        L_0x005c:
            int r6 = r1.j
            if (r8 != r6) goto L_0x00c3
        L_0x0060:
            if (r5 != 0) goto L_0x00c3
            long r5 = r20.D()     // Catch:{ NumberFormatException -> 0x00c3 }
            if (r7 == 0) goto L_0x006b
        L_0x0068:
            r7 = r23
            goto L_0x0070
        L_0x006b:
            int r7 = r1.c
            long r7 = (long) r7
            long r5 = r5 * r7
            goto L_0x0068
        L_0x0070:
            r7.a = r5
            r5 = r19
            int r5 = K(r5, r0)
            r6 = -1
            if (r5 == r6) goto L_0x00c3
            int r6 = r1.c
            if (r5 > r6) goto L_0x00c3
            if (r13 != 0) goto L_0x0082
            goto L_0x00a7
        L_0x0082:
            r5 = 11
            if (r13 > r5) goto L_0x008b
            int r1 = r1.g
            if (r13 != r1) goto L_0x00c3
            goto L_0x00a7
        L_0x008b:
            int r1 = r1.f
            r5 = 12
            if (r13 != r5) goto L_0x009a
            int r2 = r20.v()
            int r2 = r2 * 1000
            if (r2 != r1) goto L_0x00c3
            goto L_0x00a7
        L_0x009a:
            r5 = 14
            if (r13 > r5) goto L_0x00c3
            int r6 = r20.A()
            if (r13 != r5) goto L_0x00a5
            int r6 = r6 * r2
        L_0x00a5:
            if (r6 != r1) goto L_0x00c3
        L_0x00a7:
            int r1 = r20.v()
            int r2 = r0.b
            byte[] r0 = r0.a
            int r2 = r2 - r3
            int r5 = defpackage.mze.a
            r5 = r10
        L_0x00b3:
            if (r4 >= r2) goto L_0x00c0
            byte r6 = r0[r4]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r5 = r5 ^ r6
            int[] r6 = defpackage.mze.n
            r5 = r6[r5]
            int r4 = r4 + r3
            goto L_0x00b3
        L_0x00c0:
            if (r1 != r5) goto L_0x00c3
            goto L_0x00c4
        L_0x00c3:
            r3 = r10
        L_0x00c4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z3d.i(yze, ti5, int, le4):boolean");
    }

    public static void j(String str) {
        if (str.length() > 0) {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if ('!' > charAt || '~' < charAt) {
                    throw new IllegalArgumentException(nze.h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i2), str).toString());
                }
            }
            return;
        }
        throw new IllegalArgumentException("name is empty".toString());
    }

    public static int k(Context context, String str) {
        int i2;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String d2 = gp.d(str);
        if (d2 != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int myUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (myUid2 != myUid || !Objects.equals(packageName2, packageName)) {
                i2 = gp.c((AppOpsManager) gp.a(context, AppOpsManager.class), d2, packageName);
            } else {
                AppOpsManager c2 = hp.c(context);
                i2 = hp.a(c2, d2, Binder.getCallingUid(), packageName);
                if (i2 == 0) {
                    i2 = hp.a(c2, d2, myUid, hp.b(context));
                }
            }
            if (i2 != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static void l(String str, String str2) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt == 9 || (' ' <= charAt && '~' >= charAt)) {
                i2++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(nze.h("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i2), str2));
                sb.append(nze.p(str2) ? BuildConfig.FLAVOR : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static void m(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i2 = 0;
            if (it.hasNext()) {
                t73 t73 = (t73) it.next();
                xx3 xx3 = new xx3(t73);
                Iterator it2 = t73.b.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        pjb pjb = (pjb) it2.next();
                        boolean z = !(t73.e == 0);
                        yx3 yx3 = new yx3(pjb, z);
                        if (!hashMap.containsKey(yx3)) {
                            hashMap.put(yx3, new HashSet());
                        }
                        Set set = (Set) hashMap.get(yx3);
                        if (set.isEmpty() || z) {
                            set.add(xx3);
                        } else {
                            throw new IllegalArgumentException("Multiple components provide " + pjb + ".");
                        }
                    }
                }
            } else {
                for (Set<xx3> it3 : hashMap.values()) {
                    for (xx3 xx32 : it3) {
                        for (oe4 oe4 : xx32.a.c) {
                            if (oe4.c == 0) {
                                Set<xx3> set2 = (Set) hashMap.get(new yx3(oe4.a, oe4.b == 2));
                                if (set2 != null) {
                                    for (xx3 xx33 : set2) {
                                        xx32.b.add(xx33);
                                        xx33.c.add(xx32);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                for (Set addAll : hashMap.values()) {
                    hashSet.addAll(addAll);
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    xx3 xx34 = (xx3) it4.next();
                    if (xx34.c.isEmpty()) {
                        hashSet2.add(xx34);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    xx3 xx35 = (xx3) hashSet2.iterator().next();
                    hashSet2.remove(xx35);
                    i2++;
                    Iterator it5 = xx35.b.iterator();
                    while (it5.hasNext()) {
                        xx3 xx36 = (xx3) it5.next();
                        xx36.c.remove(xx35);
                        if (xx36.c.isEmpty()) {
                            hashSet2.add(xx36);
                        }
                    }
                }
                if (i2 != arrayList.size()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it6 = hashSet.iterator();
                    while (it6.hasNext()) {
                        xx3 xx37 = (xx3) it6.next();
                        if (!xx37.c.isEmpty() && !xx37.b.isEmpty()) {
                            arrayList2.add(xx37.a);
                        }
                    }
                    throw new RuntimeException("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
                }
                return;
            }
        }
    }

    public static final Map n(Map map) {
        Object obj;
        try {
            obj = map.keySet();
        } catch (Throwable th) {
            obj = new kcc(th);
        }
        Object obj2 = qw4.a;
        if (obj instanceof kcc) {
            obj = obj2;
        }
        return h2g.j(new wwc(27, (Iterable) obj));
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [long[], java.io.Serializable] */
    public static final gt5 o(Map map) {
        gt5 gt5 = new gt5(0);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (gu7.$EnumSwitchMapping$0[((r72) entry.getKey()).ordinal()] == 1) {
                gt5.b = (long[]) value;
            }
        }
        return gt5;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [int[], java.io.Serializable] */
    public static final gt5 p(Collection collection) {
        gt5 gt5 = new gt5(1);
        Iterator it = collection.iterator();
        int size = collection.size();
        ? r2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            r2[i2] = ((fr5) it.next()).a;
        }
        gt5.b = r2;
        return gt5;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [ht5[], java.io.Serializable] */
    public static final gt5 q(List list) {
        gt5 gt5 = new gt5(2);
        int size = list.size();
        ? r2 = new ht5[size];
        for (int i2 = 0; i2 < size; i2++) {
            kr5 kr5 = (kr5) list.get(i2);
            ht5 ht5 = new ht5();
            ht5.a = kr5.a;
            ht5.b = kr5.b;
            ht5.c = kr5.c;
            String str = BuildConfig.FLAVOR;
            String str2 = kr5.d;
            if (str2 == null) {
                str2 = str;
            }
            ht5.d = str2;
            Long l2 = kr5.e;
            ht5.e = l2 != null ? l2.longValue() : -1;
            String str3 = kr5.g;
            if (str3 == null) {
                str3 = str;
            }
            ht5.f = str3;
            String str4 = kr5.h;
            if (str4 == null) {
                str4 = str;
            }
            ht5.g = str4;
            String str5 = kr5.f;
            if (str5 != null) {
                str = str5;
            }
            ht5.h = str;
            r2[i2] = ht5;
        }
        gt5.b = r2;
        return gt5;
    }

    public static final EnumSet r(gt5 gt5) {
        Object obj;
        int[] iArr = (int[]) gt5.b;
        EnumSet<E> noneOf = EnumSet.noneOf(fr5.class);
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            fr5.b.getClass();
            pz4 pz4 = fr5.Y;
            pz4.getClass();
            u1 u1Var = new u1(0, pz4);
            while (true) {
                if (!u1Var.hasNext()) {
                    obj = null;
                    break;
                }
                obj = u1Var.next();
                if (((fr5) obj).a == i3) {
                    break;
                }
            }
            fr5 fr5 = (fr5) obj;
            if (fr5 != null) {
                noneOf.add(fr5);
                i2++;
            } else {
                throw new IllegalStateException(("unsupported type " + i3).toString());
            }
        }
        return noneOf;
    }

    public static final ArrayList s(gt5 gt5) {
        ht5[] ht5Arr = (ht5[]) gt5.b;
        ArrayList arrayList = new ArrayList(ht5Arr.length);
        for (ht5 ht5 : ht5Arr) {
            long j2 = ht5.a;
            String str = ht5.b;
            String str2 = ht5.c;
            String str3 = ht5.d;
            String str4 = (str3 == null || str3.length() == 0) ? null : str3;
            long j3 = ht5.e;
            Long valueOf = j3 == -1 ? null : Long.valueOf(j3);
            String str5 = ht5.f;
            String str6 = (str5 == null || str5.length() == 0) ? null : str5;
            String str7 = ht5.g;
            String str8 = (str7 == null || str7.length() == 0) ? null : str7;
            String str9 = ht5.h;
            if (str9 == null || str9.length() == 0) {
                str9 = null;
            }
            arrayList.add(new kr5(j2, str, str2, str4, valueOf, str9, str6, str8));
        }
        return arrayList;
    }

    public static int t(int i2, int i3) {
        int i4 = i3 / 2;
        if (i2 < 0 || i2 >= 3 || i3 < 0 || i4 >= 19) {
            return -1;
        }
        int i5 = b[i2];
        if (i5 == 44100) {
            return ((i3 % 2) + f[i4]) * 2;
        }
        int i6 = e[i4];
        return i5 == 32000 ? i6 * 6 : i6 * 4;
    }

    public static int u(Context context) {
        if (o == null) {
            vl.b().f().getClass();
            Size i2 = tf4.i(context);
            int min = (int) ((((float) Math.min(i2.getWidth(), i2.getHeight())) / 3.0f) * 2.0f);
            if (min < 400) {
                min = 400;
            }
            o = Integer.valueOf(min);
        }
        return o.intValue();
    }

    public static String v(String str) {
        if (r1g.p(str)) {
            udd.R("z3d", (IOException) null, "getPhotoToken: response is empty or null", Arrays.copyOf(new Object[0], 0));
            return null;
        }
        try {
            ArrayList w = w(str);
            if (w.size() > 0) {
                return (String) w.get(0);
            }
            return null;
        } catch (Exception e2) {
            udd.s("z3d", "getPhotoToken: exception while getting photo token from response", e2);
            return null;
        }
    }

    public static ArrayList w(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("error_msg")) {
                udd.p("z3d", "getPhotoToken: got json error: %s", jSONObject.getString("error_msg"));
                return arrayList;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("photos");
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                arrayList.add(jSONObject2.getJSONObject(keys.next()).getString("token"));
            }
            return arrayList;
        } catch (Exception e2) {
            udd.p("z3d", "exception while parsing photo upload response: " + e2.getMessage(), new Object[0]);
            throw e2;
        }
    }

    public static int x(int i2, int i3, boolean z) {
        int i4 = z ? ((i3 - i2) + 360) % 360 : (i3 + i2) % 360;
        if (hwf.l(2, "CameraOrientationUtil")) {
            StringBuilder i5 = rf0.i("getRelativeImageRotation: destRotationDegrees=", i2, ", sourceRotationDegrees=", i3, ", isOppositeFacing=");
            i5.append(z);
            i5.append(", result=");
            i5.append(i4);
        }
        return i4;
    }

    public static hbc y(Context context, int i2, int i3, boolean z) {
        int i4;
        int u = u(context);
        if (n == null) {
            vl.b().f().getClass();
            Size i5 = tf4.i(context);
            n = Integer.valueOf(Math.max(i5.getWidth(), i5.getHeight()));
        }
        int intValue = n.intValue();
        if (z) {
            intValue = u;
        }
        if (i3 * i2 < intValue * intValue) {
            return null;
        }
        if (i3 <= intValue && i2 <= intValue) {
            return null;
        }
        if (i3 > i2) {
            int i6 = (int) ((((float) i2) / ((float) i3)) * ((float) intValue));
            i4 = intValue;
            intValue = i6;
        } else {
            i4 = (int) ((((float) i3) / ((float) i2)) * ((float) intValue));
        }
        return new hbc(intValue, z ? (float) u : 2048.0f, i4);
    }

    public static hbc z(Context context, n10 n10, boolean z) {
        int i2;
        int i3 = n10.e;
        int i4 = n10.f;
        hbc y = y(context, i3, i4, z);
        if (y == null && (i2 = n10.e) > 0 && i4 > 0) {
            y = new hbc(i2, z ? (float) u(context) : 2048.0f, i4);
        }
        return y;
    }
}
