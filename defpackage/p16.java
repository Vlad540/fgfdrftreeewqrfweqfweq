package defpackage;

import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Set;

/* renamed from: p16  reason: default package */
public final class p16 {
    public static final String[] d = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};
    public final String a;
    public final Set b;
    public final Set c;

    public p16(String str, AbstractSet abstractSet, Set set) {
        this.a = str;
        this.b = abstractSet;
        this.c = set;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0080, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0081, code lost:
        defpackage.urd.l(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0084, code lost:
        throw r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.p16 a(defpackage.sz5 r4, java.lang.String r5) {
        /*
            u3d r0 = new u3d
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "PRAGMA table_info(`"
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r2 = "`)"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.database.Cursor r1 = r4.q0(r1)
            int r2 = r1.getColumnCount()     // Catch:{ all -> 0x0036 }
            if (r2 <= 0) goto L_0x0038
            java.lang.String r2 = "name"
            int r2 = r1.getColumnIndex(r2)     // Catch:{ all -> 0x0036 }
        L_0x0028:
            boolean r3 = r1.moveToNext()     // Catch:{ all -> 0x0036 }
            if (r3 == 0) goto L_0x0038
            java.lang.String r3 = r1.getString(r2)     // Catch:{ all -> 0x0036 }
            r0.add(r3)     // Catch:{ all -> 0x0036 }
            goto L_0x0028
        L_0x0036:
            r4 = move-exception
            goto L_0x007f
        L_0x0038:
            r2 = 0
            defpackage.urd.l(r1, r2)
            u3d r0 = defpackage.z3d.h(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "SELECT * FROM sqlite_master WHERE `name` = '"
            r1.<init>(r3)
            r1.append(r5)
            r3 = 39
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.database.Cursor r4 = r4.q0(r1)
            boolean r1 = r4.moveToFirst()     // Catch:{ all -> 0x0068 }
            if (r1 == 0) goto L_0x006a
            java.lang.String r1 = "sql"
            int r1 = r4.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0068 }
            java.lang.String r1 = r4.getString(r1)     // Catch:{ all -> 0x0068 }
            goto L_0x006c
        L_0x0068:
            r5 = move-exception
            goto L_0x0079
        L_0x006a:
            java.lang.String r1 = ""
        L_0x006c:
            defpackage.urd.l(r4, r2)
            java.util.Set r4 = defpackage.pfa.z(r1)
            p16 r1 = new p16
            r1.<init>((java.lang.String) r5, (java.util.AbstractSet) r0, (java.util.Set) r4)
            return r1
        L_0x0079:
            throw r5     // Catch:{ all -> 0x007a }
        L_0x007a:
            r0 = move-exception
            defpackage.urd.l(r4, r5)
            throw r0
        L_0x007f:
            throw r4     // Catch:{ all -> 0x0080 }
        L_0x0080:
            r5 = move-exception
            defpackage.urd.l(r1, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p16.a(sz5, java.lang.String):p16");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p16)) {
            return false;
        }
        p16 p16 = (p16) obj;
        if (hhd.f(this.a, p16.a) && hhd.f(this.b, p16.b)) {
            return hhd.f(this.c, p16.c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "FtsTableInfo{name='" + this.a + "', columns=" + this.b + ", options=" + this.c + "'}";
    }

    public p16(String str, HashSet hashSet, String str2) {
        this(str, (AbstractSet) hashSet, pfa.z(str2));
    }
}
