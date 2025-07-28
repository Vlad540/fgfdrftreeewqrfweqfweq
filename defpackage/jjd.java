package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import org.msgpack.core.MessageIntegerOverflowException;
import org.msgpack.core.buffer.OutputStreamBufferOutput;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: jjd  reason: default package */
public final class jjd implements ljd {
    public static boolean b;
    public static final int[] c = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] d = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] e = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final dr9 f = new dr9(13);
    public static final String[] g = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] h = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] i = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};
    public final /* synthetic */ int a;

    public static e8c A(XmlPullParser xmlPullParser, String str, String str2) {
        ts6 i2 = ws6.i();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (xy6.y(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String p = xy6.p(xmlPullParser, concat3);
                String p2 = xy6.p(xmlPullParser, concat4);
                String p3 = xy6.p(xmlPullParser, concat5);
                String p4 = xy6.p(xmlPullParser, concat6);
                if (p == null || p2 == null) {
                    return e8c.X;
                }
                i2.a(new m69(p3 != null ? Long.parseLong(p3) : 0, p, p4 != null ? Long.parseLong(p4) : 0));
            }
        } while (!xy6.v(xmlPullParser, concat2));
        return i2.j();
    }

    public static Object B(uze uze) {
        switch (hr1.t(uze.e())) {
            case 0:
                return null;
            case 1:
                return Boolean.valueOf(((ks6) uze).a);
            case 2:
                return Long.valueOf(uze.f().i());
            case 3:
                return Float.valueOf((float) ((os6) uze).a);
            case 4:
                return uze.m().y();
            case 5:
                return ByteBuffer.wrap(uze.o().a).asReadOnlyBuffer();
            case 6:
                es6 c2 = uze.c();
                ArrayList arrayList = new ArrayList(r0);
                for (uze B : c2.a) {
                    arrayList.add(B(B));
                }
                return arrayList;
            case 7:
                ct6 g2 = uze.g();
                HashMap hashMap = new HashMap(g2.a.length / 2);
                ds6 it = new tr(g2.a).iterator();
                while (true) {
                    ds6 ds6 = it;
                    if (!ds6.hasNext()) {
                        return hashMap;
                    }
                    Map.Entry entry = (Map.Entry) ds6.next();
                    hashMap.put(B((uze) entry.getKey()), B((uze) entry.getValue()));
                }
            default:
                throw new RuntimeException(wn6.i("Type ", sxe.r(uze.e()), " isn't yet implemented"));
        }
    }

    public static final Activity C(sgc sgc) {
        Activity d2 = sgc.d();
        if (d2 != null) {
            return d2;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static int D(ws8 ws8) {
        if (ws8.n().a() == 7) {
            return ws8.s0();
        }
        ws8.z();
        return 0;
    }

    public static boolean E(ws8 ws8) {
        Boolean bool = Boolean.FALSE;
        if (ws8.n().a() == 2) {
            bool = Boolean.valueOf(ws8.u0());
        } else {
            ws8.z();
        }
        return bool.booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        r6 = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        r0 = (byte) r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Byte F(ws8 r6) {
        /*
            r0 = 0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            sp8 r1 = r6.n()
            int r1 = r1.a()
            r2 = 3
            if (r1 != r2) goto L_0x00c7
            byte r0 = r6.readByte()
            boolean r1 = defpackage.ete.M(r0)
            if (r1 == 0) goto L_0x001c
            goto L_0x00b5
        L_0x001c:
            r1 = -128(0xffffffffffffff80, float:NaN)
            r2 = 127(0x7f, double:6.27E-322)
            r4 = 127(0x7f, float:1.78E-43)
            switch(r0) {
                case -52: goto L_0x00af;
                case -51: goto L_0x0097;
                case -50: goto L_0x0089;
                case -49: goto L_0x0075;
                case -48: goto L_0x0070;
                case -47: goto L_0x005c;
                case -46: goto L_0x0048;
                case -45: goto L_0x002c;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.String r6 = "Integer"
            org.msgpack.core.MessagePackException r6 = ws8.r0(r6, r0)
            throw r6
        L_0x002c:
            long r0 = r6.readLong()
            r4 = -128(0xffffffffffffff80, double:NaN)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x003e
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 > 0) goto L_0x003e
        L_0x003a:
            int r6 = (int) r0
        L_0x003b:
            byte r0 = (byte) r6
            goto L_0x00b5
        L_0x003e:
            java.math.BigInteger r6 = java.math.BigInteger.valueOf(r0)
            org.msgpack.core.MessageIntegerOverflowException r0 = new org.msgpack.core.MessageIntegerOverflowException
            r0.<init>(r6)
            throw r0
        L_0x0048:
            int r6 = r6.readInt()
            if (r6 < r1) goto L_0x0051
            if (r6 > r4) goto L_0x0051
        L_0x0050:
            goto L_0x003b
        L_0x0051:
            long r0 = (long) r6
            java.math.BigInteger r6 = java.math.BigInteger.valueOf(r0)
            org.msgpack.core.MessageIntegerOverflowException r0 = new org.msgpack.core.MessageIntegerOverflowException
            r0.<init>(r6)
            throw r0
        L_0x005c:
            short r6 = r6.readShort()
            if (r6 < r1) goto L_0x0065
            if (r6 > r4) goto L_0x0065
            goto L_0x0050
        L_0x0065:
            long r0 = (long) r6
            java.math.BigInteger r6 = java.math.BigInteger.valueOf(r0)
            org.msgpack.core.MessageIntegerOverflowException r0 = new org.msgpack.core.MessageIntegerOverflowException
            r0.<init>(r6)
            throw r0
        L_0x0070:
            byte r0 = r6.readByte()
            goto L_0x00b5
        L_0x0075:
            long r0 = r6.readLong()
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0084
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 > 0) goto L_0x0084
            goto L_0x003a
        L_0x0084:
            org.msgpack.core.MessageIntegerOverflowException r6 = ws8.e0(r0)
            throw r6
        L_0x0089:
            int r6 = r6.readInt()
            if (r6 < 0) goto L_0x0092
            if (r6 > r4) goto L_0x0092
            goto L_0x0050
        L_0x0092:
            org.msgpack.core.MessageIntegerOverflowException r6 = ws8.U(r6)
            throw r6
        L_0x0097:
            short r6 = r6.readShort()
            if (r6 < 0) goto L_0x00a0
            if (r6 > r4) goto L_0x00a0
            goto L_0x0050
        L_0x00a0:
            r0 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r0
            long r0 = (long) r6
            java.math.BigInteger r6 = java.math.BigInteger.valueOf(r0)
            org.msgpack.core.MessageIntegerOverflowException r0 = new org.msgpack.core.MessageIntegerOverflowException
            r0.<init>(r6)
            throw r0
        L_0x00af:
            byte r0 = r6.readByte()
            if (r0 < 0) goto L_0x00ba
        L_0x00b5:
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            goto L_0x00ca
        L_0x00ba:
            r6 = r0 & 255(0xff, float:3.57E-43)
            long r0 = (long) r6
            java.math.BigInteger r6 = java.math.BigInteger.valueOf(r0)
            org.msgpack.core.MessageIntegerOverflowException r0 = new org.msgpack.core.MessageIntegerOverflowException
            r0.<init>(r6)
            throw r0
        L_0x00c7:
            r6.z()
        L_0x00ca:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jjd.F(ws8):java.lang.Byte");
    }

    public static Double G(ws8 ws8, Double d2) {
        double d3;
        if (ws8.n().a() == 4) {
            byte readByte = ws8.readByte();
            if (readByte == -54) {
                d3 = (double) ws8.m0(4).getFloat(ws8.z0);
            } else if (readByte == -53) {
                d3 = ws8.m0(8).getDouble(ws8.z0);
            } else {
                throw ws8.r0("Float", readByte);
            }
            return Double.valueOf(d3);
        }
        ws8.z();
        return d2;
    }

    public static Float H(ws8 ws8, Float f2) {
        float f3;
        if (ws8.n().a() == 4) {
            byte readByte = ws8.readByte();
            if (readByte == -54) {
                f3 = ws8.m0(4).getFloat(ws8.z0);
            } else if (readByte == -53) {
                f3 = (float) ws8.m0(8).getDouble(ws8.z0);
            } else {
                throw ws8.r0("Float", readByte);
            }
            return Float.valueOf(f3);
        }
        ws8.z();
        return f2;
    }

    public static int I(ws8 ws8) {
        Integer num = 0;
        if (ws8.n().a() == 3) {
            num = Integer.valueOf(ws8.v0());
        } else {
            ws8.z();
        }
        return num.intValue();
    }

    public static long J(ws8 ws8, long j) {
        if (ws8.n().a() == 3) {
            return ws8.w0();
        }
        ws8.z();
        return j;
    }

    public static int K(ws8 ws8) {
        if (ws8.n().a() == 8) {
            return ws8.x0();
        }
        ws8.z();
        return 0;
    }

    public static short L(ws8 ws8) {
        int readByte;
        long readLong;
        if (ws8.n().a() == 3) {
            byte readByte2 = ws8.readByte();
            if (ete.M(readByte2)) {
                return (short) readByte2;
            }
            switch (readByte2) {
                case -52:
                    readByte = ws8.readByte() & 255;
                    break;
                case -51:
                    short readShort = ws8.readShort();
                    if (readShort >= 0) {
                        return readShort;
                    }
                    throw new MessageIntegerOverflowException(BigInteger.valueOf((long) (readShort & 65535)));
                case -50:
                    readByte = ws8.readInt();
                    if (readByte < 0 || readByte > 32767) {
                        throw ws8.U(readByte);
                    }
                case -49:
                    readLong = ws8.readLong();
                    if (readLong < 0 || readLong > 32767) {
                        throw ws8.e0(readLong);
                    }
                case -48:
                    readByte = ws8.readByte();
                    break;
                case -47:
                    return ws8.readShort();
                case -46:
                    readByte = ws8.readInt();
                    if (readByte < -32768 || readByte > 32767) {
                        throw new MessageIntegerOverflowException(BigInteger.valueOf((long) readByte));
                    }
                case -45:
                    readLong = ws8.readLong();
                    if (readLong < -32768 || readLong > 32767) {
                        throw new MessageIntegerOverflowException(BigInteger.valueOf(readLong));
                    }
                default:
                    throw ws8.r0("Integer", readByte2);
            }
            readByte = (int) readLong;
            return (short) readByte;
        }
        ws8.z();
        return 0;
    }

    public static String M(ws8 ws8) {
        if (ws8.n().a() == 5) {
            return ws8.z0();
        }
        ws8.z();
        return null;
    }

    public static String N(ws8 ws8, String str) {
        if (ws8.n().a() == 5) {
            return ws8.z0();
        }
        ws8.z();
        return str;
    }

    public static void O(Map map, ByteArrayOutputStream byteArrayOutputStream) {
        jr8 jr8 = lr8.b;
        mr8 mr8 = new mr8(new OutputStreamBufferOutput(byteArrayOutputStream, jr8.c), jr8);
        try {
            mr8.o(map.size());
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                mr8.U(str);
                y(mr8, obj);
            }
        } finally {
            mr8.close();
        }
    }

    public static void P(CharSequence charSequence, Widget widget) {
        k77[] k77Arr = BottomSheetWidget.B0;
        jge jge = new jge(f5a.a, cs.g0(new Object[]{charSequence}));
        sgc sgc = null;
        jc3 a2 = a24.a(jge, (Bundle) null, 6);
        a2.f(new hge(f5a.f));
        a2.b(d5a.c, new hge(f5a.e));
        a2.d(d5a.b, new hge(f5a.d));
        a2.a.putBoolean("memorize_keyboard", false);
        ConfirmationBottomSheet e2 = a2.e();
        e2.setTargetController(widget);
        Widget widget2 = widget;
        while (widget2.getParentController() != null) {
            widget2 = widget2.getParentController();
        }
        ygc ygc = widget2 instanceof ygc ? (ygc) widget2 : null;
        if (ygc != null) {
            sgc = ygc.S();
        }
        e2.y0(widget);
        if (sgc != null) {
            vgc vgc = new vgc(e2, (String) null, (wr3) null, (wr3) null, false, -1);
            rf0.k(false, vgc, true, "BottomSheetWidget");
            sgc.G(vgc);
        }
    }

    public static String Q(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    public static String R(int i2) {
        return rf0.f(i2, "ProfileEditItemId(value=", ")");
    }

    public static AbstractList S(e26 e26, List list) {
        return list instanceof RandomAccess ? new th7(e26, list) : new uh7(e26, list);
    }

    public static ArrayList T(ws8 ws8, x89 x89) {
        if (ws8.n().a() == 7) {
            ArrayList arrayList = new ArrayList();
            int s0 = ws8.s0();
            for (int i2 = 0; i2 < s0; i2++) {
                arrayList.add(x89.f(ws8));
            }
            return arrayList;
        }
        ws8.z();
        return null;
    }

    public static Set U(ws8 ws8, x89 x89) {
        if (ws8.n().a() == 7) {
            int s0 = ws8.s0();
            HashSet hashSet = new HashSet(s0);
            for (int i2 = 0; i2 < s0; i2++) {
                hashSet.add(x89.f(ws8));
            }
            return hashSet;
        }
        ws8.z();
        return Collections.emptySet();
    }

    public static long V(ws8 ws8) {
        if (ws8.n().a() == 3) {
            return ws8.w0();
        }
        ws8.z();
        sp8 n = ws8.n();
        throw new IllegalArgumentException("invalid type " + n);
    }

    public static byte W(Boolean bool) {
        if (bool != null) {
            return !bool.booleanValue() ? (byte) 0 : 1;
        }
        return -1;
    }

    public static Boolean X(byte b2) {
        if (b2 == 0) {
            return Boolean.FALSE;
        }
        if (b2 != 1) {
            return null;
        }
        return Boolean.TRUE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        defpackage.urd.l(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        throw r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(java.io.File r3, java.util.List r4) {
        /*
            java.nio.charset.Charset r0 = defpackage.e22.a
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r3)
            r1.<init>(r2, r0)
            java.util.Iterator r3 = r4.iterator()     // Catch:{ all -> 0x0025 }
        L_0x0010:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0025 }
            if (r4 == 0) goto L_0x0027
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0025 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0025 }
            r1.write(r4)     // Catch:{ all -> 0x0025 }
            r4 = 10
            r1.write(r4)     // Catch:{ all -> 0x0025 }
            goto L_0x0010
        L_0x0025:
            r3 = move-exception
            goto L_0x002c
        L_0x0027:
            r3 = 0
            defpackage.urd.l(r1, r3)
            return
        L_0x002c:
            throw r3     // Catch:{ all -> 0x002d }
        L_0x002d:
            r4 = move-exception
            defpackage.urd.l(r1, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jjd.c(java.io.File, java.util.List):void");
    }

    public static void d(Throwable th, Throwable th2) {
        if (th != th2) {
            Integer num = z27.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = oxa.a;
            if (method != null) {
                method.invoke(th, new Object[]{th2});
            }
        }
    }

    public static final void e(ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams) {
        if (view.getParent() == null) {
            viewGroup.addView(view, layoutParams);
        }
    }

    public static final void f(ViewGroup viewGroup, View view, Integer num) {
        if (view.getParent() == null) {
            viewGroup.addView(view, num != null ? num.intValue() : -1);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [kgd, yr] */
    public static final yr h(wia... wiaArr) {
        ? kgd = new kgd(wiaArr.length);
        for (wia wia : wiaArr) {
            kgd.put(wia.a, wia.b);
        }
        return kgd;
    }

    public static Object i(y0c y0c, er3 er3) {
        zv1 zv1 = new zv1(1, urd.y(er3));
        zv1.n();
        y0c.e(new afc(zv1, (Object) null));
        zv1.d(new ty0(6, y0c));
        return zv1.m();
    }

    public static final Bundle j(wia... wiaArr) {
        Bundle bundle = new Bundle(wiaArr.length);
        for (wia wia : wiaArr) {
            String str = (String) wia.a;
            Object obj = wia.b;
            if (obj == null) {
                bundle.putString(str, (String) null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(str, (Serializable) obj);
                } else {
                    throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                ft0.a(bundle, str, (Size) obj);
            } else if (obj instanceof SizeF) {
                ft0.b(bundle, str, (SizeF) obj);
            } else {
                throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
            }
        }
        return bundle;
    }

    public static nv4 k(g55 g55) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = g55.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (g55.q(i3, elapsedRealtime)) {
                i2++;
            }
        }
        return new nv4(1, 0, length, i2, 2);
    }

    public static synchronized void l() {
        synchronized (jjd.class) {
            if (!b) {
                kjd.D("native-imagetranscoder");
                b = true;
            }
        }
    }

    public static final boolean m(int i2, int i3) {
        return i2 == i3;
    }

    public static final ViewGroup n(View view) {
        ViewGroup n;
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null && (n = n(viewGroup)) != null) {
            return n;
        }
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    public static final int o(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0020, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        defpackage.urd.l(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0024, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0026, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0027, code lost:
        defpackage.urd.l(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002a, code lost:
        throw r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void p(java.io.File r2, java.io.File r3) {
        /*
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x001c }
            r2.<init>(r3)     // Catch:{ all -> 0x001c }
            java.util.zip.GZIPOutputStream r3 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x001c }
            r3.<init>(r2)     // Catch:{ all -> 0x001c }
            r2 = 8192(0x2000, float:1.14794E-41)
            defpackage.oyb.p(r0, r3, r2)     // Catch:{ all -> 0x001e }
            r2 = 0
            defpackage.urd.l(r3, r2)     // Catch:{ all -> 0x001c }
            defpackage.urd.l(r0, r2)
            return
        L_0x001c:
            r2 = move-exception
            goto L_0x0025
        L_0x001e:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0020 }
        L_0x0020:
            r1 = move-exception
            defpackage.urd.l(r3, r2)     // Catch:{ all -> 0x001c }
            throw r1     // Catch:{ all -> 0x001c }
        L_0x0025:
            throw r2     // Catch:{ all -> 0x0026 }
        L_0x0026:
            r3 = move-exception
            defpackage.urd.l(r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jjd.p(java.io.File, java.io.File):void");
    }

    public static final rb9 q(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        rb9 rb9 = new rb9();
        int i18 = i2;
        rb9.e(1, i2);
        int i19 = i3;
        rb9.e(131072, i3);
        int i20 = i4;
        rb9.e(2, i4);
        int i21 = i5;
        rb9.e(4, i5);
        int i22 = i6;
        rb9.e(8, i6);
        int i23 = i7;
        rb9.e(16, i7);
        int i24 = i8;
        rb9.e(64, i8);
        int i25 = i9;
        rb9.e(128, i9);
        int i26 = i10;
        rb9.e(256, i10);
        int i27 = i11;
        int i28 = i12;
        rb9.e(i11, i12);
        int i29 = i13;
        int i30 = i14;
        rb9.e(i13, i14);
        rb9.e(2048, i15);
        rb9.e(8192, i16);
        rb9.e(65536, i17);
        return rb9;
    }

    public static final rb9 r(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        rb9 rb9 = new rb9();
        int i20 = i2;
        rb9.e(1, i2);
        int i21 = i3;
        rb9.e(2, i3);
        int i22 = i4;
        rb9.e(4, i4);
        int i23 = i5;
        rb9.e(8, i5);
        int i24 = i6;
        rb9.e(65536, i6);
        int i25 = i7;
        rb9.e(16, i7);
        int i26 = i8;
        rb9.e(32768, i8);
        int i27 = i9;
        rb9.e(32, i9);
        int i28 = i10;
        rb9.e(64, i10);
        int i29 = i11;
        rb9.e(256, i11);
        int i30 = i12;
        rb9.e(128, i12);
        int i31 = i13;
        int i32 = i14;
        rb9.e(i13, i14);
        rb9.e(i15, i16);
        rb9.e(i17, i18);
        rb9.e(2048, i19);
        return rb9;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:488:0x06ce A[Catch:{ all -> 0x06db }, LOOP:32: B:486:0x06c8->B:488:0x06ce, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:503:0x0709 A[LOOP:33: B:501:0x0703->B:503:0x0709, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:506:0x071e  */
    /* JADX WARNING: Removed duplicated region for block: B:513:0x072c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:528:0x06e5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:542:0x06f1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:594:? A[ADDED_TO_REGION, ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static s72 s(ws8 r27) {
        /*
            r1 = r27
            java.lang.String r2 = "payloadCatching catch error"
            java.lang.String r3 = "ServerPayload/PayloadCatching"
            bs r4 = new bs
            r5 = 0
            r4.<init>((java.lang.Object) r5)
            bs r6 = new bs
            r6.<init>((java.lang.Object) r5)
            java.lang.Class<r72> r0 = r72.class
            java.util.EnumSet r13 = java.util.EnumSet.noneOf(r0)
            hw4 r7 = defpackage.hw4.a
            java.util.EnumMap r15 = new java.util.EnumMap
            r15.<init>(r0)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.lang.Class<fr5> r0 = fr5.class
            java.util.EnumSet r12 = java.util.EnumSet.noneOf(r0)
            r9 = 1
            int r0 = K(r27)     // Catch:{ all -> 0x0032 }
            r10 = r0
            r16 = r6
            goto L_0x0066
        L_0x0032:
            r0 = move-exception
            r10 = r0
            defpackage.udd.S(r3, r2, r10)
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a()
            java.util.Iterator r0 = r0.iterator()
        L_0x003f:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x0052
            java.lang.Object r11 = r0.next()
            ny9 r11 = (defpackage.ny9) r11
            r11.getClass()
            defpackage.ny9.a(r10)
            goto L_0x003f
        L_0x0052:
            int r0 = m4b.a
            int r0 = defpackage.hr1.t(r0)
            if (r0 == 0) goto L_0x0063
            if (r0 == r9) goto L_0x0062
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0062:
            throw r10
        L_0x0063:
            r16 = r6
            r10 = 0
        L_0x0066:
            r21 = r7
            r7 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
        L_0x0073:
            if (r7 >= r10) goto L_0x0728
            java.lang.String r0 = M(r27)     // Catch:{ all -> 0x007a }
            goto L_0x00b2
        L_0x007a:
            r0 = move-exception
            r8 = r0
            defpackage.udd.S(r3, r2, r8)     // Catch:{ all -> 0x009e }
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a()     // Catch:{ all -> 0x009e }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x009e }
        L_0x0087:
            boolean r24 = r0.hasNext()     // Catch:{ all -> 0x009e }
            if (r24 == 0) goto L_0x00a0
            java.lang.Object r24 = r0.next()     // Catch:{ all -> 0x009e }
            ny9 r24 = (defpackage.ny9) r24     // Catch:{ all -> 0x009e }
            r24.getClass()     // Catch:{ all -> 0x009e }
            defpackage.ny9.a(r8)     // Catch:{ all -> 0x009e }
            goto L_0x0087
        L_0x009a:
            r8 = r16
            goto L_0x06f8
        L_0x009e:
            r0 = move-exception
            goto L_0x009a
        L_0x00a0:
            int r0 = m4b.a     // Catch:{ all -> 0x009e }
            int r0 = defpackage.hr1.t(r0)     // Catch:{ all -> 0x009e }
            if (r0 == 0) goto L_0x00b1
            if (r0 == r9) goto L_0x00b0
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x009e }
            r0.<init>()     // Catch:{ all -> 0x009e }
            throw r0     // Catch:{ all -> 0x009e }
        L_0x00b0:
            throw r8     // Catch:{ all -> 0x009e }
        L_0x00b1:
            r0 = 0
        L_0x00b2:
            if (r0 == 0) goto L_0x06ef
            int r8 = r0.hashCode()     // Catch:{ all -> 0x00f1 }
            switch(r8) {
                case -1785238953: goto L_0x05f8;
                case -1249474914: goto L_0x0519;
                case -854547461: goto L_0x0480;
                case -8339209: goto L_0x0442;
                case 3355: goto L_0x03f9;
                case 96632902: goto L_0x03b0;
                case 110371416: goto L_0x0367;
                case 598683239: goto L_0x031b;
                case 829468971: goto L_0x02d4;
                case 1340337839: goto L_0x0252;
                case 1942574248: goto L_0x01ce;
                case 2023524447: goto L_0x00bd;
                default: goto L_0x00bb;
            }     // Catch:{ all -> 0x00f1 }
        L_0x00bb:
            goto L_0x0600
        L_0x00bd:
            java.lang.String r8 = "filterSubjects"
            boolean r0 = r0.equals(r8)     // Catch:{ all -> 0x00f1 }
            if (r0 != 0) goto L_0x00c7
            goto L_0x0600
        L_0x00c7:
            int r0 = K(r27)     // Catch:{ all -> 0x00cd }
            r8 = r0
            goto L_0x0105
        L_0x00cd:
            r0 = move-exception
            r8 = r0
            defpackage.udd.S(r3, r2, r8)     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a()     // Catch:{ all -> 0x00f1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f1 }
        L_0x00da:
            boolean r24 = r0.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r24 == 0) goto L_0x00f3
            java.lang.Object r24 = r0.next()     // Catch:{ all -> 0x00f1 }
            ny9 r24 = (defpackage.ny9) r24     // Catch:{ all -> 0x00f1 }
            r24.getClass()     // Catch:{ all -> 0x00f1 }
            defpackage.ny9.a(r8)     // Catch:{ all -> 0x00f1 }
            goto L_0x00da
        L_0x00ed:
            r8 = r16
            goto L_0x06bd
        L_0x00f1:
            r0 = move-exception
            goto L_0x00ed
        L_0x00f3:
            int r0 = m4b.a     // Catch:{ all -> 0x00f1 }
            int r0 = defpackage.hr1.t(r0)     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x0104
            if (r0 == r9) goto L_0x0103
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f1 }
            r0.<init>()     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x0103:
            throw r8     // Catch:{ all -> 0x00f1 }
        L_0x0104:
            r8 = 0
        L_0x0105:
            r11 = 0
        L_0x0106:
            if (r11 >= r8) goto L_0x06ef
            java.lang.String r0 = M(r27)     // Catch:{ all -> 0x010d }
            goto L_0x0142
        L_0x010d:
            r0 = move-exception
            r5 = r0
            defpackage.udd.S(r3, r2, r5)     // Catch:{ all -> 0x012d }
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a()     // Catch:{ all -> 0x012d }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x012d }
        L_0x011a:
            boolean r6 = r0.hasNext()     // Catch:{ all -> 0x012d }
            if (r6 == 0) goto L_0x0130
            java.lang.Object r6 = r0.next()     // Catch:{ all -> 0x012d }
            ny9 r6 = (defpackage.ny9) r6     // Catch:{ all -> 0x012d }
            r6.getClass()     // Catch:{ all -> 0x012d }
            defpackage.ny9.a(r5)     // Catch:{ all -> 0x012d }
            goto L_0x011a
        L_0x012d:
            r0 = move-exception
            goto L_0x019f
        L_0x0130:
            int r0 = m4b.a     // Catch:{ all -> 0x012d }
            int r0 = defpackage.hr1.t(r0)     // Catch:{ all -> 0x012d }
            if (r0 == 0) goto L_0x0141
            if (r0 == r9) goto L_0x0140
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x012d }
            r0.<init>()     // Catch:{ all -> 0x012d }
            throw r0     // Catch:{ all -> 0x012d }
        L_0x0140:
            throw r5     // Catch:{ all -> 0x012d }
        L_0x0141:
            r0 = 0
        L_0x0142:
            if (r0 != 0) goto L_0x0145
            goto L_0x019b
        L_0x0145:
            r72 r0 = r72.valueOf(r0)     // Catch:{ all -> 0x014a }
            goto L_0x0151
        L_0x014a:
            r0 = move-exception
            r5 = r0
            kcc r0 = new kcc     // Catch:{ all -> 0x012d }
            r0.<init>(r5)     // Catch:{ all -> 0x012d }
        L_0x0151:
            boolean r5 = r0 instanceof defpackage.kcc     // Catch:{ all -> 0x012d }
            r5 = r5 ^ r9
            if (r5 == 0) goto L_0x0160
            r5 = r0
            r72 r5 = (r72) r5     // Catch:{ all -> 0x012d }
            java.lang.Object r6 = gp0.C(r5, r1)     // Catch:{ all -> 0x012d }
            r15.put(r5, r6)     // Catch:{ all -> 0x012d }
        L_0x0160:
            java.lang.Throwable r0 = defpackage.mcc.a(r0)     // Catch:{ all -> 0x012d }
            if (r0 == 0) goto L_0x019b
            r27.z()     // Catch:{ all -> 0x016a }
            goto L_0x019b
        L_0x016a:
            r0 = move-exception
            r5 = r0
            defpackage.udd.S(r3, r2, r5)     // Catch:{ all -> 0x012d }
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a()     // Catch:{ all -> 0x012d }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x012d }
        L_0x0177:
            boolean r6 = r0.hasNext()     // Catch:{ all -> 0x012d }
            if (r6 == 0) goto L_0x018a
            java.lang.Object r6 = r0.next()     // Catch:{ all -> 0x012d }
            ny9 r6 = (defpackage.ny9) r6     // Catch:{ all -> 0x012d }
            r6.getClass()     // Catch:{ all -> 0x012d }
            defpackage.ny9.a(r5)     // Catch:{ all -> 0x012d }
            goto L_0x0177
        L_0x018a:
            int r0 = m4b.a     // Catch:{ all -> 0x012d }
            int r0 = defpackage.hr1.t(r0)     // Catch:{ all -> 0x012d }
            if (r0 == 0) goto L_0x019b
            if (r0 == r9) goto L_0x019a
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x012d }
            r0.<init>()     // Catch:{ all -> 0x012d }
            throw r0     // Catch:{ all -> 0x012d }
        L_0x019a:
            throw r5     // Catch:{ all -> 0x012d }
        L_0x019b:
            int r11 = r11 + 1
            goto L_0x0106
        L_0x019f:
            defpackage.udd.S(r3, r2, r0)     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.CopyOnWriteArraySet r5 = uzc.a()     // Catch:{ all -> 0x00f1 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x00f1 }
        L_0x01aa:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r6 == 0) goto L_0x01bd
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x00f1 }
            ny9 r6 = (defpackage.ny9) r6     // Catch:{ all -> 0x00f1 }
            r6.getClass()     // Catch:{ all -> 0x00f1 }
            defpackage.ny9.a(r0)     // Catch:{ all -> 0x00f1 }
            goto L_0x01aa
        L_0x01bd:
            int r5 = m4b.a     // Catch:{ all -> 0x00f1 }
            int r5 = defpackage.hr1.t(r5)     // Catch:{ all -> 0x00f1 }
            if (r5 == 0) goto L_0x06ef
            if (r5 == r9) goto L_0x01cd
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f1 }
            r0.<init>()     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x01cd:
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x01ce:
            java.lang.String r5 = "include"
            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x00f1 }
            if (r0 != 0) goto L_0x01d8
            goto L_0x0600
        L_0x01d8:
            int r0 = D(r27)     // Catch:{ all -> 0x01de }
            r5 = r0
            goto L_0x0210
        L_0x01de:
            r0 = move-exception
            r5 = r0
            defpackage.udd.S(r3, r2, r5)     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a()     // Catch:{ all -> 0x00f1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f1 }
        L_0x01eb:
            boolean r6 = r0.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r6 == 0) goto L_0x01fe
            java.lang.Object r6 = r0.next()     // Catch:{ all -> 0x00f1 }
            ny9 r6 = (defpackage.ny9) r6     // Catch:{ all -> 0x00f1 }
            r6.getClass()     // Catch:{ all -> 0x00f1 }
            defpackage.ny9.a(r5)     // Catch:{ all -> 0x00f1 }
            goto L_0x01eb
        L_0x01fe:
            int r0 = m4b.a     // Catch:{ all -> 0x00f1 }
            int r0 = defpackage.hr1.t(r0)     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x020f
            if (r0 == r9) goto L_0x020e
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f1 }
            r0.<init>()     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x020e:
            throw r5     // Catch:{ all -> 0x00f1 }
        L_0x020f:
            r5 = 0
        L_0x0210:
            r6 = 0
        L_0x0211:
            if (r6 >= r5) goto L_0x06ef
            long r25 = V(r27)     // Catch:{ all -> 0x021f }
            java.lang.Long r0 = java.lang.Long.valueOf(r25)     // Catch:{ all -> 0x021f }
            r4.add(r0)     // Catch:{ all -> 0x021f }
            goto L_0x024f
        L_0x021f:
            r0 = move-exception
            defpackage.udd.S(r3, r2, r0)     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.CopyOnWriteArraySet r8 = uzc.a()     // Catch:{ all -> 0x00f1 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x00f1 }
        L_0x022b:
            boolean r11 = r8.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r11 == 0) goto L_0x023e
            java.lang.Object r11 = r8.next()     // Catch:{ all -> 0x00f1 }
            ny9 r11 = (defpackage.ny9) r11     // Catch:{ all -> 0x00f1 }
            r11.getClass()     // Catch:{ all -> 0x00f1 }
            defpackage.ny9.a(r0)     // Catch:{ all -> 0x00f1 }
            goto L_0x022b
        L_0x023e:
            int r8 = m4b.a     // Catch:{ all -> 0x00f1 }
            int r8 = defpackage.hr1.t(r8)     // Catch:{ all -> 0x00f1 }
            if (r8 == 0) goto L_0x024f
            if (r8 == r9) goto L_0x024e
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f1 }
            r0.<init>()     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x024e:
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x024f:
            int r6 = r6 + 1
            goto L_0x0211
        L_0x0252:
            java.lang.String r5 = "widgets"
            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x00f1 }
            if (r0 != 0) goto L_0x025c
            goto L_0x0600
        L_0x025c:
            int r0 = D(r27)     // Catch:{ all -> 0x0261 }
            goto L_0x0293
        L_0x0261:
            r0 = move-exception
            r5 = r0
            defpackage.udd.S(r3, r2, r5)     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a()     // Catch:{ all -> 0x00f1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f1 }
        L_0x026e:
            boolean r6 = r0.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r6 == 0) goto L_0x0281
            java.lang.Object r6 = r0.next()     // Catch:{ all -> 0x00f1 }
            ny9 r6 = (defpackage.ny9) r6     // Catch:{ all -> 0x00f1 }
            r6.getClass()     // Catch:{ all -> 0x00f1 }
            defpackage.ny9.a(r5)     // Catch:{ all -> 0x00f1 }
            goto L_0x026e
        L_0x0281:
            int r0 = m4b.a     // Catch:{ all -> 0x00f1 }
            int r0 = defpackage.hr1.t(r0)     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x0292
            if (r0 == r9) goto L_0x0291
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f1 }
            r0.<init>()     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x0291:
            throw r5     // Catch:{ all -> 0x00f1 }
        L_0x0292:
            r0 = 0
        L_0x0293:
            r5 = 0
        L_0x0294:
            if (r5 >= r0) goto L_0x06ef
            kr5 r6 = defpackage.am7.t(r27)     // Catch:{ all -> 0x02a0 }
            if (r6 == 0) goto L_0x02a2
            r14.add(r6)     // Catch:{ all -> 0x02a0 }
            goto L_0x02a2
        L_0x02a0:
            r0 = move-exception
            goto L_0x02a5
        L_0x02a2:
            int r5 = r5 + 1
            goto L_0x0294
        L_0x02a5:
            defpackage.udd.S(r3, r2, r0)     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.CopyOnWriteArraySet r5 = uzc.a()     // Catch:{ all -> 0x00f1 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x00f1 }
        L_0x02b0:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r6 == 0) goto L_0x02c3
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x00f1 }
            ny9 r6 = (defpackage.ny9) r6     // Catch:{ all -> 0x00f1 }
            r6.getClass()     // Catch:{ all -> 0x00f1 }
            defpackage.ny9.a(r0)     // Catch:{ all -> 0x00f1 }
            goto L_0x02b0
        L_0x02c3:
            int r5 = m4b.a     // Catch:{ all -> 0x00f1 }
            int r5 = defpackage.hr1.t(r5)     // Catch:{ all -> 0x00f1 }
            if (r5 == 0) goto L_0x06ef
            if (r5 == r9) goto L_0x02d3
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f1 }
            r0.<init>()     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x02d3:
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x02d4:
            java.lang.String r5 = "hideEmpty"
            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x00f1 }
            if (r0 != 0) goto L_0x02de
            goto L_0x0600
        L_0x02de:
            boolean r0 = E(r27)     // Catch:{ all -> 0x02e6 }
            r20 = r0
            goto L_0x06ef
        L_0x02e6:
            r0 = move-exception
            r5 = r0
            defpackage.udd.S(r3, r2, r5)     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a()     // Catch:{ all -> 0x00f1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f1 }
        L_0x02f3:
            boolean r6 = r0.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r6 == 0) goto L_0x0306
            java.lang.Object r6 = r0.next()     // Catch:{ all -> 0x00f1 }
            ny9 r6 = (defpackage.ny9) r6     // Catch:{ all -> 0x00f1 }
            r6.getClass()     // Catch:{ all -> 0x00f1 }
            defpackage.ny9.a(r5)     // Catch:{ all -> 0x00f1 }
            goto L_0x02f3
        L_0x0306:
            int r0 = m4b.a     // Catch:{ all -> 0x00f1 }
            int r0 = defpackage.hr1.t(r0)     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x0317
            if (r0 == r9) goto L_0x0316
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f1 }
            r0.<init>()     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x0316:
            throw r5     // Catch:{ all -> 0x00f1 }
        L_0x0317:
            r20 = 0
            goto L_0x06ef
        L_0x031b:
            java.lang.String r5 = "creatorId"
            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x0362 }
            if (r0 != 0) goto L_0x0325
            goto L_0x0600
        L_0x0325:
            r5 = 0
            long r22 = J(r1, r5)     // Catch:{ all -> 0x032d }
            goto L_0x06ef
        L_0x032d:
            r0 = move-exception
            r8 = r0
            defpackage.udd.S(r3, r2, r8)     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a()     // Catch:{ all -> 0x00f1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f1 }
        L_0x033a:
            boolean r11 = r0.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r11 == 0) goto L_0x034d
            java.lang.Object r11 = r0.next()     // Catch:{ all -> 0x00f1 }
            ny9 r11 = (defpackage.ny9) r11     // Catch:{ all -> 0x00f1 }
            r11.getClass()     // Catch:{ all -> 0x00f1 }
            defpackage.ny9.a(r8)     // Catch:{ all -> 0x00f1 }
            goto L_0x033a
        L_0x034d:
            int r0 = m4b.a     // Catch:{ all -> 0x00f1 }
            int r0 = defpackage.hr1.t(r0)     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x035e
            if (r0 == r9) goto L_0x035d
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f1 }
            r0.<init>()     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x035d:
            throw r8     // Catch:{ all -> 0x00f1 }
        L_0x035e:
            r22 = r5
            goto L_0x06ef
        L_0x0362:
            r0 = move-exception
            r5 = 0
            goto L_0x00ed
        L_0x0367:
            r5 = 0
            java.lang.String r8 = "title"
            boolean r0 = r0.equals(r8)     // Catch:{ all -> 0x00f1 }
            if (r0 != 0) goto L_0x0373
            goto L_0x0600
        L_0x0373:
            java.lang.String r0 = M(r27)     // Catch:{ all -> 0x037b }
            r18 = r0
            goto L_0x06ef
        L_0x037b:
            r0 = move-exception
            r8 = r0
            defpackage.udd.S(r3, r2, r8)     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a()     // Catch:{ all -> 0x00f1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f1 }
        L_0x0388:
            boolean r11 = r0.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r11 == 0) goto L_0x039b
            java.lang.Object r11 = r0.next()     // Catch:{ all -> 0x00f1 }
            ny9 r11 = (defpackage.ny9) r11     // Catch:{ all -> 0x00f1 }
            r11.getClass()     // Catch:{ all -> 0x00f1 }
            defpackage.ny9.a(r8)     // Catch:{ all -> 0x00f1 }
            goto L_0x0388
        L_0x039b:
            int r0 = m4b.a     // Catch:{ all -> 0x00f1 }
            int r0 = defpackage.hr1.t(r0)     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x03ac
            if (r0 == r9) goto L_0x03ab
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f1 }
            r0.<init>()     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x03ab:
            throw r8     // Catch:{ all -> 0x00f1 }
        L_0x03ac:
            r18 = 0
            goto L_0x06ef
        L_0x03b0:
            r5 = 0
            java.lang.String r8 = "emoji"
            boolean r0 = r0.equals(r8)     // Catch:{ all -> 0x00f1 }
            if (r0 != 0) goto L_0x03bc
            goto L_0x0600
        L_0x03bc:
            java.lang.String r0 = M(r27)     // Catch:{ all -> 0x03c4 }
            r19 = r0
            goto L_0x06ef
        L_0x03c4:
            r0 = move-exception
            r8 = r0
            defpackage.udd.S(r3, r2, r8)     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a()     // Catch:{ all -> 0x00f1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f1 }
        L_0x03d1:
            boolean r11 = r0.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r11 == 0) goto L_0x03e4
            java.lang.Object r11 = r0.next()     // Catch:{ all -> 0x00f1 }
            ny9 r11 = (defpackage.ny9) r11     // Catch:{ all -> 0x00f1 }
            r11.getClass()     // Catch:{ all -> 0x00f1 }
            defpackage.ny9.a(r8)     // Catch:{ all -> 0x00f1 }
            goto L_0x03d1
        L_0x03e4:
            int r0 = m4b.a     // Catch:{ all -> 0x00f1 }
            int r0 = defpackage.hr1.t(r0)     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x03f5
            if (r0 == r9) goto L_0x03f4
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f1 }
            r0.<init>()     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x03f4:
            throw r8     // Catch:{ all -> 0x00f1 }
        L_0x03f5:
            r19 = 0
            goto L_0x06ef
        L_0x03f9:
            r5 = 0
            java.lang.String r8 = "id"
            boolean r0 = r0.equals(r8)     // Catch:{ all -> 0x00f1 }
            if (r0 != 0) goto L_0x0405
            goto L_0x0600
        L_0x0405:
            java.lang.String r0 = M(r27)     // Catch:{ all -> 0x040d }
            r17 = r0
            goto L_0x06ef
        L_0x040d:
            r0 = move-exception
            r8 = r0
            defpackage.udd.S(r3, r2, r8)     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a()     // Catch:{ all -> 0x00f1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f1 }
        L_0x041a:
            boolean r11 = r0.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r11 == 0) goto L_0x042d
            java.lang.Object r11 = r0.next()     // Catch:{ all -> 0x00f1 }
            ny9 r11 = (defpackage.ny9) r11     // Catch:{ all -> 0x00f1 }
            r11.getClass()     // Catch:{ all -> 0x00f1 }
            defpackage.ny9.a(r8)     // Catch:{ all -> 0x00f1 }
            goto L_0x041a
        L_0x042d:
            int r0 = m4b.a     // Catch:{ all -> 0x00f1 }
            int r0 = defpackage.hr1.t(r0)     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x043e
            if (r0 == r9) goto L_0x043d
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f1 }
            r0.<init>()     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x043d:
            throw r8     // Catch:{ all -> 0x00f1 }
        L_0x043e:
            r17 = 0
            goto L_0x06ef
        L_0x0442:
            r5 = 0
            java.lang.String r8 = "elements"
            boolean r0 = r0.equals(r8)     // Catch:{ all -> 0x00f1 }
            if (r0 != 0) goto L_0x044e
            goto L_0x0600
        L_0x044e:
            sp8 r0 = r27.n()     // Catch:{ all -> 0x00f1 }
            int r0 = r0.a()     // Catch:{ all -> 0x00f1 }
            r8 = 7
            if (r0 != r8) goto L_0x0473
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x00f1 }
            r0.<init>()     // Catch:{ all -> 0x00f1 }
            int r8 = r27.s0()     // Catch:{ all -> 0x00f1 }
            r11 = 0
        L_0x0463:
            if (r11 >= r8) goto L_0x047a
            dp8 r5 = defpackage.gk9.h(r27)     // Catch:{ all -> 0x00f1 }
            if (r5 == 0) goto L_0x046e
            r0.add(r5)     // Catch:{ all -> 0x00f1 }
        L_0x046e:
            int r11 = r11 + 1
            r5 = 0
            goto L_0x0463
        L_0x0473:
            r27.z()     // Catch:{ all -> 0x00f1 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00f1 }
        L_0x047a:
            java.util.List r21 = defpackage.o23.T(r0)     // Catch:{ all -> 0x00f1 }
            goto L_0x06ef
        L_0x0480:
            java.lang.String r5 = "filters"
            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x00f1 }
            if (r0 != 0) goto L_0x048a
            goto L_0x0600
        L_0x048a:
            int r0 = D(r27)     // Catch:{ all -> 0x0490 }
            r5 = r0
            goto L_0x04c2
        L_0x0490:
            r0 = move-exception
            r5 = r0
            defpackage.udd.S(r3, r2, r5)     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a()     // Catch:{ all -> 0x00f1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f1 }
        L_0x049d:
            boolean r6 = r0.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r6 == 0) goto L_0x04b0
            java.lang.Object r6 = r0.next()     // Catch:{ all -> 0x00f1 }
            ny9 r6 = (defpackage.ny9) r6     // Catch:{ all -> 0x00f1 }
            r6.getClass()     // Catch:{ all -> 0x00f1 }
            defpackage.ny9.a(r5)     // Catch:{ all -> 0x00f1 }
            goto L_0x049d
        L_0x04b0:
            int r0 = m4b.a     // Catch:{ all -> 0x00f1 }
            int r0 = defpackage.hr1.t(r0)     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x04c1
            if (r0 == r9) goto L_0x04c0
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f1 }
            r0.<init>()     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x04c0:
            throw r5     // Catch:{ all -> 0x00f1 }
        L_0x04c1:
            r5 = 0
        L_0x04c2:
            r6 = 0
        L_0x04c3:
            if (r6 >= r5) goto L_0x06ef
            java.lang.String r0 = M(r27)     // Catch:{ all -> 0x04ca }
            goto L_0x04fc
        L_0x04ca:
            r0 = move-exception
            r8 = r0
            defpackage.udd.S(r3, r2, r8)     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a()     // Catch:{ all -> 0x00f1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f1 }
        L_0x04d7:
            boolean r11 = r0.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r11 == 0) goto L_0x04ea
            java.lang.Object r11 = r0.next()     // Catch:{ all -> 0x00f1 }
            ny9 r11 = (defpackage.ny9) r11     // Catch:{ all -> 0x00f1 }
            r11.getClass()     // Catch:{ all -> 0x00f1 }
            defpackage.ny9.a(r8)     // Catch:{ all -> 0x00f1 }
            goto L_0x04d7
        L_0x04ea:
            int r0 = m4b.a     // Catch:{ all -> 0x00f1 }
            int r0 = defpackage.hr1.t(r0)     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x04fb
            if (r0 == r9) goto L_0x04fa
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f1 }
            r0.<init>()     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x04fa:
            throw r8     // Catch:{ all -> 0x00f1 }
        L_0x04fb:
            r0 = 0
        L_0x04fc:
            if (r0 == 0) goto L_0x0516
            r72 r0 = r72.valueOf(r0)     // Catch:{ all -> 0x0503 }
            goto L_0x050a
        L_0x0503:
            r0 = move-exception
            r8 = r0
            kcc r0 = new kcc     // Catch:{ all -> 0x00f1 }
            r0.<init>(r8)     // Catch:{ all -> 0x00f1 }
        L_0x050a:
            boolean r8 = r0 instanceof defpackage.kcc     // Catch:{ all -> 0x00f1 }
            if (r8 == 0) goto L_0x050f
            r0 = 0
        L_0x050f:
            r72 r0 = (r72) r0     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x0516
            r13.add(r0)     // Catch:{ all -> 0x00f1 }
        L_0x0516:
            int r6 = r6 + 1
            goto L_0x04c3
        L_0x0519:
            java.lang.String r5 = "options"
            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x00f1 }
            if (r0 != 0) goto L_0x0523
            goto L_0x0600
        L_0x0523:
            int r0 = D(r27)     // Catch:{ all -> 0x0529 }
            r5 = r0
            goto L_0x055b
        L_0x0529:
            r0 = move-exception
            r5 = r0
            defpackage.udd.S(r3, r2, r5)     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a()     // Catch:{ all -> 0x00f1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f1 }
        L_0x0536:
            boolean r6 = r0.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r6 == 0) goto L_0x0549
            java.lang.Object r6 = r0.next()     // Catch:{ all -> 0x00f1 }
            ny9 r6 = (defpackage.ny9) r6     // Catch:{ all -> 0x00f1 }
            r6.getClass()     // Catch:{ all -> 0x00f1 }
            defpackage.ny9.a(r5)     // Catch:{ all -> 0x00f1 }
            goto L_0x0536
        L_0x0549:
            int r0 = m4b.a     // Catch:{ all -> 0x00f1 }
            int r0 = defpackage.hr1.t(r0)     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x055a
            if (r0 == r9) goto L_0x0559
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f1 }
            r0.<init>()     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x0559:
            throw r5     // Catch:{ all -> 0x00f1 }
        L_0x055a:
            r5 = 0
        L_0x055b:
            r6 = 0
        L_0x055c:
            if (r6 >= r5) goto L_0x06ef
            r8 = -1
            int r0 = I(r27)     // Catch:{ all -> 0x0564 }
            goto L_0x0598
        L_0x0564:
            r0 = move-exception
            r11 = r0
            defpackage.udd.S(r3, r2, r11)     // Catch:{ all -> 0x0584 }
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a()     // Catch:{ all -> 0x0584 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0584 }
        L_0x0571:
            boolean r25 = r0.hasNext()     // Catch:{ all -> 0x0584 }
            if (r25 == 0) goto L_0x0586
            java.lang.Object r25 = r0.next()     // Catch:{ all -> 0x0584 }
            ny9 r25 = (defpackage.ny9) r25     // Catch:{ all -> 0x0584 }
            r25.getClass()     // Catch:{ all -> 0x0584 }
            defpackage.ny9.a(r11)     // Catch:{ all -> 0x0584 }
            goto L_0x0571
        L_0x0584:
            r0 = move-exception
            goto L_0x05c8
        L_0x0586:
            int r0 = m4b.a     // Catch:{ all -> 0x0584 }
            int r0 = defpackage.hr1.t(r0)     // Catch:{ all -> 0x0584 }
            if (r0 == 0) goto L_0x0597
            if (r0 == r9) goto L_0x0596
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0584 }
            r0.<init>()     // Catch:{ all -> 0x0584 }
            throw r0     // Catch:{ all -> 0x0584 }
        L_0x0596:
            throw r11     // Catch:{ all -> 0x0584 }
        L_0x0597:
            r0 = r8
        L_0x0598:
            if (r0 == r8) goto L_0x05c4
            g02 r8 = fr5.b     // Catch:{ all -> 0x0584 }
            r8.getClass()     // Catch:{ all -> 0x0584 }
            pz4 r8 = fr5.Y     // Catch:{ all -> 0x0584 }
            r8.getClass()     // Catch:{ all -> 0x0584 }
            u1 r11 = new u1     // Catch:{ all -> 0x0584 }
            r9 = 0
            r11.<init>(r9, r8)     // Catch:{ all -> 0x0584 }
        L_0x05aa:
            boolean r8 = r11.hasNext()     // Catch:{ all -> 0x0584 }
            if (r8 == 0) goto L_0x05bc
            java.lang.Object r8 = r11.next()     // Catch:{ all -> 0x0584 }
            r9 = r8
            fr5 r9 = (fr5) r9     // Catch:{ all -> 0x0584 }
            int r9 = r9.a     // Catch:{ all -> 0x0584 }
            if (r9 != r0) goto L_0x05aa
            goto L_0x05bd
        L_0x05bc:
            r8 = 0
        L_0x05bd:
            fr5 r8 = (fr5) r8     // Catch:{ all -> 0x0584 }
            if (r8 == 0) goto L_0x05c4
            r12.add(r8)     // Catch:{ all -> 0x0584 }
        L_0x05c4:
            int r6 = r6 + 1
            r9 = 1
            goto L_0x055c
        L_0x05c8:
            defpackage.udd.S(r3, r2, r0)     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.CopyOnWriteArraySet r5 = uzc.a()     // Catch:{ all -> 0x00f1 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x00f1 }
        L_0x05d3:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r6 == 0) goto L_0x05e6
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x00f1 }
            ny9 r6 = (defpackage.ny9) r6     // Catch:{ all -> 0x00f1 }
            r6.getClass()     // Catch:{ all -> 0x00f1 }
            defpackage.ny9.a(r0)     // Catch:{ all -> 0x00f1 }
            goto L_0x05d3
        L_0x05e6:
            int r5 = m4b.a     // Catch:{ all -> 0x00f1 }
            int r5 = defpackage.hr1.t(r5)     // Catch:{ all -> 0x00f1 }
            if (r5 == 0) goto L_0x06ef
            r6 = 1
            if (r5 == r6) goto L_0x05f7
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f1 }
            r0.<init>()     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x05f7:
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x05f8:
            java.lang.String r5 = "favorites"
            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x00f1 }
            if (r0 != 0) goto L_0x0637
        L_0x0600:
            r27.z()     // Catch:{ all -> 0x0605 }
            goto L_0x06ef
        L_0x0605:
            r0 = move-exception
            r5 = r0
            defpackage.udd.S(r3, r2, r5)     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a()     // Catch:{ all -> 0x00f1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f1 }
        L_0x0612:
            boolean r6 = r0.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r6 == 0) goto L_0x0625
            java.lang.Object r6 = r0.next()     // Catch:{ all -> 0x00f1 }
            ny9 r6 = (defpackage.ny9) r6     // Catch:{ all -> 0x00f1 }
            r6.getClass()     // Catch:{ all -> 0x00f1 }
            defpackage.ny9.a(r5)     // Catch:{ all -> 0x00f1 }
            goto L_0x0612
        L_0x0625:
            int r0 = m4b.a     // Catch:{ all -> 0x00f1 }
            int r0 = defpackage.hr1.t(r0)     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x06ef
            r6 = 1
            if (r0 == r6) goto L_0x0636
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f1 }
            r0.<init>()     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x0636:
            throw r5     // Catch:{ all -> 0x00f1 }
        L_0x0637:
            int r0 = D(r27)     // Catch:{ all -> 0x063d }
            r5 = r0
            goto L_0x0670
        L_0x063d:
            r0 = move-exception
            r5 = r0
            defpackage.udd.S(r3, r2, r5)     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a()     // Catch:{ all -> 0x00f1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f1 }
        L_0x064a:
            boolean r6 = r0.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r6 == 0) goto L_0x065d
            java.lang.Object r6 = r0.next()     // Catch:{ all -> 0x00f1 }
            ny9 r6 = (defpackage.ny9) r6     // Catch:{ all -> 0x00f1 }
            r6.getClass()     // Catch:{ all -> 0x00f1 }
            defpackage.ny9.a(r5)     // Catch:{ all -> 0x00f1 }
            goto L_0x064a
        L_0x065d:
            int r0 = m4b.a     // Catch:{ all -> 0x00f1 }
            int r0 = defpackage.hr1.t(r0)     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x066f
            r6 = 1
            if (r0 == r6) goto L_0x066e
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f1 }
            r0.<init>()     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x066e:
            throw r5     // Catch:{ all -> 0x00f1 }
        L_0x066f:
            r5 = 0
        L_0x0670:
            r6 = 0
        L_0x0671:
            if (r6 >= r5) goto L_0x06ef
            long r8 = V(r27)     // Catch:{ all -> 0x0683 }
            java.lang.Long r0 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0683 }
            r8 = r16
            r8.add(r0)     // Catch:{ all -> 0x0681 }
            goto L_0x06b8
        L_0x0681:
            r0 = move-exception
            goto L_0x0686
        L_0x0683:
            r0 = move-exception
            r8 = r16
        L_0x0686:
            defpackage.udd.S(r3, r2, r0)     // Catch:{ all -> 0x06a4 }
            java.util.concurrent.CopyOnWriteArraySet r9 = uzc.a()     // Catch:{ all -> 0x06a4 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x06a4 }
        L_0x0691:
            boolean r11 = r9.hasNext()     // Catch:{ all -> 0x06a4 }
            if (r11 == 0) goto L_0x06a6
            java.lang.Object r11 = r9.next()     // Catch:{ all -> 0x06a4 }
            ny9 r11 = (defpackage.ny9) r11     // Catch:{ all -> 0x06a4 }
            r11.getClass()     // Catch:{ all -> 0x06a4 }
            defpackage.ny9.a(r0)     // Catch:{ all -> 0x06a4 }
            goto L_0x0691
        L_0x06a4:
            r0 = move-exception
            goto L_0x06bd
        L_0x06a6:
            int r9 = m4b.a     // Catch:{ all -> 0x06a4 }
            int r9 = defpackage.hr1.t(r9)     // Catch:{ all -> 0x06a4 }
            if (r9 == 0) goto L_0x06b8
            r11 = 1
            if (r9 == r11) goto L_0x06b7
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x06a4 }
            r0.<init>()     // Catch:{ all -> 0x06a4 }
            throw r0     // Catch:{ all -> 0x06a4 }
        L_0x06b7:
            throw r0     // Catch:{ all -> 0x06a4 }
        L_0x06b8:
            int r6 = r6 + 1
            r16 = r8
            goto L_0x0671
        L_0x06bd:
            defpackage.udd.S(r3, r2, r0)     // Catch:{ all -> 0x06db }
            java.util.concurrent.CopyOnWriteArraySet r5 = uzc.a()     // Catch:{ all -> 0x06db }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x06db }
        L_0x06c8:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x06db }
            if (r6 == 0) goto L_0x06dd
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x06db }
            ny9 r6 = (defpackage.ny9) r6     // Catch:{ all -> 0x06db }
            r6.getClass()     // Catch:{ all -> 0x06db }
            defpackage.ny9.a(r0)     // Catch:{ all -> 0x06db }
            goto L_0x06c8
        L_0x06db:
            r0 = move-exception
            goto L_0x06f8
        L_0x06dd:
            int r5 = m4b.a     // Catch:{ all -> 0x06db }
            int r5 = defpackage.hr1.t(r5)     // Catch:{ all -> 0x06db }
            if (r5 == 0) goto L_0x06f1
            r6 = 1
            if (r5 == r6) goto L_0x06ee
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x06db }
            r0.<init>()     // Catch:{ all -> 0x06db }
            throw r0     // Catch:{ all -> 0x06db }
        L_0x06ee:
            throw r0     // Catch:{ all -> 0x06db }
        L_0x06ef:
            r8 = r16
        L_0x06f1:
            int r7 = r7 + 1
            r16 = r8
            r9 = 1
            goto L_0x0073
        L_0x06f8:
            defpackage.udd.S(r3, r2, r0)
            java.util.concurrent.CopyOnWriteArraySet r1 = uzc.a()
            java.util.Iterator r1 = r1.iterator()
        L_0x0703:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0716
            java.lang.Object r2 = r1.next()
            ny9 r2 = (defpackage.ny9) r2
            r2.getClass()
            defpackage.ny9.a(r0)
            goto L_0x0703
        L_0x0716:
            int r1 = m4b.a
            int r1 = defpackage.hr1.t(r1)
            if (r1 == 0) goto L_0x072a
            r2 = 1
            if (r1 == r2) goto L_0x0727
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0727:
            throw r0
        L_0x0728:
            r8 = r16
        L_0x072a:
            if (r17 == 0) goto L_0x072e
            if (r18 != 0) goto L_0x0730
        L_0x072e:
            r1 = 0
            goto L_0x0755
        L_0x0730:
            s72 r0 = new s72
            java.util.Set r11 = java.util.Collections.unmodifiableSet(r4)
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r8)
            r7 = r0
            r8 = r17
            r9 = r18
            r10 = r19
            r2 = r12
            r12 = r1
            r1 = r14
            r14 = r20
            r3 = r15
            r15 = r21
            r16 = r22
            r18 = r3
            r19 = r1
            r20 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20)
            return r0
        L_0x0755:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jjd.s(ws8):s72");
    }

    public static final boolean t(int i2) {
        return (i2 & 536870912) != 0;
    }

    public static final boolean u(int i2) {
        return (i2 & Integer.MIN_VALUE) != 0;
    }

    public static final boolean v(int i2) {
        return (i2 & 1073741824) != 0;
    }

    public static ArrayList w(Object... objArr) {
        int length = objArr.length;
        ete.l(length, "arraySize");
        ArrayList arrayList = new ArrayList(xie.F(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static void x(mr8 mr8, Map map) {
        mr8.o(map.size());
        for (Map.Entry entry : map.entrySet()) {
            y(mr8, entry.getKey());
            y(mr8, entry.getValue());
        }
    }

    /* JADX WARNING: type inference failed for: r2v20, types: [java.util.Map, kgd] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0269  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void y(mr8 r17, java.lang.Object r18) {
        /*
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L_0x000f
            java.lang.String r1 = (java.lang.String) r1
            r0.U(r1)
            goto L_0x02fc
        L_0x000f:
            boolean r2 = r1 instanceof java.lang.Integer
            if (r2 == 0) goto L_0x001e
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.m(r1)
            goto L_0x02fc
        L_0x001e:
            boolean r2 = r1 instanceof java.lang.Long
            if (r2 == 0) goto L_0x002d
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r0.n(r1)
            goto L_0x02fc
        L_0x002d:
            boolean r2 = r1 instanceof java.lang.Float
            if (r2 == 0) goto L_0x0057
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r2 = 5
            r0.d(r2)
            org.msgpack.core.buffer.MessageBuffer r2 = r0.X
            int r3 = r0.Y
            int r4 = r3 + 1
            r0.Y = r4
            r4 = -54
            r2.putByte(r3, r4)
            org.msgpack.core.buffer.MessageBuffer r2 = r0.X
            int r3 = r0.Y
            r2.putFloat(r3, r1)
            int r1 = r0.Y
            int r1 = r1 + 4
            r0.Y = r1
            goto L_0x02fc
        L_0x0057:
            boolean r2 = r1 instanceof java.lang.Double
            if (r2 == 0) goto L_0x0082
            java.lang.Double r1 = (java.lang.Double) r1
            double r1 = r1.doubleValue()
            r3 = 9
            r0.d(r3)
            org.msgpack.core.buffer.MessageBuffer r3 = r0.X
            int r4 = r0.Y
            int r5 = r4 + 1
            r0.Y = r5
            r5 = -53
            r3.putByte(r4, r5)
            org.msgpack.core.buffer.MessageBuffer r3 = r0.X
            int r4 = r0.Y
            r3.putDouble(r4, r1)
            int r1 = r0.Y
            int r1 = r1 + 8
            r0.Y = r1
            goto L_0x02fc
        L_0x0082:
            boolean r2 = r1 instanceof java.lang.Short
            r3 = 256(0x100, float:3.59E-43)
            r4 = -48
            r5 = -32
            if (r2 == 0) goto L_0x00c0
            java.lang.Short r1 = (java.lang.Short) r1
            short r1 = r1.shortValue()
            if (r1 >= r5) goto L_0x00a5
            r2 = -128(0xffffffffffffff80, float:NaN)
            if (r1 >= r2) goto L_0x009f
            r2 = -47
            r0.q0(r2, r1)
            goto L_0x02fc
        L_0x009f:
            byte r1 = (byte) r1
            r0.n0(r4, r1)
            goto L_0x02fc
        L_0x00a5:
            r2 = 128(0x80, float:1.794E-43)
            if (r1 >= r2) goto L_0x00af
            byte r1 = (byte) r1
            r0.m0(r1)
            goto L_0x02fc
        L_0x00af:
            if (r1 >= r3) goto L_0x00b9
            r2 = -52
            byte r1 = (byte) r1
            r0.n0(r2, r1)
            goto L_0x02fc
        L_0x00b9:
            r2 = -51
            r0.q0(r2, r1)
            goto L_0x02fc
        L_0x00c0:
            boolean r2 = r1 instanceof java.lang.Byte
            if (r2 == 0) goto L_0x00d6
            java.lang.Byte r1 = (java.lang.Byte) r1
            byte r1 = r1.byteValue()
            if (r1 >= r5) goto L_0x00d1
            r0.n0(r4, r1)
            goto L_0x02fc
        L_0x00d1:
            r0.m0(r1)
            goto L_0x02fc
        L_0x00d6:
            boolean r2 = r1 instanceof java.lang.Boolean
            if (r2 == 0) goto L_0x00ec
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x00e5
            r1 = -61
            goto L_0x00e7
        L_0x00e5:
            r1 = -62
        L_0x00e7:
            r0.m0(r1)
            goto L_0x02fc
        L_0x00ec:
            boolean r2 = r1 instanceof java.util.List
            if (r2 == 0) goto L_0x010b
            java.util.List r1 = (java.util.List) r1
            int r2 = r1.size()
            r0.g(r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x00fd:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x02fc
            java.lang.Object r2 = r1.next()
            y(r0, r2)
            goto L_0x00fd
        L_0x010b:
            boolean r2 = r1 instanceof java.util.Set
            if (r2 == 0) goto L_0x012a
            java.util.Set r1 = (java.util.Set) r1
            int r2 = r1.size()
            r0.g(r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x011c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x02fc
            java.lang.Object r2 = r1.next()
            y(r0, r2)
            goto L_0x011c
        L_0x012a:
            boolean r2 = r1 instanceof java.util.Map
            if (r2 == 0) goto L_0x0135
            java.util.Map r1 = (java.util.Map) r1
            x(r0, r1)
            goto L_0x02fc
        L_0x0135:
            boolean r2 = r1 instanceof long[]
            r4 = 0
            if (r2 == 0) goto L_0x014b
            long[] r1 = (long[]) r1
            int r2 = r1.length
            r0.g(r2)
            int r2 = r1.length
        L_0x0141:
            if (r4 >= r2) goto L_0x02fc
            r5 = r1[r4]
            r0.n(r5)
            int r4 = r4 + 1
            goto L_0x0141
        L_0x014b:
            boolean r2 = r1 instanceof byte[]
            if (r2 == 0) goto L_0x0194
            byte[] r1 = (byte[]) r1
            int r2 = r1.length
            if (r2 >= r3) goto L_0x015b
            r3 = -60
            byte r2 = (byte) r2
            r0.n0(r3, r2)
            goto L_0x016b
        L_0x015b:
            r3 = 65536(0x10000, float:9.18355E-41)
            if (r2 >= r3) goto L_0x0166
            r3 = -59
            short r2 = (short) r2
            r0.q0(r3, r2)
            goto L_0x016b
        L_0x0166:
            r3 = -58
            r0.o0(r2, r3)
        L_0x016b:
            int r2 = r1.length
            org.msgpack.core.buffer.MessageBuffer r3 = r0.X
            if (r3 == 0) goto L_0x018a
            int r3 = r3.size()
            int r5 = r0.Y
            int r3 = r3 - r5
            if (r3 < r2) goto L_0x018a
            int r3 = r0.b
            if (r2 <= r3) goto L_0x017e
            goto L_0x018a
        L_0x017e:
            org.msgpack.core.buffer.MessageBuffer r3 = r0.X
            r3.putBytes(r5, r1, r4, r2)
            int r1 = r0.Y
            int r1 = r1 + r2
            r0.Y = r1
            goto L_0x02fc
        L_0x018a:
            r17.flush()
            org.msgpack.core.buffer.MessageBufferOutput r0 = r0.o
            r0.write(r1, r4, r2)
            goto L_0x02fc
        L_0x0194:
            boolean r2 = r1 instanceof fy
            if (r2 == 0) goto L_0x01a3
            fy r1 = (fy) r1
            java.util.HashMap r1 = r1.a()
            x(r0, r1)
            goto L_0x02fc
        L_0x01a3:
            boolean r2 = r1 instanceof xga
            if (r2 == 0) goto L_0x01b2
            xga r1 = (xga) r1
            yr r1 = r1.a()
            x(r0, r1)
            goto L_0x02fc
        L_0x01b2:
            boolean r2 = r1 instanceof zga
            java.lang.String r3 = "type"
            if (r2 == 0) goto L_0x01f6
            zga r1 = (zga) r1
            r1.getClass()
            java.util.HashMap r2 = new java.util.HashMap
            r4 = 3
            r2.<init>(r4)
            int r4 = r1.a
            r5 = 1
            if (r4 == r5) goto L_0x01d6
            r5 = 2
            if (r4 == r5) goto L_0x01d3
            r5 = 3
            if (r4 != r5) goto L_0x01d1
            java.lang.String r4 = "FORWARD"
            goto L_0x01d8
        L_0x01d1:
            r0 = 0
            throw r0
        L_0x01d3:
            java.lang.String r4 = "REPLY"
            goto L_0x01d8
        L_0x01d6:
            java.lang.String r4 = "UNKNOWN"
        L_0x01d8:
            r2.put(r3, r4)
            long r3 = r1.b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "chatId"
            r2.put(r4, r3)
            long r3 = r1.c
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = "messageId"
            r2.put(r3, r1)
            x(r0, r2)
            goto L_0x02fc
        L_0x01f6:
            boolean r2 = r1 instanceof dp8
            if (r2 == 0) goto L_0x0283
            dp8 r1 = (dp8) r1
            long r4 = r1.a
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            java.lang.String r6 = "entityId"
            r7 = 0
            if (r2 <= 0) goto L_0x0212
            java.lang.Long r8 = java.lang.Long.valueOf(r4)
            wia r9 = new wia
            r9.<init>(r6, r8)
        L_0x0210:
            r11 = r9
            goto L_0x0226
        L_0x0212:
            java.lang.String r8 = r1.b
            if (r8 == 0) goto L_0x0225
            int r9 = r8.length()
            if (r9 != 0) goto L_0x021d
            goto L_0x0225
        L_0x021d:
            wia r9 = new wia
            java.lang.String r10 = "entityName"
            r9.<init>(r10, r8)
            goto L_0x0210
        L_0x0225:
            r11 = r7
        L_0x0226:
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            if (r2 <= 0) goto L_0x022d
            goto L_0x022e
        L_0x022d:
            r4 = r7
        L_0x022e:
            if (r4 == 0) goto L_0x023f
            long r4 = r4.longValue()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            wia r4 = new wia
            r4.<init>(r6, r2)
            r12 = r4
            goto L_0x0240
        L_0x023f:
            r12 = r7
        L_0x0240:
            hp8 r2 = r1.c
            java.lang.String r2 = r2.name()
            wia r13 = new wia
            r13.<init>(r3, r2)
            short r2 = r1.o
            java.lang.Short r2 = java.lang.Short.valueOf(r2)
            wia r14 = new wia
            java.lang.String r3 = "from"
            r14.<init>(r3, r2)
            short r2 = r1.X
            java.lang.Short r2 = java.lang.Short.valueOf(r2)
            wia r15 = new wia
            java.lang.String r3 = "length"
            r15.<init>(r3, r2)
            java.util.Map r1 = r1.Y
            if (r1 == 0) goto L_0x0270
            wia r7 = new wia
            java.lang.String r2 = "attributes"
            r7.<init>(r2, r1)
        L_0x0270:
            r16 = r7
            wia[] r1 = new defpackage.wia[]{r11, r12, r13, r14, r15, r16}
            java.util.ArrayList r1 = defpackage.cs.X(r1)
            java.util.Map r1 = defpackage.ju7.V(r1)
            x(r0, r1)
            goto L_0x02fc
        L_0x0283:
            boolean r2 = r1 instanceof nzc
            if (r2 == 0) goto L_0x0291
            nzc r1 = (nzc) r1
            java.util.Map r1 = r1.a()
            x(r0, r1)
            goto L_0x02fc
        L_0x0291:
            boolean r2 = r1 instanceof s72
            if (r2 == 0) goto L_0x02fd
            s72 r1 = (s72) r1
            r1.getClass()
            yr r2 = new yr
            r2.<init>(r4)
            java.lang.String r3 = "id"
            java.lang.String r4 = r1.a
            r2.put(r3, r4)
            java.lang.String r3 = "title"
            java.lang.String r4 = r1.b
            r2.put(r3, r4)
            java.lang.String r3 = r1.c
            if (r3 == 0) goto L_0x02b6
            java.lang.String r4 = "emoji"
            r2.put(r4, r3)
        L_0x02b6:
            java.lang.String r3 = "include"
            java.util.Set r4 = r1.o
            r2.put(r3, r4)
            java.lang.String r3 = "favorites"
            java.util.Set r4 = r1.X
            r2.put(r3, r4)
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            java.util.Set r5 = r1.Y
            int r4 = defpackage.q23.H(r5, r4)
            r3.<init>(r4)
            java.util.Iterator r4 = r5.iterator()
        L_0x02d5:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02e9
            java.lang.Object r5 = r4.next()
            r72 r5 = (r72) r5
            java.lang.String r5 = r5.name()
            r3.add(r5)
            goto L_0x02d5
        L_0x02e9:
            java.lang.String r4 = "filters"
            r2.put(r4, r3)
            boolean r1 = r1.Z
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r3 = "hideEmpty"
            r2.put(r3, r1)
            x(r0, r2)
        L_0x02fc:
            return
        L_0x02fd:
            if (r1 != 0) goto L_0x0307
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "value == null"
            r0.<init>(r1)
            throw r0
        L_0x0307:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.Class r1 = r18.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "type "
            java.lang.String r3 = " isn't yet implemented"
            java.lang.String r1 = wn6.i(r2, r1, r3)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jjd.y(mr8, java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
        if (r8 == -1) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.n69 z(java.lang.String r20) {
        /*
            r0 = 1
            org.xmlpull.v1.XmlPullParserFactory r1 = org.xmlpull.v1.XmlPullParserFactory.newInstance()
            org.xmlpull.v1.XmlPullParser r1 = r1.newPullParser()
            java.io.StringReader r2 = new java.io.StringReader
            r3 = r20
            r2.<init>(r3)
            r1.setInput(r2)
            r1.next()
            java.lang.String r2 = "x:xmpmeta"
            boolean r3 = defpackage.xy6.y(r1, r2)
            r4 = 0
            if (r3 == 0) goto L_0x00cd
            po5 r3 = defpackage.ws6.b
            e8c r3 = defpackage.e8c.X
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r5
        L_0x0029:
            r1.next()
            java.lang.String r9 = "rdf:Description"
            boolean r9 = defpackage.xy6.y(r1, r9)
            if (r9 == 0) goto L_0x0099
            java.lang.String[] r3 = g
            r7 = 0
            r8 = r7
        L_0x0038:
            r9 = 4
            if (r8 >= r9) goto L_0x0098
            r10 = r3[r8]
            java.lang.String r10 = defpackage.xy6.p(r1, r10)
            if (r10 == 0) goto L_0x0096
            int r3 = java.lang.Integer.parseInt(r10)
            if (r3 != r0) goto L_0x0098
            java.lang.String[] r3 = h
            r8 = r7
        L_0x004c:
            if (r8 >= r9) goto L_0x0063
            r10 = r3[r8]
            java.lang.String r10 = defpackage.xy6.p(r1, r10)
            if (r10 == 0) goto L_0x0061
            long r8 = java.lang.Long.parseLong(r10)
            r10 = -1
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x0064
            goto L_0x0063
        L_0x0061:
            int r8 = r8 + r0
            goto L_0x004c
        L_0x0063:
            r8 = r5
        L_0x0064:
            java.lang.String[] r3 = i
        L_0x0066:
            r10 = 2
            if (r7 >= r10) goto L_0x0090
            r10 = r3[r7]
            java.lang.String r10 = defpackage.xy6.p(r1, r10)
            if (r10 == 0) goto L_0x008e
            long r12 = java.lang.Long.parseLong(r10)
            m69 r3 = new m69
            r15 = 0
            r18 = 0
            java.lang.String r17 = "image/jpeg"
            r14 = r3
            r14.<init>(r15, r17, r18)
            m69 r7 = new m69
            java.lang.String r14 = "video/mp4"
            r11 = r7
            r11.<init>(r12, r14, r15)
            e8c r3 = defpackage.ws6.o(r3, r7)
            goto L_0x0094
        L_0x008e:
            int r7 = r7 + r0
            goto L_0x0066
        L_0x0090:
            po5 r3 = defpackage.ws6.b
            e8c r3 = defpackage.e8c.X
        L_0x0094:
            r7 = r8
            goto L_0x00ba
        L_0x0096:
            int r8 = r8 + r0
            goto L_0x0038
        L_0x0098:
            return r4
        L_0x0099:
            java.lang.String r9 = "Container:Directory"
            boolean r9 = defpackage.xy6.y(r1, r9)
            if (r9 == 0) goto L_0x00aa
            java.lang.String r3 = "Container"
            java.lang.String r9 = "Item"
            e8c r3 = A(r1, r3, r9)
            goto L_0x00ba
        L_0x00aa:
            java.lang.String r9 = "GContainer:Directory"
            boolean r9 = defpackage.xy6.y(r1, r9)
            if (r9 == 0) goto L_0x00ba
            java.lang.String r3 = "GContainer"
            java.lang.String r9 = "GContainerItem"
            e8c r3 = A(r1, r3, r9)
        L_0x00ba:
            boolean r9 = defpackage.xy6.v(r1, r2)
            if (r9 == 0) goto L_0x0029
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x00c7
            return r4
        L_0x00c7:
            n69 r0 = new n69
            r0.<init>(r7, r3)
            return r0
        L_0x00cd:
            java.lang.String r0 = "Couldn't find xmp metadata"
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r4, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jjd.z(java.lang.String):n69");
    }

    public final float a(View view, ViewGroup viewGroup) {
        switch (this.a) {
            case 0:
                return view.getTranslationX() - ((float) viewGroup.getWidth());
            case 1:
                return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() + ((float) viewGroup.getWidth()) : view.getTranslationX() - ((float) viewGroup.getWidth());
            case 2:
                return view.getTranslationX() + ((float) viewGroup.getWidth());
            default:
                return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() - ((float) viewGroup.getWidth()) : view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    public float b(View view, ViewGroup viewGroup) {
        return view.getTranslationY();
    }
}
