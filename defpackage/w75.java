package defpackage;

import android.net.Uri;
import java.util.BitSet;

/* renamed from: w75  reason: default package */
public final class w75 extends chd {
    /* JADX WARNING: type inference failed for: r3v0, types: [w75, b7c] */
    public final void B(pg7 pg7, Object obj) {
        y75 y75 = (y75) pg7;
        x75 x75 = obj instanceof x75 ? (x75) obj : null;
        if (x75 != null) {
            BitSet bitSet = (BitSet) x75.b;
            boolean z = bitSet.get(0);
            p32 p32 = this.a;
            if (z || bitSet.get(5)) {
                Uri uri = y75.b;
                if (uri == null) {
                    p32.d(y75.w0, Long.valueOf(y75.a));
                } else {
                    p32.setAvatar(uri);
                }
            }
            if (bitSet.get(1)) {
                p32.setOnline(y75.c);
            }
            if (bitSet.get(2)) {
                p32.setTitle(y75.X);
            }
            if (bitSet.get(3)) {
                p32.setSubtitle(y75.Y);
            }
            bitSet.get(4);
            if (bitSet.get(6)) {
                p32.setVerified(y75.o);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [w75, b7c] */
    /* renamed from: F */
    public final void A(y75 y75) {
        p32 p32 = this.a;
        long j = y75.a;
        p32.setId(j > 2147483647L ? Long.hashCode(j) : (int) j);
        p32.setTitle(y75.X);
        p32.setSubtitle(y75.Y);
        Uri uri = y75.b;
        if (uri == null) {
            p32.d(y75.w0, Long.valueOf(j));
        } else {
            p32.setAvatar(uri);
        }
        p32.setOnline(y75.c);
        p32.setVerified(y75.o);
    }
}
