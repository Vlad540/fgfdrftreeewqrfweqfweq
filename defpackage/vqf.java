package defpackage;

import android.text.TextUtils;
import androidx.media3.common.ParserException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: vqf  reason: default package */
public final class vqf implements e75 {
    public static final Pattern x0 = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern y0 = Pattern.compile("MPEGTS:(-?\\d+)");
    public final boolean X;
    public i75 Y;
    public byte[] Z = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
    public final String a;
    public final cke b;
    public final ija c = new ija();
    public final s1e o;
    public int w0;

    public vqf(String str, cke cke, smc smc, boolean z) {
        this.a = str;
        this.b = cke;
        this.o = smc;
        this.X = z;
    }

    public final void S(i75 i75) {
        this.Y = this.X ? new it4(i75, this.o) : i75;
        i75.M(new wc0(-9223372036854775807L));
    }

    public final bpe a(long j) {
        bpe B = this.Y.B(0, 3);
        uu5 uu5 = new uu5();
        uu5.m = c49.l("text/vtt");
        uu5.d = this.a;
        uu5.r = j;
        B.e(uu5.a());
        this.Y.w();
        return B;
    }

    public final void d(long j, long j2) {
        throw new IllegalStateException();
    }

    public final int g(g75 g75, le4 le4) {
        String h;
        this.Y.getClass();
        int i = (int) ((r74) g75).c;
        int i2 = this.w0;
        byte[] bArr = this.Z;
        if (i2 == bArr.length) {
            this.Z = Arrays.copyOf(bArr, ((i != -1 ? i : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.Z;
        int i3 = this.w0;
        int read = ((r74) g75).read(bArr2, i3, bArr2.length - i3);
        if (read != -1) {
            int i4 = this.w0 + read;
            this.w0 = i4;
            if (i == -1 || i4 != i) {
                return 0;
            }
        }
        ija ija = new ija(this.Z);
        xqf.d(ija);
        String h2 = ija.h(f22.c);
        long j = 0;
        long j2 = 0;
        while (true) {
            Matcher matcher = null;
            if (!TextUtils.isEmpty(h2)) {
                if (h2.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = x0.matcher(h2);
                    if (matcher2.find()) {
                        Matcher matcher3 = y0.matcher(h2);
                        if (matcher3.find()) {
                            String group = matcher2.group(1);
                            group.getClass();
                            j2 = xqf.c(group);
                            String group2 = matcher3.group(1);
                            group2.getClass();
                            j = (Long.parseLong(group2) * 1000000) / 90000;
                        } else {
                            throw ParserException.a((RuntimeException) null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(h2));
                        }
                    } else {
                        throw ParserException.a((RuntimeException) null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(h2));
                    }
                }
                h2 = ija.h(f22.c);
            } else {
                while (true) {
                    String h3 = ija.h(f22.c);
                    if (h3 == null) {
                        break;
                    } else if (xqf.a.matcher(h3).matches()) {
                        do {
                            h = ija.h(f22.c);
                            if (h == null) {
                                break;
                            }
                        } while (h.isEmpty());
                    } else {
                        Matcher matcher4 = sqf.a.matcher(h3);
                        if (matcher4.matches()) {
                            matcher = matcher4;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    a(0);
                    return -1;
                }
                String group3 = matcher.group(1);
                group3.getClass();
                long c2 = xqf.c(group3);
                long b2 = this.b.b(((((j + c2) - j2) * 90000) / 1000000) % 8589934592L);
                bpe a2 = a(b2 - c2);
                byte[] bArr3 = this.Z;
                int i5 = this.w0;
                ija ija2 = this.c;
                ija2.E(i5, bArr3);
                a2.b(ija2, this.w0, 0);
                a2.a(b2, 1, this.w0, 0, (zoe) null);
                return -1;
            }
        }
    }

    public final boolean n(g75 g75) {
        r74 r74 = (r74) g75;
        r74.r(this.Z, 0, 6, false);
        byte[] bArr = this.Z;
        ija ija = this.c;
        ija.E(6, bArr);
        if (xqf.a(ija)) {
            return true;
        }
        r74.r(this.Z, 6, 3, false);
        ija.E(9, this.Z);
        return xqf.a(ija);
    }

    public final void release() {
    }
}
