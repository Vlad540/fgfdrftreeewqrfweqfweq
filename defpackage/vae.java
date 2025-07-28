package defpackage;

/* renamed from: vae  reason: default package */
public final class vae extends uae {
    public final String Y;
    public final String Z;

    public vae(String str, String str2, String str3, String str4, String str5) {
        super(str, str2, str3);
        this.Y = str4;
        this.Z = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vae) || !super.equals(obj)) {
            return false;
        }
        vae vae = (vae) obj;
        return hhd.f(this.Y, vae.Y) && hhd.f(this.Z, vae.Z);
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        int i = 0;
        String str = this.Y;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        String str2 = this.Z;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder n = me4.n(vae.class.getSimpleName(), "{error='");
        n.append(this.b);
        n.append("', message='");
        n.append(this.c);
        n.append("', title='");
        n.append(this.Y);
        n.append("', description='");
        n.append(this.Z);
        n.append("', localizedMessage='");
        return wn6.l(n, this.o, "'}");
    }
}
