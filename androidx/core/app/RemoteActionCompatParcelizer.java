package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(g1f g1f) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object obj = remoteActionCompat.a;
        boolean z = true;
        if (g1f.e(1)) {
            obj = g1f.h();
        }
        remoteActionCompat.a = (IconCompat) obj;
        CharSequence charSequence = remoteActionCompat.b;
        if (g1f.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((h1f) g1f).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (g1f.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((h1f) g1f).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) g1f.g(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (g1f.e(5)) {
            z2 = ((h1f) g1f).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (g1f.e(6)) {
            if (((h1f) g1f).e.readInt() == 0) {
                z = false;
            }
            z3 = z;
        }
        remoteActionCompat.f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, g1f g1f) {
        g1f.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        g1f.i(1);
        g1f.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        g1f.i(2);
        Parcel parcel = ((h1f) g1f).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        g1f.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        g1f.k(remoteActionCompat.d, 4);
        boolean z = remoteActionCompat.e;
        g1f.i(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        g1f.i(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
