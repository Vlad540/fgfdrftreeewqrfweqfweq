package defpackage;

import android.net.Uri;
import java.util.BitSet;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: pp2  reason: default package */
public final class pp2 extends chd {
    public static o32 H(oi2 oi2) {
        int ordinal = oi2.ordinal();
        if (ordinal == 0) {
            return o32.a;
        }
        if (ordinal == 1) {
            return o32.b;
        }
        if (ordinal == 2) {
            return o32.c;
        }
        if (ordinal == 3) {
            return o32.o;
        }
        if (ordinal == 4) {
            return o32.X;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [pp2, b7c] */
    /* renamed from: F */
    public final void A(pi2 pi2) {
        p32 p32 = this.a;
        int id = p32.getId();
        p32.setId(Long.hashCode(pi2.a));
        p32.setTitle(pi2.c);
        boolean z = false;
        CharSequence charSequence = pi2.Y;
        if (!(!(charSequence == null || h0e.c0(charSequence)))) {
            charSequence = null;
        }
        if (charSequence == null) {
            charSequence = pi2.X;
        }
        p32.setSubtitle(charSequence);
        p32.setTyping(pi2.Z);
        p32.setPinned(pi2.F0 != 0);
        p32.setMuted(pi2.C0);
        p32.setOnline(pi2.x0);
        p32.setCallBadge(pi2.K0);
        p32.setVerified(pi2.y0);
        p32.setMention(pi2.E0);
        p32.setReaction(pi2.D0);
        p32.setTime(pi2.w0);
        if (id == p32.getId()) {
            z = true;
        }
        p32.f(pi2.B0, z);
        p32.setStatus(H(pi2.A0));
        Uri uri = pi2.b;
        if (uri == null) {
            p32.d(pi2.I0, Long.valueOf(pi2.H0));
        } else {
            p32.setAvatar(uri);
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [pp2, b7c] */
    /* renamed from: G */
    public final void B(pi2 pi2, Object obj) {
        CharSequence charSequence = null;
        ni2 ni2 = obj instanceof ni2 ? (ni2) obj : null;
        if (ni2 != null) {
            BitSet bitSet = (BitSet) ni2.b;
            boolean z = true;
            boolean z2 = bitSet.get(1);
            p32 p32 = this.a;
            if (z2) {
                Uri uri = pi2.b;
                if (uri == null) {
                    p32.d(pi2.I0, Long.valueOf(pi2.H0));
                } else {
                    p32.setAvatar(uri);
                }
            }
            if (bitSet.get(0)) {
                p32.setOnline(pi2.x0);
            }
            if (bitSet.get(2)) {
                p32.setTitle(pi2.c);
            }
            if (bitSet.get(4)) {
                p32 p322 = p32;
                CharSequence charSequence2 = pi2.Y;
                if (!(charSequence2 == null || h0e.c0(charSequence2))) {
                    charSequence = charSequence2;
                }
                if (charSequence == null) {
                    charSequence = pi2.X;
                }
                p322.setSubtitle(charSequence);
            }
            if (bitSet.get(5)) {
                p32.setTyping(pi2.Z);
            }
            if (bitSet.get(6)) {
                p32.setTime(pi2.w0);
            }
            if (bitSet.get(8)) {
                p32.setStatus(H(pi2.A0));
            }
            if (bitSet.get(9)) {
                p32.f(pi2.B0, true);
            }
            if (bitSet.get(10)) {
                p32.setMuted(pi2.C0);
            }
            if (bitSet.get(11)) {
                p32.setReaction(pi2.D0);
            }
            if (bitSet.get(12)) {
                p32.setMention(pi2.E0);
            }
            if (bitSet.get(13)) {
                p32 p323 = p32;
                if (pi2.F0 == 0) {
                    z = false;
                }
                p323.setPinned(z);
            }
            if (bitSet.get(14)) {
                p32.setCallBadge(pi2.K0);
                return;
            }
            return;
        }
        A(pi2);
    }
}
