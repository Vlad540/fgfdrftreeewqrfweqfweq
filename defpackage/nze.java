package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* renamed from: nze  reason: default package */
public abstract class nze {
    public static final byte[] a;
    public static final ye6 b = z3d.H(new String[0]);
    public static final f1c c;
    public static final gga d;
    public static final TimeZone e = TimeZone.getTimeZone("GMT");
    public static final p7c f = new p7c("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    public static final String g = h0e.l0(h0e.k0(qw9.class.getName(), "okhttp3."), "Client");

    /* JADX WARNING: type inference failed for: r2v2, types: [wr0, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v0, types: [wr0, java.lang.Object] */
    static {
        int i;
        int i2 = 0;
        byte[] bArr = new byte[0];
        a = bArr;
        ? obj = new Object();
        obj.write(bArr, 0, 0);
        c = new f1c((wr0) obj, (lg8) null, (long) 0);
        oa2.A(bArr, (lg8) null, 7);
        uu0[] uu0Arr = {s59.a("efbbbf"), s59.a("feff"), s59.a("fffe"), s59.a("0000ffff"), s59.a("ffff0000")};
        ArrayList arrayList = new ArrayList(new kr(uu0Arr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(5);
        for (int i3 = 0; i3 < 5; i3++) {
            uu0 uu0 = uu0Arr[i3];
            arrayList2.add(-1);
        }
        Object[] array = arrayList2.toArray(new Integer[0]);
        if (array != null) {
            Integer[] numArr = (Integer[]) array;
            ArrayList C = p23.C((Integer[]) Arrays.copyOf(numArr, numArr.length));
            int i4 = 0;
            int i5 = 0;
            while (i4 < 5) {
                uu0 uu02 = uu0Arr[i4];
                int i6 = i5 + 1;
                int size = arrayList.size();
                p23.E(arrayList.size(), 0, size);
                int i7 = size - 1;
                int i8 = 0;
                while (true) {
                    if (i8 > i7) {
                        i = -(i8 + 1);
                        break;
                    }
                    i = (i8 + i7) >>> 1;
                    int f2 = gp0.f((Comparable) arrayList.get(i), uu02);
                    if (f2 >= 0) {
                        if (f2 <= 0) {
                            break;
                        }
                        i7 = i - 1;
                    } else {
                        i8 = i + 1;
                    }
                }
                C.set(i, Integer.valueOf(i5));
                i4++;
                i5 = i6;
            }
            if (((uu0) arrayList.get(0)).c() > 0) {
                int i9 = 0;
                while (i9 < arrayList.size()) {
                    uu0 uu03 = (uu0) arrayList.get(i9);
                    int i10 = i9 + 1;
                    int i11 = i10;
                    while (i11 < arrayList.size()) {
                        uu0 uu04 = (uu0) arrayList.get(i11);
                        uu04.getClass();
                        if (!uu04.h(uu03.c(), uu03)) {
                            continue;
                            break;
                        } else if (uu04.c() == uu03.c()) {
                            throw new IllegalArgumentException(("duplicate option: " + uu04).toString());
                        } else if (((Number) C.get(i11)).intValue() > ((Number) C.get(i9)).intValue()) {
                            arrayList.remove(i11);
                            C.remove(i11);
                        } else {
                            i11++;
                        }
                    }
                    i9 = i10;
                }
                ? obj2 = new Object();
                urd.f(0, obj2, 0, arrayList, 0, arrayList.size(), C);
                int[] iArr = new int[((int) (obj2.b / ((long) 4)))];
                while (!obj2.B()) {
                    iArr[i2] = obj2.readInt();
                    i2++;
                }
                d = new gga((uu0[]) Arrays.copyOf(uu0Arr, 5), iArr);
                return;
            }
            throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final boolean a(sm6 sm6, sm6 sm62) {
        return hhd.f(sm6.e, sm62.e) && sm6.f == sm62.f && hhd.f(sm6.b, sm62.b);
    }

    public static final int b(TimeUnit timeUnit) {
        if (timeUnit != null) {
            long millis = timeUnit.toMillis(10);
            if (millis > ((long) Integer.MAX_VALUE)) {
                throw new IllegalArgumentException("timeout".concat(" too large.").toString());
            } else if (millis != 0) {
                return (int) millis;
            } else {
                throw new IllegalArgumentException("timeout".concat(" too small.").toString());
            }
        } else {
            throw new IllegalStateException("unit == null".toString());
        }
    }

    public static final void c(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!hhd.f(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final int e(char c2, int i, int i2, String str) {
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int f(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (h0e.S(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int g(String str, char c2, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return e(c2, i, i2, str);
    }

    public static final String h(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final boolean i(String[] strArr, String[] strArr2, Comparator comparator) {
        if (!(strArr.length == 0 || strArr2 == null || strArr2.length == 0)) {
            for (String str : strArr) {
                for (String compare : strArr2) {
                    if (comparator.compare(str, compare) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long j(xbc xbc) {
        String a2 = xbc.Y.a("Content-Length");
        if (a2 == null) {
            return -1;
        }
        try {
            return Long.parseLong(a2);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static final List k(Object... objArr) {
        Object[] objArr2 = (Object[]) objArr.clone();
        return Collections.unmodifiableList(p23.B(Arrays.copyOf(objArr2, objArr2.length)));
    }

    public static final int l(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (hhd.o(charAt, 31) <= 0 || hhd.o(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int m(int i, int i2, String str) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int n(int i, int i2, String str) {
        int i3 = i2 - 1;
        if (i3 >= i) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt == 9 || charAt == 10 || charAt == 12 || charAt == 13 || charAt == ' ') {
                    if (i3 == i) {
                        break;
                    }
                    i3--;
                } else {
                    return i3 + 1;
                }
            }
        }
        return i;
    }

    public static final String[] o(String[] strArr, String[] strArr2, Comparator comparator) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final boolean p(String str) {
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int q(char c2) {
        if ('0' <= c2 && '9' >= c2) {
            return c2 - '0';
        }
        if ('a' <= c2 && 'f' >= c2) {
            return c2 - 'W';
        }
        if ('A' <= c2 && 'F' >= c2) {
            return c2 - '7';
        }
        return -1;
    }

    public static final Charset r(at0 at0, Charset charset) {
        Charset charset2;
        int d0 = at0.d0(d);
        if (d0 == -1) {
            return charset;
        }
        if (d0 == 0) {
            return StandardCharsets.UTF_8;
        }
        if (d0 == 1) {
            return StandardCharsets.UTF_16BE;
        }
        if (d0 == 2) {
            return StandardCharsets.UTF_16LE;
        }
        if (d0 == 3) {
            Charset charset3 = e22.a;
            charset2 = e22.d;
            if (charset2 == null) {
                charset2 = Charset.forName("UTF-32BE");
                e22.d = charset2;
            }
        } else if (d0 == 4) {
            Charset charset4 = e22.a;
            charset2 = e22.c;
            if (charset2 == null) {
                charset2 = Charset.forName("UTF-32LE");
                e22.c = charset2;
            }
        } else {
            throw new AssertionError();
        }
        return charset2;
    }

    public static final int s(at0 at0) {
        return (at0.readByte() & 255) | ((at0.readByte() & 255) << 16) | ((at0.readByte() & 255) << 8);
    }

    /* JADX WARNING: type inference failed for: r12v6, types: [wr0, java.lang.Object] */
    public static final boolean t(tld tld, int i, TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        long c2 = tld.p().e() ? tld.p().c() - nanoTime : Long.MAX_VALUE;
        tld.p().d(Math.min(c2, timeUnit.toNanos((long) i)) + nanoTime);
        try {
            ? obj = new Object();
            while (tld.c(obj, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                obj.m();
            }
            if (c2 == Long.MAX_VALUE) {
                tld.p().a();
            } else {
                tld.p().d(nanoTime + c2);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (c2 == Long.MAX_VALUE) {
                tld.p().a();
            } else {
                tld.p().d(nanoTime + c2);
            }
            return false;
        } catch (Throwable th) {
            if (c2 == Long.MAX_VALUE) {
                tld.p().a();
            } else {
                tld.p().d(nanoTime + c2);
            }
            throw th;
        }
    }

    public static final ye6 u(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            re6 re6 = (re6) it.next();
            String j = re6.b.j();
            String j2 = re6.c.j();
            arrayList.add(j);
            arrayList.add(h0e.B0(j2).toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return new ye6((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String v(defpackage.sm6 r3, boolean r4) {
        /*
            java.lang.String r0 = r3.e
            r1 = 0
            java.lang.String r2 = ":"
            boolean r1 = defpackage.h0e.R(r0, r2, r1)
            if (r1 == 0) goto L_0x001e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "["
            r1.<init>(r2)
            r1.append(r0)
            r0 = 93
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x001e:
            int r1 = r3.f
            if (r4 != 0) goto L_0x004c
            java.lang.String r3 = r3.b
            int r4 = r3.hashCode()
            r2 = 3213448(0x310888, float:4.503E-39)
            if (r4 == r2) goto L_0x003e
            r2 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r4 == r2) goto L_0x0033
            goto L_0x0049
        L_0x0033:
            java.lang.String r4 = "https"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0049
            r3 = 443(0x1bb, float:6.21E-43)
            goto L_0x004a
        L_0x003e:
            java.lang.String r4 = "http"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0049
            r3 = 80
            goto L_0x004a
        L_0x0049:
            r3 = -1
        L_0x004a:
            if (r1 == r3) goto L_0x0060
        L_0x004c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r4 = 58
            r3.append(r4)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
        L_0x0060:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nze.v(sm6, boolean):java.lang.String");
    }

    public static final List w(List list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static final int x(int i, String str) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > ((long) Integer.MAX_VALUE)) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public static final String y(int i, int i2, String str) {
        int m = m(i, i2, str);
        return str.substring(m, n(m, i2, str));
    }

    public static final void z(Exception exc, List list) {
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jjd.d(exc, (Exception) it.next());
        }
    }
}
