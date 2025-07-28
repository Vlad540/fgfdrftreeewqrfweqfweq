package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: rn2  reason: default package */
public final class rn2 extends nrc {
    public final long A0;
    public final q1b B0;
    public final CharSequence C0;
    public final List D0;
    public final boolean E0;
    public final boolean F0;
    public final boolean G0;
    public final boolean H0;
    public final CharSequence I0;
    public final boolean J0;
    public final int K0 = f2a.l;
    public final long L0;
    public final boolean X;
    public final boolean Y;
    public final boolean Z;
    public final long c;
    public final boolean o;
    public final CharSequence w0;
    public final int x0;
    public final o32 y0;
    public final Uri z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public rn2(long r7, boolean r9, boolean r10, boolean r11, boolean r12, java.lang.String r13, int r14, o32 r15, android.net.Uri r16, long r17, q1b r19, java.lang.CharSequence r20, java.util.List r21, boolean r22, boolean r23, boolean r24, boolean r25, java.lang.CharSequence r26, boolean r27) {
        /*
            r6 = this;
            r0 = r6
            r1 = r7
            r3 = r21
            r4 = 1
            r6.<init>(r4, r3)
            r0.c = r1
            r4 = r9
            r0.o = r4
            r4 = r10
            r0.X = r4
            r4 = r11
            r0.Y = r4
            r4 = r12
            r0.Z = r4
            r4 = r13
            r0.w0 = r4
            r4 = r14
            r0.x0 = r4
            r4 = r15
            r0.y0 = r4
            r4 = r16
            r0.z0 = r4
            r4 = r17
            r0.A0 = r4
            r4 = r19
            r0.B0 = r4
            r4 = r20
            r0.C0 = r4
            r0.D0 = r3
            r3 = r22
            r0.E0 = r3
            r3 = r23
            r0.F0 = r3
            r3 = r24
            r0.G0 = r3
            r3 = r25
            r0.H0 = r3
            r3 = r26
            r0.I0 = r3
            r3 = r27
            r0.J0 = r3
            int r3 = defpackage.f2a.l
            r0.K0 = r3
            r0.L0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rn2.<init>(long, boolean, boolean, boolean, boolean, java.lang.String, int, o32, android.net.Uri, long, q1b, java.lang.CharSequence, java.util.List, boolean, boolean, boolean, boolean, java.lang.CharSequence, boolean):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rn2)) {
            return false;
        }
        rn2 rn2 = (rn2) obj;
        return this.c == rn2.c && this.o == rn2.o && this.X == rn2.X && this.Y == rn2.Y && this.Z == rn2.Z && hhd.f(this.w0, rn2.w0) && this.x0 == rn2.x0 && this.y0 == rn2.y0 && hhd.f(this.z0, rn2.z0) && this.A0 == rn2.A0 && hhd.f(this.B0, rn2.B0) && hhd.f(this.C0, rn2.C0) && hhd.f(this.D0, rn2.D0) && this.E0 == rn2.E0 && this.F0 == rn2.F0 && this.G0 == rn2.G0 && this.H0 == rn2.H0 && hhd.f(this.I0, rn2.I0) && this.J0 == rn2.J0;
    }

    public final long getItemId() {
        return this.L0;
    }

    public final int hashCode() {
        int f = th2.f(th2.f(th2.f(th2.f(Long.hashCode(this.c) * 31, 31, this.o), 31, this.X), 31, this.Y), 31, this.Z);
        CharSequence charSequence = this.w0;
        int hashCode = (this.y0.hashCode() + c3d.d(this.x0, (f + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31)) * 31;
        Uri uri = this.z0;
        int hashCode2 = (this.B0.hashCode() + sxe.m((hashCode + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.A0)) * 31;
        CharSequence charSequence2 = this.C0;
        return Boolean.hashCode(this.J0) + me4.f(this.I0, th2.f(th2.f(th2.f(th2.f(th2.f(c3d.f(this.D0, (hashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31, 31), 31, this.E0), 31, this.F0), 31, this.G0), 31, this.H0), 31, false), 31);
    }

    public final boolean k(nrc nrc) {
        return equals((rn2) nrc);
    }

    public final int l() {
        return this.K0;
    }

    public final boolean m(nrc nrc) {
        return nrc.getItemId() == this.L0;
    }

    public final String toString() {
        String s = h2g.s(this.B0.a);
        String s2 = h2g.s(this.C0);
        String c0 = o23.c0(this.D0, (String) null, (String) null, (String) null, new hd1(21), 31);
        StringBuilder sb = new StringBuilder("ChatSearchModel(id=");
        sb.append(this.c);
        sb.append(", viewType=");
        sb.append(this.K0);
        sb.append(", itemId=");
        sb.append(this.L0);
        sb.append(", isPinned=");
        sb.append(this.o);
        sb.append(", isMuted=");
        sb.append(this.X);
        sb.append(", hasUnreadReplyOrMention=");
        sb.append(this.Y);
        sb.append(", hasReaction=");
        sb.append(this.Z);
        sb.append(", lastMessageTime=");
        sb.append(this.w0);
        sb.append(", unreadCount=");
        sb.append(this.x0);
        sb.append(", status=");
        sb.append(this.y0);
        sb.append(", avatar=");
        sb.append(this.z0);
        sb.append(", avatarSourceId=");
        sb.append(this.A0);
        sb.append(", preProcessedChatTitle=");
        sb.append(s);
        sb.append(", subtitle=");
        sb.append(s2);
        sb.append(", titleHighlights=");
        sb.append(c0);
        sb.append(", isChannel=");
        sb.append(this.E0);
        sb.append(", highlightTitle=");
        sb.append(this.F0);
        sb.append(", highlightLink=");
        sb.append(this.G0);
        sb.append(", highlightContactName=");
        sb.append(this.H0);
        sb.append(", selected=false, abbreviation=*, isVerified=");
        return hr1.j(sb, this.J0, ")");
    }
}
