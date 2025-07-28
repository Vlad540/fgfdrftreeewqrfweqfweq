package defpackage;

import android.app.PendingIntent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: gn9  reason: default package */
public final class gn9 {
    public final Bundle a;
    public IconCompat b;
    public final u8c[] c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final boolean g;
    public final int h;
    public final CharSequence i;
    public final PendingIntent j;
    public final boolean k;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public gn9(int i2, String str, PendingIntent pendingIntent) {
        this(i2 != 0 ? IconCompat.d((Resources) null, BuildConfig.FLAVOR, i2) : null, (CharSequence) str, pendingIntent);
    }

    public final IconCompat a() {
        int i2;
        if (this.b == null && (i2 = this.h) != 0) {
            this.b = IconCompat.d((Resources) null, BuildConfig.FLAVOR, i2);
        }
        return this.b;
    }

    public gn9(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
        this(iconCompat, charSequence, pendingIntent, new Bundle(), (u8c[]) null, (u8c[]) null, true, 0, true, false, false);
    }

    public gn9(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, u8c[] u8cArr, u8c[] u8cArr2, boolean z, int i2, boolean z2, boolean z3, boolean z4) {
        this.e = true;
        this.b = iconCompat;
        if (iconCompat != null) {
            int i3 = iconCompat.a;
            if ((i3 == -1 ? bo6.c(iconCompat.b) : i3) == 2) {
                this.h = iconCompat.e();
            }
        }
        this.i = un9.c(charSequence);
        this.j = pendingIntent;
        this.a = bundle == null ? new Bundle() : bundle;
        this.c = u8cArr;
        this.d = z;
        this.f = i2;
        this.e = z2;
        this.g = z3;
        this.k = z4;
    }
}
