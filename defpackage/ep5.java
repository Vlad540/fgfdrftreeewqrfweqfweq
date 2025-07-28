package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: ep5  reason: default package */
public final class ep5 implements Comparable {
    public final Set A0;
    public final Set B0;
    public final List C0;
    public final Long D0;
    public final Map E0;
    public final List F0;
    public final Set G0;
    public final List X;
    public final Set Y;
    public final boolean Z;
    public final String a;
    public final CharSequence b;
    public final String c;
    public final int o;
    public final boolean w0;
    public final List x0;
    public final boolean y0;
    public final Set z0;

    public ep5(String str, CharSequence charSequence, String str2, int i, List list, Set set, boolean z, boolean z2, List list2, boolean z3, Set set2, Set set3, Set set4, List list3, Long l, Map map, List list4, Set set5) {
        this.a = str;
        this.b = charSequence;
        this.c = str2;
        this.o = i;
        this.X = list;
        this.Y = set;
        this.Z = z;
        this.w0 = z2;
        this.x0 = list2;
        this.y0 = z3;
        this.z0 = set2;
        this.A0 = set3;
        this.B0 = set4;
        this.C0 = list3;
        this.D0 = l;
        this.E0 = map;
        this.F0 = list4;
        this.G0 = set5;
    }

    public static ep5 a(ep5 ep5, String str, int i, List list, int i2) {
        ep5 ep52 = ep5;
        String str2 = (i2 & 1) != 0 ? ep52.a : str;
        CharSequence charSequence = ep52.b;
        String str3 = ep52.c;
        int i3 = (i2 & 8) != 0 ? ep52.o : i;
        List list2 = (i2 & 16) != 0 ? ep52.X : list;
        Set set = ep52.Y;
        boolean z = ep52.Z;
        boolean z2 = ep52.w0;
        List list3 = ep52.x0;
        boolean z3 = ep52.y0;
        Set set2 = ep52.z0;
        Set set3 = ep52.A0;
        Set set4 = ep52.B0;
        List list4 = ep52.C0;
        Long l = ep52.D0;
        List list5 = list4;
        Map map = ep52.E0;
        List list6 = ep52.F0;
        Set set5 = ep52.G0;
        ep5.getClass();
        return new ep5(str2, charSequence, str3, i3, list2, set, z, z2, list3, z3, set2, set3, set4, list5, l, map, list6, set5);
    }

    public final boolean b() {
        return hhd.f(this.a, "all.chat.folder");
    }

    public final int compareTo(Object obj) {
        return hhd.o(this.o, ((ep5) obj).o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ep5)) {
            return false;
        }
        ep5 ep5 = (ep5) obj;
        if (!hhd.f(this.a, ep5.a) || this.o != ep5.o || this.Z != ep5.Z || this.w0 != ep5.w0 || this.y0 != ep5.y0 || !hhd.f(this.D0, ep5.D0) || !hhd.f(this.b, ep5.b) || !hhd.f(this.c, ep5.c) || !hhd.f(this.Y, ep5.Y) || !hhd.f(this.z0, ep5.z0) || !hhd.f(this.A0, ep5.A0) || !hhd.f(this.B0, ep5.B0) || !hhd.f(this.C0, ep5.C0)) {
            return false;
        }
        Map map = ep5.E0;
        Map map2 = this.E0;
        if (map2.size() == map.size()) {
            for (Map.Entry entry : map2.entrySet()) {
                Object value = entry.getValue();
                Object obj2 = map.get((r72) entry.getKey());
                if (obj2 != null) {
                    if (!(value instanceof long[]) || !(obj2 instanceof long[])) {
                        if (!hhd.f(value, obj2)) {
                        }
                    } else if (!Arrays.equals((long[]) value, (long[]) obj2)) {
                    }
                }
            }
            return hhd.f(this.F0, ep5.F0) && hhd.f(this.G0, ep5.G0);
        }
        return false;
    }

    public final int hashCode() {
        int f = th2.f(th2.f(th2.f(this.o * 31, 31, this.Z), 31, this.w0), 31, this.y0);
        Long l = this.D0;
        int f2 = me4.f(this.b, me4.d((f + (l != null ? l.hashCode() : 0)) * 31, 31, this.a), 31);
        String str = this.c;
        int hashCode = (this.G0.hashCode() + c3d.f(this.F0, c3d.f(this.C0, (this.B0.hashCode() + ((this.A0.hashCode() + ((this.z0.hashCode() + c3d.f(this.x0, (this.Y.hashCode() + c3d.f(this.X, (f2 + (str != null ? str.hashCode() : 0)) * 31, 31)) * 31, 31)) * 31)) * 31)) * 31, 31), 31)) * 31;
        int i = 0;
        for (Map.Entry entry : this.E0.entrySet()) {
            Object value = entry.getValue();
            int hashCode2 = ((r72) entry.getKey()).hashCode() + (i * 31);
            if (value instanceof long[]) {
                for (long hashCode3 : (long[]) value) {
                    hashCode2 = (hashCode2 * 31) + Long.hashCode(hashCode3);
                }
                i = hashCode2;
            } else {
                i = (value != null ? value.hashCode() : 0) + (hashCode2 * 31);
            }
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Folder(id='");
        sb.append(this.a);
        sb.append("', includedChats=");
        sb.append(this.z0.size());
        sb.append(", title='");
        sb.append(this.b);
        sb.append("', emoji=");
        sb.append(this.c);
        sb.append(", order=");
        sb.append(this.o);
        sb.append(", filters=");
        sb.append(this.Y);
        sb.append(", isEnabled=");
        sb.append(this.Z);
        sb.append(", isHiddenForAllFolder=");
        sb.append(this.w0);
        sb.append(", hideIfEmpty=");
        sb.append(this.y0);
        sb.append(", creatorId=");
        sb.append(this.D0);
        sb.append(", elements=");
        sb.append(this.C0.size());
        sb.append(", filterSubjects=");
        sb.append(this.E0.size());
        sb.append(", widgets=");
        sb.append(o23.c0(this.F0, "[", "]", (String) null, (u16) null, 60));
        sb.append(", options=");
        return wn6.l(sb, o23.c0(this.G0, "[", "]", (String) null, (u16) null, 60), ")");
    }
}
