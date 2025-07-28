package defpackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: bfe  reason: default package */
public final class bfe implements sm0 {
    public static final char[] m = new char[0];
    public final /* synthetic */ int a = 0;
    public boolean b;
    public String c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;

    public bfe(String str, za6 za6, te teVar, cz5 cz5, boolean z) {
        this.h = za6;
        this.i = teVar;
        this.j = cz5;
        this.b = z;
        this.c = str == null ? String.valueOf(hashCode()) : str;
        this.d = za6.V();
        this.e = za6.R();
        int h2 = (int) gwf.h(TimeUnit.SECONDS.toMillis(1) / ((long) (((ue) za6.a).a / za6.c())), 1);
        this.f = h2;
        this.g = h2;
        this.l = new dz5(this);
    }

    public char[] a(int i2) {
        hs0 hs0 = (hs0) this.h;
        return hs0 != null ? hs0.a(2, i2) : new char[Math.max(i2, 500)];
    }

    public ms b(int i2, int i3) {
        boolean z = this.b;
        int i4 = this.e;
        int i5 = this.d;
        if (!z) {
            return new ms(i5, i4, 2);
        }
        if (i2 < i5 || i3 < i4) {
            double d2 = ((double) i5) / ((double) i4);
            if (i3 > i2) {
                if (i3 > i4) {
                    i3 = i4;
                }
                i5 = (int) (((double) i3) * d2);
                i4 = i3;
            } else {
                if (i2 > i5) {
                    i2 = i5;
                }
                i4 = (int) (((double) i2) / d2);
                i5 = i2;
            }
        }
        return new ms(i5, i4, 2);
    }

    public void c() {
        this.b = false;
        ((ArrayList) this.l).clear();
        this.f = 0;
        this.g = 0;
    }

    public char[] d() {
        int i2;
        char[] cArr = (char[]) this.k;
        if (cArr == null) {
            String str = this.c;
            if (str != null) {
                cArr = str.toCharArray();
            } else {
                int i3 = this.d;
                char[] cArr2 = m;
                if (i3 >= 0) {
                    int i4 = this.e;
                    if (i4 >= 1) {
                        cArr = i3 == 0 ? Arrays.copyOf((char[]) this.i, i4) : Arrays.copyOfRange((char[]) this.i, i3, i4 + i3);
                    }
                } else {
                    int t = t();
                    if (t >= 1) {
                        cArr = new char[t];
                        ArrayList arrayList = (ArrayList) this.l;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            i2 = 0;
                            for (int i5 = 0; i5 < size; i5++) {
                                char[] cArr3 = (char[]) ((ArrayList) this.l).get(i5);
                                int length = cArr3.length;
                                System.arraycopy(cArr3, 0, cArr, i2, length);
                                i2 += length;
                            }
                        } else {
                            i2 = 0;
                        }
                        System.arraycopy((char[]) this.j, 0, cArr, i2, this.g);
                    }
                }
                cArr = cArr2;
            }
            this.k = cArr;
        }
        return cArr;
    }

    public BigDecimal e() {
        char[] cArr;
        char[] cArr2;
        char[] cArr3 = (char[]) this.k;
        if (cArr3 != null) {
            return yr9.a(cArr3, 0, cArr3.length);
        }
        int i2 = this.d;
        if (i2 >= 0 && (cArr2 = (char[]) this.i) != null) {
            return yr9.a(cArr2, i2, this.e);
        }
        if (this.f == 0 && (cArr = (char[]) this.j) != null) {
            return yr9.a(cArr, 0, this.g);
        }
        char[] d2 = d();
        String str = yr9.a;
        return yr9.a(d2, 0, d2.length);
    }

    public int f(boolean z) {
        char[] cArr;
        int i2 = this.d;
        return (i2 < 0 || (cArr = (char[]) this.i) == null) ? z ? -yr9.b((char[]) this.j, 1, this.g - 1) : yr9.b((char[]) this.j, 0, this.g) : z ? -yr9.b(cArr, i2 + 1, this.e - 1) : yr9.b(cArr, i2, this.e);
    }

    public String g() {
        if (this.c == null) {
            char[] cArr = (char[]) this.k;
            if (cArr != null) {
                this.c = new String(cArr);
            } else {
                int i2 = this.d;
                String str = BuildConfig.FLAVOR;
                if (i2 >= 0) {
                    int i3 = this.e;
                    if (i3 < 1) {
                        this.c = str;
                        return str;
                    }
                    this.c = new String((char[]) this.i, i2, i3);
                } else {
                    int i4 = this.f;
                    int i5 = this.g;
                    if (i4 == 0) {
                        if (i5 != 0) {
                            str = new String((char[]) this.j, 0, i5);
                        }
                        this.c = str;
                    } else {
                        StringBuilder sb = new StringBuilder(i4 + i5);
                        ArrayList arrayList = (ArrayList) this.l;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i6 = 0; i6 < size; i6++) {
                                char[] cArr2 = (char[]) ((ArrayList) this.l).get(i6);
                                sb.append(cArr2, 0, cArr2.length);
                            }
                        }
                        sb.append((char[]) this.j, 0, this.g);
                        this.c = sb.toString();
                    }
                }
            }
        }
        return this.c;
    }

    public char[] h() {
        this.d = -1;
        this.g = 0;
        this.e = 0;
        this.i = null;
        this.c = null;
        this.k = null;
        if (this.b) {
            c();
        }
        char[] cArr = (char[]) this.j;
        if (cArr != null) {
            return cArr;
        }
        char[] a2 = a(0);
        this.j = a2;
        return a2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0030, code lost:
        if (r0 > 65536) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void i() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.l
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto L_0x000d
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.l = r0
        L_0x000d:
            java.lang.Object r0 = r3.j
            char[] r0 = (char[]) r0
            r1 = 1
            r3.b = r1
            java.lang.Object r1 = r3.l
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.add(r0)
            int r1 = r3.f
            int r2 = r0.length
            int r1 = r1 + r2
            r3.f = r1
            r1 = 0
            r3.g = r1
            int r0 = r0.length
            int r1 = r0 >> 1
            int r0 = r0 + r1
            r1 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r1) goto L_0x002e
        L_0x002c:
            r0 = r1
            goto L_0x0033
        L_0x002e:
            r1 = 65536(0x10000, float:9.18355E-41)
            if (r0 <= r1) goto L_0x0033
            goto L_0x002c
        L_0x0033:
            char[] r0 = new char[r0]
            r3.j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bfe.i():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0033, code lost:
        if (r0 > 65536) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public char[] j() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.l
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto L_0x000d
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.l = r0
        L_0x000d:
            r0 = 1
            r2.b = r0
            java.lang.Object r0 = r2.l
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r1 = r2.j
            char[] r1 = (char[]) r1
            r0.add(r1)
            java.lang.Object r0 = r2.j
            char[] r0 = (char[]) r0
            int r0 = r0.length
            int r1 = r2.f
            int r1 = r1 + r0
            r2.f = r1
            r1 = 0
            r2.g = r1
            int r1 = r0 >> 1
            int r0 = r0 + r1
            r1 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r1) goto L_0x0031
        L_0x002f:
            r0 = r1
            goto L_0x0036
        L_0x0031:
            r1 = 65536(0x10000, float:9.18355E-41)
            if (r0 <= r1) goto L_0x0036
            goto L_0x002f
        L_0x0036:
            char[] r0 = new char[r0]
            r2.j = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bfe.j():char[]");
    }

    public char[] k() {
        if (this.d >= 0) {
            u(1);
        } else {
            char[] cArr = (char[]) this.j;
            if (cArr == null) {
                this.j = a(0);
            } else if (this.g >= cArr.length) {
                i();
            }
        }
        return (char[]) this.j;
    }

    public cs0 l() {
        cs0 cs0;
        if (((cs0) this.k) == null) {
            cz5 cz5 = (cz5) this.j;
            String str = this.c;
            te teVar = (te) this.i;
            gg ggVar = (gg) this.h;
            cz5.getClass();
            ConcurrentHashMap concurrentHashMap = cz5.d;
            synchronized (concurrentHashMap) {
                dve dve = (dve) concurrentHashMap.get(str);
                if (dve != null) {
                    concurrentHashMap.remove(str);
                    cs0 = dve.a;
                } else {
                    cs0 = new cs0(cz5.a, teVar, new ii5(cz5.b, 6), ggVar, cz5.c);
                }
            }
            this.k = cs0;
        }
        return (cs0) this.k;
    }

    public char[] m() {
        if (this.d >= 0) {
            return (char[]) this.i;
        }
        char[] cArr = (char[]) this.k;
        if (cArr != null) {
            return cArr;
        }
        String str = this.c;
        if (str != null) {
            char[] charArray = str.toCharArray();
            this.k = charArray;
            return charArray;
        } else if (this.b) {
            return d();
        } else {
            char[] cArr2 = (char[]) this.j;
            return cArr2 == null ? m : cArr2;
        }
    }

    public void n() {
        l();
        q();
    }

    public void o(j54 j54, rm0 rm0, vf vfVar, int i2, s16 s16) {
    }

    public e13 p(int i2, int i3, int i4) {
        gz5 gz5;
        ms b2 = b(i3, i4);
        cs0 l2 = l();
        if (l2 != null) {
            int i5 = b2.b;
            int i6 = b2.c;
            Integer num = (Integer) l2.k.get(Integer.valueOf(i2));
            if (num != null) {
                int intValue = num.intValue();
                l2.j = intValue;
                bs0 bs0 = (bs0) l2.f.get(num);
                if (bs0 == null || bs0.b || !bs0.a.m0()) {
                    bs0 = null;
                }
                if (bs0 != null) {
                    ii5 ii5 = l2.i;
                    int i7 = l2.g;
                    int a2 = ii5.a(l2.e + i7);
                    if (i7 >= a2 ? !((i7 > intValue || intValue > ii5.b) && (intValue < 0 || intValue > a2)) : !(i7 > intValue || intValue > a2)) {
                        l2.e(i5, i6);
                    }
                    gz5 = new gz5(1, bs0.a.m());
                } else {
                    l2.e(i5, i6);
                    gz5 = l2.c(intValue);
                }
            } else {
                gz5 = l2.c(i2);
            }
        } else {
            gz5 = null;
        }
        if (gz5 != null) {
            AtomicInteger atomicInteger = yf.a;
            dz5 dz5 = (dz5) this.l;
            ConcurrentHashMap concurrentHashMap = yf.d;
            if (!concurrentHashMap.contains(dz5)) {
                concurrentHashMap.put(dz5, Integer.valueOf((int) (((float) dz5.a) * 0.2f)));
            }
            int t = hr1.t(gz5.a);
            if (t == 0) {
                yf.a.incrementAndGet();
            } else if (t == 1) {
                yf.b.incrementAndGet();
            } else if (t == 2) {
                yf.c.incrementAndGet();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (gz5 != null) {
            return gz5.b;
        }
        return null;
    }

    public void q() {
        cs0 l2 = l();
        if (l2 != null) {
            ConcurrentHashMap concurrentHashMap = cz5.d;
            cz5.d.put(this.c, new dve(l2, new Date()));
        }
        this.k = null;
    }

    public void r(int i2, int i3) {
        if (i2 > 0 && i3 > 0 && this.d > 0 && this.e > 0) {
            ms b2 = b(i2, i3);
            cs0 l2 = l();
            if (l2 != null) {
                int i4 = b2.b;
                l2.e(i4, i4);
            }
        }
    }

    public void s(char[] cArr, int i2, int i3) {
        this.c = null;
        this.k = null;
        this.i = cArr;
        this.d = i2;
        this.e = i3;
        if (this.b) {
            c();
        }
    }

    public int t() {
        if (this.d >= 0) {
            return this.e;
        }
        char[] cArr = (char[]) this.k;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this.c;
        return str != null ? str.length() : this.f + this.g;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return g();
            default:
                return super.toString();
        }
    }

    public void u(int i2) {
        int i3 = this.e;
        this.e = 0;
        char[] cArr = (char[]) this.i;
        this.i = null;
        int i4 = this.d;
        this.d = -1;
        int i5 = i2 + i3;
        char[] cArr2 = (char[]) this.j;
        if (cArr2 == null || i5 > cArr2.length) {
            this.j = a(i5);
        }
        if (i3 > 0) {
            System.arraycopy(cArr, i4, (char[]) this.j, 0, i3);
        }
        this.f = 0;
        this.g = i3;
    }

    public bfe(hs0 hs0) {
        this.h = hs0;
    }
}
