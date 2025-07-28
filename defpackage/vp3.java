package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: vp3  reason: default package */
public final class vp3 implements up3, wp3 {
    public Uri X;
    public Bundle Y;
    public final /* synthetic */ int a = 0;
    public ClipData b;
    public int c;
    public int o;

    public /* synthetic */ vp3() {
    }

    public ClipData a() {
        return this.b;
    }

    public xp3 build() {
        return new xp3(new vp3(this));
    }

    public void c(Uri uri) {
        this.X = uri;
    }

    public Uri d() {
        return this.X;
    }

    public Bundle getExtras() {
        return this.Y;
    }

    public int getFlags() {
        return this.o;
    }

    public void h(ClipData clipData) {
        this.b = clipData;
    }

    public ContentInfo i() {
        return null;
    }

    public int l() {
        return this.c;
    }

    public void setExtras(Bundle bundle) {
        this.Y = bundle;
    }

    public void setFlags(int i) {
        this.o = i;
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.b.getDescription());
                sb.append(", source=");
                int i = this.c;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.o;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                String str2 = BuildConfig.FLAVOR;
                Uri uri = this.X;
                if (uri == null) {
                    str = str2;
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                if (this.Y != null) {
                    str2 = ", hasExtras";
                }
                return wn6.l(sb, str2, "}");
            default:
                return super.toString();
        }
    }

    public vp3(vp3 vp3) {
        ClipData clipData = vp3.b;
        clipData.getClass();
        this.b = clipData;
        int i = vp3.c;
        e07.l(i, "source", 0, 5);
        this.c = i;
        int i2 = vp3.o;
        if ((i2 & 1) == i2) {
            this.o = i2;
            this.X = vp3.X;
            this.Y = vp3.Y;
            return;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
    }
}
