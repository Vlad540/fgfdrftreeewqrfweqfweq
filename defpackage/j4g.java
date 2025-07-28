package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: j4g  reason: default package */
public abstract class j4g extends bzf implements x0g {
    public final int d;

    public j4g(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 4);
        if (bArr.length == 25) {
            this.d = Arrays.hashCode(bArr);
            return;
        }
        throw new IllegalArgumentException();
    }

    public static byte[] K0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean H0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            ks9 ks9 = new ks9(L0());
            parcel2.writeNoException();
            e2g.c(parcel2, ks9);
        } else if (i != 2) {
            return false;
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(this.d);
        }
        return true;
    }

    public abstract byte[] L0();

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof x0g)) {
            try {
                x0g x0g = (x0g) obj;
                if (((j4g) x0g).d != this.d) {
                    return false;
                }
                return Arrays.equals(L0(), (byte[]) ks9.L0(new ks9(((j4g) x0g).L0())));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d;
    }
}
