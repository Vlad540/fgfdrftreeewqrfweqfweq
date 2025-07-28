package defpackage;

import android.opengl.GLES20;
import android.opengl.GLU;
import android.view.View;
import com.google.android.gms.common.api.Status;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLSocket;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.ThreadContextKt;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: ete  reason: default package */
public abstract class ete {
    public static final x3a a = new x3a(28, (Object) "CRASH_FREE");
    public static final syc[] b = new syc[0];

    public static byte[] A(o10 o10) {
        a10 a10;
        if (o10.f()) {
            return o10.b.Y;
        }
        if (o10.i()) {
            return o10.d.j;
        }
        boolean J = J(o10);
        v00 v00 = o10.j;
        if (J) {
            return v00.d.b.Y;
        }
        if (L(o10)) {
            return v00.d.d.j;
        }
        if (!o10.g() || (a10 = o10.g.f) == null) {
            return null;
        }
        return a10.Y;
    }

    public static int B(o10 o10) {
        if (o10.f()) {
            return o10.b.c;
        }
        boolean J = J(o10);
        v00 v00 = o10.j;
        if (J) {
            return v00.d.b.c;
        }
        if (o10.i()) {
            return o10.d.e;
        }
        if (L(o10)) {
            return v00.d.d.e;
        }
        if (o10.h()) {
            return o10.f.c;
        }
        return 0;
    }

    public static String C(v00 v00) {
        int lastIndexOf;
        if (v00 == null) {
            return null;
        }
        String str = v00.c;
        if (!r1g.p(str) && (lastIndexOf = str.lastIndexOf(46)) != -1 && lastIndexOf < str.length()) {
            return str.substring(lastIndexOf + 1);
        }
        return null;
    }

    public static long D(byte b2, byte b3) {
        byte b4;
        byte b5 = b2 & 255;
        byte b6 = b2 & 3;
        if (b6 != 0) {
            b4 = 2;
            if (!(b6 == 1 || b6 == 2)) {
                b4 = b3 & 63;
            }
        } else {
            b4 = 1;
        }
        int i = b5 >> 3;
        int i2 = i & 3;
        return ((long) b4) * ((long) (i >= 16 ? 2500 << i2 : i >= 12 ? 10000 << (i & 1) : i2 == 3 ? 60000 : 10000 << i2));
    }

    public static void E(InputStream inputStream, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            s(inputStream, fileOutputStream);
            fileOutputStream.flush();
        } finally {
            o(inputStream);
            n(fileOutputStream);
        }
    }

    public static String F(InputStream inputStream) {
        StringWriter stringWriter = new StringWriter();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        char[] cArr = new char[20480];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (-1 == read) {
                return stringWriter.toString();
            }
            stringWriter.write(cArr, 0, read);
        }
    }

    public static boolean G(o10 o10) {
        if (o10 == null) {
            return false;
        }
        int ordinal = o10.a.ordinal();
        return ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? ordinal == 9 && o10.j.a == 0 : o10.e.a == 0 : o10.d.a == 0 : o10.b.w0 == 0;
    }

    public static boolean H(vo8 vo8) {
        if (!vo8.m()) {
            return false;
        }
        jj7 jj7 = vo8.D0;
        return jj7.u(0).a() && r1g.q(jj7.u(0).e.f);
    }

    public static final boolean I(int i) {
        return i == 1 || i == 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = j10.y0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r1 = (r3 = r3.j).d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean J(o10 r3) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x0021
            j10 r1 = j10.y0
            j10 r2 = r3.a
            if (r2 == r1) goto L_0x000a
            goto L_0x0021
        L_0x000a:
            v00 r3 = r3.j
            if (r3 == 0) goto L_0x0021
            o10 r1 = r3.d
            if (r1 == 0) goto L_0x0021
            boolean r1 = r1.f()
            if (r1 == 0) goto L_0x0021
            o10 r3 = r3.d
            a10 r3 = r3.b
            boolean r3 = r3.X
            if (r3 != 0) goto L_0x0021
            r0 = 1
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ete.J(o10):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r3 = (r3 = r3.b()).d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean K(m00 r3) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x001b
            j10 r1 = r3.a
            j10 r2 = j10.y0
            if (r1 == r2) goto L_0x000a
            goto L_0x001b
        L_0x000a:
            v00 r3 = r3.b()
            if (r3 == 0) goto L_0x001b
            o10 r3 = r3.d
            if (r3 == 0) goto L_0x001b
            boolean r3 = r3.i()
            if (r3 == 0) goto L_0x001b
            r0 = 1
        L_0x001b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ete.K(m00):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = j10.y0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r3 = (r3 = r3.j).d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean L(o10 r3) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x0019
            j10 r1 = j10.y0
            j10 r2 = r3.a
            if (r2 == r1) goto L_0x000a
            goto L_0x0019
        L_0x000a:
            v00 r3 = r3.j
            if (r3 == 0) goto L_0x0019
            o10 r3 = r3.d
            if (r3 == 0) goto L_0x0019
            boolean r3 = r3.i()
            if (r3 == 0) goto L_0x0019
            r0 = 1
        L_0x0019:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ete.L(o10):boolean");
    }

    public static final boolean M(byte b2) {
        byte b3 = b2 & 255;
        return b3 <= Byte.MAX_VALUE || b3 >= 224;
    }

    public static boolean N(int i, Object obj) {
        if (!(obj instanceof n26)) {
            return false;
        }
        return (obj instanceof v26 ? ((v26) obj).getArity() : obj instanceof s16 ? 0 : obj instanceof u16 ? 1 : obj instanceof i26 ? 2 : obj instanceof k26 ? 3 : obj instanceof m26 ? 4 : obj instanceof o26 ? 5 : obj instanceof p26 ? 6 : -1) == i;
    }

    public static boolean O(g2b g2b, n10 n10) {
        return n10 != null && n10.g && ((j2b) g2b).a.m() < n10.k;
    }

    public static boolean Q(o10 o10) {
        if (o10 == null) {
            return false;
        }
        g10 g10 = o10.n;
        if (!g10.d()) {
            return false;
        }
        if (L(o10)) {
            v00 v00 = o10.j;
            return v00 != null && v00.a == 0 && !g10.b();
        }
        n10 n10 = o10.d;
        return n10 != null && n10.a == 0 && !g10.b();
    }

    public static int R(Map map) {
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public static String S(Map map) {
        if (map.isEmpty()) {
            return "{}";
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        while (true) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            str.getClass();
            char c = 65535;
            switch (str.hashCode()) {
                case -2132092408:
                    if (str.equals("mt_instanceid")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1690743503:
                    if (str.equals("messageIds")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1291329255:
                    if (str.equals("events")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1033517562:
                    if (str.equals("verifyCode")) {
                        c = 3;
                        break;
                    }
                    break;
                case -989040443:
                    if (str.equals("phones")) {
                        c = 4;
                        break;
                    }
                    break;
                case -778929409:
                    if (str.equals("pushToken")) {
                        c = 5;
                        break;
                    }
                    break;
                case -738997328:
                    if (str.equals("attachments")) {
                        c = 6;
                        break;
                    }
                    break;
                case -567451565:
                    if (str.equals("contacts")) {
                        c = 7;
                        break;
                    }
                    break;
                case -8339209:
                    if (str.equals("elements")) {
                        c = 8;
                        break;
                    }
                    break;
                case 3556653:
                    if (str.equals("text")) {
                        c = 9;
                        break;
                    }
                    break;
                case 95844769:
                    if (str.equals("draft")) {
                        c = 10;
                        break;
                    }
                    break;
                case 110541305:
                    if (str.equals("token")) {
                        c = 11;
                        break;
                    }
                    break;
                case 139855480:
                    if (str.equals("contactIds")) {
                        c = 12;
                        break;
                    }
                    break;
                case 739093568:
                    if (str.equals("chatIds")) {
                        c = 13;
                        break;
                    }
                    break;
                case 831145840:
                    if (str.equals("configHash")) {
                        c = 14;
                        break;
                    }
                    break;
                case 954925063:
                    if (str.equals("message")) {
                        c = 15;
                        break;
                    }
                    break;
                case 1216985755:
                    if (str.equals("password")) {
                        c = 16;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 3:
                case 5:
                case 9:
                case 11:
                case 14:
                case 16:
                    cqc.Y.getClass();
                    value = "***";
                    break;
                case 1:
                case 12:
                case 13:
                    if (!(value instanceof Iterable)) {
                        if (value instanceof long[]) {
                            long[] jArr = (long[]) value;
                            if (!(jArr == null || jArr.length == 0)) {
                                value = cs.b0(jArr, ",", "[", "]", -1, "...", new xz6(8));
                                break;
                            }
                        }
                    } else {
                        Iterable iterable = (Iterable) value;
                        if (iterable != null) {
                            xz6 xz6 = new xz6(7);
                            StringBuilder sb2 = new StringBuilder();
                            o23.a0(iterable, sb2, ",", "[", "]", -1, "...", xz6);
                            value = sb2.toString();
                            break;
                        }
                    }
                    break;
                case 2:
                    value = "[]";
                    break;
                case 4:
                case 6:
                case 7:
                case 8:
                    if (!(value instanceof Collection)) {
                        if (!(value instanceof Map)) {
                            if (value instanceof long[]) {
                                value = Integer.valueOf(((long[]) value).length);
                                break;
                            }
                        } else {
                            value = Integer.valueOf(((Map) value).size());
                            break;
                        }
                    } else {
                        value = Integer.valueOf(((Collection) value).size());
                        break;
                    }
                    break;
                case 10:
                case 15:
                    if (value instanceof Map) {
                        value = S((Map) value);
                        break;
                    }
                    break;
            }
            sb.append(str);
            sb.append('=');
            sb.append(value);
            if (!it.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            sb.append(", ");
        }
    }

    public static boolean T(o10 o10, xm8 xm8) {
        v00 v00;
        o10 o102 = null;
        if (o10 != null) {
            if (!o10.f() && (o10.a != j10.y0 || (v00 = o10.j) == null || (o10 = v00.d) == null || !o10.f())) {
                o10 = null;
            }
            o102 = o10;
        }
        return o102 != null && o102.f() && o102.y && !o102.x && !xm8.b.Y;
    }

    public static yse U(yse yse, String[] strArr, Map map) {
        int i = 0;
        if (yse == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (yse) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                yse yse2 = new yse();
                int length = strArr.length;
                while (i < length) {
                    yse2.a((yse) map.get(strArr[i]));
                    i++;
                }
                return yse2;
            }
        } else if (strArr != null && strArr.length == 1) {
            yse.a((yse) map.get(strArr[0]));
            return yse;
        } else if (strArr != null && strArr.length > 1) {
            int length2 = strArr.length;
            while (i < length2) {
                yse.a((yse) map.get(strArr[i]));
                i++;
            }
        }
        return yse;
    }

    public static final void V(mi4 mi4, Continuation continuation, boolean z) {
        Object takeState$kotlinx_coroutines_core = mi4.takeState$kotlinx_coroutines_core();
        Throwable exceptionalResult$kotlinx_coroutines_core = mi4.getExceptionalResult$kotlinx_coroutines_core(takeState$kotlinx_coroutines_core);
        Object kcc = exceptionalResult$kotlinx_coroutines_core != null ? new kcc(exceptionalResult$kotlinx_coroutines_core) : mi4.getSuccessfulResult$kotlinx_coroutines_core(takeState$kotlinx_coroutines_core);
        if (z) {
            DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) continuation;
            Continuation<T> continuation2 = dispatchedContinuation.continuation;
            Object obj = dispatchedContinuation.countOrElement;
            hu3 context = continuation2.getContext();
            Object updateThreadContext = ThreadContextKt.updateThreadContext(context, obj);
            eue L = updateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS ? xie.L(continuation2, context, updateThreadContext) : null;
            try {
                dispatchedContinuation.continuation.resumeWith(kcc);
            } finally {
                if (L == null || L.H()) {
                    ThreadContextKt.restoreThreadContext(context, updateThreadContext);
                }
            }
        } else {
            continuation.resumeWith(kcc);
        }
    }

    public static qjb W(int i, int i2) {
        if (i2 > i) {
            int i3 = i2;
            i2 = i;
            i = i3;
        }
        for (qjb qjb : qjb.values()) {
            if (qjb.c == i && qjb.o == i2) {
                return qjb;
            }
        }
        for (qjb qjb2 : qjb.values()) {
            if (qjb2.o == i2) {
                return qjb2;
            }
        }
        for (qjb qjb3 : qjb.values()) {
            if (qjb3.o == i) {
                return qjb3;
            }
        }
        float f = (float) i;
        float f2 = f / ((float) i2);
        if (f2 > 1.7777778f) {
            for (qjb qjb4 : qjb.values()) {
                if (qjb4.c == i) {
                    return qjb4;
                }
            }
            int i4 = (int) (f / 1.7777778f);
            qjb qjb5 = null;
            try {
                qjb qjb6 = null;
                int i5 = -1;
                for (qjb qjb7 : qjb.values()) {
                    int abs = Math.abs(qjb7.o - i4);
                    if (i5 == -1 || abs < i5) {
                        qjb6 = qjb7;
                        i5 = abs;
                    }
                }
                qjb5 = qjb6;
            } catch (NumberFormatException e) {
                udd.s("ete", "Can't parse quality", e);
            }
            if (qjb5 != null) {
                return qjb5;
            }
        } else {
            for (qjb qjb8 : qjb.values()) {
                if (qjb8.o == i2) {
                    return qjb8;
                }
            }
        }
        if (f2 < 1.0f) {
            int i6 = i2;
            i2 = i;
            i = i6;
        }
        qjb qjb9 = qjb.z0;
        for (qjb qjb10 : qjb.values()) {
            if (qjb10.c <= i && qjb10.o <= i2) {
                return qjb10;
            }
        }
        return qjb9;
    }

    public static final void X(View view, zkc zkc) {
        view.setTag(iob.view_tree_saved_state_registry_owner, zkc);
    }

    public static void Y(Status status, Object obj, vde vde) {
        if (status.a <= 0) {
            vde.b(obj);
        } else {
            vde.a(e07.s(status));
        }
    }

    public static boolean Z(g2b g2b, n10 n10) {
        if (n10 == null || !n10.g) {
            return false;
        }
        return O(g2b, n10) || r1g.p(n10.d);
    }

    public static void a(int i, int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            new StringBuilder(str.length() + String.valueOf(GLES20.glGetShaderInfoLog(glCreateShader)).length() + 10);
        }
        GLES20.glAttachShader(i, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        k();
    }

    public static boolean a0(j2b j2b, o10 o10) {
        if (o10 == null) {
            return false;
        }
        return Z(j2b, L(o10) ? o10.j.d.d : o10.d);
    }

    public static final StackTraceElement b(Exception exc, String str) {
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        return new StackTraceElement("_COROUTINE.".concat(str), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }

    public static void b0(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(me4.i(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        hhd.O(classCastException, ete.class.getName());
        throw classCastException;
    }

    public static final String c(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            new ArrayList().add(BuildConfig.FLAVOR);
            if (bm3.J(smc.l(0, str, 0, 7, false)) != null) {
                return str;
            }
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        } catch (Throwable th) {
            udd.s("ServerPrefs", "validate host failure", th);
            str = null;
        }
    }

    public static boolean d(xm8 xm8, xm8 xm82) {
        if (xm8.a.m() != xm82.a.m()) {
            return true;
        }
        vo8 vo8 = xm8.a;
        boolean m = vo8.m();
        vo8 vo82 = xm82.a;
        if (!m && !vo82.m()) {
            return false;
        }
        List<o10> list = (List) vo8.D0.a;
        List list2 = (List) vo82.D0.a;
        if (list.size() != list2.size()) {
            return true;
        }
        Iterator it = list2.iterator();
        for (o10 o10 : list) {
            if (!r1g.c(o10.q, ((o10) it.next()).q)) {
                return true;
            }
        }
        return false;
    }

    public static List e(List list) {
        if (!(list instanceof z67) || (list instanceof b77)) {
            return list;
        }
        b0(list, "kotlin.collections.MutableList");
        throw null;
    }

    public static Map f(Map map) {
        if (!(map instanceof z67) || (map instanceof d77)) {
            return map;
        }
        b0(map, "kotlin.collections.MutableMap");
        throw null;
    }

    public static void g(int i, Object obj) {
        if (obj != null && !N(i, obj)) {
            b0(obj, "kotlin.jvm.functions.Function" + i);
            throw null;
        }
    }

    public static ArrayList h(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) (((bArr[11] & 255) << 8) | (bArr[10] & 255))) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000).array());
        return arrayList;
    }

    public static final Set i(syc syc) {
        if (syc instanceof gw0) {
            return ((gw0) syc).b();
        }
        HashSet hashSet = new HashSet(syc.f());
        int f = syc.f();
        for (int i = 0; i < f; i++) {
            hashSet.add(syc.g(i));
        }
        return hashSet;
    }

    public static void j(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        } else if (obj2 == null) {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
    }

    public static void k() {
        int i = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            String valueOf = String.valueOf(GLU.gluErrorString(glGetError));
            if (valueOf.length() != 0) {
                "glError: ".concat(valueOf);
            }
            i = glGetError;
        }
        if (i != 0) {
            String valueOf2 = String.valueOf(GLU.gluErrorString(i));
            if (valueOf2.length() != 0) {
                "glError: ".concat(valueOf2);
            }
        }
    }

    public static void l(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
        }
    }

    public static void m(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder i4 = rf0.i("fromIndex: ", i, ", toIndex: ", i2, ", size: ");
            i4.append(i3);
            throw new IndexOutOfBoundsException(i4.toString());
        } else if (i > i2) {
            throw new IllegalArgumentException(me4.g("fromIndex: ", i, i2, " > toIndex: "));
        }
    }

    public static void n(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void o(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int p(Collection collection) {
        if (collection == null) {
            return 0;
        }
        return collection.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        r1 = (defpackage.syc[]) r1.toArray(new defpackage.syc[0]);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.syc[] q(java.util.List r1) {
        /*
            if (r1 == 0) goto L_0x0008
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0009
        L_0x0008:
            r1 = 0
        L_0x0009:
            if (r1 == 0) goto L_0x0016
            r0 = 0
            syc[] r0 = new defpackage.syc[r0]
            java.lang.Object[] r1 = r1.toArray(r0)
            syc[] r1 = (defpackage.syc[]) r1
            if (r1 != 0) goto L_0x0018
        L_0x0016:
            syc[] r1 = b
        L_0x0018:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ete.q(java.util.List):syc[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void r(java.io.File r9, java.io.File r10) {
        /*
            boolean r0 = r10.exists()
            if (r0 != 0) goto L_0x0009
            r10.createNewFile()
        L_0x0009:
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0033 }
            r1.<init>(r9)     // Catch:{ all -> 0x0033 }
            java.nio.channels.FileChannel r9 = r1.getChannel()     // Catch:{ all -> 0x0033 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x002e }
            r1.<init>(r10)     // Catch:{ all -> 0x002e }
            java.nio.channels.FileChannel r0 = r1.getChannel()     // Catch:{ all -> 0x002e }
            long r6 = r9.size()     // Catch:{ all -> 0x002e }
            r4 = 0
            r2 = r0
            r3 = r9
            r2.transferFrom(r3, r4, r6)     // Catch:{ all -> 0x002e }
            r9.close()
            r0.close()
            return
        L_0x002e:
            r10 = move-exception
            r8 = r0
            r0 = r9
            r9 = r8
            goto L_0x0035
        L_0x0033:
            r10 = move-exception
            r9 = r0
        L_0x0035:
            if (r0 == 0) goto L_0x003a
            r0.close()
        L_0x003a:
            if (r9 == 0) goto L_0x003f
            r9.close()
        L_0x003f:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ete.r(java.io.File, java.io.File):void");
    }

    public static long s(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[20480];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    public static final List t() {
        return p23.B(new t07(s07.c, new hge(v5a.f), Integer.valueOf(phc.e1)), new t07(s07.b, new hge(v5a.l), Integer.valueOf(phc.M1)), new t07(s07.a, new hge(v5a.g), Integer.valueOf(phc.c0)));
    }

    public static boolean u(o10 o10) {
        if (L(o10)) {
            o10 = o10.j.d;
        }
        n10 n10 = o10.d;
        return n10 != null && !n10.g && n10.c > 0 && n10.k > 0;
    }

    public static String v(SSLSocket sSLSocket, String str) {
        try {
            Certificate[] peerCertificates = sSLSocket.getSession().getPeerCertificates();
            int length = peerCertificates.length;
            StringBuilder sb = new StringBuilder("host=" + str + ", certificates(" + length + ")=\n");
            int length2 = peerCertificates.length;
            int i = 0;
            int i2 = 0;
            while (i < length2) {
                Certificate certificate = peerCertificates[i];
                sb.append("#" + i2 + " " + certificate + "\n");
                i++;
                i2++;
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "failed to retrieve certificates, host=".concat(str);
        }
    }

    public static boolean w(String str, String str2) {
        return !r1g.p(str) && !r1g.p(str2) && r1g.c(str, str2);
    }

    public static o10 x(vo8 vo8, String str) {
        if (vo8 == null || !vo8.m()) {
            return null;
        }
        int i = 0;
        while (true) {
            jj7 jj7 = vo8.D0;
            if (i >= jj7.v()) {
                return null;
            }
            o10 u = jj7.u(i);
            if (r1g.c(u.q, str)) {
                return u;
            }
            i++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:128:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0229 A[SYNTHETIC, Splitter:B:135:0x0229] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0206 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ce A[SYNTHETIC, Splitter:B:59:0x00ce] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00e2 A[SYNTHETIC, Splitter:B:68:0x00e2] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00ed A[SYNTHETIC, Splitter:B:73:0x00ed] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList y(android.net.Uri r30, android.content.Context r31, xh0 r32) {
        /*
            r1 = 1
            java.lang.String r2 = "ete"
            java.lang.String r3 = "fail to release"
            r4 = 0
            r5 = 0
            android.media.MediaMetadataRetriever r6 = new android.media.MediaMetadataRetriever     // Catch:{ IllegalArgumentException -> 0x00c3, RuntimeException -> 0x00be, all -> 0x00ba }
            r6.<init>()     // Catch:{ IllegalArgumentException -> 0x00c3, RuntimeException -> 0x00be, all -> 0x00ba }
            r7 = r30
            r0 = r31
            r6.setDataSource(r0, r7)     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
            r0 = 12
            java.lang.String r0 = r6.extractMetadata(r0)     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
            r8 = 18
            java.lang.String r8 = r6.extractMetadata(r8)     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
            r9 = 19
            java.lang.String r9 = r6.extractMetadata(r9)     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
            r10 = 20
            java.lang.String r10 = r6.extractMetadata(r10)     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
            r11 = 24
            java.lang.String r11 = r6.extractMetadata(r11)     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
            if (r11 == 0) goto L_0x0041
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
            goto L_0x0042
        L_0x0038:
            r0 = move-exception
            r1 = r2
            r4 = r6
        L_0x003b:
            r2 = r0
            goto L_0x0227
        L_0x003e:
            r0 = move-exception
            goto L_0x00c5
        L_0x0041:
            r11 = r5
        L_0x0042:
            if (r8 == 0) goto L_0x00af
            if (r9 != 0) goto L_0x0048
            goto L_0x00af
        L_0x0048:
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
            int r11 = r11 % 180
            r12 = 90
            if (r11 != r12) goto L_0x0059
            r15 = r8
            r14 = r9
            goto L_0x005b
        L_0x0059:
            r14 = r8
            r15 = r9
        L_0x005b:
            if (r10 == 0) goto L_0x0068
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
            int r8 = r8.intValue()     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
            r16 = r8
            goto L_0x006a
        L_0x0068:
            r16 = r5
        L_0x006a:
            java.lang.String r8 = r30.toString()     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
            r9 = r32
            eq3 r8 = r9.c(r8)     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
            if (r8 == 0) goto L_0x007b
            long r8 = r8.b     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
        L_0x0078:
            r17 = r8
            goto L_0x007e
        L_0x007b:
            r8 = 0
            goto L_0x0078
        L_0x007e:
            r8 = 11
            int[] r8 = defpackage.hr1.w(r8)     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
            int r9 = r8.length     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
            r10 = r5
        L_0x0086:
            if (r10 >= r9) goto L_0x0097
            r11 = r8[r10]     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
            java.lang.String r12 = us8.f(r11)     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
            boolean r12 = r12.equalsIgnoreCase(r0)     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
            if (r12 == 0) goto L_0x0095
            goto L_0x0098
        L_0x0095:
            int r10 = r10 + r1
            goto L_0x0086
        L_0x0097:
            r11 = r5
        L_0x0098:
            if (r11 != 0) goto L_0x009d
            r19 = r1
            goto L_0x009f
        L_0x009d:
            r19 = r11
        L_0x009f:
            sjb r8 = new sjb     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
            r13 = r8
            r13.<init>(r14, r15, r16, r17, r19)     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
            r6.release()     // Catch:{ all -> 0x00a9 }
            goto L_0x00e9
        L_0x00a9:
            r0 = move-exception
            r6 = r0
            defpackage.udd.s(r2, r3, r6)
            goto L_0x00e9
        L_0x00af:
            r6.release()     // Catch:{ all -> 0x00b3 }
            goto L_0x00b8
        L_0x00b3:
            r0 = move-exception
            r6 = r0
        L_0x00b5:
            defpackage.udd.s(r2, r3, r6)
        L_0x00b8:
            r8 = r4
            goto L_0x00e9
        L_0x00ba:
            r0 = move-exception
            r1 = r2
            goto L_0x003b
        L_0x00be:
            r0 = move-exception
            r7 = r30
            r6 = r4
            goto L_0x00c5
        L_0x00c3:
            r6 = r4
            goto L_0x00d5
        L_0x00c5:
            java.lang.String r7 = r30.toString()     // Catch:{ all -> 0x0038 }
            defpackage.udd.s(r2, r7, r0)     // Catch:{ all -> 0x0038 }
            if (r6 == 0) goto L_0x00b8
            r6.release()     // Catch:{ all -> 0x00d2 }
            goto L_0x00b8
        L_0x00d2:
            r0 = move-exception
            r6 = r0
            goto L_0x00b5
        L_0x00d5:
            java.lang.String r0 = "Could not get duration from video uri"
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x0224 }
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r5)     // Catch:{ all -> 0x0224 }
            defpackage.udd.R(r2, r4, r0, r7)     // Catch:{ all -> 0x0224 }
            if (r6 == 0) goto L_0x00b8
            r6.release()     // Catch:{ all -> 0x00e6 }
            goto L_0x00b8
        L_0x00e6:
            r0 = move-exception
            r6 = r0
            goto L_0x00b5
        L_0x00e9:
            if (r8 != 0) goto L_0x00ed
            goto L_0x0220
        L_0x00ed:
            int r0 = r8.e     // Catch:{ IOException -> 0x00fa, IllegalArgumentException -> 0x00f8, all -> 0x00f6 }
            r3 = 8
            if (r0 != r3) goto L_0x00fc
            java.lang.String r0 = "video/mp4v-es"
            goto L_0x0100
        L_0x00f6:
            r0 = move-exception
            goto L_0x010a
        L_0x00f8:
            r0 = move-exception
            goto L_0x010b
        L_0x00fa:
            r0 = move-exception
            goto L_0x0119
        L_0x00fc:
            java.lang.String r0 = us8.f(r0)     // Catch:{ IOException -> 0x00fa, IllegalArgumentException -> 0x00f8, all -> 0x00f6 }
        L_0x0100:
            android.media.MediaCodec r0 = android.media.MediaCodec.createDecoderByType(r0)     // Catch:{ IOException -> 0x00fa, IllegalArgumentException -> 0x00f8, all -> 0x00f6 }
            if (r0 == 0) goto L_0x0120
            r0.release()
            goto L_0x0120
        L_0x010a:
            throw r0
        L_0x010b:
            java.lang.String r1 = r0.getMessage()
            defpackage.udd.s(r2, r1, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            goto L_0x0220
        L_0x0119:
            java.lang.String r3 = r0.getMessage()
            defpackage.udd.o(r2, r3, r0)
        L_0x0120:
            int r0 = r8.a
            int r3 = r8.b
            qjb r0 = W(r0, r3)
            int r3 = r8.c
            int r6 = r0.X
            if (r3 == 0) goto L_0x012f
            goto L_0x0130
        L_0x012f:
            r3 = r6
        L_0x0130:
            float r7 = (float) r3
            float r6 = (float) r6
            float r6 = r7 / r6
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            int r9 = r8.a
            float r10 = (float) r9
            int r11 = r8.b
            float r12 = (float) r11
            float r10 = r10 / r12
            r12 = 1065353216(0x3f800000, float:1.0)
            int r13 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r13 >= 0) goto L_0x014f
            float r10 = r12 / r10
            r8.a = r11
            r8.b = r9
            r17 = r1
            goto L_0x0151
        L_0x014f:
            r17 = r5
        L_0x0151:
            r18 = 1120403456(0x42c80000, float:100.0)
            float r10 = r10 * r18
            int r9 = java.lang.Math.round(r10)
            float r9 = (float) r9
            float r19 = r9 / r18
            qjb[] r15 = qjb.values()
            int r13 = r15.length
        L_0x0161:
            if (r5 >= r13) goto L_0x0213
            r10 = r15[r5]
            int r9 = r10.c
            int r11 = r10.X
            float r11 = (float) r11
            float r11 = r11 * r6
            int r11 = (int) r11
            float r12 = (float) r9
            int r4 = r10.o
            float r1 = (float) r4
            float r16 = r12 / r1
            float r16 = r16 * r18
            r30 = r6
            int r6 = java.lang.Math.round(r16)
            float r6 = (float) r6
            float r6 = r6 / r18
            r31 = r14
            r32 = r15
            long r14 = r8.d
            r16 = r13
            float r13 = (float) r14
            r28 = r2
            float r2 = (float) r11
            float r2 = r7 / r2
            float r13 = r13 / r2
            r20 = r14
            long r13 = (long) r13
            int r2 = r8.a
            if (r9 > r2) goto L_0x0197
            int r2 = r8.b
            if (r4 <= r2) goto L_0x019f
        L_0x0197:
            if (r10 == r0) goto L_0x019f
            int r2 = r10.b
            int r15 = r0.b
            if (r2 <= r15) goto L_0x01cb
        L_0x019f:
            int r2 = (r19 > r6 ? 1 : (r19 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x01a4
            goto L_0x01ad
        L_0x01a4:
            if (r2 <= 0) goto L_0x01aa
            float r12 = r12 / r19
            int r4 = (int) r12
            goto L_0x01ad
        L_0x01aa:
            float r1 = r1 * r19
            int r9 = (int) r1
        L_0x01ad:
            if (r17 == 0) goto L_0x01b4
            r22 = r4
            r23 = r9
            goto L_0x01b8
        L_0x01b4:
            r23 = r4
            r22 = r9
        L_0x01b8:
            qjb r1 = qjb.Z
            if (r10 == r1) goto L_0x01d3
            qjb r1 = qjb.w0
            if (r10 == r1) goto L_0x01d3
            qjb r1 = qjb.x0
            if (r10 == r1) goto L_0x01d3
            qjb r1 = qjb.y0
            if (r10 == r1) goto L_0x01d3
            if (r10 != r0) goto L_0x01cb
            goto L_0x01d3
        L_0x01cb:
            r6 = r31
            r29 = r32
            r4 = r16
            r1 = 0
            goto L_0x0201
        L_0x01d3:
            if (r10 != r0) goto L_0x01ec
            rjb r1 = new rjb
            r2 = 1
            r9 = r1
            r11 = r22
            r12 = r23
            r4 = r16
            r13 = r3
            r6 = r31
            r29 = r32
            r14 = r20
            r16 = r2
            r9.<init>(r10, r11, r12, r13, r14, r16)
            goto L_0x0201
        L_0x01ec:
            r6 = r31
            r29 = r32
            r4 = r16
            rjb r1 = new rjb
            r27 = 0
            r20 = r1
            r21 = r10
            r24 = r11
            r25 = r13
            r20.<init>(r21, r22, r23, r24, r25, r27)
        L_0x0201:
            if (r1 == 0) goto L_0x0206
            r6.add(r1)
        L_0x0206:
            r1 = 1
            int r5 = r5 + r1
            r13 = r4
            r14 = r6
            r2 = r28
            r15 = r29
            r4 = 0
            r6 = r30
            goto L_0x0161
        L_0x0213:
            r28 = r2
            r6 = r14
            java.lang.String r0 = r6.toString()
            r1 = r28
            defpackage.udd.p(r1, r0, new java.lang.Object[0])
            r4 = r6
        L_0x0220:
            return r4
        L_0x0221:
            r2 = r0
            r4 = r6
            goto L_0x0227
        L_0x0224:
            r0 = move-exception
            r1 = r2
            goto L_0x0221
        L_0x0227:
            if (r4 == 0) goto L_0x0232
            r4.release()     // Catch:{ all -> 0x022d }
            goto L_0x0232
        L_0x022d:
            r0 = move-exception
            r4 = r0
            defpackage.udd.s(r1, r3, r4)
        L_0x0232:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ete.y(android.net.Uri, android.content.Context, xh0):java.util.ArrayList");
    }

    public static int z(o10 o10) {
        if (o10.f()) {
            return o10.b.o;
        }
        boolean J = J(o10);
        v00 v00 = o10.j;
        if (J) {
            return v00.d.b.o;
        }
        if (o10.i()) {
            return o10.d.f;
        }
        if (L(o10)) {
            return v00.d.d.f;
        }
        if (o10.h()) {
            return o10.f.d;
        }
        return 0;
    }

    public boolean P() {
        return false;
    }
}
