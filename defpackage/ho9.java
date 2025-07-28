package defpackage;

import android.app.Notification;
import android.app.Person;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ho9  reason: default package */
public final class ho9 extends io9 {
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final wna g;
    public CharSequence h;
    public Boolean i;

    public ho9(wna wna) {
        if (!TextUtils.isEmpty(wna.a)) {
            this.g = wna;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }

    public final void a(Bundle bundle) {
        Bundle bundle2;
        super.a(bundle);
        wna wna = this.g;
        bundle.putCharSequence("android.selfDisplayName", wna.a);
        Bundle bundle3 = new Bundle();
        bundle3.putCharSequence("name", wna.a);
        IconCompat iconCompat = wna.b;
        if (iconCompat != null) {
            bundle2 = new Bundle();
            switch (iconCompat.a) {
                case -1:
                    bundle2.putParcelable("obj", (Parcelable) iconCompat.b);
                    break;
                case 1:
                case 5:
                    bundle2.putParcelable("obj", (Bitmap) iconCompat.b);
                    break;
                case 2:
                case 4:
                case 6:
                    bundle2.putString("obj", (String) iconCompat.b);
                    break;
                case 3:
                    bundle2.putByteArray("obj", (byte[]) iconCompat.b);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid icon");
            }
            bundle2.putInt("type", iconCompat.a);
            bundle2.putInt("int1", iconCompat.e);
            bundle2.putInt("int2", iconCompat.f);
            bundle2.putString("string1", iconCompat.j);
            ColorStateList colorStateList = iconCompat.g;
            if (colorStateList != null) {
                bundle2.putParcelable("tint_list", colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.h;
            if (mode != IconCompat.k) {
                bundle2.putString("tint_mode", mode.name());
            }
        } else {
            bundle2 = null;
        }
        bundle3.putBundle("icon", bundle2);
        bundle3.putString("uri", wna.c);
        bundle3.putString("key", wna.d);
        bundle3.putBoolean("isBot", wna.e);
        bundle3.putBoolean("isImportant", wna.f);
        bundle.putBundle("android.messagingStyleUser", bundle3);
        bundle.putCharSequence("android.hiddenConversationTitle", this.h);
        if (this.h != null && this.i.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.h);
        }
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", go9.a(arrayList));
        }
        ArrayList arrayList2 = this.f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", go9.a(arrayList2));
        }
        Boolean bool = this.i;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    public final void b(b0d b0d) {
        un9 un9 = (un9) this.b;
        boolean z = false;
        if (un9 == null || un9.a.getApplicationInfo().targetSdkVersion >= 28 || this.i != null) {
            Boolean bool = this.i;
            if (bool != null) {
                z = bool.booleanValue();
            }
        } else if (this.h != null) {
            z = true;
        }
        this.i = Boolean.valueOf(z);
        wna wna = this.g;
        wna.getClass();
        Notification.MessagingStyle a = do9.a(vna.b(wna));
        Iterator it = this.e.iterator();
        while (true) {
            Person person = null;
            if (!it.hasNext()) {
                break;
            }
            go9 go9 = (go9) it.next();
            wna wna2 = go9.c;
            if (wna2 != null) {
                person = vna.b(wna2);
            }
            Notification.MessagingStyle.Message b = fo9.b(go9.a, go9.b, person);
            String str = go9.e;
            if (str != null) {
                eo9.b(b, str, go9.f);
            }
            bo9.a(a, b);
        }
        Iterator it2 = this.f.iterator();
        while (it2.hasNext()) {
            go9 go92 = (go9) it2.next();
            wna wna3 = go92.c;
            Notification.MessagingStyle.Message b2 = fo9.b(go92.a, go92.b, wna3 == null ? null : vna.b(wna3));
            String str2 = go92.e;
            if (str2 != null) {
                eo9.b(b2, str2, go92.f);
            }
            co9.a(a, b2);
        }
        this.i.getClass();
        bo9.c(a, this.h);
        do9.b(a, this.i.booleanValue());
        a.setBuilder((Notification.Builder) b0d.c);
    }

    public final String e() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }
}
