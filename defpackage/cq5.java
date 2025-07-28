package defpackage;

/* renamed from: cq5  reason: default package */
public final class cq5 extends dq5 {
    public final CharSequence a;
    public final String b;
    public final boolean c;

    public cq5(CharSequence charSequence, String str, boolean z) {
        this.a = charSequence;
        this.b = str;
        this.c = z;
    }

    public static cq5 b(cq5 cq5, CharSequence charSequence, boolean z, int i) {
        if ((i & 1) != 0) {
            charSequence = cq5.a;
        }
        String str = cq5.b;
        cq5.getClass();
        return new cq5(charSequence, str, z);
    }

    public final CharSequence a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cq5)) {
            return false;
        }
        cq5 cq5 = (cq5) obj;
        return hhd.f(this.a, cq5.a) && hhd.f(this.b, cq5.b) && this.c == cq5.c;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return Boolean.hashCode(this.c) + me4.d((charSequence == null ? 0 : charSequence.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Edit(name=");
        sb.append(this.a);
        sb.append(", folderId=");
        sb.append(this.b);
        sb.append(", canSave=");
        return hr1.j(sb, this.c, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cq5(String str, CharSequence charSequence, int i) {
        this((i & 1) != 0 ? null : charSequence, str, false);
    }
}
