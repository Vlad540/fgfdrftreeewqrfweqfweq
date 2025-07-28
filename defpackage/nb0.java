package defpackage;

import java.util.List;

/* renamed from: nb0  reason: default package */
public final class nb0 implements zx4 {
    public final int a;
    public final int b;
    public final List c;
    public final List d;
    public final e90 e;
    public final g90 f;

    public nb0(int i, int i2, List list, List list2, e90 e90, g90 g90) {
        this.a = i;
        this.b = i2;
        if (list != null) {
            this.c = list;
            if (list2 != null) {
                this.d = list2;
                this.e = e90;
                if (g90 != null) {
                    this.f = g90;
                    return;
                }
                throw new NullPointerException("Null defaultVideoProfile");
            }
            throw new NullPointerException("Null videoProfiles");
        }
        throw new NullPointerException("Null audioProfiles");
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final List c() {
        return this.c;
    }

    public final List d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nb0)) {
            return false;
        }
        nb0 nb0 = (nb0) obj;
        if (this.a == nb0.a && this.b == nb0.b && this.c.equals(nb0.c) && this.d.equals(nb0.d)) {
            e90 e90 = nb0.e;
            e90 e902 = this.e;
            if (e902 != null ? e902.equals(e90) : e90 == null) {
                if (this.f.equals(nb0.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        e90 e90 = this.e;
        return this.f.hashCode() ^ ((hashCode ^ (e90 == null ? 0 : e90.hashCode())) * 1000003);
    }

    public final String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.a + ", recommendedFileFormat=" + this.b + ", audioProfiles=" + this.c + ", videoProfiles=" + this.d + ", defaultAudioProfile=" + this.e + ", defaultVideoProfile=" + this.f + "}";
    }
}
