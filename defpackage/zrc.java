package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: zrc  reason: default package */
public final class zrc implements csc {
    public final t52 a;
    public final di3 b;
    public final gsc c;
    public final boolean d;
    public final csc e;
    public final csc f;

    public zrc(t52 t52, di3 di3, gsc gsc, boolean z, asc asc, bsc bsc) {
        this.a = t52;
        this.b = di3;
        this.c = gsc;
        this.d = z;
        this.e = asc;
        this.f = bsc;
    }

    public final List a(String str) {
        ArrayList arrayList = new ArrayList();
        csc csc = this.f;
        if (csc != null) {
            arrayList.addAll(csc.a(str));
        }
        try {
            zb9 zb9 = new zb9((Object) null);
            zb9 zb92 = new zb9((Object) null);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            c(str, zb9, zb92, arrayList2, arrayList3);
            ArrayList b2 = b(str, this.d, zb9, zb92);
            arrayList.addAll(arrayList2);
            arrayList.addAll(b2);
            if (arrayList.size() > 1) {
                t23.J(arrayList, new gu6(12));
            }
            arrayList.addAll(arrayList3);
        } catch (Throwable th) {
            udd.s("Fts", "failure to search", th);
        }
        if (arrayList.isEmpty()) {
            try {
                arrayList.addAll(this.e.a(str));
            } catch (Throwable th2) {
                udd.s("Fts", "failure to search by fallback strategy", th2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: finally extract failed */
    public final ArrayList b(String str, boolean z, zb9 zb9, zb9 zb92) {
        n16 e2;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2 = str;
        boolean z2 = z;
        ArrayList arrayList3 = new ArrayList();
        t52 t52 = this.a;
        xdc xdc = ((hz3) ((a04) t52.l.get())).b;
        xdc.getClass();
        boolean c0 = h0e.c0(str);
        List<Long> list = hw4.a;
        if (!c0 && (e2 = o16.e(str)) != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            m16 m16 = e2.a;
            m16 m162 = m16.c;
            String str3 = m16.a;
            String str4 = m16.b;
            if (m162 != null) {
                yp2 c2 = xdc.c();
                m16 m163 = m16.c;
                String str5 = m163.a;
                c2.getClass();
                pec a2 = pec.a(4, "SELECT docid FROM chat_title WHERE originalTitle MATCH ? OR normalizedTitle MATCH ? OR normalizedTitleWithoutEmoji MATCH ? OR originalTitleWithoutEmoji MATCH ? || '*' ORDER BY sortTime DESC ");
                if (str4 == null) {
                    a2.W(1);
                } else {
                    a2.f(1, str4);
                }
                if (str3 == null) {
                    a2.W(2);
                } else {
                    a2.f(2, str3);
                }
                if (str5 == null) {
                    a2.W(3);
                } else {
                    a2.f(3, str5);
                }
                String str6 = m163.b;
                if (str6 == null) {
                    a2.W(4);
                } else {
                    a2.f(4, str6);
                }
                aec aec = c2.a;
                aec.b();
                Cursor o = aec.o(a2, (CancellationSignal) null);
                try {
                    arrayList = new ArrayList(o.getCount());
                    while (o.moveToNext()) {
                        arrayList.add(o.isNull(0) ? null : Long.valueOf(o.getLong(0)));
                    }
                } finally {
                    o.close();
                    a2.m();
                }
            } else {
                yp2 c3 = xdc.c();
                c3.getClass();
                pec a3 = pec.a(2, "SELECT docid FROM chat_title WHERE originalTitle MATCH ? OR normalizedTitle MATCH ? || '*' ORDER BY sortTime DESC ");
                if (str4 == null) {
                    a3.W(1);
                } else {
                    a3.f(1, str4);
                }
                if (str3 == null) {
                    a3.W(2);
                } else {
                    a3.f(2, str3);
                }
                aec aec2 = c3.a;
                aec2.b();
                Cursor o2 = aec2.o(a3, (CancellationSignal) null);
                try {
                    ArrayList arrayList4 = new ArrayList(o2.getCount());
                    while (o2.moveToNext()) {
                        arrayList4.add(o2.isNull(0) ? null : Long.valueOf(o2.getLong(0)));
                    }
                    o2.close();
                    a3.m();
                    arrayList = arrayList4;
                } catch (Throwable th) {
                    o2.close();
                    a3.m();
                    throw th;
                }
            }
            linkedHashSet.addAll(arrayList);
            m16 m164 = e2.b;
            m16 m165 = m164.c;
            String str7 = m164.a;
            String str8 = m164.b;
            if (m165 != null) {
                yp2 c4 = xdc.c();
                m16 m166 = m164.c;
                String str9 = m166.a;
                c4.getClass();
                pec a4 = pec.a(4, "SELECT docid FROM chat_title WHERE originalTitle LIKE ? OR normalizedTitle LIKE ? OR normalizedTitleWithoutEmoji LIKE ? OR originalTitleWithoutEmoji LIKE ? ORDER BY sortTime DESC ");
                if (str8 == null) {
                    a4.W(1);
                } else {
                    a4.f(1, str8);
                }
                if (str7 == null) {
                    a4.W(2);
                } else {
                    a4.f(2, str7);
                }
                if (str9 == null) {
                    a4.W(3);
                } else {
                    a4.f(3, str9);
                }
                String str10 = m166.b;
                if (str10 == null) {
                    a4.W(4);
                } else {
                    a4.f(4, str10);
                }
                aec aec3 = c4.a;
                aec3.b();
                Cursor o3 = aec3.o(a4, (CancellationSignal) null);
                try {
                    arrayList2 = new ArrayList(o3.getCount());
                    while (o3.moveToNext()) {
                        arrayList2.add(o3.isNull(0) ? null : Long.valueOf(o3.getLong(0)));
                    }
                } finally {
                    o3.close();
                    a4.m();
                }
            } else {
                yp2 c5 = xdc.c();
                c5.getClass();
                pec a5 = pec.a(2, "SELECT docid FROM chat_title WHERE originalTitle LIKE ? OR normalizedTitle LIKE ? ORDER BY sortTime DESC ");
                if (str8 == null) {
                    a5.W(1);
                } else {
                    a5.f(1, str8);
                }
                if (str7 == null) {
                    a5.W(2);
                } else {
                    a5.f(2, str7);
                }
                aec aec4 = c5.a;
                aec4.b();
                Cursor o4 = aec4.o(a5, (CancellationSignal) null);
                try {
                    arrayList2 = new ArrayList(o4.getCount());
                    while (o4.moveToNext()) {
                        arrayList2.add(o4.isNull(0) ? null : Long.valueOf(o4.getLong(0)));
                    }
                } finally {
                    o4.close();
                    a5.m();
                }
            }
            linkedHashSet.addAll(arrayList2);
            list = o23.s0(linkedHashSet);
        }
        if (!ek8.J(list)) {
            EnumSet enumSet = z2 ? t52.M : t52.L;
            for (Long longValue : list) {
                i22 B = t52.B(longValue.longValue());
                if (B != null && t52.m(B, enumSet, z2, ((j2b) t52.n).e)) {
                    try {
                        if (B.A()) {
                            try {
                                if (zb92.d(B.a)) {
                                    zb9 zb93 = zb9;
                                } else {
                                    tf3 k = B.k();
                                    gsc gsc = this.c;
                                    if (k != null) {
                                        if (!zb9.d(k.n())) {
                                            arrayList3.add(gsc.a(B, str2));
                                        }
                                    } else {
                                        zb9 zb94 = zb9;
                                    }
                                    arrayList3.add(gsc.a(B, str2));
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                udd.s("t52", "iterateChatsByQuery fail", th);
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        zb9 zb95 = zb9;
                        zb9 zb96 = zb92;
                        udd.s("t52", "iterateChatsByQuery fail", th);
                    }
                }
                zb9 zb97 = zb9;
                zb9 zb98 = zb92;
            }
        }
        if (arrayList3.size() > 1) {
            t23.J(arrayList3, new gu6(11));
        }
        return arrayList3;
    }

    public final void c(String str, zb9 zb9, zb9 zb92, ArrayList arrayList, ArrayList arrayList2) {
        n16 e2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String str2 = str;
        di3 di3 = this.b;
        ydc ydc = ((hz3) ((a04) di3.f.get())).d;
        ydc.getClass();
        boolean c0 = h0e.c0(str);
        List<Long> list = hw4.a;
        if (!c0 && (e2 = o16.e(str)) != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            m16 m16 = e2.a;
            m16 m162 = m16.c;
            String str3 = m16.a;
            String str4 = m16.b;
            if (m162 != null) {
                do3 x = ydc.x();
                m16 m163 = m16.c;
                String str5 = m163.a;
                x.getClass();
                pec a2 = pec.a(5, "SELECT docid FROM contact_title WHERE (allOriginalTitles MATCH ? OR allNormalizedTitles MATCH ? OR link MATCH ? OR allNormalizedTitlesWithoutEmoji MATCH ? OR allOriginalTitlesWithoutEmoji MATCH ? || '*')");
                if (str4 == null) {
                    a2.W(1);
                } else {
                    a2.f(1, str4);
                }
                if (str3 == null) {
                    a2.W(2);
                } else {
                    a2.f(2, str3);
                }
                if (str3 == null) {
                    a2.W(3);
                } else {
                    a2.f(3, str3);
                }
                if (str5 == null) {
                    a2.W(4);
                } else {
                    a2.f(4, str5);
                }
                String str6 = m163.b;
                if (str6 == null) {
                    a2.W(5);
                } else {
                    a2.f(5, str6);
                }
                aec aec = x.a;
                aec.b();
                Cursor o = aec.o(a2, (CancellationSignal) null);
                try {
                    arrayList3 = new ArrayList(o.getCount());
                    while (o.moveToNext()) {
                        arrayList3.add(o.isNull(0) ? null : Long.valueOf(o.getLong(0)));
                    }
                } finally {
                    o.close();
                    a2.m();
                }
            } else {
                do3 x2 = ydc.x();
                x2.getClass();
                pec a3 = pec.a(3, "SELECT docid FROM contact_title WHERE allOriginalTitles MATCH ? OR allNormalizedTitles MATCH ? OR link MATCH ?");
                if (str4 == null) {
                    a3.W(1);
                } else {
                    a3.f(1, str4);
                }
                if (str3 == null) {
                    a3.W(2);
                } else {
                    a3.f(2, str3);
                }
                if (str3 == null) {
                    a3.W(3);
                } else {
                    a3.f(3, str3);
                }
                aec aec2 = x2.a;
                aec2.b();
                Cursor o2 = aec2.o(a3, (CancellationSignal) null);
                try {
                    arrayList3 = new ArrayList(o2.getCount());
                    while (o2.moveToNext()) {
                        arrayList3.add(o2.isNull(0) ? null : Long.valueOf(o2.getLong(0)));
                    }
                } finally {
                    o2.close();
                    a3.m();
                }
            }
            linkedHashSet.addAll(arrayList3);
            m16 m164 = e2.b;
            m16 m165 = m164.c;
            String str7 = m164.a;
            String str8 = m164.b;
            if (m165 != null) {
                do3 x3 = ydc.x();
                m16 m166 = m164.c;
                String str9 = m166.a;
                x3.getClass();
                pec a4 = pec.a(5, "SELECT docid FROM contact_title WHERE (allOriginalTitles LIKE ? OR allNormalizedTitles LIKE ? OR link LIKE ? OR allNormalizedTitlesWithoutEmoji LIKE ? OR allOriginalTitlesWithoutEmoji LIKE ?)");
                if (str8 == null) {
                    a4.W(1);
                } else {
                    a4.f(1, str8);
                }
                if (str7 == null) {
                    a4.W(2);
                } else {
                    a4.f(2, str7);
                }
                if (str7 == null) {
                    a4.W(3);
                } else {
                    a4.f(3, str7);
                }
                if (str9 == null) {
                    a4.W(4);
                } else {
                    a4.f(4, str9);
                }
                String str10 = m166.b;
                if (str10 == null) {
                    a4.W(5);
                } else {
                    a4.f(5, str10);
                }
                aec aec3 = x3.a;
                aec3.b();
                Cursor o3 = aec3.o(a4, (CancellationSignal) null);
                try {
                    arrayList4 = new ArrayList(o3.getCount());
                    while (o3.moveToNext()) {
                        arrayList4.add(o3.isNull(0) ? null : Long.valueOf(o3.getLong(0)));
                    }
                } finally {
                    o3.close();
                    a4.m();
                }
            } else {
                do3 x4 = ydc.x();
                x4.getClass();
                pec a5 = pec.a(3, "SELECT docid FROM contact_title WHERE (allOriginalTitles LIKE ? OR allNormalizedTitles LIKE ? OR link LIKE ?)");
                if (str8 == null) {
                    a5.W(1);
                } else {
                    a5.f(1, str8);
                }
                if (str7 == null) {
                    a5.W(2);
                } else {
                    a5.f(2, str7);
                }
                if (str7 == null) {
                    a5.W(3);
                } else {
                    a5.f(3, str7);
                }
                aec aec4 = x4.a;
                aec4.b();
                Cursor o4 = aec4.o(a5, (CancellationSignal) null);
                try {
                    arrayList4 = new ArrayList(o4.getCount());
                    while (o4.moveToNext()) {
                        arrayList4.add(o4.isNull(0) ? null : Long.valueOf(o4.getLong(0)));
                    }
                } finally {
                    o4.close();
                    a5.m();
                }
            }
            linkedHashSet.addAll(arrayList4);
            list = o23.s0(linkedHashSet);
        }
        if (!ek8.J(list)) {
            tf3 i = di3.i(((j2b) di3.h).a.s(), false);
            for (Long l : list) {
                tf3 tf3 = (tf3) di3.a.get(l);
                if (!(tf3 == null || i == null || tf3 == i)) {
                    if (di3.s.contains(tf3.a.c.k)) {
                        try {
                            i22 E = this.a.E(tf3.n());
                            gsc gsc = this.c;
                            if (E == null || !E.A()) {
                                zb9 zb93 = zb9;
                                zb9 zb94 = zb92;
                                ArrayList arrayList5 = arrayList;
                                try {
                                    arrayList2.add(gsc.b(tf3, str2));
                                } catch (Throwable th) {
                                    th = th;
                                }
                            } else {
                                try {
                                    arrayList.add(gsc.a(E, str2));
                                } catch (Throwable th2) {
                                    th = th2;
                                    zb9 zb95 = zb9;
                                    zb9 zb96 = zb92;
                                    ArrayList arrayList6 = arrayList2;
                                    udd.s("ContactController", "iterateContactsByQuery fail", th);
                                }
                                try {
                                    zb92.a(E.a);
                                    zb9.a(tf3.n());
                                    ArrayList arrayList7 = arrayList2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    ArrayList arrayList62 = arrayList2;
                                    udd.s("ContactController", "iterateContactsByQuery fail", th);
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            zb9 zb97 = zb9;
                            zb9 zb98 = zb92;
                            ArrayList arrayList8 = arrayList;
                            ArrayList arrayList622 = arrayList2;
                            udd.s("ContactController", "iterateContactsByQuery fail", th);
                        }
                    }
                }
                zb9 zb99 = zb9;
                zb9 zb910 = zb92;
                ArrayList arrayList9 = arrayList;
                ArrayList arrayList72 = arrayList2;
            }
        }
    }
}
