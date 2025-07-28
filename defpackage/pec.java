package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: pec  reason: default package */
public final class pec implements f4e, e4e {
    public static final TreeMap x0 = new TreeMap();
    public final String[] X;
    public final byte[][] Y;
    public final int[] Z;
    public final int a;
    public volatile String b;
    public final long[] c;
    public final double[] o;
    public int w0;

    public pec(int i) {
        this.a = i;
        int i2 = i + 1;
        this.Z = new int[i2];
        this.c = new long[i2];
        this.o = new double[i2];
        this.X = new String[i2];
        this.Y = new byte[i2][];
    }

    public static final pec a(int i, String str) {
        TreeMap treeMap = x0;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                pec pec = (pec) ceilingEntry.getValue();
                pec.b = str;
                pec.w0 = i;
                return pec;
            }
            pec pec2 = new pec(i);
            pec2.b = str;
            pec2.w0 = i;
            return pec2;
        }
    }

    public final void W(int i) {
        this.Z[i] = 1;
    }

    public final void close() {
    }

    public final void f(int i, String str) {
        this.Z[i] = 4;
        this.X[i] = str;
    }

    public final void h(int i, double d) {
        this.Z[i] = 3;
        this.o[i] = d;
    }

    public final void j(int i, long j) {
        this.Z[i] = 2;
        this.c[i] = j;
    }

    public final void k(int i, byte[] bArr) {
        this.Z[i] = 5;
        this.Y[i] = bArr;
    }

    public final void m() {
        TreeMap treeMap = x0;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.a), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    public final String n() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final void o(e4e e4e) {
        int i = this.w0;
        if (1 <= i) {
            int i2 = 1;
            while (true) {
                int i3 = this.Z[i2];
                if (i3 == 1) {
                    e4e.W(i2);
                } else if (i3 == 2) {
                    e4e.j(i2, this.c[i2]);
                } else if (i3 == 3) {
                    e4e.h(i2, this.o[i2]);
                } else if (i3 == 4) {
                    String str = this.X[i2];
                    if (str != null) {
                        e4e.f(i2, str);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else if (i3 == 5) {
                    byte[] bArr = this.Y[i2];
                    if (bArr != null) {
                        e4e.k(i2, bArr);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                if (i2 != i) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }
}
