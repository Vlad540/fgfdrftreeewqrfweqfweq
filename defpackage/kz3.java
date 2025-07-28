package defpackage;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import java.net.URLDecoder;

/* renamed from: kz3  reason: default package */
public final class kz3 extends eh0 {
    public xz3 X;
    public byte[] Y;
    public int Z;
    public int w0;

    public final long N(xz3 xz3) {
        d();
        this.X = xz3;
        Uri uri = xz3.a;
        String scheme = uri.getScheme();
        boolean equals = "data".equals(scheme);
        String valueOf = String.valueOf(scheme);
        swb.d(valueOf.length() != 0 ? "Unsupported scheme: ".concat(valueOf) : new String("Unsupported scheme: "), equals);
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i = mze.a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.Y = Base64.decode(str, 0);
                } catch (IllegalArgumentException e) {
                    String valueOf2 = String.valueOf(str);
                    throw new ParserException(valueOf2.length() != 0 ? "Error while parsing Base64 encoded string: ".concat(valueOf2) : new String("Error while parsing Base64 encoded string: "), e, true, 0);
                }
            } else {
                this.Y = URLDecoder.decode(str, f22.a.name()).getBytes(f22.c);
            }
            byte[] bArr = this.Y;
            long j = xz3.f;
            if (j <= ((long) bArr.length)) {
                int i2 = (int) j;
                this.Z = i2;
                int length = bArr.length - i2;
                this.w0 = length;
                long j2 = xz3.g;
                int i3 = (j2 > -1 ? 1 : (j2 == -1 ? 0 : -1));
                if (i3 != 0) {
                    this.w0 = (int) Math.min((long) length, j2);
                }
                e(xz3);
                return i3 != 0 ? j2 : (long) this.w0;
            }
            this.Y = null;
            throw new DataSourceException(2008);
        }
        String valueOf3 = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(valueOf3.length() + 23);
        sb.append("Unexpected URI format: ");
        sb.append(valueOf3);
        throw new ParserException(sb.toString(), (Exception) null, true, 0);
    }

    public final void close() {
        if (this.Y != null) {
            this.Y = null;
            c();
        }
        this.X = null;
    }

    public final Uri getUri() {
        xz3 xz3 = this.X;
        if (xz3 != null) {
            return xz3.a;
        }
        return null;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.w0;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.Y;
        int i4 = mze.a;
        System.arraycopy(bArr2, this.Z, bArr, i, min);
        this.Z += min;
        this.w0 -= min;
        b(min);
        return min;
    }
}
