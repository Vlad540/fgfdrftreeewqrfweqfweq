package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: zn9  reason: default package */
public final class zn9 extends io9 {
    public final int e;
    public final wna f;
    public final PendingIntent g;
    public final PendingIntent h;
    public final PendingIntent i;

    public zn9(int i2, wna wna, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3) {
        if (!TextUtils.isEmpty(wna.a)) {
            this.e = i2;
            this.f = wna;
            this.g = pendingIntent3;
            this.h = pendingIntent2;
            this.i = pendingIntent;
            return;
        }
        throw new IllegalArgumentException("person must have a non-empty a name");
    }

    public final void a(Bundle bundle) {
        super.a(bundle);
        bundle.putInt("android.callType", this.e);
        bundle.putBoolean("android.callIsVideo", false);
        wna wna = this.f;
        if (wna != null) {
            bundle.putParcelable("android.callPerson", xn9.b(vna.b(wna)));
        }
        bundle.putCharSequence("android.verificationText", (CharSequence) null);
        bundle.putParcelable("android.answerIntent", this.g);
        bundle.putParcelable("android.declineIntent", this.h);
        bundle.putParcelable("android.hangUpIntent", this.i);
    }

    public final void b(b0d b0d) {
        Notification.CallStyle callStyle;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = this.e;
        wna wna = this.f;
        Notification.Builder builder = (Notification.Builder) b0d.c;
        CharSequence charSequence = null;
        if (i2 >= 31) {
            PendingIntent pendingIntent = this.g;
            if (i3 != 1) {
                PendingIntent pendingIntent2 = this.i;
                if (i3 == 2) {
                    wna.getClass();
                    callStyle = yn9.b(vna.b(wna), pendingIntent2);
                } else if (i3 != 3) {
                    if (Log.isLoggable("NotifCompat", 3)) {
                        String.valueOf(i3);
                    }
                    callStyle = null;
                } else {
                    wna.getClass();
                    callStyle = yn9.c(vna.b(wna), pendingIntent2, pendingIntent);
                }
            } else {
                wna.getClass();
                callStyle = yn9.a(vna.b(wna), this.h, pendingIntent);
            }
            if (callStyle != null) {
                callStyle.setBuilder(builder);
                yn9.i(callStyle, (CharSequence) null);
                yn9.g(callStyle, false);
                return;
            }
            return;
        }
        builder.setContentTitle(wna != null ? wna.a : null);
        Bundle bundle = ((un9) this.b).w;
        CharSequence charSequence2 = (bundle == null || !bundle.containsKey("android.text")) ? null : ((un9) this.b).w.getCharSequence("android.text");
        if (charSequence2 == null) {
            if (i3 == 1) {
                charSequence = ((un9) this.b).a.getResources().getString(rtb.call_notification_incoming_text);
            } else if (i3 == 2) {
                charSequence = ((un9) this.b).a.getResources().getString(rtb.call_notification_ongoing_text);
            } else if (i3 == 3) {
                charSequence = ((un9) this.b).a.getResources().getString(rtb.call_notification_screening_text);
            }
            charSequence2 = charSequence;
        }
        builder.setContentText(charSequence2);
        if (wna != null) {
            IconCompat iconCompat = wna.b;
            if (iconCompat != null) {
                wn9.c(builder, zn6.d(iconCompat, ((un9) this.b).a));
            }
            xn9.a(builder, vna.b(wna));
        }
        vn9.b(builder, "call");
    }

    public final String e() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }

    public final gn9 p(int i2, int i3, int i4, PendingIntent pendingIntent) {
        Integer valueOf = Integer.valueOf(hq3.a(((un9) this.b).a, i4));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(((un9) this.b).a.getResources().getString(i3));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(valueOf.intValue()), 0, spannableStringBuilder.length(), 18);
        gn9 a = new fn9(IconCompat.c(((un9) this.b).a, i2), spannableStringBuilder, pendingIntent, new Bundle()).a();
        a.a.putBoolean("key_action_priority", true);
        return a;
    }
}
