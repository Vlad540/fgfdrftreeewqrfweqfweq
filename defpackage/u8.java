package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: u8  reason: default package */
public final class u8 {
    public static final String j = Integer.toString(0, 36);
    public static final String k = Integer.toString(1, 36);
    public static final String l = Integer.toString(2, 36);
    public static final String m = Integer.toString(3, 36);
    public static final String n = Integer.toString(4, 36);
    public static final String o = Integer.toString(5, 36);
    public static final String p = Integer.toString(6, 36);
    public static final String q = Integer.toString(7, 36);
    public static final String r = Integer.toString(8, 36);
    public final long a;
    public final int b;
    public final int c;
    public final Uri[] d;
    public final l68[] e;
    public final int[] f;
    public final long[] g;
    public final long h;
    public final boolean i;

    static {
        int i2 = oze.a;
    }

    public u8(long j2, int i2, int i3, int[] iArr, l68[] l68Arr, long[] jArr, long j3, boolean z) {
        Uri uri;
        int i4 = 0;
        oyb.d(iArr.length == l68Arr.length);
        this.a = j2;
        this.b = i2;
        this.c = i3;
        this.f = iArr;
        this.e = l68Arr;
        this.g = jArr;
        this.h = j3;
        this.i = z;
        this.d = new Uri[l68Arr.length];
        while (true) {
            Uri[] uriArr = this.d;
            if (i4 < uriArr.length) {
                l68 l68 = l68Arr[i4];
                if (l68 == null) {
                    uri = null;
                } else {
                    a68 a68 = l68.b;
                    a68.getClass();
                    uri = a68.a;
                }
                uriArr[i4] = uri;
                i4++;
            } else {
                return;
            }
        }
    }

    public final int a(int i2) {
        int i3;
        int i4 = i2 + 1;
        while (true) {
            int[] iArr = this.f;
            if (i4 >= iArr.length || this.i || (i3 = iArr[i4]) == 0 || i3 == 1) {
                return i4;
            }
            i4++;
        }
        return i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u8.class != obj.getClass()) {
            return false;
        }
        u8 u8Var = (u8) obj;
        return this.a == u8Var.a && this.b == u8Var.b && this.c == u8Var.c && Arrays.equals(this.e, u8Var.e) && Arrays.equals(this.f, u8Var.f) && Arrays.equals(this.g, u8Var.g) && this.h == u8Var.h && this.i == u8Var.i;
    }

    public final int hashCode() {
        long j2 = this.a;
        int hashCode = Arrays.hashCode(this.e);
        int hashCode2 = Arrays.hashCode(this.f);
        int hashCode3 = Arrays.hashCode(this.g);
        long j3 = this.h;
        return ((((hashCode3 + ((hashCode2 + ((hashCode + (((((this.b * 31) + this.c) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31)) * 31)) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + (this.i ? 1 : 0);
    }
}
