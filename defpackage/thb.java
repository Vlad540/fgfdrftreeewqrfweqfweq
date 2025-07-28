package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;

/* renamed from: thb  reason: default package */
public final class thb implements js9 {
    public static final Charset f = Charset.forName("UTF-8");
    public static final cc5 g;
    public static final cc5 h;
    public static final u57 i = new u57(1);
    public OutputStream a;
    public final Map b;
    public final Map c;
    public final is9 d;
    public final uhb e = new uhb(this);

    static {
        Class<shb> cls = shb.class;
        g = new cc5("key", hr1.p(hr1.n(cls, new mx(1))));
        h = new cc5("value", hr1.p(hr1.n(cls, new mx(2))));
    }

    public thb(ByteArrayOutputStream byteArrayOutputStream, Map map, Map map2, is9 is9) {
        this.a = byteArrayOutputStream;
        this.b = map;
        this.c = map2;
        this.d = is9;
    }

    public static int g(cc5 cc5) {
        shb shb = (shb) ((Annotation) cc5.b.get(shb.class));
        if (shb != null) {
            return ((mx) shb).a;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final js9 a(cc5 cc5, Object obj) {
        c(cc5, obj, true);
        return this;
    }

    public final void b(cc5 cc5, int i2, boolean z) {
        if (!z || i2 != 0) {
            shb shb = (shb) ((Annotation) cc5.b.get(shb.class));
            if (shb != null) {
                h(((mx) shb).a << 3);
                h(i2);
                return;
            }
            throw new RuntimeException("Field has no @Protobuf config");
        }
    }

    public final void c(cc5 cc5, Object obj, boolean z) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z || charSequence.length() != 0) {
                    h((g(cc5) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f);
                    h(bytes.length);
                    this.a.write(bytes);
                }
            } else if (obj instanceof Collection) {
                for (Object c2 : (Collection) obj) {
                    c(cc5, c2, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry f2 : ((Map) obj).entrySet()) {
                    f(i, cc5, f2, false);
                }
            } else if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (!z || doubleValue != 0.0d) {
                    h((g(cc5) << 3) | 1);
                    this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
                }
            } else if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z || floatValue != 0.0f) {
                    h((g(cc5) << 3) | 5);
                    this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                }
            } else if (obj instanceof Number) {
                long longValue = ((Number) obj).longValue();
                if (!z || longValue != 0) {
                    shb shb = (shb) ((Annotation) cc5.b.get(shb.class));
                    if (shb != null) {
                        h(((mx) shb).a << 3);
                        i(longValue);
                        return;
                    }
                    throw new RuntimeException("Field has no @Protobuf config");
                }
            } else if (obj instanceof Boolean) {
                b(cc5, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (!z || bArr.length != 0) {
                    h((g(cc5) << 3) | 2);
                    h(bArr.length);
                    this.a.write(bArr);
                }
            } else {
                is9 is9 = (is9) this.b.get(obj.getClass());
                if (is9 != null) {
                    f(is9, cc5, obj, z);
                    return;
                }
                wze wze = (wze) this.c.get(obj.getClass());
                if (wze != null) {
                    uhb uhb = this.e;
                    uhb.a = false;
                    uhb.c = cc5;
                    uhb.b = z;
                    wze.a(obj, uhb);
                } else if (obj instanceof phb) {
                    b(cc5, ((phb) obj).a(), true);
                } else if (obj instanceof Enum) {
                    b(cc5, ((Enum) obj).ordinal(), true);
                } else {
                    f(this.d, cc5, obj, z);
                }
            }
        }
    }

    public final js9 d(cc5 cc5, int i2) {
        b(cc5, i2, true);
        return this;
    }

    public final js9 e(cc5 cc5, long j) {
        if (j != 0) {
            shb shb = (shb) ((Annotation) cc5.b.get(shb.class));
            if (shb != null) {
                h(((mx) shb).a << 3);
                i(j);
            } else {
                throw new RuntimeException("Field has no @Protobuf config");
            }
        }
        return this;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.io.OutputStream, bb7] */
    public final void f(is9 is9, cc5 cc5, Object obj, boolean z) {
        OutputStream outputStream;
        ? outputStream2 = new OutputStream();
        outputStream2.a = 0;
        try {
            outputStream = this.a;
            this.a = outputStream2;
            is9.a(obj, this);
            this.a = outputStream;
            long j = outputStream2.a;
            outputStream2.close();
            if (!z || j != 0) {
                h((g(cc5) << 3) | 2);
                i(j);
                is9.a(obj, this);
                return;
            }
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public final void h(int i2) {
        while (((long) (i2 & -128)) != 0) {
            this.a.write((i2 & 127) | 128);
            i2 >>>= 7;
        }
        this.a.write(i2 & 127);
    }

    public final void i(long j) {
        while ((-128 & j) != 0) {
            this.a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.a.write(((int) j) & 127);
    }
}
