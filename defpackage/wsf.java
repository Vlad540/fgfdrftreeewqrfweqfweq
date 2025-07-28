package defpackage;

import android.text.TextUtils;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* renamed from: wsf  reason: default package */
public final class wsf extends pa2 {
    public static final String A = a24.e0("WorkContinuationImpl");
    public final itf s;
    public final String t;
    public final a35 u;
    public final List v;
    public final ArrayList w;
    public final ArrayList x = new ArrayList();
    public boolean y;
    public otf z;

    public wsf(itf itf, String str, a35 a35, List list) {
        this.s = itf;
        this.t = str;
        this.u = a35;
        this.v = list;
        this.w = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            String stringId = ((WorkRequest) list.get(i)).getStringId();
            this.w.add(stringId);
            this.x.add(stringId);
        }
    }

    public static HashSet O(wsf wsf) {
        HashSet hashSet = new HashSet();
        wsf.getClass();
        return hashSet;
    }

    public final aga m() {
        if (!this.y) {
            otf otf = new otf(25);
            this.s.d.c(new bz4(this, otf));
            this.z = otf;
        } else {
            a24 B = a24.B();
            B.k0(A, "Already enqueued work ids (" + TextUtils.join(", ", this.w) + ")");
        }
        return this.z;
    }

    public final yh7 r() {
        ArrayList<String> arrayList = this.x;
        itf itf = this.s;
        buf y2 = itf.c.y();
        y2.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (");
        int size = arrayList.size();
        a06.e(sb, size);
        sb.append(")");
        pec a = pec.a(size, sb.toString());
        int i = 1;
        for (String str : arrayList) {
            if (str == null) {
                a.W(i);
            } else {
                a.f(i, str);
            }
            i++;
        }
        q07 q07 = ((aec) y2.a).e;
        auf auf = new auf(y2, a, 0);
        String[] d = q07.d(new String[]{"WorkTag", "WorkProgress", "workspec"});
        int length = d.length;
        int i2 = 0;
        while (i2 < length) {
            String str2 = d[i2];
            if (q07.d.containsKey(str2.toLowerCase(Locale.US))) {
                i2++;
            } else {
                throw new IllegalArgumentException("There is no table with name ".concat(str2).toString());
            }
        }
        nu7 nu7 = q07.j;
        dfc dfc = new dfc((aec) nu7.a, nu7, auf, d);
        sr1 sr1 = ztf.v;
        bee bee = itf.d;
        Object obj = new Object();
        vh8 vh8 = new vh8();
        vh8.l(dfc, new ci7((duf) bee, obj, sr1, vh8));
        return vh8;
    }
}
