package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.AudioAttributes;
import android.os.Handler;
import android.os.Process;
import android.util.Size;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.utils.ImageUtil$CodecFailedException;
import androidx.recyclerview.widget.a;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.inject.Provider;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.video.VideoViewerWidget;

/* renamed from: x3a  reason: default package */
public final class x3a implements p0c, o51, b11, i36, sj4, Provider, iba, m9f, cj7, wq6 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ x3a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static x3a D(int i, int i2, int i3) {
        return new x3a(1, (Object) AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3));
    }

    public static ea0 G(p90 p90) {
        ea0 ea0 = p90.a;
        lr6 lr6 = (lr6) ea0.a;
        Rect rect = ea0.e;
        try {
            byte[] I = am7.I(lr6, rect, p90.b, ea0.f);
            try {
                i25 i25 = new i25(new v25((InputStream) new ByteArrayInputStream(I)));
                Size size = new Size(rect.width(), rect.height());
                Rect rect2 = new Rect(0, 0, rect.width(), rect.height());
                RectF rectF = hqe.a;
                Matrix matrix = new Matrix(ea0.g);
                matrix.postTranslate((float) (-rect.left), (float) (-rect.top));
                return new ea0(I, i25, 256, size, rect2, ea0.f, matrix, ea0.h);
            } catch (IOException e) {
                throw new Exception("Failed to extract Exif from YUV-generated JPEG", e);
            }
        } catch (ImageUtil$CodecFailedException e2) {
            throw new Exception("Failed to encode the image to JPEG.", e2);
        }
    }

    public boolean A() {
        lb8 lb8 = (lb8) this.b;
        return lb8 != null && lb8.d;
    }

    public boolean B(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        if (!linkedHashMap.containsKey(str)) {
            return false;
        }
        return ((nye) linkedHashMap.get(str)).e;
    }

    public void C() {
        ((hx5) this.b).D0.S();
    }

    /* JADX WARNING: type inference failed for: r3v18, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void E(android.graphics.Rect r4, android.view.View r5, androidx.recyclerview.widget.RecyclerView r6) {
        /*
            r3 = this;
            androidx.recyclerview.widget.a r6 = r6.getLayoutManager()
            if (r6 != 0) goto L_0x0007
            return
        L_0x0007:
            int r6 = androidx.recyclerview.widget.RecyclerView.R(r5)
            java.lang.Object r3 = r3.b
            android.util.SparseArray r3 = (android.util.SparseArray) r3
            r0 = -1
            if (r6 != r0) goto L_0x0016
            r3.remove(r6)
            return
        L_0x0016:
            java.lang.Object r0 = r3.get(r6)
            int[] r0 = (int[]) r0
            if (r0 != 0) goto L_0x0025
            r0 = 8
            int[] r0 = new int[r0]
            r3.put(r6, r0)
        L_0x0025:
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            boolean r6 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            r1 = 0
            if (r6 == 0) goto L_0x0031
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            goto L_0x0032
        L_0x0031:
            r3 = r1
        L_0x0032:
            r6 = 0
            if (r3 == 0) goto L_0x0038
            int r3 = r3.leftMargin
            goto L_0x0039
        L_0x0038:
            r3 = r6
        L_0x0039:
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            n6c r2 = (defpackage.n6c) r2
            android.graphics.Rect r2 = r2.b
            int r2 = r2.left
            int r3 = r3 + r2
            r2 = 1
            r0[r2] = r3
            int r2 = r4.left
            int r3 = r3 + r2
            r0[r6] = r3
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            boolean r2 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L_0x0057
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            goto L_0x0058
        L_0x0057:
            r3 = r1
        L_0x0058:
            if (r3 == 0) goto L_0x005d
            int r3 = r3.topMargin
            goto L_0x005e
        L_0x005d:
            r3 = r6
        L_0x005e:
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            n6c r2 = (defpackage.n6c) r2
            android.graphics.Rect r2 = r2.b
            int r2 = r2.top
            int r3 = r3 + r2
            r2 = 3
            r0[r2] = r3
            int r2 = r4.top
            int r3 = r3 + r2
            r2 = 2
            r0[r2] = r3
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            boolean r2 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L_0x007d
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            goto L_0x007e
        L_0x007d:
            r3 = r1
        L_0x007e:
            if (r3 == 0) goto L_0x0083
            int r3 = r3.rightMargin
            goto L_0x0084
        L_0x0083:
            r3 = r6
        L_0x0084:
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            n6c r2 = (defpackage.n6c) r2
            android.graphics.Rect r2 = r2.b
            int r2 = r2.right
            int r3 = r3 + r2
            r2 = 5
            r0[r2] = r3
            int r2 = r4.right
            int r3 = r3 + r2
            r2 = 4
            r0[r2] = r3
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            boolean r2 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L_0x00a3
            r1 = r3
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
        L_0x00a3:
            if (r1 == 0) goto L_0x00a7
            int r6 = r1.bottomMargin
        L_0x00a7:
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            n6c r3 = (defpackage.n6c) r3
            android.graphics.Rect r3 = r3.b
            int r3 = r3.bottom
            int r6 = r6 + r3
            r3 = 7
            r0[r3] = r6
            int r3 = r4.bottom
            int r6 = r6 + r3
            r3 = 6
            r0[r3] = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x3a.E(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView):void");
    }

    public ea0 F(p90 p90, int i) {
        byte[] bArr;
        byte b2;
        ea0 ea0 = p90.a;
        lr6 lr6 = (lr6) ea0.a;
        int i2 = 0;
        if (((IncorrectJpegMetadataQuirk) ((lhd) this.b).b) == null) {
            ByteBuffer E = lr6.v()[0].E();
            bArr = new byte[E.capacity()];
            E.rewind();
            E.get(bArr);
        } else {
            ByteBuffer E2 = lr6.v()[0].E();
            int capacity = E2.capacity();
            byte[] bArr2 = new byte[capacity];
            E2.rewind();
            E2.get(bArr2);
            int i3 = 2;
            int i4 = 2;
            while (true) {
                if (i4 + 4 <= capacity && (b2 = bArr2[i4]) == -1) {
                    if (b2 == -1 && bArr2[i4 + 1] == -38) {
                        break;
                    }
                    i4 += (((bArr2[i4 + 2] & 255) << 8) | (bArr2[i4 + 3] & 255)) + 2;
                }
            }
            while (true) {
                int i5 = i3 + 1;
                if (i5 <= capacity) {
                    if (bArr2[i3] == -1 && bArr2[i5] == -40) {
                        i2 = i3;
                        break;
                    }
                    i3 = i5;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 == -1) {
                bArr = bArr2;
            }
            bArr = Arrays.copyOfRange(bArr2, i2, E2.limit());
        }
        byte[] bArr3 = bArr;
        i25 i25 = ea0.b;
        Objects.requireNonNull(i25);
        return new ea0(bArr3, i25, i, ea0.d, ea0.e, ea0.f, ea0.g, ea0.h);
    }

    public void H(Object obj, String str) {
        HashMap hashMap = (HashMap) this.b;
        if (obj == null) {
            hashMap.put(str, (Object) null);
            return;
        }
        Class<?> cls = obj.getClass();
        if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
            hashMap.put(str, obj);
            return;
        }
        int i = 0;
        if (cls == boolean[].class) {
            boolean[] zArr = (boolean[]) obj;
            zy3 zy3 = zy3.b;
            Boolean[] boolArr = new Boolean[zArr.length];
            while (i < zArr.length) {
                boolArr[i] = Boolean.valueOf(zArr[i]);
                i++;
            }
            hashMap.put(str, boolArr);
        } else if (cls == byte[].class) {
            byte[] bArr = (byte[]) obj;
            zy3 zy32 = zy3.b;
            Byte[] bArr2 = new Byte[bArr.length];
            while (i < bArr.length) {
                bArr2[i] = Byte.valueOf(bArr[i]);
                i++;
            }
            hashMap.put(str, bArr2);
        } else if (cls == int[].class) {
            int[] iArr = (int[]) obj;
            zy3 zy33 = zy3.b;
            Integer[] numArr = new Integer[iArr.length];
            while (i < iArr.length) {
                numArr[i] = Integer.valueOf(iArr[i]);
                i++;
            }
            hashMap.put(str, numArr);
        } else if (cls == long[].class) {
            long[] jArr = (long[]) obj;
            zy3 zy34 = zy3.b;
            Long[] lArr = new Long[jArr.length];
            while (i < jArr.length) {
                lArr[i] = Long.valueOf(jArr[i]);
                i++;
            }
            hashMap.put(str, lArr);
        } else if (cls == float[].class) {
            float[] fArr = (float[]) obj;
            zy3 zy35 = zy3.b;
            Float[] fArr2 = new Float[fArr.length];
            while (i < fArr.length) {
                fArr2[i] = Float.valueOf(fArr[i]);
                i++;
            }
            hashMap.put(str, fArr2);
        } else if (cls == double[].class) {
            double[] dArr = (double[]) obj;
            zy3 zy36 = zy3.b;
            Double[] dArr2 = new Double[dArr.length];
            while (i < dArr.length) {
                dArr2[i] = Double.valueOf(dArr[i]);
                i++;
            }
            hashMap.put(str, dArr2);
        } else {
            throw new IllegalArgumentException("Key " + str + "has invalid type " + cls);
        }
    }

    public void I(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            H(entry.getValue(), (String) entry.getKey());
        }
    }

    public void J(jba jba) {
        ((cfb) this.b).b.invoke(jba);
    }

    public void K(String str, boolean z) {
        ((HashMap) this.b).put(str, Boolean.valueOf(z));
    }

    public void L(long j, String str) {
        ((HashMap) this.b).put(str, Long.valueOf(j));
    }

    public void M(String str, String str2) {
        ((HashMap) this.b).put(str, str2);
    }

    public void N(String str, c2d c2d, pye pye, va0 va0, List list) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        if (linkedHashMap.containsKey(str)) {
            nye nye = new nye(c2d, pye, va0, list);
            nye nye2 = (nye) linkedHashMap.get(str);
            nye.e = nye2.e;
            nye.f = nye2.f;
            linkedHashMap.put(str, nye);
        }
    }

    public /* bridge */ /* synthetic */ Object T0(Object obj, k77 k77) {
        return z(k77);
    }

    public void a(Object obj) {
        cp5 cp5 = (cp5) obj;
        if (cp5 != null) {
            ((st1) this.b).w.i(Integer.valueOf(cp5.a ? 2 : 3));
        }
    }

    public void b() {
        ygd ygd = (ygd) ((vj4) this.b).e;
        ygd.getClass();
        k77[] k77Arr = VideoViewerWidget.y0;
        i9f n0 = ((VideoViewerWidget) ygd.a).n0();
        if (n0 != null) {
            ((ChatMediaViewerScreen) n0).E0(true);
        }
    }

    public void c(int i) {
        vj4.a((vj4) this.b, true, i * 10);
    }

    public int d(View view) {
        ((a) this.b).getClass();
        return a.F(view) - ((n6c) view.getLayoutParams()).topMargin;
    }

    public void e(Throwable th) {
        if (!(th instanceof CameraControl$OperationCanceledException)) {
            ((st1) this.b).w.i(4);
        }
    }

    public void f() {
        ssd ssd = (ssd) this.b;
        ssd.b(ssd.f, new Exception("onDownloadFailed"));
    }

    public void g(fj7 fj7, long j, long j2, boolean z) {
    }

    public Object get() {
        String packageName = ((Context) ((Provider) this.b).get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int h() {
        /*
            r4 = this;
            java.lang.Object r4 = r4.b
            r51 r4 = (defpackage.r51) r4
            androidx.viewpager2.widget.ViewPager2 r4 = r4.N0
            int r0 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            boolean r2 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            r3 = 0
            if (r2 == 0) goto L_0x0016
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            goto L_0x0017
        L_0x0016:
            r1 = r3
        L_0x0017:
            r2 = 0
            if (r1 == 0) goto L_0x001d
            int r1 = r1.topMargin
            goto L_0x001e
        L_0x001d:
            r1 = r2
        L_0x001e:
            int r0 = r0 - r1
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            boolean r1 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L_0x002a
            r3 = r4
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
        L_0x002a:
            if (r3 == 0) goto L_0x002e
            int r2 = r3.bottomMargin
        L_0x002e:
            int r0 = r0 - r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x3a.h():int");
    }

    public int i() {
        return ((a) this.b).L();
    }

    public Object j(Object obj) {
        ea0 G;
        p90 p90 = (p90) obj;
        ea0 ea0 = p90.a;
        try {
            int i = ea0.c;
            Object obj2 = ea0.a;
            if (i == 35) {
                G = G(p90);
            } else if (i == 256 || i == 4101) {
                G = F(p90, i);
            } else {
                throw new IllegalArgumentException("Unexpected format: " + i);
            }
            ((lr6) obj2).close();
            return G;
        } catch (Throwable th) {
            ((lr6) ea0.a).close();
            throw th;
        }
    }

    public zy3 k() {
        zy3 zy3 = new zy3((Map) (HashMap) this.b);
        zy3.f(zy3);
        return zy3;
    }

    public int l() {
        a aVar = (a) this.b;
        return aVar.o - aVar.I();
    }

    public View m(int i) {
        return ((a) this.b).v(i);
    }

    public int n(View view) {
        ((a) this.b).getClass();
        return a.z(view) + ((n6c) view.getLayoutParams()).bottomMargin;
    }

    public void o1(Object obj, k77 k77, Object obj2) {
        udd.p(x3a.class.getName(), "set new router", new Object[0]);
        this.b = (ygc) obj2;
    }

    public void p(String str) {
        ssd ssd = (ssd) this.b;
        ssd.c(ssd.f, new File(str));
    }

    public void q(fj7 fj7, long j, long j2) {
        boolean z;
        mod mod = (mod) this.b;
        if (mod != null) {
            synchronized (bm3.X) {
                z = bm3.Y;
            }
            if (!z) {
                IOException iOException = new IOException(new ConcurrentModificationException());
                ty3 ty3 = (ty3) mod.b;
                ty3.getClass();
                oyb.b("Failed to resolve time offset.", iOException);
                ty3.s(true);
                return;
            }
            mod.G();
        }
    }

    public ue r(stf stf, Rect rect) {
        AnimatedFactoryV2Impl animatedFactoryV2Impl = (AnimatedFactoryV2Impl) this.b;
        if (animatedFactoryV2Impl.g == null) {
            animatedFactoryV2Impl.g = new qr4(6);
        }
        return new ue(animatedFactoryV2Impl.g, stf, rect, animatedFactoryV2Impl.d);
    }

    public b2d s() {
        b2d b2d = new b2d();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.b).entrySet()) {
            nye nye = (nye) entry.getValue();
            if (nye.e) {
                b2d.a(nye.a);
                arrayList.add((String) entry.getKey());
            }
        }
        arrayList.toString();
        return b2d;
    }

    public Collection t() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.b).entrySet()) {
            if (((nye) entry.getValue()).e) {
                arrayList.add(((nye) entry.getValue()).a);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public String toString() {
        switch (this.a) {
            case 26:
                return rf0.f(((long[]) this.b).length, "Subject{organizationIds=", "}");
            case 28:
                return "TracerFeature::" + ((String) this.b);
            default:
                return super.toString();
        }
    }

    public Collection u() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.b).entrySet()) {
            if (((nye) entry.getValue()).e) {
                arrayList.add(((nye) entry.getValue()).b);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public File v() {
        mg5 mg5 = (mg5) ((w4) this.b).c(mg5.class);
        mg5.getClass();
        return mg5.g(mg5.b(), "stickerCache");
    }

    public void w(Rect rect, View view, int i) {
        int[] iArr = (int[]) ((SparseArray) this.b).get(i, (Object) null);
        if (iArr != null) {
            rect.set(view.getLeft() - iArr[0], view.getTop() - iArr[2], view.getRight() + iArr[4], view.getBottom() + iArr[6]);
        }
    }

    public void x(Rect rect, View view, int i) {
        int[] iArr = (int[]) ((SparseArray) this.b).get(i, (Object) null);
        if (iArr != null) {
            rect.set(view.getLeft() - iArr[0], view.getTop() - iArr[2], view.getRight() + iArr[4], view.getTop() - iArr[3]);
        }
    }

    public sz0 y(fj7 fj7, long j, long j2, IOException iOException, int i) {
        mod mod = (mod) this.b;
        if (mod != null) {
            ty3 ty3 = (ty3) mod.b;
            ty3.getClass();
            oyb.b("Failed to resolve time offset.", iOException);
            ty3.s(true);
        }
        return jj7.X;
    }

    public ygc z(k77 k77) {
        ygc ygc = (ygc) this.b;
        if (ygc != null) {
            return ygc;
        }
        String name = k77.getName();
        throw new IllegalStateException(("Property " + name + " should be initialized before get.").toString());
    }

    public /* synthetic */ x3a(int i, boolean z) {
        this.a = i;
    }

    public x3a(k20 k20) {
        this.a = 3;
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(k20.a).setFlags(k20.b).setUsage(k20.c);
        int i = oze.a;
        if (i >= 29) {
            g20.a(usage, k20.d);
        }
        if (i >= 32) {
            i20.a(usage, k20.e);
        }
        this.b = usage.build();
    }

    public x3a(String str) {
        this.a = 29;
        this.b = new LinkedHashMap();
    }

    public x3a(xe6 xe6) {
        this.a = 15;
        this.b = new lhd(xe6);
    }

    public x3a(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = 14;
        this.b = new GestureDetector(context, onGestureListener, (Handler) null);
    }

    public x3a(Context context) {
        this.a = 4;
        this.b = context.getApplicationContext();
    }

    public x3a(pa3 pa3) {
        this.a = 27;
        this.b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), pa3);
    }

    public x3a(int i) {
        this.a = i;
        switch (i) {
            case 16:
                this.b = new SparseArray();
                return;
            case 17:
                Process.getStartElapsedRealtime();
                this.b = new lr();
                return;
            default:
                this.b = new HashMap();
                return;
        }
    }
}
