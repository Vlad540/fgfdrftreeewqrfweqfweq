package defpackage;

import java.util.EnumMap;

/* renamed from: ac9  reason: default package */
public final class ac9 {
    public k88 a;
    public k88 b;
    public k88 c;
    public k88 d;

    public ac9(k88 k88, k88 k882, k88 k883, k88 k884) {
        this.a = k88;
        this.b = k882;
        this.c = k883;
        this.d = k884;
    }

    public final EnumMap a() {
        EnumMap enumMap = new EnumMap(j88.class);
        enumMap.put(j88.a, this.a);
        enumMap.put(j88.b, this.b);
        enumMap.put(j88.c, this.c);
        enumMap.put(j88.o, this.d);
        return enumMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac9)) {
            return false;
        }
        ac9 ac9 = (ac9) obj;
        return this.a == ac9.a && this.b == ac9.b && this.c == ac9.c && this.d == ac9.d;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        k88 k88 = this.a;
        k88 k882 = this.b;
        k88 k883 = this.c;
        k88 k884 = this.d;
        return "MutableMediaOptions(audioState=" + k88 + ", videoState=" + k882 + ", screenshareState=" + k883 + ", movieSharingState=" + k884 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ac9() {
        /*
            r1 = this;
            k88 r0 = defpackage.k88.a
            r1.<init>(r0, r0, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ac9.<init>():void");
    }
}
