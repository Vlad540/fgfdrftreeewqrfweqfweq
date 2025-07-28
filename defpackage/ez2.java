package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;
import javax.inject.Provider;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: ez2  reason: default package */
public final class ez2 implements Provider, g1e {
    public static final zo4 Y = new zo4(17);
    public static final /* synthetic */ int Z = 0;
    public Object X;
    public final Object a;
    public final Object b;
    public final Object c;
    public Object o;

    public ez2(Context context, xwb xwb, fje fje) {
        this.a = context;
        this.b = xwb;
        this.c = fje;
        this.X = new an(4, this);
    }

    public static void b(int i, int i2, int i3, int[] iArr) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = (i4 & 31) | (((i4 >> 5) & 31) << 10) | (((i4 >> 10) & 31) << 5);
                i2++;
            }
        } else if (i == -1) {
            while (i2 <= i3) {
                int i5 = iArr[i2];
                iArr[i2] = ((i5 >> 10) & 31) | ((i5 & 31) << 10) | (((i5 >> 5) & 31) << 5);
                i2++;
            }
        }
    }

    public static int c(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    public void a(hu1 hu1, hu1 hu12, o4e o4e, o4e o4e2, Map.Entry entry) {
        o4e o4e3 = (o4e) entry.getValue();
        ya0 ya0 = new ya0(o4e.g.a, ((c90) entry.getKey()).a.d, o4e.c ? hu1 : null, ((c90) entry.getKey()).a.f, ((c90) entry.getKey()).a.g);
        ya0 ya02 = new ya0(o4e2.g.a, ((c90) entry.getKey()).b.d, o4e2.c ? hu12 : null, ((c90) entry.getKey()).b.f, ((c90) entry.getKey()).b.g);
        int i = ((c90) entry.getKey()).a.c;
        o4e3.getClass();
        gt0.i();
        o4e3.b();
        e07.p("Consumer can only be linked once.", !o4e3.j);
        o4e3.j = true;
        n4e n4e = o4e3.l;
        ct0.a(ct0.N(n4e.c(), new m4e(o4e3, n4e, i, ya0, ya02), pa2.A()), new mn((Object) this, 14, (Object) o4e3), pa2.A());
    }

    public boolean d(float[] fArr) {
        zia[] ziaArr = (zia[]) this.o;
        if (ziaArr != null && ziaArr.length > 0) {
            int length = ziaArr.length;
            int i = 0;
            while (i < length) {
                ziaArr[i].getClass();
                float f = fArr[2];
                if (f < 0.95f && f > 0.05f) {
                    float f2 = fArr[0];
                    if (f2 < 10.0f || f2 > 37.0f || fArr[1] > 0.82f) {
                        i++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public Object get() {
        return new xic((eye) ((Provider) this.a).get(), (eye) ((Provider) this.b).get(), (j90) ((Provider) this.c).get(), (fnc) ((Provider) this.o).get(), (Provider) this.X);
    }

    public int h(long j) {
        long[] jArr = (long[]) this.b;
        int b2 = mze.b(jArr, j, false);
        if (b2 < jArr.length) {
            return b2;
        }
        return -1;
    }

    public long k(int i) {
        return ((long[]) this.b)[i];
    }

    public List q(long j) {
        tse tse = (tse) this.a;
        tse.getClass();
        ArrayList arrayList = new ArrayList();
        tse.g(j, tse.h, arrayList);
        TreeMap treeMap = new TreeMap();
        long j2 = j;
        tse.i(j2, false, tse.h, treeMap);
        Map map = (Map) this.o;
        tse.h(j2, (Map) this.c, map, tse.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) ((Map) this.X).get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                wse wse = (wse) map.get(pair.first);
                wse.getClass();
                arrayList2.add(new tw3((CharSequence) null, (Layout.Alignment) null, (Layout.Alignment) null, decodeByteArray, wse.c, 0, wse.e, wse.b, 0, Integer.MIN_VALUE, -3.4028235E38f, wse.f, wse.g, false, -16777216, wse.j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            wse wse2 = (wse) map.get(entry.getKey());
            wse2.getClass();
            rw3 rw3 = (rw3) entry.getValue();
            CharSequence charSequence = rw3.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (he4 he4 : (he4[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), he4.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(he4), spannableStringBuilder.getSpanEnd(he4), BuildConfig.FLAVOR);
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == 10) {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == 10) {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == 10) {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            rw3.e = wse2.c;
            rw3.f = wse2.d;
            rw3.g = wse2.e;
            rw3.h = wse2.b;
            rw3.l = wse2.f;
            rw3.k = wse2.i;
            rw3.j = wse2.h;
            rw3.p = wse2.j;
            arrayList2.add(rw3.a());
        }
        return arrayList2;
    }

    public int u() {
        return ((long[]) this.b).length;
    }

    public ez2(t97 t97, t97 t972, t97 t973, Context context) {
        this.a = context;
        this.b = ez2.class.getName();
        this.c = t97;
        this.o = t972;
        this.X = t973;
    }

    public ez2(ou3 ou3, ku3 ku3, nfc nfc, pae pae, gz3 gz3) {
        this.a = ou3;
        this.b = ku3;
        this.c = nfc;
        this.o = gz3;
        udd.p("ez2", "init", new Object[0]);
        xs7.E(ou3, ((n3a) pae).c().plus(ku3), (ru3) null, new ct7(this, (Continuation) null), 2);
    }

    public ez2(jj7 jj7, Provider provider) {
        gf6 gf6 = a06.g;
        ns7 ns7 = n06.d;
        jk9 jk9 = hhd.b;
        this.a = gf6;
        this.b = ns7;
        this.c = jk9;
        this.o = jj7;
        this.X = provider;
    }

    public ez2(tse tse, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.a = tse;
        this.o = hashMap2;
        this.X = hashMap3;
        this.c = Collections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        tse.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.b = jArr;
    }

    public ez2(int[] iArr, int i, zia[] ziaArr) {
        w23 w23;
        int[] iArr2 = iArr;
        int i2 = i;
        this.X = new float[3];
        this.o = ziaArr;
        int[] iArr3 = new int[32768];
        this.b = iArr3;
        int i3 = 0;
        for (int i4 = 0; i4 < iArr2.length; i4++) {
            int i5 = iArr2[i4];
            int c2 = c(Color.blue(i5), 8, 5) | (c(Color.red(i5), 8, 5) << 10) | (c(Color.green(i5), 8, 5) << 5);
            iArr2[i4] = c2;
            iArr3[c2] = iArr3[c2] + 1;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < 32768; i7++) {
            if (iArr3[i7] > 0) {
                int rgb = Color.rgb(c((i7 >> 10) & 31, 5, 8), c((i7 >> 5) & 31, 5, 8), c(i7 & 31, 5, 8));
                float[] fArr = (float[]) this.X;
                ThreadLocal threadLocal = j33.a;
                j33.a(Color.red(rgb), Color.green(rgb), Color.blue(rgb), fArr);
                if (d(fArr)) {
                    iArr3[i7] = 0;
                }
            }
            if (iArr3[i7] > 0) {
                i6++;
            }
        }
        int[] iArr4 = new int[i6];
        this.a = iArr4;
        int i8 = 0;
        for (int i9 = 0; i9 < 32768; i9++) {
            if (iArr3[i9] > 0) {
                iArr4[i8] = i9;
                i8++;
            }
        }
        if (i6 <= i2) {
            this.c = new ArrayList();
            while (i3 < i6) {
                int i10 = iArr4[i3];
                ((ArrayList) this.c).add(new aja(Color.rgb(c((i10 >> 10) & 31, 5, 8), c((i10 >> 5) & 31, 5, 8), c(i10 & 31, 5, 8)), iArr3[i10]));
                i3++;
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i2, Y);
        priorityQueue.offer(new w23(this, 0, ((int[]) this.a).length - 1));
        while (priorityQueue.size() < i2 && (w23 = (w23) priorityQueue.poll()) != null) {
            int i11 = w23.b;
            int i12 = w23.a;
            if ((i11 + 1) - i12 <= 1) {
                break;
            } else if ((i11 + 1) - i12 > 1) {
                int i13 = w23.e - w23.d;
                int i14 = w23.g - w23.f;
                int i15 = w23.i - w23.h;
                int i16 = (i13 < i14 || i13 < i15) ? (i14 < i13 || i14 < i15) ? -1 : -2 : -3;
                ez2 ez2 = w23.j;
                int[] iArr5 = (int[]) ez2.a;
                b(i16, i12, i11, iArr5);
                Arrays.sort(iArr5, i12, w23.b + 1);
                b(i16, i12, w23.b, iArr5);
                int i17 = w23.c / 2;
                int i18 = i3;
                int i19 = i12;
                while (true) {
                    int i20 = w23.b;
                    if (i19 > i20) {
                        break;
                    }
                    i18 += ((int[]) ez2.b)[iArr5[i19]];
                    if (i18 >= i17) {
                        i12 = Math.min(i20 - 1, i19);
                        break;
                    }
                    i19++;
                }
                w23 w232 = new w23(ez2, i12 + 1, w23.b);
                w23.b = i12;
                w23.a();
                priorityQueue.offer(w232);
                priorityQueue.offer(w23);
                i3 = 0;
            } else {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            w23 w233 = (w23) it.next();
            ez2 ez22 = w233.j;
            int[] iArr6 = (int[]) ez22.a;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            for (int i25 = w233.a; i25 <= w233.b; i25++) {
                int i26 = iArr6[i25];
                int i27 = ((int[]) ez22.b)[i26];
                i22 += i27;
                i21 = (((i26 >> 10) & 31) * i27) + i21;
                i23 = (((i26 >> 5) & 31) * i27) + i23;
                i24 += i27 * (i26 & 31);
            }
            float f = (float) i22;
            aja aja = new aja(Color.rgb(c(Math.round(((float) i21) / f), 5, 8), c(Math.round(((float) i23) / f), 5, 8), c(Math.round(((float) i24) / f), 5, 8)), i22);
            if (!d(aja.b())) {
                arrayList.add(aja);
            }
        }
        this.c = arrayList;
    }

    public ez2(hu1 hu1, hu1 hu12, r4e r4e) {
        this.b = hu1;
        this.c = hu12;
        this.a = r4e;
    }
}
