package defpackage;

import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: uqf  reason: default package */
public final class uqf implements d75 {
    public static final Pattern g = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern h = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String a;
    public final bke b;
    public final yze c = new yze(3, false);
    public h75 d;
    public byte[] e = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
    public int f;

    public uqf(String str, bke bke) {
        this.a = str;
        this.b = bke;
    }

    public final ape a(long j) {
        ape B = this.d.B(0, 3);
        tu5 tu5 = new tu5();
        tu5.k = "text/vtt";
        tu5.c = this.a;
        tu5.o = j;
        B.d(tu5.a());
        this.d.w();
        return B;
    }

    public final void d(long j, long j2) {
        throw new IllegalStateException();
    }

    public final void g(h75 h75) {
        this.d = h75;
        h75.K(new si5(-9223372036854775807L));
    }

    public final boolean h(f75 f75) {
        q74 q74 = (q74) f75;
        q74.r(this.e, 0, 6, false);
        byte[] bArr = this.e;
        yze yze = this.c;
        yze.F(6, bArr);
        if (wqf.a(yze)) {
            return true;
        }
        q74.r(this.e, 6, 3, false);
        yze.F(9, this.e);
        return wqf.a(yze);
    }

    public final int i(f75 f75, le4 le4) {
        String i;
        this.d.getClass();
        int i2 = (int) ((q74) f75).c;
        int i3 = this.f;
        byte[] bArr = this.e;
        if (i3 == bArr.length) {
            this.e = Arrays.copyOf(bArr, ((i2 != -1 ? i2 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.e;
        int i4 = this.f;
        int read = ((q74) f75).read(bArr2, i4, bArr2.length - i4);
        if (read != -1) {
            int i5 = this.f + read;
            this.f = i5;
            if (i2 == -1 || i5 != i2) {
                return 0;
            }
        }
        yze yze = new yze(this.e);
        wqf.d(yze);
        String i6 = yze.i();
        long j = 0;
        long j2 = 0;
        while (true) {
            Matcher matcher = null;
            if (!TextUtils.isEmpty(i6)) {
                if (i6.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = g.matcher(i6);
                    if (!matcher2.find()) {
                        throw ParserException.a((RuntimeException) null, i6.length() != 0 ? "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(i6) : new String("X-TIMESTAMP-MAP doesn't contain local timestamp: "));
                    }
                    Matcher matcher3 = h.matcher(i6);
                    if (!matcher3.find()) {
                        throw ParserException.a((RuntimeException) null, i6.length() != 0 ? "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(i6) : new String("X-TIMESTAMP-MAP doesn't contain media timestamp: "));
                    }
                    String group = matcher2.group(1);
                    group.getClass();
                    j2 = wqf.c(group);
                    String group2 = matcher3.group(1);
                    group2.getClass();
                    j = (Long.parseLong(group2) * 1000000) / 90000;
                }
                i6 = yze.i();
            } else {
                while (true) {
                    String i7 = yze.i();
                    if (i7 == null) {
                        break;
                    } else if (wqf.a.matcher(i7).matches()) {
                        do {
                            i = yze.i();
                            if (i == null) {
                                break;
                            }
                        } while (i.isEmpty());
                    } else {
                        Matcher matcher4 = rqf.a.matcher(i7);
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
                long c2 = wqf.c(group3);
                long b2 = this.b.b(((((j + c2) - j2) * 90000) / 1000000) % 8589934592L);
                ape a2 = a(b2 - c2);
                byte[] bArr3 = this.e;
                int i8 = this.f;
                yze yze2 = this.c;
                yze2.F(i8, bArr3);
                a2.c(this.f, yze2);
                a2.b(b2, 1, this.f, 0, (yoe) null);
                return -1;
            }
        }
    }

    public final void release() {
    }
}
