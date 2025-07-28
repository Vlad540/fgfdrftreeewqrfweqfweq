package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: jo7  reason: default package */
public final class jo7 extends lbe implements co7 {
    public final List A0;
    public final boolean B0;
    public final long C0;
    public final pm4 D0;
    public final long E0;
    public final List X;
    public final Map Y;
    public final String Z;
    public final uj3 c;
    public final List o;
    public final long w0;
    public final ra3 x0;
    public final Map y0;
    public final long z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ jo7() {
        /*
            r19 = this;
            hw4 r12 = hw4.a
            iw4 r9 = iw4.a
            r17 = 0
            r1 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r0 = r19
            r2 = r12
            r3 = r12
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9, r10, r12, r13, r14, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jo7.<init>():void");
    }

    public final String a(boolean z, boolean z2) {
        zzc zzc;
        Map map;
        ra3 ra3 = this.x0;
        if (!(ra3 == null || (zzc = ra3.b) == null || (map = zzc.b) == null)) {
            String str = null;
            if (map.containsKey("log-full")) {
                Object obj = map.get("log-full");
                z = Boolean.parseBoolean(obj != null ? obj.toString() : null);
            }
            if (map.containsKey("log-sensitive")) {
                Object obj2 = map.get("log-sensitive");
                if (obj2 != null) {
                    str = obj2.toString();
                }
                z2 = Boolean.parseBoolean(str);
            }
        }
        StringBuilder sb = new StringBuilder("LOGIN.Response(profile=");
        sb.append(String.valueOf(this.c));
        sb.append(",token=");
        String str2 = this.Z;
        sb.append(z2 ? str2 != null ? str2.toString() : "NULL" : r1g.v(str2));
        sb.append(",time=");
        sb.append(this.w0);
        sb.append(",chatMarker=");
        sb.append(this.z0);
        sb.append(",videoChatHistory=");
        sb.append(this.B0);
        sb.append(",resetAt=");
        sb.append(this.C0);
        sb.append(",contactInfos=");
        sb.append(gwf.A(this.X, z, z2));
        sb.append(",config=");
        sb.append(ra3);
        sb.append(",messages=");
        sb.append(gwf.B(this.y0, z, z2));
        sb.append(",chats=");
        sb.append(gwf.A(this.o, z, z2));
        sb.append(",presence=");
        sb.append(gwf.B(this.Y, z, z2));
        sb.append(",calls=");
        sb.append(gwf.A(this.A0, z, z2));
        sb.append(",draftsNews=");
        sb.append(this.D0);
        sb.append(')');
        return sb.toString();
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        for (Object next : this.X) {
            if (((uj3) next) != sj3.E0) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo7)) {
            return false;
        }
        jo7 jo7 = (jo7) obj;
        return hhd.f(this.c, jo7.c) && hhd.f(this.o, jo7.o) && hhd.f(this.X, jo7.X) && hhd.f(this.Y, jo7.Y) && hhd.f(this.Z, jo7.Z) && this.w0 == jo7.w0 && hhd.f(this.x0, jo7.x0) && hhd.f(this.y0, jo7.y0) && this.z0 == jo7.z0 && hhd.f(this.A0, jo7.A0) && this.B0 == jo7.B0 && this.C0 == jo7.C0 && hhd.f(this.D0, jo7.D0) && this.E0 == jo7.E0;
    }

    public final int hashCode() {
        int i = 0;
        uj3 uj3 = this.c;
        int hashCode = (this.Y.hashCode() + c3d.f(this.X, c3d.f(this.o, (uj3 == null ? 0 : uj3.hashCode()) * 31, 31), 31)) * 31;
        String str = this.Z;
        int m = sxe.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.w0);
        ra3 ra3 = this.x0;
        int m2 = sxe.m(th2.f(c3d.f(this.A0, sxe.m((this.y0.hashCode() + ((m + (ra3 == null ? 0 : ra3.hashCode())) * 31)) * 31, 31, this.z0), 31), 31, this.B0), 31, this.C0);
        pm4 pm4 = this.D0;
        if (pm4 != null) {
            i = pm4.hashCode();
        }
        return Long.hashCode(this.E0) + ((m2 + i) * 31);
    }

    public final String toString() {
        return a(false, false);
    }

    public jo7(uj3 uj3, List list, List list2, Map map, String str, long j, ra3 ra3, Map map2, long j2, List list3, boolean z, long j3, pm4 pm4, long j4) {
        long j5 = j4;
        this.c = uj3;
        this.o = list;
        this.X = list2;
        this.Y = map;
        this.Z = str;
        this.w0 = j;
        this.x0 = ra3;
        this.y0 = map2;
        this.z0 = j2;
        this.A0 = list3;
        this.B0 = z;
        this.C0 = j3;
        this.D0 = pm4;
        this.E0 = j5;
        this.a = TimeUnit.NANOSECONDS.toMillis(Math.abs(System.nanoTime() - j5));
    }
}
