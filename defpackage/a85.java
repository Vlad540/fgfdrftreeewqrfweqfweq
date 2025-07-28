package defpackage;

import android.net.Uri;
import android.view.View;
import java.util.BitSet;

/* renamed from: a85  reason: default package */
public final class a85 extends chd {
    public u16 J0;
    public u16 K0;

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, a85, b7c] */
    public final void B(pg7 pg7, Object obj) {
        y75 y75 = (y75) pg7;
        x75 x75 = obj instanceof x75 ? (x75) obj : null;
        if (x75 != null) {
            BitSet bitSet = (BitSet) x75.b;
            boolean z = bitSet.get(0);
            View view = this.a;
            if (z) {
                kh3 kh3 = (kh3) view;
                Uri uri = y75.b;
                if (uri == null) {
                    uri = Uri.EMPTY;
                }
                kh3.O(y75.a, y75.w0, uri.toString());
            }
            if (bitSet.get(2)) {
                ((kh3) view).setName(y75.X);
            }
            boolean z2 = bitSet.get(3);
            CharSequence charSequence = y75.Y;
            if (z2) {
                ((kh3) view).setMessage(charSequence);
            }
            if (bitSet.get(4)) {
                kh3 kh32 = (kh3) view;
                if (y75.Z) {
                    a24.Z(kh32, 300, new z75(this, y75, 2));
                    kh32.setMessage(charSequence);
                    kh32.N();
                    return;
                }
                a24.Z(kh32, 300, new z75(this, y75, 3));
                if (charSequence != null) {
                    kh32.P(charSequence, new zu4(this, 5, y75));
                    kh32.setMessage((CharSequence) null);
                    return;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
    }

    public final void D() {
        this.J0 = null;
        this.K0 = null;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [a85, b7c] */
    /* renamed from: F */
    public final void A(y75 y75) {
        kh3 kh3 = (kh3) this.a;
        long j = y75.a;
        kh3.setId((int) (j >> 32));
        if (y75.Z) {
            kh3.setMessage(y75.Y);
        } else {
            kh3.setMessage((CharSequence) null);
        }
        kh3.setName(y75.X);
        Uri uri = y75.b;
        if (uri == null) {
            uri = Uri.EMPTY;
        }
        kh3.O(j, y75.w0, uri.toString());
    }
}
