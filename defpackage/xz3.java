package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: xz3  reason: default package */
public final class xz3 {
    public static final /* synthetic */ int k = 0;
    public final Uri a;
    public final long b;
    public final int c;
    public final byte[] d;
    public final Map e;
    public final long f;
    public final long g;
    public final String h;
    public final int i;
    public final Object j;

    static {
        a55.a("goog.exo.datasource");
    }

    public xz3(Uri uri, long j2, int i2, byte[] bArr, Map map, long j3, long j4, String str, int i3, Object obj) {
        long j5 = j2;
        byte[] bArr2 = bArr;
        long j6 = j3;
        long j7 = j4;
        boolean z = false;
        swb.e(j5 + j6 >= 0);
        swb.e(j6 >= 0);
        swb.e((j7 > 0 || j7 == -1) ? true : z);
        this.a = uri;
        this.b = j5;
        this.c = i2;
        this.d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.e = Collections.unmodifiableMap(new HashMap(map));
        this.f = j6;
        this.g = j7;
        this.h = str;
        this.i = i3;
        this.j = obj;
    }

    public final wz3 a() {
        wz3 wz3 = new wz3(false, 0);
        wz3.b = this.a;
        wz3.c = this.b;
        wz3.d = this.c;
        wz3.e = this.d;
        wz3.f = this.e;
        wz3.g = this.f;
        wz3.h = this.g;
        wz3.i = this.h;
        wz3.j = this.i;
        wz3.k = this.j;
        return wz3;
    }

    public final xz3 b(long j2) {
        long j3 = this.g;
        long j4 = -1;
        if (j3 != -1) {
            j4 = j3 - j2;
        }
        return c(j2, j4);
    }

    public final xz3 c(long j2, long j3) {
        if (j2 == 0 && this.g == j3) {
            return this;
        }
        return new xz3(this.a, this.b, this.c, this.d, this.e, this.f + j2, j3, this.h, this.i, this.j);
    }

    public final String toString() {
        String str;
        int i2 = this.c;
        if (i2 == 1) {
            str = "GET";
        } else if (i2 == 2) {
            str = "POST";
        } else if (i2 == 3) {
            str = "HEAD";
        } else {
            throw new IllegalStateException();
        }
        String valueOf = String.valueOf(this.a);
        int length = valueOf.length() + str.length() + 70;
        String str2 = this.h;
        StringBuilder sb = new StringBuilder(me4.e(length, str2));
        sb.append("DataSpec[");
        sb.append(str);
        sb.append(" ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        return wn6.j(sb, this.i, "]");
    }
}
