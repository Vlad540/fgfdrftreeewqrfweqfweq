package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.Spanned;
import android.view.GestureDetector;
import android.view.View;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Logger;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.logout.a;

/* renamed from: xie  reason: default package */
public abstract class xie {
    public static final x3a a = new x3a(28, (Object) "CORE");
    public static final String[] b = {"_id", "lookup"};
    public static final String[] c = {"contact_id", "mimetype", "data2", "data3", "data5", "_id", "data1", "display_name", "photo_uri"};
    public static final /* synthetic */ int d = 0;

    public static wib A(byte[] bArr) {
        ija ija = new ija(bArr);
        if (ija.c < 32) {
            return null;
        }
        ija.G(0);
        int a2 = ija.a();
        int g = ija.g();
        if (g != a2) {
            ez3.j0("Advertised atom size (" + g + ") does not match buffer size: " + a2);
            return null;
        }
        int g2 = ija.g();
        if (g2 != 1886614376) {
            us8.l(g2, "Atom type is not pssh: ");
            return null;
        }
        int t = rx.t(ija.g());
        if (t > 1) {
            us8.l(t, "Unsupported pssh version: ");
            return null;
        }
        UUID uuid = new UUID(ija.o(), ija.o());
        if (t == 1) {
            int y = ija.y();
            UUID[] uuidArr = new UUID[y];
            for (int i = 0; i < y; i++) {
                uuidArr[i] = new UUID(ija.o(), ija.o());
            }
        }
        int y2 = ija.y();
        int a3 = ija.a();
        if (y2 != a3) {
            ez3.j0("Atom data size (" + y2 + ") does not match the bytes left: " + a3);
            return null;
        }
        byte[] bArr2 = new byte[y2];
        ija.e(0, bArr2, y2);
        return new wib(uuid, t, bArr2);
    }

    public static byte[] B(UUID uuid, byte[] bArr) {
        wib A = A(bArr);
        if (A == null) {
            return null;
        }
        UUID uuid2 = A.a;
        if (uuid.equals(uuid2)) {
            return A.c;
        }
        ez3.j0("UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
        return null;
    }

    public static String C(String str, List list, axb axb, xwb xwb) {
        String[] split = str.split("\r\n");
        int i = 0;
        while (true) {
            if (i >= split.length) {
                i = -1;
                break;
            } else if (split[i].startsWith("m=audio")) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            c(axb, xwb, "failed to find m=audio line in sdp");
            return str;
        }
        vxf a2 = vxf.a(i, split[i]);
        if (a2 == null) {
            c(axb, xwb, "failed to parse m=audio line");
            return str;
        }
        int i2 = i + 1;
        while (i2 < split.length && !split[i2].startsWith("m=audio")) {
            a2.e(i2, split[i2]);
            i2++;
        }
        if (!a2.d(list)) {
            c(axb, xwb, "failed to find any desired codecs");
            return str;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (int i3 = 0; i3 < split.length; i3++) {
            int i4 = a2.c;
            if (i3 == i4) {
                a2.f(sb, list, false);
            } else if (i3 != i4 && !a2.a.contains(Integer.valueOf(i3))) {
                sb.append(split[i3]);
                sb.append("\r\n");
            } else if (!z) {
                a2.c(sb, list, false);
                z = true;
            }
        }
        return sb.toString();
    }

    public static void D(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        if (obj != null) {
            int i = 0;
            if (obj instanceof gr8) {
                int length = stringBuffer.length();
                if (str != null) {
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(n(str));
                    stringBuffer2.append(" <\n");
                    stringBuffer.append("  ");
                }
                Class<?> cls = obj.getClass();
                for (Field field : cls.getFields()) {
                    int modifiers = field.getModifiers();
                    String name = field.getName();
                    if (!"cachedSize".equals(name) && (modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith("_") && !name.endsWith("_")) {
                        Class<?> type = field.getType();
                        Object obj2 = field.get(obj);
                        if (!type.isArray()) {
                            D(name, obj2, stringBuffer, stringBuffer2);
                        } else if (type.getComponentType() == Byte.TYPE) {
                            D(name, obj2, stringBuffer, stringBuffer2);
                        } else {
                            int length2 = obj2 == null ? 0 : Array.getLength(obj2);
                            for (int i2 = 0; i2 < length2; i2++) {
                                D(name, Array.get(obj2, i2), stringBuffer, stringBuffer2);
                            }
                        }
                    }
                }
                Method[] methods = cls.getMethods();
                int length3 = methods.length;
                while (i < length3) {
                    String name2 = methods[i].getName();
                    if (name2.startsWith("set")) {
                        String substring = name2.substring(3);
                        try {
                            if (((Boolean) cls.getMethod("has" + substring, (Class[]) null).invoke(obj, (Object[]) null)).booleanValue()) {
                                D(substring, cls.getMethod("get" + substring, (Class[]) null).invoke(obj, (Object[]) null), stringBuffer, stringBuffer2);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                    i++;
                }
                if (str != null) {
                    stringBuffer.setLength(length);
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(">\n");
                }
            } else if (obj instanceof Map) {
                String n = n(str);
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(n);
                    stringBuffer2.append(" <\n");
                    int length4 = stringBuffer.length();
                    stringBuffer.append("  ");
                    D("key", entry.getKey(), stringBuffer, stringBuffer2);
                    D("value", entry.getValue(), stringBuffer, stringBuffer2);
                    stringBuffer.setLength(length4);
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(">\n");
                }
            } else {
                String n2 = n(str);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(n2);
                stringBuffer2.append(": ");
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str2.startsWith("http") && str2.length() > 200) {
                        str2 = str2.substring(0, 200) + "[...]";
                    }
                    int length5 = str2.length();
                    StringBuilder sb = new StringBuilder(length5);
                    while (i < length5) {
                        char charAt = str2.charAt(i);
                        if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\'') {
                            sb.append(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                        } else {
                            sb.append(charAt);
                        }
                        i++;
                    }
                    String sb2 = sb.toString();
                    stringBuffer2.append("\"");
                    stringBuffer2.append(sb2);
                    stringBuffer2.append("\"");
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    stringBuffer2.append('\"');
                    while (i < bArr.length) {
                        byte b2 = bArr[i] & 255;
                        if (b2 == 92 || b2 == 34) {
                            stringBuffer2.append('\\');
                            stringBuffer2.append((char) b2);
                        } else if (b2 < 32 || b2 >= Byte.MAX_VALUE) {
                            stringBuffer2.append(String.format("\\%03o", new Object[]{Integer.valueOf(b2)}));
                        } else {
                            stringBuffer2.append((char) b2);
                        }
                        i++;
                    }
                    stringBuffer2.append('\"');
                } else {
                    stringBuffer2.append(obj);
                }
                stringBuffer2.append("\n");
            }
        }
    }

    public static long E(ija ija, int i, int i2) {
        ija.G(i);
        if (ija.a() < 5) {
            return -9223372036854775807L;
        }
        int g = ija.g();
        if ((8388608 & g) != 0 || ((2096896 & g) >> 8) != i2 || (g & 32) == 0 || ija.u() < 7 || ija.a() < 7 || (ija.u() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        ija.e(0, bArr, 6);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
    }

    public static int F(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static final void G(View view, nc7 nc7) {
        view.setTag(drb.view_tree_lifecycle_owner, nc7);
    }

    public static int[] H(Collection collection) {
        if (collection instanceof j07) {
            j07 j07 = (j07) collection;
            return Arrays.copyOfRange(j07.a, j07.b, j07.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static final q2d I(gj1 gj1) {
        ge1 ge1 = gj1.f;
        Long l = gj1.g;
        return new q2d(gj1.e, ge1, gj1.a, l, gj1.b, gj1.d, gj1.c);
    }

    public static final String J(byte b2) {
        return b2 == 1 ? "quotation mark '\"'" : b2 == 2 ? "string escape sequence '\\'" : b2 == 4 ? "comma ','" : b2 == 5 ? "colon ':'" : b2 == 6 ? "start of the object '{'" : b2 == 7 ? "end of the object '}'" : b2 == 8 ? "start of the array '['" : b2 == 9 ? "end of the array ']'" : b2 == 10 ? "end of the input" : b2 == Byte.MAX_VALUE ? "invalid token" : "valid token";
    }

    public static Integer K(String str) {
        Long l;
        byte b2;
        byte b3;
        String str2 = str;
        str.getClass();
        if (!str.isEmpty()) {
            int i = 0;
            if (str2.charAt(0) == '-') {
                i = 1;
            }
            if (i != str.length()) {
                int i2 = i + 1;
                char charAt = str2.charAt(i);
                if (charAt < 128) {
                    b2 = wq7.a[charAt];
                } else {
                    byte[] bArr = wq7.a;
                    b2 = -1;
                }
                if (b2 >= 0 && b2 < 10) {
                    long j = (long) (-b2);
                    long j2 = (long) 10;
                    long j3 = Long.MIN_VALUE / j2;
                    while (true) {
                        if (i2 < str.length()) {
                            int i3 = i2 + 1;
                            char charAt2 = str2.charAt(i2);
                            if (charAt2 < 128) {
                                b3 = wq7.a[charAt2];
                            } else {
                                byte[] bArr2 = wq7.a;
                                b3 = -1;
                            }
                            if (b3 < 0 || b3 >= 10 || j < j3) {
                                break;
                            }
                            long j4 = j * j2;
                            long j5 = (long) b3;
                            if (j4 < j5 - Long.MIN_VALUE) {
                                break;
                            }
                            j = j4 - j5;
                            i2 = i3;
                        } else if (i != 0) {
                            l = Long.valueOf(j);
                        } else if (j != Long.MIN_VALUE) {
                            l = Long.valueOf(-j);
                        }
                    }
                }
            }
        }
        l = null;
        if (l == null || l.longValue() != ((long) l.intValue())) {
            return null;
        }
        return Integer.valueOf(l.intValue());
    }

    public static final eue L(Continuation continuation, hu3 hu3, Object obj) {
        eue eue = null;
        if (!(continuation instanceof qu3)) {
            return null;
        }
        if (hu3.get(fue.a) != null) {
            qu3 qu3 = (qu3) continuation;
            while (true) {
                if (!(qu3 instanceof li4) && (qu3 = qu3.getCallerFrame()) != null) {
                    if (qu3 instanceof eue) {
                        eue = (eue) qu3;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (eue != null) {
                eue.I(hu3, obj);
            }
        }
        return eue;
    }

    public static final void M(bve bve) {
        kjd.V(bve);
        bve.e(bp7.class, new n5b(16));
        bve.e(iz2.class, new n5b(17));
        bve.e(pk.class, new tpc(26));
        bve.e(mf6.class, new vpc(4));
        bve.e(mtf.class, new vpc(15));
        bve.e(jee.class, new vpc(26));
        bve.e(gee.class, new wpc(7));
        bve.e(und.class, new wpc(18));
        bve.e(zz2.class, new wpc(29));
        bve.e(aa4.class, new xpc(10));
        bve.e(q54.class, new xpc(21));
        Class<pp7> cls = pp7.class;
        bve.c(cls, new y7b(11));
        bve.e(h3d.class, new h2b(16));
        bve.e(kd3.class, new h2b(27));
        bve.e(f3d.class, new rpc(8));
        bve.e(ad3.class, new rpc(19));
        bve.e(dce.class, new spc(0));
        bve.e(qbe.class, new spc(11));
        bve.e(l2d.class, new spc(22));
        bve.e(sce.class, new tpc(3));
        bve.e(zs7.class, new tpc(14));
        bve.e(tt0.class, new tpc(25));
        bve.e(luf.class, new upc(7));
        bve.e(cde.class, new upc(18));
        bve.e(hz3.class, new upc(26));
        bve.e(a04.class, new upc(27));
        bve.e(zpc.class, new upc(28));
        bve.e(bqc.class, new upc(29));
        bve.e(cqc.class, new vpc(0));
        bve.e(c9a.class, new vpc(1));
        bve.e(bec.class, new n5b(18));
        bve.e(OneMeRoomDatabase.class, new n5b(19));
        bve.e(xff.class, new y7b(21));
        bve.e(in7.class, new vpc(2));
        bve.c(cls, new y7b(13));
        bve.e(bd.class, new vpc(3));
        bve.e(of6.class, new y7b(22));
        bve.e(vp9.class, new y7b(23));
        bve.e(pva.class, new vpc(5));
        bve.e(ldf.class, new vpc(6));
        bve.e(tg.class, new vpc(7));
        bve.e(ap3.class, new vpc(8));
        bve.e(w94.class, new vpc(9));
        bve.e(o2b.class, new vpc(10));
        bve.c(cls, new y7b(14));
        bve.e(q2b.class, new vpc(11));
        bve.e(s2b.class, new vpc(12));
        bve.e(di3.class, new vpc(13));
        bve.e(p1b.class, new vpc(14));
        bve.e(n1b.class, new vpc(16));
        bve.e(os8.class, new vpc(17));
        bve.e(ir8.class, new vpc(18));
        bve.e(gn8.class, new n5b(20));
        bve.e(go2.class, new vpc(19));
        bve.e(rp8.class, new vpc(20));
        bve.e(b29.class, new vpc(21));
        bve.e(eha.class, new vpc(22));
        bve.e(to8.class, new vpc(23));
        bve.e(p72.class, new vpc(24));
        bve.e(qac.class, new vpc(25));
        bve.e(j92.class, new vpc(27));
        bve.e(t52.class, new vpc(28));
        bve.e(aw2.class, new vpc(29));
        bve.e(bv2.class, new wpc(0));
        bve.e(qkc.class, new wpc(1));
        bve.c(cls, new y7b(15));
        bve.e(pj2.class, new n5b(21));
        bve.e(kp2.class, new n5b(22));
        bve.e(tr2.class, new wpc(2));
        bve.e(xy1.class, new wpc(3));
        bve.e(vy1.class, new wpc(4));
        bve.e(x8c.class, new wpc(5));
        bve.e(r59.class, new wpc(6));
        bve.c(cls, new y7b(16));
        bve.e(yk9.class, new wpc(8));
        bve.c(cls, new y7b(17));
        bve.e(in3.class, new wpc(9));
        bve.e(bf5.class, new wpc(10));
        bve.e(zsd.class, new wpc(11));
        bve.e(kvd.class, new wpc(12));
        bve.e(pud.class, new wpc(13));
        bve.e(d0d.class, new wpc(14));
        bve.e(pl.class, new wpc(15));
        bve.e(v2c.class, new wpc(16));
        bve.e(uc5.class, new wpc(17));
        bve.e(wo7.class, new wpc(19));
        bve.e(lud.class, new wpc(20));
        bve.c(cls, new y7b(18));
        bve.e(fa5.class, new wpc(21));
        bve.e(l95.class, new wpc(22));
        bve.c(cls, new y7b(19));
        bve.e(xt.class, new wpc(23));
        bve.e(v72.class, new wpc(24));
        bve.c(cls, new y7b(20));
        bve.e(i99.class, new wpc(25));
        bve.e(w10.class, new wpc(26));
        bve.e(jc5.class, new wpc(27));
        bve.e(bkc.class, new wpc(28));
        bve.e(wr4.class, new xpc(0));
        bve.e(xod.class, new xpc(1));
        bve.e(qw9.class, new xpc(2));
        bve.e(yae.class, new xpc(3));
        bve.e(gy.class, new xpc(4));
        bve.e(bs8.class, new xpc(5));
        bve.e(m0c.class, new xpc(6));
        bve.e(jz2.class, new xpc(7));
        bve.e(y8c.class, new xpc(8));
        bve.e(n22.class, new xpc(9));
        bve.e(zj3.class, new xpc(11));
        bve.e(l92.class, new xpc(12));
        bve.e(lb1.class, new xpc(13));
        bve.e(zs8.class, new xpc(14));
        bve.e(n4b.class, new xpc(15));
        bve.e(jp7.class, new xpc(16));
        bve.e(di7.class, new xpc(17));
        bve.e(nee.class, new xpc(18));
        bve.e(ydc.class, new xpc(19));
        bve.e(oec.class, new xpc(20));
        bve.e(nec.class, new h2b(6));
        bve.e(xdc.class, new h2b(7));
        bve.e(afc.class, new h2b(8));
        bve.e(zec.class, new h2b(9));
        bve.e(zxe.class, new h2b(10));
        bve.e(ft8.class, new h2b(11));
        bve.e(om4.class, new h2b(12));
        bve.e(l3f.class, new h2b(13));
        bve.e(zl3.class, new h2b(14));
        bve.e(oa2.class, new h2b(15));
        bve.e(nud.class, new h2b(17));
        bve.e(p95.class, new h2b(18));
        bve.e(a95.class, new h2b(19));
        bve.e(n2c.class, new h2b(20));
        bve.e(j74.class, new h2b(21));
        bve.e(nb1.class, new h2b(22));
        bve.e(gj.class, new h2b(23));
        bve.e(rj.class, new h2b(24));
        bve.e(m07.class, new h2b(25));
        bve.e(lce.class, new h2b(26));
        bve.e(aa5.class, new h2b(28));
        bve.e(w95.class, new h2b(29));
        bve.e(ece.class, new rpc(0));
        bve.e(hb2.class, new rpc(1));
        bve.e(bce.class, new rpc(2));
        bve.e(wl9.class, new rpc(3));
        bve.e(kq9.class, new rpc(4));
        bve.c(cls, new y7b(1));
        bve.e(mm9.class, new rpc(5));
        bve.e(en9.class, new rpc(6));
        bve.e(szc.class, new rpc(7));
        bve.e(iv6.class, new rpc(9));
        bve.e(nce.class, new rpc(10));
        bve.e(sl9.class, new rpc(11));
        bve.e(am9.class, new rpc(12));
        bve.e(em9.class, new rpc(13));
        bve.e(pl9.class, new rpc(14));
        bve.e(nl9.class, new rpc(15));
        bve.e(om9.class, new rpc(16));
        bve.e(ll9.class, new rpc(17));
        bve.e(yl9.class, new rpc(18));
        bve.e(gl9.class, new rpc(20));
        bve.e(vl9.class, new rpc(21));
        bve.e(qm9.class, new rpc(22));
        bve.e(km9.class, new rpc(23));
        bve.e(pc0.class, new rpc(24));
        bve.e(m14.class, new rpc(25));
        bve.e(zo0.class, new rpc(26));
        bve.e(gm4.class, new rpc(27));
        bve.e(j3f.class, new rpc(28));
        bve.e(i3e.class, new rpc(29));
        bve.e(hy.class, new spc(1));
        bve.e(gsc.class, new spc(2));
        bve.e(voa.class, new spc(3));
        bve.e(noa.class, new spc(4));
        bve.c(cls, new y7b(2));
        bve.e(ph4.class, new spc(5));
        bve.e(ck4.class, new spc(6));
        bve.e(hjb.class, new spc(7));
        bve.c(cls, new y7b(3));
        bve.e(dq9.class, new spc(8));
        bve.c(cls, new y7b(4));
        bve.e(mr9.class, new spc(9));
        bve.e(x19.class, new spc(10));
        bve.c(cls, new y7b(5));
        bve.e(l19.class, new spc(12));
        bve.e(ed5.class, new spc(13));
        bve.e(u74.class, new spc(14));
        bve.e(gd5.class, new spc(15));
        bve.e(ywc.class, new spc(16));
        bve.e(kn3.class, new spc(17));
        bve.e(wf3.class, new spc(18));
        bve.e(ch3.class, new spc(19));
        bve.e(cn3.class, new spc(20));
        bve.e(mn3.class, new spc(21));
        bve.e(xf3.class, new spc(23));
        bve.e(dn3.class, new spc(24));
        bve.e(xp9.class, new spc(25));
        bve.c(cls, new y7b(6));
        bve.e(na5.class, new spc(26));
        bve.c(cls, new y7b(7));
        bve.e(eb5.class, new spc(27));
        bve.c(cls, new y7b(8));
        bve.e(jjb.class, new spc(28));
        bve.e(nr9.class, new spc(29));
        bve.e(ur9.class, new tpc(0));
        bve.c(cls, new y7b(9));
        bve.e(fj2.class, new tpc(1));
        bve.e(yj7.class, new tpc(2));
        bve.e(ab5.class, new tpc(4));
        bve.e(tp9.class, new tpc(5));
        bve.e(qp9.class, new tpc(6));
        bve.e(wae.class, new tpc(7));
        bve.e(zf3.class, new tpc(8));
        bve.e(dhe.class, new tpc(9));
        bve.e(xq6.class, new tpc(10));
        bve.e(lu7.class, new tpc(11));
        bve.e(l86.class, new tpc(12));
        bve.e(s40.class, new tpc(13));
        bve.e(xhd.class, new tpc(15));
        bve.d(hi7.class, new tpc(16));
        bve.d(vs7.class, new tpc(17));
        bve.d(ns7.class, new tpc(18));
        bve.d(s59.class, new tpc(19));
        bve.d(ae5.class, new tpc(20));
        bve.d(e74.class, new tpc(21));
        bve.b(cls, new y7b(10));
        bve.d(dr9.class, new tpc(22));
        bve.d(z8c.class, new tpc(23));
        bve.d(wd5.class, new tpc(24));
        bve.d(hxe.class, new tpc(27));
        bve.d(ry.class, new tpc(28));
        bve.d(v86.class, new tpc(29));
        bve.d(kbd.class, new upc(0));
        bve.d(i2c.class, new upc(1));
        bve.d(n86.class, new upc(2));
        bve.d(sxc.class, new upc(3));
        bve.d(rv1.class, new upc(4));
        bve.d(oo3.class, new upc(5));
        bve.d(rp1.class, new upc(6));
        bve.b(cls, new y7b(12));
        bve.d(g02.class, new upc(8));
        bve.d(zc2.class, new upc(9));
        bve.d(th8.class, new upc(10));
        bve.d(om3.class, new upc(11));
        bve.d(btd.class, new upc(12));
        bve.d(gt3.class, new upc(13));
        bve.d(sk7.class, new upc(14));
        bve.d(g4b.class, new upc(15));
        bve.d(i92.class, new upc(16));
        bve.d(td7.class, new upc(17));
        bve.d(u92.class, new upc(19));
        bve.d(p97.class, new upc(20));
        bve.d(cr8.class, new n5b(23));
        bve.d(ap8.class, new n5b(24));
        bve.d(do8.class, new n5b(7));
        bve.d(e29.class, new n5b(8));
        bve.d(nve.class, new n5b(9));
        bve.d(hc5.class, new n5b(10));
        bve.d(uo7.class, new upc(21));
        bve.d(a.class, new upc(22));
        bve.d(xg0.class, new upc(23));
        bve.d(rj3.class, new n5b(11));
        bve.d(s76.class, new y7b(24));
        bve.d(n76.class, new upc(24));
        bve.d(zod.class, new n5b(12));
        bve.d(g5e.class, new n5b(13));
        bve.d(gz.class, new upc(25));
        bve.d(oa3.class, new n5b(14));
        bve.d(tve.class, new y7b(25));
        bve.d(lve.class, new y7b(26));
        bve.d(aqc.class, new n5b(15));
    }

    public static final cg3 a(Context context, s16 s16) {
        GestureDetector gestureDetector = new GestureDetector(context, new h76(0, s16));
        gestureDetector.setIsLongpressEnabled(false);
        return new cg3(gestureDetector, 3);
    }

    public static vxf b(boolean z, String[] strArr, xwb xwb) {
        String str = z ? "m=audio " : "m=video ";
        int i = 0;
        while (true) {
            if (i >= strArr.length) {
                i = -1;
                break;
            } else if (strArr[i].startsWith(str)) {
                break;
            } else {
                i++;
            }
        }
        String str2 = "m=video";
        if (i == -1) {
            if (z) {
                str2 = "m=audio";
            }
            xwb.log("CodecPrefUtil", "parseMSection: didn't find section: ".concat(str2));
            return null;
        }
        vxf a2 = vxf.a(i, strArr[i]);
        if (a2 == null) {
            if (z) {
                str2 = "m=audio";
            }
            xwb.log("CodecPrefUtil", "parseMSection: failed to parse line: ".concat(str2));
            return null;
        }
        while (true) {
            i++;
            if (i >= strArr.length || strArr[i].startsWith("m=")) {
                return a2;
            }
            a2.e(i, strArr[i]);
        }
        return a2;
    }

    public static void c(axb axb, xwb xwb, String str) {
        axb.log(tqd.x0, "fail", (String) null);
        xwb.log("CodecPrefUtil", str);
    }

    public static final void d(rde rde, hee hee, String str) {
        Logger logger = kee.i;
        logger.fine(hee.f + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + rde.c);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String e(java.lang.String r22, java.lang.String r23, java.lang.String r24, axb r25, xwb r26) {
        /*
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            java.lang.String r5 = "\r\n"
            java.lang.String[] r6 = r0.split(r5)
            r7 = 0
            r8 = r7
        L_0x0012:
            int r9 = r6.length
            java.lang.String r10 = "m=audio"
            r11 = -1
            if (r8 >= r9) goto L_0x0024
            r9 = r6[r8]
            boolean r9 = r9.startsWith(r10)
            if (r9 == 0) goto L_0x0021
            goto L_0x0025
        L_0x0021:
            int r8 = r8 + 1
            goto L_0x0012
        L_0x0024:
            r8 = r11
        L_0x0025:
            if (r8 != r11) goto L_0x002d
            java.lang.String r1 = "failed to find m=audio line in sdp"
            c(r3, r4, r1)
            return r0
        L_0x002d:
            r9 = r6[r8]
            vxf r9 = vxf.a(r8, r9)
            if (r9 != 0) goto L_0x003b
            java.lang.String r1 = "failed to parse m=audio line"
            c(r3, r4, r1)
            return r0
        L_0x003b:
            r11 = 1
            int r8 = r8 + r11
        L_0x003d:
            int r12 = r6.length
            if (r8 >= r12) goto L_0x0051
            r12 = r6[r8]
            boolean r12 = r12.startsWith(r10)
            if (r12 == 0) goto L_0x0049
            goto L_0x0051
        L_0x0049:
            r12 = r6[r8]
            r9.e(r8, r12)
            int r8 = r8 + 1
            goto L_0x003d
        L_0x0051:
            java.lang.String r8 = "opus"
            java.util.ArrayList r10 = r9.b(r8)
            boolean r10 = r10.isEmpty()
            r10 = r10 ^ r11
            if (r10 != 0) goto L_0x0064
            java.lang.String r1 = "failed to find desired codec"
            c(r3, r4, r1)
            return r0
        L_0x0064:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r8 = r9.b(r8)
            java.util.Iterator r8 = r8.iterator()
            r12 = 0
            r13 = 0
        L_0x0073:
            boolean r14 = r8.hasNext()
            java.lang.String r15 = "a=fmtp:"
            if (r14 == 0) goto L_0x00a4
            java.lang.Object r12 = r8.next()
            pxf r12 = (pxf) r12
            java.lang.String r14 = r12.a
            java.util.ArrayList r12 = r12.c
            java.util.Iterator r12 = r12.iterator()
        L_0x0089:
            boolean r16 = r12.hasNext()
            if (r16 == 0) goto L_0x00a2
            java.lang.Object r16 = r12.next()
            r9 = r16
            java.lang.String r9 = (java.lang.String) r9
            r10.add(r9)
            boolean r16 = r9.startsWith(r15)
            if (r16 == 0) goto L_0x0089
            r13 = r9
            goto L_0x0089
        L_0x00a2:
            r12 = r14
            goto L_0x0073
        L_0x00a4:
            if (r12 != 0) goto L_0x00ac
            java.lang.String r1 = "failed to find desired lines"
            c(r3, r4, r1)
            return r0
        L_0x00ac:
            if (r13 == 0) goto L_0x0129
            boolean r8 = r13.startsWith(r15)
            if (r8 != 0) goto L_0x00b5
            goto L_0x00be
        L_0x00b5:
            r8 = 32
            r9 = 6
            int r8 = r13.indexOf(r8, r9)
            if (r8 >= 0) goto L_0x00c5
        L_0x00be:
            r21 = r12
            r18 = r13
            r14 = 0
            r12 = r7
            goto L_0x011a
        L_0x00c5:
            java.lang.String r9 = r13.substring(r7, r8)
            int r8 = r8 + r11
            java.lang.String r8 = r13.substring(r8)
            v2b r14 = new v2b
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            java.lang.String r7 = ";"
            java.lang.String[] r7 = r8.split(r7)
            int r8 = r7.length
            r18 = r13
            r13 = 0
        L_0x00df:
            if (r13 >= r8) goto L_0x0114
            r19 = r7[r13]
            r20 = r7
            java.lang.String r7 = r19.trim()
            r19 = r8
            r8 = 61
            int r8 = r7.indexOf(r8)
            if (r8 >= 0) goto L_0x00f8
            r21 = r12
            r8 = 0
            r12 = 0
            goto L_0x0108
        L_0x00f8:
            r21 = r12
            r12 = 0
            java.lang.String r17 = r7.substring(r12, r8)
            int r8 = r8 + 1
            java.lang.String r7 = r7.substring(r8)
            r8 = r7
            r7 = r17
        L_0x0108:
            r11.put(r7, r8)
            int r13 = r13 + 1
            r8 = r19
            r7 = r20
            r12 = r21
            goto L_0x00df
        L_0x0114:
            r21 = r12
            r12 = 0
            r14.<init>(r9, r11)
        L_0x011a:
            if (r14 != 0) goto L_0x011d
            return r0
        L_0x011d:
            boolean r7 = r14.b(r1, r2, r3, r4)
            if (r7 != 0) goto L_0x0124
            return r0
        L_0x0124:
            java.lang.String r0 = r14.toString()
            goto L_0x012f
        L_0x0129:
            r21 = r12
            r18 = r13
            r12 = r7
            r0 = 0
        L_0x012f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            if (r0 != 0) goto L_0x017a
            r0 = r12
        L_0x0137:
            int r8 = r6.length
            if (r0 >= r8) goto L_0x0196
            r8 = r6[r0]
            r7.append(r8)
            r7.append(r5)
            int r0 = r0 + 1
            int r9 = r6.length
            if (r0 >= r9) goto L_0x0149
            r9 = 1
            goto L_0x014a
        L_0x0149:
            r9 = r12
        L_0x014a:
            boolean r8 = r10.contains(r8)
            if (r8 == 0) goto L_0x015b
            if (r9 == 0) goto L_0x015f
            r8 = r6[r0]
            boolean r8 = r10.contains(r8)
            if (r8 != 0) goto L_0x015b
            goto L_0x015f
        L_0x015b:
            r14 = r21
            r11 = 0
            goto L_0x0177
        L_0x015f:
            v2b r8 = new v2b
            r14 = r21
            java.lang.String r9 = r15.concat(r14)
            r11 = 0
            r8.<init>(r9, r11)
            boolean r9 = r8.b(r1, r2, r3, r4)
            if (r9 == 0) goto L_0x0177
            r7.append(r8)
            r7.append(r5)
        L_0x0177:
            r21 = r14
            goto L_0x0137
        L_0x017a:
            int r1 = r6.length
        L_0x017b:
            if (r12 >= r1) goto L_0x0196
            r2 = r6[r12]
            r13 = r18
            boolean r3 = r2.equals(r13)
            if (r3 == 0) goto L_0x018b
            r7.append(r0)
            goto L_0x018e
        L_0x018b:
            r7.append(r2)
        L_0x018e:
            r7.append(r5)
            int r12 = r12 + 1
            r18 = r13
            goto L_0x017b
        L_0x0196:
            java.lang.String r0 = r7.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xie.e(java.lang.String, java.lang.String, java.lang.String, axb, xwb):java.lang.String");
    }

    public static List f(int... iArr) {
        return iArr.length == 0 ? Collections.emptyList() : new j07(0, iArr.length, iArr);
    }

    public static ArrayList g(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) (((bArr[11] & 255) << 8) | (bArr[10] & 255))) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000).array());
        return arrayList;
    }

    public static byte[] h(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            allocate.putInt(0);
        } else {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static final int i(Spanned spanned) {
        Object[] objArr;
        int hashCode = spanned.toString().hashCode();
        try {
            objArr = spanned.getSpans(0, spanned.length(), Object.class);
        } catch (Throwable unused) {
            objArr = null;
        }
        if (objArr == null) {
            return hashCode;
        }
        int length = (hashCode * 31) + objArr.length;
        for (Object obj : objArr) {
            if (obj != null) {
                if (obj != spanned) {
                    length = (length * 31) + obj.hashCode();
                }
                int spanStart = spanned.getSpanStart(obj);
                length = spanned.getSpanFlags(obj) + ((spanned.getSpanEnd(obj) + ((spanStart + (length * 31)) * 31)) * 31);
            }
        }
        return length;
    }

    public static final byte j(char c2) {
        if (c2 < '~') {
            return v12.b[c2];
        }
        return 0;
    }

    public static final void k(File file) {
        File parentFile;
        if (!file.exists() || !file.canWrite()) {
            File parentFile2 = file.getParentFile();
            if (parentFile2 != null && !parentFile2.exists() && (parentFile = file.getParentFile()) != null && !parentFile.mkdirs()) {
                File absoluteFile = file.getAbsoluteFile();
                throw new IOException("Can't create log file parent dirs=" + absoluteFile);
            } else if (!file.createNewFile()) {
                throw new IOException(rf0.h("Can't create log file=", file.getAbsolutePath()));
            } else if (!file.canWrite()) {
                throw new IOException(rf0.h("Can't write to file=", file.getAbsolutePath()));
            }
        }
    }

    public static int l(long j) {
        int i = (int) j;
        a06.j(j, "Out of range: %s", ((long) i) == j);
        return i;
    }

    public static final ys0 m(tr6 tr6, ys0 ys0, ys0 ys02, at6 at6) {
        String str;
        rr6 rr6 = rr6.a;
        rr6 rr62 = tr6.a;
        if (rr62 == rr6) {
            return ys0;
        }
        if (rr62 == rr6.b) {
            return ys02;
        }
        if (rr62 != rr6.c || (str = tr6.u) == null) {
            return null;
        }
        return (ys0) at6.get(str);
    }

    public static String n(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (i == 0) {
                stringBuffer.append(Character.toLowerCase(charAt));
            } else if (Character.isUpperCase(charAt)) {
                stringBuffer.append('_');
                stringBuffer.append(Character.toLowerCase(charAt));
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }

    public static void o(String str, xwb xwb) {
        String[] split = str.split("\r\n");
        vxf b2 = b(true, split, xwb);
        if (b2 == null) {
            xwb.log("CodecPrefUtil", "dumpCodecs: failed to parse m=audio line");
        } else {
            xwb.log("CodecPrefUtil", "dumpCodecs: m=audio section priority:");
            for (Map.Entry value : b2.d.entrySet()) {
                xwb.log("CodecPrefUtil", "dumpCodecs: " + ((pxf) value.getValue()).b);
            }
        }
        vxf b3 = b(false, split, xwb);
        if (b3 == null) {
            xwb.log("CodecPrefUtil", "dumpCodecs: failed to parse m=video line");
            return;
        }
        xwb.log("CodecPrefUtil", "dumpCodecs: m=video section priority:");
        for (Map.Entry value2 : b3.d.entrySet()) {
            xwb.log("CodecPrefUtil", "dumpCodecs: " + ((pxf) value2.getValue()).b);
        }
    }

    public static final hu3 p(hu3 hu3, hu3 hu32, boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) hu3.fold(bool, new vg0(10))).booleanValue();
        boolean booleanValue2 = ((Boolean) hu32.fold(bool, new vg0(10))).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return hu3.plus(hu32);
        }
        bw4 bw4 = bw4.a;
        hu3 hu33 = (hu3) hu3.fold(bw4, new vg0(11));
        Object obj = hu32;
        if (booleanValue2) {
            obj = hu32.fold(bw4, new vg0(12));
        }
        return hu33.plus((hu3) obj);
    }

    public static final String q(long j) {
        return String.format("%6s", Arrays.copyOf(new Object[]{j <= ((long) -999500000) ? wn6.k(new StringBuilder(), (j - ((long) 500000000)) / ((long) 1000000000), " s ") : j <= ((long) -999500) ? wn6.k(new StringBuilder(), (j - ((long) 500000)) / ((long) 1000000), " ms") : j <= 0 ? wn6.k(new StringBuilder(), (j - ((long) 500)) / ((long) 1000), " µs") : j < ((long) 999500) ? wn6.k(new StringBuilder(), (j + ((long) 500)) / ((long) 1000), " µs") : j < ((long) 999500000) ? wn6.k(new StringBuilder(), (j + ((long) 500000)) / ((long) 1000000), " ms") : wn6.k(new StringBuilder(), (j + ((long) 500000000)) / ((long) 1000000000), " s ")}, 1));
    }

    public static int r(byte[] bArr) {
        boolean z = bArr.length >= 4;
        int length = bArr.length;
        if (z) {
            return (bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
        }
        throw new IllegalArgumentException(n06.x("array too small: %s < %s", Integer.valueOf(length), 4));
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [java.lang.Object, hoa] */
    /* JADX WARNING: type inference failed for: r8v10, types: [ooa, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01e5, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a1, code lost:
        r14 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a4, code lost:
        r14 = r6;
        r2 = r16;
        r3 = r19;
        r1 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ad, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00af, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b0, code lost:
        r22 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01a0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01a7, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01a8, code lost:
        r1 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ae, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01af, code lost:
        r19 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01b6, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01b7, code lost:
        r16 = r2;
        r19 = r5;
        r1 = r13;
        r14 = r6;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ad A[ExcHandler: all (th java.lang.Throwable), Splitter:B:9:0x0033] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Collection s(android.content.Context r24, g15 r25) {
        /*
            java.lang.String r2 = "loadPhonebook failed"
            java.lang.String r0 = "/photo"
            java.lang.String r3 = "vnd.android.cursor.item/name"
            java.lang.String r4 = "vnd.android.cursor.item/phone_v2"
            java.lang.String r5 = "xie"
            android.content.ContentResolver r6 = r24.getContentResolver()
            if (r6 != 0) goto L_0x0015
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L_0x0015:
            uq7 r12 = new uq7
            r12.<init>()
            uq7 r13 = new uq7
            r13.<init>()
            java.lang.String r9 = "mimetype IN (?, ?)"
            java.lang.String[] r10 = new java.lang.String[]{r4, r3}     // Catch:{ Exception -> 0x01ca, all -> 0x01c6 }
            android.net.Uri r7 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ Exception -> 0x01ca, all -> 0x01c6 }
            java.lang.String[] r8 = c     // Catch:{ Exception -> 0x01ca, all -> 0x01c6 }
            java.lang.String r11 = "display_name ASC"
            android.database.Cursor r6 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x01ca, all -> 0x01c6 }
            if (r6 == 0) goto L_0x01b2
            java.lang.String r7 = "_id"
            int r7 = r6.getColumnIndex(r7)     // Catch:{ Exception -> 0x01b6, all -> 0x00ad }
            java.lang.String r8 = "mimetype"
            int r8 = r6.getColumnIndex(r8)     // Catch:{ Exception -> 0x01b6, all -> 0x00ad }
            java.lang.String r9 = "contact_id"
            int r9 = r6.getColumnIndex(r9)     // Catch:{ Exception -> 0x01b6, all -> 0x00ad }
            java.lang.String r10 = "display_name"
            int r10 = r6.getColumnIndex(r10)     // Catch:{ Exception -> 0x01b6, all -> 0x00ad }
            java.lang.String r11 = "data1"
            int r11 = r6.getColumnIndex(r11)     // Catch:{ Exception -> 0x01b6, all -> 0x00ad }
            java.lang.String r1 = "photo_uri"
            int r1 = r6.getColumnIndex(r1)     // Catch:{ Exception -> 0x01b6, all -> 0x00ad }
            java.lang.String r15 = "data2"
            int r15 = r6.getColumnIndex(r15)     // Catch:{ Exception -> 0x01b6, all -> 0x00ad }
            java.lang.String r14 = "data3"
            int r14 = r6.getColumnIndex(r14)     // Catch:{ Exception -> 0x01b6, all -> 0x00ad }
            r16 = r2
            java.lang.String r2 = "data5"
            int r2 = r6.getColumnIndex(r2)     // Catch:{ Exception -> 0x01ae, all -> 0x00ad }
        L_0x0069:
            boolean r17 = r6.moveToNext()     // Catch:{ Exception -> 0x01ae, all -> 0x00ad }
            if (r17 == 0) goto L_0x01b2
            r18 = r14
            r17 = r15
            long r14 = r6.getLong(r9)     // Catch:{ Exception -> 0x01ae, all -> 0x00ad }
            r19 = r5
            java.lang.String r5 = r6.getString(r8)     // Catch:{ Exception -> 0x01ab, all -> 0x00ad }
            java.lang.Object r20 = r13.c(r14)     // Catch:{ Exception -> 0x01ab, all -> 0x00ad }
            ooa r20 = (ooa) r20     // Catch:{ Exception -> 0x01ab, all -> 0x00ad }
            if (r20 != 0) goto L_0x00b3
            r21 = r8
            ooa r8 = new ooa     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
            r8.<init>()     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
            r22 = r13
            r13 = 0
            r8.a = r13     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            r8.b = r13     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            r8.c = r13     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            r13 = 0
            r8.d = r13     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            r23 = r2
            r13 = r3
            r2 = 0
            r8.e = r2     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
        L_0x009f:
            r2 = 0
            goto L_0x00bd
        L_0x00a1:
            r14 = r6
            goto L_0x0282
        L_0x00a4:
            r14 = r6
            r2 = r16
            r3 = r19
            r1 = r22
            goto L_0x01d3
        L_0x00ad:
            r0 = move-exception
            goto L_0x00a1
        L_0x00af:
            r0 = move-exception
            r22 = r13
            goto L_0x00a4
        L_0x00b3:
            r23 = r2
            r21 = r8
            r22 = r13
            r13 = r3
            r8 = r20
            goto L_0x009f
        L_0x00bd:
            r8.a = r2     // Catch:{ Exception -> 0x01a7, all -> 0x00ad }
            r8.b = r2     // Catch:{ Exception -> 0x01a7, all -> 0x00ad }
            boolean r3 = r4.equals(r5)     // Catch:{ Exception -> 0x01a7, all -> 0x00ad }
            if (r3 == 0) goto L_0x0131
            java.lang.String r3 = r6.getString(r11)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            boolean r5 = defpackage.r1g.p(r3)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            if (r5 == 0) goto L_0x00df
            r3 = r13
            r15 = r17
            r14 = r18
            r5 = r19
            r8 = r21
            r13 = r22
            r2 = r23
            goto L_0x0069
        L_0x00df:
            java.lang.Object r5 = r12.c(r14)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            java.util.Set r5 = (java.util.Set) r5     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            if (r5 != 0) goto L_0x00f2
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            bs r5 = defpackage.kjd.d(r3)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            goto L_0x00f5
        L_0x00f0:
            r0 = move-exception
            goto L_0x00a4
        L_0x00f2:
            r5.add(r3)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
        L_0x00f5:
            r12.f(r14, r5)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            int r3 = r6.getInt(r9)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            r8.d = r3     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            long r2 = r6.getLong(r7)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            r8.e = r2     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            java.lang.String r2 = r6.getString(r10)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            java.lang.String r3 = r8.a     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            if (r3 != 0) goto L_0x010e
            r8.a = r2     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
        L_0x010e:
            java.lang.String r2 = r6.getString(r1)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            boolean r3 = defpackage.r1g.p(r2)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            if (r3 != 0) goto L_0x0124
            boolean r3 = r2.endsWith(r0)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            if (r3 == 0) goto L_0x0124
            java.lang.String r3 = ""
            java.lang.String r2 = r2.replace(r0, r3)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
        L_0x0124:
            r8.c = r2     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
        L_0x0126:
            r20 = r17
            r5 = r18
            r17 = r0
            r18 = r1
        L_0x012e:
            r1 = r22
            goto L_0x018c
        L_0x0131:
            boolean r2 = r13.equals(r5)     // Catch:{ Exception -> 0x01a7, all -> 0x00ad }
            if (r2 == 0) goto L_0x0126
            r2 = r17
            java.lang.String r3 = r6.getString(r2)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            r17 = r0
            r5 = r18
            java.lang.String r0 = r6.getString(r5)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            r18 = r1
            r20 = r2
            r1 = r23
            java.lang.String r2 = r6.getString(r1)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            boolean r23 = defpackage.r1g.p(r3)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            if (r23 == 0) goto L_0x0160
            boolean r2 = defpackage.r1g.q(r0)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            if (r2 == 0) goto L_0x015d
            r8.a = r0     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
        L_0x015d:
            r23 = r1
            goto L_0x012e
        L_0x0160:
            boolean r23 = defpackage.r1g.q(r2)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            if (r23 == 0) goto L_0x017f
            r23 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            r1.<init>()     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            r1.append(r3)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            java.lang.String r3 = " "
            r1.append(r3)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            r1.append(r2)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            r8.a = r1     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            goto L_0x0183
        L_0x017f:
            r23 = r1
            r8.a = r3     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
        L_0x0183:
            boolean r1 = defpackage.r1g.q(r0)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            if (r1 == 0) goto L_0x012e
            r8.b = r0     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            goto L_0x012e
        L_0x018c:
            r1.f(r14, r8)     // Catch:{ Exception -> 0x01a0, all -> 0x00ad }
            r14 = r5
            r3 = r13
            r0 = r17
            r5 = r19
            r15 = r20
            r8 = r21
            r2 = r23
            r13 = r1
            r1 = r18
            goto L_0x0069
        L_0x01a0:
            r0 = move-exception
        L_0x01a1:
            r14 = r6
            r2 = r16
        L_0x01a4:
            r3 = r19
            goto L_0x01d3
        L_0x01a7:
            r0 = move-exception
            r1 = r22
            goto L_0x01a1
        L_0x01ab:
            r0 = move-exception
        L_0x01ac:
            r1 = r13
            goto L_0x01a1
        L_0x01ae:
            r0 = move-exception
            r19 = r5
            goto L_0x01ac
        L_0x01b2:
            r19 = r5
            r1 = r13
            goto L_0x01be
        L_0x01b6:
            r0 = move-exception
            r16 = r2
            r19 = r5
            r1 = r13
            r14 = r6
            goto L_0x01a4
        L_0x01be:
            if (r6 == 0) goto L_0x01c3
            r6.close()
        L_0x01c3:
            r3 = r19
            goto L_0x01e8
        L_0x01c6:
            r0 = move-exception
            r14 = 0
            goto L_0x0282
        L_0x01ca:
            r0 = move-exception
            r16 = r2
            r19 = r5
            r1 = r13
            r3 = r19
            r14 = 0
        L_0x01d3:
            defpackage.udd.s(r3, r2, r0)     // Catch:{ all -> 0x0281 }
            ru.ok.tamtam.util.HandledException r0 = new ru.ok.tamtam.util.HandledException     // Catch:{ all -> 0x0281 }
            r0.<init>(r2)     // Catch:{ all -> 0x0281 }
            r2 = r25
            r4a r2 = (defpackage.r4a) r2     // Catch:{ all -> 0x0281 }
            r4 = 1
            r2.c(r0, r4)     // Catch:{ all -> 0x0281 }
            if (r14 == 0) goto L_0x01e8
            r14.close()
        L_0x01e8:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r13 = 0
        L_0x01ee:
            int r2 = r12.h()
            if (r13 >= r2) goto L_0x027c
            long r4 = r12.e(r13)
            java.lang.Object r2 = r12.i(r13)
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r4 = r1.c(r4)
            ooa r4 = (ooa) r4
            if (r4 != 0) goto L_0x0211
            java.lang.String r2 = "contact is null"
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            defpackage.udd.T(r3, r2, r5)
        L_0x020e:
            r2 = 1
            r4 = 0
            goto L_0x0279
        L_0x0211:
            if (r2 == 0) goto L_0x0270
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L_0x021a
            goto L_0x0270
        L_0x021a:
            java.util.Iterator r2 = r2.iterator()
        L_0x021e:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x020e
            java.lang.Object r5 = r2.next()
            java.lang.String r5 = (java.lang.String) r5
            hoa r6 = new hoa
            r6.<init>()
            int r7 = r4.d
            r6.b = r7
            r6.c = r5
            java.lang.String r7 = r4.a
            boolean r7 = defpackage.r1g.p(r7)
            if (r7 == 0) goto L_0x023f
            r7 = r5
            goto L_0x0241
        L_0x023f:
            java.lang.String r7 = r4.a
        L_0x0241:
            r6.e = r7
            java.lang.String r7 = r4.b
            r6.f = r7
            long r7 = r4.e
            r6.a = r7
            r7 = 0
            r6.h = r7
            java.lang.String r7 = r4.c
            r6.g = r7
            java.lang.Object r7 = r0.get(r5)
            hoa r7 = (hoa) r7
            if (r7 != 0) goto L_0x025e
            r0.put(r5, r6)
            goto L_0x021e
        L_0x025e:
            java.lang.String r7 = r7.a()
            java.lang.String r8 = r6.a()
            int r7 = r8.compareTo(r7)
            if (r7 >= 0) goto L_0x021e
            r0.put(r5, r6)
            goto L_0x021e
        L_0x0270:
            java.lang.String r2 = "phones is null or empty"
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            defpackage.udd.T(r3, r2, r5)
            r2 = 1
        L_0x0279:
            int r13 = r13 + r2
            goto L_0x01ee
        L_0x027c:
            java.util.Collection r0 = r0.values()
            return r0
        L_0x0281:
            r0 = move-exception
        L_0x0282:
            if (r14 == 0) goto L_0x0287
            r14.close()
        L_0x0287:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xie.s(android.content.Context, g15):java.util.Collection");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0051 A[SYNTHETIC, Splitter:B:37:0x0051] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x005e A[SYNTHETIC, Splitter:B:45:0x005e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String t(android.content.ContentResolver r5, android.net.Uri r6, g15 r7) {
        /*
            java.lang.String r0 = "xie"
            r1 = 0
            java.lang.String r2 = "r"
            android.content.res.AssetFileDescriptor r5 = r5.openAssetFileDescriptor(r6, r2)     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            if (r5 != 0) goto L_0x001c
            java.lang.String r6 = "getVCardStringFromUri: failed to get file descriptor"
            defpackage.udd.s(r0, r6, r1)     // Catch:{ Exception -> 0x001a, all -> 0x0018 }
            if (r5 == 0) goto L_0x0015
            r5.close()     // Catch:{ Exception -> 0x0015 }
        L_0x0015:
            return r1
        L_0x0016:
            r2 = r1
            goto L_0x003a
        L_0x0018:
            r6 = move-exception
            goto L_0x0059
        L_0x001a:
            r6 = move-exception
            goto L_0x0016
        L_0x001c:
            java.io.FileInputStream r6 = r5.createInputStream()     // Catch:{ Exception -> 0x001a, all -> 0x0018 }
            java.lang.String r7 = defpackage.ete.F(r6)     // Catch:{ Exception -> 0x002f, all -> 0x002b }
            defpackage.ete.o(r6)
            r5.close()     // Catch:{ Exception -> 0x002a }
        L_0x002a:
            return r7
        L_0x002b:
            r7 = move-exception
            r1 = r6
            r6 = r7
            goto L_0x0059
        L_0x002f:
            r2 = move-exception
            r4 = r2
            r2 = r6
            r6 = r4
            goto L_0x003a
        L_0x0034:
            r6 = move-exception
            r5 = r1
            goto L_0x0059
        L_0x0037:
            r6 = move-exception
            r5 = r1
            r2 = r5
        L_0x003a:
            java.lang.String r3 = "getVCardStringFromUri: failed to get vCardString from Uri"
            defpackage.udd.s(r0, r3, r6)     // Catch:{ all -> 0x0057 }
            ru.ok.tamtam.util.HandledException r6 = new ru.ok.tamtam.util.HandledException     // Catch:{ all -> 0x0057 }
            java.lang.String r0 = "getVCardStringFromUri failed"
            r6.<init>(r0)     // Catch:{ all -> 0x0057 }
            r4a r7 = (defpackage.r4a) r7     // Catch:{ all -> 0x0057 }
            r0 = 1
            r7.c(r6, r0)     // Catch:{ all -> 0x0057 }
            defpackage.ete.o(r2)
            if (r5 == 0) goto L_0x0054
            r5.close()     // Catch:{ Exception -> 0x0054 }
        L_0x0054:
            return r1
        L_0x0055:
            r1 = r2
            goto L_0x0059
        L_0x0057:
            r6 = move-exception
            goto L_0x0055
        L_0x0059:
            defpackage.ete.o(r1)
            if (r5 == 0) goto L_0x0061
            r5.close()     // Catch:{ Exception -> 0x0061 }
        L_0x0061:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xie.t(android.content.ContentResolver, android.net.Uri, g15):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009c, code lost:
        if (r10.isClosed() == false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009e, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b6, code lost:
        if (r10.isClosed() == false) goto L_0x009e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.SparseArray u(android.content.Context r11, java.util.List r12, g15 r13) {
        /*
            java.lang.String r0 = "getVCardsByPhoneContactIds failed"
            java.lang.String r1 = "_id IN ("
            android.util.SparseArray r2 = new android.util.SparseArray
            int r3 = r12.size()
            r2.<init>(r3)
            android.content.ContentResolver r11 = r11.getContentResolver()
            java.lang.String r3 = "xie"
            if (r11 != 0) goto L_0x001b
            java.lang.String r11 = "getVCardsByPhoneContactIds failed: contentResolver is null"
            defpackage.udd.r(r3, r11)
            return r2
        L_0x001b:
            r10 = 0
            java.lang.String r4 = ","
            java.lang.String r12 = android.text.TextUtils.join(r4, r12)     // Catch:{ Exception -> 0x0053 }
            android.net.Uri r5 = android.provider.ContactsContract.Contacts.CONTENT_URI     // Catch:{ Exception -> 0x0053 }
            java.lang.String[] r6 = b     // Catch:{ Exception -> 0x0053 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0053 }
            r4.<init>(r1)     // Catch:{ Exception -> 0x0053 }
            r4.append(r12)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r12 = ")"
            r4.append(r12)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r7 = r4.toString()     // Catch:{ Exception -> 0x0053 }
            r8 = 0
            r9 = 0
            r4 = r11
            android.database.Cursor r10 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0053 }
            if (r10 != 0) goto L_0x0055
            java.lang.String r11 = "getVCardsByPhoneContactIds failed: cursor is null"
            defpackage.udd.r(r3, r11)     // Catch:{ Exception -> 0x0053 }
            if (r10 == 0) goto L_0x0050
            boolean r11 = r10.isClosed()
            if (r11 != 0) goto L_0x0050
            r10.close()
        L_0x0050:
            return r2
        L_0x0051:
            r11 = move-exception
            goto L_0x00ba
        L_0x0053:
            r11 = move-exception
            goto L_0x00a2
        L_0x0055:
            java.lang.String r12 = "_id"
            int r12 = r10.getColumnIndex(r12)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r1 = "lookup"
            int r1 = r10.getColumnIndex(r1)     // Catch:{ Exception -> 0x0053 }
        L_0x0061:
            boolean r4 = r10.moveToNext()     // Catch:{ Exception -> 0x0053 }
            if (r4 == 0) goto L_0x0098
            int r4 = r10.getInt(r12)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r5 = r10.getString(r1)     // Catch:{ Exception -> 0x0053 }
            boolean r6 = defpackage.r1g.p(r5)     // Catch:{ Exception -> 0x0053 }
            if (r6 == 0) goto L_0x0084
            java.lang.String r11 = "getVCardsByPhoneContactIds failed: lookupKey is empty or null"
            defpackage.udd.r(r3, r11)     // Catch:{ Exception -> 0x0053 }
            boolean r11 = r10.isClosed()
            if (r11 != 0) goto L_0x0083
            r10.close()
        L_0x0083:
            return r2
        L_0x0084:
            android.net.Uri r6 = android.provider.ContactsContract.Contacts.CONTENT_VCARD_URI     // Catch:{ Exception -> 0x0053 }
            android.net.Uri r5 = android.net.Uri.withAppendedPath(r6, r5)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r5 = t(r11, r5, r13)     // Catch:{ Exception -> 0x0053 }
            boolean r6 = defpackage.r1g.p(r5)     // Catch:{ Exception -> 0x0053 }
            if (r6 != 0) goto L_0x0061
            r2.put(r4, r5)     // Catch:{ Exception -> 0x0053 }
            goto L_0x0061
        L_0x0098:
            boolean r11 = r10.isClosed()
            if (r11 != 0) goto L_0x00b9
        L_0x009e:
            r10.close()
            goto L_0x00b9
        L_0x00a2:
            defpackage.udd.s(r3, r0, r11)     // Catch:{ all -> 0x0051 }
            ru.ok.tamtam.util.HandledException r11 = new ru.ok.tamtam.util.HandledException     // Catch:{ all -> 0x0051 }
            r11.<init>(r0)     // Catch:{ all -> 0x0051 }
            r4a r13 = (defpackage.r4a) r13     // Catch:{ all -> 0x0051 }
            r12 = 1
            r13.c(r11, r12)     // Catch:{ all -> 0x0051 }
            if (r10 == 0) goto L_0x00b9
            boolean r11 = r10.isClosed()
            if (r11 != 0) goto L_0x00b9
            goto L_0x009e
        L_0x00b9:
            return r2
        L_0x00ba:
            if (r10 == 0) goto L_0x00c5
            boolean r12 = r10.isClosed()
            if (r12 != 0) goto L_0x00c5
            r10.close()
        L_0x00c5:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xie.u(android.content.Context, java.util.List, g15):android.util.SparseArray");
    }

    public static int v(int i, int i2, int i3, int[] iArr) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static final String w(rr3 rr3) {
        String name = rr3.getClass().getName();
        int hashCode = rr3.hashCode();
        return name + "@" + hashCode;
    }

    public static final hu3 x(ou3 ou3, hu3 hu3) {
        hu3 p = p(ou3.getCoroutineContext(), hu3, true);
        ha4 ha4 = oi4.a;
        return (p == ha4 || p.get(cqc.c) != null) ? p : p.plus(ha4);
    }

    public static void y(Context context, o10 o10, mg5 mg5) {
        File h = mg5.h(o10);
        if (h.exists()) {
            String s = js.s(o10.j.c);
            if ("application/vnd.android.package-archive".equals(s)) {
                try {
                    if (context.getPackageManager().canRequestPackageInstalls()) {
                        at7.L(new nm(context, 1));
                    }
                } catch (SecurityException e) {
                    udd.s("xie", "fail to install apk", e);
                    if (e.toString().contains("REQUEST_INSTALL_PACKAGES")) {
                        Intent intent = new Intent("android.intent.action.GET_CONTENT");
                        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                        intent.setDataAndType(mg5.f(context, h), s);
                        context.startActivity(intent);
                    }
                }
            } else {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setFlags(1);
                intent2.setDataAndType(mg5.f(context, h), s != null ? s : "*/*");
                if (s != null) {
                    try {
                        context.startActivity(intent2);
                    } catch (Exception unused) {
                        intent2.setDataAndType(mg5.f(context, h), "*/*");
                        context.startActivity(intent2);
                    }
                } else {
                    context.startActivity(intent2);
                }
            }
        } else {
            throw new FileNotFoundException("attach file not found");
        }
    }

    public static void z(Context context, xm8 xm8, o10 o10, to8 to8, mg5 mg5) {
        try {
            vl.b().b().f("ACTION_FILE_OPEN_VIEWER");
            y(context, o10, mg5);
        } catch (FileNotFoundException unused) {
            udd.s("xie", "file attach file not found", (Throwable) null);
            a06.H(0, context, context.getString(cic.b0));
            to8.u(xm8.a, o10.q, g10.a);
        } catch (Exception e) {
            udd.s("xie", "cant open file attach.", e);
            a06.H(0, context, context.getString(cic.t));
        }
    }
}
