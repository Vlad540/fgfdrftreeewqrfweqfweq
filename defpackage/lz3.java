package defpackage;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import java.net.URLDecoder;

/* renamed from: lz3  reason: default package */
public final class lz3 extends fh0 {
    public yz3 X;
    public byte[] Y;
    public int Z;
    public int w0;

    public final long G(yz3 yz3) {
        d();
        this.X = yz3;
        Uri normalizeScheme = yz3.a.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        boolean equals = "data".equals(scheme);
        oyb.c("Unsupported scheme: " + scheme, equals);
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        int i = oze.a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.Y = Base64.decode(str, 0);
                } catch (IllegalArgumentException e) {
                    throw new ParserException(rf0.h("Error while parsing Base64 encoded string: ", str), e, true, 0);
                }
            } else {
                this.Y = URLDecoder.decode(str, f22.a.name()).getBytes(f22.c);
            }
            byte[] bArr = this.Y;
            long j = yz3.f;
            if (j <= ((long) bArr.length)) {
                int i2 = (int) j;
                this.Z = i2;
                int length = bArr.length - i2;
                this.w0 = length;
                long j2 = yz3.g;
                int i3 = (j2 > -1 ? 1 : (j2 == -1 ? 0 : -1));
                if (i3 != 0) {
                    this.w0 = (int) Math.min((long) length, j2);
                }
                e(yz3);
                return i3 != 0 ? j2 : (long) this.w0;
            }
            this.Y = null;
            throw new DataSourceException(2008);
        }
        throw new ParserException("Unexpected URI format: " + normalizeScheme, (Exception) null, true, 0);
    }

    public final void close() {
        if (this.Y != null) {
            this.Y = null;
            c();
        }
        this.X = null;
    }

    public final Uri getUri() {
        yz3 yz3 = this.X;
        if (yz3 != null) {
            return yz3.a;
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
        int i4 = oze.a;
        System.arraycopy(bArr2, this.Z, bArr, i, min);
        this.Z += min;
        this.w0 -= min;
        b(min);
        return min;
    }
}
