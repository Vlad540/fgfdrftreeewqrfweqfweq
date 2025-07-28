package defpackage;

import android.media.AudioAttributes;

/* renamed from: h20  reason: default package */
public abstract class h20 {
    public static void a(AudioAttributes.Builder builder, int i) {
        try {
            builder.getClass().getMethod("setSpatializationBehavior", new Class[]{Integer.TYPE}).invoke(builder, new Object[]{Integer.valueOf(i)});
        } catch (Exception unused) {
        }
    }
}
