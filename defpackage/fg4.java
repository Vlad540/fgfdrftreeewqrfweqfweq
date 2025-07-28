package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: fg4  reason: default package */
public abstract class fg4 {
    public static final String a = a24.e0("DiagnosticsWrkr");

    /* JADX INFO: finally extract failed */
    public static final String a(otf otf, duf duf, j8e j8e, ArrayList arrayList) {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ztf ztf = (ztf) it.next();
            i8e r = j8e.r(vx3.o(ztf));
            Integer valueOf = r != null ? Integer.valueOf(r.c) : null;
            otf.getClass();
            pec a2 = pec.a(1, "SELECT name FROM workname WHERE work_spec_id=?");
            String str = ztf.a;
            if (str == null) {
                a2.W(1);
            } else {
                a2.f(1, str);
            }
            aec aec = (aec) otf.a;
            aec.b();
            Cursor o = aec.o(a2, (CancellationSignal) null);
            try {
                ArrayList arrayList2 = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    arrayList2.add(o.isNull(0) ? null : o.getString(0));
                }
                o.close();
                a2.m();
                String c0 = o23.c0(arrayList2, ",", (String) null, (String) null, (u16) null, 62);
                String c02 = o23.c0(duf.m(str), ",", (String) null, (String) null, (u16) null, 62);
                StringBuilder m = hr1.m("\n", str, "\t ");
                m.append(ztf.c);
                m.append("\t ");
                m.append(valueOf);
                m.append("\t ");
                m.append(ztf.b.name());
                m.append("\t ");
                m.append(c0);
                m.append("\t ");
                m.append(c02);
                m.append(9);
                sb.append(m.toString());
            } catch (Throwable th) {
                o.close();
                a2.m();
                throw th;
            }
        }
        return sb.toString();
    }
}
