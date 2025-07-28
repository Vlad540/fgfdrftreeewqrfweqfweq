package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.fragment.app.b;
import com.bluelinelabs.conductor.internal.AndroidXLifecycleHandlerImpl;
import java.io.File;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.IDN;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.serialization.MissingFieldException;

/* renamed from: bm3  reason: default package */
public abstract class bm3 implements tyd {
    public static final Object X = new Object();
    public static boolean Y;
    public static long Z;
    public static final Object a = new Object();
    public static ExecutorService b;
    public static final j06 c = new Object();
    public static final Object o = new Object();
    public static final /* synthetic */ int w0 = 0;

    public static long A(int i, byte[] bArr) {
        byte b2 = bArr[i];
        byte b3 = bArr[i + 1];
        byte b4 = bArr[i + 2];
        byte b5 = bArr[i + 3];
        byte b6 = b2 & true;
        int i2 = b2;
        if (b6 == true) {
            i2 = (b2 & Byte.MAX_VALUE) + 128;
        }
        byte b7 = b3 & true;
        int i3 = b3;
        if (b7 == true) {
            i3 = (b3 & Byte.MAX_VALUE) + 128;
        }
        byte b8 = b4 & true;
        int i4 = b4;
        if (b8 == true) {
            i4 = (b4 & Byte.MAX_VALUE) + 128;
        }
        byte b9 = b5 & true;
        int i5 = b5;
        if (b9 == true) {
            i5 = (b5 & Byte.MAX_VALUE) + 128;
        }
        return (((long) i2) << 24) + (((long) i3) << 16) + (((long) i4) << 8) + ((long) i5);
    }

    public static long B(int i, byte[] bArr) {
        long A = A(i, bArr);
        long A2 = A(i + 4, bArr);
        if (A == 0 && A2 == 0) {
            return 0;
        }
        return ((A2 * 1000) / 4294967296L) + ((A - 2208988800L) * 1000);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ebc, java.lang.Object] */
    public static final ebc C(s16 s16) {
        ? obj = new Object();
        obj.a = s16;
        obj.b = smc.Y;
        return obj;
    }

    public static TypedValue D(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean E(int i, Context context, boolean z) {
        TypedValue D = D(context, i);
        return (D == null || D.type != 18) ? z : D.data != 0;
    }

    public static TypedValue F(int i, Context context, String str) {
        TypedValue D = D(context, i);
        if (D != null) {
            return D;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)}));
    }

    public static void H(View view) {
        if (view != null) {
            view.requestFocus();
            view.post(new zo5(view, 10, view));
        }
    }

    public static final void I(int i, int i2, syc syc) {
        String str;
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(syc.g(i4));
            }
            i3 >>>= 1;
        }
        String a2 = syc.a();
        if (arrayList.size() == 1) {
            str = "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + a2 + "', but it was missing";
        } else {
            str = "Fields " + arrayList + " are required for type with serial name '" + a2 + "', but they were missing";
        }
        throw new MissingFieldException(arrayList, str, (MissingFieldException) null);
    }

    /* JADX WARNING: type inference failed for: r9v8, types: [wr0, java.lang.Object] */
    public static final String J(String str) {
        int i = 0;
        int i2 = -1;
        if (h0e.R(str, ":", false)) {
            InetAddress h = (!p0e.Q(str, "[", false) || !str.endsWith("]")) ? h(0, str.length(), str) : h(1, str.length() - 1, str);
            if (h == null) {
                return null;
            }
            byte[] address = h.getAddress();
            if (address.length == 16) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < address.length) {
                    int i5 = i3;
                    while (i5 < 16 && address[i5] == 0 && address[i5 + 1] == 0) {
                        i5 += 2;
                    }
                    int i6 = i5 - i3;
                    if (i6 > i4 && i6 >= 4) {
                        i2 = i3;
                        i4 = i6;
                    }
                    i3 = i5 + 2;
                }
                ? obj = new Object();
                while (i < address.length) {
                    if (i == i2) {
                        obj.u0(58);
                        i += i4;
                        if (i == 16) {
                            obj.u0(58);
                        }
                    } else {
                        if (i > 0) {
                            obj.u0(58);
                        }
                        byte b2 = address[i];
                        byte[] bArr = nze.a;
                        obj.w0((long) (((b2 & 255) << 8) | (address[i + 1] & 255)));
                        i += 2;
                    }
                }
                return obj.p0();
            } else if (address.length == 4) {
                return h.getHostAddress();
            } else {
                throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
            }
        } else {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i7 = 0; i7 < length; i7++) {
                    char charAt = lowerCase.charAt(i7);
                    if (hhd.o(charAt, 31) <= 0) {
                        return null;
                    }
                    if (hhd.o(charAt, 127) >= 0) {
                        return null;
                    }
                    if (h0e.Z(" #%/:?@[\\]", charAt, 0, false, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public static final void K(bve bve) {
        bve.c(z24.class, new w8d(2));
    }

    public static long a() {
        DatagramSocket datagramSocket;
        long j;
        synchronized (X) {
        }
        InetAddress byName = InetAddress.getByName("time.android.com");
        DatagramSocket datagramSocket2 = new DatagramSocket();
        try {
            datagramSocket2.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (currentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
                j = currentTimeMillis;
                datagramSocket = datagramSocket2;
            } else {
                long j2 = currentTimeMillis / 1000;
                long j3 = currentTimeMillis - (j2 * 1000);
                long j4 = j2 + 2208988800L;
                j = currentTimeMillis;
                bArr[40] = (byte) ((int) (j4 >> 24));
                bArr[41] = (byte) ((int) (j4 >> 16));
                datagramSocket = datagramSocket2;
                try {
                    bArr[42] = (byte) ((int) (j4 >> 8));
                    bArr[43] = (byte) ((int) j4);
                    long j5 = (j3 * 4294967296L) / 1000;
                    bArr[44] = (byte) ((int) (j5 >> 24));
                    bArr[45] = (byte) ((int) (j5 >> 16));
                    bArr[46] = (byte) ((int) (j5 >> 8));
                    bArr[47] = (byte) ((int) (Math.random() * 255.0d));
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    try {
                        datagramSocket.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j6 = (elapsedRealtime2 - elapsedRealtime) + j;
            byte b2 = bArr[0];
            long B = B(24, bArr);
            long B2 = B(32, bArr);
            long B3 = B(40, bArr);
            e((byte) ((b2 >> 6) & 3), (byte) (b2 & 7), bArr[1] & 255, B3);
            long j7 = (j6 + (((B3 - j6) + (B2 - B)) / 2)) - elapsedRealtime2;
            datagramSocket.close();
            return j7;
        } catch (Throwable th4) {
            th = th4;
            datagramSocket = datagramSocket2;
            Throwable th22 = th;
            datagramSocket.close();
            throw th22;
        }
    }

    public static void b(StringBuilder sb, String str) {
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == 10) {
                sb.append("%0A");
            } else if (charAt == 13) {
                sb.append("%0D");
            } else if (charAt != '\"') {
                sb.append(charAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append('\"');
    }

    public static sgc c(Activity activity, ViewGroup viewGroup, Bundle bundle) {
        ct0.i();
        AndroidXLifecycleHandlerImpl a2 = ic7.a(activity, true);
        if (a2 == null) {
            if (activity instanceof b) {
                a2 = new AndroidXLifecycleHandlerImpl();
                vx5 P = ((b) activity).P();
                P.getClass();
                hd0 hd0 = new hd0(P);
                hd0.f(0, a2, "LifecycleHandler", 1);
                hd0.d(false);
            } else {
                a2 = new qxa();
                activity.getFragmentManager().beginTransaction().add(a2, "LifecycleHandler").commit();
            }
        }
        a2.I(activity);
        f8 w = a2.w(viewGroup, bundle);
        w.I();
        w.e = 1;
        return w;
    }

    public static final void d(LinkedHashMap linkedHashMap, syc syc, String str, int i) {
        String str2 = hhd.f(syc.e(), xyc.g) ? "enum value" : "property";
        if (!linkedHashMap.containsKey(str)) {
            linkedHashMap.put(str, Integer.valueOf(i));
            return;
        }
        throw new IllegalArgumentException("The suggested name '" + str + "' for " + str2 + ' ' + syc.g(i) + " is already one of the names for " + str2 + ' ' + syc.g(((Number) ju7.Q(linkedHashMap, str)).intValue()) + " in " + syc);
    }

    public static void e(byte b2, byte b3, int i, long j) {
        if (b2 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        } else if (b3 != 4 && b3 != 5) {
            throw new IOException(m4b.h(26, b3, "SNTP: Untrusted mode: "));
        } else if (i == 0 || i > 15) {
            throw new IOException(m4b.h(36, i, "SNTP: Untrusted stratum: "));
        } else if (j == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static void f(oz3 oz3) {
        if (oz3 != null) {
            try {
                oz3.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0089, code lost:
        if ((r13 - r9) != 0) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d2, code lost:
        if (r7 == r0) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00d4, code lost:
        if (r8 != -1) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00d6, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d7, code lost:
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ea, code lost:
        return java.net.InetAddress.getByAddress(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.net.InetAddress h(int r17, int r18, java.lang.String r19) {
        /*
            r0 = r18
            r1 = r19
            r2 = 16
            byte[] r3 = new byte[r2]
            r5 = -1
            r7 = 0
            r6 = r17
            r8 = r5
            r9 = r8
        L_0x000e:
            r10 = 0
            if (r6 >= r0) goto L_0x00d1
            if (r7 != r2) goto L_0x0014
            return r10
        L_0x0014:
            int r11 = r6 + 2
            r12 = 255(0xff, float:3.57E-43)
            if (r11 > r0) goto L_0x0031
            java.lang.String r13 = "::"
            boolean r13 = r1.startsWith(r13, r6)
            if (r13 == 0) goto L_0x0031
            if (r8 == r5) goto L_0x0025
            return r10
        L_0x0025:
            int r7 = r7 + 2
            if (r11 != r0) goto L_0x002d
            r0 = r2
            r8 = r7
            goto L_0x00d2
        L_0x002d:
            r8 = r7
            r9 = r11
            goto L_0x00a0
        L_0x0031:
            if (r7 == 0) goto L_0x003d
            java.lang.String r11 = ":"
            boolean r11 = r1.startsWith(r11, r6)
            if (r11 == 0) goto L_0x0040
            int r6 = r6 + 1
        L_0x003d:
            r9 = r6
            goto L_0x00a0
        L_0x0040:
            java.lang.String r11 = "."
            boolean r6 = r1.startsWith(r11, r6)
            if (r6 == 0) goto L_0x009f
            int r6 = r7 + -2
            r11 = r6
        L_0x004b:
            if (r9 >= r0) goto L_0x0096
            if (r11 != r2) goto L_0x0050
            goto L_0x009f
        L_0x0050:
            if (r11 == r6) goto L_0x005d
            char r13 = r1.charAt(r9)
            r14 = 46
            if (r13 == r14) goto L_0x005b
            goto L_0x009f
        L_0x005b:
            int r9 = r9 + 1
        L_0x005d:
            r13 = r9
            r14 = 0
        L_0x005f:
            if (r13 >= r0) goto L_0x0087
            char r15 = r1.charAt(r13)
            r4 = 48
            int r16 = hhd.o(r15, r4)
            if (r16 < 0) goto L_0x0087
            r2 = 57
            int r2 = hhd.o(r15, r2)
            if (r2 <= 0) goto L_0x0076
            goto L_0x0087
        L_0x0076:
            if (r14 != 0) goto L_0x007b
            if (r9 == r13) goto L_0x007b
            goto L_0x009f
        L_0x007b:
            int r14 = r14 * 10
            int r14 = r14 + r15
            int r14 = r14 - r4
            if (r14 <= r12) goto L_0x0082
            goto L_0x009f
        L_0x0082:
            int r13 = r13 + 1
            r2 = 16
            goto L_0x005f
        L_0x0087:
            int r2 = r13 - r9
            if (r2 != 0) goto L_0x008c
            goto L_0x009f
        L_0x008c:
            int r2 = r11 + 1
            byte r4 = (byte) r14
            r3[r11] = r4
            r11 = r2
            r9 = r13
            r2 = 16
            goto L_0x004b
        L_0x0096:
            int r0 = r7 + 2
            if (r11 != r0) goto L_0x009f
            int r7 = r7 + 2
            r0 = 16
            goto L_0x00d2
        L_0x009f:
            return r10
        L_0x00a0:
            r6 = r9
            r2 = 0
        L_0x00a2:
            if (r6 >= r0) goto L_0x00b5
            char r4 = r1.charAt(r6)
            int r4 = nze.q(r4)
            if (r4 != r5) goto L_0x00af
            goto L_0x00b5
        L_0x00af:
            int r2 = r2 << 4
            int r2 = r2 + r4
            int r6 = r6 + 1
            goto L_0x00a2
        L_0x00b5:
            int r4 = r6 - r9
            if (r4 == 0) goto L_0x00d0
            r11 = 4
            if (r4 <= r11) goto L_0x00bd
            goto L_0x00d0
        L_0x00bd:
            int r4 = r7 + 1
            int r10 = r2 >>> 8
            r10 = r10 & r12
            byte r10 = (byte) r10
            r3[r7] = r10
            int r7 = r7 + 2
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r3[r4] = r2
            r2 = 16
            goto L_0x000e
        L_0x00d0:
            return r10
        L_0x00d1:
            r0 = r2
        L_0x00d2:
            if (r7 == r0) goto L_0x00e6
            if (r8 != r5) goto L_0x00d7
            return r10
        L_0x00d7:
            int r1 = r7 - r8
            int r2 = 16 - r1
            java.lang.System.arraycopy(r3, r8, r3, r2, r1)
            int r2 = 16 - r7
            int r2 = r2 + r8
            r0 = 0
            byte r0 = (byte) r0
            java.util.Arrays.fill(r3, r8, r2, r0)
        L_0x00e6:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm3.h(int, int, java.lang.String):java.net.InetAddress");
    }

    public static final tg j(View view) {
        return ((k93) ((vl) ((ug) view.getContext().getApplicationContext())).c.getValue()).c();
    }

    public static final int l(syc syc, r57 r57, String str) {
        boolean z = r57.a.m;
        Object obj = null;
        j06 j06 = c;
        u5g u5g = r57.c;
        if (!z || !hhd.f(syc.e(), xyc.g)) {
            x(r57, syc);
            int d = syc.d(str);
            if (d != -3 || !r57.a.l) {
                return d;
            }
            zu4 zu4 = new zu4((Object) syc, 12, (Object) r57);
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) u5g.b;
            Map map = (Map) concurrentHashMap.get(syc);
            Object obj2 = map != null ? map.get(j06) : null;
            if (obj2 != null) {
                obj = obj2;
            }
            if (obj == null) {
                obj = zu4.invoke();
                Object obj3 = concurrentHashMap.get(syc);
                if (obj3 == null) {
                    obj3 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(syc, obj3);
                }
                ((Map) obj3).put(j06, obj);
            }
            Integer num = (Integer) ((Map) obj).get(str);
            if (num != null) {
                return num.intValue();
            }
            return -3;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        zu4 zu42 = new zu4((Object) syc, 12, (Object) r57);
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) u5g.b;
        Map map2 = (Map) concurrentHashMap2.get(syc);
        Object obj4 = map2 != null ? map2.get(j06) : null;
        if (obj4 != null) {
            obj = obj4;
        }
        if (obj == null) {
            obj = zu42.invoke();
            Object obj5 = concurrentHashMap2.get(syc);
            if (obj5 == null) {
                obj5 = new ConcurrentHashMap(2);
                concurrentHashMap2.put(syc, obj5);
            }
            ((Map) obj5).put(j06, obj);
        }
        Integer num2 = (Integer) ((Map) obj).get(lowerCase);
        if (num2 != null) {
            return num2.intValue();
        }
        return -3;
    }

    public static final int m(syc syc, r57 r57, String str, String str2) {
        int l = l(syc, r57, str);
        if (l != -3) {
            return l;
        }
        throw new IllegalArgumentException(syc.a() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final zv1 n(Continuation continuation) {
        if (!(continuation instanceof DispatchedContinuation)) {
            return new zv1(1, continuation);
        }
        zv1 claimReusableCancellableContinuation$kotlinx_coroutines_core = ((DispatchedContinuation) continuation).claimReusableCancellableContinuation$kotlinx_coroutines_core();
        if (claimReusableCancellableContinuation$kotlinx_coroutines_core != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = zv1.o;
            Object obj = atomicReferenceFieldUpdater.get(claimReusableCancellableContinuation$kotlinx_coroutines_core);
            if (!(obj instanceof p73) || ((p73) obj).d == null) {
                zv1.c.set(claimReusableCancellableContinuation$kotlinx_coroutines_core, 536870911);
                atomicReferenceFieldUpdater.set(claimReusableCancellableContinuation$kotlinx_coroutines_core, s7.a);
            } else {
                claimReusableCancellableContinuation$kotlinx_coroutines_core.h();
                claimReusableCancellableContinuation$kotlinx_coroutines_core = null;
            }
            if (claimReusableCancellableContinuation$kotlinx_coroutines_core != null) {
                return claimReusableCancellableContinuation$kotlinx_coroutines_core;
            }
        }
        return new zv1(2, continuation);
    }

    public static final void p(rr3 rr3) {
        Activity activity = rr3.getActivity();
        if (activity != null) {
            q(activity);
        }
    }

    public static final void q(Activity activity) {
        View currentFocus;
        if (activity != null && (currentFocus = activity.getWindow().getCurrentFocus()) != null) {
            currentFocus.clearFocus();
            try {
                ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            } catch (Throwable unused) {
            }
        }
    }

    public static final void r(View view) {
        if (view != null) {
            Context context = view.getContext();
            view.clearFocus();
            try {
                ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            } catch (Throwable unused) {
            }
        }
    }

    public static final void s(yv1 yv1, pv1 pv1) {
        if (yv1 instanceof zv1) {
            ((zv1) yv1).p(pv1);
            return;
        }
        throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
    }

    public static boolean t(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static final boolean u(String str) {
        return p0e.Q(str, "mailto:", false);
    }

    public static final boolean v(String str) {
        return p0e.Q(str, "tel:", false);
    }

    public static final void w(Context context) {
        LinkedHashMap linkedHashMap;
        String str;
        if (context.getDatabasePath("androidx.work.workdb").exists()) {
            a24.B().t(ysf.a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath = context.getDatabasePath("androidx.work.workdb");
            File file = new File(qk.a.a(context), "androidx.work.workdb");
            String[] strArr = ysf.b;
            int S = ju7.S(strArr.length);
            if (S < 16) {
                S = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(S);
            for (String str2 : strArr) {
                linkedHashMap2.put(new File(databasePath.getPath() + str2), new File(file.getPath() + str2));
            }
            if (linkedHashMap2.isEmpty()) {
                linkedHashMap = Collections.singletonMap(databasePath, file);
            } else {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
                linkedHashMap3.put(databasePath, file);
                linkedHashMap = linkedHashMap3;
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        a24.B().k0(ysf.a, "Over-writing contents of " + file3);
                    }
                    if (file2.renameTo(file3)) {
                        str = "Migrated " + file2 + "to " + file3;
                    } else {
                        str = "Renaming " + file2 + " to " + file3 + " failed";
                    }
                    a24.B().t(ysf.a, str);
                }
            }
        }
    }

    public static final void x(r57 r57, syc syc) {
        if (hhd.f(syc.e(), t0e.f)) {
            r57.a.getClass();
        }
    }

    public static void z(Throwable th) {
        Class<Error> cls = Error.class;
        if (!cls.isInstance(th)) {
            Class<RuntimeException> cls2 = RuntimeException.class;
            if (!cls2.isInstance(th)) {
                throw new RuntimeException(th);
            }
            throw cls2.cast(th);
        }
        throw cls.cast(th);
    }

    public abstract void G(Object obj, float f);

    public abstract zb5 g(ah0 ah0, z4b z4b);

    public abstract void i(zb5 zb5, afc afc);

    public abstract HashMap k(zb5 zb5, int i);

    public abstract float o(Object obj);

    public abstract void y(zb5 zb5);
}
