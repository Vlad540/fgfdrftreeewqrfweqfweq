package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;

public class IconCompatParcelizer {
    public static IconCompat read(g1f g1f) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = g1f.f(iconCompat.a, 1);
        byte[] bArr = iconCompat.c;
        if (g1f.e(2)) {
            Parcel parcel = ((h1f) g1f).e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.c = bArr;
        iconCompat.d = g1f.g(iconCompat.d, 3);
        iconCompat.e = g1f.f(iconCompat.e, 4);
        iconCompat.f = g1f.f(iconCompat.f, 5);
        iconCompat.g = (ColorStateList) g1f.g(iconCompat.g, 6);
        String str = iconCompat.i;
        if (g1f.e(7)) {
            str = ((h1f) g1f).e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.j;
        if (g1f.e(8)) {
            str2 = ((h1f) g1f).e.readString();
        }
        iconCompat.j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable != null) {
                    iconCompat.b = parcelable;
                    break;
                } else {
                    throw new IllegalArgumentException("Invalid icon");
                }
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 == null) {
                    byte[] bArr3 = iconCompat.c;
                    iconCompat.b = bArr3;
                    iconCompat.a = 3;
                    iconCompat.e = 0;
                    iconCompat.f = bArr3.length;
                    break;
                } else {
                    iconCompat.b = parcelable2;
                    break;
                }
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.c, Charset.forName("UTF-16"));
                iconCompat.b = str3;
                if (iconCompat.a == 2 && iconCompat.j == null) {
                    iconCompat.j = str3.split(":", -1)[0];
                    break;
                }
            case 3:
                iconCompat.b = iconCompat.c;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, g1f g1f) {
        g1f.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            g1f.j(i, 1);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            g1f.i(2);
            int length = bArr.length;
            Parcel parcel = ((h1f) g1f).e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            g1f.k(parcelable, 3);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            g1f.j(i2, 4);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            g1f.j(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            g1f.k(colorStateList, 6);
        }
        String str = iconCompat.i;
        if (str != null) {
            g1f.i(7);
            ((h1f) g1f).e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            g1f.i(8);
            ((h1f) g1f).e.writeString(str2);
        }
    }
}
