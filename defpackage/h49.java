package defpackage;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: h49  reason: default package */
public final class h49 extends m18 {
    public final t97 e;
    public final t97 f;
    public final t97 g;
    public final t97 h;
    public final r7e i;

    public h49(t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976) {
        super(t976, t973);
        this.e = t97;
        this.f = t972;
        this.g = t974;
        this.h = t975;
        this.i = new r7e(new xq(21, t97));
    }

    public final gr8 a() {
        List list = (List) ((AtomicReference) this.c).get();
        jw6 jw6 = new jw6();
        int size = list.size();
        iw6[] iw6Arr = new iw6[size];
        for (int i2 = 0; i2 < size; i2++) {
            g49 g49 = (g49) list.get(i2);
            iw6 iw6 = new iw6();
            try {
                iw6.a = g49.a;
                iw6.b = g49.b.toString();
                CharSequence charSequence = g49.c;
                String str = null;
                String obj = charSequence != null ? charSequence.toString() : null;
                String str2 = BuildConfig.FLAVOR;
                if (obj == null) {
                    obj = str2;
                }
                iw6.c = obj;
                iw6.d = g49.d;
                Object[] objArr = g49.e;
                if (objArr != null) {
                    iw6.q = (mw6[]) objArr;
                }
                String str3 = g49.g;
                if (str3 == null) {
                    str3 = str2;
                }
                iw6.e = str3;
                iw6.f = g49.h;
                iw6.g = g49.i;
                iw6.h = g49.j;
                iw6.i = g49.k;
                iw6.j = g49.l;
                iw6.k = g49.m;
                iw6.l = g49.n;
                Long l = g49.o;
                iw6.m = l != null ? l.longValue() : -1;
                String str4 = g49.r;
                if (str4 == null) {
                    str4 = str2;
                }
                iw6.n = str4;
                byte[] bArr = g49.s;
                if (bArr == null) {
                    bArr = iu7.o;
                }
                iw6.o = bArr;
                CharSequence charSequence2 = g49.f;
                if (charSequence2 != null) {
                    str = charSequence2.toString();
                }
                if (str != null) {
                    str2 = str;
                }
                iw6.p = str2;
                iw6.r = g49.p;
                iw6.s = g49.q.toString();
                iw6.t = g49.u;
            } catch (Throwable th) {
                udd.s(g49.class.getName(), "toProto error", th);
            }
            iw6Arr[i2] = iw6;
        }
        jw6.a = iw6Arr;
        return jw6;
    }

    public final dy b() {
        return (dy) this.i.getValue();
    }

    public final Boolean e(byte[] bArr) {
        Object obj;
        e13 d;
        File file = new File(((bf5) this.e.getValue()).c(), "chats_v1");
        try {
            obj = Boolean.valueOf(file.exists() ? file.delete() : false);
        } catch (Throwable th) {
            obj = new kcc(th);
        }
        Object obj2 = Boolean.FALSE;
        if (obj instanceof kcc) {
            obj = obj2;
        }
        if (((Boolean) obj).booleanValue()) {
            String c = c();
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                fn6.d(tn7.Y, c, "prev file " + file + " deleted!", (Throwable) null);
            }
        }
        long nanoTime = System.nanoTime();
        String c2 = c();
        fn6 fn62 = udd.e;
        if (fn62 != null && fn62.c()) {
            fn62.d(tn7.Y, c2, "loadData start", (Throwable) null);
        }
        el8 el8 = ((fr6) this.f.getValue()).f;
        try {
            jw6 jw6 = (jw6) gr8.mergeFrom(new jw6(), bArr);
            int length = jw6.a.length;
            ArrayList arrayList = new ArrayList(length);
            Object[] objArr = length == 0 ? swb.b : new Object[length];
            iw6[] iw6Arr = jw6.a;
            int i2 = 0;
            int i3 = 0;
            while (i3 < iw6Arr.length) {
                int i4 = i3 + 1;
                g49 b = fja.b(iw6Arr[i3], new e98(7, this));
                arrayList.add(b);
                String str = b.r;
                if (str == null) {
                    i3 = i4;
                } else {
                    vb0 vb0 = bz9.a;
                    tr6 b2 = bz9.b(str, dz9.a, 4);
                    int i5 = i2 + 1;
                    if (objArr.length < i5) {
                        objArr = Arrays.copyOf(objArr, Math.max(i5, (objArr.length * 3) / 2));
                    }
                    objArr[i2] = b2;
                    zm0 d2 = ((fr6) this.f.getValue()).d(b2, this);
                    byte[] bArr2 = b.s;
                    if (bArr2 != null) {
                        ((en0) this.h.getValue()).getClass();
                        Bitmap a = en0.a(bArr2);
                        if (a != null) {
                            if (!(mn0.d(a) == 0 || (d = el8.d(d2, e13.o0(CloseableStaticBitmap.of(a, (nbc) ((g0b) ((t97) this.b).getValue()).a(), (tjb) et6.d, 0)))) == null)) {
                                d.close();
                            }
                        }
                    }
                    i3 = i4;
                    i2 = i5;
                }
            }
            ((AtomicReference) this.c).set(arrayList);
            for (int i6 = 0; i6 < i2; i6++) {
                ((fr6) this.f.getValue()).f((tr6) objArr[i6], this);
            }
            String c3 = c();
            fn6 fn63 = udd.e;
            if (fn63 != null && fn63.c()) {
                tn7 tn7 = tn7.Y;
                int i7 = zp4.o;
                fn63.d(tn7, c3, "loadData finish ".concat(zp4.j(mt0.Q(System.nanoTime() - nanoTime, eq4.NANOSECONDS))), (Throwable) null);
            }
            return Boolean.TRUE;
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new NoSuchElementException(e2.getMessage());
        } catch (InterruptedException e3) {
            throw e3;
        } catch (Throwable th2) {
            String c4 = c();
            fn6 fn64 = udd.e;
            if (fn64 != null && fn64.c()) {
                tn7 tn72 = tn7.Y;
                int i8 = zp4.o;
                fn64.d(tn72, c4, "loadData finish ".concat(zp4.j(mt0.Q(System.nanoTime() - nanoTime, eq4.NANOSECONDS))), (Throwable) null);
            }
            throw th2;
        }
    }
}
