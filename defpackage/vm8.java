package defpackage;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.exoplayer.source.MergingMediaSource$IllegalMergeException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.UUID;

/* renamed from: vm8  reason: default package */
public final class vm8 extends v83 {
    public static final l68 r;
    public final zh0[] k;
    public final vje[] l;
    public final ArrayList m;
    public final s59 n;
    public int o = -1;
    public long[][] p;
    public MergingMediaSource$IllegalMergeException q;

    static {
        r58 r58 = new r58();
        q44 q44 = new q44();
        Collections.emptyList();
        e8c e8c = e8c.X;
        x58 x58 = new x58();
        d68 d68 = d68.d;
        oyb.k(((Uri) q44.e) == null || ((UUID) q44.d) != null);
        r = new l68("MergingMediaSource", r58.c(), (a68) null, x58.a(), z78.J, d68);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [s59, java.lang.Object] */
    public vm8(zh0... zh0Arr) {
        ? obj = new Object();
        this.k = zh0Arr;
        this.n = obj;
        this.m = new ArrayList(Arrays.asList(zh0Arr));
        this.l = new vje[zh0Arr.length];
        this.p = new long[0][];
        new HashMap();
        ete.l(8, "expectedKeys");
        new fa9().e().g();
    }

    public final boolean a(l68 l68) {
        zh0[] zh0Arr = this.k;
        return zh0Arr.length > 0 && zh0Arr[0].a(l68);
    }

    public final s88 c(se8 se8, l34 l34, long j) {
        zh0[] zh0Arr = this.k;
        int length = zh0Arr.length;
        s88[] s88Arr = new s88[length];
        vje[] vjeArr = this.l;
        int b = vjeArr[0].b(se8.a);
        for (int i = 0; i < length; i++) {
            s88Arr[i] = zh0Arr[i].c(se8.a(vjeArr[i].m(b)), l34, j - this.p[b][i]);
        }
        return new tm8(this.n, this.p[b], s88Arr);
    }

    public final l68 i() {
        zh0[] zh0Arr = this.k;
        return zh0Arr.length > 0 ? zh0Arr[0].i() : r;
    }

    public final void k() {
        MergingMediaSource$IllegalMergeException mergingMediaSource$IllegalMergeException = this.q;
        if (mergingMediaSource$IllegalMergeException == null) {
            super.k();
            return;
        }
        throw mergingMediaSource$IllegalMergeException;
    }

    public final void m(cqe cqe) {
        this.j = cqe;
        this.i = oze.o((Handler.Callback) null);
        int i = 0;
        while (true) {
            zh0[] zh0Arr = this.k;
            if (i < zh0Arr.length) {
                y(Integer.valueOf(i), zh0Arr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public final void o(s88 s88) {
        tm8 tm8 = (tm8) s88;
        int i = 0;
        while (true) {
            zh0[] zh0Arr = this.k;
            if (i < zh0Arr.length) {
                zh0 zh0 = zh0Arr[i];
                s88 s882 = tm8.a[i];
                if (s882 instanceof dje) {
                    s882 = ((dje) s882).a;
                }
                zh0.o(s882);
                i++;
            } else {
                return;
            }
        }
    }

    public final void q() {
        super.q();
        Arrays.fill(this.l, (Object) null);
        this.o = -1;
        this.q = null;
        ArrayList arrayList = this.m;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    public final void t(l68 l68) {
        this.k[0].t(l68);
    }

    public final se8 u(Object obj, se8 se8) {
        if (((Integer) obj).intValue() == 0) {
            return se8;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r7v5, types: [androidx.media3.exoplayer.source.MergingMediaSource$IllegalMergeException, java.io.IOException] */
    public final void x(Object obj, zh0 zh0, vje vje) {
        Integer num = (Integer) obj;
        if (this.q == null) {
            if (this.o == -1) {
                this.o = vje.i();
            } else if (vje.i() != this.o) {
                this.q = new IOException();
                return;
            }
            int length = this.p.length;
            vje[] vjeArr = this.l;
            if (length == 0) {
                int i = this.o;
                int[] iArr = new int[2];
                iArr[1] = vjeArr.length;
                iArr[0] = i;
                this.p = (long[][]) Array.newInstance(Long.TYPE, iArr);
            }
            ArrayList arrayList = this.m;
            arrayList.remove(zh0);
            vjeArr[num.intValue()] = vje;
            if (arrayList.isEmpty()) {
                n(vjeArr[0]);
            }
        }
    }
}
