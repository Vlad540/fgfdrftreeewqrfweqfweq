package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: cs8  reason: default package */
public final class cs8 extends nrc {
    public final long A0;
    public final ym8 X;
    public final i22 Y;
    public final String Z;
    public final Uri c;
    public final List o;
    public final q1b w0;
    public final CharSequence x0;
    public final long y0;
    public final int z0 = f2a.r;

    public cs8(Uri uri, List list, ym8 ym8, i22 i22, String str, q1b q1b, CharSequence charSequence, long j) {
        super(5, list);
        this.c = uri;
        this.o = list;
        this.X = ym8;
        this.Y = i22;
        this.Z = str;
        this.w0 = q1b;
        this.x0 = charSequence;
        this.y0 = j;
        this.A0 = ym8.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs8)) {
            return false;
        }
        cs8 cs8 = (cs8) obj;
        return hhd.f(this.c, cs8.c) && hhd.f(this.o, cs8.o) && hhd.f(this.X, cs8.X) && hhd.f(this.Y, cs8.Y) && hhd.f(this.Z, cs8.Z) && hhd.f(this.w0, cs8.w0) && hhd.f(this.x0, cs8.x0) && this.y0 == cs8.y0;
    }

    public final long getItemId() {
        return this.A0;
    }

    public final int hashCode() {
        int i = 0;
        Uri uri = this.c;
        int hashCode = (this.X.hashCode() + c3d.f(this.o, (uri == null ? 0 : uri.hashCode()) * 31, 31)) * 31;
        i22 i22 = this.Y;
        int hashCode2 = (hashCode + (i22 == null ? 0 : i22.hashCode())) * 31;
        String str = this.Z;
        int hashCode3 = (this.w0.hashCode() + ((hashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        CharSequence charSequence = this.x0;
        if (charSequence != null) {
            i = charSequence.hashCode();
        }
        return Long.hashCode(this.y0) + ((hashCode3 + i) * 31);
    }

    public final boolean k(nrc nrc) {
        cs8 cs8 = (cs8) nrc;
        if (hhd.f(this.c, cs8.c)) {
            ym8 ym8 = this.X;
            long j = ym8.c;
            ym8 ym82 = cs8.X;
            return j == ym82.c && hhd.f(ym8.Z, ym82.Z) && ym8.X == ym82.X;
        }
    }

    public final int l() {
        return this.z0;
    }

    public final boolean m(nrc nrc) {
        return this.A0 == nrc.getItemId();
    }

    public final String toString() {
        String s = h2g.s(this.x0);
        StringBuilder sb = new StringBuilder("MessageSearchModel(avatar=");
        sb.append(this.c);
        sb.append(", messageHighlights=");
        sb.append(this.o);
        sb.append(", message=");
        sb.append(this.X);
        sb.append(", chat=");
        sb.append(this.Y);
        sb.append(", feedback=");
        sb.append(this.Z);
        sb.append(", preProcessedText=");
        sb.append(this.w0);
        sb.append(", preProcessedChatTitle=");
        sb.append(s);
        sb.append(", chatId=");
        sb.append(this.y0);
        sb.append(", viewType=");
        sb.append(this.z0);
        sb.append(", itemId=");
        return wn6.k(sb, this.A0, ")");
    }
}
