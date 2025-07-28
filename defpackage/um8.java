package defpackage;

import android.os.Handler;
import com.google.android.exoplayer2.source.MergingMediaSource$IllegalMergeException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: um8  reason: default package */
public final class um8 extends u83 {
    public static final j68 r;
    public final yh0[] k;
    public final uje[] l;
    public final ArrayList m;
    public final lu7 n;
    public int o = -1;
    public long[][] p;
    public MergingMediaSource$IllegalMergeException q;

    /* JADX WARNING: type inference failed for: r4v0, types: [s58, u58] */
    static {
        r58 r58 = new r58();
        po5 po5 = ws6.b;
        e8c e8c = e8c.X;
        Collections.emptyList();
        e8c e8c2 = e8c.X;
        r = new j68("MergingMediaSource", new s58(r58), (c68) null, new y58(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), y78.W0);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, lu7] */
    public um8(yh0... yh0Arr) {
        ? obj = new Object();
        this.k = yh0Arr;
        this.n = obj;
        this.m = new ArrayList(Arrays.asList(yh0Arr));
        this.l = new uje[yh0Arr.length];
        this.p = new long[0][];
        new HashMap();
        ete.l(8, "expectedKeys");
        new fa9().e().g();
    }

    public final r88 a(re8 re8, l34 l34, long j) {
        yh0[] yh0Arr = this.k;
        int length = yh0Arr.length;
        r88[] r88Arr = new r88[length];
        uje[] ujeArr = this.l;
        int b = ujeArr[0].b(re8.a);
        for (int i = 0; i < length; i++) {
            r88Arr[i] = yh0Arr[i].a(re8.b(ujeArr[i].m(b)), l34, j - this.p[b][i]);
        }
        return new sm8(this.n, this.p[b], r88Arr);
    }

    public final j68 f() {
        yh0[] yh0Arr = this.k;
        return yh0Arr.length > 0 ? yh0Arr[0].f() : r;
    }

    public final void g() {
        MergingMediaSource$IllegalMergeException mergingMediaSource$IllegalMergeException = this.q;
        if (mergingMediaSource$IllegalMergeException == null) {
            super.g();
            return;
        }
        throw mergingMediaSource$IllegalMergeException;
    }

    public final void i(bqe bqe) {
        this.j = bqe;
        this.i = mze.m((Handler.Callback) null);
        int i = 0;
        while (true) {
            yh0[] yh0Arr = this.k;
            if (i < yh0Arr.length) {
                r(Integer.valueOf(i), yh0Arr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public final void k(r88 r88) {
        sm8 sm8 = (sm8) r88;
        int i = 0;
        while (true) {
            yh0[] yh0Arr = this.k;
            if (i < yh0Arr.length) {
                yh0 yh0 = yh0Arr[i];
                r88 r882 = sm8.a[i];
                if (r882 instanceof qm8) {
                    r882 = ((qm8) r882).a;
                }
                yh0.k(r882);
                i++;
            } else {
                return;
            }
        }
    }

    public final void m() {
        super.m();
        Arrays.fill(this.l, (Object) null);
        this.o = -1;
        this.q = null;
        ArrayList arrayList = this.m;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    public final re8 p(Object obj, re8 re8) {
        if (((Integer) obj).intValue() == 0) {
            return re8;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r7v4, types: [java.io.IOException, com.google.android.exoplayer2.source.MergingMediaSource$IllegalMergeException] */
    public final void q(Integer num, yh0 yh0, uje uje) {
        if (this.q == null) {
            if (this.o == -1) {
                this.o = uje.i();
            } else if (uje.i() != this.o) {
                this.q = new IOException();
                return;
            }
            int length = this.p.length;
            uje[] ujeArr = this.l;
            if (length == 0) {
                int i = this.o;
                int[] iArr = new int[2];
                iArr[1] = ujeArr.length;
                iArr[0] = i;
                this.p = (long[][]) Array.newInstance(Long.TYPE, iArr);
            }
            ArrayList arrayList = this.m;
            arrayList.remove(yh0);
            ujeArr[num.intValue()] = uje;
            if (arrayList.isEmpty()) {
                j(ujeArr[0]);
            }
        }
    }
}
