package defpackage;

import android.net.Uri;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: jc  reason: default package */
public final class jc implements oz3 {
    public final oz3 a;
    public final byte[] b;
    public final byte[] c;
    public CipherInputStream o;

    public jc(oz3 oz3, byte[] bArr, byte[] bArr2) {
        this.a = oz3;
        this.b = bArr;
        this.c = bArr2;
    }

    public final long N(xz3 xz3) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                instance.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(this.c));
                tz3 tz3 = new tz3(this.a, xz3);
                this.o = new CipherInputStream(tz3, instance);
                tz3.m();
                return -1;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final void O(bqe bqe) {
        bqe.getClass();
        this.a.O(bqe);
    }

    public final Map a() {
        return this.a.a();
    }

    public final void close() {
        if (this.o != null) {
            this.o = null;
            this.a.close();
        }
    }

    public final Uri getUri() {
        return this.a.getUri();
    }

    public final int read(byte[] bArr, int i, int i2) {
        this.o.getClass();
        int read = this.o.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
