package defpackage;

import android.text.SpannableStringBuilder;

/* renamed from: s91  reason: default package */
public final class s91 implements v91 {
    public final boolean A0;
    public final boolean B0;
    public final boolean C0;
    public final hze D0;
    public final ize E0;
    public final int F0;
    public final mc0 X;
    public final boolean Y;
    public final boolean Z;
    public final le1 a;
    public final String b;
    public final CharSequence c;
    public final String o;
    public final boolean w0;
    public final boolean x0;
    public final boolean y0;
    public final boolean z0;

    public s91(le1 le1, String str, SpannableStringBuilder spannableStringBuilder, String str2, mc0 mc0, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, hze hze, ize ize, int i) {
        this.a = le1;
        this.b = str;
        this.c = spannableStringBuilder;
        this.o = str2;
        this.X = mc0;
        this.Y = z;
        this.Z = z2;
        this.w0 = z3;
        this.x0 = z4;
        this.y0 = z5;
        this.z0 = z6;
        this.A0 = z7;
        this.B0 = z8;
        this.C0 = z9;
        this.D0 = hze;
        this.E0 = ize;
        this.F0 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s91)) {
            return false;
        }
        s91 s91 = (s91) obj;
        return hhd.f(this.a, s91.a) && hhd.f(this.b, s91.b) && hhd.f(this.c, s91.c) && hhd.f(this.o, s91.o) && hhd.f(this.X, s91.X) && this.Y == s91.Y && this.Z == s91.Z && this.w0 == s91.w0 && this.x0 == s91.x0 && this.y0 == s91.y0 && this.z0 == s91.z0 && this.A0 == s91.A0 && this.B0 == s91.B0 && this.C0 == s91.C0 && hhd.f(this.D0, s91.D0) && this.E0 == s91.E0 && this.F0 == s91.F0;
    }

    public final boolean g(pg7 pg7) {
        return this.a.a == pg7.getItemId();
    }

    public final long getItemId() {
        return this.a.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.c;
        int hashCode3 = (hashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str2 = this.o;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        mc0 mc0 = this.X;
        int f = th2.f(th2.f(th2.f(th2.f(th2.f(th2.f(th2.f(th2.f(th2.f((hashCode4 + (mc0 == null ? 0 : mc0.hashCode())) * 31, 31, this.Y), 31, this.Z), 31, this.w0), 31, this.x0), 31, this.y0), 31, this.z0), 31, this.A0), 31, this.B0), 31, this.C0);
        hze hze = this.D0;
        if (hze != null) {
            i = hze.hashCode();
        }
        return hr1.t(this.F0) + ((this.E0.hashCode() + ((f + i) * 31)) * 31);
    }

    public final int l() {
        return 1;
    }

    public final Object n(Object obj) {
        s91 s91 = (pg7) obj;
        lg7 c2 = hwf.c();
        CharSequence charSequence = this.c;
        CharSequence charSequence2 = s91.c;
        boolean f = hhd.f(charSequence, charSequence2);
        String str = s91.o;
        if (!f || !hhd.f(this.o, str)) {
            c2.add(new n91((SpannableStringBuilder) charSequence2, str));
        }
        boolean z = this.w0;
        boolean z2 = s91.w0;
        if (z != z2) {
            c2.add(new m91(z2));
        }
        boolean z3 = this.Y;
        boolean z4 = s91.Y;
        if (z3 != z4) {
            c2.add(new p91(z4));
        }
        mc0 mc0 = this.X;
        mc0 mc02 = s91.X;
        if (!hhd.f(mc0, mc02)) {
            c2.add(new k91(mc02));
        }
        ize ize = this.E0;
        ize ize2 = s91.E0;
        if (ize != ize2) {
            c2.add(new l91(ize2));
        }
        hze hze = this.D0;
        hze hze2 = s91.D0;
        if (!hhd.f(hze, hze2)) {
            c2.add(new q91(hze2));
        }
        boolean z5 = this.z0;
        boolean z6 = s91.z0;
        if (z5 != z6) {
            c2.add(new o91(z6));
        }
        return hwf.a(c2);
    }

    public final String toString() {
        return "CallOpponentState(opponentId=" + this.a + ", userName=" + this.b + ", userNameWithState=" + this.c + ", userNameAccessibility=" + this.o + ", avatar=" + this.X + ", isTalking=" + this.Y + ", isConnectedOnce=" + this.Z + ", isConnecting=" + this.w0 + ", isVideoEnabled=" + this.x0 + ", isMicrophoneEnabled=" + this.y0 + ", isRaiseHand=" + this.z0 + ", isMe=" + this.A0 + ", isAdmin=" + this.B0 + ", isCreator=" + this.C0 + ", videoState=" + this.D0 + ", buttonAction=" + this.E0 + ", talkingState=" + c3d.p(this.F0) + ")";
    }
}
